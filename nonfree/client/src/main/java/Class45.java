import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class45 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	public static final int[] anIntArray104 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!hu;")
	private final Class98 aClass98_4 = new Class98(64);

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!r;")
	private final Class197 aClass197_10;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public final int anInt1464;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 156)
	public Class45(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_10 = arg2;
		this.anInt1464 = this.aClass197_10.method5082(19);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)Lclient!cr;", line = 114)
	public Class40 method1625(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_4;
		@Pc(16) Class40 local16;
		synchronized (this.aClass98_4) {
			local16 = (Class40) this.aClass98_4.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_10.method5090(arg0, 19);
		local16 = new Class40();
		if (local33 != null) {
			local16.method1470(new Class2_Sub4(local33));
		}
		@Pc(54) Class98 local54 = this.aClass98_4;
		synchronized (this.aClass98_4) {
			this.aClass98_4.method2626((long) arg0, local16);
			return local16;
		}
	}
}

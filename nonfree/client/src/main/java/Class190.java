import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class190 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
	public static final int[] anIntArray367 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
	public static long aLong157 = 0L;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_7 = new Class36();

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt5350 = 0;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hu;")
	private final Class98 aClass98_41 = new Class98(64);

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!r;")
	private final Class197 aClass197_69;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 259)
	public Class190(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_69 = arg2;
		this.aClass197_69.method5082(31);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!et;", line = 4)
	public Class66 method4879(@OriginalArg(0) int arg0) {
		@Pc(11) Class98 local11 = this.aClass98_41;
		@Pc(21) Class66 local21;
		synchronized (this.aClass98_41) {
			local21 = (Class66) this.aClass98_41.method2614((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass197_69.method5090(arg0, 31);
		local21 = new Class66();
		if (local38 != null) {
			local21.method1938(new Class2_Sub4(local38));
		}
		@Pc(54) Class98 local54 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2626((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V", line = 36)
	public void method4880() {
		@Pc(6) Class98 local6 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2617(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 225)
	public void method4885() {
		@Pc(2) Class98 local2 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2623();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 244)
	public void method4886() {
		@Pc(2) Class98 local2 = this.aClass98_41;
		synchronized (this.aClass98_41) {
			this.aClass98_41.method2616();
		}
	}
}

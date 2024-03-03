import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class233 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_136 = new Class4(32);

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!h;")
	public static final Class89 aClass89_230 = new Class89(104, 4);

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[I")
	public static int[] anIntArray448 = new int[2];

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public static int anInt6521 = 0;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
	public static final int[] anIntArray449 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "S")
	public static short aShort92 = 1;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!hu;")
	private final Class98 aClass98_60 = new Class98(64);

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!r;")
	private final Class197 aClass197_91;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 123)
	public Class233(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_91 = arg2;
		if (this.aClass197_91 != null) {
			this.aClass197_91.method5082(35);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 4)
	public void method5882() {
		@Pc(2) Class98 local2 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2616();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 18)
	public void method5883() {
		@Pc(10) Class98 local10 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2623();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V", line = 56)
	public void method5885() {
		@Pc(2) Class98 local2 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2617(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lclient!ud;", line = 69)
	public Class230 method5886(@OriginalArg(1) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_60;
		@Pc(16) Class230 local16;
		synchronized (this.aClass98_60) {
			local16 = (Class230) this.aClass98_60.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_91.method5090(arg0, 35);
		local16 = new Class230();
		if (local33 != null) {
			local16.method5837(new Class2_Sub4(local33));
		}
		local16.method5835();
		@Pc(52) Class98 local52 = this.aClass98_60;
		synchronized (this.aClass98_60) {
			this.aClass98_60.method2626((long) arg0, local16);
			return local16;
		}
	}
}

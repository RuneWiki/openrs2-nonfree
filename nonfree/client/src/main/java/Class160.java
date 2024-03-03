import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class160 {

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_86 = new Class4(16);

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public static int anInt4082 = 0;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!rt;")
	public static final Class209 aClass209_3 = new Class209("LIVE", 0);

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!hu;")
	private final Class98 aClass98_35 = new Class98(16);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!r;")
	private final Class197 aClass197_62;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 133)
	public Class160(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_62 = arg2;
		this.aClass197_62.method5082(30);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V", line = 37)
	public void method4030() {
		@Pc(11) Class98 local11 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.method2617(5);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 51)
	public void method4031() {
		@Pc(6) Class98 local6 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.method2623();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!ie;", line = 63)
	public Class101 method4032(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_35;
		@Pc(16) Class101 local16;
		synchronized (this.aClass98_35) {
			local16 = (Class101) this.aClass98_35.method2614((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass197_62.method5090(arg0, 30);
		local16 = new Class101();
		if (local38 != null) {
			local16.method2696(new Class2_Sub4(local38));
		}
		@Pc(56) Class98 local56 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.method2626((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V", line = 111)
	public void method4034() {
		@Pc(7) Class98 local7 = this.aClass98_35;
		synchronized (this.aClass98_35) {
			this.aClass98_35.method2616();
		}
	}
}

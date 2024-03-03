import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class18 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public static int anInt551 = 0;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt554 = 0;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[Lclient!nt;")
	public static final Class2_Sub2_Sub13[] aClass2_Sub2_Sub13Array1 = new Class2_Sub2_Sub13[14];

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_25 = new Class145(27, 3);

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!hu;")
	private final Class98 aClass98_2 = new Class98(64);

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!r;")
	private final Class197 aClass197_2;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V", line = 105)
	public Class18(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		this.aClass197_2 = arg2;
		if (this.aClass197_2 != null) {
			this.aClass197_2.method5082(11);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 20)
	public void method563() {
		@Pc(2) Class98 local2 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.method2616();
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 36)
	public void method564() {
		@Pc(14) Class98 local14 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.method2623();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!vp;", line = 58)
	public Class240 method565(@OriginalArg(1) int arg0) {
		@Pc(11) Class98 local11 = this.aClass98_2;
		@Pc(21) Class240 local21;
		synchronized (this.aClass98_2) {
			local21 = (Class240) this.aClass98_2.method2614((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass197_2.method5090(arg0, 11);
		local21 = new Class240();
		if (local38 != null) {
			local21.method6262(new Class2_Sub4(local38));
		}
		@Pc(54) Class98 local54 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.method2626((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V", line = 85)
	public void method566() {
		@Pc(6) Class98 local6 = this.aClass98_2;
		synchronized (this.aClass98_2) {
			this.aClass98_2.method2617(5);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class79 {

	@OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
	public static int[] anIntArray381 = new int[99];

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!uc;")
	private final Class1_Sub2 aClass1_Sub2_64 = new Class1_Sub2();

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 99; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) ((double) local25 + Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D);
			local18 += local38;
			anIntArray381[local20] = local18 / 4;
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class79() {
		this.aClass1_Sub2_64.aClass1_Sub2_71 = this.aClass1_Sub2_64;
		this.aClass1_Sub2_64.aClass1_Sub2_72 = this.aClass1_Sub2_64;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!uc;)V")
	public void method2671(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_71 != null) {
			arg0.method2789();
		}
		arg0.aClass1_Sub2_72 = this.aClass1_Sub2_64.aClass1_Sub2_72;
		arg0.aClass1_Sub2_71 = this.aClass1_Sub2_64;
		arg0.aClass1_Sub2_71.aClass1_Sub2_72 = arg0;
		arg0.aClass1_Sub2_72.aClass1_Sub2_71 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!uc;B)V")
	public void method2672(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_71 != null) {
			arg0.method2789();
		}
		arg0.aClass1_Sub2_71 = this.aClass1_Sub2_64.aClass1_Sub2_71;
		arg0.aClass1_Sub2_72 = this.aClass1_Sub2_64;
		arg0.aClass1_Sub2_71.aClass1_Sub2_72 = arg0;
		arg0.aClass1_Sub2_72.aClass1_Sub2_71 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lclient!uc;")
	public Class1_Sub2 method2673() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_64.aClass1_Sub2_72;
		return this.aClass1_Sub2_64 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Lclient!uc;")
	public Class1_Sub2 method2675() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_64.aClass1_Sub2_72;
		if (local7 == this.aClass1_Sub2_64) {
			return null;
		} else {
			local7.method2789();
			return local7;
		}
	}
}

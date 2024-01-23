import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!th;")
	public static Class168 aClass168_58;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!wf;I)Lclient!wf;")
	public static Class191 method1290(@OriginalArg(0) Class191 arg0) {
		@Pc(6) Class191 local6 = Static35.method745(arg0);
		if (local6 == null) {
			local6 = arg0.aClass191_17;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ug;I)V")
	public static void method1292(@OriginalArg(0) Class2_Sub4 arg0) {
		if (Static133.anInt3061 == arg0.anInt2767 || arg0.anInt2822 == -1 || arg0.anInt2830 != 0 || arg0.anInt2829 + 1 > Static202.method3231(arg0.anInt2822).anIntArray121[arg0.anInt2800]) {
			@Pc(38) int local38 = arg0.anInt2767 - arg0.anInt2798;
			@Pc(43) int local43 = Static133.anInt3061 - arg0.anInt2798;
			@Pc(55) int local55 = arg0.anInt2834 * 128 + arg0.method2088() * 64;
			@Pc(67) int local67 = arg0.anInt2810 * 128 + arg0.method2088() * 64;
			@Pc(78) int local78 = arg0.anInt2782 * 128 + arg0.method2088() * 64;
			@Pc(89) int local89 = arg0.anInt2806 * 128 + arg0.method2088() * 64;
			arg0.anInt2846 = (local55 * (local38 - local43) + local78 * local43) / local38;
			arg0.anInt2794 = ((local38 - local43) * local67 + local89 * local43) / local38;
		}
		arg0.anInt2842 = 0;
		if (arg0.anInt2839 == 0) {
			arg0.anInt2823 = 1024;
		}
		if (arg0.anInt2839 == 1) {
			arg0.anInt2823 = 1536;
		}
		if (arg0.anInt2839 == 2) {
			arg0.anInt2823 = 0;
		}
		if (arg0.anInt2839 == 3) {
			arg0.anInt2823 = 512;
		}
		arg0.anInt2766 = arg0.anInt2823;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1293(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub3_Sub22 local16 = Static271.method4108(2, arg1);
		local16.method4468();
		local16.aString417 = arg0;
	}
}

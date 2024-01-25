import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ir", name = "ic", descriptor = "I")
	public static int anInt5411;

	@OriginalMember(owner = "client!ir", name = "ib", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_134 = new Class151(4);

	@OriginalMember(owner = "client!ir", name = "Pb", descriptor = "I")
	public static int anInt5396 = 0;

	@OriginalMember(owner = "client!ir", name = "ac", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_278 = new Class12(99, -2);

	@OriginalMember(owner = "client!ir", name = "hc", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V")
	public static void method4315() {
		Static224.method3272(Static372.aClass254_122);
		for (@Pc(21) Class1_Sub38 local21 = (Class1_Sub38) Static81.aClass51_5.method928(); local21 != null; local21 = (Class1_Sub38) Static81.aClass51_5.method926()) {
			if (!local21.method5966()) {
				local21 = (Class1_Sub38) Static81.aClass51_5.method928();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt6524 == 0) {
				Static284.method3909(true, true, local21);
			}
		}
		if (Static405.aClass229_12 != null) {
			Static373.method5289(Static405.aClass229_12);
			Static405.aClass229_12 = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ui;II)V")
	public static void method4316(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) int arg2) {
		Static237.aClass241ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!hh;IIB)Lclient!cu;")
	public static Class1_Sub1_Sub6 method4325(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class1_Sub14 local20 = new Class1_Sub14(arg0.method2349(arg2, arg1));
		@Pc(53) Class1_Sub1_Sub6 local53 = new Class1_Sub1_Sub6(arg1, local20.method4509(), local20.method4509(), local20.method4500(), local20.method4500(), local20.method4548() == 1, local20.method4548(), local20.method4548());
		@Pc(57) int local57 = local20.method4548();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local53.aClass142_10.method3212(new Class1_Sub11(local20.method4548(), local20.method4498(), local20.method4498(), local20.method4498(), local20.method4498(), local20.method4498(), local20.method4498(), local20.method4498(), local20.method4498()));
		}
		local53.method916();
		return local53;
	}

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)V")
	public static void method4328() {
		if (Static246.anInt4292 == -1) {
			return;
		}
		@Pc(11) int local11 = Static38.aClass32_1.method3517();
		@Pc(23) int local23 = Static38.aClass32_1.method3524();
		@Pc(28) Class1_Sub22 local28 = (Class1_Sub22) Static335.aClass142_42.method3199();
		if (local28 != null) {
			local11 = local28.method2939();
			local23 = local28.method2936();
		}
		Static45.method613(0, 0, Static246.anInt4292, local23, Static403.anInt7142, Static324.anInt5725, local11, 0, 0);
		if (Static413.aClass229_13 != null) {
			Static284.method3910(local11, local23);
		}
	}
}

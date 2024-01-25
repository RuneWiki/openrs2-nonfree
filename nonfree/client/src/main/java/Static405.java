import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt7612;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public static int anInt7621;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_119 = new Class45(49, 12);

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_217 = new Class88("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method6341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static51.aClass215Array6 == null) {
			return;
		}
		@Pc(8) Class30_Sub1_Sub1 local8 = null;
		@Pc(15) int local15;
		if (arg8 < 0) {
			local15 = -arg8 - 1;
			if (local15 == Static396.anInt7452) {
				local8 = Static440.aClass30_Sub1_Sub1_Sub1_2;
			} else {
				local8 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local15];
			}
		} else {
			local15 = arg8 - 1;
			@Pc(37) Class12_Sub41 local37 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local15);
			if (local37 != null) {
				local8 = local37.aClass30_Sub1_Sub1_Sub2_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(50) Class279 local50 = Static49.aClass155_2.method4063(arg3);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg10 == 1 || arg10 == 3) {
			local64 = local50.anInt8293;
			local61 = local50.anInt8303;
		} else {
			local61 = local50.anInt8293;
			local64 = local50.anInt8303;
		}
		@Pc(78) int local78 = arg7 + (local61 >> 1);
		@Pc(86) int local86 = (local61 + 1 >> 1) + arg7;
		@Pc(92) int local92 = (local64 >> 1) + arg11;
		@Pc(100) int local100 = (local64 + 1 >> 1) + arg11;
		@Pc(104) Class215 local104 = Static51.aClass215Array6[arg9];
		@Pc(128) int local128 = local104.ba(local78, local92) + local104.ba(local86, local92) + local104.ba(local78, local100) + local104.ba(local86, local100) >> 2;
		@Pc(132) Class12_Sub26 local132 = new Class12_Sub26();
		local132.anInt4784 = arg3;
		local132.anInt4803 = arg11;
		local132.anInt4794 = arg1 + Static409.anInt7683;
		@Pc(148) int local148;
		if (arg0 > arg12) {
			local148 = arg0;
			arg0 = arg12;
			arg12 = local148;
		}
		local132.anInt4785 = arg5;
		local132.anInt4786 = arg10;
		local132.anInt4795 = arg7;
		local132.anInt4801 = Static409.anInt7683 + arg4;
		local132.anInt4790 = local8.aByte99;
		local132.anInt4793 = arg7 + arg0;
		if (arg6 < arg2) {
			local148 = arg2;
			arg2 = arg6;
			arg6 = local148;
		}
		local132.anInt4787 = arg12 + arg7;
		local132.anInt4791 = arg11 + arg6;
		local132.anInt4799 = local128;
		local132.anInt4802 = (local61 << 6) + (local132.anInt4795 << 7);
		local132.anInt4798 = arg2 + arg11;
		local132.anInt4796 = (local64 << 6) + (local132.anInt4803 << 7);
		Static505.aClass73_73.method2012(local132);
		local8.aClass12_Sub26_3 = local132;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I")
	public static int method6343(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local18 * local33 >> 12;
	}
}

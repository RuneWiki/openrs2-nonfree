import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
	public static int anInt3293;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_106 = new Class123(26, 4);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public static void method2657(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(14, arg0);
		local8.method7364();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2663(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static336.anInt6067 >= 100) {
			Static260.method4014(Static573.aClass350_43.method7730(Static201.anInt4321));
			return;
		}
		@Pc(25) String local25 = Static468.method6414(arg1);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static336.anInt6067; local30++) {
			@Pc(38) String local38 = Static468.method6414(Static101.aStringArray10[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static260.method4014(arg1 + Static573.aClass350_44.method7730(Static201.anInt4321));
				return;
			}
			if (Static554.aStringArray46[local30] != null) {
				@Pc(69) String local69 = Static468.method6414(Static554.aStringArray46[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static260.method4014(arg1 + Static573.aClass350_44.method7730(Static201.anInt4321));
					return;
				}
			}
		}
		for (@Pc(108) int local108 = 0; local108 < Static372.anInt6493; local108++) {
			@Pc(116) String local116 = Static468.method6414(Static437.aStringArray36[local108]);
			if (local116 != null && local116.equals(local25)) {
				Static260.method4014(Static573.aClass350_49.method7730(Static201.anInt4321) + arg1 + Static573.aClass350_50.method7730(Static201.anInt4321));
				return;
			}
			if (Static530.aStringArray44[local108] != null) {
				@Pc(152) String local152 = Static468.method6414(Static530.aStringArray44[local108]);
				if (local152 != null && local152.equals(local25)) {
					Static260.method4014(Static573.aClass350_49.method7730(Static201.anInt4321) + arg1 + Static573.aClass350_50.method7730(Static201.anInt4321));
					return;
				}
			}
		}
		if (Static468.method6414(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183).equals(local25)) {
			Static260.method4014(Static573.aClass350_46.method7730(Static201.anInt4321));
			return;
		}
		@Pc(210) Class3_Sub10 local210 = Static129.method2403(Static452.aClass353_2, Static257.aClass287_80);
		local210.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg1) + 1);
		local210.aClass3_Sub26_Sub1_1.method6772(arg1);
		local210.aClass3_Sub26_Sub1_1.method6809(arg0 ? 1 : 0);
		Static193.method3398(local210);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)I")
	public static int method2668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lclient!pca;")
	public static Class251 method2669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class251 local12 = Static105.method2180(arg0);
		if (arg1 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass251Array3 == null || arg1 >= local12.aClass251Array3.length) {
			return null;
		} else {
			return local12.aClass251Array3[arg1];
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Lclient!fa;")
	public static Interface4 anInterface4_12;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIILclient!ol;I)V")
	public static void method7294(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class25_Sub2_Sub2_Sub5 arg2, @OriginalArg(6) int arg3) {
		Static288.method4332(arg3, arg2.aByte117, arg2.anInt8482, arg2.anInt8476, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[B)V")
	public static void method7295(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class3_Sub26 local13 = new Class3_Sub26(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method6814();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static485.anInt8405 = local13.method6811();
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)[Lclient!ica;")
	public static Class136[] method7296() {
		if (Static384.aClass136Array1 == null) {
			@Pc(7) Class136[] local7 = Static427.method5903(Static467.aClass168_12);
			@Pc(11) Class136[] local11 = new Class136[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(20) int local20 = Static348.aClass3_Sub51_Sub1_5.method7834(Static37.anInt1122);
			@Pc(84) int local84;
			@Pc(90) Class136 local90;
			label69: for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(28) Class136 local28 = local7[local22];
				if ((local28.anInt4495 <= 0 || local28.anInt4495 >= 24) && local28.anInt4494 >= 800 && local28.anInt4491 >= 600 && (local20 != 2 || local28.anInt4494 <= 800 && local28.anInt4491 <= 600) && (local20 != 1 || local28.anInt4494 <= 1024 && local28.anInt4491 <= 768)) {
					for (local84 = 0; local84 < local13; local84++) {
						local90 = local11[local84];
						if (local28.anInt4494 == local90.anInt4494 && local90.anInt4491 == local28.anInt4491) {
							if (local28.anInt4495 > local90.anInt4495) {
								local11[local84] = local28;
							}
							continue label69;
						}
					}
					local11[local13] = local28;
					local13++;
				}
			}
			Static384.aClass136Array1 = new Class136[local13];
			Static604.method6223(local11, 0, Static384.aClass136Array1, 0, local13);
			@Pc(138) int[] local138 = new int[Static384.aClass136Array1.length];
			for (local84 = 0; local84 < Static384.aClass136Array1.length; local84++) {
				local90 = Static384.aClass136Array1[local84];
				local138[local84] = local90.anInt4494 * local90.anInt4491;
			}
			Static194.method3403(Static384.aClass136Array1, local138);
		}
		return Static384.aClass136Array1;
	}
}

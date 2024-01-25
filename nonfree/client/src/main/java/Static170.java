import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public static int anInt1728;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
	public static final int[] anIntArray186 = new int[100];

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_18 = new Class88();

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_28 = new Class231("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(JB)V")
	public static void method1617(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static268.method4096(arg0 - 1L);
			Static268.method4096(1L);
		} else {
			Static268.method4096(arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static81.anInt1574 && Static99.anInt1808 >= arg3 && arg5 >= Static97.anInt1796 && Static85.anInt1636 >= arg6) {
			Static375.method5205(arg6, arg5, arg4, arg1, arg3, arg0, arg2);
		} else {
			Static189.method5439(arg4, arg3, arg2, arg1, arg6, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([[BLclient!q;I)V")
	public static void method1627(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class204_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class6_Sub15 local30 = new Class6_Sub15(local23);
				local36 = Static175.anIntArray282[local17] >> 8;
				@Pc(42) int local42 = Static175.anIntArray282[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static206.anInt3592;
				@Pc(56) int local56 = local42 * 64 - Static99.anInt1814;
				Static88.method1553();
				arg1.method4532(local30, local49, local56, Static254.aClass61Array2, Static206.anInt3592, Static99.anInt1814);
				arg1.method4548(Static44.aClass28_14, local30, local12, local56, local49);
				if (!arg1.aBoolean359 && local36 == Static371.anInt6170 / 8 && local42 == Static80.anInt1561 / 8 && local12[0] != -1) {
					Static243.aClass46_1 = Static187.aClass217_1.method4849(local12[3], Static251.aClass147_1, local12[1], local12[2], local12[0]);
					Static262.anInt4486 = local12[4];
				}
			}
		}
		for (@Pc(122) int local122 = 0; local122 < local15; local122++) {
			@Pc(135) int local135 = (Static175.anIntArray282[local122] >> 8) * 64 - Static206.anInt3592;
			local36 = (Static175.anIntArray282[local122] & 0xFF) * 64 - Static99.anInt1814;
			@Pc(149) byte[] local149 = arg0[local122];
			if (local149 == null && Static80.anInt1561 < 800) {
				Static88.method1553();
				arg1.method4530(local36, local135);
			}
		}
	}
}

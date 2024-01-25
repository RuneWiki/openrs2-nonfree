import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!h;")
	public static final Class114 aClass114_161 = new Class114("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_136 = new Class6(112, -2);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt8578 = 0;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray85 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!r", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray86 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hf;I[[B)V")
	public static void method7261(@OriginalArg(0) Class118_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(10) int[] local10 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(13) int local13 = arg1.length;
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(20) byte[] local20 = arg1[local15];
			if (local20 != null) {
				@Pc(27) Class1_Sub13 local27 = new Class1_Sub13(local20);
				local33 = Static85.anIntArray178[local15] >> 8;
				@Pc(39) int local39 = Static85.anIntArray178[local15] & 0xFF;
				@Pc(46) int local46 = local33 * 64 - Static324.anInt6132;
				@Pc(53) int local53 = local39 * 64 - Static517.anInt8716;
				Static443.method6413();
				arg0.method3445(Static517.anInt8716, local53, Static324.anInt6132, Static70.aClass299Array1, local27, local46);
				arg0.method3454(Static478.aClass9_10, local10, local46, local53, local27);
				if (!arg0.aBoolean242 && local33 == Static184.anInt3932 / 8 && Static358.anInt2386 / 8 == local39 && local10[0] != -1) {
					Static446.aClass89_1 = Static27.aClass310_1.method7429(local10[0], local10[3], Static86.aClass254_1, local10[1], local10[2]);
					Static419.anInt7311 = local10[4];
				}
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local13; local118++) {
			@Pc(130) int local130 = (Static85.anIntArray178[local118] >> 8) * 64 - Static324.anInt6132;
			local33 = (Static85.anIntArray178[local118] & 0xFF) * 64 - Static517.anInt8716;
			@Pc(144) byte[] local144 = arg1[local118];
			if (local144 == null && Static358.anInt2386 < 800) {
				Static443.method6413();
				arg0.method3442(local130, local33);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_30 = new Class27(8);

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "[I")
	public static final int[] anIntArray405 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "[I")
	public static final int[] anIntArray406 = new int[32];

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!ss;")
	public static Class219 aClass219_14 = null;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)B")
	public static byte method4059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method4060() {
		Static199.aClass83_32.method1669();
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
	public static void method4063() {
		Static12.anInt325 = 0;
		@Pc(11) int local11 = Static173.aClass1_Sub1_Sub1_1.method4095();
		@Pc(15) int local15 = Static173.aClass1_Sub1_Sub1_1.method4118();
		@Pc(19) int local19 = Static173.aClass1_Sub1_Sub1_1.method4095();
		@Pc(28) boolean local28 = Static173.aClass1_Sub1_Sub1_1.method4118() == 1;
		Static156.method2356(local15);
		@Pc(39) int local39 = (Static283.anInt4985 - Static173.aClass1_Sub1_Sub1_1.anInt5056) / 16;
		Static303.anIntArrayArray151 = new int[local39][4];
		@Pc(54) int local54;
		for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static303.anIntArrayArray151[local45][local54] = Static173.aClass1_Sub1_Sub1_1.method4087();
			}
		}
		Static86.anIntArray149 = new int[local39];
		Static231.anIntArray336 = new int[local39];
		Static337.anIntArray642 = new int[local39];
		Static25.aByteArrayArray15 = null;
		Static209.aByteArrayArray149 = new byte[local39][];
		anIntArray407 = new int[local39];
		Static68.aByteArrayArray29 = new byte[local39][];
		Static208.anIntArray319 = null;
		Static157.anIntArray255 = new int[local39];
		Static264.aByteArrayArray90 = new byte[local39][];
		Static14.aByteArrayArray9 = new byte[local39][];
		local39 = 0;
		for (local54 = (local19 - (Static135.anInt2314 >> 4)) / 8; local54 <= (local19 + (Static135.anInt2314 >> 4)) / 8; local54++) {
			for (@Pc(129) int local129 = (local11 - (Static352.anInt6022 >> 4)) / 8; local129 <= (local11 + (Static352.anInt6022 >> 4)) / 8; local129++) {
				Static157.anIntArray255[local39] = (local54 << 8) + local129;
				Static86.anIntArray149[local39] = Static88.aClass250_19.method5652("m" + local54 + "_" + local129);
				Static337.anIntArray642[local39] = Static88.aClass250_19.method5652("l" + local54 + "_" + local129);
				Static231.anIntArray336[local39] = Static88.aClass250_19.method5652("um" + local54 + "_" + local129);
				anIntArray407[local39] = Static88.aClass250_19.method5652("ul" + local54 + "_" + local129);
				local39++;
			}
		}
		Static149.method2261(false, local28, local19, local11);
	}
}

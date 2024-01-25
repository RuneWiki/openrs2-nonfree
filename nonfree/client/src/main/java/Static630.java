import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "J")
	public static long aLong273;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "F")
	public static float aFloat282;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!us;")
	public static final Class344 aClass344_127 = new Class344(12, 8);

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	public static int anInt10395 = -50;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "[I")
	public static int[] anIntArray622 = new int[1];

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	public static int anInt10396 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public static void method8537(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub1 local7 = new Class2_Sub1();
		local7.anInt23 = arg3;
		local7.anInt15 = Static251.anInt5580 + arg4;
		local7.aString1 = arg1;
		local7.anInt17 = arg5;
		local7.anInt20 = arg2;
		local7.anInt16 = arg6;
		local7.anInt18 = arg0;
		Static159.aClass375_4.method8639(local7);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static472.anInt6105 && Static202.anInt4720 >= arg8 && Static472.anInt6105 <= arg1 && Static202.anInt4720 >= arg1 && Static472.anInt6105 <= arg5 && Static202.anInt4720 >= arg5 && Static472.anInt6105 <= arg3 && Static202.anInt4720 >= arg3 && Static246.anInt5506 <= arg4 && Static583.anInt9761 >= arg4 && arg7 >= Static246.anInt5506 && arg7 <= Static583.anInt9761 && arg0 >= Static246.anInt5506 && arg0 <= Static583.anInt9761 && arg2 >= Static246.anInt5506 && arg2 <= Static583.anInt9761) {
			Static371.method5924(arg3, arg0, arg2, arg7, arg6, arg4, arg5, arg1, arg8);
		} else {
			Static453.method6837(arg3, arg8, arg2, arg0, arg5, arg1, arg7, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!dfa;II)Z")
	public static boolean method8539(@OriginalArg(0) Class3_Sub15_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method2432(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method2432(1) != 0) {
				method8539(arg0, arg1);
			}
			local28 = arg0.method2432(6);
			local33 = arg0.method2432(6);
			@Pc(45) boolean local45 = arg0.method2432(1) == 1;
			if (local45) {
				Static448.anIntArray508[Static420.anInt7818++] = arg1;
			}
			if (Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class329 local68 = Static546.aClass329Array3[arg1];
			@Pc(76) Class2_Sub3_Sub1_Sub2_Sub2 local76 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[arg1] = new Class2_Sub3_Sub1_Sub2_Sub2();
			local76.anInt6289 = arg1;
			if (Static122.aClass3_Sub15Array1[arg1] != null) {
				local76.method5324(Static122.aClass3_Sub15Array1[arg1]);
			}
			local76.method5322(local68.anInt9632, true);
			local76.anInt6331 = local68.anInt9630;
			local102 = local68.anInt9633;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(124) int local124 = local28 + (local112 << 6) - Static446.anInt8090;
			local76.aBoolean540 = local68.aBoolean805;
			@Pc(137) int local137 = (local116 << 6) + local33 - Static124.anInt3150;
			local76.aByteArray69[0] = Static584.aByteArray98[arg1];
			local76.aByte128 = local76.aByte129 = (byte) local106;
			if (Static525.method7485(local137, local124)) {
				local76.aByte129++;
			}
			local76.method5329(local137, local124);
			local76.aBoolean539 = false;
			Static546.aClass329Array3[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method2432(2);
			local33 = Static546.aClass329Array3[arg1].anInt9633;
			Static546.aClass329Array3[arg1].anInt9633 = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(227) int local227;
			@Pc(232) int local232;
			@Pc(240) int local240;
			if (local8 != 2) {
				local28 = arg0.method2432(18);
				local33 = local28 >> 16;
				local227 = local28 >> 8 & 0xFF;
				local232 = local28 & 0xFF;
				local240 = Static546.aClass329Array3[arg1].anInt9633;
				local102 = (local240 >> 28) + local33 & 0x3;
				local106 = local227 + (local240 >> 14) & 0xFF;
				local112 = local232 + local240 & 0xFF;
				Static546.aClass329Array3[arg1].anInt9633 = (local102 << 28) - (-(local106 << 14) - local112);
				return false;
			}
			local28 = arg0.method2432(5);
			local33 = local28 >> 3;
			local227 = local28 & 0x7;
			local232 = Static546.aClass329Array3[arg1].anInt9633;
			local240 = local33 + (local232 >> 28) & 0x3;
			local102 = local232 >> 14 & 0xFF;
			local106 = local232 & 0xFF;
			if (local227 == 0) {
				local106--;
				local102--;
			}
			if (local227 == 1) {
				local106--;
			}
			if (local227 == 2) {
				local106--;
				local102++;
			}
			if (local227 == 3) {
				local102--;
			}
			if (local227 == 4) {
				local102++;
			}
			if (local227 == 5) {
				local106++;
				local102--;
			}
			if (local227 == 6) {
				local106++;
			}
			if (local227 == 7) {
				local102++;
				local106++;
			}
			Static546.aClass329Array3[arg1].anInt9633 = (local102 << 14) + (local240 << 28) + local106;
			return false;
		}
	}
}

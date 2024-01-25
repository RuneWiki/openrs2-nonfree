import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kda", name = "ab", descriptor = "Lclient!pia;")
	public static Class263 aClass263_3;

	@OriginalMember(owner = "client!kda", name = "mb", descriptor = "Z")
	public static boolean aBoolean451;

	@OriginalMember(owner = "client!kda", name = "Wb", descriptor = "I")
	public static int anInt6056;

	@OriginalMember(owner = "client!kda", name = "V", descriptor = "[[S")
	private static final short[][] aShortArrayArray18 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!kda", name = "Db", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!kda", name = "Lb", descriptor = "[[S")
	private static final short[][] aShortArrayArray19 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!kda", name = "Xb", descriptor = "[[S")
	public static final short[][] aShortArrayArray20 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!kda", name = "Sb", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray5 = new short[][][] { aShortArrayArray20, aShortArrayArray18, aShortArrayArray19 };

	@OriginalMember(owner = "client!kda", name = "fc", descriptor = "[I")
	public static final int[] anIntArray352 = new int[256];

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
	public static void method5198(@OriginalArg(0) int arg0) {
		Static447.anInt8316 = arg0;
		Static140.aClass169_24.method5009();
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILclient!vq;IIIILclient!ha;IIII)V")
	public static void method5209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class20 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 < arg3 && arg3 < arg4 + arg9 && arg1 - 13 < arg6 && arg6 < arg1 + 3) {
			arg0 = arg5;
		}
		@Pc(36) String local36 = Static245.method4530(arg2);
		Static571.aClass68_12.method8098(arg1, local36, arg0, arg9 + 3, Static117.aClass46Array5, Static437.anIntArray536);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "()V")
	public static void method5211() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static281.aClass100ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static281.aClass100ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static477.anInt8929; local6++) {
					for (local9 = 0; local9 < Static562.anInt10128; local9++) {
						if (Static281.aClass100ArrayArrayArray1[local3][local6][local9] != null) {
							Static281.aClass100ArrayArrayArray1[local3][local6][local9].method3073();
						}
						Static281.aClass100ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static281.aClass100ArrayArrayArray1 = null;
		Static40.aClass65Array2 = null;
		if (Static283.aClass100ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static283.aClass100ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static477.anInt8929; local6++) {
					for (local9 = 0; local9 < Static562.anInt10128; local9++) {
						if (Static283.aClass100ArrayArrayArray2[local3][local6][local9] != null) {
							Static283.aClass100ArrayArrayArray2[local3][local6][local9].method3073();
						}
						Static283.aClass100ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static283.aClass100ArrayArrayArray2 = null;
		Static103.aClass65Array3 = null;
		Static395.aClass100ArrayArrayArray3 = null;
		Static9.aClass65Array1 = null;
		Static342.aBooleanArrayArray6 = null;
		Static186.aBooleanArrayArray5 = null;
		Static432.anIntArray534 = null;
		Static359.aBooleanArrayArrayArray2 = null;
		Static327.aBooleanArrayArrayArray1 = null;
		Static588.method8690();
		if (Static20.aClass3_Sub1_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static319.anInt6492; local3++) {
				Static20.aClass3_Sub1_Sub3Array1[local3] = null;
			}
			Static319.anInt6492 = 0;
		}
		Static124.aClass3_Sub1Array151 = null;
		Static548.aClass3_Sub1Array129 = null;
		Static359.aClass3_Sub1Array94 = null;
		if (Static613.aClass3_Sub1Array143 != null) {
			for (local3 = 0; local3 < Static613.aClass3_Sub1Array143.length; local3++) {
				Static613.aClass3_Sub1Array143[local3] = null;
			}
			Static644.anInt11085 = 0;
		}
		if (Static615.aClass3_Sub1Array145 != null) {
			for (local3 = 0; local3 < Static615.aClass3_Sub1Array145.length; local3++) {
				Static615.aClass3_Sub1Array145[local3] = null;
			}
			Static328.anInt6627 = 0;
		}
		if (Static436.aClass300Array1 != null) {
			for (local3 = 0; local3 < Static102.anInt2851; local3++) {
				Static436.aClass300Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static462.anInt8470; local6++) {
				for (local9 = 0; local9 < Static477.anInt8929; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static562.anInt10128; local195++) {
						Static423.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static102.anInt2851 = 0;
		}
		Static152.method3428();
		Static292.aClass182_1 = Static292.aClass182_2;
		Static292.aClass182_1.method5402();
		Static98.aByteArrayArray6 = null;
		Static118.anIntArrayArray13 = null;
		Static15.aShortArrayArray1 = null;
		if (Static68.aClass366Array1 != null) {
			Static568.method8488();
			Static194.aClass20_5.method7234(1);
			Static194.aClass20_5.method7262(0);
		}
		if (Static78.aClass59Array1 != null) {
			Static78.aClass59Array1 = null;
		}
		Static194.aClass20_5 = null;
	}
}

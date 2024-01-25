import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fv", name = "ab", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "[S")
	private static final short[] aShortArray63 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!fv", name = "H", descriptor = "Lclient!pca;")
	public static Class251 aClass251_4 = null;

	@OriginalMember(owner = "client!fv", name = "O", descriptor = "[S")
	private static final short[] aShortArray64 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!fv", name = "Q", descriptor = "[S")
	private static final short[] aShortArray65 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fv", name = "K", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { aShortArray63, aShortArray64, aShortArray65 };

	@OriginalMember(owner = "client!fv", name = "T", descriptor = "I")
	public static int anInt3599 = -1;

	@OriginalMember(owner = "client!fv", name = "W", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	public static void method2919(@OriginalArg(1) int arg0) {
		Static187.method3302();
		@Pc(13) int local13 = Static406.aClass144_1.method3700(arg0).anInt3920;
		if (local13 == 0) {
			return;
		}
		@Pc(24) int local24 = Static206.aClass143_3.anIntArray213[arg0];
		if (local13 == 5) {
			Static103.anInt2586 = local24;
		}
		if (local13 == 6) {
			Static261.anInt5024 = local24;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V")
	public static void method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg2 >= Static384.anInt6641 && arg1 + arg2 <= Static191.anInt4134 && Static112.anInt2687 <= arg0 - arg2 && arg2 + arg0 <= Static333.anInt6022) {
			Static504.method6762(arg2, arg3, arg1, arg0);
		} else {
			Static537.method7346(arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!r;Lclient!pca;)V")
	public static void method2924(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(31) boolean local31 = Static272.aClass121_2.method3328(arg1.anInt7227 | 0xFF000000, arg1.anInt7254, arg1.anInt7253, arg0, arg1.aBoolean513 ? Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1 : null, arg1.anInt7248, arg1.anInt7273) == null;
		if (local31) {
			Static330.aClass244_48.method5570(new Class3_Sub40(arg1.anInt7254, arg1.anInt7248, arg1.anInt7273, arg1.anInt7227 | 0xFF000000, arg1.anInt7253, arg1.aBoolean513));
			Static588.method8016(arg1);
		}
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(III)Z")
	public static boolean method2925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)Z")
	public static boolean method2927(@OriginalArg(0) int arg0) {
		if (Static121.aBooleanArray7[arg0]) {
			return true;
		} else if (Static117.aClass284_36.method6349(arg0)) {
			@Pc(28) int local28 = Static117.aClass284_36.method6354(arg0);
			if (local28 == 0) {
				Static121.aBooleanArray7[arg0] = true;
				return true;
			}
			if (Static449.aClass251ArrayArray1[arg0] == null) {
				Static449.aClass251ArrayArray1[arg0] = new Class251[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static449.aClass251ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static117.aClass284_36.method6331(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class251 local73 = Static449.aClass251ArrayArray1[arg0][local47] = new Class251();
						local73.anInt7279 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5699(new Class3_Sub26(local61));
					}
				}
			}
			Static121.aBooleanArray7[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

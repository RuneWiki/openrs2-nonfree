import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	public static int anInt6548;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_110 = new Class349(36, 3);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)Z")
	public static boolean method5446(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([BII)I")
	public static int method5449(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static269.method3735(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method5451(@OriginalArg(1) Class12_Sub2_Sub1_Sub4 arg0) {
		if (arg0.anIntArray560 == null && arg0.anIntArray559 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray560.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray560 != null) {
				local20 = arg0.anIntArray560[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(76) int local76;
				@Pc(93) int local93;
				@Pc(59) int local59;
				if ((local20 & 0xC0000000) == -1073741824) {
					local59 = local20 & 0xFFFFFFF;
					@Pc(63) int local63 = local59 >> 14;
					local76 = arg0.anInt9374 - (local63 + -Static485.anInt7725) * 512 - 256;
					@Pc(80) int local80 = local59 & 0x3FFF;
					local93 = arg0.anInt9375 - (local80 - Static310.anInt5129) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(143) Class2_Sub5 local143 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local20);
					if (local143 == null) {
						arg0.method6770(-1, local16);
						continue;
					}
					@Pc(148) Class12_Sub2_Sub1_Sub4_Sub2 local148 = local143.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					local76 = arg0.anInt9374 - local148.anInt9374;
					local93 = arg0.anInt9375 - local148.anInt9375;
				} else {
					local59 = local20 & 0x7FFF;
					@Pc(110) Class12_Sub2_Sub1_Sub4_Sub1 local110 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local59];
					if (local110 == null) {
						arg0.method6770(-1, local16);
						continue;
					}
					local93 = arg0.anInt9375 - local110.anInt9375;
					local76 = arg0.anInt9374 - local110.anInt9374;
				}
				if (local76 != 0 || local93 != 0) {
					arg0.method6770((int) (Math.atan2((double) local76, (double) local93) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method6770(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray560 = null;
			arg0.anIntArray559 = null;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIII)I")
	public static int method5453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg1;
			arg1 = local10;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1 + 7 - arg3 - arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(FFIFB)F")
	public static float method5454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static582.aFloatArrayArray15[arg2];
		return arg3 * local12[2] + local12[0] * arg1 + local12[1] * arg0;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	public static void method5455() {
		Static509.aClass273ArrayArray2 = new Class273[Static439.aClass229_100.method4952()][];
		Static183.aClass273ArrayArray1 = new Class273[Static439.aClass229_100.method4952()][];
		Static472.aBooleanArray27 = new boolean[Static439.aClass229_100.method4952()];
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
	public static void method5456(@OriginalArg(0) int arg0) {
		if (Static25.anInt442 == 0) {
			Static84.aClass2_Sub3_Sub2_7.method2059(arg0);
		} else {
			Static268.anInt4384 = arg0;
		}
	}
}

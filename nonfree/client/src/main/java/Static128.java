import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ht", name = "H", descriptor = "Lclient!ct;")
	public static Class30 aClass30_87;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "Lclient!kg;")
	public static Class112 aClass112_21 = null;

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_202 = new Class106("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
	public static int anInt5882 = 0;

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
	public static int anInt5883 = 0;

	@OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
	public static int anInt5884 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIII)V")
	public static void method5289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static77.anInt1698; local5++) {
			@Pc(13) Rectangle local13 = Class11_Sub1_Sub2.aRectangleArray2[local5];
			if (local13.width + local13.x > arg1 && local13.x < arg3 + arg1 && arg0 < local13.y + local13.height && local13.y < arg0 + arg2) {
				Static207.aBooleanArray21[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZLclient!fp;I[[IB)V")
	public static void method5290(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		for (@Pc(16) int local16 = 0; local16 < arg2; local16++) {
			@Pc(28) int[][] local28;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg3 == null) {
				local28 = null;
			} else {
				local28 = new int[Static311.anInt5653 + 1][Static189.anInt3820 + 1];
				for (local30 = 0; local30 <= Static189.anInt3820; local30++) {
					for (local34 = 0; local34 <= Static311.anInt5653; local34++) {
						local28[local34][local30] = Static102.anIntArrayArrayArray134[local16][local34][local30] - arg3[local34][local30];
					}
				}
			}
			local30 = 0;
			local34 = 0;
			if (!arg0) {
				if (Static69.aBoolean112) {
					local30 = 2;
				}
				if (Static24.aBoolean34) {
					local34 = 8;
				}
				if (Static218.anInt4352 != 0) {
					if (local16 == 0 || Static268.anInt5269 >= 96) {
						local34 |= 0x10;
					}
					local30 |= 0x1;
				}
			}
			if (Static69.aBoolean112) {
				local34 |= 0x7;
			}
			@Pc(134) Class36 local134 = arg1.method4581(Static311.anInt5653, Static189.anInt3820, Static102.anIntArrayArrayArray134[local16], local28, local30, local34);
			Static281.method5013(local16, local134);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZ)V")
	public static void method5292(@OriginalArg(0) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (arg0) {
			local11 = 1;
			local13 = Static258.aByteArrayArray4;
		} else {
			local11 = 4;
			local13 = Static349.aByteArrayArray18;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			Static82.method1769();
			for (@Pc(31) int local31 = 0; local31 < Static311.anInt5653 >> 3; local31++) {
				for (@Pc(35) int local35 = 0; local35 < Static189.anInt3820 >> 3; local35++) {
					@Pc(39) boolean local39 = false;
					@Pc(47) int local47 = Static1.anIntArrayArrayArray4[local21][local31][local35];
					if (local47 != -1) {
						@Pc(56) int local56 = local47 >> 24 & 0x3;
						if (!arg0 || local56 == 0) {
							@Pc(66) int local66 = local47 >> 1 & 0x3;
							@Pc(72) int local72 = local47 >> 14 & 0x3FF;
							@Pc(78) int local78 = local47 >> 3 & 0x7FF;
							@Pc(89) int local89 = (local72 / 8 << 8) + (local78 / 8);
							for (@Pc(91) int local91 = 0; local91 < Static37.anIntArray60.length; local91++) {
								if (Static37.anIntArray60[local91] == local89 && local13[local91] != null) {
									@Pc(122) int[] local122 = Static59.method1448(local35 * 8, local56, Static11.aClass196Array2, Static9.aClass63_1, local21, arg0, local66, local13[local91], local78, local31 * 8, local72);
									if (local7 == null && local122 != null) {
										local7 = local122;
									}
									local39 = true;
									break;
								}
							}
						}
					}
					if (!local39) {
						Static356.method5905(local31 * 8, 8, local21, local35 * 8, 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static191.aClass90_3 = null;
		} else {
			Static191.aClass90_3 = Static363.method6015(local7[3], local7[1], local7[2], local7[0]);
			Static15.anInt301 = local7[4];
		}
	}
}

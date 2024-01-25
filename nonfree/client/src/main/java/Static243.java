import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt4530;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_95 = new Class83("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public static int anInt4535 = 20;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_96 = new Class83("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_50 = new Class215(72, -1);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg2 - arg4;
		@Pc(25) int local25 = arg1 - arg4;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = arg1 * arg1;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg1 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(75) int local75 = local29 * (1 - local61) + local45;
		@Pc(84) int local84 = local33 - (local61 - 1) * local49;
		@Pc(93) int local93 = local53 + (1 - local65) * local37;
		@Pc(101) int local101 = local41 - local57 * (local65 - 1);
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 << 2;
		@Pc(121) int local121 = local45 * 3;
		@Pc(127) int local127 = local49 * (local61 - 3);
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = (local65 - 3) * local57;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg1 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (local25 - 1) * local113;
		@Pc(157) int[] local157 = Static96.anIntArrayArray21[arg0];
		Static251.method3640(arg5 - arg2, arg3, arg5 - local21, local157);
		Static251.method3640(arg5 - local21, arg6, arg5 + local21, local157);
		Static251.method3640(arg5 + local21, arg3, arg5 + arg2, local157);
		while (local14 > 0) {
			@Pc(205) boolean local205 = local25 >= local14;
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local139;
					local75 += local121;
					local139 += local109;
					local12++;
					local121 += local109;
				}
			}
			if (local205) {
				if (local93 < 0) {
					while (local93 < 0) {
						local101 += local147;
						local93 += local131;
						local147 += local117;
						local131 += local117;
						local16++;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local93 += local131;
					local147 += local117;
					local131 += local117;
					local16++;
				}
				local93 += -local153;
				local101 += -local137;
				local137 -= local113;
				local153 -= local113;
			}
			if (local84 < 0) {
				local84 += local139;
				local75 += local121;
				local139 += local109;
				local12++;
				local121 += local109;
			}
			local84 += -local127;
			local75 += -local145;
			local145 -= local105;
			local127 -= local105;
			local14--;
			@Pc(342) int local342 = arg0 - local14;
			@Pc(346) int local346 = local14 + arg0;
			@Pc(350) int local350 = local12 + arg5;
			@Pc(354) int local354 = arg5 - local12;
			if (local205) {
				@Pc(378) int local378 = arg5 + local16;
				@Pc(383) int local383 = arg5 - local16;
				Static251.method3640(local354, arg3, local383, Static96.anIntArrayArray21[local342]);
				Static251.method3640(local383, arg6, local378, Static96.anIntArrayArray21[local342]);
				Static251.method3640(local378, arg3, local350, Static96.anIntArrayArray21[local342]);
				Static251.method3640(local354, arg3, local383, Static96.anIntArrayArray21[local346]);
				Static251.method3640(local383, arg6, local378, Static96.anIntArrayArray21[local346]);
				Static251.method3640(local378, arg3, local350, Static96.anIntArrayArray21[local346]);
			} else {
				Static251.method3640(local354, arg3, local350, Static96.anIntArrayArray21[local342]);
				Static251.method3640(local354, arg3, local350, Static96.anIntArrayArray21[local346]);
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IC)Z")
	public static boolean method3559(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method3561(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static391.aClass76_91.anInt2476 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static444.aClass206_3.anInt5987; local18++) {
			@Pc(27) Class211 local27 = Static444.aClass206_3.method4703(local18);
			if ((!arg1 || local27.aBoolean564) && local27.anInt6175 == -1 && local27.anInt6185 == -1 && local27.anInt6151 == 0 && local27.aString61.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static191.aShortArray66 = null;
					Static406.anInt6702 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static47.anInt809 = 0;
		Static191.aShortArray66 = local14;
		Static406.anInt6702 = local16;
		@Pc(114) String[] local114 = new String[Static406.anInt6702];
		for (@Pc(116) int local116 = 0; local116 < Static406.anInt6702; local116++) {
			local114[local116] = Static444.aClass206_3.method4703(local14[local116]).aString61;
		}
		Static67.method1278(local114, Static191.aShortArray66);
		Static391.aClass76_91.method2118();
		Static391.aClass76_91.anInt2476 = 2;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg0, 12);
		local8.method2604();
		local8.anInt3083 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
	public static int method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static346.aByteArrayArray26 == null ? 0 : (Static346.aByteArrayArray26[arg0][arg1] & 0xFF) << 3;
	}
}

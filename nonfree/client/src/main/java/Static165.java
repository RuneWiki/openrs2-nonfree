import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public static int anInt3323;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_68 = new Class93("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString29 = null;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ae;Lclient!on;I)V")
	public static void method3078(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class146 arg1) {
		@Pc(30) boolean local30 = Static86.method1934(arg1.anInt4480 | 0xFF000000, arg1.anInt4489, arg1.anInt4466, arg1.anInt4478, arg1.anInt4479, arg1.aBoolean403 ? Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 : null, arg0) == null;
		if (local30) {
			Static343.aClass216_45.method5995(new Class2_Sub22(arg1.anInt4478, arg1.anInt4489, arg1.anInt4479, arg1.anInt4480 | 0xFF000000, arg1.anInt4466, arg1.aBoolean403));
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public static void method3080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub11_Sub19 local13 = Static306.method5411(10, arg0);
		local13.method5537();
		local13.anInt6365 = arg3;
		local13.anInt6362 = arg2;
		local13.anInt6368 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!gh;[[IIZ[[BLclient!ae;I[[B[[B[[BLclient!gh;I)V")
	public static void method3081(@OriginalArg(1) Class73 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) Class4 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class73 arg10, @OriginalArg(12) int arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg11; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
				if (Static257.method4680() || Static85.method1908(arg6, local7, Static69.anInt1511, local3)) {
					@Pc(27) byte local27 = arg9[local3][local7];
					@Pc(33) byte local33 = arg4[local3][local7];
					@Pc(41) int local41 = arg8[local3][local7] & 0xFF;
					@Pc(49) int local49 = arg7[local3][local7] & 0xFF;
					@Pc(59) Class150 local59 = local41 == 0 ? null : Static19.method676(local41 - 1);
					@Pc(69) Class39 local69 = local49 == 0 ? null : Static247.method4480(local49 - 1);
					@Pc(71) int local71 = 0;
					@Pc(73) int local73 = 0;
					if (local27 != 0) {
						local71 = local69 == null ? 0 : Static194.anIntArray303[local27];
						local73 = local59 == null ? 0 : Static113.anIntArray228[local27];
					} else if (local59 != null) {
						local73 = Static113.anIntArray228[local27];
					} else if (local69 != null) {
						local71 = Static113.anIntArray228[local27];
					}
					@Pc(114) int local114 = local71 + local73;
					@Pc(116) int local116 = 0;
					if (local114 != 0) {
						@Pc(124) int[] local124 = new int[local114];
						@Pc(127) int[] local127 = new int[local114];
						@Pc(130) int[] local130 = new int[local114];
						@Pc(133) int[] local133 = new int[local114];
						@Pc(135) boolean local135 = false;
						@Pc(159) int local159;
						@Pc(165) int local165;
						if (local59 == null || local59.anInt4535 == -1 && local59.anInt4538 == -1 && local59.anInt4545 == -1) {
							for (local159 = 0; local159 < local73; local159++) {
								local124[local116] = -1;
								local116++;
							}
						} else {
							local159 = arg5.method4297() ? local59.anInt4545 : local59.anInt4534;
							if (!Static315.aBoolean563) {
								local159 = -1;
							}
							for (local165 = 0; local165 < local73; local165++) {
								local130[local116] = local159;
								local133[local116] = local59.anInt4536;
								if (local59.anInt4535 == -1) {
									local124[local116] = -1;
								} else {
									local124[local116] = local59.anInt4535;
								}
								if (local59.anInt4538 == -1) {
									local127[local116] = -1;
								} else {
									local127[local116] = local59.anInt4538;
									local135 = true;
								}
								local116++;
							}
							if (!arg3 && arg6 == 0) {
								Static305.method5357(local3, local7, local59.anInt4531, local59.anInt4533 * 8);
							}
						}
						if (!local135) {
							local127 = null;
						}
						if (local69 == null) {
							for (local159 = 0; local159 < local71; local159++) {
								local124[local116] = -1;
								local116++;
							}
						} else {
							local159 = local69.anInt1113;
							if (!Static315.aBoolean563) {
								local159 = -1;
							}
							for (local165 = 0; local165 < local71; local165++) {
								local130[local116] = local159;
								local133[local116] = local69.anInt1106;
								local124[local116] = arg1[local3][local7];
								if (local127 != null) {
									local127[local116] = -1;
								}
								local116++;
							}
						}
						local159 = Static60.anIntArray102.length;
						@Pc(319) int[] local319 = arg3 ? new int[local159] : null;
						@Pc(322) int[] local322 = new int[local159];
						@Pc(325) int[] local325 = new int[local159];
						@Pc(333) int local333;
						@Pc(337) int local337;
						@Pc(420) int local420;
						@Pc(428) int local428;
						for (@Pc(327) int local327 = 0; local327 < local159; local327++) {
							local333 = Static60.anIntArray102[local327];
							local337 = Static319.anIntArray473[local327];
							if (local33 == 0) {
								local322[local327] = local333;
								local325[local327] = local337;
							} else if (local33 == 1) {
								local322[local327] = local337;
								local325[local327] = 128 - local333;
							} else if (local33 == 2) {
								local322[local327] = 128 - local333;
								local325[local327] = 128 - local337;
							} else if (local33 == 3) {
								local322[local327] = 128 - local337;
								local325[local327] = local333;
							}
							if (arg3 && Static60.aBooleanArrayArray1[local27][local327]) {
								local420 = local322[local327] + (local3 << 7);
								local428 = (local7 << 7) + local325[local327];
								local319[local327] = arg0.method4932(local420, local428) - arg10.method4932(local420, local428);
							}
						}
						local333 = arg10.method4931(local3, local7);
						local337 = arg10.method4931(local3 + 1, local7);
						local420 = arg10.method4931(local3 + 1, local7 + 1);
						local428 = arg10.method4931(local3, local7 + 1);
						if (arg6 > 0) {
							@Pc(477) boolean local477 = true;
							if (local49 == 0 && local27 != 0) {
								local477 = false;
							}
							if (local41 > 0 && local59 != null && !local59.aBoolean414) {
								local477 = false;
							}
							if (local477 && local333 == local337 && local333 == local420 && local428 == local333) {
								Static272.aByteArrayArrayArray9[arg6][local3][local7] = (byte) (Static272.aByteArrayArrayArray9[arg6][local3][local7] | 0x4);
							}
						}
						@Pc(540) int local540 = 0;
						@Pc(542) int local542 = 0;
						if (arg3) {
							local540 = Static296.method5233(local3, local7);
							local542 = Static284.method5096(local3, local7);
						}
						arg10.method4929(local3, local7, local322, local319, local325, Static98.anIntArrayArray66[local27], Static34.anIntArrayArray22[local27], Static120.anIntArrayArray79[local27], local124, local127, local130, local133, local540, local542);
						Static65.method1493(arg6, local3, local7);
					}
				}
			}
		}
	}
}

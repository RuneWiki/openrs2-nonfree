import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ip", name = "Md", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_24 = new Class282(6, 0, 4, 2);

	@OriginalMember(owner = "client!ip", name = "Cd", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_43 = new Class168(4);

	@OriginalMember(owner = "client!ip", name = "jd", descriptor = "[Lclient!ih;")
	public static final Class5_Sub12[] aClass5_Sub12Array3 = new Class5_Sub12[8];

	@OriginalMember(owner = "client!ip", name = "vd", descriptor = "[I")
	public static int[] anIntArray249 = new int[2];

	@OriginalMember(owner = "client!ip", name = "Tc", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!gda;ILclient!ha;)V")
	public static void method4078(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(10) Class362[] local10 = Static692.method8280(arg0, Static176.anInt3345);
		Static550.aClass155Array15 = new Class155[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static550.aClass155Array15[local16] = arg2.method8640(local10[local16], true);
		}
		local10 = Static692.method8280(arg0, Static644.anInt10532);
		Static630.aClass155Array21 = new Class155[local10.length];
		for (@Pc(45) int local45 = 0; local45 < local10.length; local45++) {
			Static630.aClass155Array21[local45] = arg2.method8640(local10[local45], true);
		}
		local10 = Static692.method8280(arg0, Static522.anInt8282);
		Static120.aClass155Array6 = new Class155[local10.length];
		for (@Pc(76) int local76 = 0; local76 < local10.length; local76++) {
			Static120.aClass155Array6[local76] = arg2.method8640(local10[local76], true);
		}
		local10 = Static692.method8280(arg0, Static53.anInt930);
		Static256.aClass155Array14 = new Class155[local10.length];
		for (@Pc(111) int local111 = 0; local111 < local10.length; local111++) {
			Static256.aClass155Array14[local111] = arg2.method8640(local10[local111], true);
		}
		local10 = Static692.method8280(arg0, Static246.anInt4309);
		Static225.aClass155Array12 = new Class155[local10.length];
		for (@Pc(142) int local142 = 0; local142 < local10.length; local142++) {
			Static225.aClass155Array12[local142] = arg2.method8640(local10[local142], true);
		}
		local10 = Static692.method8280(arg0, Static445.anInt6595);
		Static453.aClass155Array19 = new Class155[local10.length];
		for (@Pc(173) int local173 = 0; local173 < local10.length; local173++) {
			Static453.aClass155Array19[local173] = arg2.method8640(local10[local173], true);
		}
		local10 = Static692.method8280(arg0, Static677.anInt8510);
		Static415.aClass155Array17 = new Class155[local10.length];
		for (@Pc(208) int local208 = 0; local208 < local10.length; local208++) {
			Static415.aClass155Array17[local208] = arg2.method8640(local10[local208], true);
		}
		local10 = Static692.method8280(arg0, Static518.anInt8220);
		Static170.aClass155Array10 = new Class155[local10.length];
		for (@Pc(239) int local239 = 0; local239 < local10.length; local239++) {
			Static170.aClass155Array10[local239] = arg2.method8640(local10[local239], true);
		}
		local10 = Static692.method8280(arg0, Static628.anInt10021);
		Static219.aClass155Array11 = new Class155[local10.length];
		for (@Pc(274) int local274 = 0; local274 < local10.length; local274++) {
			Static219.aClass155Array11[local274] = arg2.method8640(local10[local274], true);
		}
		local10 = Static692.method8280(arg0, Static125.anInt2088);
		Static99.aClass155Array4 = new Class155[local10.length];
		for (@Pc(305) int local305 = 0; local305 < local10.length; local305++) {
			Static99.aClass155Array4[local305] = arg2.method8640(local10[local305], true);
		}
		local10 = Static692.method8280(arg0, Static148.anInt2916);
		Static388.aClass155Array16 = new Class155[local10.length];
		for (@Pc(336) int local336 = 0; local336 < local10.length; local336++) {
			Static388.aClass155Array16[local336] = arg2.method8640(local10[local336], true);
		}
		local10 = Static692.method8280(arg0, Static52.anInt913);
		Static326.aClass155Array13 = new Class155[local10.length];
		for (@Pc(371) int local371 = 0; local371 < local10.length; local371++) {
			Static326.aClass155Array13[local371] = arg2.method8640(local10[local371], true);
		}
		Static280.aClass155_13 = arg2.method8640(Static692.method8275(arg0, Static104.anInt1716, 0), true);
		Static28.aClass155_3 = arg2.method8640(Static692.method8275(arg0, Static493.anInt7983, 0), true);
		local10 = Static692.method8280(arg0, Static214.anInt10029);
		Static438.aClass155Array18 = new Class155[local10.length];
		for (@Pc(418) int local418 = arg1; local418 < local10.length; local418++) {
			Static438.aClass155Array18[local418] = arg2.method8640(local10[local418], true);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)Z")
	public static boolean method4080(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 12 || arg0 == 47 || arg0 == 58 || arg0 == 3) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIIILclient!ii;II)Z")
	public static boolean method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class169 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg1;
		@Pc(27) int local27 = arg5 - 64;
		Static238.anIntArrayArray33[64][64] = 99;
		@Pc(38) int local38 = arg1 - 64;
		Static617.anIntArrayArray59[64][64] = 0;
		@Pc(46) byte local46 = 0;
		@Pc(48) int local48 = 0;
		Static272.anIntArray266[0] = arg5;
		@Pc(55) int local55 = local46 + 1;
		Static403.anIntArray393[0] = arg1;
		@Pc(60) int[][] local60 = arg7.anIntArrayArray34;
		while (local55 != local48) {
			local9 = Static403.anIntArray393[local48];
			local7 = Static272.anIntArray266[local48];
			@Pc(76) int local76 = local7 - arg7.anInt4219;
			@Pc(81) int local81 = local9 - local38;
			@Pc(86) int local86 = local7 - local27;
			@Pc(92) int local92 = local9 - arg7.anInt4229;
			local48 = local48 + 1 & 0xFFF;
			if (arg2 == -4) {
				if (arg4 == local7 && arg9 == local9) {
					Static458.anInt7397 = local7;
					Static388.anInt6572 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static570.method7683(local7, arg0, 1, 1, local9, arg9, arg4, arg3)) {
					Static388.anInt6572 = local9;
					Static458.anInt7397 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg7.method3866(arg3, arg8, local7, 1, local9, arg4, arg0, 1, arg9)) {
					Static388.anInt6572 = local9;
					Static458.anInt7397 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg7.method3868(arg3, arg0, local7, local9, arg9, arg8, arg4, 1)) {
					Static458.anInt7397 = local7;
					Static388.anInt6572 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg7.method3873(arg4, arg9, arg2, arg6, local7, 1, local9)) {
					Static388.anInt6572 = local9;
					Static458.anInt7397 = local7;
					return true;
				}
			} else if (arg7.method3863(arg4, local7, arg6, arg9, arg2, 1, local9)) {
				Static458.anInt7397 = local7;
				Static388.anInt6572 = local9;
				return true;
			}
			@Pc(277) int local277 = Static617.anIntArrayArray59[local86][local81] + 1;
			if (local86 > 0 && Static238.anIntArrayArray33[local86 - 1][local81] == 0 && (local60[local76 - 1][local92] & 0x42240000) == 0) {
				Static272.anIntArray266[local55] = local7 - 1;
				Static403.anIntArray393[local55] = local9;
				Static238.anIntArrayArray33[local86 - 1][local81] = 2;
				local55 = local55 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local86 - 1][local81] = local277;
			}
			if (local86 < 127 && Static238.anIntArrayArray33[local86 + 1][local81] == 0 && (local60[local76 + 1][local92] & 0x60240000) == 0) {
				Static272.anIntArray266[local55] = local7 + 1;
				Static403.anIntArray393[local55] = local9;
				Static238.anIntArrayArray33[local86 + 1][local81] = 8;
				local55 = local55 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local86 + 1][local81] = local277;
			}
			if (local81 > 0 && Static238.anIntArrayArray33[local86][local81 - 1] == 0 && (local60[local76][local92 - 1] & 0x40A40000) == 0) {
				Static272.anIntArray266[local55] = local7;
				Static403.anIntArray393[local55] = local9 - 1;
				Static238.anIntArrayArray33[local86][local81 - 1] = 1;
				local55 = local55 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local86][local81 - 1] = local277;
			}
			if (local81 < 127 && Static238.anIntArrayArray33[local86][local81 + 1] == 0 && (local60[local76][local92 + 1] & 0x48240000) == 0) {
				Static272.anIntArray266[local55] = local7;
				Static403.anIntArray393[local55] = local9 + 1;
				Static238.anIntArrayArray33[local86][local81 + 1] = 4;
				local55 = local55 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local86][local81 + 1] = local277;
			}
			if (local86 > 0 && local81 > 0 && Static238.anIntArrayArray33[local86 - 1][local81 - 1] == 0 && (local60[local76 - 1][local92 - 1] & 0x43A40000) == 0 && (local60[local76 - 1][local92] & 0x42240000) == 0 && (local60[local76][local92 - 1] & 0x40A40000) == 0) {
				Static272.anIntArray266[local55] = local7 - 1;
				Static403.anIntArray393[local55] = local9 - 1;
				local55 = local55 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local86 - 1][local81 - 1] = 3;
				Static617.anIntArrayArray59[local86 - 1][local81 - 1] = local277;
			}
			if (local86 < 127 && local81 > 0 && Static238.anIntArrayArray33[local86 + 1][local81 - 1] == 0 && (local60[local76 + 1][local92 - 1] & 0x60E40000) == 0 && (local60[local76 + 1][local92] & 0x60240000) == 0 && (local60[local76][local92 - 1] & 0x40A40000) == 0) {
				Static272.anIntArray266[local55] = local7 + 1;
				Static403.anIntArray393[local55] = local9 - 1;
				Static238.anIntArrayArray33[local86 + 1][local81 - 1] = 9;
				local55 = local55 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local86 + 1][local81 - 1] = local277;
			}
			if (local86 > 0 && local81 < 127 && Static238.anIntArrayArray33[local86 - 1][local81 + 1] == 0 && (local60[local76 - 1][local92 + 1] & 0x4E240000) == 0 && (local60[local76 - 1][local92] & 0x42240000) == 0 && (local60[local76][local92 + 1] & 0x48240000) == 0) {
				Static272.anIntArray266[local55] = local7 - 1;
				Static403.anIntArray393[local55] = local9 + 1;
				Static238.anIntArrayArray33[local86 - 1][local81 + 1] = 6;
				local55 = local55 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local86 - 1][local81 + 1] = local277;
			}
			if (local86 < 127 && local81 < 127 && Static238.anIntArrayArray33[local86 + 1][local81 + 1] == 0 && (local60[local76 + 1][local92 + 1] & 0x78240000) == 0 && (local60[local76 + 1][local92] & 0x60240000) == 0 && (local60[local76][local92 + 1] & 0x48240000) == 0) {
				Static272.anIntArray266[local55] = local7 + 1;
				Static403.anIntArray393[local55] = local9 + 1;
				local55 = local55 + 1 & 0xFFF;
				Static238.anIntArrayArray33[local86 + 1][local81 + 1] = 12;
				Static617.anIntArrayArray59[local86 + 1][local81 + 1] = local277;
			}
		}
		Static388.anInt6572 = local9;
		Static458.anInt7397 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!pj;[[B)V")
	public static void method4089(@OriginalArg(1) Class137_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.anInt7399; local15++) {
			Static455.method6423();
			for (@Pc(23) int local23 = 0; local23 < Static271.anInt4910 >> 3; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static613.anInt9909 >> 3; local27++) {
					@Pc(37) int local37 = Static653.anIntArrayArrayArray20[local15][local23][local27];
					if (local37 != -1) {
						@Pc(47) int local47 = local37 >> 24 & 0x3;
						if (!arg0.aBoolean505 || local47 == 0) {
							@Pc(63) int local63 = local37 >> 1 & 0x3;
							@Pc(69) int local69 = local37 >> 14 & 0x3FF;
							@Pc(75) int local75 = local37 >> 3 & 0x7FF;
							@Pc(85) int local85 = (local69 / 8 << 8) + local75 / 8;
							for (@Pc(87) int local87 = 0; local87 < Static75.anIntArray68.length; local87++) {
								if (Static75.anIntArray68[local87] == local85 && arg1[local87] != null) {
									arg0.method6463(Static273.aClass100_6, Static553.aClass169Array1, local15, local23 * 8, (local75 & 0x7) * 8, local47, arg1[local87], local27 * 8, local63, (local69 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}

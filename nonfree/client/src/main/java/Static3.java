import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public static void method48(@OriginalArg(0) int arg0) {
		if (arg0 != 15234) {
			aClass43Array1 = null;
		}
		if (Static538.method7529(Static357.anInt5722)) {
			if (Static487.aClass221_1.aClass5_2 == null) {
				Static261.method9374(-108, 5);
				return;
			}
			Static261.method9374(arg0 ^ 0xFFFFC403, 7);
		} else if (Static357.anInt5722 == 5 || Static357.anInt5722 == 6) {
			Static261.method9374(-128, 3);
			return;
		} else if (Static357.anInt5722 == 13) {
			Static261.method9374(-88, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZ)V")
	public static void method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class2_Sub38 local6 = (Class2_Sub38) Static594.aClass60_191.method1226(7); local6 != null; local6 = (Class2_Sub38) Static594.aClass60_191.method1228()) {
			Static17.method247(arg3, arg2, arg1, arg0, local6);
		}
		if (false) {
			method48(14);
		}
		@Pc(151) int local151;
		@Pc(215) boolean local215;
		for (@Pc(44) Class2_Sub38 local44 = (Class2_Sub38) Static171.aClass60_56.method1226(7); local44 != null; local44 = (Class2_Sub38) Static171.aClass60_56.method1228()) {
			@Pc(48) byte local48 = 1;
			@Pc(53) Class49 local53 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.method2064(-52);
			@Pc(59) int local59 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.aClass53_6.method4088();
			if (local59 == -1 || local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.aBoolean248) {
				local48 = 0;
			} else if (local53.anInt1071 == local59 || local59 == local53.anInt1057 || local59 == local53.anInt1059 || local59 == local53.anInt1100) {
				local48 = 2;
			} else if (local53.anInt1055 == local59 || local59 == local53.anInt1097 || local53.anInt1062 == local59 || local53.anInt1069 == local59) {
				local48 = 3;
			}
			if (local48 != local44.anInt6463) {
				local151 = Static461.method6669(local44.aClass4_Sub2_Sub1_Sub2_Sub2_2);
				@Pc(155) Class261 local155 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.aClass261_1;
				if (local155.anIntArray499 != null) {
					local155 = local155.method6272(Static396.aClass107_1);
				}
				if (local155 == null || local151 == -1) {
					local44.anInt6463 = local48;
					local44.anInt6458 = -1;
					local44.aBoolean546 = false;
				} else if (local44.anInt6458 == local151 && local44.aBoolean546 == local155.aBoolean591) {
					local44.anInt6461 = local155.anInt7027;
					local44.anInt6463 = local48;
				} else {
					local215 = false;
					if (local44.aClass2_Sub23_Sub2_3 == null) {
						local215 = true;
					} else {
						local44.anInt6461 -= 512;
						if (local44.anInt6461 <= 0) {
							Static130.aClass2_Sub23_Sub3_1.method6797(local44.aClass2_Sub23_Sub2_3);
							local215 = true;
							local44.aClass2_Sub23_Sub2_3 = null;
						}
					}
					if (local215) {
						local44.anInt6463 = local48;
						local44.aBoolean546 = local155.aBoolean591;
						local44.anInt6458 = local151;
						local44.aClass2_Sub17_3 = null;
						local44.anInt6461 = local155.anInt7027;
						local44.aClass2_Sub4_Sub1_4 = null;
					}
				}
			}
			local44.anInt6462 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.anInt10229;
			local44.anInt6454 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.anInt10229 + (local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.method2046() << 8);
			local44.anInt6467 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.anInt10228;
			local44.anInt6465 = local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.anInt10228 + (local44.aClass4_Sub2_Sub1_Sub2_Sub2_2.method2046() << 8);
			Static17.method247(arg3, arg2, arg1, arg0, local44);
		}
		for (@Pc(329) Class2_Sub38 local329 = (Class2_Sub38) Static307.aClass218_22.method5092(); local329 != null; local329 = (Class2_Sub38) Static307.aClass218_22.method5096()) {
			@Pc(333) byte local333 = 1;
			@Pc(338) Class49 local338 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.method2064(-98);
			local151 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.aClass53_6.method4088();
			if (local151 == -1 || local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.aBoolean248) {
				local333 = 0;
			} else if (local338.anInt1071 == local151 || local151 == local338.anInt1057 || local338.anInt1059 == local151 || local338.anInt1100 == local151) {
				local333 = 2;
			} else if (local338.anInt1055 == local151 || local338.anInt1097 == local151 || local338.anInt1062 == local151 || local338.anInt1069 == local151) {
				local333 = 3;
			}
			if (local329.anInt6463 != local333) {
				@Pc(436) int local436 = Static564.method7853(local329.aClass4_Sub2_Sub1_Sub2_Sub1_3);
				if (local329.anInt6458 == local436 && local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.aBoolean100 == local329.aBoolean546) {
					local329.anInt6461 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt818;
					local329.anInt6463 = local333;
				} else {
					local215 = false;
					if (local329.aClass2_Sub23_Sub2_3 == null) {
						local215 = true;
					} else {
						local329.anInt6461 -= 512;
						if (local329.anInt6461 <= 0) {
							Static130.aClass2_Sub23_Sub3_1.method6797(local329.aClass2_Sub23_Sub2_3);
							local215 = true;
							local329.aClass2_Sub23_Sub2_3 = null;
						}
					}
					if (local215) {
						local329.aBoolean546 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.aBoolean100;
						local329.aClass2_Sub4_Sub1_4 = null;
						local329.anInt6458 = local436;
						local329.anInt6463 = local333;
						local329.aClass2_Sub17_3 = null;
						local329.anInt6461 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt818;
					}
				}
			}
			local329.anInt6462 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt10229;
			local329.anInt6454 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt10229 + (local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.method2046() << 8);
			local329.anInt6467 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt10228;
			local329.anInt6465 = local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt10228 + (local329.aClass4_Sub2_Sub1_Sub2_Sub1_3.method2046() << 8);
			Static17.method247(arg3, arg2, arg1, arg0, local329);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJIIIIILclient!oh;Lclient!aa;)V")
	public static void method50(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class273 arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(13) int local13 = arg3 * arg3 + arg4 * arg4;
		if ((long) local13 > arg0) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg6.anInt7402 / 2, arg6.anInt7385 / 2);
		if (local34 * local34 >= local13) {
			Static433.method8699(arg7, arg1, arg2, arg6, arg4, Static71.aClass43Array12[arg5], arg3);
			return;
		}
		local34 -= 10;
		@Pc(56) int local56;
		if (Static60.anInt1040 == 4) {
			local56 = (int) Static213.aFloat46 & 0x3FFF;
		} else {
			local56 = (int) Static213.aFloat46 + Static91.anInt1623 & 0x3FFF;
		}
		@Pc(70) int local70 = Class145_Sub1.anIntArray761[local56];
		@Pc(74) int local74 = Class145_Sub1.anIntArray760[local56];
		if (Static60.anInt1040 != 4) {
			local74 = local74 * 256 / (Static505.anInt8017 + 256);
			local70 = local70 * 256 / (Static505.anInt8017 + 256);
		}
		@Pc(103) int local103 = arg4 * local74 + local70 * arg3 >> 14;
		@Pc(114) int local114 = arg3 * local74 - arg4 * local70 >> 14;
		@Pc(120) double local120 = Math.atan2((double) local103, (double) local114);
		@Pc(127) int local127 = (int) ((double) local34 * Math.sin(local120));
		@Pc(134) int local134 = (int) (Math.cos(local120) * (double) local34);
		Static643.aClass43Array19[arg5].method9604((float) arg6.anInt7402 / 2.0F + (float) arg1 + (float) local127, (float) -local134 + (float) arg2 + (float) arg6.anInt7385 / 2.0F, 4096, (int) (-local120 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!et;B)V")
	public static void method51(@OriginalArg(0) Class2_Sub20 arg0) {
		if (arg0.aByteArray111.length - arg0.anInt9723 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method8581(-17416);
		if (local20 < 0 || local20 > 1 || arg0.aByteArray111.length - arg0.anInt9723 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method8575();
		if (arg0.aByteArray111.length - arg0.anInt9723 < local48 * 6) {
			return;
		}
		for (@Pc(63) int local63 = 0; local63 < local48; local63++) {
			@Pc(71) int local71 = arg0.method8575();
			@Pc(77) int local77 = arg0.method8555(-9372);
			if (local71 < Static41.anIntArray266.length && Static317.aBooleanArray27[local71] && (Static452.aClass362_1.method8628(local71).aChar4 != '1' || local77 >= -1 && local77 <= 1)) {
				Static41.anIntArray266[local71] = local77;
			}
		}
		if (10 != 10) {
			aClass43Array1 = null;
		}
	}
}

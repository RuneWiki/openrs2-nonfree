import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!pfa", name = "K", descriptor = "Lclient!ip;")
	public static final Class165 aClass165_3 = new Class165();

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)V")
	public static void method6551() {
		Static233.aClass3_Sub7_Sub19_17 = new Class3_Sub7_Sub19(Static369.aClass235_6.method5893(Static455.anInt7738), "", Static80.anInt1600, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)Lclient!kaa;")
	public static Class3_Sub27 method6552() {
		return Static505.anInt8527 == 0 ? new Class3_Sub27() : Static628.aClass3_Sub27Array1[--Static505.anInt8527];
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!ni;)V")
	public static void method6553(@OriginalArg(1) Class9_Sub2_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt10221 == Static304.anInt8391 || arg0.anInt10193 == -1 || arg0.anInt10219 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class267 local29 = Static474.aClass264_2.method6574(arg0.anInt10193);
			if (local29.aBoolean543 || local29.anIntArray456[arg0.anInt10189] < arg0.anInt10192 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt10221 - arg0.anInt10171;
			@Pc(64) int local64 = Static304.anInt8391 - arg0.anInt10171;
			@Pc(76) int local76 = arg0.anInt10190 * 512 + arg0.method8619() * 256;
			@Pc(87) int local87 = arg0.anInt10199 * 512 + arg0.method8619() * 256;
			@Pc(99) int local99 = arg0.anInt10222 * 512 + arg0.method8619() * 256;
			@Pc(110) int local110 = arg0.anInt10183 * 512 + arg0.method8619() * 256;
			arg0.anInt10152 = (local76 * (local58 - local64) + local99 * local64) / local58;
			arg0.anInt10158 = ((local58 - local64) * local87 + local64 * local110) / local58;
		}
		arg0.anInt10235 = 0;
		if (arg0.anInt10168 == 0) {
			arg0.method8621(false, 8192);
		}
		if (arg0.anInt10168 == 1) {
			arg0.method8621(false, 12288);
		}
		if (arg0.anInt10168 == 2) {
			arg0.method8621(false, 0);
		}
		if (arg0.anInt10168 == 3) {
			arg0.method8621(false, 4096);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "(I)V")
	public static void method6554() {
		Static541.aClass216_65 = new Class216();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lclient!ha;Lclient!jo;Lclient!to;B)V")
	public static void method6555(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class3_Sub47 arg2) {
		@Pc(10) Class103 local10 = arg1.method4537(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method7445();
		if (local10.method7440() > local16) {
			local16 = local10.method7440();
		}
		@Pc(28) int local28 = arg2.anInt9166;
		@Pc(31) int local31 = arg2.anInt9167;
		@Pc(33) int local33 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(79) int local79;
		if (arg1.aString42 != null) {
			local33 = Static323.aClass93_7.method2311(arg1.aString42, Static282.aStringArray42, (Class103[]) null, (int[]) null);
			for (local56 = 0; local56 < local33; local56++) {
				@Pc(62) String local62 = Static282.aStringArray42[local56];
				if (local56 < local33 - 1) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local79 = Static642.aClass61_8.method1411(local62);
				if (local40 < local79) {
					local40 = local79;
				}
			}
			local42 = local33 * Static642.aClass61_8.method1409() + Static642.aClass61_8.method1410() / 2;
		}
		local56 = local16 / 2 + arg2.anInt9166;
		@Pc(116) int local116 = arg2.anInt9167;
		if (local28 < Static598.anInt2999 + local16) {
			local56 = Static598.anInt2999 + local16 / 2 + local40 / 2 + 10 + 5;
			local28 = Static598.anInt2999;
		} else if (Static598.anInt2996 - local16 < local28) {
			local56 = Static598.anInt2996 - local16 / 2 - local40 / 2 - 5 - 10;
			local28 = Static598.anInt2996 - local16;
		}
		if (Static598.anInt3000 + local16 > local31) {
			local31 = Static598.anInt3000;
			local116 = local16 / 2 + Static598.anInt3000 + 10;
		} else if (local31 > Static598.anInt2991 - local16) {
			local116 = Static598.anInt2991 - local42 - local16 / 2 - 10;
			local31 = Static598.anInt2991 - local16;
		}
		local79 = (int) (Math.atan2((double) (local28 - arg2.anInt9166), (double) (local31 - arg2.anInt9167)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7450((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local79);
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		if (arg1.aString42 != null) {
			local257 = local56 - local40 / 2 - 5;
			local259 = local116;
			local261 = local257 + local40 + 10;
			local263 = local116 + local33 * Static642.aClass61_8.method1409() + 3;
			if (arg1.anInt5328 != 0) {
				arg0.method6134(local257, local263 - local116, -local257 + local261, arg1.anInt5328, local116);
			}
			if (arg1.anInt5321 != 0) {
				arg0.method6137(local263 - local116, local257, local261 - local257, local116, arg1.anInt5321);
			}
			for (@Pc(329) int local329 = 0; local329 < local33; local329++) {
				@Pc(335) String local335 = Static282.aStringArray42[local329];
				if (local33 - 1 > local329) {
					local335 = local335.substring(0, local335.length() - 4);
				}
				Static642.aClass61_8.method1407(arg0, local335, local56, local116, arg1.anInt5335);
				local116 += Static642.aClass61_8.method1409();
			}
		}
		if (arg1.anInt5340 == -1 && arg1.aString42 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(382) Class3_Sub49 local382 = new Class3_Sub49(arg2);
		local382.anInt9420 = local16 + local28;
		local382.anInt9428 = local31 - local16;
		local382.anInt9429 = local259;
		local382.anInt9432 = local263;
		local382.anInt9422 = local28 - local16;
		local382.anInt9424 = local261;
		local382.anInt9437 = local31 + local16;
		local382.anInt9427 = local257;
		Static181.aClass216_30.method5449(local382);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method6560(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static369.aClass235_36.method5893(Static455.anInt7738) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static369.aClass235_38.method5893(Static455.anInt7738) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}
}

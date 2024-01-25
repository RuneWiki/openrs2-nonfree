import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Lclient!rd;")
	public static Class263 aClass263_5;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "Z")
	public static final boolean aBoolean390 = false;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!gg;Lclient!rea;II)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub3_Sub3_Sub2 arg1, @OriginalArg(2) Class14_Sub21_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) byte local7 = -1;
		if ((arg0 & 0x4000) != 0) {
			local7 = arg2.method7736();
		}
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(53) int local53;
		@Pc(72) boolean local72;
		if ((arg0 & 0x40000) != 0) {
			local26 = arg2.method7712();
			local30 = arg2.method7689();
			if (local26 == 65535) {
				local26 = -1;
			}
			local43 = arg2.method7695(arg3 ^ 0x64);
			local47 = local43 & 0x7;
			local53 = local43 >> 3 & 0xF;
			if (local53 == 15) {
				local53 = -1;
			}
			local72 = (local43 >> 7 & 0x1) == 1;
			arg1.method2863(local30, local72, 2, local26, local47, local53);
		}
		if ((arg0 & 0x20000) != 0) {
			arg1.aBoolean246 = arg2.method7738(1275460792) == 1;
		}
		if ((arg0 & 0x40) != 0) {
			local26 = arg2.method7708();
			if (local26 == 65535) {
				local26 = -1;
			}
			arg1.anInt3256 = local26;
		}
		if ((arg0 & 0x8) != 0) {
			local26 = arg2.method7717(-1978450544);
			local30 = arg2.method7726();
			if (local26 == 65535) {
				local26 = -1;
			}
			local43 = arg2.method7738(1275460792);
			local47 = local43 & 0x7;
			local53 = local43 >> 3 & 0xF;
			if (local53 == 15) {
				local53 = -1;
			}
			local72 = (local43 >> 7 & 0x1) == 1;
			arg1.method2863(local30, local72, 0, local26, local47, local53);
		}
		@Pc(192) int[] local192;
		@Pc(195) int[] local195;
		@Pc(222) int local222;
		if ((arg0 & 0x100000) != 0) {
			local26 = arg2.method7749(arg3 ^ 0xFFFFBEE3);
			local192 = new int[local26];
			local195 = new int[local26];
			for (local47 = 0; local47 < local26; local47++) {
				local53 = arg2.method7754();
				if ((local53 & 0xC000) == 49152) {
					local222 = arg2.method7708();
					local192[local47] = local53 << 16 | local222;
				} else {
					local192[local47] = local53;
				}
				local195[local47] = arg2.method7754();
			}
			arg1.method2871(local192, local195);
		}
		if ((arg0 & 0x10000) != 0) {
			local26 = arg2.method7712();
			if (local26 == 65535) {
				local26 = -1;
			}
			local30 = arg2.method7731();
			local43 = arg2.method7749(-16669);
			local47 = local43 & 0x7;
			local53 = local43 >> 3 & 0xF;
			if (local53 == 15) {
				local53 = -1;
			}
			local72 = (local43 >> 7 & 0x1) == 1;
			arg1.method2863(local30, local72, 3, local26, local47, local53);
		}
		if ((arg0 & 0x2) != 0) {
			arg1.anInt3322 = arg2.method7708();
			if (arg1.anInt3298 == 0) {
				arg1.method2881(arg1.anInt3322);
				arg1.anInt3322 = -1;
			}
		}
		if ((arg0 & 0x1) != 0) {
			local26 = arg2.method7738(1275460792);
			if (local26 > 0) {
				for (local30 = 0; local30 < local26; local30++) {
					local47 = -1;
					local53 = -1;
					local43 = arg2.method7728(-129);
					local222 = -1;
					if (local43 == 32767) {
						local43 = arg2.method7728(arg3 ^ 0xFFFFFF7F);
						local53 = arg2.method7728(-129);
						local47 = arg2.method7728(-129);
						local222 = arg2.method7728(-129);
					} else if (local43 == 32766) {
						local43 = -1;
					} else {
						local53 = arg2.method7728(arg3 ^ 0xFFFFFF7F);
					}
					@Pc(415) int local415 = arg2.method7728(-129);
					@Pc(419) int local419 = arg2.method7695(117);
					arg1.method2880(local419, local415, local47, local222, Static530.anInt9105, local43, local53);
				}
			}
		}
		if ((arg0 & 0x200) != 0) {
			local26 = arg2.method7717(arg3 ^ 0x8A133D90);
			local30 = arg2.method7748();
			if (local26 == 65535) {
				local26 = -1;
			}
			local43 = arg2.method7695(108);
			local47 = local43 & 0x7;
			local53 = local43 >> 3 & 0xF;
			if (local53 == 15) {
				local53 = -1;
			}
			local72 = (local43 >> 7 & 0x1) == 1;
			arg1.method2863(local30, local72, 1, local26, local47, local53);
		}
		if ((arg0 & 0x8000) != 0) {
			arg1.aBoolean242 = arg2.method7695(120) == 1;
		}
		if ((arg0 & 0x4) != 0) {
			@Pc(530) int[] local530 = new int[4];
			for (local30 = 0; local30 < 4; local30++) {
				local530[local30] = arg2.method7717(-1978450544);
				if (local530[local30] == 65535) {
					local530[local30] = -1;
				}
			}
			local43 = arg2.method7714();
			Static167.method2423(local530, arg1, local43, false);
		}
		if (arg3 != (arg0 & 0x20)) {
			local26 = arg2.method7749(-16669);
			@Pc(585) byte[] local585 = new byte[local26];
			@Pc(590) Class14_Sub21 local590 = new Class14_Sub21(local585);
			arg2.method7718(local585, local26);
			Static260.aClass14_Sub21Array1[arg4] = local590;
			arg1.method2885(local590, arg3);
		}
		if ((arg0 & 0x80000) != 0) {
			arg1.aByte74 = arg2.method7720();
			arg1.aByte73 = arg2.method7734();
			arg1.aByte72 = arg2.method7720();
			arg1.aByte75 = (byte) arg2.method7749(arg3 ^ 0xFFFFBEE3);
			arg1.anInt3288 = Static530.anInt9105 + arg2.method7717(-1978450544);
			arg1.anInt3284 = Static530.anInt9105 + arg2.method7708();
		}
		if ((arg0 & 0x100) != 0) {
			arg1.anInt3292 = arg2.method7688();
			arg1.anInt3294 = arg2.method7720();
			arg1.anInt3293 = arg2.method7736();
			arg1.anInt3291 = arg2.method7734();
			arg1.anInt3287 = arg2.method7712() + Static530.anInt9105;
			arg1.anInt3286 = arg2.method7712() + Static530.anInt9105;
			arg1.anInt3290 = arg2.method7738(arg3 ^ 0x4C05FCB8);
			arg1.anInt3297 = 0;
			if (arg1.aBoolean241) {
				arg1.anInt3291 += arg1.anInt3313;
				arg1.anInt3294 += arg1.anInt3313;
				arg1.anInt3292 += arg1.anInt3319;
				arg1.anInt3298 = 0;
				arg1.anInt3293 += arg1.anInt3319;
			} else {
				arg1.anInt3294 += arg1.anIntArray201[0];
				arg1.anInt3293 += arg1.anIntArray200[0];
				arg1.anInt3292 += arg1.anIntArray200[0];
				arg1.anInt3291 += arg1.anIntArray201[0];
				arg1.anInt3298 = 1;
			}
		}
		if ((arg0 & 0x400) != 0) {
			local26 = arg2.method7754();
			arg1.anInt3252 = arg2.method7695(121);
			arg1.anInt3264 = arg2.method7695(arg3 + 96);
			arg1.anInt3274 = local26 & 0x7FFF;
			arg1.aBoolean237 = (local26 & 0x8000) != 0;
			arg1.anInt3271 = arg1.anInt3252 + Static530.anInt9105 + arg1.anInt3274;
		}
		if ((arg0 & 0x80) != 0) {
			Static98.aByteArray25[arg4] = arg2.method7736();
		}
		if ((arg0 & 0x1000) != 0) {
			@Pc(848) String local848 = arg2.method7703(arg3);
			if (local848.charAt(0) == '~') {
				local848 = local848.substring(1);
				Static187.method2752(local848, 0, arg1.aString38, arg1.method2887(), 2, arg1.method2888());
			} else if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == arg1) {
				Static187.method2752(local848, 0, arg1.aString38, arg1.method2887(), 2, arg1.method2888());
			}
			arg1.method2898(0, local848, 0);
		}
		if ((arg0 & 0x2000) != 0) {
			local26 = arg2.method7695(127);
			local192 = new int[local26];
			local195 = new int[local26];
			@Pc(921) int[] local921 = new int[local26];
			for (local53 = 0; local53 < local26; local53++) {
				local222 = arg2.method7717(-1978450544);
				if (local222 == 65535) {
					local222 = -1;
				}
				local192[local53] = local222;
				local195[local53] = arg2.method7749(-16669);
				local921[local53] = arg2.method7754();
			}
			Static166.method2390(local195, arg1, local192, local921);
		}
		if (!arg1.aBoolean241) {
			return;
		}
		if (local7 == 127) {
			arg1.method2897(arg1.anInt3319, arg1.anInt3313);
			return;
		}
		@Pc(993) byte local993;
		if (local7 == -1) {
			local993 = Static98.aByteArray25[arg4];
		} else {
			local993 = local7;
		}
		Static633.method9092(local993, arg1);
		arg1.method2886(local993, arg1.anInt3313, arg1.anInt3319);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lclient!dv;")
	public static Class89 method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static63.aClass89ArrayArrayArray1[0][arg1][arg2] != null && Static63.aClass89ArrayArrayArray1[0][arg1][arg2].aClass89_1 != null;
			if (local33 && arg0 >= Static59.anInt987 - 1) {
				return null;
			}
			Static154.method2232(arg0, arg1, arg2);
		}
		return Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)Lclient!cg;")
	public static Class59 method4812(@OriginalArg(0) int arg0) {
		@Pc(8) Class59[] local8 = Static71.method1142();
		for (@Pc(17) int local17 = 0; local17 < local8.length; local17++) {
			@Pc(23) Class59 local23 = local8[local17];
			if (local23.anInt1121 == arg0) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public static void method4813(@OriginalArg(1) int arg0) {
		Static70.anInt1087 = 3;
		Static474.anInt8161 = arg0;
		Static417.anInt7161 = -1;
		Static349.anInt5983 = 100;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!qa;")
	public static Class207 method4814(@OriginalArg(0) Component arg0) {
		return new Class207_Sub1(arg0);
	}
}

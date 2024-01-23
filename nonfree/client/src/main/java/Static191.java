import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
	public static int[] anIntArray45 = new int[14];

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[F")
	public static float[] aFloatArray3 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public static int anInt706 = -1;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString41 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!th;III)V")
	public static void method626(@OriginalArg(0) Class36_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x1) != 0) {
			arg0.anInt5117 = Static250.aClass2_Sub26_Sub1_2.method4257();
			arg0.anInt5098 = Static250.aClass2_Sub26_Sub1_2.method4215();
		}
		@Pc(30) int local30;
		@Pc(34) int local34;
		if ((arg2 & 0x400) != 0) {
			local30 = Static250.aClass2_Sub26_Sub1_2.method4217();
			local34 = Static250.aClass2_Sub26_Sub1_2.method4247();
			arg0.method4096(local34, local30, Static148.anInt3168);
		}
		@Pc(144) int local144;
		if ((arg2 & 0x100) != 0) {
			local30 = Static250.aClass2_Sub26_Sub1_2.method4236();
			if (local30 == 65535) {
				local30 = -1;
			}
			@Pc(60) boolean local60 = true;
			local34 = Static250.aClass2_Sub26_Sub1_2.method4214();
			if (local30 != -1 && arg0.anInt5125 != -1 && Static35.method706(Static208.method3532(local30).anInt5405).anInt413 < Static35.method706(Static208.method3532(arg0.anInt5125).anInt5405).anInt413) {
				local60 = false;
			}
			if (local60) {
				arg0.anInt5142 = 1;
				arg0.anInt5133 = local34 >> 16;
				arg0.anInt5076 = 0;
				arg0.anInt5112 = Static148.anInt3168 + (local34 & 0xFFFF);
				arg0.anInt5129 = 0;
				arg0.anInt5125 = local30;
				if (Static148.anInt3168 < arg0.anInt5112) {
					arg0.anInt5129 = -1;
				}
				if (arg0.anInt5125 != -1 && Static148.anInt3168 == arg0.anInt5112) {
					local144 = Static208.method3532(arg0.anInt5125).anInt5405;
					if (local144 != -1) {
						@Pc(153) Class15 local153 = Static35.method706(local144);
						if (local153 != null && local153.anIntArray26 != null) {
							Static225.method3777(0, Static111.aClass36_Sub3_Sub2_1 == arg0, arg0.anInt5109, local153, arg0.anInt5093);
						}
					}
				}
			}
		}
		if ((arg2 & 0x20) != 0) {
			arg0.anInt5061 = Static250.aClass2_Sub26_Sub1_2.method4257();
			if (arg0.anInt5061 == 65535) {
				arg0.anInt5061 = -1;
			}
		}
		if ((arg2 & 0x80) != 0) {
			local30 = Static250.aClass2_Sub26_Sub1_2.method4257();
			local34 = Static250.aClass2_Sub26_Sub1_2.method4261();
			@Pc(210) int local210 = Static250.aClass2_Sub26_Sub1_2.method4247();
			local144 = Static250.aClass2_Sub26_Sub1_2.anInt5328;
			@Pc(222) boolean local222 = (local30 & 0x8000) != 0;
			if (arg0.aString249 != null && arg0.aClass126_2 != null) {
				@Pc(236) long local236 = Static61.method2447(arg0.aString249);
				@Pc(238) boolean local238 = false;
				if (local34 <= 1) {
					if (!local222 && (Static104.aBoolean180 && !Static166.aBoolean281 || Static196.aBoolean342)) {
						local238 = true;
					} else {
						for (@Pc(255) int local255 = 0; local255 < Static11.anInt296; local255++) {
							if (local236 == Static281.aLongArray23[local255]) {
								local238 = true;
								break;
							}
						}
					}
				}
				if (!local238 && Static293.anInt6087 == 0) {
					Static88.aClass2_Sub26_10.anInt5328 = 0;
					@Pc(289) int local289 = -1;
					Static250.aClass2_Sub26_Sub1_2.method4243(local210, Static88.aClass2_Sub26_10.aByteArray72);
					Static88.aClass2_Sub26_10.anInt5328 = 0;
					@Pc(314) String local314;
					if (local222) {
						@Pc(305) Class59 local305 = Static58.method1127(Static88.aClass2_Sub26_10);
						local289 = local305.anInt1646;
						local314 = local305.aClass2_Sub3_Sub22_1.method4626(Static88.aClass2_Sub26_10);
						local30 &= 0x7FFF;
					} else {
						local314 = Static178.method3305(Static32.method641(Static158.method2715(Static88.aClass2_Sub26_10)));
					}
					arg0.aString248 = local314.trim();
					arg0.anInt5139 = local30 >> 8;
					arg0.anInt5148 = local30 & 0xFF;
					arg0.anInt5066 = 150;
					if (local34 == 2) {
						Static27.method518(local314, local289, local222 ? 17 : 1, null, "<img=1>" + arg0.method4114());
					} else if (local34 == 1) {
						Static27.method518(local314, local289, local222 ? 17 : 1, null, "<img=0>" + arg0.method4114());
					} else {
						Static27.method518(local314, local289, local222 ? 17 : 2, null, arg0.method4114());
					}
				}
			}
			Static250.aClass2_Sub26_Sub1_2.anInt5328 = local144 + local210;
		}
		if ((arg2 & 0x800) != 0) {
			local30 = Static250.aClass2_Sub26_Sub1_2.method4247();
			@Pc(427) int[] local427 = new int[local30];
			@Pc(430) int[] local430 = new int[local30];
			@Pc(433) int[] local433 = new int[local30];
			for (@Pc(435) int local435 = 0; local435 < local30; local435++) {
				@Pc(446) int local446 = Static250.aClass2_Sub26_Sub1_2.method4257();
				if (local446 == 65535) {
					local446 = -1;
				}
				local433[local435] = local446;
				local427[local435] = Static250.aClass2_Sub26_Sub1_2.method4233();
				local430[local435] = Static250.aClass2_Sub26_Sub1_2.method4215();
			}
			Static283.method4715(local433, arg0, local427, local430);
		}
		if ((arg2 & 0x2) != 0) {
			local30 = Static250.aClass2_Sub26_Sub1_2.method4215();
			if (local30 == 65535) {
				local30 = -1;
			}
			local34 = Static250.aClass2_Sub26_Sub1_2.method4274();
			Static33.method649(local30, local34, arg0);
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt5144 = Static250.aClass2_Sub26_Sub1_2.method4233();
			arg0.anInt5104 = Static250.aClass2_Sub26_Sub1_2.method4261();
			arg0.anInt5073 = Static250.aClass2_Sub26_Sub1_2.method4247();
			arg0.anInt5124 = Static250.aClass2_Sub26_Sub1_2.method4247();
			arg0.anInt5121 = Static250.aClass2_Sub26_Sub1_2.method4236() + Static148.anInt3168;
			arg0.anInt5123 = Static250.aClass2_Sub26_Sub1_2.method4242() + Static148.anInt3168;
			arg0.anInt5130 = Static250.aClass2_Sub26_Sub1_2.method4261();
			arg0.anInt5077 = 0;
			arg0.anInt5096 = 1;
		}
		if ((arg2 & 0x4) != 0) {
			local30 = Static250.aClass2_Sub26_Sub1_2.method4217();
			local34 = Static250.aClass2_Sub26_Sub1_2.method4247();
			arg0.method4096(local34, local30, Static148.anInt3168);
			arg0.anInt5065 = Static148.anInt3168 + 300;
			arg0.anInt5135 = Static250.aClass2_Sub26_Sub1_2.method4247();
		}
		if ((arg2 & 0x10) != 0) {
			arg0.aString248 = Static250.aClass2_Sub26_Sub1_2.method4265();
			if (arg0.aString248.charAt(0) == '~') {
				arg0.aString248 = arg0.aString248.substring(1);
				Static173.method2979(arg0.method4114(), arg0.aString248, 2);
			} else if (Static111.aClass36_Sub3_Sub2_1 == arg0) {
				Static173.method2979(arg0.method4114(), arg0.aString248, 2);
			}
			arg0.anInt5066 = 150;
			arg0.anInt5139 = 0;
			arg0.anInt5148 = 0;
		}
		if ((arg2 & 0x8) == 0) {
			return;
		}
		local30 = Static250.aClass2_Sub26_Sub1_2.method4274();
		@Pc(666) byte[] local666 = new byte[local30];
		@Pc(671) Class2_Sub26 local671 = new Class2_Sub26(local666);
		Static250.aClass2_Sub26_Sub1_2.method4243(local30, local666);
		Static294.aClass2_Sub26Array1[arg1] = local671;
		arg0.method4109(local671);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method628(@OriginalArg(0) String arg0) {
		if (Static37.aClass113_1 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(25) int local25 = 0; local25 < Static37.aClass113_1.anInt3429; local25++) {
			if (Static62.method1200(Static37.aClass113_1.aStringArray15[local25], " ", "<br>").equals(arg0)) {
				return local25;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!mn;)Z")
	public static boolean method629(@OriginalArg(1) Class115 arg0) {
		if (arg0.anInt3544 == 205) {
			Static161.anInt3399 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	public static void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static101.anInt6027 == 2) {
			Static210.anInt4376 = arg1;
			Static265.anInt5500 = arg0;
		}
		Static198.aFloat41 = arg1;
		Static142.aFloat31 = arg0;
		Static189.method3194();
		Static230.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method631() {
		if (Static96.aClass147ArrayArray1 == null) {
			return;
		}
		@Pc(17) Class147 local17 = new Class147();
		for (@Pc(19) int local19 = 0; local19 < 13; local19++) {
			for (@Pc(24) int local24 = 0; local24 < 13; local24++) {
				Static96.aClass147ArrayArray1[local19][local24] = local17;
			}
		}
	}
}

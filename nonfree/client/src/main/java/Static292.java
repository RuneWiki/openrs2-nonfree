import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "[Lclient!cn;")
	public static Class34[] aClass34Array3;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "Lclient!mn;")
	public static Class115 aClass115_17;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "[J")
	public static long[] aLongArray24 = new long[100];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZII)I")
	public static int method4848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZC)I")
	public static int method4849(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(14) int local14 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local14 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local14 = 1762;
		}
		return local14;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	public static void method4850() {
		for (@Pc(7) int local7 = 0; local7 < Static102.anInt2234; local7++) {
			@Pc(14) int local14 = Static161.anIntArray256[local7];
			@Pc(18) Class36_Sub3_Sub1 local18 = Static201.aClass36_Sub3_Sub1Array1[local14];
			@Pc(22) int local22 = Static250.aClass2_Sub26_Sub1_2.method4261();
			if ((local22 & 0x20) != 0) {
				local22 += Static250.aClass2_Sub26_Sub1_2.method4261() << 8;
			}
			@Pc(46) int local46;
			@Pc(50) int local50;
			if ((local22 & 0x40) != 0) {
				local46 = Static250.aClass2_Sub26_Sub1_2.method4261();
				local50 = Static250.aClass2_Sub26_Sub1_2.method4247();
				local18.method4096(local50, local46, Static148.anInt3168);
			}
			if ((local22 & 0x1) != 0) {
				if (local18.aClass33_1.method722()) {
					Static17.method355(local18);
				}
				local18.method2418(Static112.method2081(Static250.aClass2_Sub26_Sub1_2.method4257()));
				local18.method4098(local18.aClass33_1.anInt888);
				local18.anInt5132 = local18.aClass33_1.anInt853;
				local18.anInt5140 = local18.aClass33_1.anInt864;
				if (local18.aClass33_1.method722()) {
					Static185.method3168(local18, local18.anIntArray465[0], null, 0, Static208.anInt4335, null, local18.anIntArray468[0]);
				}
			}
			if ((local22 & 0x10) != 0) {
				local46 = Static250.aClass2_Sub26_Sub1_2.method4242();
				local50 = Static250.aClass2_Sub26_Sub1_2.method4227();
				@Pc(129) boolean local129 = true;
				if (local46 == 65535) {
					local46 = -1;
				}
				if (local46 != -1 && local18.anInt5125 != -1 && Static35.method706(Static208.method3532(local46).anInt5405).anInt413 < Static35.method706(Static208.method3532(local18.anInt5125).anInt5405).anInt413) {
					local129 = false;
				}
				if (local129) {
					local18.anInt5129 = 0;
					local18.anInt5142 = 1;
					local18.anInt5112 = Static148.anInt3168 + (local50 & 0xFFFF);
					local18.anInt5076 = 0;
					local18.anInt5125 = local46;
					if (Static148.anInt3168 < local18.anInt5112) {
						local18.anInt5129 = -1;
					}
					local18.anInt5133 = local50 >> 16;
					if (local18.anInt5125 != -1 && local18.anInt5112 == Static148.anInt3168) {
						@Pc(213) int local213 = Static208.method3532(local18.anInt5125).anInt5405;
						if (local213 != -1) {
							@Pc(223) Class15 local223 = Static35.method706(local213);
							if (local223 != null && local223.anIntArray26 != null) {
								Static225.method3777(0, false, local18.anInt5109, local223, local18.anInt5093);
							}
						}
					}
				}
			}
			if ((local22 & 0x4) != 0) {
				local46 = Static250.aClass2_Sub26_Sub1_2.method4247();
				local50 = Static250.aClass2_Sub26_Sub1_2.method4274();
				local18.method4096(local50, local46, Static148.anInt3168);
				local18.anInt5065 = Static148.anInt3168 + 300;
				local18.anInt5135 = Static250.aClass2_Sub26_Sub1_2.method4274();
			}
			if ((local22 & 0x200) != 0) {
				local46 = Static250.aClass2_Sub26_Sub1_2.method4247();
				@Pc(281) int[] local281 = new int[local46];
				@Pc(284) int[] local284 = new int[local46];
				@Pc(287) int[] local287 = new int[local46];
				for (@Pc(289) int local289 = 0; local289 < local46; local289++) {
					@Pc(296) int local296 = Static250.aClass2_Sub26_Sub1_2.method4242();
					if (local296 == 65535) {
						local296 = -1;
					}
					local281[local289] = local296;
					local284[local289] = Static250.aClass2_Sub26_Sub1_2.method4233();
					local287[local289] = Static250.aClass2_Sub26_Sub1_2.method4242();
				}
				Static215.method3632(local284, local281, local287, local18);
			}
			if ((local22 & 0x8) != 0) {
				local18.aString248 = Static250.aClass2_Sub26_Sub1_2.method4265();
				local18.anInt5066 = 100;
			}
			if ((local22 & 0x2) != 0) {
				local46 = Static250.aClass2_Sub26_Sub1_2.method4236();
				local50 = Static250.aClass2_Sub26_Sub1_2.method4274();
				if (local46 == 65535) {
					local46 = -1;
				}
				Static83.method1597(local18, local50, local46);
			}
			if ((local22 & 0x100) != 0) {
				local18.anInt5117 = Static250.aClass2_Sub26_Sub1_2.method4236();
				local18.anInt5098 = Static250.aClass2_Sub26_Sub1_2.method4242();
			}
			if ((local22 & 0x80) != 0) {
				local18.anInt5061 = Static250.aClass2_Sub26_Sub1_2.method4242();
				if (local18.anInt5061 == 65535) {
					local18.anInt5061 = -1;
				}
			}
		}
	}
}

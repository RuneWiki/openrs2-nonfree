import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "[Lclient!vn;")
	public static Class8_Sub3[] aClass8_Sub3Array3;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
	public static int anInt4896;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!ub;")
	public static Class244 aClass244_27 = new Class244();

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	public static int anInt4895 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3882(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static112.method1664(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static284.anInt4659; local29++) {
			@Pc(35) String local35 = Static322.aStringArray36[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static112.method1664(local35);
			if (local35 != null && local35.equals(local20)) {
				Static284.anInt4659--;
				for (@Pc(59) int local59 = local29; local59 < Static284.anInt4659; local59++) {
					Static322.aStringArray36[local59] = Static322.aStringArray36[local59 + 1];
					Static161.aStringArray27[local59] = Static161.aStringArray27[local59 + 1];
					Static63.anIntArray454[local59] = Static63.anIntArray454[local59 + 1];
					Static114.aStringArray21[local59] = Static114.aStringArray21[local59 + 1];
					Static135.anIntArray205[local59] = Static135.anIntArray205[local59 + 1];
					Static314.aBooleanArray24[local59] = Static314.aBooleanArray24[local59 + 1];
				}
				Static357.anInt5911 = Static79.anInt1568;
				Static448.method5935(Static372.aClass146_86);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg0));
				Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method3885(@OriginalArg(0) String arg0) {
		@Pc(15) long local15 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local15 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local15 += local30 - 64;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local15 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local15 += local30 + 27 - 48;
			}
			if (local15 >= 177917621779460413L) {
				break;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method3886() {
		for (@Pc(3) int local3 = 0; local3 < Static119.anInt5695; local3++) {
			@Pc(9) int local9 = Static351.anIntArray459[local3];
			@Pc(13) Class8_Sub3_Sub1_Sub2 local13 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = Static56.aClass4_Sub9_Sub2_1.method5007();
			if ((local17 & 0x20) != 0) {
				local17 += Static56.aClass4_Sub9_Sub2_1.method5007() << 8;
			}
			if ((local17 & 0x100) != 0) {
				local13.aByte101 = Static56.aClass4_Sub9_Sub2_1.method5011();
				local13.aByte102 = Static56.aClass4_Sub9_Sub2_1.method5026();
				local13.aByte100 = Static56.aClass4_Sub9_Sub2_1.method5063();
				local13.aByte103 = (byte) Static56.aClass4_Sub9_Sub2_1.method5012();
				local13.anInt7422 = Static265.anInt4371 + Static56.aClass4_Sub9_Sub2_1.method5028();
				local13.anInt7372 = Static265.anInt4371 + Static56.aClass4_Sub9_Sub2_1.method5056();
			}
			@Pc(81) int local81;
			@Pc(85) int local85;
			if ((local17 & 0x8) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5033();
				local85 = Static56.aClass4_Sub9_Sub2_1.method5046();
				local13.method5895(local81, local85, Static265.anInt4371);
				local13.anInt7415 = Static265.anInt4371 + 300;
				local13.anInt7362 = Static56.aClass4_Sub9_Sub2_1.method5046();
			}
			if ((local17 & 0x400) != 0) {
				local13.anInt7431 = Static56.aClass4_Sub9_Sub2_1.method5042();
				local13.anInt7440 = Static56.aClass4_Sub9_Sub2_1.method5045();
			}
			@Pc(141) int local141;
			if ((local17 & 0x200) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5056();
				if (local81 == 65535) {
					local81 = -1;
				}
				local85 = Static56.aClass4_Sub9_Sub2_1.method5016();
				local141 = Static56.aClass4_Sub9_Sub2_1.method5013();
				local13.method5891(local85, local81, local141, true);
			}
			if ((local17 & 0x1000) != 0) {
				local13.anInt7350 = Static56.aClass4_Sub9_Sub2_1.method5011();
				local13.anInt7411 = Static56.aClass4_Sub9_Sub2_1.method5022();
				local13.anInt7413 = Static56.aClass4_Sub9_Sub2_1.method5022();
				local13.anInt7423 = Static56.aClass4_Sub9_Sub2_1.method5063();
				local13.anInt7351 = Static56.aClass4_Sub9_Sub2_1.method5042() + Static265.anInt4371;
				local13.anInt7349 = Static56.aClass4_Sub9_Sub2_1.method5028() + Static265.anInt4371;
				local13.anInt7368 = Static56.aClass4_Sub9_Sub2_1.method5012();
				local13.anInt7411 += local13.anIntArray559[0];
				local13.anInt7423 += local13.anIntArray559[0];
				local13.anInt7428 = 0;
				local13.anInt7427 = 1;
				local13.anInt7350 += local13.anIntArray560[0];
				local13.anInt7413 += local13.anIntArray560[0];
			}
			if ((local17 & 0x800) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5028();
				local13.anInt7396 = Static56.aClass4_Sub9_Sub2_1.method5007();
				local13.anInt7361 = Static56.aClass4_Sub9_Sub2_1.method5013();
				local13.anInt7356 = local81 & 0x7FFF;
				local13.aBoolean520 = (local81 & 0x8000) != 0;
				local13.anInt7379 = Static265.anInt4371 + local13.anInt7356 + local13.anInt7396;
			}
			if ((local17 & 0x10) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5045();
				if (local81 == 65535) {
					local81 = -1;
				}
				local85 = Static56.aClass4_Sub9_Sub2_1.method5013();
				Static109.method5014(local81, local85, local13);
			}
			if ((local17 & 0x80) != 0) {
				local13.aString74 = Static56.aClass4_Sub9_Sub2_1.method5038();
				local13.anInt7424 = 100;
			}
			if ((local17 & 0x40) != 0) {
				if (local13.aClass78_1.method1552()) {
					Static277.method3671(local13);
				}
				local13.method5907(Static120.aClass115_2.method2201(Static56.aClass4_Sub9_Sub2_1.method5028()));
				local13.method5901(local13.aClass78_1.anInt1885);
				local13.anInt7406 = local13.aClass78_1.anInt1884 << 3;
				if (local13.aClass78_1.method1552()) {
					Static353.method4676(null, local13.anIntArray559[0], 0, null, local13.anIntArray560[0], local13.aByte99, local13);
				}
			}
			if ((local17 & 0x2000) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5013();
				@Pc(380) int[] local380 = new int[local81];
				@Pc(383) int[] local383 = new int[local81];
				@Pc(386) int[] local386 = new int[local81];
				for (@Pc(388) int local388 = 0; local388 < local81; local388++) {
					@Pc(394) int local394 = Static56.aClass4_Sub9_Sub2_1.method5045();
					if (local394 == 65535) {
						local394 = -1;
					}
					local380[local388] = local394;
					local383[local388] = Static56.aClass4_Sub9_Sub2_1.method5007();
					local386[local388] = Static56.aClass4_Sub9_Sub2_1.method5042();
				}
				Static79.method1274(local13, local386, local380, local383);
			}
			if ((local17 & 0x2) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5045();
				if (local81 == 65535) {
					local81 = -1;
				}
				local85 = Static56.aClass4_Sub9_Sub2_1.method4998();
				local141 = Static56.aClass4_Sub9_Sub2_1.method5046();
				local13.method5891(local85, local81, local141, false);
			}
			if ((local17 & 0x4) != 0) {
				local81 = Static56.aClass4_Sub9_Sub2_1.method5033();
				local85 = Static56.aClass4_Sub9_Sub2_1.method5007();
				local13.method5895(local81, local85, Static265.anInt4371);
			}
			if ((local17 & 0x1) != 0) {
				local13.anInt7394 = Static56.aClass4_Sub9_Sub2_1.method5056();
				if (local13.anInt7394 == 65535) {
					local13.anInt7394 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Lclient!qd;")
	public static Class8_Sub2 method3888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub2_2;
	}
}

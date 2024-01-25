import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	public static int anInt9515;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public static int anInt9504 = 0;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!wa;")
	public static final Class346 aClass346_1 = Static89.method2079();

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
	public static boolean aBoolean671 = false;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt9511 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method7758() {
		while (true) {
			if (Static319.aClass4_Sub11_Sub1_2.method1533(Static186.anInt3680) >= 15) {
				@Pc(16) int local16 = Static319.aClass4_Sub11_Sub1_2.method1530(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class4_Sub4 local30 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local16);
					@Pc(36) Class1_Sub4_Sub2_Sub1_Sub1 local36;
					if (local30 == null) {
						local36 = new Class1_Sub4_Sub2_Sub1_Sub1();
						local36.anInt8435 = local16;
						local30 = new Class4_Sub4(local36);
						Static585.aClass350_41.method8199((long) local16, local30);
						Static457.aClass4_Sub4Array1[Static436.anInt8163++] = local30;
						local23 = true;
					}
					local36 = local30.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					Static43.anIntArray23[Static418.anInt7866++] = local16;
					local36.anInt8384 = Static106.anInt2418;
					if (local36.aClass283_1 != null && local36.aClass283_1.method6831()) {
						Static553.method8014(local36);
					}
					@Pc(90) int local90 = Static319.aClass4_Sub11_Sub1_2.method1530(1);
					if (local90 == 1) {
						Static452.anIntArray465[Static70.anInt1217++] = local16;
					}
					@Pc(106) int local106 = Static319.aClass4_Sub11_Sub1_2.method1530(2);
					@Pc(111) int local111 = Static319.aClass4_Sub11_Sub1_2.method1530(5);
					if (local111 > 15) {
						local111 -= 32;
					}
					@Pc(128) int local128 = Static319.aClass4_Sub11_Sub1_2.method1530(3) + 4 << 11 & 0x3E9F;
					@Pc(133) int local133 = Static319.aClass4_Sub11_Sub1_2.method1530(5);
					if (local133 > 15) {
						local133 -= 32;
					}
					@Pc(144) int local144 = Static319.aClass4_Sub11_Sub1_2.method1530(1);
					local36.method4510(Static237.aClass31_1.method478(Static319.aClass4_Sub11_Sub1_2.method1530(14)));
					local36.method6920(local36.aClass283_1.anInt8266);
					local36.anInt8394 = local36.aClass283_1.anInt8234 << 3;
					if (local23) {
						local36.method6934(true, local128);
					}
					local36.method4512(local36.method6925(), local111 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0], local133 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0], local144 == 1, local106);
					if (local36.aClass283_1.method6831()) {
						Static57.method963(local36.anIntArray463[0], 0, local36, local36.aByte126, local36.anIntArray462[0], null, null);
					}
					continue;
				}
			}
			Static319.aClass4_Sub11_Sub1_2.method1537();
			return;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
	public static String method7768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(25) int local25 = arg2[arg1 + local15] & 0xFF;
			if (local25 != 0) {
				if (local25 >= 128 && local25 < 160) {
					@Pc(44) char local44 = Static298.aCharArray4[local25 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local25 = local44;
				}
				local6[local8++] = (char) local25;
			}
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg0) {
			Static106.method2283(arg5, arg3, arg1, arg4, arg6, arg2);
		} else if (Static486.anInt8866 <= arg4 - arg6 && arg4 + arg6 <= Static214.anInt3975 && Static290.anInt5903 <= arg3 - arg0 && Static530.anInt9437 >= arg3 + arg0) {
			Static66.method1077(arg5, arg4, arg1, arg0, arg2, arg3, arg6);
		} else {
			Static495.method7351(arg5, arg1, arg2, arg0, arg4, arg3, arg6);
		}
	}
}

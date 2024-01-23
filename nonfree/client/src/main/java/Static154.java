import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!fl;")
	private static Class8_Sub10_Sub1 aClass8_Sub10_Sub1_1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	private static int anInt3128 = -1;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private static int anInt3129 = 0;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	private static int anInt3130 = -1;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	private static int anInt3131 = 0;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!wn;")
	private static Class182 aClass182_12 = new Class182();

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	private static int anInt3132 = -1;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Z")
	private static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Z")
	private static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
	private static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Z")
	private static boolean aBoolean261 = true;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	private static int anInt3133 = 0;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "Z")
	private static boolean aBoolean262 = true;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	private static int anInt3134 = -1;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "[I")
	private static int[] anIntArray247 = new int[2];

	@OriginalMember(owner = "client!m", name = "p", descriptor = "I")
	private static int anInt3135 = -1;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Z")
	private static boolean aBoolean263 = true;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!kg;)Z")
	private static boolean method2453(@OriginalArg(0) Class8_Sub10 arg0) {
		if (anInt3132 != -1) {
			if (arg0.method1333() || arg0.method1336()) {
				if (anInt3130 != -1 && anInt3128 != -1) {
					arg0.method1325(anInt3130, anInt3128);
				}
				arg0.aBoolean128 = true;
				aClass182_12.method4328(arg0);
				method2463();
				return true;
			}
			arg0.method1322();
		}
		return false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
	public static void method2454() {
		if (!aBoolean258) {
			return;
		}
		@Pc(4) GL local4 = Static116.aGL1;
		Static116.method1873();
		Static126.method1999();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static116.method1874();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class8_Sub10 local29;
		for (@Pc(22) Class8_Sub10 local22 = (Class8_Sub10) aClass182_12.method4319(); local22 != null; local22 = local29) {
			local29 = (Class8_Sub10) aClass182_12.method4329();
			@Pc(33) int local33 = local22.method1337();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method1328(local35, anInt3130, anInt3128, anIntArray247[local15], anInt3135);
				if (local29 == null && local35 == local33 - 1) {
					anInt3131 = Static116.anInt2363 - anInt3131;
					Static116.method1894(0, 0);
					local4.glDrawBuffer(36064);
					Static251.method3770();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt3129, anInt3131 - anInt3128);
					local4.glTexCoord2f((float) anInt3130, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3129 + anInt3130, anInt3131 - anInt3128);
					local4.glTexCoord2f((float) anInt3130, (float) anInt3128);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3129 + anInt3130, anInt3131);
					local4.glTexCoord2f(0.0F, (float) anInt3128);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt3129, anInt3131);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt3130, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3130, 0);
					local4.glTexCoord2f((float) anInt3130, (float) anInt3128);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3130, anInt3128);
					local4.glTexCoord2f(0.0F, (float) anInt3128);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt3128);
					local4.glEnd();
				}
				local22.method1338(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static116.method1881();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!kg;Z)V")
	private static void method2455(@OriginalArg(0) Class8_Sub10 arg0) {
		arg0.aBoolean128 = false;
		arg0.method4273();
		method2463();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)Z")
	public static boolean method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3132 == -1 || aClass182_12.method4316()) {
			aBoolean258 = false;
			return false;
		}
		anInt3129 = arg0;
		anInt3131 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt3130 != arg2 || anInt3128 != arg3) {
			anInt3130 = arg2;
			anInt3128 = arg3;
			for (@Pc(30) Class8 local30 = aClass182_12.method4319(); local30 != aClass182_12.aClass8_230; local30 = local30.aClass8_229) {
				((Class8_Sub10) local30).method1325(anInt3130, anInt3128);
			}
			aBoolean262 = true;
			aBoolean263 = true;
		}
		@Pc(49) GL local49 = Static116.aGL1;
		if (aBoolean263) {
			if (anInt3135 != -1 && aBoolean260 != aBoolean259) {
				if (aBoolean259) {
					Static287.method4255(anInt3135);
				} else {
					Static251.method3772(anInt3135);
				}
				anInt3135 = -1;
			}
			if (anInt3135 == -1) {
				aBoolean259 = aBoolean260;
				if (aBoolean259) {
					anInt3135 = Static287.method4259();
				} else {
					anInt3135 = Static251.method3773();
				}
				aBoolean261 = true;
			}
			if (aBoolean259) {
				local49.glBindTexture(34037, anInt3135);
				Static287.method4257(Static287.anInt5638, Static287.anInt5647, anInt3130, anInt3128, Static287.anInt5647, Static287.anInt5651, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt3135);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt3130, anInt3128);
			}
			aBoolean263 = false;
			local16 = true;
		}
		if (aBoolean262) {
			local49.glBindTexture(34037, anIntArray247[0]);
			Static287.method4253(anInt3134, anInt3130, anInt3128);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt3133 > 1) {
				local49.glBindTexture(34037, anIntArray247[1]);
				Static287.method4253(anInt3134, anInt3130, anInt3128);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray247[1]);
				Static287.method4253(anInt3134, 0, 0);
			}
			aBoolean262 = false;
			local16 = true;
		}
		Static251.method3769(anInt3132);
		if (aBoolean261) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray247[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt3133 > 1 ? anIntArray247[1] : 0, 0);
			if (aBoolean259) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt3135, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt3135);
			}
			local49.glDrawBuffer(36064);
			aBoolean261 = false;
			local16 = true;
		}
		if (local16) {
			if (Static251.method3764()) {
				aBoolean258 = true;
			} else {
				Static251.method3770();
				aBoolean262 = true;
				aBoolean263 = true;
				aBoolean261 = true;
				aBoolean258 = false;
			}
		}
		Static116.method1894(-anInt3129, anInt3131 + anInt3128 - Static116.anInt2363);
		return aBoolean258;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()Z")
	public static boolean method2457() {
		return anInt3132 != -1 && aClass8_Sub10_Sub1_1.method1333();
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "()Z")
	public static boolean method2458() {
		if (method2459()) {
			return true;
		} else if (!method2457()) {
			return false;
		} else if (method2453(aClass8_Sub10_Sub1_1)) {
			return true;
		} else {
			method2462();
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "()Z")
	public static boolean method2459() {
		return anInt3132 != -1 && aClass8_Sub10_Sub1_1.method1323();
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "()V")
	public static void method2461() {
		if (anInt3132 != -1) {
			Static251.method3774(anInt3132);
			anInt3132 = -1;
			Static116.aGL1.glDeleteTextures(2, anIntArray247, 0);
			anIntArray247[0] = -1;
			anIntArray247[1] = -1;
		}
		if (anInt3135 != -1) {
			if (aBoolean259) {
				Static287.method4255(anInt3135);
			} else {
				Static251.method3772(anInt3135);
			}
			anInt3135 = -1;
		}
		if (!aClass182_12.method4316()) {
			for (@Pc(39) Class8 local39 = aClass182_12.method4319(); local39 != aClass182_12.aClass8_230; local39 = local39.aClass8_229) {
				((Class8_Sub10) local39).method1322();
			}
		}
		if (aClass8_Sub10_Sub1_1 != null && aClass8_Sub10_Sub1_1.method1333()) {
			aClass8_Sub10_Sub1_1.method1322();
		}
		aBoolean262 = true;
		aBoolean263 = true;
		aBoolean261 = true;
		anInt3128 = -1;
		anInt3130 = -1;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "()V")
	public static void method2462() {
		if (aClass8_Sub10_Sub1_1.method1323()) {
			method2455(aClass8_Sub10_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "()V")
	private static void method2463() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class8_Sub10 local12 = (Class8_Sub10) aClass182_12.method4319(); local12 != null; local12 = (Class8_Sub10) aClass182_12.method4329()) {
			local17 = local12.method1321();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method1327();
			local7 |= local12.method1332();
			local3 += local12.method1337();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static287.anInt5645 : Static287.anInt5644;
		} else if (local1 == 1) {
			local55 = local5 ? Static287.anInt5643 : Static287.anInt5642;
		} else {
			local55 = local5 ? Static287.anInt5640 : Static287.anInt5639;
		}
		if (local55 != anInt3134) {
			anInt3134 = local55;
			aBoolean262 = true;
		}
		local17 = anInt3133 > 2 ? 2 : anInt3133;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean262 = true;
			aBoolean261 = true;
		}
		if (local7 != aBoolean259) {
			aBoolean260 = local7;
			aBoolean263 = true;
		}
		anInt3133 = local3;
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "()V")
	public static void method2464() {
		if (!Static116.aBoolean201 || !Static116.aBoolean197) {
			return;
		}
		@Pc(5) GL local5 = Static116.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray247, 0);
			anInt3132 = Static251.method3766();
		}
		for (@Pc(29) Class8 local29 = aClass182_12.method4319(); local29 != null; local29 = aClass182_12.method4329()) {
			@Pc(34) Class8_Sub10 local34 = (Class8_Sub10) local29;
			if (!local34.method1336()) {
				local34.method4273();
			}
		}
		if (aClass8_Sub10_Sub1_1 == null) {
			aClass8_Sub10_Sub1_1 = new Class8_Sub10_Sub1();
		}
		if (!aClass8_Sub10_Sub1_1.method1333() && !aClass8_Sub10_Sub1_1.method1336()) {
			aClass8_Sub10_Sub1_1.method1322();
		}
		method2463();
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "()Z")
	public static boolean method2465() {
		return anInt3132 != -1;
	}
}

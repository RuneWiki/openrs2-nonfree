import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "Lclient!uj;")
	private static Class1_Sub21_Sub1 aClass1_Sub21_Sub1_1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	private static int anInt6280 = 0;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	private static int anInt6281 = -1;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!ci;")
	private static Class26 aClass26_60 = new Class26();

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	private static int anInt6282 = -1;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	private static int anInt6283 = 0;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	private static int anInt6284 = -1;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Z")
	private static boolean aBoolean412 = true;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
	private static boolean aBoolean413 = true;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	private static int anInt6285 = -1;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
	private static int[] anIntArray568 = new int[2];

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private static int anInt6286 = -1;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	private static int anInt6287 = 0;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
	private static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "Z")
	private static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Z")
	private static boolean aBoolean416 = true;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Z")
	private static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
	public static void method4741() {
		if (!aBoolean415) {
			return;
		}
		@Pc(4) GL local4 = Static294.aGL1;
		Static294.method4520();
		Static156.method2538();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static294.method4492();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub21 local29;
		for (@Pc(22) Class1_Sub21 local22 = (Class1_Sub21) aClass26_60.method666(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub21) aClass26_60.method672();
			@Pc(33) int local33 = local22.method4324();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method4320(local35, anInt6284, anInt6281, anIntArray568[local15], anInt6285);
				if (local29 == null && local35 == local33 - 1) {
					anInt6283 = Static294.anInt5874 - anInt6283;
					Static294.method4518(0, 0);
					local4.glDrawBuffer(36064);
					Static164.method2585();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt6280, anInt6283 - anInt6281);
					local4.glTexCoord2f((float) anInt6284, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt6280 + anInt6284, anInt6283 - anInt6281);
					local4.glTexCoord2f((float) anInt6284, (float) anInt6281);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt6280 + anInt6284, anInt6283);
					local4.glTexCoord2f(0.0F, (float) anInt6281);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt6280, anInt6283);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt6284, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt6284, 0);
					local4.glTexCoord2f((float) anInt6284, (float) anInt6281);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt6284, anInt6281);
					local4.glTexCoord2f(0.0F, (float) anInt6281);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt6281);
					local4.glEnd();
				}
				local22.method4332(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static294.method4495();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)Z")
	public static boolean method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt6282 == -1 || aClass26_60.method674()) {
			aBoolean415 = false;
			return false;
		}
		anInt6280 = arg0;
		anInt6283 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt6284 != arg2 || anInt6281 != arg3) {
			anInt6284 = arg2;
			anInt6281 = arg3;
			for (@Pc(30) Class1 local30 = aClass26_60.method666(); local30 != aClass26_60.aClass1_23; local30 = local30.aClass1_233) {
				((Class1_Sub21) local30).method4322(anInt6284, anInt6281);
			}
			aBoolean413 = true;
			aBoolean412 = true;
		}
		@Pc(49) GL local49 = Static294.aGL1;
		if (aBoolean412) {
			if (anInt6285 != -1 && aBoolean417 != aBoolean414) {
				if (aBoolean414) {
					Static201.method3210(anInt6285);
				} else {
					Static164.method2590(anInt6285);
				}
				anInt6285 = -1;
			}
			if (anInt6285 == -1) {
				aBoolean414 = aBoolean417;
				if (aBoolean414) {
					anInt6285 = Static201.method3212();
				} else {
					anInt6285 = Static164.method2592();
				}
				aBoolean416 = true;
			}
			if (aBoolean414) {
				local49.glBindTexture(34037, anInt6285);
				Static201.method3214(Static201.anInt4367, Static201.anInt4376, anInt6284, anInt6281, Static201.anInt4376, Static201.anInt4380, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt6285);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt6284, anInt6281);
			}
			aBoolean412 = false;
			local16 = true;
		}
		if (aBoolean413) {
			local49.glBindTexture(34037, anIntArray568[0]);
			Static201.method3206(anInt6286, anInt6284, anInt6281);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt6287 > 1) {
				local49.glBindTexture(34037, anIntArray568[1]);
				Static201.method3206(anInt6286, anInt6284, anInt6281);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray568[1]);
				Static201.method3206(anInt6286, 0, 0);
			}
			aBoolean413 = false;
			local16 = true;
		}
		Static164.method2593(anInt6282);
		if (aBoolean416) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray568[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt6287 > 1 ? anIntArray568[1] : 0, 0);
			if (aBoolean414) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt6285, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt6285);
			}
			local49.glDrawBuffer(36064);
			aBoolean416 = false;
			local16 = true;
		}
		if (local16) {
			if (Static164.method2589()) {
				aBoolean415 = true;
			} else {
				Static164.method2585();
				aBoolean413 = true;
				aBoolean412 = true;
				aBoolean416 = true;
				aBoolean415 = false;
			}
		}
		Static294.method4518(-anInt6280, anInt6283 + anInt6281 - Static294.anInt5874);
		return aBoolean415;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!om;)Z")
	private static boolean method4743(@OriginalArg(0) Class1_Sub21 arg0) {
		if (anInt6282 != -1) {
			if (arg0.method4330() || arg0.method4331()) {
				if (anInt6284 != -1 && anInt6281 != -1) {
					arg0.method4322(anInt6284, anInt6281);
				}
				arg0.aBoolean359 = true;
				aClass26_60.method668(arg0);
				method4748();
				return true;
			}
			arg0.method4329();
		}
		return false;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!om;Z)V")
	private static void method4744(@OriginalArg(0) Class1_Sub21 arg0) {
		arg0.aBoolean359 = false;
		arg0.method4767();
		method4748();
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z")
	public static boolean method4745() {
		return anInt6282 != -1 && aClass1_Sub21_Sub1_1.method4321();
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()Z")
	public static boolean method4746() {
		return anInt6282 != -1 && aClass1_Sub21_Sub1_1.method4330();
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "()V")
	private static void method4748() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) aClass26_60.method666(); local12 != null; local12 = (Class1_Sub21) aClass26_60.method672()) {
			local17 = local12.method4328();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method4325();
			local7 |= local12.method4323();
			local3 += local12.method4324();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static201.anInt4374 : Static201.anInt4373;
		} else if (local1 == 1) {
			local55 = local5 ? Static201.anInt4372 : Static201.anInt4371;
		} else {
			local55 = local5 ? Static201.anInt4369 : Static201.anInt4368;
		}
		if (local55 != anInt6286) {
			anInt6286 = local55;
			aBoolean413 = true;
		}
		local17 = anInt6287 > 2 ? 2 : anInt6287;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean413 = true;
			aBoolean416 = true;
		}
		if (local7 != aBoolean414) {
			aBoolean417 = local7;
			aBoolean412 = true;
		}
		anInt6287 = local3;
	}

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "()Z")
	public static boolean method4749() {
		return anInt6282 != -1;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "()V")
	public static void method4750() {
		if (anInt6282 != -1) {
			Static164.method2583(anInt6282);
			anInt6282 = -1;
			Static294.aGL1.glDeleteTextures(2, anIntArray568, 0);
			anIntArray568[0] = -1;
			anIntArray568[1] = -1;
		}
		if (anInt6285 != -1) {
			if (aBoolean414) {
				Static201.method3210(anInt6285);
			} else {
				Static164.method2590(anInt6285);
			}
			anInt6285 = -1;
		}
		if (!aClass26_60.method674()) {
			for (@Pc(39) Class1 local39 = aClass26_60.method666(); local39 != aClass26_60.aClass1_23; local39 = local39.aClass1_233) {
				((Class1_Sub21) local39).method4329();
			}
		}
		if (aClass1_Sub21_Sub1_1 != null && aClass1_Sub21_Sub1_1.method4330()) {
			aClass1_Sub21_Sub1_1.method4329();
		}
		aBoolean413 = true;
		aBoolean412 = true;
		aBoolean416 = true;
		anInt6281 = -1;
		anInt6284 = -1;
	}

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "()V")
	public static void method4751() {
		if (aClass1_Sub21_Sub1_1.method4321()) {
			method4744(aClass1_Sub21_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "()V")
	public static void method4752() {
		if (!Static294.aBoolean366 || !Static294.aBoolean373) {
			return;
		}
		@Pc(5) GL local5 = Static294.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray568, 0);
			anInt6282 = Static164.method2588();
		}
		for (@Pc(29) Class1 local29 = aClass26_60.method666(); local29 != null; local29 = aClass26_60.method672()) {
			@Pc(34) Class1_Sub21 local34 = (Class1_Sub21) local29;
			if (!local34.method4331()) {
				local34.method4767();
			}
		}
		if (aClass1_Sub21_Sub1_1 == null) {
			aClass1_Sub21_Sub1_1 = new Class1_Sub21_Sub1();
		}
		if (!aClass1_Sub21_Sub1_1.method4330() && !aClass1_Sub21_Sub1_1.method4331()) {
			aClass1_Sub21_Sub1_1.method4329();
		}
		method4748();
	}

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "()Z")
	public static boolean method4753() {
		if (method4745()) {
			return true;
		} else if (!method4746()) {
			return false;
		} else if (method4743(aClass1_Sub21_Sub1_1)) {
			return true;
		} else {
			method4751();
			return false;
		}
	}
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!un", name = "m", descriptor = "Lclient!ji;")
	private static Class4_Sub19_Sub1 aClass4_Sub19_Sub1_1;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	private static int anInt5490 = -1;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	private static int anInt5491 = -1;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	private static int anInt5492 = -1;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	private static int anInt5493 = 0;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	private static int anInt5494 = 0;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "Lclient!c;")
	private static Class17 aClass17_29 = new Class17();

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	private static int anInt5495 = -1;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
	private static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
	private static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "[I")
	private static int[] anIntArray436 = new int[2];

	@OriginalMember(owner = "client!un", name = "k", descriptor = "Z")
	private static boolean aBoolean369 = true;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "Z")
	private static boolean aBoolean370 = true;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "I")
	private static int anInt5496 = -1;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "Z")
	private static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	private static int anInt5497 = 0;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Z")
	private static boolean aBoolean372 = true;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
	public static void method4361() {
		if (aClass4_Sub19_Sub1_1.method2136()) {
			method4368(aClass4_Sub19_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
	private static void method4362() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class4_Sub19 local12 = (Class4_Sub19) aClass17_29.method613(); local12 != null; local12 = (Class4_Sub19) aClass17_29.method607()) {
			local17 = local12.method2132();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method2137();
			local7 |= local12.method2139();
			local3 += local12.method2135();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static206.anInt4061 : Static206.anInt4060;
		} else if (local1 == 1) {
			local55 = local5 ? Static206.anInt4059 : Static206.anInt4058;
		} else {
			local55 = local5 ? Static206.anInt4056 : Static206.anInt4055;
		}
		if (local55 != anInt5496) {
			anInt5496 = local55;
			aBoolean372 = true;
		}
		local17 = anInt5497 > 2 ? 2 : anInt5497;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean372 = true;
			aBoolean370 = true;
		}
		if (local7 != aBoolean371) {
			aBoolean367 = local7;
			aBoolean369 = true;
		}
		anInt5497 = local3;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()V")
	public static void method4363() {
		if (!Static251.aBoolean324 || !Static251.aBoolean322) {
			return;
		}
		@Pc(5) GL local5 = Static251.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray436, 0);
			anInt5491 = Static196.method3186();
		}
		for (@Pc(29) Class4 local29 = aClass17_29.method613(); local29 != null; local29 = aClass17_29.method607()) {
			@Pc(34) Class4_Sub19 local34 = (Class4_Sub19) local29;
			if (!local34.method2140()) {
				local34.method4690();
			}
		}
		if (aClass4_Sub19_Sub1_1 == null) {
			aClass4_Sub19_Sub1_1 = new Class4_Sub19_Sub1();
		}
		if (!aClass4_Sub19_Sub1_1.method2130() && !aClass4_Sub19_Sub1_1.method2140()) {
			aClass4_Sub19_Sub1_1.method2127();
		}
		method4362();
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()Z")
	public static boolean method4364() {
		return anInt5491 != -1;
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "()V")
	public static void method4365() {
		if (anInt5491 != -1) {
			Static196.method3185(anInt5491);
			anInt5491 = -1;
			Static251.aGL1.glDeleteTextures(2, anIntArray436, 0);
			anIntArray436[0] = -1;
			anIntArray436[1] = -1;
		}
		if (anInt5495 != -1) {
			if (aBoolean371) {
				Static206.method3276(anInt5495);
			} else {
				Static196.method3187(anInt5495);
			}
			anInt5495 = -1;
		}
		if (!aClass17_29.method612()) {
			for (@Pc(39) Class4 local39 = aClass17_29.method613(); local39 != aClass17_29.aClass4_33; local39 = local39.aClass4_233) {
				((Class4_Sub19) local39).method2127();
			}
		}
		if (aClass4_Sub19_Sub1_1 != null && aClass4_Sub19_Sub1_1.method2130()) {
			aClass4_Sub19_Sub1_1.method2127();
		}
		aBoolean372 = true;
		aBoolean369 = true;
		aBoolean370 = true;
		anInt5490 = -1;
		anInt5492 = -1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)Z")
	public static boolean method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt5491 == -1 || aClass17_29.method612()) {
			aBoolean368 = false;
			return false;
		}
		anInt5493 = arg0;
		anInt5494 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt5492 != arg2 || anInt5490 != arg3) {
			anInt5492 = arg2;
			anInt5490 = arg3;
			for (@Pc(30) Class4 local30 = aClass17_29.method613(); local30 != aClass17_29.aClass4_33; local30 = local30.aClass4_233) {
				((Class4_Sub19) local30).method2129(anInt5492, anInt5490);
			}
			aBoolean372 = true;
			aBoolean369 = true;
		}
		@Pc(49) GL local49 = Static251.aGL1;
		if (aBoolean369) {
			if (anInt5495 != -1 && aBoolean367 != aBoolean371) {
				if (aBoolean371) {
					Static206.method3276(anInt5495);
				} else {
					Static196.method3187(anInt5495);
				}
				anInt5495 = -1;
			}
			if (anInt5495 == -1) {
				aBoolean371 = aBoolean367;
				if (aBoolean371) {
					anInt5495 = Static206.method3281();
				} else {
					anInt5495 = Static196.method3193();
				}
				aBoolean370 = true;
			}
			if (aBoolean371) {
				local49.glBindTexture(34037, anInt5495);
				Static206.method3279(Static206.anInt4054, Static206.anInt4063, anInt5492, anInt5490, Static206.anInt4063, Static206.anInt4067, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt5495);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt5492, anInt5490);
			}
			aBoolean369 = false;
			local16 = true;
		}
		if (aBoolean372) {
			local49.glBindTexture(34037, anIntArray436[0]);
			Static206.method3277(anInt5496, anInt5492, anInt5490);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt5497 > 1) {
				local49.glBindTexture(34037, anIntArray436[1]);
				Static206.method3277(anInt5496, anInt5492, anInt5490);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray436[1]);
				Static206.method3277(anInt5496, 0, 0);
			}
			aBoolean372 = false;
			local16 = true;
		}
		Static196.method3194(anInt5491);
		if (aBoolean370) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray436[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt5497 > 1 ? anIntArray436[1] : 0, 0);
			if (aBoolean371) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt5495, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt5495);
			}
			local49.glDrawBuffer(36064);
			aBoolean370 = false;
			local16 = true;
		}
		if (local16) {
			if (Static196.method3195()) {
				aBoolean368 = true;
			} else {
				Static196.method3189();
				aBoolean372 = true;
				aBoolean369 = true;
				aBoolean370 = true;
				aBoolean368 = false;
			}
		}
		Static251.method3859(-anInt5493, anInt5494 + anInt5490 - Static251.anInt4925);
		return aBoolean368;
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "()Z")
	public static boolean method4367() {
		return anInt5491 != -1 && aClass4_Sub19_Sub1_1.method2130();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!rj;Z)V")
	private static void method4368(@OriginalArg(0) Class4_Sub19 arg0) {
		arg0.aBoolean166 = false;
		arg0.method4690();
		method4362();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "()Z")
	public static boolean method4369() {
		return anInt5491 != -1 && aClass4_Sub19_Sub1_1.method2136();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!rj;)Z")
	private static boolean method4370(@OriginalArg(0) Class4_Sub19 arg0) {
		if (anInt5491 != -1) {
			if (arg0.method2130() || arg0.method2140()) {
				if (anInt5492 != -1 && anInt5490 != -1) {
					arg0.method2129(anInt5492, anInt5490);
				}
				arg0.aBoolean166 = true;
				aClass17_29.method619(arg0);
				method4362();
				return true;
			}
			arg0.method2127();
		}
		return false;
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "()V")
	public static void method4372() {
		if (!aBoolean368) {
			return;
		}
		@Pc(4) GL local4 = Static251.aGL1;
		Static251.method3893();
		Static87.method1462();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static251.method3856();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class4_Sub19 local29;
		for (@Pc(22) Class4_Sub19 local22 = (Class4_Sub19) aClass17_29.method613(); local22 != null; local22 = local29) {
			local29 = (Class4_Sub19) aClass17_29.method607();
			@Pc(33) int local33 = local22.method2135();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method2134(local35, anInt5492, anInt5490, anIntArray436[local15], anInt5495);
				if (local29 == null && local35 == local33 - 1) {
					anInt5494 = Static251.anInt4925 - anInt5494;
					Static251.method3859(0, 0);
					local4.glDrawBuffer(36064);
					Static196.method3189();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt5493, anInt5494 - anInt5490);
					local4.glTexCoord2f((float) anInt5492, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5493 + anInt5492, anInt5494 - anInt5490);
					local4.glTexCoord2f((float) anInt5492, (float) anInt5490);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5493 + anInt5492, anInt5494);
					local4.glTexCoord2f(0.0F, (float) anInt5490);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt5493, anInt5494);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt5492, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5492, 0);
					local4.glTexCoord2f((float) anInt5492, (float) anInt5490);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5492, anInt5490);
					local4.glTexCoord2f(0.0F, (float) anInt5490);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt5490);
					local4.glEnd();
				}
				local22.method2125(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static251.method3878();
	}

	@OriginalMember(owner = "client!un", name = "j", descriptor = "()Z")
	public static boolean method4373() {
		if (method4369()) {
			return true;
		} else if (!method4367()) {
			return false;
		} else if (method4370(aClass4_Sub19_Sub1_1)) {
			return true;
		} else {
			method4361();
			return false;
		}
	}
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Lclient!qg;")
	private static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	private static int anInt3607 = -1;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	private static int anInt3608 = 0;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	private static int anInt3609 = -1;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!hi;")
	private static Class61 aClass61_18 = new Class61();

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	private static int anInt3610 = -1;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	private static int anInt3611 = 0;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
	private static int[] anIntArray320 = new int[2];

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
	private static boolean aBoolean263 = true;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Z")
	private static boolean aBoolean264 = true;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Z")
	private static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
	private static int anInt3612 = 0;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
	private static boolean aBoolean266 = true;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Z")
	private static boolean aBoolean267 = false;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	private static int anInt3613 = -1;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	private static int anInt3614 = -1;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "Z")
	private static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!a;)Z")
	private static boolean method2898(@OriginalArg(0) Class1_Sub1 arg0) {
		if (anInt3610 != -1) {
			if (arg0.method3378() || arg0.method3389()) {
				if (anInt3609 != -1 && anInt3607 != -1) {
					arg0.method3388(anInt3609, anInt3607);
				}
				arg0.aBoolean329 = true;
				aClass61_18.method1839(arg0);
				method2903();
				return true;
			}
			arg0.method3392();
		}
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "()Z")
	public static boolean method2899() {
		return anInt3610 != -1 && aClass1_Sub1_Sub1_1.method3379();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!a;Z)V")
	private static void method2900(@OriginalArg(0) Class1_Sub1 arg0) {
		arg0.aBoolean329 = false;
		arg0.method4441();
		method2903();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "()V")
	public static void method2901() {
		if (!Static277.aBoolean408 || !Static277.aBoolean420) {
			return;
		}
		@Pc(5) GL local5 = Static277.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray320, 0);
			anInt3610 = Static206.method3308();
		}
		for (@Pc(29) Class1 local29 = aClass61_18.method1835(); local29 != null; local29 = aClass61_18.method1836()) {
			@Pc(34) Class1_Sub1 local34 = (Class1_Sub1) local29;
			if (!local34.method3389()) {
				local34.method4441();
			}
		}
		if (aClass1_Sub1_Sub1_1 == null) {
			aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1();
		}
		if (!aClass1_Sub1_Sub1_1.method3378() && !aClass1_Sub1_Sub1_1.method3389()) {
			aClass1_Sub1_Sub1_1.method3392();
		}
		method2903();
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "()Z")
	public static boolean method2902() {
		if (method2899()) {
			return true;
		} else if (!method2905()) {
			return false;
		} else if (method2898(aClass1_Sub1_Sub1_1)) {
			return true;
		} else {
			method2906();
			return false;
		}
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "()V")
	private static void method2903() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) aClass61_18.method1835(); local12 != null; local12 = (Class1_Sub1) aClass61_18.method1836()) {
			local17 = local12.method3385();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method3390();
			local7 |= local12.method3386();
			local3 += local12.method3384();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static37.anInt937 : Static37.anInt936;
		} else if (local1 == 1) {
			local55 = local5 ? Static37.anInt935 : Static37.anInt934;
		} else {
			local55 = local5 ? Static37.anInt932 : Static37.anInt931;
		}
		if (local55 != anInt3614) {
			anInt3614 = local55;
			aBoolean264 = true;
		}
		local17 = anInt3612 > 2 ? 2 : anInt3612;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean264 = true;
			aBoolean266 = true;
		}
		if (local7 != aBoolean265) {
			aBoolean267 = local7;
			aBoolean263 = true;
		}
		anInt3612 = local3;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z")
	public static boolean method2904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3610 == -1 || aClass61_18.method1849()) {
			aBoolean268 = false;
			return false;
		}
		anInt3611 = arg0;
		anInt3608 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt3609 != arg2 || anInt3607 != arg3) {
			anInt3609 = arg2;
			anInt3607 = arg3;
			for (@Pc(30) Class1 local30 = aClass61_18.method1835(); local30 != aClass61_18.aClass1_106; local30 = local30.aClass1_231) {
				((Class1_Sub1) local30).method3388(anInt3609, anInt3607);
			}
			aBoolean264 = true;
			aBoolean263 = true;
		}
		@Pc(49) GL local49 = Static277.aGL1;
		if (aBoolean263) {
			if (anInt3613 != -1 && aBoolean267 != aBoolean265) {
				if (aBoolean265) {
					Static37.method775(anInt3613);
				} else {
					Static206.method3300(anInt3613);
				}
				anInt3613 = -1;
			}
			if (anInt3613 == -1) {
				aBoolean265 = aBoolean267;
				if (aBoolean265) {
					anInt3613 = Static37.method778();
				} else {
					anInt3613 = Static206.method3309();
				}
				aBoolean266 = true;
			}
			if (aBoolean265) {
				local49.glBindTexture(34037, anInt3613);
				Static37.method776(Static37.anInt930, Static37.anInt939, anInt3609, anInt3607, Static37.anInt939, Static37.anInt943, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt3613);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt3609, anInt3607);
			}
			aBoolean263 = false;
			local16 = true;
		}
		if (aBoolean264) {
			local49.glBindTexture(34037, anIntArray320[0]);
			Static37.method781(anInt3614, anInt3609, anInt3607);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt3612 > 1) {
				local49.glBindTexture(34037, anIntArray320[1]);
				Static37.method781(anInt3614, anInt3609, anInt3607);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray320[1]);
				Static37.method781(anInt3614, 0, 0);
			}
			aBoolean264 = false;
			local16 = true;
		}
		Static206.method3301(anInt3610);
		if (aBoolean266) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray320[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt3612 > 1 ? anIntArray320[1] : 0, 0);
			if (aBoolean265) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt3613, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt3613);
			}
			local49.glDrawBuffer(36064);
			aBoolean266 = false;
			local16 = true;
		}
		if (local16) {
			if (Static206.method3304()) {
				aBoolean268 = true;
			} else {
				Static206.method3299();
				aBoolean264 = true;
				aBoolean263 = true;
				aBoolean266 = true;
				aBoolean268 = false;
			}
		}
		Static277.method4227(-anInt3611, anInt3608 + anInt3607 - Static277.anInt5360);
		return aBoolean268;
	}

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "()Z")
	public static boolean method2905() {
		return anInt3610 != -1 && aClass1_Sub1_Sub1_1.method3378();
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "()V")
	public static void method2906() {
		if (aClass1_Sub1_Sub1_1.method3379()) {
			method2900(aClass1_Sub1_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "()V")
	public static void method2907() {
		if (!aBoolean268) {
			return;
		}
		@Pc(4) GL local4 = Static277.aGL1;
		Static277.method4188();
		Static41.method842();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static277.method4208();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub1 local29;
		for (@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) aClass61_18.method1835(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub1) aClass61_18.method1836();
			@Pc(33) int local33 = local22.method3384();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method3381(local35, anInt3609, anInt3607, anIntArray320[local15], anInt3613);
				if (local29 == null && local35 == local33 - 1) {
					anInt3608 = Static277.anInt5360 - anInt3608;
					Static277.method4227(0, 0);
					local4.glDrawBuffer(36064);
					Static206.method3299();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt3611, anInt3608 - anInt3607);
					local4.glTexCoord2f((float) anInt3609, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3611 + anInt3609, anInt3608 - anInt3607);
					local4.glTexCoord2f((float) anInt3609, (float) anInt3607);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3611 + anInt3609, anInt3608);
					local4.glTexCoord2f(0.0F, (float) anInt3607);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt3611, anInt3608);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt3609, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3609, 0);
					local4.glTexCoord2f((float) anInt3609, (float) anInt3607);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3609, anInt3607);
					local4.glTexCoord2f(0.0F, (float) anInt3607);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt3607);
					local4.glEnd();
				}
				local22.method3377(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static277.method4215();
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "()Z")
	public static boolean method2908() {
		return anInt3610 != -1;
	}

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "()V")
	public static void method2910() {
		if (anInt3610 != -1) {
			Static206.method3305(anInt3610);
			anInt3610 = -1;
			Static277.aGL1.glDeleteTextures(2, anIntArray320, 0);
			anIntArray320[0] = -1;
			anIntArray320[1] = -1;
		}
		if (anInt3613 != -1) {
			if (aBoolean265) {
				Static37.method775(anInt3613);
			} else {
				Static206.method3300(anInt3613);
			}
			anInt3613 = -1;
		}
		if (!aClass61_18.method1849()) {
			for (@Pc(39) Class1 local39 = aClass61_18.method1835(); local39 != aClass61_18.aClass1_106; local39 = local39.aClass1_231) {
				((Class1_Sub1) local39).method3392();
			}
		}
		if (aClass1_Sub1_Sub1_1 != null && aClass1_Sub1_Sub1_1.method3378()) {
			aClass1_Sub1_Sub1_1.method3392();
		}
		aBoolean264 = true;
		aBoolean263 = true;
		aBoolean266 = true;
		anInt3607 = -1;
		anInt3609 = -1;
	}
}

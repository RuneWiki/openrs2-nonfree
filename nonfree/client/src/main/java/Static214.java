import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!qb;")
	private static Class1_Sub22_Sub1 aClass1_Sub22_Sub1_1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	private static int anInt4725 = 0;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	private static int anInt4726 = -1;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
	private static int anInt4727 = 0;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	private static int anInt4728 = -1;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	private static int anInt4729 = -1;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!qg;")
	private static Class131 aClass131_14 = new Class131();

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
	private static int[] anIntArray477 = new int[2];

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	private static int anInt4730 = -1;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	private static int anInt4731 = -1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	private static int anInt4732 = 0;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
	private static boolean aBoolean257 = true;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
	private static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Z")
	private static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Z")
	private static boolean aBoolean260 = true;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
	private static boolean aBoolean261 = false;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Z")
	private static boolean aBoolean262 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	public static void method3742() {
		if (aClass1_Sub22_Sub1_1.method3730()) {
			method3744(aClass1_Sub22_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()Z")
	public static boolean method3743() {
		return anInt4726 != -1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!mg;Z)V")
	private static void method3744(@OriginalArg(0) Class1_Sub22 arg0) {
		arg0.aBoolean250 = false;
		arg0.method4742();
		method3748();
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Z")
	public static boolean method3745() {
		return anInt4726 != -1 && aClass1_Sub22_Sub1_1.method3720();
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()Z")
	public static boolean method3746() {
		return anInt4726 != -1 && aClass1_Sub22_Sub1_1.method3730();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!mg;)Z")
	private static boolean method3747(@OriginalArg(0) Class1_Sub22 arg0) {
		if (anInt4726 != -1) {
			if (arg0.method3720() || arg0.method3731()) {
				if (anInt4729 != -1 && anInt4728 != -1) {
					arg0.method3723(anInt4729, anInt4728);
				}
				arg0.aBoolean250 = true;
				aClass131_14.method3799(arg0);
				method3748();
				return true;
			}
			arg0.method3725();
		}
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
	private static void method3748() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub22 local12 = (Class1_Sub22) aClass131_14.method3791(); local12 != null; local12 = (Class1_Sub22) aClass131_14.method3792()) {
			local17 = local12.method3722();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method3728();
			local7 |= local12.method3721();
			local3 += local12.method3733();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static297.anInt6224 : Static297.anInt6223;
		} else if (local1 == 1) {
			local55 = local5 ? Static297.anInt6222 : Static297.anInt6221;
		} else {
			local55 = local5 ? Static297.anInt6219 : Static297.anInt6218;
		}
		if (local55 != anInt4731) {
			anInt4731 = local55;
			aBoolean257 = true;
		}
		local17 = anInt4732 > 2 ? 2 : anInt4732;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean257 = true;
			aBoolean260 = true;
		}
		if (local7 != aBoolean258) {
			aBoolean261 = local7;
			aBoolean262 = true;
		}
		anInt4732 = local3;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "()V")
	public static void method3749() {
		if (!aBoolean259) {
			return;
		}
		@Pc(4) GL local4 = Static296.aGL1;
		Static296.method4802();
		Static288.method4710();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static296.method4808();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub22 local29;
		for (@Pc(22) Class1_Sub22 local22 = (Class1_Sub22) aClass131_14.method3791(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub22) aClass131_14.method3792();
			@Pc(33) int local33 = local22.method3733();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method3727(local35, anInt4729, anInt4728, anIntArray477[local15], anInt4730);
				if (local29 == null && local35 == local33 - 1) {
					anInt4727 = Static296.anInt6197 - anInt4727;
					Static296.method4819(0, 0);
					local4.glDrawBuffer(36064);
					Static17.method368();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt4725, anInt4727 - anInt4728);
					local4.glTexCoord2f((float) anInt4729, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt4725 + anInt4729, anInt4727 - anInt4728);
					local4.glTexCoord2f((float) anInt4729, (float) anInt4728);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt4725 + anInt4729, anInt4727);
					local4.glTexCoord2f(0.0F, (float) anInt4728);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt4725, anInt4727);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt4729, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt4729, 0);
					local4.glTexCoord2f((float) anInt4729, (float) anInt4728);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt4729, anInt4728);
					local4.glTexCoord2f(0.0F, (float) anInt4728);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt4728);
					local4.glEnd();
				}
				local22.method3729(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static296.method4813();
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "()V")
	public static void method3750() {
		if (!Static296.aBoolean340 || !Static296.aBoolean342) {
			return;
		}
		@Pc(5) GL local5 = Static296.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray477, 0);
			anInt4726 = Static17.method365();
		}
		for (@Pc(29) Class1 local29 = aClass131_14.method3791(); local29 != null; local29 = aClass131_14.method3792()) {
			@Pc(34) Class1_Sub22 local34 = (Class1_Sub22) local29;
			if (!local34.method3731()) {
				local34.method4742();
			}
		}
		if (aClass1_Sub22_Sub1_1 == null) {
			aClass1_Sub22_Sub1_1 = new Class1_Sub22_Sub1();
		}
		if (!aClass1_Sub22_Sub1_1.method3720() && !aClass1_Sub22_Sub1_1.method3731()) {
			aClass1_Sub22_Sub1_1.method3725();
		}
		method3748();
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "()Z")
	public static boolean method3752() {
		if (method3746()) {
			return true;
		} else if (!method3745()) {
			return false;
		} else if (method3747(aClass1_Sub22_Sub1_1)) {
			return true;
		} else {
			method3742();
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "()V")
	public static void method3753() {
		if (anInt4726 != -1) {
			Static17.method372(anInt4726);
			anInt4726 = -1;
			Static296.aGL1.glDeleteTextures(2, anIntArray477, 0);
			anIntArray477[0] = -1;
			anIntArray477[1] = -1;
		}
		if (anInt4730 != -1) {
			if (aBoolean258) {
				Static297.method4843(anInt4730);
			} else {
				Static17.method375(anInt4730);
			}
			anInt4730 = -1;
		}
		if (!aClass131_14.method3789()) {
			for (@Pc(39) Class1 local39 = aClass131_14.method3791(); local39 != aClass131_14.aClass1_180; local39 = local39.aClass1_231) {
				((Class1_Sub22) local39).method3725();
			}
		}
		if (aClass1_Sub22_Sub1_1 != null && aClass1_Sub22_Sub1_1.method3720()) {
			aClass1_Sub22_Sub1_1.method3725();
		}
		aBoolean257 = true;
		aBoolean262 = true;
		aBoolean260 = true;
		anInt4728 = -1;
		anInt4729 = -1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)Z")
	public static boolean method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt4726 == -1 || aClass131_14.method3789()) {
			aBoolean259 = false;
			return false;
		}
		anInt4725 = arg0;
		anInt4727 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt4729 != arg2 || anInt4728 != arg3) {
			anInt4729 = arg2;
			anInt4728 = arg3;
			for (@Pc(30) Class1 local30 = aClass131_14.method3791(); local30 != aClass131_14.aClass1_180; local30 = local30.aClass1_231) {
				((Class1_Sub22) local30).method3723(anInt4729, anInt4728);
			}
			aBoolean257 = true;
			aBoolean262 = true;
		}
		@Pc(49) GL local49 = Static296.aGL1;
		if (aBoolean262) {
			if (anInt4730 != -1 && aBoolean261 != aBoolean258) {
				if (aBoolean258) {
					Static297.method4843(anInt4730);
				} else {
					Static17.method375(anInt4730);
				}
				anInt4730 = -1;
			}
			if (anInt4730 == -1) {
				aBoolean258 = aBoolean261;
				if (aBoolean258) {
					anInt4730 = Static297.method4847();
				} else {
					anInt4730 = Static17.method371();
				}
				aBoolean260 = true;
			}
			if (aBoolean258) {
				local49.glBindTexture(34037, anInt4730);
				Static297.method4846(Static297.anInt6217, Static297.anInt6226, anInt4729, anInt4728, Static297.anInt6226, Static297.anInt6230, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt4730);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt4729, anInt4728);
			}
			aBoolean262 = false;
			local16 = true;
		}
		if (aBoolean257) {
			local49.glBindTexture(34037, anIntArray477[0]);
			Static297.method4845(anInt4731, anInt4729, anInt4728);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt4732 > 1) {
				local49.glBindTexture(34037, anIntArray477[1]);
				Static297.method4845(anInt4731, anInt4729, anInt4728);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray477[1]);
				Static297.method4845(anInt4731, 0, 0);
			}
			aBoolean257 = false;
			local16 = true;
		}
		Static17.method373(anInt4726);
		if (aBoolean260) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray477[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt4732 > 1 ? anIntArray477[1] : 0, 0);
			if (aBoolean258) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt4730, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt4730);
			}
			local49.glDrawBuffer(36064);
			aBoolean260 = false;
			local16 = true;
		}
		if (local16) {
			if (Static17.method367()) {
				aBoolean259 = true;
			} else {
				Static17.method368();
				aBoolean257 = true;
				aBoolean262 = true;
				aBoolean260 = true;
				aBoolean259 = false;
			}
		}
		Static296.method4819(-anInt4725, anInt4727 + anInt4728 - Static296.anInt6197);
		return aBoolean259;
	}
}

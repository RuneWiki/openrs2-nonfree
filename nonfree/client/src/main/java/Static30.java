import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!w;")
	private static Class3_Sub7_Sub1 aClass3_Sub7_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
	private static int anInt554 = -1;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	private static int anInt555 = 0;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	private static int anInt556 = -1;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	private static int anInt557 = 0;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
	private static int anInt558 = -1;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!fk;")
	private static Class56 aClass56_3 = new Class56();

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Z")
	private static boolean aBoolean45 = true;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	private static int anInt559 = 0;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Z")
	private static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Z")
	private static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Z")
	private static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
	private static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
	private static boolean aBoolean50 = true;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
	private static int[] anIntArray48 = new int[2];

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	private static int anInt560 = -1;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
	private static int anInt561 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!da;Z)V")
	private static void method459(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.aBoolean425 = false;
		arg0.method5013();
		method471();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	public static void method460() {
		if (!aBoolean46) {
			return;
		}
		@Pc(4) GL local4 = Static283.aGL1;
		Static283.method4630();
		Static234.method3976();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static283.method4641();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class3_Sub7 local29;
		for (@Pc(22) Class3_Sub7 local22 = (Class3_Sub7) aClass56_3.method1281(); local22 != null; local22 = local29) {
			local29 = (Class3_Sub7) aClass56_3.method1278();
			@Pc(33) int local33 = local22.method4898();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method4902(local35, anInt554, anInt556, anIntArray48[local15], anInt561);
				if (local29 == null && local35 == local33 - 1) {
					anInt555 = Static283.anInt5688 - anInt555;
					Static283.method4647(0, 0);
					local4.glDrawBuffer(36064);
					Static121.method2016();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt557, anInt555 - anInt556);
					local4.glTexCoord2f((float) anInt554, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt557 + anInt554, anInt555 - anInt556);
					local4.glTexCoord2f((float) anInt554, (float) anInt556);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt557 + anInt554, anInt555);
					local4.glTexCoord2f(0.0F, (float) anInt556);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt557, anInt555);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt554, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt554, 0);
					local4.glTexCoord2f((float) anInt554, (float) anInt556);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt554, anInt556);
					local4.glTexCoord2f(0.0F, (float) anInt556);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt556);
					local4.glEnd();
				}
				local22.method4900(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static283.method4653();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z")
	public static boolean method461() {
		return anInt558 != -1 && aClass3_Sub7_Sub1_1.method4907();
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()Z")
	public static boolean method462() {
		if (method461()) {
			return true;
		} else if (!method467()) {
			return false;
		} else if (method470(aClass3_Sub7_Sub1_1)) {
			return true;
		} else {
			method465();
			return false;
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
	public static void method463() {
		if (!Static283.aBoolean391 || !Static283.aBoolean404) {
			return;
		}
		@Pc(5) GL local5 = Static283.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray48, 0);
			anInt558 = Static121.method2018();
		}
		for (@Pc(29) Class3 local29 = aClass56_3.method1281(); local29 != null; local29 = aClass56_3.method1278()) {
			@Pc(34) Class3_Sub7 local34 = (Class3_Sub7) local29;
			if (!local34.method4894()) {
				local34.method5013();
			}
		}
		if (aClass3_Sub7_Sub1_1 == null) {
			aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1();
		}
		if (!aClass3_Sub7_Sub1_1.method4897() && !aClass3_Sub7_Sub1_1.method4894()) {
			aClass3_Sub7_Sub1_1.method4899();
		}
		method471();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)Z")
	public static boolean method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt558 == -1 || aClass56_3.method1267()) {
			aBoolean46 = false;
			return false;
		}
		anInt557 = arg0;
		anInt555 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt554 != arg2 || anInt556 != arg3) {
			anInt554 = arg2;
			anInt556 = arg3;
			for (@Pc(30) Class3 local30 = aClass56_3.method1281(); local30 != aClass56_3.aClass3_66; local30 = local30.aClass3_232) {
				((Class3_Sub7) local30).method4893(anInt554, anInt556);
			}
			aBoolean47 = true;
			aBoolean50 = true;
		}
		@Pc(49) GL local49 = Static283.aGL1;
		if (aBoolean50) {
			if (anInt561 != -1 && aBoolean49 != aBoolean48) {
				if (aBoolean48) {
					Static211.method3480(anInt561);
				} else {
					Static121.method2013(anInt561);
				}
				anInt561 = -1;
			}
			if (anInt561 == -1) {
				aBoolean48 = aBoolean49;
				if (aBoolean48) {
					anInt561 = Static211.method3478();
				} else {
					anInt561 = Static121.method2015();
				}
				aBoolean45 = true;
			}
			if (aBoolean48) {
				local49.glBindTexture(34037, anInt561);
				Static211.method3477(Static211.anInt4136, Static211.anInt4145, anInt554, anInt556, Static211.anInt4145, Static211.anInt4149, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt561);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt554, anInt556);
			}
			aBoolean50 = false;
			local16 = true;
		}
		if (aBoolean47) {
			local49.glBindTexture(34037, anIntArray48[0]);
			Static211.method3482(anInt560, anInt554, anInt556);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt559 > 1) {
				local49.glBindTexture(34037, anIntArray48[1]);
				Static211.method3482(anInt560, anInt554, anInt556);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray48[1]);
				Static211.method3482(anInt560, 0, 0);
			}
			aBoolean47 = false;
			local16 = true;
		}
		Static121.method2020(anInt558);
		if (aBoolean45) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray48[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt559 > 1 ? anIntArray48[1] : 0, 0);
			if (aBoolean48) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt561, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt561);
			}
			local49.glDrawBuffer(36064);
			aBoolean45 = false;
			local16 = true;
		}
		if (local16) {
			if (Static121.method2014()) {
				aBoolean46 = true;
			} else {
				Static121.method2016();
				aBoolean47 = true;
				aBoolean50 = true;
				aBoolean45 = true;
				aBoolean46 = false;
			}
		}
		Static283.method4647(-anInt557, anInt555 + anInt556 - Static283.anInt5688);
		return aBoolean46;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
	public static void method465() {
		if (aClass3_Sub7_Sub1_1.method4907()) {
			method459(aClass3_Sub7_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()Z")
	public static boolean method466() {
		return anInt558 != -1;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "()Z")
	public static boolean method467() {
		return anInt558 != -1 && aClass3_Sub7_Sub1_1.method4897();
	}

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "()V")
	public static void method469() {
		if (anInt558 != -1) {
			Static121.method2012(anInt558);
			anInt558 = -1;
			Static283.aGL1.glDeleteTextures(2, anIntArray48, 0);
			anIntArray48[0] = -1;
			anIntArray48[1] = -1;
		}
		if (anInt561 != -1) {
			if (aBoolean48) {
				Static211.method3480(anInt561);
			} else {
				Static121.method2013(anInt561);
			}
			anInt561 = -1;
		}
		if (!aClass56_3.method1267()) {
			for (@Pc(39) Class3 local39 = aClass56_3.method1281(); local39 != aClass56_3.aClass3_66; local39 = local39.aClass3_232) {
				((Class3_Sub7) local39).method4899();
			}
		}
		if (aClass3_Sub7_Sub1_1 != null && aClass3_Sub7_Sub1_1.method4897()) {
			aClass3_Sub7_Sub1_1.method4899();
		}
		aBoolean47 = true;
		aBoolean50 = true;
		aBoolean45 = true;
		anInt556 = -1;
		anInt554 = -1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!da;)Z")
	private static boolean method470(@OriginalArg(0) Class3_Sub7 arg0) {
		if (anInt558 != -1) {
			if (arg0.method4897() || arg0.method4894()) {
				if (anInt554 != -1 && anInt556 != -1) {
					arg0.method4893(anInt554, anInt556);
				}
				arg0.aBoolean425 = true;
				aClass56_3.method1282(arg0);
				method471();
				return true;
			}
			arg0.method4899();
		}
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "()V")
	private static void method471() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class3_Sub7 local12 = (Class3_Sub7) aClass56_3.method1281(); local12 != null; local12 = (Class3_Sub7) aClass56_3.method1278()) {
			local17 = local12.method4905();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method4903();
			local7 |= local12.method4901();
			local3 += local12.method4898();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static211.anInt4143 : Static211.anInt4142;
		} else if (local1 == 1) {
			local55 = local5 ? Static211.anInt4141 : Static211.anInt4140;
		} else {
			local55 = local5 ? Static211.anInt4138 : Static211.anInt4137;
		}
		if (local55 != anInt560) {
			anInt560 = local55;
			aBoolean47 = true;
		}
		local17 = anInt559 > 2 ? 2 : anInt559;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean47 = true;
			aBoolean45 = true;
		}
		if (local7 != aBoolean48) {
			aBoolean49 = local7;
			aBoolean50 = true;
		}
		anInt559 = local3;
	}
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!mi;")
	private static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	private static int anInt5105 = -1;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private static int anInt5106 = 0;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	private static int anInt5107 = 0;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	private static int anInt5108 = -1;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!bo;")
	private static Class24 aClass24_26 = new Class24();

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private static int anInt5109 = -1;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Z")
	private static boolean aBoolean359 = true;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Z")
	private static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private static int anInt5110 = -1;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Z")
	private static boolean aBoolean361 = true;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Z")
	private static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
	private static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "[I")
	private static int[] anIntArray460 = new int[2];

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private static int anInt5111 = -1;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	private static int anInt5112 = 0;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Z")
	private static boolean aBoolean364 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!na;)Z")
	private static boolean method3955(@OriginalArg(0) Class1_Sub18 arg0) {
		if (anInt5105 != -1) {
			if (arg0.method2870() || arg0.method2876()) {
				if (anInt5109 != -1 && anInt5108 != -1) {
					arg0.method2878(anInt5109, anInt5108);
				}
				arg0.aBoolean253 = true;
				aClass24_26.method473(arg0);
				method3960();
				return true;
			}
			arg0.method2879();
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()Z")
	public static boolean method3956() {
		if (method3963()) {
			return true;
		} else if (!method3957()) {
			return false;
		} else if (method3955(aClass1_Sub18_Sub1_1)) {
			return true;
		} else {
			method3967();
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()Z")
	public static boolean method3957() {
		return anInt5105 != -1 && aClass1_Sub18_Sub1_1.method2870();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z")
	public static boolean method3958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt5105 == -1 || aClass24_26.method472()) {
			aBoolean360 = false;
			return false;
		}
		anInt5107 = arg0;
		anInt5106 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt5109 != arg2 || anInt5108 != arg3) {
			anInt5109 = arg2;
			anInt5108 = arg3;
			for (@Pc(30) Class1 local30 = aClass24_26.method460(); local30 != aClass24_26.aClass1_27; local30 = local30.aClass1_233) {
				((Class1_Sub18) local30).method2878(anInt5109, anInt5108);
			}
			aBoolean361 = true;
			aBoolean364 = true;
		}
		@Pc(49) GL local49 = Static291.aGL1;
		if (aBoolean364) {
			if (anInt5111 != -1 && aBoolean363 != aBoolean362) {
				if (aBoolean362) {
					Static160.method2699(anInt5111);
				} else {
					Static180.method2967(anInt5111);
				}
				anInt5111 = -1;
			}
			if (anInt5111 == -1) {
				aBoolean362 = aBoolean363;
				if (aBoolean362) {
					anInt5111 = Static160.method2704();
				} else {
					anInt5111 = Static180.method2963();
				}
				aBoolean359 = true;
			}
			if (aBoolean362) {
				local49.glBindTexture(34037, anInt5111);
				Static160.method2702(Static160.anInt3368, Static160.anInt3377, anInt5109, anInt5108, Static160.anInt3377, Static160.anInt3381, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt5111);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt5109, anInt5108);
			}
			aBoolean364 = false;
			local16 = true;
		}
		if (aBoolean361) {
			local49.glBindTexture(34037, anIntArray460[0]);
			Static160.method2703(anInt5110, anInt5109, anInt5108);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt5112 > 1) {
				local49.glBindTexture(34037, anIntArray460[1]);
				Static160.method2703(anInt5110, anInt5109, anInt5108);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray460[1]);
				Static160.method2703(anInt5110, 0, 0);
			}
			aBoolean361 = false;
			local16 = true;
		}
		Static180.method2958(anInt5105);
		if (aBoolean359) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray460[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt5112 > 1 ? anIntArray460[1] : 0, 0);
			if (aBoolean362) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt5111, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt5111);
			}
			local49.glDrawBuffer(36064);
			aBoolean359 = false;
			local16 = true;
		}
		if (local16) {
			if (Static180.method2960()) {
				aBoolean360 = true;
			} else {
				Static180.method2964();
				aBoolean361 = true;
				aBoolean364 = true;
				aBoolean359 = true;
				aBoolean360 = false;
			}
		}
		Static291.method4325(-anInt5107, anInt5106 + anInt5108 - Static291.anInt5512);
		return aBoolean360;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	public static void method3959() {
		if (!aBoolean360) {
			return;
		}
		@Pc(4) GL local4 = Static291.aGL1;
		Static291.method4311();
		Static133.method2166();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static291.method4330();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub18 local29;
		for (@Pc(22) Class1_Sub18 local22 = (Class1_Sub18) aClass24_26.method460(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub18) aClass24_26.method464();
			@Pc(33) int local33 = local22.method2871();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method2872(local35, anInt5109, anInt5108, anIntArray460[local15], anInt5111);
				if (local29 == null && local35 == local33 - 1) {
					anInt5106 = Static291.anInt5512 - anInt5106;
					Static291.method4325(0, 0);
					local4.glDrawBuffer(36064);
					Static180.method2964();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt5107, anInt5106 - anInt5108);
					local4.glTexCoord2f((float) anInt5109, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5107 + anInt5109, anInt5106 - anInt5108);
					local4.glTexCoord2f((float) anInt5109, (float) anInt5108);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5107 + anInt5109, anInt5106);
					local4.glTexCoord2f(0.0F, (float) anInt5108);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt5107, anInt5106);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt5109, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5109, 0);
					local4.glTexCoord2f((float) anInt5109, (float) anInt5108);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5109, anInt5108);
					local4.glTexCoord2f(0.0F, (float) anInt5108);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt5108);
					local4.glEnd();
				}
				local22.method2873(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static291.method4333();
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "()V")
	private static void method3960() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub18 local12 = (Class1_Sub18) aClass24_26.method460(); local12 != null; local12 = (Class1_Sub18) aClass24_26.method464()) {
			local17 = local12.method2877();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method2875();
			local7 |= local12.method2874();
			local3 += local12.method2871();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static160.anInt3375 : Static160.anInt3374;
		} else if (local1 == 1) {
			local55 = local5 ? Static160.anInt3373 : Static160.anInt3372;
		} else {
			local55 = local5 ? Static160.anInt3370 : Static160.anInt3369;
		}
		if (local55 != anInt5110) {
			anInt5110 = local55;
			aBoolean361 = true;
		}
		local17 = anInt5112 > 2 ? 2 : anInt5112;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean361 = true;
			aBoolean359 = true;
		}
		if (local7 != aBoolean362) {
			aBoolean363 = local7;
			aBoolean364 = true;
		}
		anInt5112 = local3;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!na;Z)V")
	private static void method3961(@OriginalArg(0) Class1_Sub18 arg0) {
		arg0.aBoolean253 = false;
		arg0.method4616();
		method3960();
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "()V")
	public static void method3962() {
		if (!Static291.aBoolean397 || !Static291.aBoolean410) {
			return;
		}
		@Pc(5) GL local5 = Static291.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray460, 0);
			anInt5105 = Static180.method2957();
		}
		for (@Pc(29) Class1 local29 = aClass24_26.method460(); local29 != null; local29 = aClass24_26.method464()) {
			@Pc(34) Class1_Sub18 local34 = (Class1_Sub18) local29;
			if (!local34.method2876()) {
				local34.method4616();
			}
		}
		if (aClass1_Sub18_Sub1_1 == null) {
			aClass1_Sub18_Sub1_1 = new Class1_Sub18_Sub1();
		}
		if (!aClass1_Sub18_Sub1_1.method2870() && !aClass1_Sub18_Sub1_1.method2876()) {
			aClass1_Sub18_Sub1_1.method2879();
		}
		method3960();
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "()Z")
	public static boolean method3963() {
		return anInt5105 != -1 && aClass1_Sub18_Sub1_1.method2880();
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "()V")
	public static void method3964() {
		if (anInt5105 != -1) {
			Static180.method2966(anInt5105);
			anInt5105 = -1;
			Static291.aGL1.glDeleteTextures(2, anIntArray460, 0);
			anIntArray460[0] = -1;
			anIntArray460[1] = -1;
		}
		if (anInt5111 != -1) {
			if (aBoolean362) {
				Static160.method2699(anInt5111);
			} else {
				Static180.method2967(anInt5111);
			}
			anInt5111 = -1;
		}
		if (!aClass24_26.method472()) {
			for (@Pc(39) Class1 local39 = aClass24_26.method460(); local39 != aClass24_26.aClass1_27; local39 = local39.aClass1_233) {
				((Class1_Sub18) local39).method2879();
			}
		}
		if (aClass1_Sub18_Sub1_1 != null && aClass1_Sub18_Sub1_1.method2870()) {
			aClass1_Sub18_Sub1_1.method2879();
		}
		aBoolean361 = true;
		aBoolean364 = true;
		aBoolean359 = true;
		anInt5108 = -1;
		anInt5109 = -1;
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "()Z")
	public static boolean method3965() {
		return anInt5105 != -1;
	}

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "()V")
	public static void method3967() {
		if (aClass1_Sub18_Sub1_1.method2880()) {
			method3961(aClass1_Sub18_Sub1_1);
		}
	}
}

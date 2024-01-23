import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!um", name = "i", descriptor = "Lclient!wk;")
	private static Class2_Sub21_Sub1 aClass2_Sub21_Sub1_1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	private static int anInt5659 = 0;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	private static int anInt5660 = -1;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!en;")
	private static Class44 aClass44_25 = new Class44();

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	private static int anInt5661 = 0;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	private static int anInt5662 = -1;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	private static int anInt5663 = -1;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Z")
	private static boolean aBoolean374 = true;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "[I")
	private static int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	private static int anInt5664 = 0;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Z")
	private static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Z")
	private static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	private static int anInt5665 = -1;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Z")
	private static boolean aBoolean377 = true;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "I")
	private static int anInt5666 = -1;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "Z")
	private static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Z")
	private static boolean aBoolean379 = true;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
	public static void method4467() {
		if (!aBoolean376) {
			return;
		}
		@Pc(4) GL local4 = Static116.aGL1;
		Static116.method1941();
		Static111.method1884();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static116.method1947();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class2_Sub21 local29;
		for (@Pc(22) Class2_Sub21 local22 = (Class2_Sub21) aClass44_25.method1352(); local22 != null; local22 = local29) {
			local29 = (Class2_Sub21) aClass44_25.method1360();
			@Pc(33) int local33 = local22.method4737();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method4733(local35, anInt5660, anInt5662, anIntArray540[local15], anInt5665);
				if (local29 == null && local35 == local33 - 1) {
					anInt5661 = Static116.anInt2590 - anInt5661;
					Static116.method1969(0, 0);
					local4.glDrawBuffer(36064);
					Static240.method3838();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt5659, anInt5661 - anInt5662);
					local4.glTexCoord2f((float) anInt5660, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5659 + anInt5660, anInt5661 - anInt5662);
					local4.glTexCoord2f((float) anInt5660, (float) anInt5662);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5659 + anInt5660, anInt5661);
					local4.glTexCoord2f(0.0F, (float) anInt5662);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt5659, anInt5661);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt5660, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5660, 0);
					local4.glTexCoord2f((float) anInt5660, (float) anInt5662);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5660, anInt5662);
					local4.glTexCoord2f(0.0F, (float) anInt5662);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt5662);
					local4.glEnd();
				}
				local22.method4739(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static116.method1958();
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()Z")
	public static boolean method4468() {
		if (method4475()) {
			return true;
		} else if (!method4473()) {
			return false;
		} else if (method4472(aClass2_Sub21_Sub1_1)) {
			return true;
		} else {
			method4478();
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()V")
	private static void method4469() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class2_Sub21 local12 = (Class2_Sub21) aClass44_25.method1352(); local12 != null; local12 = (Class2_Sub21) aClass44_25.method1360()) {
			local17 = local12.method4726();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method4735();
			local7 |= local12.method4732();
			local3 += local12.method4737();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static298.anInt5776 : Static298.anInt5775;
		} else if (local1 == 1) {
			local55 = local5 ? Static298.anInt5774 : Static298.anInt5773;
		} else {
			local55 = local5 ? Static298.anInt5771 : Static298.anInt5770;
		}
		if (local55 != anInt5666) {
			anInt5666 = local55;
			aBoolean379 = true;
		}
		local17 = anInt5664 > 2 ? 2 : anInt5664;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean379 = true;
			aBoolean377 = true;
		}
		if (local7 != aBoolean375) {
			aBoolean378 = local7;
			aBoolean374 = true;
		}
		anInt5664 = local3;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "()V")
	public static void method4470() {
		if (!Static116.aBoolean191 || !Static116.aBoolean175) {
			return;
		}
		@Pc(5) GL local5 = Static116.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray540, 0);
			anInt5663 = Static240.method3836();
		}
		for (@Pc(29) Class2 local29 = aClass44_25.method1352(); local29 != null; local29 = aClass44_25.method1360()) {
			@Pc(34) Class2_Sub21 local34 = (Class2_Sub21) local29;
			if (!local34.method4722()) {
				local34.method4743();
			}
		}
		if (aClass2_Sub21_Sub1_1 == null) {
			aClass2_Sub21_Sub1_1 = new Class2_Sub21_Sub1();
		}
		if (!aClass2_Sub21_Sub1_1.method4731() && !aClass2_Sub21_Sub1_1.method4722()) {
			aClass2_Sub21_Sub1_1.method4734();
		}
		method4469();
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "()Z")
	public static boolean method4471() {
		return anInt5663 != -1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nn;)Z")
	private static boolean method4472(@OriginalArg(0) Class2_Sub21 arg0) {
		if (anInt5663 != -1) {
			if (arg0.method4731() || arg0.method4722()) {
				if (anInt5660 != -1 && anInt5662 != -1) {
					arg0.method4736(anInt5660, anInt5662);
				}
				arg0.aBoolean400 = true;
				aClass44_25.method1358(arg0);
				method4469();
				return true;
			}
			arg0.method4734();
		}
		return false;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "()Z")
	public static boolean method4473() {
		return anInt5663 != -1 && aClass2_Sub21_Sub1_1.method4731();
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "()Z")
	public static boolean method4475() {
		return anInt5663 != -1 && aClass2_Sub21_Sub1_1.method4738();
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "()V")
	public static void method4476() {
		if (anInt5663 != -1) {
			Static240.method3837(anInt5663);
			anInt5663 = -1;
			Static116.aGL1.glDeleteTextures(2, anIntArray540, 0);
			anIntArray540[0] = -1;
			anIntArray540[1] = -1;
		}
		if (anInt5665 != -1) {
			if (aBoolean375) {
				Static298.method4556(anInt5665);
			} else {
				Static240.method3839(anInt5665);
			}
			anInt5665 = -1;
		}
		if (!aClass44_25.method1362()) {
			for (@Pc(39) Class2 local39 = aClass44_25.method1352(); local39 != aClass44_25.aClass2_77; local39 = local39.aClass2_232) {
				((Class2_Sub21) local39).method4734();
			}
		}
		if (aClass2_Sub21_Sub1_1 != null && aClass2_Sub21_Sub1_1.method4731()) {
			aClass2_Sub21_Sub1_1.method4734();
		}
		aBoolean379 = true;
		aBoolean374 = true;
		aBoolean377 = true;
		anInt5662 = -1;
		anInt5660 = -1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIII)Z")
	public static boolean method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt5663 == -1 || aClass44_25.method1362()) {
			aBoolean376 = false;
			return false;
		}
		anInt5659 = arg0;
		anInt5661 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt5660 != arg2 || anInt5662 != arg3) {
			anInt5660 = arg2;
			anInt5662 = arg3;
			for (@Pc(30) Class2 local30 = aClass44_25.method1352(); local30 != aClass44_25.aClass2_77; local30 = local30.aClass2_232) {
				((Class2_Sub21) local30).method4736(anInt5660, anInt5662);
			}
			aBoolean379 = true;
			aBoolean374 = true;
		}
		@Pc(49) GL local49 = Static116.aGL1;
		if (aBoolean374) {
			if (anInt5665 != -1 && aBoolean378 != aBoolean375) {
				if (aBoolean375) {
					Static298.method4556(anInt5665);
				} else {
					Static240.method3839(anInt5665);
				}
				anInt5665 = -1;
			}
			if (anInt5665 == -1) {
				aBoolean375 = aBoolean378;
				if (aBoolean375) {
					anInt5665 = Static298.method4553();
				} else {
					anInt5665 = Static240.method3842();
				}
				aBoolean377 = true;
			}
			if (aBoolean375) {
				local49.glBindTexture(34037, anInt5665);
				Static298.method4552(Static298.anInt5769, Static298.anInt5778, anInt5660, anInt5662, Static298.anInt5778, Static298.anInt5782, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt5665);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt5660, anInt5662);
			}
			aBoolean374 = false;
			local16 = true;
		}
		if (aBoolean379) {
			local49.glBindTexture(34037, anIntArray540[0]);
			Static298.method4548(anInt5666, anInt5660, anInt5662);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt5664 > 1) {
				local49.glBindTexture(34037, anIntArray540[1]);
				Static298.method4548(anInt5666, anInt5660, anInt5662);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray540[1]);
				Static298.method4548(anInt5666, 0, 0);
			}
			aBoolean379 = false;
			local16 = true;
		}
		Static240.method3841(anInt5663);
		if (aBoolean377) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray540[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt5664 > 1 ? anIntArray540[1] : 0, 0);
			if (aBoolean375) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt5665, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt5665);
			}
			local49.glDrawBuffer(36064);
			aBoolean377 = false;
			local16 = true;
		}
		if (local16) {
			if (Static240.method3843()) {
				aBoolean376 = true;
			} else {
				Static240.method3838();
				aBoolean379 = true;
				aBoolean374 = true;
				aBoolean377 = true;
				aBoolean376 = false;
			}
		}
		Static116.method1969(-anInt5659, anInt5661 + anInt5662 - Static116.anInt2590);
		return aBoolean376;
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "()V")
	public static void method4478() {
		if (aClass2_Sub21_Sub1_1.method4738()) {
			method4479(aClass2_Sub21_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nn;Z)V")
	private static void method4479(@OriginalArg(0) Class2_Sub21 arg0) {
		arg0.aBoolean400 = false;
		arg0.method4743();
		method4469();
	}
}

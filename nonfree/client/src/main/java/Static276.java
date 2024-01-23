import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!tl;")
	private static Class2_Sub27_Sub1 aClass2_Sub27_Sub1_1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	private static int anInt5722 = 0;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	private static int anInt5723 = -1;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!a;")
	private static Class1 aClass1_32 = new Class1();

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	private static int anInt5724 = 0;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	private static int anInt5725 = -1;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	private static int anInt5726 = -1;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
	private static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
	private static boolean aBoolean459 = true;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
	private static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	private static int anInt5727 = 0;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
	private static boolean aBoolean461 = true;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
	private static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	private static int anInt5728 = -1;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Z")
	private static boolean aBoolean463 = true;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "[I")
	private static int[] anIntArray501 = new int[2];

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	private static int anInt5729 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()Z")
	public static boolean method4587() {
		if (method4597()) {
			return true;
		} else if (!method4591()) {
			return false;
		} else if (method4599(aClass2_Sub27_Sub1_1)) {
			return true;
		} else {
			method4598();
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	private static void method4588() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class2_Sub27 local12 = (Class2_Sub27) aClass1_32.method13(); local12 != null; local12 = (Class2_Sub27) aClass1_32.method9()) {
			local17 = local12.method4325();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method4328();
			local7 |= local12.method4322();
			local3 += local12.method4331();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static48.anInt1126 : Static48.anInt1125;
		} else if (local1 == 1) {
			local55 = local5 ? Static48.anInt1124 : Static48.anInt1123;
		} else {
			local55 = local5 ? Static48.anInt1121 : Static48.anInt1120;
		}
		if (local55 != anInt5728) {
			anInt5728 = local55;
			aBoolean461 = true;
		}
		local17 = anInt5727 > 2 ? 2 : anInt5727;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean461 = true;
			aBoolean459 = true;
		}
		if (local7 != aBoolean458) {
			aBoolean460 = local7;
			aBoolean463 = true;
		}
		anInt5727 = local3;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!uc;Z)V")
	private static void method4589(@OriginalArg(0) Class2_Sub27 arg0) {
		arg0.aBoolean433 = false;
		arg0.method4926();
		method4588();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()Z")
	public static boolean method4590() {
		return anInt5725 != -1;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()Z")
	public static boolean method4591() {
		return anInt5725 != -1 && aClass2_Sub27_Sub1_1.method4324();
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	public static void method4592() {
		if (anInt5725 != -1) {
			Static147.method2590(anInt5725);
			anInt5725 = -1;
			Static60.aGL1.glDeleteTextures(2, anIntArray501, 0);
			anIntArray501[0] = -1;
			anIntArray501[1] = -1;
		}
		if (anInt5729 != -1) {
			if (aBoolean458) {
				Static48.method977(anInt5729);
			} else {
				Static147.method2594(anInt5729);
			}
			anInt5729 = -1;
		}
		if (!aClass1_32.method1()) {
			for (@Pc(39) Class2 local39 = aClass1_32.method13(); local39 != aClass1_32.aClass2_1; local39 = local39.aClass2_231) {
				((Class2_Sub27) local39).method4321();
			}
		}
		if (aClass2_Sub27_Sub1_1 != null && aClass2_Sub27_Sub1_1.method4324()) {
			aClass2_Sub27_Sub1_1.method4321();
		}
		aBoolean461 = true;
		aBoolean463 = true;
		aBoolean459 = true;
		anInt5726 = -1;
		anInt5723 = -1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)Z")
	public static boolean method4593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt5725 == -1 || aClass1_32.method1()) {
			aBoolean462 = false;
			return false;
		}
		anInt5722 = arg0;
		anInt5724 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt5723 != arg2 || anInt5726 != arg3) {
			anInt5723 = arg2;
			anInt5726 = arg3;
			for (@Pc(30) Class2 local30 = aClass1_32.method13(); local30 != aClass1_32.aClass2_1; local30 = local30.aClass2_231) {
				((Class2_Sub27) local30).method4329(anInt5723, anInt5726);
			}
			aBoolean461 = true;
			aBoolean463 = true;
		}
		@Pc(49) GL local49 = Static60.aGL1;
		if (aBoolean463) {
			if (anInt5729 != -1 && aBoolean460 != aBoolean458) {
				if (aBoolean458) {
					Static48.method977(anInt5729);
				} else {
					Static147.method2594(anInt5729);
				}
				anInt5729 = -1;
			}
			if (anInt5729 == -1) {
				aBoolean458 = aBoolean460;
				if (aBoolean458) {
					anInt5729 = Static48.method976();
				} else {
					anInt5729 = Static147.method2595();
				}
				aBoolean459 = true;
			}
			if (aBoolean458) {
				local49.glBindTexture(34037, anInt5729);
				Static48.method978(Static48.anInt1119, Static48.anInt1128, anInt5723, anInt5726, Static48.anInt1128, Static48.anInt1132, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt5729);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt5723, anInt5726);
			}
			aBoolean463 = false;
			local16 = true;
		}
		if (aBoolean461) {
			local49.glBindTexture(34037, anIntArray501[0]);
			Static48.method979(anInt5728, anInt5723, anInt5726);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt5727 > 1) {
				local49.glBindTexture(34037, anIntArray501[1]);
				Static48.method979(anInt5728, anInt5723, anInt5726);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray501[1]);
				Static48.method979(anInt5728, 0, 0);
			}
			aBoolean461 = false;
			local16 = true;
		}
		Static147.method2593(anInt5725);
		if (aBoolean459) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray501[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt5727 > 1 ? anIntArray501[1] : 0, 0);
			if (aBoolean458) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt5729, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt5729);
			}
			local49.glDrawBuffer(36064);
			aBoolean459 = false;
			local16 = true;
		}
		if (local16) {
			if (Static147.method2592()) {
				aBoolean462 = true;
			} else {
				Static147.method2591();
				aBoolean461 = true;
				aBoolean463 = true;
				aBoolean459 = true;
				aBoolean462 = false;
			}
		}
		Static60.method1163(-anInt5722, anInt5724 + anInt5726 - Static60.anInt1344);
		return aBoolean462;
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()V")
	public static void method4594() {
		if (!Static60.aBoolean99 || !Static60.aBoolean108) {
			return;
		}
		@Pc(5) GL local5 = Static60.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray501, 0);
			anInt5725 = Static147.method2597();
		}
		for (@Pc(29) Class2 local29 = aClass1_32.method13(); local29 != null; local29 = aClass1_32.method9()) {
			@Pc(34) Class2_Sub27 local34 = (Class2_Sub27) local29;
			if (!local34.method4326()) {
				local34.method4926();
			}
		}
		if (aClass2_Sub27_Sub1_1 == null) {
			aClass2_Sub27_Sub1_1 = new Class2_Sub27_Sub1();
		}
		if (!aClass2_Sub27_Sub1_1.method4324() && !aClass2_Sub27_Sub1_1.method4326()) {
			aClass2_Sub27_Sub1_1.method4321();
		}
		method4588();
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "()V")
	public static void method4596() {
		if (!aBoolean462) {
			return;
		}
		@Pc(4) GL local4 = Static60.aGL1;
		Static60.method1177();
		Static94.method1750();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static60.method1158();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class2_Sub27 local29;
		for (@Pc(22) Class2_Sub27 local22 = (Class2_Sub27) aClass1_32.method13(); local22 != null; local22 = local29) {
			local29 = (Class2_Sub27) aClass1_32.method9();
			@Pc(33) int local33 = local22.method4331();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method4330(local35, anInt5723, anInt5726, anIntArray501[local15], anInt5729);
				if (local29 == null && local35 == local33 - 1) {
					anInt5724 = Static60.anInt1344 - anInt5724;
					Static60.method1163(0, 0);
					local4.glDrawBuffer(36064);
					Static147.method2591();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt5722, anInt5724 - anInt5726);
					local4.glTexCoord2f((float) anInt5723, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5722 + anInt5723, anInt5724 - anInt5726);
					local4.glTexCoord2f((float) anInt5723, (float) anInt5726);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5722 + anInt5723, anInt5724);
					local4.glTexCoord2f(0.0F, (float) anInt5726);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt5722, anInt5724);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt5723, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt5723, 0);
					local4.glTexCoord2f((float) anInt5723, (float) anInt5726);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt5723, anInt5726);
					local4.glTexCoord2f(0.0F, (float) anInt5726);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt5726);
					local4.glEnd();
				}
				local22.method4327(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static60.method1145();
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "()Z")
	public static boolean method4597() {
		return anInt5725 != -1 && aClass2_Sub27_Sub1_1.method4323();
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "()V")
	public static void method4598() {
		if (aClass2_Sub27_Sub1_1.method4323()) {
			method4589(aClass2_Sub27_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!uc;)Z")
	private static boolean method4599(@OriginalArg(0) Class2_Sub27 arg0) {
		if (anInt5725 != -1) {
			if (arg0.method4324() || arg0.method4326()) {
				if (anInt5723 != -1 && anInt5726 != -1) {
					arg0.method4329(anInt5723, anInt5726);
				}
				arg0.aBoolean433 = true;
				aClass1_32.method11(arg0);
				method4588();
				return true;
			}
			arg0.method4321();
		}
		return false;
	}
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Lclient!dd;")
	private static Class4_Sub4_Sub1 aClass4_Sub4_Sub1_1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	private static int anInt1025 = 0;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	private static int anInt1026 = 0;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	private static int anInt1027 = -1;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	private static int anInt1028 = -1;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	private static int anInt1029 = -1;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!ll;")
	private static Class114 aClass114_5 = new Class114();

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
	private static boolean aBoolean57 = true;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Z")
	private static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Z")
	private static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Z")
	private static boolean aBoolean60 = true;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	private static int anInt1030 = 0;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Z")
	private static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Z")
	private static boolean aBoolean62 = true;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
	private static int[] anIntArray83 = new int[2];

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	private static int anInt1031 = -1;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "I")
	private static int anInt1032 = -1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	private static void method870() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class4_Sub4 local12 = (Class4_Sub4) aClass114_5.method2623(); local12 != null; local12 = (Class4_Sub4) aClass114_5.method2629()) {
			local17 = local12.method754();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method764();
			local7 |= local12.method767();
			local3 += local12.method753();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static267.anInt5142 : Static267.anInt5141;
		} else if (local1 == 1) {
			local55 = local5 ? Static267.anInt5140 : Static267.anInt5139;
		} else {
			local55 = local5 ? Static267.anInt5137 : Static267.anInt5136;
		}
		if (local55 != anInt1031) {
			anInt1031 = local55;
			aBoolean60 = true;
		}
		local17 = anInt1030 > 2 ? 2 : anInt1030;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean60 = true;
			aBoolean62 = true;
		}
		if (local7 != aBoolean61) {
			aBoolean59 = local7;
			aBoolean57 = true;
		}
		anInt1030 = local3;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()Z")
	public static boolean method871() {
		if (method881()) {
			return true;
		} else if (!method877()) {
			return false;
		} else if (method875(aClass4_Sub4_Sub1_1)) {
			return true;
		} else {
			method873();
			return false;
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "()V")
	public static void method872() {
		if (!Static94.aBoolean134 || !Static94.aBoolean127) {
			return;
		}
		@Pc(5) GL local5 = Static94.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray83, 0);
			anInt1028 = Static14.method210();
		}
		for (@Pc(29) Class4 local29 = aClass114_5.method2623(); local29 != null; local29 = aClass114_5.method2629()) {
			@Pc(34) Class4_Sub4 local34 = (Class4_Sub4) local29;
			if (!local34.method762()) {
				local34.method4854();
			}
		}
		if (aClass4_Sub4_Sub1_1 == null) {
			aClass4_Sub4_Sub1_1 = new Class4_Sub4_Sub1();
		}
		if (!aClass4_Sub4_Sub1_1.method766() && !aClass4_Sub4_Sub1_1.method762()) {
			aClass4_Sub4_Sub1_1.method760();
		}
		method870();
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "()V")
	public static void method873() {
		if (aClass4_Sub4_Sub1_1.method755()) {
			method876(aClass4_Sub4_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z")
	public static boolean method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1028 == -1 || aClass114_5.method2622()) {
			aBoolean58 = false;
			return false;
		}
		anInt1026 = arg0;
		anInt1025 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt1029 != arg2 || anInt1027 != arg3) {
			anInt1029 = arg2;
			anInt1027 = arg3;
			for (@Pc(30) Class4 local30 = aClass114_5.method2623(); local30 != aClass114_5.aClass4_117; local30 = local30.aClass4_235) {
				((Class4_Sub4) local30).method765(anInt1029, anInt1027);
			}
			aBoolean60 = true;
			aBoolean57 = true;
		}
		@Pc(49) GL local49 = Static94.aGL1;
		if (aBoolean57) {
			if (anInt1032 != -1 && aBoolean59 != aBoolean61) {
				if (aBoolean61) {
					Static267.method4206(anInt1032);
				} else {
					Static14.method214(anInt1032);
				}
				anInt1032 = -1;
			}
			if (anInt1032 == -1) {
				aBoolean61 = aBoolean59;
				if (aBoolean61) {
					anInt1032 = Static267.method4209();
				} else {
					anInt1032 = Static14.method207();
				}
				aBoolean62 = true;
			}
			if (aBoolean61) {
				local49.glBindTexture(34037, anInt1032);
				Static267.method4203(Static267.anInt5135, Static267.anInt5144, anInt1029, anInt1027, Static267.anInt5144, Static267.anInt5148, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt1032);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt1029, anInt1027);
			}
			aBoolean57 = false;
			local16 = true;
		}
		if (aBoolean60) {
			local49.glBindTexture(34037, anIntArray83[0]);
			Static267.method4204(anInt1031, anInt1029, anInt1027);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt1030 > 1) {
				local49.glBindTexture(34037, anIntArray83[1]);
				Static267.method4204(anInt1031, anInt1029, anInt1027);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray83[1]);
				Static267.method4204(anInt1031, 0, 0);
			}
			aBoolean60 = false;
			local16 = true;
		}
		Static14.method216(anInt1028);
		if (aBoolean62) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray83[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt1030 > 1 ? anIntArray83[1] : 0, 0);
			if (aBoolean61) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt1032, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt1032);
			}
			local49.glDrawBuffer(36064);
			aBoolean62 = false;
			local16 = true;
		}
		if (local16) {
			if (Static14.method217()) {
				aBoolean58 = true;
			} else {
				Static14.method215();
				aBoolean60 = true;
				aBoolean57 = true;
				aBoolean62 = true;
				aBoolean58 = false;
			}
		}
		Static94.method1584(-anInt1026, anInt1025 + anInt1027 - Static94.anInt2083);
		return aBoolean58;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bc;)Z")
	private static boolean method875(@OriginalArg(0) Class4_Sub4 arg0) {
		if (anInt1028 != -1) {
			if (arg0.method766() || arg0.method762()) {
				if (anInt1029 != -1 && anInt1027 != -1) {
					arg0.method765(anInt1029, anInt1027);
				}
				arg0.aBoolean54 = true;
				aClass114_5.method2625(arg0);
				method870();
				return true;
			}
			arg0.method760();
		}
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!bc;Z)V")
	private static void method876(@OriginalArg(0) Class4_Sub4 arg0) {
		arg0.aBoolean54 = false;
		arg0.method4854();
		method870();
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "()Z")
	public static boolean method877() {
		return anInt1028 != -1 && aClass4_Sub4_Sub1_1.method766();
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "()Z")
	public static boolean method879() {
		return anInt1028 != -1;
	}

	@OriginalMember(owner = "client!di", name = "h", descriptor = "()V")
	public static void method880() {
		if (!aBoolean58) {
			return;
		}
		@Pc(4) GL local4 = Static94.aGL1;
		Static94.method1596();
		Static104.method1699();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static94.method1589();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class4_Sub4 local29;
		for (@Pc(22) Class4_Sub4 local22 = (Class4_Sub4) aClass114_5.method2623(); local22 != null; local22 = local29) {
			local29 = (Class4_Sub4) aClass114_5.method2629();
			@Pc(33) int local33 = local22.method753();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method761(local35, anInt1029, anInt1027, anIntArray83[local15], anInt1032);
				if (local29 == null && local35 == local33 - 1) {
					anInt1025 = Static94.anInt2083 - anInt1025;
					Static94.method1584(0, 0);
					local4.glDrawBuffer(36064);
					Static14.method215();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt1026, anInt1025 - anInt1027);
					local4.glTexCoord2f((float) anInt1029, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt1026 + anInt1029, anInt1025 - anInt1027);
					local4.glTexCoord2f((float) anInt1029, (float) anInt1027);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt1026 + anInt1029, anInt1025);
					local4.glTexCoord2f(0.0F, (float) anInt1027);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt1026, anInt1025);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt1029, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt1029, 0);
					local4.glTexCoord2f((float) anInt1029, (float) anInt1027);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt1029, anInt1027);
					local4.glTexCoord2f(0.0F, (float) anInt1027);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt1027);
					local4.glEnd();
				}
				local22.method756(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static94.method1591();
	}

	@OriginalMember(owner = "client!di", name = "i", descriptor = "()Z")
	public static boolean method881() {
		return anInt1028 != -1 && aClass4_Sub4_Sub1_1.method755();
	}

	@OriginalMember(owner = "client!di", name = "j", descriptor = "()V")
	public static void method882() {
		if (anInt1028 != -1) {
			Static14.method211(anInt1028);
			anInt1028 = -1;
			Static94.aGL1.glDeleteTextures(2, anIntArray83, 0);
			anIntArray83[0] = -1;
			anIntArray83[1] = -1;
		}
		if (anInt1032 != -1) {
			if (aBoolean61) {
				Static267.method4206(anInt1032);
			} else {
				Static14.method214(anInt1032);
			}
			anInt1032 = -1;
		}
		if (!aClass114_5.method2622()) {
			for (@Pc(39) Class4 local39 = aClass114_5.method2623(); local39 != aClass114_5.aClass4_117; local39 = local39.aClass4_235) {
				((Class4_Sub4) local39).method760();
			}
		}
		if (aClass4_Sub4_Sub1_1 != null && aClass4_Sub4_Sub1_1.method766()) {
			aClass4_Sub4_Sub1_1.method760();
		}
		aBoolean60 = true;
		aBoolean57 = true;
		aBoolean62 = true;
		anInt1027 = -1;
		anInt1029 = -1;
	}
}

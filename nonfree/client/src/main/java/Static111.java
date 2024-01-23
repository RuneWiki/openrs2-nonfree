import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!nm;")
	private static Class1_Sub21_Sub1 aClass1_Sub21_Sub1_1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	private static int anInt2067 = -1;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!hh;")
	private static Class69 aClass69_10 = new Class69();

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	private static int anInt2068 = 0;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	private static int anInt2069 = -1;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	private static int anInt2070 = 0;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	private static int anInt2071 = -1;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Z")
	private static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Z")
	private static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	private static int anInt2072 = -1;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	private static int anInt2073 = 0;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
	private static int[] anIntArray269 = new int[2];

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Z")
	private static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
	private static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	private static int anInt2074 = -1;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
	private static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Z")
	private static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public static void method1730() {
		if (!Static240.aBoolean370 || !Static240.aBoolean376) {
			return;
		}
		@Pc(5) GL local5 = Static240.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray269, 0);
			anInt2069 = Static157.method2452();
		}
		for (@Pc(29) Class1 local29 = aClass69_10.method1636(); local29 != null; local29 = aClass69_10.method1631()) {
			@Pc(34) Class1_Sub21 local34 = (Class1_Sub21) local29;
			if (!local34.method2736()) {
				local34.method4534();
			}
		}
		if (aClass1_Sub21_Sub1_1 == null) {
			aClass1_Sub21_Sub1_1 = new Class1_Sub21_Sub1();
		}
		if (!aClass1_Sub21_Sub1_1.method2730() && !aClass1_Sub21_Sub1_1.method2736()) {
			aClass1_Sub21_Sub1_1.method2729();
		}
		method1740();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()Z")
	public static boolean method1731() {
		if (method1735()) {
			return true;
		} else if (!method1737()) {
			return false;
		} else if (method1738(aClass1_Sub21_Sub1_1)) {
			return true;
		} else {
			method1732();
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
	public static void method1732() {
		if (aClass1_Sub21_Sub1_1.method2733()) {
			method1734(aClass1_Sub21_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()V")
	public static void method1733() {
		if (!aBoolean152) {
			return;
		}
		@Pc(4) GL local4 = Static240.aGL1;
		Static240.method3779();
		Static50.method869();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static240.method3800();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub21 local29;
		for (@Pc(22) Class1_Sub21 local22 = (Class1_Sub21) aClass69_10.method1636(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub21) aClass69_10.method1631();
			@Pc(33) int local33 = local22.method2735();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method2726(local35, anInt2071, anInt2067, anIntArray269[local15], anInt2074);
				if (local29 == null && local35 == local33 - 1) {
					anInt2070 = Static240.anInt4961 - anInt2070;
					Static240.method3777(0, 0);
					local4.glDrawBuffer(36064);
					Static157.method2446();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt2068, anInt2070 - anInt2067);
					local4.glTexCoord2f((float) anInt2071, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt2068 + anInt2071, anInt2070 - anInt2067);
					local4.glTexCoord2f((float) anInt2071, (float) anInt2067);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt2068 + anInt2071, anInt2070);
					local4.glTexCoord2f(0.0F, (float) anInt2067);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt2068, anInt2070);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt2071, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt2071, 0);
					local4.glTexCoord2f((float) anInt2071, (float) anInt2067);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt2071, anInt2067);
					local4.glTexCoord2f(0.0F, (float) anInt2067);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt2067);
					local4.glEnd();
				}
				local22.method2728(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static240.method3808();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!sj;Z)V")
	private static void method1734(@OriginalArg(0) Class1_Sub21 arg0) {
		arg0.aBoolean249 = false;
		arg0.method4534();
		method1740();
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "()Z")
	public static boolean method1735() {
		return anInt2069 != -1 && aClass1_Sub21_Sub1_1.method2733();
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "()V")
	public static void method1736() {
		if (anInt2069 != -1) {
			Static157.method2443(anInt2069);
			anInt2069 = -1;
			Static240.aGL1.glDeleteTextures(2, anIntArray269, 0);
			anIntArray269[0] = -1;
			anIntArray269[1] = -1;
		}
		if (anInt2074 != -1) {
			if (aBoolean155) {
				Static231.method3694(anInt2074);
			} else {
				Static157.method2450(anInt2074);
			}
			anInt2074 = -1;
		}
		if (!aClass69_10.method1626()) {
			for (@Pc(39) Class1 local39 = aClass69_10.method1636(); local39 != aClass69_10.aClass1_85; local39 = local39.aClass1_230) {
				((Class1_Sub21) local39).method2729();
			}
		}
		if (aClass1_Sub21_Sub1_1 != null && aClass1_Sub21_Sub1_1.method2730()) {
			aClass1_Sub21_Sub1_1.method2729();
		}
		aBoolean151 = true;
		aBoolean156 = true;
		aBoolean154 = true;
		anInt2067 = -1;
		anInt2071 = -1;
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "()Z")
	public static boolean method1737() {
		return anInt2069 != -1 && aClass1_Sub21_Sub1_1.method2730();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!sj;)Z")
	private static boolean method1738(@OriginalArg(0) Class1_Sub21 arg0) {
		if (anInt2069 != -1) {
			if (arg0.method2730() || arg0.method2736()) {
				if (anInt2071 != -1 && anInt2067 != -1) {
					arg0.method2731(anInt2071, anInt2067);
				}
				arg0.aBoolean249 = true;
				aClass69_10.method1628(arg0);
				method1740();
				return true;
			}
			arg0.method2729();
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "()Z")
	public static boolean method1739() {
		return anInt2069 != -1;
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "()V")
	private static void method1740() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) aClass69_10.method1636(); local12 != null; local12 = (Class1_Sub21) aClass69_10.method1631()) {
			local17 = local12.method2734();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method2725();
			local7 |= local12.method2723();
			local3 += local12.method2735();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static231.anInt4847 : Static231.anInt4846;
		} else if (local1 == 1) {
			local55 = local5 ? Static231.anInt4845 : Static231.anInt4844;
		} else {
			local55 = local5 ? Static231.anInt4842 : Static231.anInt4841;
		}
		if (local55 != anInt2072) {
			anInt2072 = local55;
			aBoolean151 = true;
		}
		local17 = anInt2073 > 2 ? 2 : anInt2073;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean151 = true;
			aBoolean154 = true;
		}
		if (local7 != aBoolean155) {
			aBoolean153 = local7;
			aBoolean156 = true;
		}
		anInt2073 = local3;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)Z")
	public static boolean method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2069 == -1 || aClass69_10.method1626()) {
			aBoolean152 = false;
			return false;
		}
		anInt2068 = arg0;
		anInt2070 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt2071 != arg2 || anInt2067 != arg3) {
			anInt2071 = arg2;
			anInt2067 = arg3;
			for (@Pc(30) Class1 local30 = aClass69_10.method1636(); local30 != aClass69_10.aClass1_85; local30 = local30.aClass1_230) {
				((Class1_Sub21) local30).method2731(anInt2071, anInt2067);
			}
			aBoolean151 = true;
			aBoolean156 = true;
		}
		@Pc(49) GL local49 = Static240.aGL1;
		if (aBoolean156) {
			if (anInt2074 != -1 && aBoolean153 != aBoolean155) {
				if (aBoolean155) {
					Static231.method3694(anInt2074);
				} else {
					Static157.method2450(anInt2074);
				}
				anInt2074 = -1;
			}
			if (anInt2074 == -1) {
				aBoolean155 = aBoolean153;
				if (aBoolean155) {
					anInt2074 = Static231.method3699();
				} else {
					anInt2074 = Static157.method2444();
				}
				aBoolean154 = true;
			}
			if (aBoolean155) {
				local49.glBindTexture(34037, anInt2074);
				Static231.method3700(Static231.anInt4840, Static231.anInt4849, anInt2071, anInt2067, Static231.anInt4849, Static231.anInt4853, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt2074);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt2071, anInt2067);
			}
			aBoolean156 = false;
			local16 = true;
		}
		if (aBoolean151) {
			local49.glBindTexture(34037, anIntArray269[0]);
			Static231.method3695(anInt2072, anInt2071, anInt2067);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt2073 > 1) {
				local49.glBindTexture(34037, anIntArray269[1]);
				Static231.method3695(anInt2072, anInt2071, anInt2067);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray269[1]);
				Static231.method3695(anInt2072, 0, 0);
			}
			aBoolean151 = false;
			local16 = true;
		}
		Static157.method2445(anInt2069);
		if (aBoolean154) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray269[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt2073 > 1 ? anIntArray269[1] : 0, 0);
			if (aBoolean155) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt2074, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt2074);
			}
			local49.glDrawBuffer(36064);
			aBoolean154 = false;
			local16 = true;
		}
		if (local16) {
			if (Static157.method2449()) {
				aBoolean152 = true;
			} else {
				Static157.method2446();
				aBoolean151 = true;
				aBoolean156 = true;
				aBoolean154 = true;
				aBoolean152 = false;
			}
		}
		Static240.method3777(-anInt2068, anInt2070 + anInt2067 - Static240.anInt4961);
		return aBoolean152;
	}
}

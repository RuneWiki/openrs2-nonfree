import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!fc;")
	private static Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!jo;")
	private static Class96 aClass96_9 = new Class96();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private static int anInt3076 = 0;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private static int anInt3077 = -1;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private static int anInt3078 = 0;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	private static int anInt3079 = -1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	private static int anInt3080 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private static int anInt3081 = 0;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private static int anInt3082 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	private static boolean aBoolean262 = true;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	private static boolean aBoolean263 = false;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	private static int anInt3083 = -1;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
	private static int[] anIntArray264 = new int[2];

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	private static boolean aBoolean265 = true;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
	private static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
	private static boolean aBoolean267 = true;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
	private static void method2645() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) aClass96_9.method2340(); local12 != null; local12 = (Class1_Sub12) aClass96_9.method2342()) {
			local17 = local12.method1365();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method1373();
			local7 |= local12.method1370();
			local3 += local12.method1371();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static157.anInt3135 : Static157.anInt3134;
		} else if (local1 == 1) {
			local55 = local5 ? Static157.anInt3133 : Static157.anInt3132;
		} else {
			local55 = local5 ? Static157.anInt3130 : Static157.anInt3129;
		}
		if (local55 != anInt3082) {
			anInt3082 = local55;
			aBoolean267 = true;
		}
		local17 = anInt3081 > 2 ? 2 : anInt3081;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean267 = true;
			aBoolean262 = true;
		}
		if (local7 != aBoolean264) {
			aBoolean263 = local7;
			aBoolean265 = true;
		}
		anInt3081 = local3;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!je;)Z")
	private static boolean method2646(@OriginalArg(0) Class1_Sub12 arg0) {
		if (anInt3077 != -1) {
			if (arg0.method1368() || arg0.method1362()) {
				if (anInt3079 != -1 && anInt3080 != -1) {
					arg0.method1369(anInt3079, anInt3080);
				}
				arg0.aBoolean150 = true;
				aClass96_9.method2336(arg0);
				method2645();
				return true;
			}
			arg0.method1372();
		}
		return false;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!je;Z)V")
	private static void method2647(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.aBoolean150 = false;
		arg0.method4573();
		method2645();
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()Z")
	public static boolean method2649() {
		if (method2651()) {
			return true;
		} else if (!method2652()) {
			return false;
		} else if (method2646(aClass1_Sub12_Sub1_1)) {
			return true;
		} else {
			method2657();
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()V")
	public static void method2650() {
		if (anInt3077 != -1) {
			Static127.method2238(anInt3077);
			anInt3077 = -1;
			Static71.aGL1.glDeleteTextures(2, anIntArray264, 0);
			anIntArray264[0] = -1;
			anIntArray264[1] = -1;
		}
		if (anInt3083 != -1) {
			if (aBoolean264) {
				Static157.method2701(anInt3083);
			} else {
				Static127.method2235(anInt3083);
			}
			anInt3083 = -1;
		}
		if (!aClass96_9.method2343()) {
			for (@Pc(39) Class1 local39 = aClass96_9.method2340(); local39 != aClass96_9.aClass1_109; local39 = local39.aClass1_235) {
				((Class1_Sub12) local39).method1372();
			}
		}
		if (aClass1_Sub12_Sub1_1 != null && aClass1_Sub12_Sub1_1.method1368()) {
			aClass1_Sub12_Sub1_1.method1372();
		}
		aBoolean267 = true;
		aBoolean265 = true;
		aBoolean262 = true;
		anInt3080 = -1;
		anInt3079 = -1;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "()Z")
	public static boolean method2651() {
		return anInt3077 != -1 && aClass1_Sub12_Sub1_1.method1363();
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "()Z")
	public static boolean method2652() {
		return anInt3077 != -1 && aClass1_Sub12_Sub1_1.method1368();
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()V")
	public static void method2653() {
		if (!aBoolean266) {
			return;
		}
		@Pc(4) GL local4 = Static71.aGL1;
		Static71.method1396();
		Static93.method1776();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static71.method1384();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub12 local29;
		for (@Pc(22) Class1_Sub12 local22 = (Class1_Sub12) aClass96_9.method2340(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub12) aClass96_9.method2342();
			@Pc(33) int local33 = local22.method1371();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method1360(local35, anInt3079, anInt3080, anIntArray264[local15], anInt3083);
				if (local29 == null && local35 == local33 - 1) {
					anInt3076 = Static71.anInt1537 - anInt3076;
					Static71.method1391(0, 0);
					local4.glDrawBuffer(36064);
					Static127.method2237();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt3078, anInt3076 - anInt3080);
					local4.glTexCoord2f((float) anInt3079, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3078 + anInt3079, anInt3076 - anInt3080);
					local4.glTexCoord2f((float) anInt3079, (float) anInt3080);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3078 + anInt3079, anInt3076);
					local4.glTexCoord2f(0.0F, (float) anInt3080);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt3078, anInt3076);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt3079, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3079, 0);
					local4.glTexCoord2f((float) anInt3079, (float) anInt3080);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3079, anInt3080);
					local4.glTexCoord2f(0.0F, (float) anInt3080);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt3080);
					local4.glEnd();
				}
				local22.method1361(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static71.method1395();
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "()Z")
	public static boolean method2654() {
		return anInt3077 != -1;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "()V")
	public static void method2655() {
		if (!Static71.aBoolean166 || !Static71.aBoolean152) {
			return;
		}
		@Pc(5) GL local5 = Static71.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray264, 0);
			anInt3077 = Static127.method2240();
		}
		for (@Pc(29) Class1 local29 = aClass96_9.method2340(); local29 != null; local29 = aClass96_9.method2342()) {
			@Pc(34) Class1_Sub12 local34 = (Class1_Sub12) local29;
			if (!local34.method1362()) {
				local34.method4573();
			}
		}
		if (aClass1_Sub12_Sub1_1 == null) {
			aClass1_Sub12_Sub1_1 = new Class1_Sub12_Sub1();
		}
		if (!aClass1_Sub12_Sub1_1.method1368() && !aClass1_Sub12_Sub1_1.method1362()) {
			aClass1_Sub12_Sub1_1.method1372();
		}
		method2645();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)Z")
	public static boolean method2656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3077 == -1 || aClass96_9.method2343()) {
			aBoolean266 = false;
			return false;
		}
		anInt3078 = arg0;
		anInt3076 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt3079 != arg2 || anInt3080 != arg3) {
			anInt3079 = arg2;
			anInt3080 = arg3;
			for (@Pc(30) Class1 local30 = aClass96_9.method2340(); local30 != aClass96_9.aClass1_109; local30 = local30.aClass1_235) {
				((Class1_Sub12) local30).method1369(anInt3079, anInt3080);
			}
			aBoolean267 = true;
			aBoolean265 = true;
		}
		@Pc(49) GL local49 = Static71.aGL1;
		if (aBoolean265) {
			if (anInt3083 != -1 && aBoolean263 != aBoolean264) {
				if (aBoolean264) {
					Static157.method2701(anInt3083);
				} else {
					Static127.method2235(anInt3083);
				}
				anInt3083 = -1;
			}
			if (anInt3083 == -1) {
				aBoolean264 = aBoolean263;
				if (aBoolean264) {
					anInt3083 = Static157.method2694();
				} else {
					anInt3083 = Static127.method2233();
				}
				aBoolean262 = true;
			}
			if (aBoolean264) {
				local49.glBindTexture(34037, anInt3083);
				Static157.method2697(Static157.anInt3128, Static157.anInt3137, anInt3079, anInt3080, Static157.anInt3137, Static157.anInt3141, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt3083);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt3079, anInt3080);
			}
			aBoolean265 = false;
			local16 = true;
		}
		if (aBoolean267) {
			local49.glBindTexture(34037, anIntArray264[0]);
			Static157.method2700(anInt3082, anInt3079, anInt3080);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt3081 > 1) {
				local49.glBindTexture(34037, anIntArray264[1]);
				Static157.method2700(anInt3082, anInt3079, anInt3080);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray264[1]);
				Static157.method2700(anInt3082, 0, 0);
			}
			aBoolean267 = false;
			local16 = true;
		}
		Static127.method2242(anInt3077);
		if (aBoolean262) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray264[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt3081 > 1 ? anIntArray264[1] : 0, 0);
			if (aBoolean264) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt3083, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt3083);
			}
			local49.glDrawBuffer(36064);
			aBoolean262 = false;
			local16 = true;
		}
		if (local16) {
			if (Static127.method2236()) {
				aBoolean266 = true;
			} else {
				Static127.method2237();
				aBoolean267 = true;
				aBoolean265 = true;
				aBoolean262 = true;
				aBoolean266 = false;
			}
		}
		Static71.method1391(-anInt3078, anInt3076 + anInt3080 - Static71.anInt1537);
		return aBoolean266;
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "()V")
	public static void method2657() {
		if (aClass1_Sub12_Sub1_1.method1363()) {
			method2647(aClass1_Sub12_Sub1_1);
		}
	}
}

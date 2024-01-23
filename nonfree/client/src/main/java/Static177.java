import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Lclient!ec;")
	private static Class1_Sub12_Sub1 aClass1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	private static int anInt3418 = -1;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!gj;")
	private static Class59 aClass59_28 = new Class59();

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	private static int anInt3419 = 0;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	private static int anInt3420 = 0;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	private static int anInt3421 = -1;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
	private static int anInt3422 = -1;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Z")
	private static boolean aBoolean226 = true;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
	private static boolean aBoolean227 = true;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Z")
	private static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	private static int anInt3423 = -1;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Z")
	private static boolean aBoolean229 = true;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
	private static int anInt3424 = 0;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "[I")
	private static int[] anIntArray287 = new int[2];

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
	private static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Z")
	private static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	private static int anInt3425 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!pg;)Z")
	private static boolean method2950(@OriginalArg(0) Class1_Sub12 arg0) {
		if (anInt3421 != -1) {
			if (arg0.method1101() || arg0.method1095()) {
				if (anInt3422 != -1 && anInt3418 != -1) {
					arg0.method1092(anInt3422, anInt3418);
				}
				arg0.aBoolean70 = true;
				aClass59_28.method1706(arg0);
				method2951();
				return true;
			}
			arg0.method1090();
		}
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()V")
	private static void method2951() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) aClass59_28.method1704(); local12 != null; local12 = (Class1_Sub12) aClass59_28.method1701()) {
			local17 = local12.method1087();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method1091();
			local7 |= local12.method1093();
			local3 += local12.method1086();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static121.anInt2519 : Static121.anInt2518;
		} else if (local1 == 1) {
			local55 = local5 ? Static121.anInt2517 : Static121.anInt2516;
		} else {
			local55 = local5 ? Static121.anInt2514 : Static121.anInt2513;
		}
		if (local55 != anInt3425) {
			anInt3425 = local55;
			aBoolean229 = true;
		}
		local17 = anInt3424 > 2 ? 2 : anInt3424;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean229 = true;
			aBoolean227 = true;
		}
		if (local7 != aBoolean228) {
			aBoolean230 = local7;
			aBoolean226 = true;
		}
		anInt3424 = local3;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
	public static void method2952() {
		if (anInt3421 != -1) {
			Static14.method186(anInt3421);
			anInt3421 = -1;
			Static156.aGL1.glDeleteTextures(2, anIntArray287, 0);
			anIntArray287[0] = -1;
			anIntArray287[1] = -1;
		}
		if (anInt3423 != -1) {
			if (aBoolean228) {
				Static121.method2157(anInt3423);
			} else {
				Static14.method189(anInt3423);
			}
			anInt3423 = -1;
		}
		if (!aClass59_28.method1709()) {
			for (@Pc(39) Class1 local39 = aClass59_28.method1704(); local39 != aClass59_28.aClass1_83; local39 = local39.aClass1_235) {
				((Class1_Sub12) local39).method1090();
			}
		}
		if (aClass1_Sub12_Sub1_1 != null && aClass1_Sub12_Sub1_1.method1101()) {
			aClass1_Sub12_Sub1_1.method1090();
		}
		aBoolean229 = true;
		aBoolean226 = true;
		aBoolean227 = true;
		anInt3418 = -1;
		anInt3422 = -1;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()V")
	public static void method2953() {
		if (aClass1_Sub12_Sub1_1.method1099()) {
			method2958(aClass1_Sub12_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	public static void method2954() {
		if (!aBoolean231) {
			return;
		}
		@Pc(4) GL local4 = Static156.aGL1;
		Static156.method2673();
		Static119.method2126();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static156.method2656();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class1_Sub12 local29;
		for (@Pc(22) Class1_Sub12 local22 = (Class1_Sub12) aClass59_28.method1704(); local22 != null; local22 = local29) {
			local29 = (Class1_Sub12) aClass59_28.method1701();
			@Pc(33) int local33 = local22.method1086();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method1097(local35, anInt3422, anInt3418, anIntArray287[local15], anInt3423);
				if (local29 == null && local35 == local33 - 1) {
					anInt3419 = Static156.anInt3095 - anInt3419;
					Static156.method2679(0, 0);
					local4.glDrawBuffer(36064);
					Static14.method193();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt3420, anInt3419 - anInt3418);
					local4.glTexCoord2f((float) anInt3422, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3420 + anInt3422, anInt3419 - anInt3418);
					local4.glTexCoord2f((float) anInt3422, (float) anInt3418);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3420 + anInt3422, anInt3419);
					local4.glTexCoord2f(0.0F, (float) anInt3418);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt3420, anInt3419);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt3422, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt3422, 0);
					local4.glTexCoord2f((float) anInt3422, (float) anInt3418);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt3422, anInt3418);
					local4.glTexCoord2f(0.0F, (float) anInt3418);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt3418);
					local4.glEnd();
				}
				local22.method1089(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static156.method2676();
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()Z")
	public static boolean method2955() {
		return anInt3421 != -1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)Z")
	public static boolean method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3421 == -1 || aClass59_28.method1709()) {
			aBoolean231 = false;
			return false;
		}
		anInt3420 = arg0;
		anInt3419 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt3422 != arg2 || anInt3418 != arg3) {
			anInt3422 = arg2;
			anInt3418 = arg3;
			for (@Pc(30) Class1 local30 = aClass59_28.method1704(); local30 != aClass59_28.aClass1_83; local30 = local30.aClass1_235) {
				((Class1_Sub12) local30).method1092(anInt3422, anInt3418);
			}
			aBoolean229 = true;
			aBoolean226 = true;
		}
		@Pc(49) GL local49 = Static156.aGL1;
		if (aBoolean226) {
			if (anInt3423 != -1 && aBoolean230 != aBoolean228) {
				if (aBoolean228) {
					Static121.method2157(anInt3423);
				} else {
					Static14.method189(anInt3423);
				}
				anInt3423 = -1;
			}
			if (anInt3423 == -1) {
				aBoolean228 = aBoolean230;
				if (aBoolean228) {
					anInt3423 = Static121.method2159();
				} else {
					anInt3423 = Static14.method191();
				}
				aBoolean227 = true;
			}
			if (aBoolean228) {
				local49.glBindTexture(34037, anInt3423);
				Static121.method2154(Static121.anInt2512, Static121.anInt2521, anInt3422, anInt3418, Static121.anInt2521, Static121.anInt2525, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt3423);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt3422, anInt3418);
			}
			aBoolean226 = false;
			local16 = true;
		}
		if (aBoolean229) {
			local49.glBindTexture(34037, anIntArray287[0]);
			Static121.method2160(anInt3425, anInt3422, anInt3418);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt3424 > 1) {
				local49.glBindTexture(34037, anIntArray287[1]);
				Static121.method2160(anInt3425, anInt3422, anInt3418);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray287[1]);
				Static121.method2160(anInt3425, 0, 0);
			}
			aBoolean229 = false;
			local16 = true;
		}
		Static14.method190(anInt3421);
		if (aBoolean227) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray287[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt3424 > 1 ? anIntArray287[1] : 0, 0);
			if (aBoolean228) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt3423, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt3423);
			}
			local49.glDrawBuffer(36064);
			aBoolean227 = false;
			local16 = true;
		}
		if (local16) {
			if (Static14.method188()) {
				aBoolean231 = true;
			} else {
				Static14.method193();
				aBoolean229 = true;
				aBoolean226 = true;
				aBoolean227 = true;
				aBoolean231 = false;
			}
		}
		Static156.method2679(-anInt3420, anInt3419 + anInt3418 - Static156.anInt3095);
		return aBoolean231;
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "()V")
	public static void method2957() {
		if (!Static156.aBoolean194 || !Static156.aBoolean196) {
			return;
		}
		@Pc(5) GL local5 = Static156.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray287, 0);
			anInt3421 = Static14.method185();
		}
		for (@Pc(29) Class1 local29 = aClass59_28.method1704(); local29 != null; local29 = aClass59_28.method1701()) {
			@Pc(34) Class1_Sub12 local34 = (Class1_Sub12) local29;
			if (!local34.method1095()) {
				local34.method4779();
			}
		}
		if (aClass1_Sub12_Sub1_1 == null) {
			aClass1_Sub12_Sub1_1 = new Class1_Sub12_Sub1();
		}
		if (!aClass1_Sub12_Sub1_1.method1101() && !aClass1_Sub12_Sub1_1.method1095()) {
			aClass1_Sub12_Sub1_1.method1090();
		}
		method2951();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!pg;Z)V")
	private static void method2958(@OriginalArg(0) Class1_Sub12 arg0) {
		arg0.aBoolean70 = false;
		arg0.method4779();
		method2951();
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "()Z")
	public static boolean method2959() {
		return anInt3421 != -1 && aClass1_Sub12_Sub1_1.method1099();
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "()Z")
	public static boolean method2960() {
		return anInt3421 != -1 && aClass1_Sub12_Sub1_1.method1101();
	}

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "()Z")
	public static boolean method2961() {
		if (method2959()) {
			return true;
		} else if (!method2960()) {
			return false;
		} else if (method2950(aClass1_Sub12_Sub1_1)) {
			return true;
		} else {
			method2953();
			return false;
		}
	}
}

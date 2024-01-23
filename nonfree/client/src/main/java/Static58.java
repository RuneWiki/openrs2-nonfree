import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!e;")
	private static Class4_Sub12_Sub1 aClass4_Sub12_Sub1_1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	private static int anInt1138 = -1;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!an;")
	private static Class10 aClass10_10 = new Class10();

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	private static int anInt1139 = -1;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	private static int anInt1140 = -1;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	private static int anInt1141 = 0;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	private static int anInt1142 = 0;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
	private static int[] anIntArray129 = new int[2];

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private static int anInt1143 = -1;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
	private static boolean aBoolean84 = true;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Z")
	private static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Z")
	private static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private static int anInt1144 = 0;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private static int anInt1145 = -1;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
	private static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Z")
	private static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Z")
	private static boolean aBoolean89 = true;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()Z")
	public static boolean method930() {
		return anInt1138 != -1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ul;)Z")
	private static boolean method931(@OriginalArg(0) Class4_Sub12 arg0) {
		if (anInt1138 != -1) {
			if (arg0.method912() || arg0.method919()) {
				if (anInt1139 != -1 && anInt1140 != -1) {
					arg0.method911(anInt1139, anInt1140);
				}
				arg0.aBoolean83 = true;
				aClass10_10.method184(arg0);
				method941();
				return true;
			}
			arg0.method905();
		}
		return false;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
	public static void method932() {
		aClass10_10 = null;
		anIntArray129 = null;
		aClass4_Sub12_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()V")
	public static void method933() {
		if (!Static178.aBoolean221 || !Static178.aBoolean228) {
			return;
		}
		@Pc(5) GL local5 = Static178.aGL1;
		@Pc(8) int[] local8 = new int[1];
		local5.glGetIntegerv(36063, local8, 0);
		if (local8[0] >= 2) {
			local5.glGenTextures(2, anIntArray129, 0);
			anInt1138 = Static29.method452();
		}
		for (@Pc(29) Class4 local29 = aClass10_10.method190(); local29 != null; local29 = aClass10_10.method191()) {
			@Pc(34) Class4_Sub12 local34 = (Class4_Sub12) local29;
			if (!local34.method919()) {
				local34.method4391();
			}
		}
		if (aClass4_Sub12_Sub1_1 == null) {
			aClass4_Sub12_Sub1_1 = new Class4_Sub12_Sub1();
		}
		if (!aClass4_Sub12_Sub1_1.method912() && !aClass4_Sub12_Sub1_1.method919()) {
			aClass4_Sub12_Sub1_1.method905();
		}
		method941();
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "()Z")
	public static boolean method934() {
		return anInt1138 != -1 && aClass4_Sub12_Sub1_1.method912();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)Z")
	public static boolean method935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1138 == -1 || aClass10_10.method185()) {
			aBoolean87 = false;
			return false;
		}
		anInt1142 = arg0;
		anInt1141 = arg1;
		@Pc(16) boolean local16 = false;
		if (anInt1139 != arg2 || anInt1140 != arg3) {
			anInt1139 = arg2;
			anInt1140 = arg3;
			for (@Pc(30) Class4 local30 = aClass10_10.method190(); local30 != aClass10_10.aClass4_17; local30 = local30.aClass4_231) {
				((Class4_Sub12) local30).method911(anInt1139, anInt1140);
			}
			aBoolean84 = true;
			aBoolean89 = true;
		}
		@Pc(49) GL local49 = Static178.aGL1;
		if (aBoolean89) {
			if (anInt1143 != -1 && aBoolean86 != aBoolean85) {
				if (aBoolean85) {
					Static144.method2330(anInt1143);
				} else {
					Static29.method454(anInt1143);
				}
				anInt1143 = -1;
			}
			if (anInt1143 == -1) {
				aBoolean85 = aBoolean86;
				if (aBoolean85) {
					anInt1143 = Static144.method2325();
				} else {
					anInt1143 = Static29.method447();
				}
				aBoolean88 = true;
			}
			if (aBoolean85) {
				local49.glBindTexture(34037, anInt1143);
				Static144.method2327(Static144.anInt2928, Static144.anInt2937, anInt1139, anInt1140, Static144.anInt2937, Static144.anInt2941, null);
			} else {
				local49.glBindRenderbufferEXT(36161, anInt1143);
				local49.glRenderbufferStorageEXT(36161, 6402, anInt1139, anInt1140);
			}
			aBoolean89 = false;
			local16 = true;
		}
		if (aBoolean84) {
			local49.glBindTexture(34037, anIntArray129[0]);
			Static144.method2326(anInt1145, anInt1139, anInt1140);
			local49.glTexParameteri(3553, 10241, 9729);
			local49.glTexParameteri(3553, 10240, 9729);
			if (anInt1144 > 1) {
				local49.glBindTexture(34037, anIntArray129[1]);
				Static144.method2326(anInt1145, anInt1139, anInt1140);
				local49.glTexParameteri(3553, 10241, 9729);
				local49.glTexParameteri(3553, 10240, 9729);
			} else {
				local49.glBindTexture(34037, anIntArray129[1]);
				Static144.method2326(anInt1145, 0, 0);
			}
			aBoolean84 = false;
			local16 = true;
		}
		Static29.method451(anInt1138);
		if (aBoolean88) {
			local49.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray129[0], 0);
			local49.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt1144 > 1 ? anIntArray129[1] : 0, 0);
			if (aBoolean85) {
				local49.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt1143, 0);
			} else {
				local49.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt1143);
			}
			local49.glDrawBuffer(36064);
			aBoolean88 = false;
			local16 = true;
		}
		if (local16) {
			if (Static29.method449()) {
				aBoolean87 = true;
			} else {
				Static29.method450();
				aBoolean84 = true;
				aBoolean89 = true;
				aBoolean88 = true;
				aBoolean87 = false;
			}
		}
		Static178.method2761(-anInt1142, anInt1141 + anInt1140 - Static178.anInt3505);
		return aBoolean87;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "()Z")
	public static boolean method936() {
		if (method942()) {
			return true;
		} else if (!method934()) {
			return false;
		} else if (method931(aClass4_Sub12_Sub1_1)) {
			return true;
		} else {
			method939();
			return false;
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "()V")
	public static void method937() {
		if (!aBoolean87) {
			return;
		}
		@Pc(4) GL local4 = Static178.aGL1;
		Static178.method2782();
		Static186.method2957();
		local4.glDisable(3042);
		local4.glDisable(3008);
		Static178.method2784();
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 1;
		@Pc(29) Class4_Sub12 local29;
		for (@Pc(22) Class4_Sub12 local22 = (Class4_Sub12) aClass10_10.method190(); local22 != null; local22 = local29) {
			local29 = (Class4_Sub12) aClass10_10.method191();
			@Pc(33) int local33 = local22.method907();
			for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
				local22.method913(local35, anInt1139, anInt1140, anIntArray129[local15], anInt1143);
				if (local29 == null && local35 == local33 - 1) {
					anInt1141 = Static178.anInt3505 - anInt1141;
					Static178.method2761(0, 0);
					local4.glDrawBuffer(36064);
					Static29.method450();
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(anInt1142, anInt1141 - anInt1140);
					local4.glTexCoord2f((float) anInt1139, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt1142 + anInt1139, anInt1141 - anInt1140);
					local4.glTexCoord2f((float) anInt1139, (float) anInt1140);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt1142 + anInt1139, anInt1141);
					local4.glTexCoord2f(0.0F, (float) anInt1140);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(anInt1142, anInt1141);
					local4.glEnd();
				} else {
					local4.glDrawBuffer(local17 + 36064);
					local4.glBegin(7);
					local4.glTexCoord2f(0.0F, 0.0F);
					local4.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local4.glVertex2i(0, 0);
					local4.glTexCoord2f((float) anInt1139, 0.0F);
					local4.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local4.glVertex2i(anInt1139, 0);
					local4.glTexCoord2f((float) anInt1139, (float) anInt1140);
					local4.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local4.glVertex2i(anInt1139, anInt1140);
					local4.glTexCoord2f(0.0F, (float) anInt1140);
					local4.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local4.glVertex2i(0, anInt1140);
					local4.glEnd();
				}
				local22.method909(local35);
				local17 = local17 + 1 & 0x1;
				local15 = local15 + 1 & 0x1;
			}
		}
		local4.glEnable(3008);
		local4.glEnable(3042);
		Static178.method2748();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ul;Z)V")
	private static void method938(@OriginalArg(0) Class4_Sub12 arg0) {
		arg0.aBoolean83 = false;
		arg0.method4391();
		method941();
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "()V")
	public static void method939() {
		if (aClass4_Sub12_Sub1_1.method915()) {
			method938(aClass4_Sub12_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "()V")
	private static void method940() {
		if (anInt1138 != -1) {
			Static29.method448(anInt1138);
			anInt1138 = -1;
			Static178.aGL1.glDeleteTextures(2, anIntArray129, 0);
			anIntArray129[0] = -1;
			anIntArray129[1] = -1;
		}
		if (anInt1143 != -1) {
			if (aBoolean85) {
				Static144.method2330(anInt1143);
			} else {
				Static29.method454(anInt1143);
			}
			anInt1143 = -1;
		}
		if (!aClass10_10.method185()) {
			for (@Pc(39) Class4 local39 = aClass10_10.method190(); local39 != aClass10_10.aClass4_17; local39 = local39.aClass4_231) {
				((Class4_Sub12) local39).method905();
			}
		}
		if (aClass4_Sub12_Sub1_1 != null && aClass4_Sub12_Sub1_1.method912()) {
			aClass4_Sub12_Sub1_1.method905();
		}
		aBoolean84 = true;
		aBoolean89 = true;
		aBoolean88 = true;
		anInt1140 = -1;
		anInt1139 = -1;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "()V")
	private static void method941() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = true;
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17;
		for (@Pc(12) Class4_Sub12 local12 = (Class4_Sub12) aClass10_10.method190(); local12 != null; local12 = (Class4_Sub12) aClass10_10.method191()) {
			local17 = local12.method908();
			if (local17 > local1) {
				local1 = local17;
			}
			local5 |= local12.method918();
			local7 |= local12.method916();
			local3 += local12.method907();
		}
		@Pc(55) int local55;
		if (local1 == 2) {
			local55 = local5 ? Static144.anInt2935 : Static144.anInt2934;
		} else if (local1 == 1) {
			local55 = local5 ? Static144.anInt2933 : Static144.anInt2932;
		} else {
			local55 = local5 ? Static144.anInt2930 : Static144.anInt2929;
		}
		if (local55 != anInt1145) {
			anInt1145 = local55;
			aBoolean84 = true;
		}
		local17 = anInt1144 > 2 ? 2 : anInt1144;
		@Pc(93) int local93 = local3 > 2 ? 2 : local3;
		if (local17 != local93) {
			aBoolean84 = true;
			aBoolean88 = true;
		}
		if (local7 != aBoolean85) {
			aBoolean86 = local7;
			aBoolean89 = true;
		}
		anInt1144 = local3;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "()Z")
	public static boolean method942() {
		return anInt1138 != -1 && aClass4_Sub12_Sub1_1.method915();
	}
}

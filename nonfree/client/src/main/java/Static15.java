import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cc", name = "vc", descriptor = "Lclient!ve;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!cc", name = "wc", descriptor = "I")
	public static int anInt433;

	@OriginalMember(owner = "client!cc", name = "Ec", descriptor = "[I")
	public static int[] anIntArray29;

	@OriginalMember(owner = "client!cc", name = "cc", descriptor = "Lclient!oa;")
	private static Class56 aClass56_209 = Static33.method650("level)2");

	@OriginalMember(owner = "client!cc", name = "fc", descriptor = "Lclient!oa;")
	private static Class56 aClass56_210 = Static33.method650("Loaded wordpack");

	@OriginalMember(owner = "client!cc", name = "hc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_211 = aClass56_210;

	@OriginalMember(owner = "client!cc", name = "lc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_212 = aClass56_209;

	@OriginalMember(owner = "client!cc", name = "oc", descriptor = "Lclient!n;")
	public static Class52 aClass52_7 = new Class52(50);

	@OriginalMember(owner = "client!cc", name = "Dc", descriptor = "Lclient!oa;")
	private static Class56 aClass56_219 = Static33.method650("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!cc", name = "uc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_213 = aClass56_219;

	@OriginalMember(owner = "client!cc", name = "xc", descriptor = "I")
	public static int anInt434 = 0;

	@OriginalMember(owner = "client!cc", name = "yc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_214 = Static33.method650(":  ");

	@OriginalMember(owner = "client!cc", name = "Cc", descriptor = "Lclient!oa;")
	private static Class56 aClass56_218 = Static33.method650("Your account is already logged in)3");

	@OriginalMember(owner = "client!cc", name = "zc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_215 = aClass56_218;

	@OriginalMember(owner = "client!cc", name = "Ac", descriptor = "Lclient!oa;")
	private static Class56 aClass56_216 = Static33.method650("Hidden");

	@OriginalMember(owner = "client!cc", name = "Bc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_217 = aClass56_216;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IZ)V")
	public static void method316(@OriginalArg(1) boolean arg0) {
		if (Static38.anInt1028 == Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 >> 7 && Static75.anInt2022 == Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 >> 7) {
			Static38.anInt1028 = 0;
		}
		@Pc(29) int local29 = Static110.anInt2767;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(43) Class3_Sub1_Sub2_Sub4_Sub1 local43;
			@Pc(41) int local41;
			if (arg0) {
				local41 = 33538048;
				local43 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1;
			} else {
				local43 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[Static54.anIntArray108[local35]];
				local41 = Static54.anIntArray108[local35] << 14;
			}
			if (local43 != null && local43.method2033()) {
				local43.aBoolean60 = false;
				@Pc(71) int local71 = local43.anInt3187 >> 7;
				if ((Static77.aBoolean169 && Static110.anInt2767 > 50 || Static110.anInt2767 > 200) && !arg0 && local43.anInt3186 == local43.anInt3162) {
					local43.aBoolean60 = true;
				}
				@Pc(96) int local96 = local43.anInt3196 >> 7;
				if (local71 >= 0 && local71 < 104 && local96 >= 0 && local96 < 104) {
					if (local43.aClass3_Sub1_Sub2_Sub6_1 == null || local43.anInt1386 > Static98.anInt2566 || local43.anInt1379 <= Static98.anInt2566) {
						if ((local43.anInt3187 & 0x7F) == 64 && (local43.anInt3196 & 0x7F) == 64) {
							if (Static4.anIntArrayArray1[local71][local96] == Static106.anInt2639) {
								continue;
							}
							Static4.anIntArrayArray1[local71][local96] = Static106.anInt2639;
						}
						local43.anInt1381 = Static27.method560(local43.anInt3196, Static94.anInt2470, local43.anInt3187);
						Static116.aClass14_1.method448(Static94.anInt2470, local43.anInt3187, local43.anInt3196, local43.anInt1381, 60, local43, local43.anInt3156, local41, local43.aBoolean170);
					} else {
						local43.aBoolean60 = false;
						local43.anInt1381 = Static27.method560(local43.anInt3196, Static94.anInt2470, local43.anInt3187);
						Static116.aClass14_1.method456(Static94.anInt2470, local43.anInt3187, local43.anInt3196, local43.anInt1381, local43, local43.anInt3156, local41, local43.anInt1383, local43.anInt1369, local43.anInt1390, local43.anInt1382);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "(I)V")
	public static void method317() {
		anIntArray29 = null;
		aClass56_209 = null;
		aClass56_216 = null;
		aClass56_210 = null;
		aClass56_218 = null;
		aClass56_215 = null;
		aClass80_1 = null;
		aClass56_211 = null;
		aClass56_212 = null;
		aClass56_219 = null;
		aClass56_214 = null;
		aClass56_213 = null;
		aClass52_7 = null;
		aClass56_217 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZB)V")
	public static void method321(@OriginalArg(0) boolean arg0) {
		if (Static64.aClass17_3 == null) {
			return;
		}
		try {
			@Pc(19) Class3_Sub2 local19 = new Class3_Sub2(4);
			local19.method303(arg0 ? 2 : 3);
			local19.method282(0);
			Static64.aClass17_3.method493(local19.aByteArray7, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				Static64.aClass17_3.method498();
			} catch (@Pc(45) Exception local45) {
			}
			Static31.anInt923++;
			Static64.aClass17_3 = null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method327(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}
}

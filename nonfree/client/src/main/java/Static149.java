import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public static int anInt3227;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_7;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "Lclient!kh;")
	public static Class29 aClass29_61;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	public static int anInt3231;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
	public static int anInt3233;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1411 = Static51.method932("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1413 = Static51.method932("Login server offline)3");

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1412 = aClass10_1413;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public static int anInt3226 = 0;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1414 = Static51.method932("rot:");

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1415 = Static51.method932("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1416 = aClass10_1411;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1417 = aClass10_1415;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1418 = Static51.method932("Fertigkeit)2");

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
	public static int anInt3232 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
	public static void method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class12 local7 = Static132.aClass12ArrayArrayArray1[Static56.anInt1432][arg1][arg0];
		if (local7 == null) {
			Static180.aClass60_1.method1808(Static56.anInt1432, arg1, arg0);
			return;
		}
		@Pc(27) int local27 = -99999999;
		@Pc(32) Class2_Sub1_Sub3_Sub4 local32 = (Class2_Sub1_Sub3_Sub4) local7.method384();
		@Pc(34) Class2_Sub1_Sub3_Sub4 local34 = null;
		while (local32 != null) {
			@Pc(40) Class2_Sub1_Sub6 local40 = Static78.method577(local32.anInt1187);
			@Pc(43) int local43 = local40.anInt1517;
			if (local40.anInt1507 == 1) {
				local43 *= local32.anInt1183 + 1;
			}
			if (local43 > local27) {
				local34 = local32;
				local27 = local43;
			}
			local32 = (Class2_Sub1_Sub3_Sub4) local7.method381();
		}
		if (local34 == null) {
			Static180.aClass60_1.method1808(Static56.anInt1432, arg1, arg0);
			return;
		}
		local7.method388(local34);
		local32 = (Class2_Sub1_Sub3_Sub4) local7.method384();
		@Pc(93) Class2_Sub1_Sub3_Sub4 local93 = null;
		@Pc(101) int local101 = arg1 + (arg0 << 7) + 1610612736;
		@Pc(103) Class2_Sub1_Sub3_Sub4 local103 = null;
		while (local32 != null) {
			if (local34.anInt1187 != local32.anInt1187) {
				if (local93 == null) {
					local93 = local32;
				}
				if (local32.anInt1187 != local93.anInt1187 && local103 == null) {
					local103 = local32;
				}
			}
			local32 = (Class2_Sub1_Sub3_Sub4) local7.method381();
		}
		Static180.aClass60_1.method1788(Static56.anInt1432, arg1, arg0, Static178.method2702(arg0 * 128 + 64, arg1 * 128 - -64, Static56.anInt1432), local34, local101, local93, local103);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZLclient!kh;)Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 method2287(@OriginalArg(0) int arg0, @OriginalArg(2) Class29 arg1) {
		return Static160.method2425(arg1, arg0) ? Static57.method1067() : null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2288(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static142.aClass86_1);
		arg0.addMouseMotionListener(Static142.aClass86_1);
		arg0.addFocusListener(Static142.aClass86_1);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
	public static boolean method2289(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method2292() {
		aClass29_61 = null;
		aClass10_1417 = null;
		aClass10_1416 = null;
		aClass2_Sub1_Sub4_Sub3_7 = null;
		aClass10_1412 = null;
		aClass10_1411 = null;
		aClass10_1415 = null;
		aClass10_1413 = null;
		aClass10_1418 = null;
		aClass10_1414 = null;
	}
}

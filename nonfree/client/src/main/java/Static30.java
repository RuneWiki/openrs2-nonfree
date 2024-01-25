import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	public static int anInt572;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
	public static int anInt573;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "Lclient!fg;")
	public static Class70 aClass70_18 = new Class70(64);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Lclient!un;")
	public static final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method481(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static57.anInt1094; local16++) {
			if (arg0.equalsIgnoreCase(Static86.aStringArray11[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public static void method482() {
		for (@Pc(18) Class6_Sub32 local18 = (Class6_Sub32) Static214.aClass211_24.method5594(); local18 != null; local18 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			if (Static230.method4091(local18.anInt4932)) {
				Static337.method5580(local18);
			}
		}
		if (Static256.anInt4749 == 1) {
			Static201.aBoolean284 = false;
			Static101.method2080(Static25.anInt507, Static320.anInt5930, Static194.anInt3666, Static267.anInt4963);
			return;
		}
		Static101.method2080(Static25.anInt507, Static320.anInt5930, Static194.anInt3666, Static267.anInt4963);
		@Pc(60) int local60 = Static220.aClass26_6.method508(Static150.aString121);
		for (@Pc(65) Class6_Sub32 local65 = (Class6_Sub32) Static214.aClass211_24.method5594(); local65 != null; local65 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			@Pc(71) int local71 = Static212.method3770(local65);
			if (local71 > local60) {
				local60 = local71;
			}
		}
		Static320.anInt5930 = (Static10.aBoolean19 ? 26 : 22) + Static256.anInt4749 * 16;
		Static25.anInt507 = local60 + 8;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public static void method484() {
		@Pc(1) Class70 local1 = Static9.aClass70_4;
		synchronized (Static9.aClass70_4) {
			Static9.aClass70_4.method1405();
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	public static void method485() {
		Static92.aClass70_30.method1405();
		Static134.aClass70_46.method1405();
	}
}

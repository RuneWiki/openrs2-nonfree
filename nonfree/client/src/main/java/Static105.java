import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_1099 = Static134.method2017("http:)4)4");

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public static final int anInt2345 = 5063219;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "Lclient!v;")
	public static Class76 aClass76_1100 = null;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	public static int anInt2346 = 0;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "I")
	public static int anInt2347 = 0;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "Lclient!v;")
	private static Class76 aClass76_1101 = Static134.method2017("Username: ");

	@OriginalMember(owner = "client!s", name = "B", descriptor = "[Lclient!je;")
	public static Class4_Sub4_Sub3_Sub1_Sub2[] aClass4_Sub4_Sub3_Sub1_Sub2Array1 = new Class4_Sub4_Sub3_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!s", name = "C", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "Lclient!v;")
	public static Class76 aClass76_1102 = aClass76_1101;

	@OriginalMember(owner = "client!s", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_1103 = Static134.method2017("sl_arrows");

	@OriginalMember(owner = "client!s", name = "M", descriptor = "Lclient!v;")
	private static Class76 aClass76_1107 = Static134.method2017(" from your friend list first");

	@OriginalMember(owner = "client!s", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_1104 = aClass76_1107;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_1105 = Static134.method2017("Cabbage");

	@OriginalMember(owner = "client!s", name = "L", descriptor = "Lclient!v;")
	public static Class76 aClass76_1106 = Static134.method2017("<col=ffffff>");

	@OriginalMember(owner = "client!s", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_1108 = Static134.method2017("(U2");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method1611() {
		aFontMetrics1 = null;
		aClass76_1104 = null;
		aClass76_1107 = null;
		aClass76_1106 = null;
		aClass76_1099 = null;
		aClass76_1100 = null;
		aClass76_1102 = null;
		anIntArray327 = null;
		aClass76_1105 = null;
		aClass76_1103 = null;
		aClass76_1101 = null;
		aClass4_Sub4_Sub3_Sub1_Sub2Array1 = null;
		aClass76_1108 = null;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] method1612() {
		@Pc(8) Class4_Sub4_Sub5_Sub2[] local8 = new Class4_Sub4_Sub5_Sub2[Static3.anInt2206];
		for (@Pc(15) int local15 = 0; local15 < Static3.anInt2206; local15++) {
			@Pc(25) Class4_Sub4_Sub5_Sub2 local25 = local8[local15] = new Class4_Sub4_Sub5_Sub2();
			local25.anInt1334 = Static18.anInt350;
			local25.anInt1333 = Static55.anInt1464;
			local25.anInt1329 = Static31.anIntArray96[local15];
			local25.anInt1331 = Static102.anIntArray321[local15];
			local25.anInt1330 = Static34.anIntArray107[local15];
			local25.anInt1332 = Static25.anIntArray80[local15];
			@Pc(55) byte[] local55 = Static38.aByteArrayArray3[local15];
			@Pc(61) int local61 = local25.anInt1330 * local25.anInt1332;
			local25.anIntArray166 = new int[local61];
			for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
				local25.anIntArray166[local67] = Static49.anIntArray159[local55[local67] & 0xFF];
			}
		}
		Static57.method1000();
		return local8;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public static void method1613(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub21 local10 = (Class4_Sub21) Static104.aClass28_9.method770((long) arg0);
		if (local10 != null) {
			local10.method2004();
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method1614() {
		@Pc(5) int local5 = Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1317(Static60.aClass76_656);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static10.anInt206; local11++) {
			local19 = Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1317(Static34.method616(local11));
			if (local5 < local19) {
				local5 = local19;
			}
		}
		Static32.aBoolean56 = true;
		local5 += 8;
		Static36.anInt1035 = local5;
		local19 = Static10.anInt206 * 15 + 21;
		Static13.anInt230 = Static10.anInt206 * 15 + 22;
		@Pc(64) int local64 = Static75.anInt1928 - local5 / 2;
		if (local64 + local5 > 765) {
			local64 = 765 - local5;
		}
		@Pc(78) int local78 = Static20.anInt427;
		if (local19 + local78 > 503) {
			local78 = 503 - local19;
		}
		if (local78 < 0) {
			local78 = 0;
		}
		if (local64 < 0) {
			local64 = 0;
		}
		Static9.anInt175 = local78;
		Static42.anInt1164 = local64;
	}
}

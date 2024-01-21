import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int anInt567;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_307 = Static23.method501("welle2:");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!mc;")
	public static Class42 aClass42_308 = Static23.method501("Absender:");

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!fa;")
	public static Class22 aClass22_4 = new Class22();

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!mc;")
	public static Class42 aClass42_309 = Static23.method501("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WMissbrauch melden(W Option benutzen");

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method407() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static83.anIntArray339[local9 + 32512] = 255;
			}
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(59) int local59;
		for (local16 = 0; local16 < 100; local16++) {
			local46 = (int) (Math.random() * 124.0D) + 2;
			local53 = (int) (Math.random() * 128.0D) + 128;
			local59 = local46 + (local53 << 7);
			Static83.anIntArray339[local59] = 192;
		}
		for (local46 = 1; local46 < 255; local46++) {
			for (local53 = 1; local53 < 127; local53++) {
				local59 = (local46 << 7) + local53;
				Static34.anIntArray116[local59] = (Static83.anIntArray339[local59 - 1] + Static83.anIntArray339[local59 + 1] + Static83.anIntArray339[local59 - 128] + Static83.anIntArray339[local59 + 128]) / 4;
			}
		}
		Static49.anInt1283 += 128;
		if (Static49.anInt1283 > Static90.anIntArray369.length) {
			Static49.anInt1283 -= Static90.anIntArray369.length;
			local59 = (int) (Math.random() * 12.0D);
			Static98.method1714(Static93.aClass1_Sub1_Sub1_Sub4Array7[local59]);
		}
		@Pc(165) int local165;
		@Pc(173) int local173;
		for (local59 = 1; local59 < 255; local59++) {
			for (local165 = 1; local165 < 127; local165++) {
				local173 = (local59 << 7) + local165;
				@Pc(193) int local193 = Static34.anIntArray116[local173 + 128] - Static90.anIntArray369[Static90.anIntArray369.length - 1 & local173 + Static49.anInt1283] / 5;
				if (local193 < 0) {
					local193 = 0;
				}
				Static83.anIntArray339[local173] = local193;
			}
		}
		for (local165 = 0; local165 < 255; local165++) {
			Static81.anIntArray325[local165] = Static81.anIntArray325[local165 + 1];
		}
		Static81.anIntArray325[255] = (int) (Math.sin((double) Static27.anInt768 / 14.0D) * 16.0D + Math.sin((double) Static27.anInt768 / 15.0D) * 14.0D + Math.sin((double) Static27.anInt768 / 16.0D) * 12.0D);
		if (Static54.anInt1409 > 0) {
			Static54.anInt1409 -= 4;
		}
		if (Static13.anInt461 > 0) {
			Static13.anInt461 -= 4;
		}
		if (Static54.anInt1409 != 0 || Static13.anInt461 != 0) {
			return;
		}
		local173 = (int) (Math.random() * 2000.0D);
		if (local173 == 0) {
			Static54.anInt1409 = 1024;
		}
		if (local173 == 1) {
			Static13.anInt461 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method411() {
		aClass1_Sub1_Sub1_Sub4_7 = null;
		aClass42_309 = null;
		anIntArray43 = null;
		aClass22_4 = null;
		aClass42_307 = null;
		aClass42_308 = null;
		aFont1 = null;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method412() {
		Static75.aBoolean85 = true;
		Static22.aBoolean32 = true;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	public static void method413() {
		Static4.aClass37_3.method976();
	}
}

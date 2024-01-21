import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt155;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!fd;")
	public static Class24 aClass24_3;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "J")
	public static long aLong6;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static volatile int anInt157 = 0;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "[B")
	public static byte[] aByteArray6 = new byte[520];

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!ac;")
	public static Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_104 = Static69.method1231("<col=00ffff>");

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_105 = Static69.method1231("blinken2:");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!kc;B)Z")
	public static boolean method127(@OriginalArg(0) Class2_Sub13 arg0) {
		if (arg0.anIntArray158 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray158.length; local17++) {
			@Pc(24) int local24 = Static114.method1896(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray155[local17];
			if (arg0.anIntArray158[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray158[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray158[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method128() {
		aByteArray6 = null;
		aClass3_1 = null;
		aClass40_104 = null;
		aClass24_3 = null;
		aClass40_105 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method129(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static124.aBoolean236) {
			try {
				@Pc(20) Class44 local20 = (Class44) Class.forName("Class44_Sub1").getDeclaredConstructor().newInstance();
				local20.method1098(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static124.aBoolean236 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!je;I)V")
	public static void method130(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(24) int local24 = Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5.method1552(arg1, 250);
		@Pc(31) int local31 = Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5.method1545(arg1, 250) * 13;
		Static6.method1695(6, 6, local24 + 4 + 4, local31 - -4 + 4, 0);
		Static6.method1693(6, 6, local24 + 4 + 4, local31 - -4 + 4, 16777215);
		Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5.method1542(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		Static94.method1736(local24 + 8, 6, local31 + 4 + 4, 6);
		if (!arg0) {
			Static21.method400(local31, 10, 10, local24);
			return;
		}
		try {
			@Pc(123) Graphics local123 = Static80.aCanvas1.getGraphics();
			Static65.aClass7_1.method2132(local123);
		} catch (@Pc(131) Exception local131) {
			Static80.aCanvas1.repaint();
		}
	}
}

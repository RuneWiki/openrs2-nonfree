import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!pl;")
	public static Class109 aClass109_2;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public static int anInt969;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
	public static int[] anIntArray78 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString44 = "Opened title screen";

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
	public static int method617(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method618() {
		if (!Static121.aBoolean169 && Static25.anInt848 != 2) {
			try {
				Static267.method82("tbrefresh", Static35.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	public static int method619() {
		try {
			if (Static191.anInt4274 == 0) {
				if (Static198.aLong151 > Static31.method591() - 5000L) {
					return 0;
				}
				Static152.aClass145_6 = Static38.aClass28_1.method718(Static191.anInt4270, Static183.aString371);
				Static84.aLong79 = Static31.method591();
				Static191.anInt4274 = 1;
			}
			if (Static84.aLong79 + 30000L < Static31.method591()) {
				return Static53.method1023(1000);
			}
			@Pc(80) int local80;
			@Pc(119) int local119;
			if (Static191.anInt4274 == 1) {
				if (Static152.aClass145_6.anInt5354 == 2) {
					return Static53.method1023(1001);
				}
				if (Static152.aClass145_6.anInt5354 != 1) {
					return -1;
				}
				aClass109_2 = new Class109((Socket) Static152.aClass145_6.anObject7, Static38.aClass28_1);
				local80 = 0;
				Static152.aClass145_6 = null;
				if (Static65.aBoolean101) {
					local80 = Static212.anInt4630;
				}
				Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1766(23);
				Static171.aClass1_Sub13_Sub1_3.method1754(local80);
				aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				local119 = aClass109_2.method3142();
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				if (local119 != 0) {
					return Static53.method1023(local119);
				}
				Static191.anInt4274 = 2;
			}
			if (Static191.anInt4274 == 2) {
				if (aClass109_2.method3143() < 2) {
					return -1;
				}
				Static248.anInt5314 = aClass109_2.method3142();
				Static248.anInt5314 <<= 0x8;
				Static248.anInt5314 += aClass109_2.method3142();
				Static191.anInt4274 = 3;
				Static26.aByteArray7 = new byte[Static248.anInt5314];
				Static134.anInt3302 = 0;
			}
			if (Static191.anInt4274 != 3) {
				return -1;
			}
			local80 = aClass109_2.method3143();
			if (local80 < 1) {
				return -1;
			}
			if (local80 > Static248.anInt5314 - Static134.anInt3302) {
				local80 = Static248.anInt5314 - Static134.anInt3302;
			}
			aClass109_2.method3146(local80, Static26.aByteArray7, Static134.anInt3302);
			Static134.anInt3302 += local80;
			if (Static134.anInt3302 < Static248.anInt5314) {
				return -1;
			} else if (Static222.method3675(Static26.aByteArray7)) {
				Static42.aClass115_Sub1Array1 = new Class115_Sub1[Static32.anInt932];
				local119 = 0;
				for (@Pc(232) int local232 = Static97.anInt3555; local232 <= Static108.anInt2877; local232++) {
					@Pc(238) Class115_Sub1 local238 = Static87.method1847(local232);
					if (local238 != null) {
						Static42.aClass115_Sub1Array1[local119++] = local238;
					}
				}
				aClass109_2.method3141();
				Static197.anInt2399 = 0;
				Static191.anInt4274 = 0;
				Static26.aByteArray7 = null;
				aClass109_2 = null;
				Static198.aLong151 = Static31.method591();
				return 0;
			} else {
				return Static53.method1023(1002);
			}
		} catch (@Pc(270) IOException local270) {
			return Static53.method1023(1003);
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	public static void method620() {
		Static218.aClass79_32.method2487();
		Static81.aClass79_10.method2487();
		Static63.aClass79_8.method2487();
	}
}

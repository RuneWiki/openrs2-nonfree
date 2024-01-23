import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "Lclient!nm;")
	public static Class119 aClass119_3;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
	public static int anInt310 = 0;

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "[Lclient!kl;")
	public static Class11_Sub4_Sub1[] aClass11_Sub4_Sub1Array1 = new Class11_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
	public static void method210() {
		Static128.anInt2549 = 0;
		Static125.anInt2513 = 0;
		Static294.method949();
		Static215.method3497();
		Static271.method4177();
		@Pc(22) int local22;
		for (local22 = 0; local22 < Static128.anInt2549; local22++) {
			@Pc(33) int local33 = Static304.anIntArray601[local22];
			if (Static167.anInt637 != Static138.aClass11_Sub4_Sub2Array2[local33].anInt3822) {
				if (Static138.aClass11_Sub4_Sub2Array2[local33].aClass183_1.method4524()) {
					Static47.method897(Static138.aClass11_Sub4_Sub2Array2[local33]);
				}
				Static138.aClass11_Sub4_Sub2Array2[local33].method3365(null);
				Static138.aClass11_Sub4_Sub2Array2[local33] = null;
			}
		}
		if (Static10.aClass1_Sub13_Sub1_117.anInt2018 != Static5.anInt204) {
			throw new RuntimeException("gnp1 pos:" + Static10.aClass1_Sub13_Sub1_117.anInt2018 + " psize:" + Static5.anInt204);
		}
		for (local22 = 0; local22 < Static1.anInt48; local22++) {
			if (Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local22]] == null) {
				throw new RuntimeException("gnp2 pos:" + local22 + " size:" + Static1.anInt48);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V")
	public static void method211() {
		Static300.aClass175_43.method4287();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method213(@OriginalArg(1) String arg0) {
		Static258.aString177 = arg0;
		if (Static222.aClass176_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static222.aClass176_3.anApplet1.getParameter("cookieprefix");
			@Pc(25) String local25 = Static222.aClass176_3.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local25;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static246.method3871(Static244.method3859() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static320.method2268("document.cookie=\"" + local40 + "\"", Static222.aClass176_3.anApplet1);
		} catch (@Pc(90) Throwable local90) {
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	public static void method214(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static283.anInt5144;
		@Pc(3) int local3 = Static273.anInt5035;
		@Pc(9) int local9 = Static87.anInt1875;
		@Pc(11) int local11 = Static53.anInt1161;
		@Pc(18) int local18 = (int) Static148.aFloat64 + Static132.anInt2613 & 0x7FF;
		@Pc(20) int local20 = Static305.anInt5484;
		@Pc(23) int local23 = (int) Static8.aFloat4;
		if (local23 < Static221.anInt4151 / 256) {
			local23 = Static221.anInt4151 / 256;
		}
		if (Static311.aBooleanArray24[4] && local23 < Static225.anIntArray470[4] + 128) {
			local23 = Static225.anIntArray470[4] + 128;
		}
		Static313.method4662(local23 * 3 + 600, Static42.method768(Static138.aClass11_Sub4_Sub1_3.anInt3865, Static132.anInt2608, Static138.aClass11_Sub4_Sub1_3.anInt3856) + -50, local18, Static21.anInt443, local23, Static106.anInt3753, arg0);
		if (Static273.anInt5035 == local3 && local1 == Static283.anInt5144 && local9 == Static87.anInt1875 && Static53.anInt1161 == local11 && local20 == Static305.anInt5484) {
			Static228.anInt4270 = 1;
			return;
		}
		Static29.anInt555 = 10;
		Static54.anInt1168 = 10;
		Static146.anInt3024 = 10;
		if (Static53.anInt1161 > local11) {
			local11 += Static146.anInt3024 + Static29.anInt555 * (Static53.anInt1161 - local11) / 1000;
			if (local11 < Static53.anInt1161) {
				Static53.anInt1161 = local11;
			}
		}
		if (local11 > Static53.anInt1161) {
			local11 -= Static146.anInt3024 + Static29.anInt555 * (local11 - Static53.anInt1161) / 1000;
			if (local11 > Static53.anInt1161) {
				Static53.anInt1161 = local11;
			}
		}
		Static2.anInt94 = 10;
		if (Static283.anInt5144 > local1) {
			local1 += Static2.anInt94 + (Static283.anInt5144 - local1) * Static54.anInt1168 / 1000;
			if (Static283.anInt5144 > local1) {
				Static283.anInt5144 = local1;
			}
		}
		@Pc(197) int local197 = Static305.anInt5484 - local20;
		if (local9 < Static87.anInt1875) {
			local9 += (Static87.anInt1875 - local9) * Static54.anInt1168 / 1000 + Static2.anInt94;
			if (Static87.anInt1875 > local9) {
				Static87.anInt1875 = local9;
			}
		}
		if (local1 > Static283.anInt5144) {
			local1 -= Static2.anInt94 + Static54.anInt1168 * (local1 - Static283.anInt5144) / 1000;
			if (local1 > Static283.anInt5144) {
				Static283.anInt5144 = local1;
			}
		}
		if (local9 > Static87.anInt1875) {
			local9 -= (local9 - Static87.anInt1875) * Static54.anInt1168 / 1000 + Static2.anInt94;
			if (local9 > Static87.anInt1875) {
				Static87.anInt1875 = local9;
			}
		}
		if (local3 < Static273.anInt5035) {
			local3 += Static2.anInt94 + (Static273.anInt5035 - local3) * Static54.anInt1168 / 1000;
			if (Static273.anInt5035 > local3) {
				Static273.anInt5035 = local3;
			}
		}
		if (local197 > 1024) {
			local197 -= 2048;
		}
		if (local3 > Static273.anInt5035) {
			local3 -= (local3 - Static273.anInt5035) * Static54.anInt1168 / 1000 + Static2.anInt94;
			if (local3 > Static273.anInt5035) {
				Static273.anInt5035 = local3;
			}
		}
		if (local197 < -1024) {
			local197 += 2048;
		}
		if (local197 > 0) {
			local20 += Static29.anInt555 * local197 / 1000 + Static146.anInt3024;
			local20 &= 0x7FF;
		}
		if (local197 < 0) {
			local20 -= Static29.anInt555 * -local197 / 1000 + Static146.anInt3024;
			local20 &= 0x7FF;
		}
		@Pc(395) int local395 = Static305.anInt5484 - local20;
		if (local395 > 1024) {
			local395 -= 2048;
		}
		if (local395 < -1024) {
			local395 += 2048;
		}
		if (local395 >= 0 || local197 <= 0 || local395 > 0 && local197 < 0) {
			Static305.anInt5484 = local20;
		}
	}
}

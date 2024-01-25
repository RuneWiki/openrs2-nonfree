import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hea", name = "V", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array7;

	@OriginalMember(owner = "client!hea", name = "Y", descriptor = "Lclient!ul;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_127 = new Class288(84, 5);

	@OriginalMember(owner = "client!hea", name = "X", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(IBI)I")
	public static int method2914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(30) int local30 = ((arg1 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local7;
		return local30 + ((local35 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local35 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(II)I")
	public static int method2917(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "(I)V")
	public static void method2918() {
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub13_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub13_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub18_1);
		Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub18_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub4_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub10_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub12_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub16_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub23_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub24_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub25_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub17_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub15_1);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub6_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub11_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub11_2);
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub19_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub9_1);
		Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub8_1);
		Static238.method3337();
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub5_1);
		Static234.aClass2_Sub5_48.method176(3, Static234.aClass2_Sub5_48.aClass6_Sub7_1);
		Static45.method741();
		Static249.method3418();
		Static555.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(IZ)V")
	public static void method2919(@OriginalArg(1) boolean arg0) {
		Static48.method803();
		if (!Static569.method7798(Static324.anInt5145)) {
			return;
		}
		Static22.anInt550++;
		if (Static22.anInt550 < 50 && !arg0) {
			return;
		}
		Static22.anInt550 = 0;
		if (!Static171.aBoolean226 && Static155.aClass121_2 != null) {
			@Pc(42) Class2_Sub40 local42 = Static464.method6285(Static251.aClass131_1, Static528.aClass179_111);
			Static528.method7295(local42);
			try {
				Static124.method1779();
			} catch (@Pc(49) IOException local49) {
				Static171.aBoolean226 = true;
			}
		}
		Static48.method803();
	}
}

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	public static int anInt7559;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "Lclient!re;")
	public static Class210 aClass210_10;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_95 = new Class44(23, 2);

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	public static final int anInt7578 = 1407;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "Z")
	public static boolean aBoolean645 = true;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method5863() {
		Static265.aBoolean623 = false;
		Static228.anIntArray99 = null;
		Static438.anIntArray504 = null;
		Static365.anIntArray430 = null;
		Static261.anIntArray366 = null;
		Static261.anIntArray367 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
	public static int method5867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static412.anIntArray481[arg1 & 0x3] : Static184.anIntArray250[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
	public static void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 14);
		local8.method434();
		local8.anInt657 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	public static void method5875() {
		if (Static375.anInt6694 == 0) {
			return;
		}
		try {
			if (++Static124.anInt2433 > 2000) {
				if (Static423.aClass199_11 != null) {
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
				}
				if (Static154.anInt2943 >= 1) {
					Static375.anInt6694 = 0;
					Static60.anInt1700 = -5;
					return;
				}
				Static154.anInt2943++;
				Static124.anInt2433 = 0;
				if (Static276.anInt5074 == Static219.anInt4190) {
					Static219.anInt4190 = Static133.anInt2586;
				} else {
					Static219.anInt4190 = Static276.anInt5074;
				}
				Static375.anInt6694 = 1;
			}
			if (Static375.anInt6694 == 1) {
				Static195.aClass128_4 = Static303.aClass131_4.method3068(Static219.anInt4190, Static373.aString7);
				Static375.anInt6694 = 2;
			}
			@Pc(114) int local114;
			if (Static375.anInt6694 == 2) {
				if (Static195.aClass128_4.anInt3727 == 2) {
					throw new IOException();
				}
				if (Static195.aClass128_4.anInt3727 != 1) {
					return;
				}
				Static423.aClass199_11 = new Class199((Socket) Static195.aClass128_4.anObject4, Static303.aClass131_4);
				Static195.aClass128_4 = null;
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
				Static347.method4871();
				local114 = Static423.aClass199_11.method4491();
				Static347.method4871();
				if (local114 != 21) {
					Static60.anInt1700 = local114;
					Static375.anInt6694 = 0;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
					return;
				}
				Static375.anInt6694 = 3;
			}
			if (Static375.anInt6694 == 3) {
				if (Static423.aClass199_11.method4483() < 1) {
					return;
				}
				Static74.aStringArray7 = new String[Static423.aClass199_11.method4491()];
				Static375.anInt6694 = 4;
			}
			if (Static375.anInt6694 == 4 && Static423.aClass199_11.method4483() >= Static74.aStringArray7.length * 8) {
				Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
				Static423.aClass199_11.method4488(Static74.aStringArray7.length * 8, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
				for (local114 = 0; local114 < Static74.aStringArray7.length; local114++) {
					Static74.aStringArray7[local114] = Static395.method5429(Static426.aClass2_Sub20_Sub1_2.method3719());
				}
				Static60.anInt1700 = 21;
				Static375.anInt6694 = 0;
				Static423.aClass199_11.method4490();
				Static423.aClass199_11 = null;
			}
		} catch (@Pc(216) IOException local216) {
			if (Static423.aClass199_11 != null) {
				Static423.aClass199_11.method4490();
				Static423.aClass199_11 = null;
			}
			if (Static154.anInt2943 < 1) {
				Static375.anInt6694 = 1;
				Static124.anInt2433 = 0;
				if (Static219.anInt4190 == Static276.anInt5074) {
					Static219.anInt4190 = Static133.anInt2586;
				} else {
					Static219.anInt4190 = Static276.anInt5074;
				}
				Static154.anInt2943++;
			} else {
				Static375.anInt6694 = 0;
				Static60.anInt1700 = -4;
			}
		}
	}
}

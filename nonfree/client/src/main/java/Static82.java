import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public static int anInt1996;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt1995 = 0;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_986 = Static108.method1915("Lade)3)3)3");

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_987 = Static108.method1915("(Y ");

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!kd;")
	public static Class39 aClass39_988 = Static108.method1915("Handel)4Duell");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)I")
	public static int method1394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static93.method1571(arg1 - 1, arg0 + -1) + Static93.method1571(arg1 + 1, arg0 - 1) + Static93.method1571(arg1 + -1, arg0 + 1) + Static93.method1571(arg1 + 1, arg0 - -1);
		@Pc(77) int local77 = Static93.method1571(arg1 - 1, arg0) + Static93.method1571(arg1 + 1, arg0) + Static93.method1571(arg1, arg0 + -1) + Static93.method1571(arg1, arg0 + 1);
		@Pc(82) int local82 = Static93.method1571(arg1, arg0);
		return local82 / 4 + local40 / 16 + local77 / 8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1395() {
		anIntArray309 = null;
		aClass39_987 = null;
		aClass39_988 = null;
		aClass39_986 = null;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1396() {
		for (@Pc(17) Class1_Sub19 local17 = (Class1_Sub19) Static96.aClass31_54.method1000(); local17 != null; local17 = (Class1_Sub19) Static96.aClass31_54.method1003()) {
			if (local17.anInt2828 > 0) {
				local17.anInt2828--;
			}
			if (local17.anInt2828 != 0) {
				if (local17.anInt2837 > 0) {
					local17.anInt2837--;
				}
				if (local17.anInt2837 == 0 && local17.anInt2830 >= 1 && local17.anInt2818 >= 1 && local17.anInt2830 <= 102 && local17.anInt2818 <= 102 && (local17.anInt2838 < 0 || Static68.method1216(local17.anInt2819, local17.anInt2838))) {
					Static58.method1039(local17.anInt2821, local17.anInt2838, local17.anInt2818, local17.anInt2827, local17.anInt2826, local17.anInt2830, local17.anInt2819);
					local17.anInt2837 = -1;
					if (local17.anInt2839 == local17.anInt2838 && local17.anInt2839 == -1) {
						local17.method2128();
					} else if (local17.anInt2839 == local17.anInt2838 && local17.anInt2826 == local17.anInt2831 && local17.anInt2819 == local17.anInt2835) {
						local17.method2128();
					}
				}
			} else if (local17.anInt2839 < 0 || Static68.method1216(local17.anInt2835, local17.anInt2839)) {
				Static58.method1039(local17.anInt2821, local17.anInt2839, local17.anInt2818, local17.anInt2827, local17.anInt2831, local17.anInt2830, local17.anInt2835);
				local17.method2128();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!a;I)[I")
	public static int[] method1397(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		@Pc(10) int local10 = arg0.anInt72 >> 16;
		if (!Static71.method1248(local10)) {
			return null;
		}
		@Pc(19) int local19 = arg0.anInt110;
		@Pc(22) int local22 = arg0.anInt81;
		@Pc(35) Class1_Sub1_Sub1 local35;
		for (@Pc(25) int local25 = arg0.anInt102; local25 != -1; local25 = local35.anInt102) {
			local35 = Static102.aClass1_Sub1_Sub1ArrayArray1[local10][local25 & 0xFFFF];
			local19 += local35.anInt110 - local35.anInt95;
			local22 += local35.anInt81 - local35.anInt87;
		}
		return new int[] { local22, local19 };
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lclient!f;")
	public static Class1_Sub1_Sub7 method1398(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub7 local12 = (Class1_Sub1_Sub7) Static16.aClass33_35.method1038((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static67.aClass62_20.method2008(arg0, 12);
		local12 = new Class1_Sub1_Sub7();
		if (local22 != null) {
			local12.method635(new Class1_Sub18(local22));
		}
		local12.method634();
		Static16.aClass33_35.method1042(local12, (long) arg0);
		return local12;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public static int anInt1630 = 0;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!gd;")
	public static Class23 aClass23_867 = Static15.method178("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_868 = Static15.method178("weiss:");

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_869 = Static15.method178("p12_full");

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
	public static int[] anIntArray188 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[Lclient!qb;")
	public static Class1_Sub1_Sub2_Sub6[] aClass1_Sub1_Sub2_Sub6Array1 = new Class1_Sub1_Sub2_Sub6[4];

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_870 = Static15.method178("null");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public static void method994(@OriginalArg(0) int arg0) {
		if (!Static113.method1921()) {
			return;
		}
		if (Static109.aBoolean130) {
			Static73.anInt2051 = arg0;
		} else {
			Static39.method864(arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!qa;BI)V")
	public static void method995(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt2213 && arg2 != -1) {
			@Pc(23) int local23 = Static18.method249(arg2).anInt1086;
			if (local23 == 1) {
				arg1.anInt2219 = 0;
				arg1.anInt2215 = 0;
				arg1.anInt2205 = arg0;
				arg1.anInt2201 = 0;
			}
			if (local23 == 2) {
				arg1.anInt2219 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt2213 == -1 || Static18.method249(arg2).anInt1067 >= Static18.method249(arg1.anInt2213).anInt1067) {
			arg1.anInt2205 = arg0;
			arg1.anInt2177 = arg1.anInt2195;
			arg1.anInt2213 = arg2;
			arg1.anInt2201 = 0;
			arg1.anInt2219 = 0;
			arg1.anInt2215 = 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method996() {
		aClass23_870 = null;
		aClass1_Sub1_Sub2_Sub6Array1 = null;
		anIntArray188 = null;
		aClass23_867 = null;
		aClass23_868 = null;
		aClass23_869 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!p;B)V")
	public static void method997(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (arg0.anInt2046 == 0) {
			local7 = Static19.aClass65_1.method1743(arg0.anInt2037, arg0.anInt2039, arg0.anInt2041);
		}
		if (arg0.anInt2046 == 1) {
			local7 = Static19.aClass65_1.method1750(arg0.anInt2037, arg0.anInt2039, arg0.anInt2041);
		}
		@Pc(41) int local41 = 0;
		if (arg0.anInt2046 == 2) {
			local7 = Static19.aClass65_1.method1733(arg0.anInt2037, arg0.anInt2039, arg0.anInt2041);
		}
		if (arg0.anInt2046 == 3) {
			local7 = Static19.aClass65_1.method1762(arg0.anInt2037, arg0.anInt2039, arg0.anInt2041);
		}
		if (local7 != 0) {
			local5 = local7 >> 14 & 0x7FFF;
			@Pc(90) int local90 = Static19.aClass65_1.method1730(arg0.anInt2037, arg0.anInt2039, arg0.anInt2041, local7);
			local9 = local90 & 0x1F;
			local41 = local90 >> 6 & 0x3;
		}
		arg0.anInt2044 = local5;
		arg0.anInt2036 = local9;
		arg0.anInt2050 = local41;
	}
}

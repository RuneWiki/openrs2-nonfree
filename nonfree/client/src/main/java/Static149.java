import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "Lclient!th;")
	public static Class168 aClass168_112;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
	public static int anInt3346;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "Lclient!th;")
	public static Class168 aClass168_113;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	public static int anInt3345 = 0;

	@OriginalMember(owner = "client!kl", name = "L", descriptor = "[C")
	public static char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2417(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 = Static77.method1321(arg0.charAt(local17)) + (local7 << 5) - local7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method2418(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static111.method1807(arg1.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!ug;I)V")
	public static void method2419(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (Static133.anInt3061 < arg1.anInt2798) {
			Static168.method2748(arg1);
		} else if (arg1.anInt2767 >= Static133.anInt3061) {
			Static74.method1292(arg1);
		} else {
			Static282.method4295(arg1);
		}
		if (arg1.anInt2846 < 128 || arg1.anInt2794 < 128 || arg1.anInt2846 >= 13184 || arg1.anInt2794 >= 13184) {
			arg1.anInt2825 = -1;
			arg1.anInt2767 = 0;
			arg1.anInt2798 = 0;
			arg1.anInt2822 = -1;
			arg1.anInt2846 = arg1.anIntArray283[0] * 128 + arg1.method2088() * 64;
			arg1.anInt2794 = arg1.anIntArray286[0] * 128 + arg1.method2088() * 64;
			arg1.method2086();
		}
		if (arg1 == Static56.aClass2_Sub4_Sub2_1 && (arg1.anInt2846 < 1536 || arg1.anInt2794 < 1536 || arg1.anInt2846 >= 11776 || arg1.anInt2794 >= 11776)) {
			arg1.anInt2822 = -1;
			arg1.anInt2825 = -1;
			arg1.anInt2798 = 0;
			arg1.anInt2767 = 0;
			arg1.anInt2846 = arg1.anIntArray283[0] * 128 + arg1.method2088() * 64;
			arg1.anInt2794 = arg1.anIntArray286[0] * 128 + arg1.method2088() * 64;
			arg1.method2086();
		}
		Static281.method2097(arg1);
		Static247.method3810(arg1);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public static void method2421() {
		Static195.aClass1_Sub3_Sub5_3 = null;
		Static23.aClass1_Sub3_Sub13Array2 = null;
		Static104.aClass46Array2 = null;
		Static172.aClass1_Sub3_Sub13Array8 = null;
		Static130.aClass1_Sub3_Sub5_Sub1_2 = null;
		Static225.aClass46Array5 = null;
		Static117.aClass1_Sub3_Sub13Array11 = null;
		Static160.aClass1_Sub3_Sub5_1 = null;
		Static302.aClass1_Sub3_Sub13Array12 = null;
		Static40.aClass1_Sub3_Sub13Array4 = null;
		Static23.aClass1_Sub3_Sub13Array3 = null;
		Static82.aClass1_Sub3_Sub13Array5 = null;
		Static10.aClass1_Sub3_Sub13Array1 = null;
		Static176.aClass1_Sub3_Sub5_2 = null;
		Static198.aClass1_Sub3_Sub13Array10 = null;
		Static181.aClass1_Sub3_Sub13Array9 = null;
		Static122.aClass1_Sub3_Sub13_7 = null;
	}
}

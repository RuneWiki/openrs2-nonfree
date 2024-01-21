import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public static int anInt1580;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_9;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!sf;")
	public static Class5 aClass5_45;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_849 = Static106.method1849("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_850 = Static106.method1849("World");

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
	public static int[] anIntArray239 = new int[2048];

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!rb;")
	public static Class60 aClass60_53 = new Class60(50);

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_851 = aClass66_850;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_852 = Static106.method1849("scape main");

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!sc;")
	public static Class66 aClass66_853 = aClass66_850;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!sc;")
	public static Class66 aClass66_854 = Static106.method1849("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_855 = Static106.method1849("leuchten3:");

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	public static int anInt1591 = 0;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Lclient!sc;")
	public static Class66 aClass66_856 = Static106.method1849("event_opbase");

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method1089() {
		aClass5_45 = null;
		aClass66_853 = null;
		aClass66_854 = null;
		aClass66_852 = null;
		aClass1_Sub10_9 = null;
		aClass66_855 = null;
		anIntArray239 = null;
		aClass66_856 = null;
		aClass66_850 = null;
		aClass66_851 = null;
		aClass66_849 = null;
		anIntArray240 = null;
		aClass60_53 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
	public static boolean method1090(@OriginalArg(1) int arg0) {
		if (Static50.aBooleanArray9[arg0]) {
			return true;
		} else if (Static128.aClass5_91.method120(arg0)) {
			@Pc(23) int local23 = Static128.aClass5_91.method106(arg0);
			if (local23 == 0) {
				Static50.aBooleanArray9[arg0] = true;
				return true;
			}
			if (Static100.aClass1_Sub10ArrayArray1[arg0] == null) {
				Static100.aClass1_Sub10ArrayArray1[arg0] = new Class1_Sub10[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static100.aClass1_Sub10ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static128.aClass5_91.method107(local50, arg0);
					if (local64 != null) {
						Static100.aClass1_Sub10ArrayArray1[arg0][local50] = new Class1_Sub10();
						Static100.aClass1_Sub10ArrayArray1[arg0][local50].anInt1348 = (arg0 << 16) + local50;
						if (local64[0] == -1) {
							Static100.aClass1_Sub10ArrayArray1[arg0][local50].method959(new Class1_Sub12(local64));
						} else {
							Static100.aClass1_Sub10ArrayArray1[arg0][local50].method961(new Class1_Sub12(local64));
						}
					}
				}
			}
			Static50.aBooleanArray9[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!sc;ZLclient!sc;Lclient!sf;)[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] method1091(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) int local13 = arg2.method122(arg0);
		@Pc(19) int local19 = arg2.method116(local13, arg1);
		return Static70.method536(local19, arg2, local13);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method1093(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		Static111.method1873(arg0.anInt1261, arg1, arg0.anInt1271);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1094(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static123.aClass36_1);
		arg0.removeMouseMotionListener(Static123.aClass36_1);
		arg0.removeFocusListener(Static123.aClass36_1);
		Static83.anInt2197 = 0;
	}
}

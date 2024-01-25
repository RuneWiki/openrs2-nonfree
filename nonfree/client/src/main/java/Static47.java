import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
	public static int anInt914;

	@OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
	public static int anInt922;

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "Lclient!dp;")
	public static Class53 aClass53_30;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	public static int anInt899 = 0;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString37 = "Allocated memory";

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_23 = new Class70(128);

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method780() {
		Static260.aClass211_29 = new Class211();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)V")
	public static void method784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub2_Sub8 local12 = Static239.method5786(7, arg0);
		local12.method2648();
		local12.anInt2511 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(II)I")
	public static int method785(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
	public static void method786() {
		Static12.aClass70_7.method1405();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!cj;Lclient!dp;B)V")
	public static void method787(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class53 arg1) {
		Static10.anInterface2_1 = arg0;
		Static354.aClass53_161 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)V")
	public static void method791(@OriginalArg(1) int arg0) {
		Static30.aClass70_18 = new Class70(arg0);
	}
}

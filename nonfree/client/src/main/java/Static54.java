import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "Lclient!aa;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "Lclient!hi;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_463 = Static120.method1824("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_464 = Static120.method1824("Please reload this page)3");

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_467 = Static120.method1824("Attack");

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!rd;")
	public static Class80 aClass80_465 = aClass80_467;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_466 = Static120.method1824("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "Lclient!rd;")
	public static Class80 aClass80_468 = aClass80_464;

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "Lclient!rd;")
	public static Class80 aClass80_469 = aClass80_466;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V")
	public static void method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class92 local13 = local7.aClass92_1;
		if (local13 != null) {
			local13.anInt4400 = local13.anInt4400 * arg3 / 16;
			local13.anInt4394 = local13.anInt4394 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILclient!bc;)[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] method801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1 arg2) {
		return Static15.method244(arg0, arg1, arg2) ? Static157.method2499() : null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lclient!vd;")
	public static Class3_Sub1_Sub18 method802(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub1_Sub18 local15 = (Class3_Sub1_Sub18) Static169.aClass5_15.method139((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static28.aClass1_3.method60(1, arg0);
		local15 = new Class3_Sub1_Sub18();
		if (local29 != null) {
			local15.method3039(new Class3_Sub17(local29), arg0);
		}
		Static169.aClass5_15.method145(local15, (long) arg0);
		return local15;
	}
}

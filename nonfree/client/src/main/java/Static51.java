import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt966;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt965 = -1;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_25 = new Class85("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!rg;)Lclient!ck;")
	public static Class38 method832(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(7) Class38 local7 = new Class38();
		local7.anInt746 = arg0.method5106();
		local7.aClass5_Sub1_Sub18_1 = Static234.method4160(local7.anInt746);
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!eo;")
	public static Class63 method833(@OriginalArg(1) int arg0) {
		@Pc(10) Class63 local10 = (Class63) Static212.aClass109_45.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static259.aClass93_101.method2410(arg0, 29);
		local10 = new Class63();
		if (local20 != null) {
			local10.method1409(arg0, new Class5_Sub12(local20));
		}
		Static212.aClass109_45.method2855((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method834() {
		if (Static236.aClass55_9 == null) {
			return;
		}
		Static70.aClass39_1.method802();
		Static60.method1854();
		Static309.method5417();
		Static131.method2330();
		Static206.method3781();
		Static306.method5357();
		if (Static48.aClass184_1 != null) {
			Static48.aClass184_1.method5011();
		}
		Static269.method4716();
		Static166.method3025();
		Static48.method796();
		Static92.method1666(false);
		Static92.method1669();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(46) Class4_Sub5_Sub2_Sub1 local46 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local41];
			if (local46 != null) {
				local46.anInterface5_3 = null;
				for (@Pc(53) int local53 = 0; local53 < local46.aClass112Array3.length; local53++) {
					local46.aClass112Array3[local53] = null;
				}
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static280.aClass4_Sub5_Sub2_Sub2Array1.length; local77++) {
			@Pc(82) Class4_Sub5_Sub2_Sub2 local82 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local77];
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass112Array3.length; local86++) {
					local82.aClass112Array3[local86] = null;
				}
			}
		}
		Static236.aClass55_9.method5168();
		Static236.aClass55_9 = null;
	}
}

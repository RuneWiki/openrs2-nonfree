import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!kh;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!ul;")
	public static Class172 aClass172_8 = new Class172(4);

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static int anInt1042 = 0;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!c;")
	public static Class17 aClass17_5 = new Class17();

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString36 = "green:";

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static293.anInt5688 && arg1 <= Static100.anInt1982) {
			@Pc(20) int local20 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg0);
			@Pc(26) int local26 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg2);
			Static183.method2963(arg1, local26, local20, arg3);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method930() {
		Static159.aClass172_28.method4350();
		Static90.aClass172_42.method4350();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!cg;ILclient!cg;)V")
	public static void method931(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(6) int local6 = (int) (Math.random() * 21.0D) - 10;
		Static28.aClass22_13 = arg0;
		Static185.aClass22_65 = arg1;
		Static28.aClass22_13.method679(34);
		@Pc(30) int local30 = (int) (Math.random() * 21.0D) - 10;
		@Pc(37) int local37 = (int) (Math.random() * 41.0D) - 20;
		Static105.anInt2107 = local37 + local30;
		@Pc(48) int local48 = (int) (Math.random() * 21.0D) - 10;
		Static31.anInt650 = local37 + local6;
		Static183.anInt3661 = local37 + local48;
	}
}

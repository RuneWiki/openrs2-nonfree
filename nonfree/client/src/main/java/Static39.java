import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public static int anInt645;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "Lclient!mg;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
	public static int anInt640 = 0;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "[Lclient!te;")
	public static Class4_Sub3_Sub19[] aClass4_Sub3_Sub19Array1 = new Class4_Sub3_Sub19[14];

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString49 = "M";

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "J")
	public static long aLong32 = 0L;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public static void method605(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static107.anInt5399 != -1) {
				Static257.method4062(Static107.anInt5399);
			}
			for (@Pc(15) Class4_Sub27 local15 = (Class4_Sub27) Static148.aClass85_13.method1843(); local15 != null; local15 = (Class4_Sub27) Static148.aClass85_13.method1844()) {
				Static203.method3259(true, local15);
			}
			Static107.anInt5399 = -1;
			Static148.aClass85_13 = new Class85(8);
			Static68.method1068();
			Static107.anInt5399 = Static280.anInt742;
			Static50.method777(false);
			Static58.method933();
			Static71.method1102(Static107.anInt5399);
		}
		Static313.anInt6054 = -1;
		Static56.method966(Static166.anInt3407);
		Static154.aClass53_Sub1_Sub1_2 = new Class53_Sub1_Sub1();
		Static154.aClass53_Sub1_Sub1_2.anInt4002 = 3000;
		Static154.aClass53_Sub1_Sub1_2.anInt3974 = 3000;
		if (!Static94.aBoolean138 && Static76.anInt5724 == 0) {
			Static132.method2006(Static7.aClass58_4);
			Static15.method233(10);
			return;
		}
		if (Static41.anInt772 == 2) {
			Static129.anInt2519 = Static151.anInt2977 << 7;
			Static302.anInt5682 = Static212.anInt4165 << 7;
		} else {
			Static84.method1496();
		}
		if (Static94.aBoolean138) {
			Static99.method1655();
		}
		Static207.method3335();
		Static15.method233(28);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!pm;)[Lclient!ub;")
	public static Class172[] method610(@OriginalArg(1) Class139 arg0) {
		if (!arg0.method3509()) {
			return new Class172[0];
		}
		@Pc(17) Class185 local17 = arg0.method3506();
		while (local17.anInt5623 == 0) {
			Static303.method4677(10L);
		}
		if (local17.anInt5623 == 2) {
			return new Class172[0];
		}
		@Pc(39) int[] local39 = (int[]) local17.anObject7;
		@Pc(45) Class172[] local45 = new Class172[local39.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local45.length; local53++) {
			@Pc(65) Class172 local65 = new Class172();
			local45[local53] = local65;
			local65.anInt5277 = local39[local53 << 2];
			local65.anInt5276 = local39[(local53 << 2) + 1];
			local65.anInt5280 = local39[(local53 << 2) + 2];
			local65.anInt5278 = local39[(local53 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bk;")
	public static RuntimeException_Sub1 method612(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString31 = local12.aString31 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}

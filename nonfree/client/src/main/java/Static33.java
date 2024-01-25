import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array19;

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "Lclient!jb;")
	public static Class125 aClass125_5;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public static void method5356() {
		@Pc(5) int local5 = 0;
		if (Static361.aClass85_Sub1_1.method2105(Static423.anInt7114)) {
			local5 = 55;
		}
		if (!Static361.aClass85_Sub1_1.aBoolean167) {
			local5 |= 0x40;
		}
		Static404.method5327(local5);
		Static342.aClass237_4.method5211(local5);
		Static313.aClass272_2.method6064(local5);
		Static448.aClass38_4.method867(local5);
		Static147.aClass107_1.method2641(local5);
		Static434.method5742(local5);
		Static263.method5392(local5);
		Static362.method4862(local5);
		Static60.method5646(local5);
		Static44.method658();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
	public static void method5357() {
		@Pc(11) Class240[] local11 = Class10_Sub2_Sub28.aClass240Array1;
		synchronized (Class10_Sub2_Sub28.aClass240Array1) {
			for (@Pc(15) int local15 = 0; local15 < Class10_Sub2_Sub28.aClass240Array1.length; local15++) {
				Class10_Sub2_Sub28.aClass240Array1[local15] = new Class240();
				Static136.anIntArray279[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)I")
	public static int method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static264.anInt4667 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(18) int local18 = arg2 - Static143.anInt2867;
		@Pc(22) int local22 = arg0 - Static143.anInt2863;
		for (@Pc(32) Class10_Sub46 local32 = (Class10_Sub46) Static143.aClass163_27.method3620(); local32 != null; local32 = (Class10_Sub46) Static143.aClass163_27.method3621()) {
			if (arg1 == local32.anInt7522) {
				@Pc(41) int local41 = local32.anInt7526;
				@Pc(44) int local44 = local32.anInt7523;
				@Pc(54) int local54 = local41 + Static143.anInt2867 << 14 | local44 + Static143.anInt2863;
				@Pc(70) int local70 = (local22 - local44) * (local22 - local44) + (local18 - local41) * (local18 - local41);
				if (local12 < 0 || local14 > local70) {
					local14 = local70;
					local12 = local54;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)V")
	public static void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		if (arg3 > arg0) {
			for (local15 = arg0; local15 < arg3; local15++) {
				Class10_Sub10_Sub1.lb[local15][arg1] = arg2;
			}
		} else {
			for (local15 = arg3; local15 < arg0; local15++) {
				Class10_Sub10_Sub1.lb[local15][arg1] = arg2;
			}
		}
	}
}

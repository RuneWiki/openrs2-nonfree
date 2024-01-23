import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!ic;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!kh;")
	private static Class60 aClass60_767 = Static200.method3116("Drop");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_764 = aClass60_767;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt2368 = -1;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public static int anInt2370 = 0;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_765 = Static200.method3116("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_766 = Static200.method3116("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_768 = Static200.method3116("leuchten3:");

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "[Lclient!nc;")
	public static Class1_Sub9[] aClass1_Sub9Array1 = new Class1_Sub9[2048];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[I)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(8) int local8 = arg1 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg0 < local11) {
			@Pc(15) int local15 = arg0 + 1;
			arg3[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			arg0 = local45 + 1;
			arg3[arg0] = arg2;
		}
		while (local8 > arg0) {
			arg0++;
			arg3[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BJ)V")
	public static void method1769(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static135.anInt2930 >= 100 && Static173.anInt3728 != 1 || Static135.anInt2930 >= 200) {
			Static13.method239(Static149.aClass60_1155, Static96.aClass60_728, 0);
			return;
		}
		@Pc(39) Class60 local39 = Static144.method2484(arg0).method1812();
		for (@Pc(41) int local41 = 0; local41 < Static135.anInt2930; local41++) {
			if (arg0 == Static29.aLongArray1[local41]) {
				Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { local39, Static114.aClass60_864 }), 0);
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static78.anInt1884; local72++) {
			if (arg0 == Static140.aLongArray7[local72]) {
				Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { Static165.aClass60_1030, local39, Static173.aClass60_1280 }), 0);
				return;
			}
		}
		if (local39.method1826(Static84.aClass9_Sub4_Sub1_2.aClass60_414)) {
			Static13.method239(Static149.aClass60_1155, Static192.aClass60_1389, 0);
			return;
		}
		Static61.aClass60Array9[Static135.anInt2930] = local39;
		Static29.aLongArray1[Static135.anInt2930] = arg0;
		Static90.anIntArray247[Static135.anInt2930] = 0;
		Static167.aClass60Array27[Static135.anInt2930] = Static149.aClass60_1155;
		Static213.anIntArray610[Static135.anInt2930] = 0;
		Static132.aBooleanArray18[Static135.anInt2930] = false;
		Static135.anInt2930++;
		Static181.anInt3848 = Static171.anInt3707;
		Static96.aClass1_Sub9_Sub1_3.method953(82);
		Static96.aClass1_Sub9_Sub1_3.method897(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!jd;")
	public static RuntimeException_Sub1 method1771(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}

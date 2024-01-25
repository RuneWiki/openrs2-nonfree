import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!sj;")
	public static Class181 aClass181_59;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	public static int anInt6840 = 0;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
	public static int anInt6843 = 0;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString261 = null;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIII)V")
	public static void method5721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg4);
		@Pc(17) int local17 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg2);
		@Pc(23) int local23 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg5);
		@Pc(29) int local29 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3);
		@Pc(37) int local37 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg4 + arg1);
		@Pc(46) int local46 = Static312.method5334(Static236.anInt4721, Static73.anInt1425, arg2 - arg1);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static162.method1731(local29, Static196.anIntArrayArray37[local48], local23, arg0);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static162.method1731(local29, Static196.anIntArrayArray37[local64], local23, arg0);
		}
		@Pc(90) int local90 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg1 + arg5);
		@Pc(99) int local99 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg3 - arg1);
		for (@Pc(112) int local112 = local37; local112 <= local46; local112++) {
			@Pc(118) int[] local118 = Static196.anIntArrayArray37[local112];
			Static162.method1731(local90, local118, local23, arg0);
			Static162.method1731(local29, local118, local99, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIZFII)[I")
	public static int[] method5723(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub3_Sub6 local10 = new Class3_Sub3_Sub6();
		local10.anInt1363 = 8;
		local10.anInt1374 = 35;
		local10.aBoolean71 = true;
		local10.anInt1369 = 8;
		local10.anInt1364 = 4;
		local10.anInt1376 = (int) (arg0 * 4096.0F);
		local10.method5730();
		Static36.method664(2048, 1);
		local10.method1063(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	public static void method5726() {
		Static243.aClass120_6 = null;
		Static204.aClass57Array13 = null;
		Static232.aClass57Array15 = null;
		Static153.aClass57Array10 = null;
		Static83.aClass120_1 = null;
		Static232.aClass120_5 = null;
		Static284.aClass57Array20 = null;
		Static55.aClass57Array19 = null;
		Static147.aClass57Array9 = null;
		Static322.aClass57Array25 = null;
		Static221.aClass57Array14 = null;
		Static257.aClass57Array17 = null;
		Static6.aClass57Array23 = null;
		Static82.aClass57Array4 = null;
		Static271.aClass57Array18 = null;
		Static287.aClass57Array21 = null;
		Static190.aClass57_11 = null;
	}
}

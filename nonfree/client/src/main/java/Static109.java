import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
	public static int anInt2543;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Lclient!km;")
	public static Class91 aClass91_91;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "Lclient!td;")
	public static Class156 aClass156_5;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Lclient!qk;")
	public static Class140 aClass140_3 = new Class140();

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "Lclient!mk;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[III[J)V")
	public static void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg0; local42++) {
			if (local16 + (long) (local42 & 0x1) > arg3[local42]) {
				@Pc(69) long local69 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local69;
				@Pc(83) int local83 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local83;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg1[arg0] = arg1[local12];
		arg1[local12] = local30;
		method2009(local12 - 1, arg1, arg2, arg3);
		method2009(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!cg;I)Lclient!bk;")
	public static Class15_Sub1 method2011(@OriginalArg(0) Class1_Sub11 arg0) {
		return new Class15_Sub1(arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2681(), arg0.method2681(), arg0.method2690());
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)I")
	public static int method2012(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class1_Sub33 local19 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg0);
		if (local19 == null) {
			return Static104.method1934(arg0).anInt3778;
		}
		@Pc(31) int local31 = 0;
		for (@Pc(39) int local39 = 0; local39 < local19.anIntArray505.length; local39++) {
			if (local19.anIntArray505[local39] == -1) {
				local31++;
			}
		}
		return local31 + Static104.method1934(arg0).anInt3778 - local19.anIntArray505.length;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!km;III)Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 method2013(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static240.method3698(arg2, arg1, arg0) ? Static204.method3285() : null;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)V")
	public static void method2014() {
		Static296.aClass135_41.method3324();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
	public static void method2015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg1;
		@Pc(14) int local14 = arg5 - arg1;
		@Pc(18) int local18 = arg1 + arg3;
		@Pc(23) int local23 = arg0 - arg1;
		@Pc(25) int local25;
		for (local25 = arg4; local25 < local10; local25++) {
			Static126.method1523(Static22.anIntArrayArray3[local25], arg0, arg2, arg3);
		}
		for (local25 = arg5; local25 > local14; local25--) {
			Static126.method1523(Static22.anIntArrayArray3[local25], arg0, arg2, arg3);
		}
		for (local25 = local10; local25 <= local14; local25++) {
			@Pc(73) int[] local73 = Static22.anIntArrayArray3[local25];
			Static126.method1523(local73, local18, arg2, arg3);
			Static126.method1523(local73, arg0, arg2, local23);
		}
	}
}

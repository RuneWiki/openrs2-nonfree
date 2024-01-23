import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public static int anInt5085 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method3976(@OriginalArg(0) long arg0) {
		return Static252.method3871(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIII)V")
	public static void method3977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(41) String local41 = "::tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local41);
		Static86.method1491(local41);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method3978() {
		Static27.method552();
		Static281.anInterface1Array3 = new Interface1[9];
		Static281.anInterface1Array3[1] = new Class66();
		Static281.anInterface1Array3[2] = new Class5();
		Static281.anInterface1Array3[3] = new Class60();
		Static281.anInterface1Array3[4] = new Class149();
		Static281.anInterface1Array3[5] = new Class147();
		Static281.anInterface1Array3[6] = new Class18();
		Static281.anInterface1Array3[7] = new Class161();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public static void method3979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		Static126.method1523(Static22.anIntArrayArray3[arg2], arg3 + arg0, arg1, arg3 - arg0);
		@Pc(23) int local23 = arg0;
		@Pc(26) int local26 = -arg0;
		@Pc(32) int local32 = -1;
		while (local23 > local7) {
			local7++;
			local32 += 2;
			local26 += local32;
			if (local26 >= 0) {
				local23--;
				@Pc(55) int[] local55 = Static22.anIntArrayArray3[arg2 + local23];
				local26 -= local23 << 1;
				@Pc(68) int[] local68 = Static22.anIntArrayArray3[arg2 - local23];
				@Pc(73) int local73 = arg3 - local7;
				@Pc(78) int local78 = arg3 + local7;
				Static126.method1523(local55, local78, arg1, local73);
				Static126.method1523(local68, local78, arg1, local73);
			}
			@Pc(95) int local95 = arg3 - local23;
			@Pc(99) int local99 = arg3 + local23;
			@Pc(106) int[] local106 = Static22.anIntArrayArray3[arg2 + local7];
			@Pc(113) int[] local113 = Static22.anIntArrayArray3[arg2 - local7];
			Static126.method1523(local106, local99, arg1, local95);
			Static126.method1523(local113, local99, arg1, local95);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I")
	public static int method3980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub33 local10 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray507.length > arg0) {
			return local10.anIntArray507[arg0];
		} else {
			return 0;
		}
	}
}

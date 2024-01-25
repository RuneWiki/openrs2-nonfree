import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_21 = new Class21("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_65 = new Class214(19, 3);

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	public static int anInt1715 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
	public static void method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		Static236.method3990(arg2 + arg0, arg2 + -arg0, Static400.anIntArrayArray54[arg3], arg1);
		@Pc(35) int local35 = -1;
		while (local14 > local12) {
			local35 += 2;
			local12++;
			local17 += local35;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(58) int[] local58 = Static400.anIntArrayArray54[arg3 + local14];
				@Pc(65) int[] local65 = Static400.anIntArrayArray54[arg3 - local14];
				@Pc(69) int local69 = local12 + arg2;
				@Pc(74) int local74 = arg2 - local12;
				Static236.method3990(local69, local74, local58, arg1);
				Static236.method3990(local69, local74, local65, arg1);
			}
			@Pc(90) int local90 = local14 + arg2;
			@Pc(95) int local95 = arg2 - local14;
			@Pc(101) int[] local101 = Static400.anIntArrayArray54[local12 + arg3];
			@Pc(107) int[] local107 = Static400.anIntArrayArray54[arg3 - local12];
			Static236.method3990(local90, local95, local101, arg1);
			Static236.method3990(local90, local95, local107, arg1);
		}
	}
}

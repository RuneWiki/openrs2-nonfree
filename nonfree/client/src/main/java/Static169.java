import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	public static int anInt3265;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "Lclient!al;")
	public static Class11 aClass11_6;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_146 = new Class22(54, -2);

	@OriginalMember(owner = "client!in", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIBI)V")
	public static void method2755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(17) int local17 = -arg1;
		Static251.method3640(arg0 - arg1, arg3, arg0 + arg1, Static96.anIntArrayArray21[arg2]);
		@Pc(33) int local33 = -1;
		while (local14 > local7) {
			local33 += 2;
			local17 += local33;
			local7++;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(59) int[] local59 = Static96.anIntArrayArray21[local14 + arg2];
				@Pc(65) int[] local65 = Static96.anIntArrayArray21[arg2 - local14];
				@Pc(69) int local69 = arg0 + local7;
				@Pc(74) int local74 = arg0 - local7;
				Static251.method3640(local74, arg3, local69, local59);
				Static251.method3640(local74, arg3, local69, local65);
			}
			@Pc(91) int local91 = arg0 + local14;
			@Pc(96) int local96 = arg0 - local14;
			@Pc(103) int[] local103 = Static96.anIntArrayArray21[arg2 + local7];
			@Pc(110) int[] local110 = Static96.anIntArrayArray21[arg2 - local7];
			Static251.method3640(local96, arg3, local91, local103);
			Static251.method3640(local96, arg3, local91, local110);
		}
	}
}

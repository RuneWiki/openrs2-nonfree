import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	public static int anInt2871;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public static int anInt2874;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_40 = new Class187(30, 3);

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
	public static final int[] anIntArray166 = new int[3];

	@OriginalMember(owner = "client!g", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public static void method2562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg3;
		@Pc(10) int local10 = -arg3;
		Static343.method5202(arg0 - arg3, Static286.anIntArrayArray42[arg1], arg2, arg0 + arg3);
		@Pc(27) int local27 = -1;
		while (local5 < local7) {
			local27 += 2;
			local10 += local27;
			local5++;
			if (local10 >= 0) {
				local7--;
				local10 -= local7 << 1;
				@Pc(52) int[] local52 = Static286.anIntArrayArray42[local7 + arg1];
				@Pc(59) int[] local59 = Static286.anIntArrayArray42[arg1 - local7];
				@Pc(63) int local63 = local5 + arg0;
				@Pc(68) int local68 = arg0 - local5;
				Static343.method5202(local68, local52, arg2, local63);
				Static343.method5202(local68, local59, arg2, local63);
			}
			@Pc(86) int local86 = local7 + arg0;
			@Pc(91) int local91 = arg0 - local7;
			@Pc(97) int[] local97 = Static286.anIntArrayArray42[local5 + arg1];
			@Pc(103) int[] local103 = Static286.anIntArrayArray42[arg1 - local5];
			Static343.method5202(local91, local97, arg2, local86);
			Static343.method5202(local91, local103, arg2, local86);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)[Lclient!pb;")
	public static Class267[] method2564() {
		return new Class267[] { Static71.aClass267_2, Static206.aClass267_4, Static67.aClass267_1, Static619.aClass267_7, Static223.aClass267_5, Static578.aClass267_6 };
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)I")
	public static int method2565() {
		return Static219.anInt3473;
	}
}

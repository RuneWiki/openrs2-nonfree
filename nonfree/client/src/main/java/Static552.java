import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array21;

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_125;

	@OriginalMember(owner = "client!vba", name = "r", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_146 = new Class47(23, 11);

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_105 = new Class136(4);

	@OriginalMember(owner = "client!vba", name = "z", descriptor = "[I")
	public static final int[] anIntArray695 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!vba", name = "C", descriptor = "I")
	public static int anInt9133 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IZI)Z")
	public static boolean method7481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
	public static void method7483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static201.method3634(arg3 + arg0, Static461.anInt7899, Static13.anInt7634);
		@Pc(37) int local37 = Static201.method3634(arg0 - arg3, Static461.anInt7899, Static13.anInt7634);
		Static208.method3687(local37, arg1, Static454.anIntArrayArray71[arg2], local26);
		while (local11 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(87) int local87;
			@Pc(96) int local96;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local69 = arg2 - local13;
				local73 = arg2 + local13;
				if (Static583.anInt9478 <= local73 && Static415.anInt9494 >= local69) {
					local87 = Static201.method3634(local11 + arg0, Static461.anInt7899, Static13.anInt7634);
					local96 = Static201.method3634(arg0 - local11, Static461.anInt7899, Static13.anInt7634);
					if (local73 <= Static415.anInt9494) {
						Static208.method3687(local96, arg1, Static454.anIntArrayArray71[local73], local87);
					}
					if (Static583.anInt9478 <= local69) {
						Static208.method3687(local96, arg1, Static454.anIntArrayArray71[local69], local87);
					}
				}
			}
			local11++;
			local69 = arg2 - local11;
			local73 = local11 + arg2;
			if (local73 >= Static583.anInt9478 && Static415.anInt9494 >= local69) {
				local87 = Static201.method3634(local13 + arg0, Static461.anInt7899, Static13.anInt7634);
				local96 = Static201.method3634(arg0 - local13, Static461.anInt7899, Static13.anInt7634);
				if (Static415.anInt9494 >= local73) {
					Static208.method3687(local96, arg1, Static454.anIntArrayArray71[local73], local87);
				}
				if (local69 >= Static583.anInt9478) {
					Static208.method3687(local96, arg1, Static454.anIntArrayArray71[local69], local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method7484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg2 < 1 || Static473.anInt8075 - 2 < arg0 || arg2 > Static165.anInt6749 - 2) {
			return;
		}
		@Pc(25) int local25 = arg6;
		if (arg6 < 3 && Static270.method4475(arg0, arg2)) {
			local25 = arg6 + 1;
		}
		if (!Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242) && !Static353.method5386(arg2, arg0, Static294.anInt5492, local25)) {
			return;
		}
		if (Static270.aClass276ArrayArrayArray2 == null) {
			return;
		}
		Static20.aClass115_Sub1_1.method3155(Static579.aClass189Array4[arg6], arg0, Static240.aClass14_7, arg6, arg2, arg4);
		if (arg3 >= 0) {
			@Pc(68) boolean local68 = Static140.aClass6_Sub48_Sub1_1.aBoolean674;
			Static140.aClass6_Sub48_Sub1_1.aBoolean674 = true;
			Static20.aClass115_Sub1_1.method3153(arg7, arg5, arg0, arg1, arg3, arg6, Static240.aClass14_7, local25, arg2, Static579.aClass189Array4[arg6]);
			Static140.aClass6_Sub48_Sub1_1.aBoolean674 = local68;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IB)Z")
	public static boolean method7485(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)V")
	public static void method7486(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static401.method5861(arg0, 3);
		local12.method2580();
	}
}

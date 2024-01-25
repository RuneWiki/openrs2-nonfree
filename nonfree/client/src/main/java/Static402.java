import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!f;")
	public static Class10 aClass10_31;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Z")
	public static boolean aBoolean498;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)Lclient!lr;")
	public static Class208_Sub1 method5681() {
		return Static96.anInt2042 < Static161.aClass208_Sub1Array1.length ? Static161.aClass208_Sub1Array1[Static96.anInt2042++] : null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIII)V")
	public static void method5682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static494.anInt8295 || Static126.anInt6658 > arg1) {
			return;
		}
		@Pc(22) boolean local22;
		if (Static487.anInt8210 > arg4) {
			arg4 = Static487.anInt8210;
			local22 = false;
		} else if (Static278.anInt5111 >= arg4) {
			local22 = true;
		} else {
			local22 = false;
			arg4 = Static278.anInt5111;
		}
		@Pc(57) boolean local57;
		if (arg2 < Static487.anInt8210) {
			local57 = false;
			arg2 = Static487.anInt8210;
		} else if (arg2 > Static278.anInt5111) {
			arg2 = Static278.anInt5111;
			local57 = false;
		} else {
			local57 = true;
		}
		if (Static126.anInt6658 <= arg0) {
			Static250.method4000(arg2, Static478.anIntArrayArray51[arg0++], arg4, arg3);
		} else {
			arg0 = Static126.anInt6658;
		}
		if (Static494.anInt8295 < arg1) {
			arg1 = Static494.anInt8295;
		} else {
			Static250.method4000(arg2, Static478.anIntArrayArray51[arg1--], arg4, arg3);
		}
		@Pc(111) int local111;
		if (local22 && local57) {
			for (local111 = arg0; local111 <= arg1; local111++) {
				@Pc(151) int[] local151 = Static478.anIntArrayArray51[local111];
				local151[arg4] = local151[arg2] = arg3;
			}
		} else if (local22) {
			for (local111 = arg0; local111 <= arg1; local111++) {
				Static478.anIntArrayArray51[local111][arg4] = arg3;
			}
		} else if (local57) {
			for (local111 = arg0; local111 <= arg1; local111++) {
				Static478.anIntArrayArray51[local111][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	public static int method5683(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[B)Z")
	public static boolean method5685(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub20 local8 = new Class1_Sub20(arg0);
		@Pc(12) int local12 = local8.method4393();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method4393() == 1;
		if (local28) {
			Static548.method7476(local8);
		}
		Static12.method211(local8);
		return true;
	}
}

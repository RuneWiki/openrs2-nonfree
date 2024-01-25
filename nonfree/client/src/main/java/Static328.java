import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)Z")
	public static boolean method4867(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZZIIIII)V")
	public static void method4869(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= arg5) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg5) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) Class48_Sub1 local29 = Static497.aClass48_Sub1Array2[local23];
		Static497.aClass48_Sub1Array2[local23] = Static497.aClass48_Sub1Array2[arg5];
		Static497.aClass48_Sub1Array2[arg5] = local29;
		for (@Pc(41) int local41 = arg2; local41 < arg5; local41++) {
			if (Static490.method6608(local29, arg3, arg0, Static497.aClass48_Sub1Array2[local41], arg1, arg4) <= 0) {
				@Pc(61) Class48_Sub1 local61 = Static497.aClass48_Sub1Array2[local41];
				Static497.aClass48_Sub1Array2[local41] = Static497.aClass48_Sub1Array2[local25];
				Static497.aClass48_Sub1Array2[local25++] = local61;
			}
		}
		Static497.aClass48_Sub1Array2[arg5] = Static497.aClass48_Sub1Array2[local25];
		Static497.aClass48_Sub1Array2[local25] = local29;
		method4869(arg0, arg1, arg2, arg3, arg4, local25 - 1);
		method4869(arg0, arg1, local25 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!ob;II)Z")
	public static boolean method4870(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		Static362.aClass42_3.method7518(arg0.anIntArray368[arg1], arg0.anIntArray366[arg1], arg0.anIntArray367[arg1], Static552.anIntArray558);
		@Pc(22) int local22 = Static552.anIntArray558[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray100[arg1] = (short) (Static552.anIntArray558[0] * Static437.anInt7748 / local22 + Static176.anInt3895);
			arg0.aShortArray98[arg1] = (short) (Static459.anInt8016 + Static219.anInt4579 * Static552.anIntArray558[1] / local22);
			arg0.aShortArray99[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "([Lclient!f;I)V")
	public static void method4872(@OriginalArg(0) Class73[] arg0) {
		Static215.anInt4496 = arg0.length;
		Static147.aClass73Array5 = new Class73[Static215.anInt4496 + 10];
		Static93.anIntArray79 = new int[Static215.anInt4496 + 10];
		Static604.method6223(arg0, 0, Static147.aClass73Array5, 0, Static215.anInt4496);
		for (@Pc(26) int local26 = 0; local26 < Static215.anInt4496; local26++) {
			Static93.anIntArray79[local26] = Static147.aClass73Array5[local26].ca();
		}
		for (@Pc(41) int local41 = Static215.anInt4496; local41 < Static147.aClass73Array5.length; local41++) {
			Static93.anIntArray79[local41] = 12;
		}
	}
}

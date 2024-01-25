import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Lclient!ok;")
	public static Class147 aClass147_7;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_124;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public static int anInt5712 = 0;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
	public static int anInt5713 = 0;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Z")
	public static boolean aBoolean503 = true;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
	public static boolean aBoolean504 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z")
	public static boolean method4832() {
		return anInt5713 > 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([I[IIII)V")
	public static void method4833(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg3; local42++) {
			if (arg0[local42] < (local42 & 0x1) + local16) {
				@Pc(61) int local61 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local61;
				@Pc(75) int local75 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local75;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg3] = arg1[local12];
		arg1[local12] = local30;
		method4833(arg0, arg1, arg2, local12 - 1);
		method4833(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIILclient!sn;Lclient!sn;)V")
	public static void method4834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub4 arg3, @OriginalArg(4) Class2_Sub4 arg4) {
		if (Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static333.method78(arg0, arg1, arg2);
		}
		Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2].aClass2_Sub4_1 = arg3;
		Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2].aClass2_Sub4_2 = arg4;
	}
}

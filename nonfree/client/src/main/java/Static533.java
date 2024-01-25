import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static int anInt8939;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static int anInt8941;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILclient!sw;)V")
	public static void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub3_Sub1 arg3) {
		@Pc(4) Class39 local4 = Static589.method7833(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub3_Sub1_1 = arg3;
		@Pc(16) int local16 = Static199.aClass47Array1 == Static557.aClass47Array3 ? 1 : 0;
		if (arg3.method7622()) {
			if (arg3.method7620()) {
				Static471.aClass8_Sub3ArrayArray3[local16][Static437.anIntArray588[local16]++] = arg3;
				return;
			}
			Static34.aClass8_Sub3ArrayArray4[local16][Static11.anIntArray12[local16]++] = arg3;
			return;
		}
		Static88.aClass8_Sub3ArrayArray2[local16][Static583.anIntArray731[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lclient!cp;")
	public static Class59 method7308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class59 local12 = new Class59();
		local12.anInt1347 = arg1 + 6;
		local12.anInt1343 = arg0 + 6;
		local12.anInt1342 = -1;
		local12.anInt1345 = -1;
		local12.anIntArrayArray34 = new int[local12.anInt1347][local12.anInt1343];
		local12.method1192();
		return local12;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIII)I")
	public static int method7309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(16) int local16 = arg4;
			arg4 = arg5;
			arg5 = local16;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return 1 + 7 - arg5 - arg3;
		}
	}
}

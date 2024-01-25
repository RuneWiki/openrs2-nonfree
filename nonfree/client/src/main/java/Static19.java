import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
	public static boolean aBoolean22;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_3 = new Class187(64);

	@OriginalMember(owner = "client!an", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!an", name = "w", descriptor = "I")
	public static int anInt242 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILclient!sj;)V")
	public static void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub3_Sub5 arg4) {
		@Pc(4) Class39 local4 = Static589.method7833(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9365 = (arg1 << Static351.anInt5832) + Static142.anInt2687;
		arg4.anInt9361 = arg3;
		arg4.anInt9370 = (arg2 << Static351.anInt5832) + Static142.anInt2687;
		if (local4.aClass8_Sub3_Sub1_1 != null) {
			arg4.anInt9361 -= local4.aClass8_Sub3_Sub1_1.aShort37;
		}
		local4.aClass8_Sub3_Sub5_1 = arg4;
		@Pc(44) int local44 = Static199.aClass47Array1 == Static557.aClass47Array3 ? 1 : 0;
		if (arg4.method7622()) {
			if (arg4.method7620()) {
				Static471.aClass8_Sub3ArrayArray3[local44][Static437.anIntArray588[local44]++] = arg4;
				return;
			}
			Static34.aClass8_Sub3ArrayArray4[local44][Static11.anIntArray12[local44]++] = arg4;
			return;
		}
		Static88.aClass8_Sub3ArrayArray2[local44][Static583.anIntArray731[local44]++] = arg4;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)V")
	public static void method187() {
		if (Static90.anInt1938 == 1 || Static90.anInt1938 == 3 || Static90.anInt1938 != Static92.anInt1987 && (Static90.anInt1938 == 0 || Static92.anInt1987 == 0)) {
			Static35.anInt540 = 0;
			Static39.anInt609 = 0;
			Static84.aClass187_40.method3801();
		}
		Static92.anInt1987 = Static90.anInt1938;
	}
}

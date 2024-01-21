import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_27;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1417 = Static120.method1824("settings=");

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public static int anInt3661 = 0;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "Lclient!of;")
	public static final Class70 aClass70_22 = new Class70();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBIIIII)V")
	public static void method2644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = Static61.method895(arg2, Static34.anInt790, Static17.anInt440);
		@Pc(22) int local22 = Static61.method895(arg4, Static34.anInt790, Static17.anInt440);
		@Pc(28) int local28 = Static61.method895(arg1, Static172.anInt3861, Static85.anInt1779);
		@Pc(34) int local34 = Static61.method895(arg5, Static172.anInt3861, Static85.anInt1779);
		@Pc(43) int local43 = Static61.method895(arg2 + arg3, Static34.anInt790, Static17.anInt440);
		@Pc(51) int local51 = Static61.method895(arg4 - arg3, Static34.anInt790, Static17.anInt440);
		for (@Pc(53) int local53 = local16; local53 < local43; local53++) {
			Static46.method726(local28, arg0, Static96.anIntArrayArray27[local53], local34);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static46.method726(local28, arg0, Static96.anIntArrayArray27[local73], local34);
		}
		@Pc(99) int local99 = Static61.method895(arg1 + arg3, Static172.anInt3861, Static85.anInt1779);
		@Pc(107) int local107 = Static61.method895(arg5 - arg3, Static172.anInt3861, Static85.anInt1779);
		for (@Pc(109) int local109 = local43; local109 <= local51; local109++) {
			@Pc(115) int[] local115 = Static96.anIntArrayArray27[local109];
			Static46.method726(local28, arg0, local115, local99);
			Static46.method726(local107, arg0, local115, local34);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method2645() {
		Static17.anIntArray64 = null;
		Static49.anIntArray152 = null;
		Static27.anIntArray523 = null;
		Static101.anIntArray288 = null;
		Static86.anIntArray220 = null;
		Static167.aByteArrayArray10 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	public static int anInt3799;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_117;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!ch;")
	public static Class14 aClass14_190 = new Class14(64);

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public static int anInt3798 = 0;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
	public static int anInt3800 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!gg;Lclient!gg;Lclient!gg;Z)V")
	public static void method2647(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2) {
		Static138.aClass28_1855 = arg0;
		Static138.aClass28_1861 = arg2;
		Static138.aClass28_1859 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public static void method2648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub11 local8 = (Class2_Sub11) Static101.aClass35_6.method1354((long) arg3);
		if (local8 == null) {
			local8 = new Class2_Sub11();
			Static101.aClass35_6.method1362(local8, (long) arg3);
		}
		if (arg0 >= local8.anIntArray203.length) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			for (@Pc(45) int local45 = 0; local45 < local8.anIntArray203.length; local45++) {
				local38[local45] = local8.anIntArray203[local45];
				local43[local45] = local8.anIntArray202[local45];
			}
			for (@Pc(75) int local75 = local8.anIntArray203.length; local75 < arg0; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local8.anIntArray202 = local43;
			local8.anIntArray203 = local38;
		}
		local8.anIntArray203[arg0] = arg1;
		local8.anIntArray202[arg0] = arg2;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	public static void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass52_1 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method2650() {
		aClass40_Sub1_117 = null;
		aClass14_190 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!jc;Lclient!jc;Lclient!jc;I)V")
	public static void method2651(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		Static123.aClass40_31 = arg1;
		Static24.aClass40_10 = arg0;
		Static85.aClass40_23 = arg2;
	}
}

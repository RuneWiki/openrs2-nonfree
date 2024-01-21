import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Lclient!kg;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!og;")
	public static final Class2_Sub3 aClass2_Sub3_5 = new Class2_Sub3(8);

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
	public static final int anInt4590 = 50;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Lclient!ob;")
	public static Class60 method3523(@OriginalArg(1) int arg0) {
		@Pc(10) Class60 local10 = Static72.method1661(arg0);
		for (@Pc(20) int local20 = local10.method2673() - 3; local20 > 0; local20 -= 3) {
			local10 = Static193.method3536(new Class60[] { local10.method2667(local20, 0), Static87.aClass60_702, local10.method2672(local20) });
		}
		if (local10.method2673() > 9) {
			return Static193.method3536(new Class60[] { Static140.aClass60_1005, local10.method2667(local10.method2673() - 8, 0), Static79.aClass60_640, Static181.aClass60_1216, local10, Static96.aClass60_865 });
		} else if (local10.method2673() > 6) {
			return Static193.method3536(new Class60[] { Static36.aClass60_247, local10.method2667(local10.method2673() - 4, 0), Static22.aClass60_160, Static181.aClass60_1216, local10, Static96.aClass60_865 });
		} else {
			return Static193.method3536(new Class60[] { Static117.aClass60_221, local10, Static167.aClass60_1131 });
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public static void method3524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub15 local12 = (Class2_Sub15) Static88.aClass51_7.method2458((long) arg2);
		if (local12 == null) {
			local12 = new Class2_Sub15();
			Static88.aClass51_7.method2463(local12, (long) arg2);
		}
		if (arg0 >= local12.anIntArray391.length) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray391.length; local45++) {
				local38[local45] = local12.anIntArray391[local45];
				local43[local45] = local12.anIntArray393[local45];
			}
			for (@Pc(75) int local75 = local12.anIntArray391.length; local75 < arg0; local75++) {
				local38[local75] = -1;
				local43[local75] = 0;
			}
			local12.anIntArray391 = local38;
			local12.anIntArray393 = local43;
		}
		local12.anIntArray391[arg0] = arg1;
		local12.anIntArray393[arg0] = arg3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZI)I")
	public static int method3525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static54.aClass2_Sub1_Sub20_1 != null && local11 == Static54.aClass2_Sub1_Sub20_1.aLong151 ? Static183.aClass2_Sub3_4.anInt273 * 99 / (Static183.aClass2_Sub3_4.aByteArray4.length - Static54.aClass2_Sub1_Sub20_1.aByte7) + 1 : 0;
	}
}

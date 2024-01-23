import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "[I")
	public static int[] anIntArray550;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "Lclient!nm;")
	public static Class119 aClass119_83;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString187 = " ";

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
	public static void method4105() {
		for (@Pc(13) int local13 = 0; local13 < Static90.anInt1906; local13++) {
			@Pc(24) Class132 local24 = Static198.method3329(local13);
			if (local24 != null && local24.anInt4005 == 0) {
				Static193.anIntArray402[local13] = 0;
				Static99.anIntArray148[local13] = 0;
			}
		}
		Static284.aClass86_35 = new Class86(16);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[F")
	public static float[] method4106(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static65.method1140() + Static65.method1141();
		@Pc(9) int local9 = Static65.method1142();
		Static224.aFloatArray28[3] = 1.0F;
		@Pc(22) float local22 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(46) float local46 = 0.58823526F;
		Static224.aFloatArray28[0] = local31 * ((float) (arg0 >> 16 & 0xFF) / 255.0F) * local46 * local7;
		Static224.aFloatArray28[1] = local46 * (float) (arg0 >> 8 & 0xFF) / 255.0F * local22 * local7;
		Static224.aFloatArray28[2] = local7 * (float) (arg0 & 0xFF) / 255.0F * local38 * local46;
		return Static224.aFloatArray28;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(ZI)V")
	public static void method4107(@OriginalArg(0) boolean arg0) {
		if (Static90.aBoolean182 != arg0) {
			Static90.aBoolean182 = arg0;
			Static17.method271();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIB)V")
	public static void method4109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg0);
		if (local10 == null) {
			local10 = new Class1_Sub18();
			Static1.aClass86_1.method2144(local10, (long) arg0);
		}
		if (local10.anIntArray219.length <= arg2) {
			@Pc(38) int[] local38 = new int[arg2 + 1];
			@Pc(43) int[] local43 = new int[arg2 + 1];
			@Pc(45) int local45;
			for (local45 = 0; local45 < local10.anIntArray219.length; local45++) {
				local38[local45] = local10.anIntArray219[local45];
				local43[local45] = local10.anIntArray218[local45];
			}
			for (local45 = local10.anIntArray219.length; local45 < arg2; local45++) {
				local38[local45] = -1;
				local43[local45] = 0;
			}
			local10.anIntArray218 = local43;
			local10.anIntArray219 = local38;
		}
		local10.anIntArray219[arg2] = arg1;
		local10.anIntArray218[arg2] = arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	public static int anInt767;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
	public static int anInt762 = 0;

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
	public static int anInt764 = -1;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public static int anInt768 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!km;Lclient!km;)V")
	public static void method663(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static200.aClass91_153 = arg0;
		Static141.aClass91_113 = arg1;
		@Pc(10) int local10 = (int) (Math.random() * 21.0D) - 10;
		Static141.aClass91_113.method2510(34);
		@Pc(34) int local34 = (int) (Math.random() * 21.0D) - 10;
		@Pc(41) int local41 = (int) (Math.random() * 21.0D) - 10;
		@Pc(48) int local48 = (int) (Math.random() * 41.0D) - 20;
		Static222.anInt4393 = local10 + local48;
		Static103.anInt2429 = local48 + local41;
		Static133.anInt2904 = local34 + local48;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!km;)Z")
	public static boolean method664(@OriginalArg(1) Class91 arg0) {
		return arg0.method2501(Static84.anInt1889);
	}
}

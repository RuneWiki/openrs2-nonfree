import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "Lclient!hv;")
	public static Class110 aClass110_2;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "[Lclient!bf;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "S")
	public static short aShort7 = 1;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "[I")
	public static final int[] anIntArray50 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_16 = new Class211(110, 4);

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Z")
	public static final boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "[I")
	public static final int[] anIntArray51 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "[I")
	public static final int[] anIntArray52 = new int[14];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!hi;)V")
	public static void method451(@OriginalArg(1) Class102 arg0) {
		Static456.aClass2_Sub13_Sub2_2.method3611(arg0.method2188());
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)I")
	public static int method453(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method454(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(1, arg0);
		local8.method3101();
	}
}

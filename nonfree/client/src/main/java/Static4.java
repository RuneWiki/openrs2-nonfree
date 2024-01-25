import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Lclient!jo;")
	public static Class168 aClass168_6;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public static int anInt135 = 0;

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_1 = new Class254(15, 12);

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "J")
	public static final long aLong7 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
	public static int anInt137 = -60;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[128][128];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!ep;I)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) int arg2) {
		if (Static25.aBoolean80) {
			@Pc(18) Class99 local18 = Static121.anInt2623 == -1 ? null : Static499.aClass118_2.method3497(Static121.anInt2623);
			if (Static69.method1454(arg1).method7364() && (Static429.anInt7864 & 0x20) != 0 && (local18 == null || arg1.method2500(Static121.anInt2623, local18.anInt2851) != local18.anInt2851)) {
				Static232.method4112(false, arg1.anInt2822, Static568.aString113 + " -> " + arg1.aString31, arg1.anInt2806, true, arg1.anInt2790, 0L, Static467.aString104, 20, Static567.anInt7672);
			}
		}
		@Pc(80) String local80;
		for (@Pc(71) int local71 = 9; local71 >= 5; local71--) {
			local80 = Static6.method507(local71, arg1);
			if (local80 != null) {
				Static232.method4112(false, arg1.anInt2822, arg1.aString31, arg1.anInt2806, true, arg1.anInt2790, (long) (local71 + 1), local80, 1002, Static357.method5789(local71, arg1));
			}
		}
		local80 = Static519.method7599(arg1);
		if (local80 != null) {
			Static232.method4112(false, arg1.anInt2822, arg1.aString31, arg1.anInt2806, true, arg1.anInt2790, 0L, local80, 50, arg1.anInt2742);
		}
		for (@Pc(143) int local143 = 4; local143 >= 0; local143--) {
			@Pc(155) String local155 = Static6.method507(local143, arg1);
			if (local155 != null) {
				Static232.method4112(false, arg1.anInt2822, arg1.aString31, arg1.anInt2806, true, arg1.anInt2790, (long) (local143 + 1), local155, 2, Static357.method5789(local143, arg1));
			}
		}
		if (!Static69.method1454(arg1).method7366()) {
			return;
		}
		if (arg1.aString34 == null) {
			Static232.method4112(false, arg1.anInt2822, "", arg1.anInt2806, true, arg1.anInt2790, 0L, Static222.aClass152_8.method4002(Static286.anInt5468), 19, -1);
		} else {
			Static232.method4112(false, arg1.anInt2822, "", arg1.anInt2806, true, arg1.anInt2790, 0L, arg1.aString34, 19, -1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/Object;IB)[B")
	public static byte[] method206(@OriginalArg(1) Object arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static580.method8171(local13, arg1);
		} else if (arg0 instanceof Class44) {
			@Pc(25) Class44 local25 = (Class44) arg0;
			return local25.method6728(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

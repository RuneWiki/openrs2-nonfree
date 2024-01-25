import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!um;")
	public static Class243 aClass243_26;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
	public static final int[] anIntArray25 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)I")
	public static int method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static145.aByteArrayArray5 == null ? 0 : Static145.aByteArrayArray5[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
	public static int method476() {
		return 6;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fi;B)Lclient!fi;")
	public static Class76 method477(@OriginalArg(0) Class76 arg0) {
		if (arg0.anInt2112 != -1) {
			return Static213.method2817(arg0.anInt2112);
		}
		@Pc(22) int local22 = arg0.anInt2100 >>> 16;
		@Pc(27) Class119 local27 = new Class119(Static151.aClass252_42);
		for (@Pc(38) Class5_Sub44 local38 = (Class5_Sub44) local27.method2497(); local38 != null; local38 = (Class5_Sub44) local27.method2496()) {
			if (local38.anInt6981 == local22) {
				return Static213.method2817((int) local38.aLong234);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)I")
	public static int method478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local11;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)[Lclient!sc;")
	public static Class220[] method479() {
		return new Class220[] { Static77.aClass220_33, Static96.aClass220_42, Static71.aClass220_157, Static440.aClass220_153, Static226.aClass220_81, Static356.aClass220_126, Static35.aClass220_91, Static2.aClass220_158, Static17.aClass220_10, Static428.aClass220_149, Static19.aClass220_13, Static16.aClass220_9, Static35.aClass220_92, Static55.aClass220_30 };
	}
}

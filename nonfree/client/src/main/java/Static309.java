import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static309 {

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "Lclient!ga;")
	public static Class111 aClass111_72;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Lclient!wv;")
	public static Class365 aClass365_9;

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
	public static int anInt5591;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILclient!wv;)V")
	public static void method4756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class365 arg2) {
		if (arg2.aByte127 == 0) {
			arg2.anInt9625 = arg2.anInt9604;
		} else if (arg2.aByte127 == 1) {
			arg2.anInt9625 = (arg0 - arg2.anInt9638) / 2 + arg2.anInt9604;
		} else if (arg2.aByte127 == 2) {
			arg2.anInt9625 = arg0 - arg2.anInt9638 - arg2.anInt9604;
		} else if (arg2.aByte127 == 3) {
			arg2.anInt9625 = arg2.anInt9604 * arg0 >> 14;
		} else if (arg2.aByte127 == 4) {
			arg2.anInt9625 = (arg2.anInt9604 * arg0 >> 14) + (arg0 - arg2.anInt9638) / 2;
		} else {
			arg2.anInt9625 = arg0 - (arg2.anInt9604 * arg0 >> 14) - arg2.anInt9638;
		}
		if (arg2.aByte125 == 0) {
			arg2.anInt9581 = arg2.anInt9644;
		} else if (arg2.aByte125 == 1) {
			arg2.anInt9581 = arg2.anInt9644 + (arg1 - arg2.anInt9578) / 2;
		} else if (arg2.aByte125 == 2) {
			arg2.anInt9581 = arg1 - arg2.anInt9578 - arg2.anInt9644;
		} else if (arg2.aByte125 == 3) {
			arg2.anInt9581 = arg2.anInt9644 * arg1 >> 14;
		} else if (arg2.aByte125 == 4) {
			arg2.anInt9581 = (arg1 * arg2.anInt9644 >> 14) + (arg1 - arg2.anInt9578) / 2;
		} else {
			arg2.anInt9581 = arg1 - arg2.anInt9578 - (arg1 * arg2.anInt9644 >> 14);
		}
		if (!Static484.aBoolean581 || Static72.method1565(arg2).anInt5698 == 0 && arg2.anInt9595 != 0) {
			return;
		}
		if (arg2.anInt9581 < 0) {
			arg2.anInt9581 = 0;
		} else if (arg1 < arg2.anInt9581 + arg2.anInt9578) {
			arg2.anInt9581 = arg1 - arg2.anInt9578;
		}
		if (arg2.anInt9625 < 0) {
			arg2.anInt9625 = 0;
		} else if (arg0 < arg2.anInt9625 + arg2.anInt9638) {
			arg2.anInt9625 = arg0 - arg2.anInt9638;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIB)V")
	public static void method4757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static511.aByteArrayArrayArray19 = new byte[4][arg0][arg1];
	}
}

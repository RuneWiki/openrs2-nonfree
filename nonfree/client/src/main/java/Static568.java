import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static568 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "J")
	public static long aLong251 = -1L;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_61 = new Class223();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method8120() {
		if (Static105.aClass188_1 != null) {
			Static105.aClass188_1.method7772();
		}
		if (Static181.aClass188_3 != null) {
			Static181.aClass188_3.method7772();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)I")
	public static int method8121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static307.anIntArrayArray38 == null ? 0 : Static307.anIntArrayArray38[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method8122(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static502.anInt8651 == 2) {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[0]);
				Static597.aClass33Array1[1].method1373(Static280.aClass291Array1[1]);
			} else if (Static502.anInt8651 == 3) {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[0]);
				Static597.aClass33Array1[1].method1373(Static280.aClass291Array1[1]);
				Static597.aClass33Array1[2].method1373(Static280.aClass291Array1[2]);
			} else {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[0]);
				Static597.aClass33Array1[1].method1373(Static280.aClass291Array1[1]);
				Static597.aClass33Array1[2].method1373(Static280.aClass291Array1[2]);
				Static597.aClass33Array1[3].method1373(Static280.aClass291Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static502.anInt8651 == 2) {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[2]);
			} else if (Static502.anInt8651 == 3) {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[3]);
				Static597.aClass33Array1[1].method1373(Static280.aClass291Array1[4]);
			} else {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[4]);
				Static597.aClass33Array1[1].method1373(Static280.aClass291Array1[5]);
				Static597.aClass33Array1[2].method1373(Static280.aClass291Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static502.anInt8651 == 2) {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[3]);
				return;
			}
			if (Static502.anInt8651 == 3) {
				Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[5]);
				return;
			}
			Static597.aClass33Array1[0].method1373(Static280.aClass291Array1[7]);
		}
	}
}

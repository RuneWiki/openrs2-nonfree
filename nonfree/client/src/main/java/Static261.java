import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public static int anInt4257;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!um;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!xa;")
	public static Class4 aClass4_14;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_103 = new Class40(76, 4);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!pq;B)Lclient!il;")
	public static Class146 method3647(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(13) byte[] local13 = arg1.method5855(arg0);
		return local13 == null ? null : new Class146(local13);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public static void method3648(@OriginalArg(0) int arg0) {
		Static400.anInt8133 = arg0;
		Static542.aClass332_198.method7510();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public static void method3651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (Static447.anInt8568 != arg0) {
			Static157.anIntArray321 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static157.anIntArray321[local21] = (local21 << 12) / arg0;
			}
			Static447.anInt8568 = arg0;
			Static520.anInt8968 = arg0 * 32;
			Static392.anInt6966 = arg0 - 1;
		}
		if (Static495.anInt8251 == arg1) {
			return;
		}
		if (arg1 == Static447.anInt8568) {
			Static564.anIntArray703 = Static157.anIntArray321;
		} else {
			Static564.anIntArray703 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static564.anIntArray703[local21] = (local21 << 12) / arg1;
			}
		}
		Static252.anInt4135 = arg1 - 1;
		Static495.anInt8251 = arg1;
	}
}

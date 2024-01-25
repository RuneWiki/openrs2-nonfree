import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!cl;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public static void method1838() {
		Static557.aFont2 = null;
		Static559.anImage13 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	public static int method1839(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Object;IBI)[B")
	public static byte[] method1840(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static14.method453(arg1, local13);
		} else if (arg0 instanceof Class258) {
			@Pc(25) Class258 local25 = (Class258) arg0;
			return local25.method6309(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

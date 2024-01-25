import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array13;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_91 = new Class237(2, 8);

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_40 = new Class266();

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public static int anInt5293 = 0;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public static int anInt5294 = 2;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_41 = new Class83(64);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Z")
	public static boolean method4264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)I")
	public static int method4266(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!vh;)V")
	public static void method4269(@OriginalArg(1) Class250 arg0) {
		Static174.aClass250_39 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!qg;")
	public static Class87 aClass87_30;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!w;")
	public static Class257 aClass257_10;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_30 = new Class238(0, -1);

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public static int anInt7425 = -1;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_382 = new Class123(8, 2);

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "[Lclient!kt;")
	public static final Class6_Sub2_Sub8[] aClass6_Sub2_Sub8Array13 = new Class6_Sub2_Sub8[14];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method6089() {
		Static204.method3133();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
	public static void method6093() {
		Static290.method4371(Static295.anInt5507);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)I")
	public static int method6095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 & 0x3;
		if (local15 == 0) {
			return arg0;
		} else if (local15 == 1) {
			return arg2;
		} else if (local15 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}

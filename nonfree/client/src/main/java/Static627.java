import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static627 {

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public static int anInt10019;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_256 = new Class381(3, 7);

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_204 = new Class156(99, 9);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIB)Z")
	public static boolean method8559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static11.method151(arg1, arg0) || Static223.method3547(arg1, arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public static void method8561() {
		if (Static652.anInt10664 == 3) {
			Static411.method6060(4, -3);
		} else if (Static652.anInt10664 == 7) {
			Static411.method6060(8, -3);
		} else if (Static652.anInt10664 == 9) {
			Static411.method6060(10, -3);
		} else if (Static652.anInt10664 == 11) {
			Static411.method6060(12, -3);
		}
	}
}

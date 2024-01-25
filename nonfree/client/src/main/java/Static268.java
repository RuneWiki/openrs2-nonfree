import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	public static int anInt4384;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "[[Lclient!dj;")
	public static Class75[][] aClass75ArrayArray1;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_73 = new Class349(57, 2);

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
	public static int anInt4385 = 16777215;

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_18 = new Class225(0, 1);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIB)I")
	public static int method3727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}
}

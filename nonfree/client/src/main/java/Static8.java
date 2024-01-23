import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
	public static int anInt262 = 0;

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_27 = Static199.method3560("<img=1>");

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "Lclient!ug;")
	public static Class102 aClass102_1 = new Class102();

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
	public static int anInt266 = -1;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_28 = Static199.method3560("null");

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "[I")
	public static int[] anIntArray32 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "Lclient!mj;")
	public static Class64 aClass64_3 = null;

	@OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
	public static int anInt268 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!oe;IILclient!oe;I)Lclient!nc;")
	public static Class2_Sub3_Sub7 method182(@OriginalArg(0) Class72 arg0, @OriginalArg(3) Class72 arg1, @OriginalArg(4) int arg2) {
		return Static55.method713(arg2, arg1) ? Static14.method2690(arg0.method3197(0, arg2)) : null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method184(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static227.method3987(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local39 <= local42);
			return Static96.method1681(arg1, local42);
		}
	}
}

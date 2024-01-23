import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString16 = "red:";

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "[I")
	public static int[] anIntArray50 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!th;I)I")
	public static int method309(@OriginalArg(0) Class15_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt5400;
		@Pc(12) Class123 local12 = arg0.method4297();
		if (local12.anInt4136 == arg0.anInt5365) {
			local8 = arg0.anInt5391;
		} else if (arg0.anInt5365 == local12.anInt4111 || local12.anInt4140 == arg0.anInt5365 || local12.anInt4121 == arg0.anInt5365 || arg0.anInt5365 == local12.anInt4124) {
			local8 = arg0.anInt5390;
		} else if (local12.anInt4113 == arg0.anInt5365 || arg0.anInt5365 == local12.anInt4133 || arg0.anInt5365 == local12.anInt4129 || arg0.anInt5365 == local12.anInt4142) {
			local8 = arg0.anInt5399;
		}
		return local8;
	}
}

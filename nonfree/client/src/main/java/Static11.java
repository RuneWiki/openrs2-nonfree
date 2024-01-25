import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!iu;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
	public static final int[] anIntArray20 = new int[1];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public static int anInt125 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!mo;")
	public static Class215 method127(@OriginalArg(1) int arg0) {
		@Pc(8) Class215[] local8 = Static527.method6987();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class215 local16 = local8[local10];
			if (local16.anInt5941 == arg0) {
				return local16;
			}
		}
		return null;
	}
}

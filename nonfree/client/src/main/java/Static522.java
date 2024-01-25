import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public static int anInt8862 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lclient!mt;")
	public static Class199 method7438(@OriginalArg(1) int arg0) {
		@Pc(8) Class199[] local8 = Static544.method7949();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class199 local16 = local8[local10];
			if (arg0 == local16.anInt5939) {
				return local16;
			}
		}
		return null;
	}
}

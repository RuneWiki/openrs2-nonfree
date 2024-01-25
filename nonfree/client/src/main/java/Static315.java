import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!la;")
	public static final Class136 aClass136_145 = new Class136(96, 12);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lclient!wh;")
	public static Class267 method4408(@OriginalArg(1) int arg0) {
		@Pc(8) Class267[] local8 = Static311.method4373();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class267 local16 = local8[local10];
			if (arg0 == local16.anInt7532) {
				return local16;
			}
		}
		return null;
	}
}

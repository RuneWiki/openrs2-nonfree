import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Lclient!rm;")
	public static Class294 aClass294_1;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)Lclient!taa;")
	public static Class314 method4876(@OriginalArg(1) int arg0) {
		@Pc(8) Class314[] local8 = Static231.method3956();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class314 local16 = local8[local10];
			if (local16.anInt9276 == arg0) {
				return local16;
			}
		}
		return null;
	}
}

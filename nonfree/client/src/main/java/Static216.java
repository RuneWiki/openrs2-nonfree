import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_67 = new Class337(77, 0);

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "F")
	public static float aFloat87 = 0.0F;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
	public static void method3686(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub21 local14 = (Class5_Sub21) Static115.aClass273_5.method6581((long) arg0);
		if (local14 != null) {
			local14.aBoolean188 = !local14.aBoolean188;
			local14.aClass73_Sub1_1.method5419(local14.aBoolean188);
		}
	}
}

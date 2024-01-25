import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt5413 = 0;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_117 = new Class265(91, -1);

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public static final int anInt5418 = 1406;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
	public static void method4333() {
		Static405.aBoolean457 = true;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ar;ILclient!ya;BI)V")
	public static void method4336(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class49 arg1) {
		Static113.aClass14_20.method305();
		if (Static371.aBoolean298) {
			return;
		}
		for (@Pc(24) Class2_Sub18 local24 = (Class2_Sub18) arg0.method309(); local24 != null; local24 = (Class2_Sub18) arg0.method311()) {
			@Pc(32) Class48 local32 = Static88.aClass215_3.method4741(local24.anInt3142);
			if (Static207.method3266(local32)) {
				@Pc(44) boolean local44 = Static402.method5290(local32, arg1, local24);
				if (local44) {
					Static3.method129(arg1, local24, local32);
				}
			}
		}
	}
}

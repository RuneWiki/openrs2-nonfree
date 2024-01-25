import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!gga;")
	public static Class124 aClass124_45;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public static int anInt3602;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public static int anInt3601 = 0;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_41 = new Class341(84, 4);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ea;I)I")
	public static int method3354(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2374;
		@Pc(12) Class248 local12 = arg0.method3673();
		if (arg0.anInt3968 == -1 || arg0.aBoolean314) {
			local8 = arg0.anInt2378;
		} else if (arg0.anInt3968 == local12.anInt7475 || arg0.anInt3968 == local12.anInt7443 || local12.anInt7472 == arg0.anInt3968 || local12.anInt7447 == arg0.anInt3968) {
			local8 = arg0.anInt2383;
		} else if (arg0.anInt3968 == local12.anInt7440 || arg0.anInt3968 == local12.anInt7458 || arg0.anInt3968 == local12.anInt7451 || arg0.anInt3968 == local12.anInt7437) {
			local8 = arg0.anInt2391;
		}
		return local8;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_101 = new Class46(77, 2);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!bfa;B)I")
	public static int method7963(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt902;
		@Pc(17) Class269 local17 = arg0.method1025();
		if (arg0.anInt1264 == -1 || arg0.aBoolean70) {
			local8 = arg0.anInt901;
		} else if (arg0.anInt1264 == local17.anInt7255 || arg0.anInt1264 == local17.anInt7248 || arg0.anInt1264 == local17.anInt7264 || arg0.anInt1264 == local17.anInt7257) {
			local8 = arg0.anInt920;
		} else if (arg0.anInt1264 == local17.anInt7256 || local17.anInt7251 == arg0.anInt1264 || arg0.anInt1264 == local17.anInt7277 || local17.anInt7287 == arg0.anInt1264) {
			local8 = arg0.anInt899;
		}
		return local8;
	}
}

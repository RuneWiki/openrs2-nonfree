import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bja", name = "e", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_13 = new Class241(5, -1);

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!ih;I)I")
	public static int method559(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) Class294 local8 = arg0.aClass294_1;
		if (local8.anIntArray511 != null) {
			local8 = local8.method7168(Static303.aClass55_2);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(24) int local24 = local8.anInt8177;
		@Pc(28) Class396 local28 = arg0.method4417(27750);
		@Pc(33) int local33 = arg0.aClass104_7.method9032();
		if (local33 == -1 || arg0.aBoolean369) {
			local24 = local8.anInt8159;
		} else if (local33 == local28.anInt10407 || local33 == local28.anInt10410 || local33 == local28.anInt10421 || local28.anInt10430 == local33) {
			local24 = local8.anInt8166;
		} else if (local28.anInt10423 == local33 || local33 == local28.anInt10422 || local33 == local28.anInt10388 || local28.anInt10399 == local33) {
			local24 = local8.anInt8180;
		}
		return local24;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ZI)I")
	public static int method560(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = Static290.anInt10204;
		if (local13 == 0) {
			return arg0 ? 0 : Static592.anInt9421;
		} else if (local13 == 1) {
			return Static592.anInt9421;
		} else if (local13 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}

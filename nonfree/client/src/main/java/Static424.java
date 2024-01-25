import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "Lclient!ug;")
	public static Class86 aClass86_4;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
	public static int anInt7540 = 0;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_170 = new Class263(8, 3);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZZI)I")
	public static int method5760(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class1_Sub46 local8 = Static114.method1848(false, arg2);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local8.anIntArray750.length; local16++) {
			if (local8.anIntArray750[local16] >= 0 && Static43.aClass57_1.anInt1929 > local8.anIntArray750[local16]) {
				@Pc(49) Class168 local49 = Static43.aClass57_1.method1414(local8.anIntArray750[local16]);
				@Pc(59) int local59 = local49.method3725(Static53.aClass32_1.method724(arg0).anInt200, arg0);
				if (arg1) {
					local14 += local8.anIntArray751[local16] * local59;
				} else {
					local14 += local59;
				}
			}
		}
		return local14;
	}
}

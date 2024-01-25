import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_1 = new Class361(5, 1);

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "Lclient!el;")
	public static final Class109 aClass109_14 = new Class109(24, 6);

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_1 = new Class391(128, 4);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ic;I[II)V")
	public static void method289(@OriginalArg(0) Class8_Sub1_Sub3_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray412 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray412.length; local12++) {
				if (arg2[local12] != arg0.anIntArray412[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt7023 != -1) {
				@Pc(59) Class165 local59 = Static158.aClass317_1.method7882(arg0.anInt7023, 100);
				@Pc(62) int local62 = local59.anInt3919;
				if (local62 == 1) {
					arg0.anInt7046 = 0;
					arg0.anInt6979 = 1;
					arg0.anInt7045 = arg1;
					arg0.anInt7006 = 0;
					arg0.anInt7028 = 0;
					if (!arg0.aBoolean540) {
						Static268.method4004(local59, arg0, arg0.anInt7028);
					}
				}
				if (local62 == 2) {
					arg0.anInt7046 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray412 == null || arg0.anIntArray412[local12] == -1 || Static158.aClass317_1.method7882(arg2[local12], 100).anInt3910 >= Static158.aClass317_1.method7882(arg0.anIntArray412[local12], 100).anInt3910) {
				arg0.anIntArray412 = arg2;
				arg0.anInt7045 = arg1;
				break;
			}
		}
		if (local10) {
			arg0.anInt7045 = arg1;
			arg0.anIntArray412 = arg2;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!gda;")
	public static Class126 aClass126_253;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "D")
	public static double aDouble30;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_182 = new Class156(142, -2);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([Lclient!mj;II)V")
	public static void method7515(@OriginalArg(0) Class238[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class238 local20 = arg0[local14];
			if (local20 != null) {
				if (local20.anInt5976 == 0) {
					if (local20.aClass238Array2 != null) {
						method7515(local20.aClass238Array2, arg1);
					}
					@Pc(50) Class5_Sub38 local50 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local20.anInt5971);
					if (local50 != null) {
						Static194.method8970(local50.anInt6418, arg1);
					}
				}
				@Pc(75) Class5_Sub24 local75;
				if (arg1 == 0 && local20.anObjectArray35 != null) {
					local75 = new Class5_Sub24();
					local75.aClass238_6 = local20;
					local75.anObjectArray2 = local20.anObjectArray35;
					Static247.method3957(local75);
				}
				if (arg1 == 1 && local20.anObjectArray7 != null) {
					if (local20.anInt5986 >= 0) {
						@Pc(104) Class238 local104 = Static305.method4761(local20.anInt5971);
						if (local104 == null || local104.aClass238Array1 == null || local104.aClass238Array1.length <= local20.anInt5986 || local104.aClass238Array1[local20.anInt5986] != local20) {
							continue;
						}
					}
					local75 = new Class5_Sub24();
					local75.anObjectArray2 = local20.anObjectArray7;
					local75.aClass238_6 = local20;
					Static247.method3957(local75);
				}
			}
		}
	}
}

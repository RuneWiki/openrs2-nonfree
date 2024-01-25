import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "Z")
	public static boolean aBoolean108;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "Lclient!qn;")
	public static Class211 aClass211_23;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "Lclient!tb;")
	public static Class235 aClass235_1;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_29 = new Class146(2, -1);

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
	public static final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_12 = new Class137(8);

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
	public static int anInt1612 = 0;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([Lclient!hd;IB)V")
	public static void method1308(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class110 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt2627 == 0) {
					if (local13.aClass110Array1 != null) {
						method1308(local13.aClass110Array1, arg1);
					}
					@Pc(34) Class4_Sub8 local34 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local13.anInt2675);
					if (local34 != null) {
						Static199.method2849(local34.anInt861, arg1);
					}
				}
				@Pc(53) Class4_Sub34 local53;
				if (arg1 == 0 && local13.anObjectArray7 != null) {
					local53 = new Class4_Sub34();
					local53.anObjectArray34 = local13.anObjectArray7;
					local53.aClass110_14 = local13;
					Static80.method1289(local53);
				}
				if (arg1 == 1 && local13.anObjectArray31 != null) {
					if (local13.anInt2585 >= 0) {
						@Pc(81) Class110 local81 = Static235.method3185(local13.anInt2675);
						if (local81 == null || local81.aClass110Array1 == null || local81.aClass110Array1.length <= local13.anInt2585 || local81.aClass110Array1[local13.anInt2585] != local13) {
							continue;
						}
					}
					local53 = new Class4_Sub34();
					local53.aClass110_14 = local13;
					local53.anObjectArray34 = local13.anObjectArray31;
					Static80.method1289(local53);
				}
			}
		}
	}
}

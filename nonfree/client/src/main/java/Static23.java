import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_54 = new Class173(67, 3);

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	public static int anInt3730 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)[Lclient!hj;")
	public static Class140[] method3329() {
		return new Class140[] { Static367.aClass140_1, Static367.aClass140_2, Static367.aClass140_3, Static367.aClass140_4, Static367.aClass140_5, Static367.aClass140_6, Static367.aClass140_7, Static367.aClass140_8, Static367.aClass140_9, Static367.aClass140_10, Static367.aClass140_11, Static367.aClass140_12, Static367.aClass140_13, Static367.aClass140_14 };
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[Lclient!n;I)V")
	public static void method3331(@OriginalArg(1) Class225[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class225 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt6508 == 0) {
					if (local13.aClass225Array1 != null) {
						method3331(local13.aClass225Array1, arg1);
					}
					@Pc(37) Class4_Sub37 local37 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local13.anInt6555);
					if (local37 != null) {
						Static228.method3612(arg1, local37.anInt8141);
					}
				}
				@Pc(53) Class4_Sub25 local53;
				if (arg1 == 0 && local13.anObjectArray27 != null) {
					local53 = new Class4_Sub25();
					local53.anObjectArray1 = local13.anObjectArray27;
					local53.aClass225_21 = local13;
					Static388.method6121(local53);
				}
				if (arg1 == 1 && local13.anObjectArray12 != null) {
					if (local13.anInt6565 >= 0) {
						@Pc(79) Class225 local79 = Static490.method7272(local13.anInt6555);
						if (local79 == null || local79.aClass225Array1 == null || local13.anInt6565 >= local79.aClass225Array1.length || local13 != local79.aClass225Array1[local13.anInt6565]) {
							continue;
						}
					}
					local53 = new Class4_Sub25();
					local53.anObjectArray1 = local13.anObjectArray12;
					local53.aClass225_21 = local13;
					Static388.method6121(local53);
				}
			}
		}
	}
}

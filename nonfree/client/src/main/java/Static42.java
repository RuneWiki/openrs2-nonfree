import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt909;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean75 = true;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)[Lclient!hi;")
	public static Class106[] method821() {
		return new Class106[] { Static339.aClass106_12, Static199.aClass106_5, Static352.aClass106_14, Static310.aClass106_10, Static188.aClass106_4, Static274.aClass106_9, Static119.aClass106_1, Static228.aClass106_7, Static161.aClass106_2, Static208.aClass106_6, Static320.aClass106_11, Static232.aClass106_8, Static169.aClass106_3, Static342.aClass106_13 };
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Lclient!kn;")
	public static Class141 method822(@OriginalArg(0) int arg0) {
		@Pc(10) Class141 local10 = (Class141) Static386.aClass220_51.method4990((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static179.aClass158_37.method3672(arg0, 0);
		local10 = new Class141();
		if (local20 != null) {
			local10.method3261(new Class6_Sub15(local20), arg0);
		}
		Static386.aClass220_51.method4996(local10, (long) arg0);
		return local10;
	}
}

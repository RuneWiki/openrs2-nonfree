import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
	public static int anInt3572;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
	public static int[] anIntArray392 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	public static int anInt3570 = 0;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString218 = "Loaded fonts";

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)Lclient!ij;")
	public static Class4_Sub3_Sub11 method3004(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub11 local10 = (Class4_Sub3_Sub11) Static38.aClass40_5.method889((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static36.aClass58_19.method1372(1, arg0);
		} else {
			local25 = Static165.aClass58_72.method1372(1, arg0 & 0x7FFF);
		}
		local10 = new Class4_Sub3_Sub11();
		if (local25 != null) {
			local10.method1909(new Class4_Sub10(local25));
		}
		if (arg0 >= 32768) {
			local10.method1911();
		}
		Static38.aClass40_5.method888((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3005(@OriginalArg(1) int arg0) {
		return Static249.aStringArray27[arg0].length() <= 0 ? Static259.aStringArray30[arg0] : Static259.aStringArray30[arg0] + Static45.aString55 + Static249.aStringArray27[arg0];
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method3006() {
		Static149.aClass26_28.method515();
		Static125.aClass26_23.method515();
	}
}

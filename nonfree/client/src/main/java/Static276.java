import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!iha", name = "F", descriptor = "Lclient!cl;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
	public static int anInt4227;

	@OriginalMember(owner = "client!iha", name = "z", descriptor = "Lclient!ik;")
	public static Class182 aClass182_72;

	@OriginalMember(owner = "client!iha", name = "D", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject9 = null;

	@OriginalMember(owner = "client!iha", name = "I", descriptor = "I")
	public static int anInt4230 = 0;

	@OriginalMember(owner = "client!iha", name = "w", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)I")
	public static int method3877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIZ)V")
	public static void method3878(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 21);
		local9.method9256();
		local9.anInt10899 = arg1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(B)V")
	public static void method3879() {
		Static588.method7597(false);
		if (Static548.anInt8964 >= 0 && Static548.anInt8964 != 0) {
			Static36.method1127(false, Static548.anInt8964);
			Static548.anInt8964 = -1;
		}
	}

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "(I)I")
	public static int method3880(@OriginalArg(0) int arg0) {
		if (Static702.aFrame3 == null) {
			return Static283.aBoolean287 ? 2 : 1;
		} else {
			return 3;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!o;")
	public static Class13 aClass13_22;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
	public static int[] anIntArray556;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public static int anInt6647 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method5151(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			if (arg0.charAt(local20) == arg1) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!pf;I)V")
	public static void method5152(@OriginalArg(0) Class3_Sub4_Sub1_Sub2 arg0) {
		@Pc(15) Class2_Sub35 local15 = (Class2_Sub35) Static427.aClass72_47.method1659((long) arg0.anInt4915);
		if (local15 == null) {
			Static160.method2246(arg0.anIntArray424[0], arg0.anIntArray425[0], null, 0, null, arg0, arg0.aByte91);
		} else {
			local15.method3719();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)Z")
	public static boolean method5153(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIBI)V")
	public static void method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static393.anInt6471 = arg3;
		Static359.anInt6064 = arg2;
		Static180.anInt3090 = arg0;
		Static318.anInt5478 = arg1;
	}
}

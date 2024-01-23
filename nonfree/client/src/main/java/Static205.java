import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!om", name = "P", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!om", name = "S", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!om", name = "U", descriptor = "I")
	public static int anInt4054;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "Lclient!cn;")
	public static Class30 aClass30_23 = new Class30(8);

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
	public static int anInt4051 = 5063219;

	@OriginalMember(owner = "client!om", name = "W", descriptor = "I")
	public static int anInt4056 = -2;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public static void method3417() {
		for (@Pc(10) Class3_Sub10 local10 = (Class3_Sub10) Static219.aClass56_21.method1281(); local10 != null; local10 = (Class3_Sub10) Static219.aClass56_21.method1278()) {
			if (local10.anInt1466 == -1) {
				local10.anInt1478 = 0;
				Static35.method537(local10);
			} else {
				local10.method5013();
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(III)I")
	public static int method3419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local8.anIntArray293.length; local32++) {
				if (arg1 == local8.anIntArray294[local32]) {
					local30 += local8.anIntArray293[local32];
				}
			}
			return local30;
		}
	}
}

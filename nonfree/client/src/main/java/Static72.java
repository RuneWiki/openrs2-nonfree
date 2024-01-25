import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!cc;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
	public static final int[] anIntArray189 = new int[14];

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public static int anInt1436 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	public static void method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class77 local15 = new Class77(16);
		for (@Pc(20) Class1_Sub12 local20 = (Class1_Sub12) Static338.aClass77_34.method1359(); local20 != null; local20 = (Class1_Sub12) Static338.aClass77_34.method1360()) {
			local20.method5577();
			@Pc(31) int local31 = (int) (local20.aLong207 >> 28);
			@Pc(41) int local41 = (int) (local20.aLong207 >> 14 & 0x3FFFL) - arg1;
			@Pc(50) int local50 = (int) (local20.aLong207 & 0x3FFFL) - arg0;
			if (local50 >= 0 && local41 >= 0 && local50 < Static92.anInt1675 && Static262.anInt6340 > local41) {
				local15.method1370((long) (local50 | local31 << 28 | local41 << 14), local20);
			}
		}
		Static338.aClass77_34 = local15;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZII)I")
	public static int method1161(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub37 local10 = Static367.method5078(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray591.length; local28++) {
				if (arg1 == local10.anIntArray589[local28]) {
					local21 += local10.anIntArray591[local28];
				}
			}
			return local21;
		}
	}
}

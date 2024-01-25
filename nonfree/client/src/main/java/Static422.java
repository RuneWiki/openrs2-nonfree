import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_12 = new Class262(10, 7);

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "[I")
	public static final int[] anIntArray449 = new int[8];

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	public static int anInt6896 = 0;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
	public static final int[] anIntArray450 = new int[32];

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "[I")
	public static final int[] anIntArray451 = new int[3];

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
	public static void method5652() {
		Static493.aBoolean661 = false;
		Static549.method7175();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub21 local7 = null;
		for (@Pc(12) Class2_Sub21 local12 = (Class2_Sub21) Static246.aClass70_25.method1264(); local12 != null; local12 = (Class2_Sub21) Static246.aClass70_25.method1261()) {
			if (arg6 == local12.anInt3031 && arg3 == local12.anInt3036 && arg2 == local12.anInt3030 && local12.anInt3035 == arg1) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub21();
			local7.anInt3031 = arg6;
			local7.anInt3036 = arg3;
			local7.anInt3030 = arg2;
			local7.anInt3035 = arg1;
			if (arg3 >= 0 && arg2 >= 0 && arg3 < Static281.anInt4822 && Static29.anInt491 > arg2) {
				Static387.method5349(local7);
			}
			Static246.aClass70_25.method1269(local7);
		}
		local7.anInt3027 = arg5;
		local7.anInt3024 = 0;
		local7.anInt3029 = arg4;
		local7.anInt3033 = arg0;
		local7.anInt3026 = -1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)V")
	public static void method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class75 local9 = Static268.aClass75ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static182.anInt2689 = local9.anInt1725;
			Static236.anInt3929 = local9.anInt1724;
			Static279.anInt4788 = local9.anInt1717;
		}
		Static220.method2686();
	}
}

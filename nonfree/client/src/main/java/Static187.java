import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	public static int anInt3756;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
	public static int anInt3757;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "[Lclient!sf;")
	public static Class4_Sub2_Sub19[] aClass4_Sub2_Sub19Array3 = new Class4_Sub2_Sub19[14];

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString122 = " is already on your friend list.";

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Lclient!pi;")
	public static Class4_Sub2_Sub16 method2992(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub16 local10 = (Class4_Sub2_Sub16) Static205.aClass69_9.method1930((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static200.aClass98_120.method2396(arg0, 5);
		local10 = new Class4_Sub2_Sub16();
		if (local21 != null) {
			local10.method3257(new Class4_Sub17(local21));
		}
		Static205.aClass69_9.method1933((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	public static void method2993() {
		aClass4_Sub2_Sub19Array3 = null;
		anIntArray314 = null;
		aString122 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static211.anIntArrayArrayArray9[arg0][local16][local20] == -Static65.anInt1217) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static250.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5;
			if (!Static96.method1563(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static96.method1563(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static96.method1563(local16, local156, local182)) {
				return false;
			} else if (Static96.method1563(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static15.method266(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static96.method1563(local16 + 1, Static250.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5, local20 + 1) && Static96.method1563(local16 + 128 - 1, Static250.anIntArrayArrayArray13[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static96.method1563(local16 + 128 - 1, Static250.anIntArrayArrayArray13[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static96.method1563(local16 + 1, Static250.anIntArrayArrayArray13[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
	public static int[] anIntArray73;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!vc;")
	public static Class98 aClass98_2;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!ih;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public static int anInt730 = -1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z")
	public static boolean method547() {
		@Pc(5) Class37 local5 = Static15.aClass37_1;
		synchronized (Static15.aClass37_1) {
			if (Static173.anInt3864 == Static178.anInt3955) {
				return false;
			} else {
				Static122.anInt2710 = Static81.anIntArray166[Static173.anInt3864];
				Static60.anInt3600 = Static77.anIntArray159[Static173.anInt3864];
				Static173.anInt3864 = Static173.anInt3864 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static110.method1903(arg1)) {
			Static199.aClass98Array2 = null;
			Static26.method518(arg3, -1, arg6, arg4, arg2, Static4.aClass98ArrayArray3[arg1], arg0, arg7, arg5);
			if (Static199.aClass98Array2 != null) {
				Static26.method518(arg3, -1412584499, arg6, arg4, Static77.anInt1822, Static199.aClass98Array2, arg0, Static12.anInt303, arg5);
				Static199.aClass98Array2 = null;
			}
		} else if (arg6 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static62.aBooleanArray7[local15] = true;
			}
		} else {
			Static62.aBooleanArray7[arg6] = true;
		}
	}
}

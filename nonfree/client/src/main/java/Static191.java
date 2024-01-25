import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gt", name = "Yb", descriptor = "I")
	public static int anInt6006;

	@OriginalMember(owner = "client!gt", name = "Mc", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!gt", name = "rd", descriptor = "I")
	public static int anInt6072;

	@OriginalMember(owner = "client!gt", name = "Pc", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_97 = new Class274(86, 1);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZIBIIIII)Z")
	public static boolean method5050(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0];
		@Pc(13) int local13 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0];
		if (local8 < 0 || local8 >= Static3.anInt46 || local13 < 0 || local13 >= Static270.anInt5194) {
			return false;
		} else if (arg5 >= 0 && arg5 < Static3.anInt46 && arg6 >= 0 && arg6 < Static270.anInt5194) {
			@Pc(73) int local73 = Static32.method748(arg7, arg3, arg2, local13, Static288.anIntArray366, arg1, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778(), arg5, arg4, arg6, Static19.aClass179Array2[Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124], Static466.anIntArray304, arg0, local8);
			if (local73 < 1) {
				return false;
			}
			Static129.anInt2985 = Static466.anIntArray304[local73 - 1];
			Static271.anInt5226 = Static288.anIntArray366[local73 - 1];
			Static70.aBoolean136 = false;
			Static510.method7209();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)Z")
	public static boolean method5132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}

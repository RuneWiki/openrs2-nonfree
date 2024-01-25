import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "[Lclient!lq;")
	public static Class204_Sub1[] aClass204_Sub1Array2;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "[I")
	public static final int[] anIntArray241 = new int[200];

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_5 = new Class158(2, 4, 4, 0);

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	public static int anInt4642 = 1;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static687.aClass6_Sub44_33.aClass7_Sub13_5.method3338() != 0 && arg4 != 0 && Static74.anInt1034 < 50 && arg1 != -1) {
			Static534.aClass124Array6[Static74.anInt1034++] = new Class124((byte) 1, arg1, arg4, arg3, arg2, 0, arg0, (Class60_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg1; local7++) {
			for (@Pc(15) int local15 = arg4; local15 <= arg2; local15++) {
				if (Static20.anIntArrayArray2[local7][local15] == arg0 && Static511.anIntArrayArray43[local7][local15] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
	public static boolean method4233(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIBIII)V")
	public static void method4234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(14) int local14 = arg1 + arg2;
		for (@Pc(16) int local16 = arg2; local16 < local14; local16++) {
			Static367.method5559(-7, arg5, arg3, Static36.anIntArrayArray4[local16], arg4);
		}
		@Pc(41) int local41 = arg4 - arg1;
		for (@Pc(43) int local43 = arg0; local43 > local10; local43--) {
			Static367.method5559(-7, arg5, arg3, Static36.anIntArrayArray4[local43], arg4);
		}
		@Pc(65) int local65 = arg1 + arg5;
		for (@Pc(76) int local76 = local14; local76 <= local10; local76++) {
			@Pc(82) int[] local82 = Static36.anIntArrayArray4[local76];
			Static367.method5559(-7, arg5, arg3, local82, local65);
			Static367.method5559(-7, local41, arg3, local82, arg4);
		}
	}
}

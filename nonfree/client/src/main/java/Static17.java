import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!an", name = "r", descriptor = "I")
	public static int anInt4840;

	@OriginalMember(owner = "client!an", name = "G", descriptor = "I")
	public static int anInt4852;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_57 = new Class154(12, 8);

	@OriginalMember(owner = "client!an", name = "y", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBILclient!dj;)V")
	public static void method4058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		Static268.aClass75ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!rg;I)V")
	public static void method4059(@OriginalArg(0) Class12_Sub2_Sub1_Sub4 arg0) {
		if (arg0 instanceof Class12_Sub2_Sub1_Sub4_Sub2) {
			@Pc(13) Class12_Sub2_Sub1_Sub4_Sub2 local13 = (Class12_Sub2_Sub1_Sub4_Sub2) arg0;
			if (local13.aClass295_1 != null) {
				Static354.method5072(local13.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local13);
			}
		} else if (arg0 instanceof Class12_Sub2_Sub1_Sub4_Sub1) {
			@Pc(35) Class12_Sub2_Sub1_Sub4_Sub1 local35 = (Class12_Sub2_Sub1_Sub4_Sub1) arg0;
			Static117.method1705(local35.aByte128 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, local35);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(CII)C")
	public static char method4060(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BIIIIII)V")
	public static void method4061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg3 + arg4;
		for (@Pc(17) int local17 = arg3; local17 < local15; local17++) {
			Static437.method5735(arg2, Static238.anIntArrayArray36[local17], arg1, arg5);
		}
		@Pc(41) int local41 = arg4 + arg2;
		for (@Pc(48) int local48 = arg0; local48 > local10; local48--) {
			Static437.method5735(arg2, Static238.anIntArrayArray36[local48], arg1, arg5);
		}
		@Pc(69) int local69 = arg1 - arg4;
		for (@Pc(71) int local71 = local15; local71 <= local10; local71++) {
			@Pc(77) int[] local77 = Static238.anIntArrayArray36[local71];
			Static437.method5735(arg2, local77, local41, arg5);
			Static437.method5735(local69, local77, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!ew;IIIB)Ljava/awt/Frame;")
	public static Frame method4062(@OriginalArg(1) Class99 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method1776()) {
			return null;
		}
		@Pc(20) Class311[] local20 = Static378.method5262(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt7735 == arg1 && arg3 == local20[local28].anInt7736 && (!local26 || local20[local28].anInt7734 > arg2)) {
				arg2 = local20[local28].anInt7734;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(94) Class5 local94 = arg0.method1774(arg1, arg2, arg3);
		while (local94.anInt151 == 0) {
			Static263.method3671(10L);
		}
		@Pc(109) Frame local109 = (Frame) local94.anObject1;
		if (local109 == null) {
			return null;
		} else if (local94.anInt151 == 2) {
			Static572.method7446(local109, arg0);
			return null;
		} else {
			return local109;
		}
	}
}

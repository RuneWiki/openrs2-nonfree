import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "[Lclient!jfa;")
	public static Class180[] aClass180Array4;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!nba;")
	public static Class5_Sub2_Sub13 aClass5_Sub2_Sub13_1;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "[Lclient!jca;")
	public static final Class177[] aClass177Array1 = new Class177[2048];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIILclient!ha;IIILclient!ft;I)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class143 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5_Sub2_Sub5 arg9, @OriginalArg(11) int arg10) {
		if (arg7 < arg1 && arg1 < arg7 + arg3 && arg4 - 13 < arg5 && arg4 + 3 > arg5) {
			arg10 = arg8;
		}
		@Pc(36) String local36 = Static565.method7759(arg9);
		Static32.aClass72_2.method6918(arg10, Static113.aClass59Array2, local36, arg7 + 3, Static558.anIntArray502, arg4);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIB)V")
	public static void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(8, (long) arg3);
		local9.method2438();
		local9.anInt2740 = arg2;
		local9.anInt2749 = arg1;
		local9.anInt2751 = arg0;
	}
}

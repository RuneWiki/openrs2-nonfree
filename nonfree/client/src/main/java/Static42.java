import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_16 = new Class100(54, -1);

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "[I")
	public static final int[] anIntArray83 = new int[5];

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_3 = new Class395(2, 3);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
	public static void method925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static313.anInt9045 && Static575.anInt9879 >= arg2 && Static468.anInt355 <= arg5 && arg3 <= Static370.anInt10475) {
			if (arg4 == 1) {
				Static573.method8216(arg0, arg3, arg5, arg2, arg1);
			} else {
				Static278.method4037(arg0, arg4, arg1, arg3, arg2, arg5);
			}
		} else if (arg4 == 1) {
			Static147.method2329(arg3, arg1, arg2, arg0, arg5);
		} else {
			Static562.method8114(arg1, arg0, arg4, arg5, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BII)Z")
	public static boolean method927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static161.method2611(arg1, arg0) || Static179.method2848(arg1, arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)I")
	public static int method928(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local13 * local27 >> 12;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ko;IZ[B)Lclient!hka;")
	public static Class146 method929(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static274.anIntArray385, 0);
		if (Static274.anIntArray385[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class146(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Z")
	public static boolean method930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}

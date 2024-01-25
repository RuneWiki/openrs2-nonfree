import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Lclient!nn;")
	public static Class251 aClass251_7;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "I")
	public static int anInt908;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Lclient!oo;")
	public static Class267 aClass267_1;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Lclient!gj;")
	public static Class143 aClass143_7;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_6 = new Class376(82, -1);

	@OriginalMember(owner = "client!au", name = "x", descriptor = "I")
	public static int anInt914 = -1;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method942(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class131 local9 = Static320.aClass131Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static320.aClass131Array1[local11] = Static320.aClass131Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class131(arg5, arg0, arg4, arg7, arg6, arg2, arg3, arg1);
		} else {
			local9.method2931(arg6, arg3, arg7, arg0, arg2, arg1, arg5, arg4);
		}
		Static647.anInt9957++;
		Static320.aClass131Array1[0] = local9;
		Static23.anInt722 = Static373.anInt6615;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public static void method943() {
		Static657.method8562();
		Static406.aClass106_4 = null;
		Static44.aClass182ArrayArray1 = null;
		Static235.aClass106_2 = null;
		Static56.aClass106_1 = null;
		Static355.aClass16_6 = null;
	}
}

import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	public static int[] anIntArray228 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!sc;")
	public static Class107 aClass107_639 = Static231.method3737("loc");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1889(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static53.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static213.aClass87_1);
		arg0.addFocusListener(Static213.aClass87_1);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)Lclient!qh;")
	public static Class99 method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1416; local13++) {
			@Pc(19) Class99 local19 = local7.aClass99Array2[local13];
			if ((local19.aLong140 >> 29 & 0x3L) == 2L && local19.anInt3819 == arg1 && local19.anInt3808 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIIII)V")
	public static void method1891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static131.aClass64Array4[0].method1870(arg2, arg3);
		Static131.aClass64Array4[1].method1870(arg2, arg1 + arg3 - 16);
		@Pc(35) int local35 = (arg1 - 32) * arg1 / arg0;
		if (local35 < 8) {
			local35 = 8;
		}
		@Pc(56) int local56 = arg4 * (arg1 - local35 - 32) / (arg0 - arg1);
		Static205.method3250(arg2, arg3 + 16, 16, arg1 - 32, Static99.anInt904);
		Static205.method3250(arg2, local56 + arg3 + 16, 16, local35, Static209.anInt4461);
		Static205.method3246(arg2, arg3 + local56 + 16, local35, Static84.anInt1813);
		Static205.method3246(arg2 + 1, arg3 - -16 + local56, local35, Static84.anInt1813);
		Static205.method3261(arg2, arg3 + local56 + 16, 16, Static84.anInt1813);
		Static205.method3261(arg2, arg3 + local56 + 17, 16, Static84.anInt1813);
		Static205.method3246(arg2 + 15, local56 + 16 + arg3, local35, Static40.anInt856);
		Static205.method3246(arg2 + 14, arg3 + 17 + local56, local35 - 1, Static40.anInt856);
		Static205.method3261(arg2, local35 + arg3 + local56 + 15, 16, Static40.anInt856);
		Static205.method3261(arg2 + 1, arg3 + 14 + (local56 - -local35), 15, Static40.anInt856);
	}
}

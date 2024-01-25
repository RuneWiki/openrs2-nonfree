import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!wa;")
	public static final Class261 aClass261_1 = new Class261(16);

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "F")
	public static float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "[I")
	public static final int[] anIntArray124 = new int[100];

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
	public static int anInt2221 = -1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static305.method3794(arg3)) {
			return;
		}
		if (Static184.aClass76ArrayArray2[arg3] == null) {
			Static55.method899(Static34.aClass76ArrayArray1[arg3], -1, arg6, arg4, arg1, arg2, arg5, arg8, arg7, arg0);
		} else {
			Static55.method899(Static184.aClass76ArrayArray2[arg3], -1, arg6, arg4, arg1, arg2, arg5, arg8, arg7, arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Lclient!cl;")
	public static Class5_Sub8 method1774() {
		if (Static98.aClass177_19 == null || Static264.aClass142_1 == null) {
			return null;
		}
		for (@Pc(25) Class5_Sub8 local25 = (Class5_Sub8) Static264.aClass142_1.method2958(); local25 != null; local25 = (Class5_Sub8) Static264.aClass142_1.method2958()) {
			@Pc(33) Class6 local33 = Static98.aClass28_3.method670(local25.anInt953);
			if (local33 != null && local33.aBoolean26 && local33.method92(Static98.anInterface9_2)) {
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	public static void method1775(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(7, arg0);
		local8.method3024();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIII)I")
	public static int method1776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static452.aByteArrayArrayArray16[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static452.aByteArrayArrayArray16[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!tu;")
	public static Class80 method1777(@OriginalArg(0) Component arg0) {
		return new Class80_Sub1(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V")
	public static void method1778() {
		@Pc(5) Class107[] local5 = Class15_Sub2.aClass107Array1;
		synchronized (Class15_Sub2.aClass107Array1) {
			for (@Pc(9) int local9 = 0; local9 < Class15_Sub2.aClass107Array1.length; local9++) {
				Class15_Sub2.aClass107Array1[local9] = new Class107();
				Static97.anIntArray78[local9] = 0;
			}
		}
	}
}

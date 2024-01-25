import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wi", name = "E", descriptor = "Z")
	public static boolean aBoolean606;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public static int anInt6911 = 1;

	@OriginalMember(owner = "client!wi", name = "B", descriptor = "Lclient!fk;")
	public static final Class67 aClass67_9 = new Class67();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
	public static int method5950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static55.anIntArray375[arg0 & 0x3] : Static208.anIntArray321[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class172 local13 = local7.aClass172_1; local13 != null; local13 = local13.aClass172_4) {
			@Pc(17) Class62_Sub1 local17 = local13.aClass62_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort84 == arg1 && local17.aShort83 == arg2) {
				Static28.method752(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIBIII)V")
	public static void method5953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class2_Sub23 local7 = new Class2_Sub23();
		local7.anInt2849 = arg4;
		local7.anInt2841 = arg0;
		local7.anInt2843 = arg9;
		local7.anInt2848 = arg3;
		local7.anInt2850 = arg10;
		local7.anInt2838 = arg11;
		local7.anInt2844 = arg8;
		local7.anInt2851 = arg5;
		local7.anInt2837 = arg2;
		local7.anInt2842 = arg7;
		local7.anInt2846 = arg6;
		local7.anInt2847 = arg1;
		Static126.aClass216_26.method5995(local7);
	}
}

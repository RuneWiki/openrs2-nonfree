import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
	public static int anInt3601;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	public static final int anInt3598 = 50;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "[I")
	public static final int[] anIntArray241 = new int[anInt3598];

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "[I")
	public static final int[] anIntArray242 = new int[anInt3598];

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
	public static int anInt3604 = 0;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
	public static int anInt3608 = 0;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "[I")
	public static final int[] anIntArray243 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "[I")
	public static final int[] anIntArray244 = new int[anInt3598];

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[anInt3598];

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "[I")
	public static final int[] anIntArray245 = new int[anInt3598];

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "[I")
	public static final int[] anIntArray246 = new int[anInt3598];

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "[I")
	public static final int[] anIntArray247 = new int[anInt3598];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILclient!sj;IBII)V")
	public static void method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static34.aBoolean33) {
			Static262.anInt6840 = 32;
		} else {
			Static262.anInt6840 = 0;
		}
		Static34.aBoolean33 = false;
		@Pc(120) int local120;
		if (Static1.anInt12 != 0) {
			if (arg0 <= arg2 && arg0 + 16 > arg2 && arg1 <= arg5 && arg1 + 16 > arg5) {
				arg3.anInt5685 -= 4;
				Static316.method5250(arg3);
			} else if (arg2 >= arg0 && arg0 + 16 > arg2 && arg5 >= arg4 + arg1 - 16 && arg5 < arg1 + arg4) {
				arg3.anInt5685 += 4;
				Static316.method5250(arg3);
			} else if (arg0 - Static262.anInt6840 <= arg2 && arg2 < arg0 + Static262.anInt6840 + 16 && arg1 + 16 <= arg5 && arg4 + arg1 - 16 > arg5) {
				local120 = (arg4 - 32) * arg4 / arg6;
				if (local120 < 8) {
					local120 = 8;
				}
				@Pc(138) int local138 = arg5 - local120 / 2 - arg1 - 16;
				@Pc(144) int local144 = arg4 - local120 - 32;
				arg3.anInt5685 = (arg6 - arg4) * local138 / local144;
				Static316.method5250(arg3);
				Static34.aBoolean33 = true;
			}
		}
		if (Static19.anInt532 == 0) {
			return;
		}
		local120 = arg3.anInt5704;
		if (arg2 >= arg0 - local120 && arg5 >= arg1 && arg0 + 16 > arg2 && arg4 + arg1 >= arg5) {
			arg3.anInt5685 += Static19.anInt532 * 45;
			Static316.method5250(arg3);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
	public static void method2854(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub43 local14 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg0);
		if (local14 != null) {
			local14.method5717();
		}
	}
}

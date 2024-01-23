import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	public static int anInt5884;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[Lclient!df;")
	public static Class34[] aClass34Array113;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "F")
	public static float aFloat168;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!cb;")
	public static Class20 aClass20_113;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
	public static int anInt5887;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!ak;")
	public static Class7 aClass7_239;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
	public static int[] anIntArray692 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIILclient!sk;III)Lclient!bf;")
	public static Class1_Sub2_Sub2 method4537(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class149 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(35) int local35 = (arg4 << 19) + (arg5 << 17) + arg3 + (arg0 ? 65536 : 0);
		@Pc(45) long local45 = (long) local35 * 3849834839L + (long) arg1 * 3147483667L;
		@Pc(51) Class1_Sub2_Sub2 local51 = (Class1_Sub2_Sub2) Static55.aClass31_10.method852(local45);
		if (local51 != null) {
			return local51;
		}
		Static208.aBoolean311 = false;
		local51 = Static184.method2763(arg1, arg4, arg5, arg2, arg0, false, false, arg3);
		if (local51 != null && !Static208.aBoolean311) {
			Static55.aClass31_10.method851(local51, local45);
		}
		return local51;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method4538() {
		for (@Pc(12) Class1_Sub2_Sub7 local12 = (Class1_Sub2_Sub7) Static44.aClass69_5.method1636(); local12 != null; local12 = (Class1_Sub2_Sub7) Static44.aClass69_5.method1631()) {
			@Pc(21) Class6_Sub4 local21 = local12.aClass6_Sub4_1;
			if (Static159.anInt2978 != local21.anInt3200 || local21.aBoolean241) {
				local12.method4534();
			} else if (Static261.anInt5259 >= local21.anInt3218) {
				local21.method2638(Static47.anInt5866);
				if (local21.aBoolean241) {
					local12.method4534();
				} else {
					Static279.method4292(local21.anInt3200, local21.anInt3217, local21.anInt3198, local21.anInt3214, 60, local21, 0, -1L, false);
				}
			}
		}
	}
}

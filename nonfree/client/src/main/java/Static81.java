import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!wm;")
	public static Class78 aClass78_2;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!lh;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "I")
	public static int anInt1732;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "[S")
	public static short[] aShortArray42 = new short[256];

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_26 = new Class154(50);

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!bq;")
	public static final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	public static void method1446(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class4_Sub37 local10 = (Class4_Sub37) Static307.aClass130_81.method3499(); local10 != null; local10 = (Class4_Sub37) Static307.aClass130_81.method3512()) {
			if (local10.aClass4_Sub13_Sub1_2 != null) {
				Static337.aClass4_Sub13_Sub2_2.method2499(local10.aClass4_Sub13_Sub1_2);
				local10.aClass4_Sub13_Sub1_2 = null;
			}
			if (local10.aClass4_Sub13_Sub1_3 != null) {
				Static337.aClass4_Sub13_Sub2_2.method2499(local10.aClass4_Sub13_Sub1_3);
				local10.aClass4_Sub13_Sub1_3 = null;
			}
			local10.method5667();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class4_Sub37 local53 = (Class4_Sub37) Static182.aClass130_85.method3499(); local53 != null; local53 = (Class4_Sub37) Static182.aClass130_85.method3512()) {
			if (local53.aClass4_Sub13_Sub1_2 != null) {
				Static337.aClass4_Sub13_Sub2_2.method2499(local53.aClass4_Sub13_Sub1_2);
				local53.aClass4_Sub13_Sub1_2 = null;
			}
			local53.method5667();
		}
		for (@Pc(80) Class4_Sub37 local80 = (Class4_Sub37) Static124.aClass198_23.method5268(); local80 != null; local80 = (Class4_Sub37) Static124.aClass198_23.method5263()) {
			if (local80.aClass4_Sub13_Sub1_2 != null) {
				Static337.aClass4_Sub13_Sub2_2.method2499(local80.aClass4_Sub13_Sub1_2);
				local80.aClass4_Sub13_Sub1_2 = null;
			}
			local80.method5667();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([IIII[Ljava/lang/Object;)V")
	public static void method1448(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg2];
		arg3[arg2] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg2; local42++) {
			if ((local42 & 0x1) + local16 > arg0[local42]) {
				@Pc(61) int local61 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local61;
				@Pc(75) Object local75 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local75;
			}
		}
		arg0[arg2] = arg0[local12];
		arg0[local12] = local16;
		arg3[arg2] = arg3[local12];
		arg3[local12] = local30;
		method1448(arg0, arg1, local12 - 1, arg3);
		method1448(arg0, local12 + 1, arg2, arg3);
	}
}

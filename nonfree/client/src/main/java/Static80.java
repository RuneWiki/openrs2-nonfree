import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "[Lclient!am;")
	public static Class9[] aClass9Array2;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "Lclient!th;")
	public static Class168 aClass168_60;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!ci;")
	public static Class26 aClass26_14 = new Class26();

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	public static int anInt1844 = -1;

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
	public static int anInt1857 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([IIII[J)V")
	public static void method1350(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg2) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) long local17 = arg3[local11];
		arg3[local11] = arg3[arg2];
		arg3[arg2] = local17;
		@Pc(31) int local31 = arg0[local11];
		arg0[local11] = arg0[arg2];
		arg0[arg2] = local31;
		for (@Pc(43) int local43 = arg1; local43 < arg2; local43++) {
			if (arg3[local43] < (long) (local43 & 0x1) + local17) {
				@Pc(62) long local62 = arg3[local43];
				arg3[local43] = arg3[local13];
				arg3[local13] = local62;
				@Pc(76) int local76 = arg0[local43];
				arg0[local43] = arg0[local13];
				arg0[local13++] = local76;
			}
		}
		arg3[arg2] = arg3[local13];
		arg3[local13] = local17;
		arg0[arg2] = arg0[local13];
		arg0[local13] = local31;
		method1350(arg0, arg1, local13 - 1, arg3);
		method1350(arg0, local13 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ec;Lclient!ec;B)V")
	public static void method1351(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_232 != null) {
			arg1.method4767();
		}
		arg1.aClass1_232 = arg0.aClass1_232;
		arg1.aClass1_233 = arg0;
		arg1.aClass1_232.aClass1_233 = arg1;
		arg1.aClass1_233.aClass1_232 = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public static void method1355() {
		Static221.anInt4695 = 0;
		Static259.anInt5240 = 0;
		Static46.anInt1108 = -1;
		Static273.aByte24 = 0;
		Static280.anInt5624 = 0;
		Static240.aBoolean314 = false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!gn;")
	public static Class14_Sub22 aClass14_Sub22_5;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_32 = new Class44(54, -2);

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "Lclient!in;")
	public static final Class168 aClass168_1 = new Class168();

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_24 = new Class100(81, -1);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([IIII[J)V")
	public static void method1192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg2) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local21;
		@Pc(35) int local35 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local35;
		@Pc(55) int local55 = ~local21 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg1; local57 < arg2; local57++) {
			if (arg3[local57] < local21 + (long) (local55 & local57)) {
				@Pc(78) long local78 = arg3[local57];
				arg3[local57] = arg3[local17];
				arg3[local17] = local78;
				@Pc(92) int local92 = arg0[local57];
				arg0[local57] = arg0[local17];
				arg0[local17++] = local92;
			}
		}
		arg3[arg2] = arg3[local17];
		arg3[local17] = local21;
		arg0[arg2] = arg0[local17];
		arg0[local17] = local35;
		method1192(arg0, arg1, local17 - 1, arg3);
		method1192(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIB)V")
	public static void method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static313.anInt9045 <= arg2 && Static575.anInt9879 >= arg1 && Static468.anInt355 <= arg0 && arg3 <= Static370.anInt10475) {
			Static311.method4969(arg3, arg1, arg0, arg4, arg2);
		} else {
			Static172.method2778(arg3, arg0, arg1, arg4, arg2);
		}
	}
}

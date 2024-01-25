import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	public static int anInt1258;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "[[Lclient!so;")
	public static Class184[][] aClass184ArrayArray1;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	public static int anInt1273;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!te;")
	public static final Class188 aClass188_1 = new Class188(128);

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	public static int anInt1265 = -1;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
	public static final int[] anIntArray82 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!ni;")
	public static final Class3_Sub4_Sub2 aClass3_Sub4_Sub2_2 = new Class3_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString37 = "Loading config - ";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!sj;IIIII)V")
	public static void method956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2.anInt5715 == 2) {
			@Pc(32) int local32 = 99999;
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < arg2.anInt5773; local38++) {
				for (@Pc(42) int local42 = 0; local42 < arg2.anInt5723; local42++) {
					@Pc(54) int local54 = arg5 + (arg2.anInt5697 + 32) * local42;
					@Pc(64) int local64 = arg6 + local38 * (arg2.anInt5775 + 32);
					if (local36 < 20) {
						local54 += arg2.anIntArray465[local36];
						local64 += arg2.anIntArray467[local36];
					}
					if (arg2.anIntArray469[local36] > 0 && (arg1 < local54 + 32 && arg0 > local54 && local64 + 32 > arg3 && local64 < arg4 || arg2 == Static262.aClass181_59 && local36 == Static164.anInt6261)) {
						if (local34 < local36) {
							local34 = local36;
						}
						if (local36 < local32) {
							local32 = local36;
						}
					}
					local36++;
				}
			}
			Static273.method4609(Static212.aClass122_2, local34, arg2, local32);
		} else if (arg2.anInt5715 == 5 && arg2.anInt5684 != -1) {
			Static261.method4412(Static212.aClass122_2, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method957() {
		Static244.anInt4836 = 0;
		Static283.anInt4489 = 0;
		Static67.method1066();
		Static107.method1835();
		Static331.method5464();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static244.anInt4836; local17++) {
			local23 = Static263.anIntArray427[local17];
			if (Static244.aClass5_Sub4_Sub4_Sub2Array1[local23].anInt4921 != Static51.anInt1101) {
				if (Static244.aClass5_Sub4_Sub4_Sub2Array1[local23].aClass119_1.method2881()) {
					Static323.method5292(Static244.aClass5_Sub4_Sub4_Sub2Array1[local23]);
				}
				Static244.aClass5_Sub4_Sub4_Sub2Array1[local23].method4223(null);
				Static244.aClass5_Sub4_Sub4_Sub2Array1[local23] = null;
			}
		}
		if (Static306.anInt6046 != Static20.aClass3_Sub4_Sub2_1.anInt4268) {
			throw new RuntimeException("gnp1 pos:" + Static20.aClass3_Sub4_Sub2_1.anInt4268 + " psize:" + Static306.anInt6046);
		}
		for (local23 = 0; local23 < Static42.anInt897; local23++) {
			if (Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static42.anInt897);
			}
		}
	}
}

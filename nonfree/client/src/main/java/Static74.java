import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "[[[Lclient!pi;")
	public static Class1_Sub26[][][] aClass1_Sub26ArrayArrayArray1;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "[I")
	public static int[] anIntArray152 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
	public static int anInt1597 = -1;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)Lclient!jl;")
	public static Class1_Sub2_Sub13 method1304(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static240.aClass49_9.method1381((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static19.aClass91_18.method2495(1, arg0);
		} else {
			local25 = Static166.aClass91_134.method2495(1, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub2_Sub13();
		if (local25 != null) {
			local10.method2219(new Class1_Sub11(local25));
		}
		if (arg0 >= 32768) {
			local10.method2221();
		}
		Static240.aClass49_9.method1385(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIILclient!dn;Lclient!dn;IIJ)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class72 local8 = new Class72();
		local8.aLong105 = arg8;
		local8.anInt2734 = arg1 * 128 + 64;
		local8.anInt2732 = arg2 * 128 + 64;
		local8.anInt2739 = arg3;
		local8.aClass14_10 = arg4;
		local8.aClass14_9 = arg5;
		local8.anInt2731 = arg6;
		local8.anInt2740 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (aClass1_Sub26ArrayArrayArray1[local42][arg1][arg2] == null) {
				aClass1_Sub26ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub26(local42, arg1, arg2);
			}
		}
		aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass72_1 = local8;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt2156;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString77 = " is already on your friend list.";

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
	public static int method1734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ir;IIB)Lclient!ka;")
	public static Class3_Sub7_Sub13 method1735(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg0.method2319(arg1, arg2));
		@Pc(49) Class3_Sub7_Sub13 local49 = new Class3_Sub7_Sub13(arg2, local19.method3671(), local19.method3671(), local19.method3642(), local19.method3642(), local19.method3643() == 1, local19.method3643());
		@Pc(53) int local53 = local19.method3643();
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local49.aClass127_17.method3387(new Class3_Sub1(local19.method3643(), local19.method3649(), local19.method3649(), local19.method3649(), local19.method3649(), local19.method3649(), local19.method3649(), local19.method3649(), local19.method3649()));
		}
		local49.method2569();
		return local49;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)I")
	public static int method1736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (arg0 + local15) / arg1 - local15;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!c;III[Z)V")
	public static void method1738(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static69.aClass22Array1 == Static182.aClass22Array2) {
			return;
		}
		@Pc(9) int local9 = Static355.aClass22Array3[arg1].method4678(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class22 local22 = Static355.aClass22Array3[local11];
				if (local22 != null) {
					local22.method4673(arg0, arg2, local9 - local22.method4678(arg2, arg3), arg3);
				}
			}
		}
	}
}

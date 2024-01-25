import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!pl;")
	public static Class259 aClass259_47;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array3;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_41 = new Class286(64, 6);

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_71 = new Class363(47, -2);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1788(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg0);
		@Pc(12) int local12 = local8.method4325();
		@Pc(16) int local16 = local8.method4307();
		if (local16 < 0 || Static487.anInt8239 != 0 && Static487.anInt8239 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(88) byte[] local88 = new byte[local16];
			local8.method4346(local88, local16);
			return local88;
		} else {
			@Pc(41) int local41 = local8.method4307();
			if (local41 < 0 || Static487.anInt8239 != 0 && local41 > Static487.anInt8239) {
				throw new RuntimeException();
			}
			@Pc(58) byte[] local58 = new byte[local41];
			if (local12 == 1) {
				Static115.method1709(local58, local41, arg0, local16);
			} else {
				@Pc(63) Class272 local63 = Static258.aClass272_1;
				synchronized (Static258.aClass272_1) {
					Static258.aClass272_1.method6370(local8, local58);
				}
			}
			return local58;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z")
	public static boolean method1795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static513.method7130(arg0, arg1) || Static282.method4203(arg0, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)I")
	public static int method1797(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!pl;IBI)Lclient!eaa;")
	public static Class2_Sub3_Sub3 method1798(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class2_Sub15 local19 = new Class2_Sub15(arg0.method5985(arg2, arg1));
		@Pc(50) Class2_Sub3_Sub3 local50 = new Class2_Sub3_Sub3(arg2, local19.method4324(), local19.method4324(), local19.method4307(), local19.method4307(), local19.method4325() == 1, local19.method4325(), local19.method4325());
		@Pc(54) int local54 = local19.method4325();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass8_13.method212(new Class2_Sub33(local19.method4325(), local19.method4294(), local19.method4294(), local19.method4294(), local19.method4294(), local19.method4294(), local19.method4294(), local19.method4294(), local19.method4294()));
		}
		local50.method1628();
		return local50;
	}
}

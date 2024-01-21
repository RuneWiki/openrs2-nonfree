import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!le", name = "N", descriptor = "Lclient!mf;")
	public static Class48 aClass48_63 = new Class48(64);

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1131 = Static121.method2047("No reply from loginserver)3");

	@OriginalMember(owner = "client!le", name = "R", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1130 = aClass60_1131;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "I")
	public static int anInt2823 = -1;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "[J")
	public static long[] aLongArray12 = new long[100];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	public static int method1977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!lc;III)Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 method1978(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static13.method279(arg1, arg0, arg2) ? Static57.method322() : null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIII)Lclient!qc;")
	public static Class60 method1979(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(15) int local15 = 1;
		@Pc(19) int local19 = arg1 / 10;
		while (local19 != 0) {
			local19 /= 10;
			local15++;
		}
		@Pc(33) int local33 = local15;
		if (arg1 < 0 || arg0) {
			local33 = local15 + 1;
		}
		@Pc(44) byte[] local44 = new byte[local33];
		if (arg1 < 0) {
			local44[0] = 45;
		} else if (arg0) {
			local44[0] = 43;
		}
		for (@Pc(61) int local61 = 0; local61 < local15; local61++) {
			@Pc(67) int local67 = arg1 % 10;
			arg1 /= 10;
			if (local67 < 0) {
				local67 = -local67;
			}
			if (local67 > 9) {
				local67 += 39;
			}
			local44[local33 - local61 - 1] = (byte) (local67 + 48);
		}
		@Pc(103) Class60 local103 = new Class60();
		local103.anInt2310 = local33;
		local103.aByteArray89 = local44;
		return local103;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public static void method1980() {
		Static111.aClass66_13 = new Class66(32);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!lc;B)V")
	public static void method1981(@OriginalArg(0) Class40 arg0) {
		Static92.aClass40_65 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method1982() {
		aClass60_1131 = null;
		aLongArray12 = null;
		aClass48_63 = null;
		aClass60_1130 = null;
	}
}

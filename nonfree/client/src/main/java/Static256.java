import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!jr;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_91 = new Class256("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "J")
	public static long aLong143 = -1L;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!cr;B)Lclient!cr;")
	public static Class41 method3899(@OriginalArg(0) Class41 arg0) {
		@Pc(11) Class41 local11 = Static56.method1120(arg0);
		if (local11 == null) {
			local11 = arg0.aClass41_3;
		}
		return local11;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method3900(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg7++;
				arg1[local28] = (byte) (arg1[local28] - arg2[arg3++]);
				@Pc(41) int local41 = arg7++;
				arg1[local41] = (byte) (arg1[local41] - arg2[arg3++]);
				@Pc(54) int local54 = arg7++;
				arg1[local54] = (byte) (arg1[local54] - arg2[arg3++]);
				@Pc(67) int local67 = arg7++;
				arg1[local67] = (byte) (arg1[local67] - arg2[arg3++]);
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local28 = arg7++;
				arg1[local28] = (byte) (arg1[local28] - arg2[arg3++]);
			}
			arg7 += arg4;
			arg3 += arg5;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)Lclient!to;")
	public static Class21 method3901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg4 * 986053L ^ (long) arg3 * 475427L ^ (long) arg0 * 67481L ^ (long) arg2 * 97549L ^ (long) arg1 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(44) Class21 local44 = (Class21) Static358.aClass129_55.method3023(local38);
		if (local44 == null) {
			local44 = Static184.aClass26_4.method2289(arg0, arg2, arg3, arg4, arg1, arg5);
			Static358.aClass129_55.method3029(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!pc;Lclient!qa;I)V")
	public static void method3902(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class26 arg1) {
		if (Static192.aBoolean146) {
			return;
		}
		arg1.M(0);
		Static105.aClass76_6 = arg1.method2230(Static456.method1768(arg0, Static406.anInt7051));
		Static105.aClass76_6.method6088((Static96.anInt2175 - Static105.aClass76_6.ja()) / 2, (Static216.anInt4171 - Static105.aClass76_6.JA()) / 2);
		Static301.aClass76_14 = arg1.method2230(Static456.method1768(arg0, Static223.anInt4252));
		Static301.aClass76_14.method6088((Static96.anInt2175 - Static301.aClass76_14.ja()) / 2, 18);
		Static192.aBoolean146 = true;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public static void method3903() {
		Static313.method4436(false);
		if (Static360.anInt6338 >= 0 && Static360.anInt6338 != 0) {
			Static102.method1621(Static360.anInt6338);
			Static360.anInt6338 = -1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lclient!f;B)V")
	public static void method3905(@OriginalArg(0) Class76[] arg0) {
		Static129.anInt7660 = arg0.length;
		Static112.aClass76Array10 = new Class76[Static129.anInt7660 + 10];
		Static224.anIntArray303 = new int[Static129.anInt7660 + 10];
		Static459.method3352(arg0, 0, Static112.aClass76Array10, 0, Static129.anInt7660);
		for (@Pc(30) int local30 = 0; local30 < Static129.anInt7660; local30++) {
			Static224.anIntArray303[local30] = Static112.aClass76Array10[local30].JA();
		}
		for (@Pc(45) int local45 = Static129.anInt7660; local45 < Static112.aClass76Array10.length; local45++) {
			Static224.anIntArray303[local45] = 12;
		}
	}
}

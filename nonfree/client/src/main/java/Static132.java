import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_79;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public static int anInt3021;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_846 = null;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_847 = Static184.method2923("Ausw-=hlen");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt3013 = 0;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	public static int anInt3020 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!i;Lclient!i;Lclient!nb;)[Lclient!rh;")
	public static Class60_Sub1[] method2093(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) Class15 arg2) {
		@Pc(8) int local8 = arg2.method414(arg0);
		@Pc(19) int local19 = arg2.method416(arg1, local8);
		return Static168.method2706(local8, local19, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZIIIII)V")
	public static void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg0 && arg6 == arg5 && arg2 == arg8 && arg7 == arg4) {
			Static203.method3142(arg0, arg4, arg2, arg6, arg3);
			return;
		}
		@Pc(23) int local23 = arg0;
		@Pc(25) int local25 = arg6;
		@Pc(29) int local29 = arg0 * 3;
		@Pc(33) int local33 = arg6 * 3;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(58) int local58 = arg2 + local37 - local45 - arg0;
		@Pc(68) int local68 = local45 + local29 - local37 - local37;
		@Pc(78) int local78 = arg4 + local41 - arg6 - local49;
		@Pc(87) int local87 = local49 + local33 - local41 - local41;
		@Pc(92) int local92 = local37 - local29;
		@Pc(97) int local97 = local41 - local33;
		for (@Pc(99) int local99 = 128; local99 <= 4096; local99 += 128) {
			@Pc(107) int local107 = local99 * local99 >> 12;
			@Pc(111) int local111 = local92 * local99;
			@Pc(117) int local117 = local99 * local107 >> 12;
			@Pc(121) int local121 = local99 * local97;
			@Pc(125) int local125 = local117 * local58;
			@Pc(129) int local129 = local68 * local107;
			@Pc(133) int local133 = local117 * local78;
			@Pc(144) int local144 = (local111 + local125 + local129 >> 12) + arg0;
			@Pc(148) int local148 = local107 * local87;
			@Pc(159) int local159 = (local121 + local133 + local148 >> 12) + arg6;
			Static203.method3142(local23, local159, local144, local25, arg3);
			local25 = local159;
			local23 = local144;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method2095() {
		Static99.aClass43_9.method1469();
		Static151.aClass16_9.method436();
		Static142.aClass43_14.method1469();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public static int method2096() {
		return Static168.anInt3891;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class2_Sub2_Sub12 method2097(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub12 local10 = (Class2_Sub2_Sub12) Static205.aClass43_23.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static185.aClass15_39.method387(Static47.method959(arg0), Static88.method1557(arg0));
		local10 = new Class2_Sub2_Sub12();
		local10.anInt2653 = arg0;
		if (local24 != null) {
			local10.method1893(new Class2_Sub3(local24));
		}
		local10.method1898();
		Static205.aClass43_23.method1462((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg2);
		@Pc(17) int local17 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg4);
		@Pc(23) int local23 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg3);
		@Pc(29) int local29 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1);
		@Pc(37) int local37 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg2 + arg5);
		@Pc(46) int local46 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg4 - arg5);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static204.method3147(local23, arg6, local29, Static3.anIntArrayArray1[local48]);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static204.method3147(local23, arg6, local29, Static3.anIntArrayArray1[local68]);
		}
		@Pc(99) int local99 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg3 + arg5);
		@Pc(108) int local108 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 - arg5);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static3.anIntArrayArray1[local110];
			Static204.method3147(local23, arg6, local99, local116);
			Static204.method3147(local99, arg0, local108, local116);
			Static204.method3147(local108, arg6, local29, local116);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZ)V")
	public static void method2100(@OriginalArg(1) boolean arg0) {
		if (Static189.aClass63_4 == null) {
			return;
		}
		try {
			@Pc(16) Class2_Sub3 local16 = new Class2_Sub3(4);
			local16.method208(arg0 ? 2 : 3);
			local16.method199(0);
			Static189.aClass63_4.method2037(4, local16.aByteArray4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static189.aClass63_4.method2043();
			} catch (@Pc(42) Exception local42) {
			}
			Static189.aClass63_4 = null;
			Static67.anInt1762++;
		}
	}
}

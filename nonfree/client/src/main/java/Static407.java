import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!kea;")
	public static Class161 aClass161_92;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
	public static int anInt7474;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	public static int anInt7464 = 0;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "[I")
	public static final int[] anIntArray657 = new int[3];

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_99 = new Class158(39, 3);

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
	public static int anInt7473 = -1;

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "J")
	public static long aLong229 = 0L;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public static void method6158() {
		if (Static512.anInt8932 == 8) {
			Static333.method5283(4);
		} else if (Static512.anInt8932 == 4 || Static512.anInt8932 == 5) {
			Static333.method5283(2);
		} else if (Static512.anInt8932 == 11) {
			Static333.method5283(2);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)I")
	public static int method6159(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method6161(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(58) char local58;
			if (local17 == '\u0000') {
				local58 = arg2.charAt(local13++);
			} else {
				local58 = local17;
			}
			@Pc(71) char local71;
			if (local19 == '\u0000') {
				local71 = arg1.charAt(local15++);
			} else {
				local71 = local19;
			}
			local17 = Static72.method1460(local58);
			local19 = Static72.method1460(local71);
			local58 = Static309.method173(local58, arg0);
			local71 = Static309.method173(local71, arg0);
			if (local58 != local71 && Character.toUpperCase(local58) != Character.toUpperCase(local71)) {
				local58 = Character.toLowerCase(local58);
				local71 = Character.toLowerCase(local71);
				if (local71 != local58) {
					return Static67.method1371(arg0, local58) - Static67.method1371(arg0, local71);
				}
			}
		}
		@Pc(131) int local131 = Math.min(local8, local11);
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			if (arg0 == 2) {
				local15 = local11 - local133 - 1;
				local13 = local8 - local133 - 1;
			} else {
				local15 = local133;
				local13 = local133;
			}
			@Pc(164) char local164 = arg2.charAt(local13);
			@Pc(168) char local168 = arg1.charAt(local15);
			if (local168 != local164 && Character.toUpperCase(local164) != Character.toUpperCase(local168)) {
				local164 = Character.toLowerCase(local164);
				local168 = Character.toLowerCase(local168);
				if (local164 != local168) {
					return Static67.method1371(arg0, local164) - Static67.method1371(arg0, local168);
				}
			}
		}
		@Pc(212) int local212 = local8 - local11;
		if (local212 != 0) {
			return local212;
		}
		for (@Pc(221) int local221 = 0; local221 < local131; local221++) {
			@Pc(227) char local227 = arg2.charAt(local221);
			@Pc(231) char local231 = arg1.charAt(local221);
			if (local227 != local231) {
				return Static67.method1371(arg0, local227) - Static67.method1371(arg0, local231);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(IB)I")
	public static int method6162(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)Lclient!dw;")
	public static Class66 method6165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 76724863L ^ (long) arg1 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg0 * 475427L ^ (long) arg5 * 97549L ^ (long) arg4 * 67481L;
		@Pc(39) Class66 local39 = (Class66) Static512.aClass125_64.method3512(local33);
		if (local39 == null) {
			local39 = Static236.aClass5_4.method7415(arg4, arg5, arg0, arg3, arg1, arg2);
			Static512.aClass125_64.method3519(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}

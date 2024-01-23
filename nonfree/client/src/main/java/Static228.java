import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
	public static int anInt4954;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1341 = Static231.method3737(")1j");

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
	public static int anInt4955 = 0;

	@OriginalMember(owner = "client!wc", name = "cb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1342 = Static231.method3737("Hidden)2use");

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "J")
	public static long aLong176 = 0L;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ej;IIILjava/awt/Component;)Lclient!jh;")
	public static Class62 method3718(@OriginalArg(0) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static14.anInt334 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class62 local30 = (Class62) Class.forName("Class62_Sub2").getDeclaredConstructor().newInstance();
			local30.anIntArray274 = new int[(Static97.aBoolean189 ? 2 : 1) * 256];
			local30.anInt3196 = arg1;
			local30.method2405(arg3);
			local30.anInt3199 = (arg1 & 0xFFFFFC00) + 1024;
			if (local30.anInt3199 > 16384) {
				local30.anInt3199 = 16384;
			}
			local30.method2408(local30.anInt3199);
			if (Static7.anInt242 > 0 && Static21.aClass38_1 == null) {
				Static21.aClass38_1 = new Class38();
				Static21.aClass38_1.aClass34_1 = arg0;
				arg0.method1068(Static7.anInt242, Static21.aClass38_1);
			}
			if (Static21.aClass38_1 != null) {
				if (Static21.aClass38_1.aClass62Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static21.aClass38_1.aClass62Array1[arg2] = local30;
			}
			return local30;
		} catch (@Pc(100) Throwable local100) {
			try {
				@Pc(106) Class62_Sub1 local106 = new Class62_Sub1(arg0, arg2);
				local106.anIntArray274 = new int[(Static97.aBoolean189 ? 2 : 1) * 256];
				local106.anInt3196 = arg1;
				local106.method2405(arg3);
				local106.anInt3199 = 16384;
				local106.method2408(local106.anInt3199);
				if (Static7.anInt242 > 0 && Static21.aClass38_1 == null) {
					Static21.aClass38_1 = new Class38();
					Static21.aClass38_1.aClass34_1 = arg0;
					arg0.method1068(Static7.anInt242, Static21.aClass38_1);
				}
				if (Static21.aClass38_1 != null) {
					if (Static21.aClass38_1.aClass62Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static21.aClass38_1.aClass62Array1[arg2] = local106;
				}
				return local106;
			} catch (@Pc(173) Throwable local173) {
				return new Class62();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
	public static void method3719() {
		Static221.aClass61_90.method1689();
		Static153.aClass61_59.method1689();
		Static58.aClass61_20.method1689();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method3720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg8 && arg6 == arg5 && arg1 == arg3 && arg7 == arg2) {
			Static128.method2150(arg6, arg3, arg0, arg7, arg4);
			return;
		}
		@Pc(49) int local49 = arg6;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(57) int local57 = arg6 * 3;
		@Pc(59) int local59 = arg4;
		@Pc(63) int local63 = arg8 * 3;
		@Pc(67) int local67 = arg1 * 3;
		@Pc(71) int local71 = arg5 * 3;
		@Pc(75) int local75 = arg2 * 3;
		@Pc(84) int local84 = local53 + local67 - local63 - local63;
		@Pc(94) int local94 = arg7 + local71 - arg6 - local75;
		@Pc(104) int local104 = local57 + local75 - local71 - local71;
		@Pc(109) int local109 = local63 - local53;
		@Pc(117) int local117 = local63 + arg3 - local67 - arg4;
		@Pc(121) int local121 = local71 - local57;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(131) int local131 = local123 * local123 >> 12;
			@Pc(137) int local137 = local131 * local123 >> 12;
			@Pc(141) int local141 = local137 * local117;
			@Pc(145) int local145 = local94 * local137;
			@Pc(149) int local149 = local84 * local131;
			@Pc(153) int local153 = local104 * local131;
			@Pc(157) int local157 = local123 * local109;
			@Pc(161) int local161 = local123 * local121;
			@Pc(172) int local172 = arg6 + (local161 + local153 + local145 >> 12);
			@Pc(183) int local183 = arg4 + (local157 + local141 + local149 >> 12);
			Static128.method2150(local49, local183, arg0, local172, local59);
			local59 = local183;
			local49 = local172;
		}
	}
}

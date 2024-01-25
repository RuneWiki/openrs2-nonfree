import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!p", name = "A", descriptor = "I")
	public static int anInt6477 = 0;

	@OriginalMember(owner = "client!p", name = "C", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray73 = null;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method5763(@OriginalArg(0) int arg0) {
		Static238.anInt4660 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BIZ)Z")
	public static boolean method5764(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class14_Sub4 local12 = new Class14_Sub4(arg1);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local12.method2507();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(97) Class59 local97;
				do {
					@Pc(67) int local67;
					@Pc(71) int local71;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local12.method2525();
										if (local39 == 0) {
											continue label68;
										}
										local12.method2548();
									}
									local39 = local12.method2525();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local12.method2548() >> 2;
									local67 = arg2 + local57;
									local71 = arg0 + local51;
								} while (local67 <= 0);
							} while (local71 <= 0);
						} while (local67 >= Static195.anInt3965 - 1);
					} while (local71 >= Static298.anInt5716 - 1);
					local97 = Static232.method2200(local14);
				} while (local63 == 22 && !Static323.aBoolean52 && local97.anInt1955 == 0 && local97.anInt1960 != 1 && !local97.aBoolean134);
				local33 = true;
				if (!local97.method1976()) {
					local7 = false;
					Static194.anInt3956++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;IILclient!ap;I)Lclient!bp;")
	public static Class26 method5766(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15 arg2, @OriginalArg(4) int arg3) {
		if (Static223.anInt5818 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(42) Class26 local42 = (Class26) Class.forName("Class26_Sub2").getDeclaredConstructor().newInstance();
			local42.anInt4713 = arg3;
			local42.anIntArray425 = new int[(Static111.aBoolean172 ? 2 : 1) * 256];
			local42.method4230(arg0);
			local42.anInt4712 = (arg3 & 0xFFFFFC00) + 1024;
			if (local42.anInt4712 > 16384) {
				local42.anInt4712 = 16384;
			}
			local42.method4226(local42.anInt4712);
			if (Static281.anInt5354 > 0 && Static142.aClass145_1 == null) {
				Static142.aClass145_1 = new Class145();
				Static142.aClass145_1.aClass15_4 = arg2;
				arg2.method287(Static281.anInt5354, Static142.aClass145_1);
			}
			if (Static142.aClass145_1 != null) {
				if (Static142.aClass145_1.aClass26Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static142.aClass145_1.aClass26Array1[arg1] = local42;
			}
			return local42;
		} catch (@Pc(115) Throwable local115) {
			try {
				@Pc(121) Class26_Sub1 local121 = new Class26_Sub1(arg2, arg1);
				local121.anInt4713 = arg3;
				local121.anIntArray425 = new int[(Static111.aBoolean172 ? 2 : 1) * 256];
				local121.method4230(arg0);
				local121.anInt4712 = 16384;
				local121.method4226(local121.anInt4712);
				if (Static281.anInt5354 > 0 && Static142.aClass145_1 == null) {
					Static142.aClass145_1 = new Class145();
					Static142.aClass145_1.aClass15_4 = arg2;
					arg2.method287(Static281.anInt5354, Static142.aClass145_1);
				}
				if (Static142.aClass145_1 != null) {
					if (Static142.aClass145_1.aClass26Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static142.aClass145_1.aClass26Array1[arg1] = local121;
				}
				return local121;
			} catch (@Pc(180) Throwable local180) {
				return new Class26();
			}
		}
	}
}

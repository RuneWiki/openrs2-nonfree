import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_22;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt1941 = 2;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_477 = Static8.method128("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_478 = Static8.method128("ams");

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!ea;")
	private static Class18 aClass18_479 = Static8.method128("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_480 = aClass18_479;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!ea;")
	public static Class18 aClass18_481 = Static8.method128("leuchten3:");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BIB)Z")
	public static boolean method1282(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(17) Class1_Sub6 local17 = new Class1_Sub6(arg1);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local17.method527();
			if (local23 == 0) {
				return local3;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(90) Class1_Sub1_Sub11 local90;
				do {
					@Pc(57) int local57;
					@Pc(71) int local71;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method527();
										if (local39 == 0) {
											continue label68;
										}
										local17.method544();
									}
									local39 = local17.method527();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(53) int local53 = local31 >> 6 & 0x3F;
									local57 = local53 + arg2;
									local63 = local17.method544() >> 2;
									@Pc(67) int local67 = local31 & 0x3F;
									local71 = arg0 + local67;
								} while (local57 <= 0);
							} while (local71 <= 0);
						} while (local57 >= 103);
					} while (local71 >= 103);
					local90 = Static62.method1274(local19);
				} while (local63 == 22 && Static27.aBoolean26 && local90.anInt2811 == 0 && local90.anInt2820 != 1 && !local90.aBoolean115);
				local33 = true;
				if (!local90.method1972()) {
					local3 = false;
					Static155.anInt4268++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1286() {
		aClass18_479 = null;
		aClass16_Sub1_22 = null;
		aClass18_477 = null;
		aClass18_478 = null;
		aClass18_481 = null;
		aClass18_480 = null;
	}
}

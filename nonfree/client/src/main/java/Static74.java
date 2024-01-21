import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array14;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public static int anInt3650 = 0;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1412 = Static120.method1824("leuchten2:");

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
	public static volatile long aLong122 = 0L;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lclient!rd;")
	public static Class80 method2635(@OriginalArg(0) int arg0) {
		@Pc(15) Class80 local15 = new Class80();
		local15.aByteArray43 = new byte[arg0];
		local15.anInt3421 = 0;
		return local15;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method2636() {
		@Pc(9) Object local9 = Static56.anObject2;
		synchronized (Static56.anObject2) {
			if (Static149.anInt3347 != 0) {
				Static149.anInt3347 = 1;
				try {
					Static56.anObject2.wait();
				} catch (@Pc(19) InterruptedException local19) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!rd;I)V")
	public static void method2638(@OriginalArg(1) Class80 arg0, @OriginalArg(2) int arg1) {
		Static146.aClass3_Sub17_Sub1_3.method2146(146);
		Static146.aClass3_Sub17_Sub1_3.method2106(arg1);
		Static146.aClass3_Sub17_Sub1_3.method2089(arg0.method2441());
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BII)Z")
	public static boolean method2639(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class3_Sub17 local17 = new Class3_Sub17(arg1);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method2093();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(72) int local72;
				@Pc(94) Class3_Sub1_Sub1 local94;
				do {
					@Pc(66) int local66;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(44) int local44;
									while (local36) {
										local44 = local17.method2090();
										if (local44 == 0) {
											continue label70;
										}
										local17.method2107();
									}
									local44 = local17.method2090();
									if (local44 == 0) {
										continue label70;
									}
									local34 += local44 - 1;
									@Pc(56) int local56 = local34 & 0x3F;
									@Pc(62) int local62 = local34 >> 6 & 0x3F;
									local66 = local62 + arg2;
									local72 = local17.method2107() >> 2;
									local77 = local56 + arg0;
								} while (local66 <= 0);
							} while (local77 <= 0);
						} while (local66 >= 103);
					} while (local77 >= 103);
					local94 = Static162.method2627(local19);
				} while (local72 == 22 && Static96.aBoolean83 && local94.anInt159 == 0 && local94.anInt134 != 1 && !local94.aBoolean15);
				if (!local94.method124()) {
					local7 = false;
					Static193.anInt4408++;
				}
				local36 = true;
			}
		}
	}
}

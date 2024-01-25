import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "Lclient!lm;")
	public static Class134 aClass134_13;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString22 = "scroll:";

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "S")
	public static short aShort11 = 205;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public static void method500(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub2_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class12 local8 = Static278.aClass12Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static3.anInt38; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static97.anInt1852; local15++) {
						local1 = local8.method2693(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class12 local41 = Static278.aClass12Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method2704(local15, local12) - local41.method2704(local15, local12);
									@Pc(67) int local67 = local8.method2704(local15 + 1, local12) - local41.method2704(local15 + 1, local12);
									@Pc(85) int local85 = local8.method2704(local15 + 1, local12 + 1) - local41.method2704(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method2704(local15, local12 + 1) - local41.method2704(local15, local12 + 1);
									local41.method2696(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub15 local13 = Static17.method307(5, arg0);
		local13.method4783();
		local13.anInt5461 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public static void method502(@OriginalArg(0) int arg0) {
		if (Static49.anInt5279 == 0) {
			Static58.aClass1_Sub31_Sub3_1.method4719(arg0);
		} else {
			Static204.anInt6780 = arg0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method503(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub2_Sub15 local14 = Static17.method307(2, arg1);
		local14.method4783();
		local14.aString211 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)Lclient!jn;")
	public static Class118 method504(@OriginalArg(0) int arg0) {
		@Pc(5) Class37 local5 = Static246.aClass37_80;
		@Pc(14) Class118 local14;
		synchronized (Static246.aClass37_80) {
			local14 = (Class118) Static246.aClass37_80.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static166.aClass134_75.method3009(arg0, 32);
		local14 = new Class118();
		if (local30 != null) {
			local14.method2557(new Class1_Sub21(local30));
		}
		local14.method2554();
		@Pc(48) Class37 local48 = Static246.aClass37_80;
		synchronized (Static246.aClass37_80) {
			Static246.aClass37_80.method922((long) arg0, local14);
			return local14;
		}
	}
}

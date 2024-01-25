import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt5433;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "S")
	public static short aShort72 = 1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
	public static void method4736() {
		@Pc(5) Class66 local5 = Static75.aClass66_29;
		synchronized (Static75.aClass66_29) {
			Static75.aClass66_29.method1944(5);
		}
		local5 = Static35.aClass66_8;
		synchronized (Static35.aClass66_8) {
			Static35.aClass66_8.method1944(5);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZZ)V")
	public static void method4737(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			Static74.anInt1813--;
			if (Static74.anInt1813 == 0) {
				Static169.anIntArray252 = null;
			}
		}
		Static344.anInt1072--;
		if (Static344.anInt1072 == 0) {
			Static82.anIntArray113 = null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4738(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V")
	public static void method4739(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub9_Sub14 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class3 local8 = Static262.aClass3Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static248.anInt4822; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static12.anInt378; local15++) {
						local1 = local8.method5627(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class3 local41 = Static262.aClass3Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5638(local15, local12) - local41.method5638(local15, local12);
									@Pc(67) int local67 = local8.method5638(local15 + 1, local12) - local41.method5638(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5638(local15 + 1, local12 + 1) - local41.method5638(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5638(local15, local12 + 1) - local41.method5638(local15, local12 + 1);
									local41.method5628(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method4740(@OriginalArg(0) Class170 arg0) {
		Static42.aClass170_8 = arg0;
	}
}

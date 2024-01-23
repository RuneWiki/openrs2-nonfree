import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array8;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString55 = "Loaded update list";

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
	public static int anInt1874 = -1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[I[ILclient!c;[I)V")
	public static void method1409(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class25_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) int local19 = arg1[local7];
			@Pc(23) int local23 = arg3[local7];
			@Pc(27) int local27 = arg0[local7];
			@Pc(29) int local29 = 0;
			while (local23 != 0 && local29 < arg2.aClass86Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg2.aClass86Array3[local29] = null;
					} else {
						@Pc(58) Class163 local58 = Static115.method1895(local19);
						@Pc(63) Class86 local63 = arg2.aClass86Array3[local29];
						@Pc(66) int local66 = local58.anInt5911;
						if (local63 != null) {
							if (local63.anInt3241 == local19) {
								if (local66 == 0) {
									local63 = arg2.aClass86Array3[local29] = null;
								} else if (local66 == 1) {
									local63.anInt3240 = 0;
									local63.anInt3236 = 1;
									local63.anInt3242 = 0;
									local63.anInt3232 = local27;
									local63.anInt3239 = 0;
									Static188.method3369(arg2.anInt1604, local58, 0, arg2.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg2);
								} else if (local66 == 2) {
									local63.anInt3240 = 0;
								}
							} else if (local58.anInt5905 >= Static115.method1895(local63.anInt3241).anInt5905) {
								local63 = arg2.aClass86Array3[local29] = null;
							}
						}
						if (local63 == null) {
							local63 = arg2.aClass86Array3[local29] = new Class86();
							local63.anInt3236 = 1;
							local63.anInt3239 = 0;
							local63.anInt3232 = local27;
							local63.anInt3242 = 0;
							local63.anInt3241 = local19;
							local63.anInt3240 = 0;
							Static188.method3369(arg2.anInt1604, local58, 0, arg2.anInt1635, arg2 == Static239.aClass25_Sub1_Sub1_2);
						}
					}
				}
				local29++;
				local23 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(B)V")
	public static void method1410() {
		if (Static1.aClass171_1 != null) {
			@Pc(13) Class171 local13 = Static1.aClass171_1;
			synchronized (Static1.aClass171_1) {
				Static1.aClass171_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	public static void method1412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static239.anInt5264 * arg0 >> 8;
		if (local9 != 0 && arg1 != -1) {
			Static66.method2992(Static231.aClass83_172, local9, arg1);
			Static191.aBoolean212 = true;
		}
	}
}

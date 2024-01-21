import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	public static int anInt2368;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	public static int anInt2371;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lclient!ei;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_1;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
	public static int anInt2363 = 20;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_707 = Static81.method1507("Loading sprites )2 ");

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "Lclient!dj;")
	public static Class24 aClass24_708 = aClass24_707;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIII)V")
	public static void method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static63.anInt1608 && arg2 + arg0 <= Static63.anInt1595 && arg1 - arg0 >= Static13.anInt308 && Static52.anInt1338 >= arg1 + arg0) {
			Static194.method3310(arg2, arg3, arg1, arg0);
		} else {
			Static176.method3554(arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!vc;I)I")
	public static int method1831(@OriginalArg(0) Class98 arg0) {
		@Pc(18) Class1_Sub24 local18 = (Class1_Sub24) Static143.aClass57_32.method1872(((long) arg0.anInt4357 << 32) + ((long) arg0.anInt4379));
		return local18 == null ? arg0.anInt4412 : local18.anInt4339;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIII)Z")
	public static boolean method1832(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg0);
		@Pc(16) int local16 = -1;
		label68: while (true) {
			@Pc(20) int local20 = local10.method2782();
			if (local20 == 0) {
				return local5;
			}
			@Pc(24) int local24 = 0;
			local16 += local20;
			@Pc(30) boolean local30 = false;
			while (true) {
				@Pc(65) int local65;
				@Pc(91) Class1_Sub2_Sub5 local91;
				do {
					@Pc(74) int local74;
					@Pc(70) int local70;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									while (local30) {
										local36 = local10.method2795();
										if (local36 == 0) {
											continue label68;
										}
										local10.method2771();
									}
									local36 = local10.method2795();
									if (local36 == 0) {
										continue label68;
									}
									local24 += local36 - 1;
									@Pc(51) int local51 = local24 & 0x3F;
									@Pc(57) int local57 = local24 >> 6 & 0x3F;
									local65 = local10.method2771() >> 2;
									local70 = local51 + arg2;
									local74 = arg1 + local57;
								} while (local74 <= 0);
							} while (local70 <= 0);
						} while (local74 >= 103);
					} while (local70 >= 103);
					local91 = Static37.method702(local16);
				} while (local65 == 22 && Static30.aBoolean35 && local91.anInt984 == 0 && local91.anInt965 != 1 && !local91.aBoolean46);
				local30 = true;
				if (!local91.method694()) {
					local5 = false;
					Static128.anInt2830++;
				}
			}
		}
	}
}

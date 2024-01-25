import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!kn;")
	public static Class163 aClass163_4;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!dda;")
	public static Class53 aClass53_105;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!dda;")
	public static Class53 aClass53_106;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public static int anInt6885 = 0;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "[I")
	public static final int[] anIntArray532 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_137 = new Class239(65, -2);

	@OriginalMember(owner = "client!rs", name = "S", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_21 = new Class91(5, 16);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIII)V")
	public static void method5859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub13_Sub15 local12 = Static370.method5893(arg1, 8);
		local12.method6968();
		local12.anInt8314 = arg0;
		local12.anInt8318 = arg2;
		local12.anInt8320 = arg3;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public static void method5862() {
		Static70.aClass2_Sub29_Sub2_1.method5244();
		@Pc(15) int local15 = Static70.aClass2_Sub29_Sub2_1.method5248(8);
		@Pc(29) int local29;
		if (local15 < Static520.anInt1936) {
			for (local29 = local15; local29 < Static520.anInt1936; local29++) {
				Static8.anIntArray17[Static411.anInt7662++] = Static24.anIntArray39[local29];
			}
		}
		if (Static520.anInt1936 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static520.anInt1936 = 0;
		for (local29 = 0; local29 < local15; local29++) {
			@Pc(67) int local67 = Static24.anIntArray39[local29];
			@Pc(75) Class1_Sub1_Sub2_Sub2 local75 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) local67)).aClass1_Sub1_Sub2_Sub2_1;
			@Pc(80) int local80 = Static70.aClass2_Sub29_Sub2_1.method5248(1);
			if (local80 == 0) {
				Static24.anIntArray39[Static520.anInt1936++] = local67;
				local75.anInt5049 = Static115.anInt2326;
			} else {
				@Pc(102) int local102 = Static70.aClass2_Sub29_Sub2_1.method5248(2);
				if (local102 == 0) {
					Static24.anIntArray39[Static520.anInt1936++] = local67;
					local75.anInt5049 = Static115.anInt2326;
					Static430.anIntArray604[Static36.anInt644++] = local67;
				} else {
					@Pc(144) int local144;
					@Pc(156) int local156;
					if (local102 == 1) {
						Static24.anIntArray39[Static520.anInt1936++] = local67;
						local75.anInt5049 = Static115.anInt2326;
						local144 = Static70.aClass2_Sub29_Sub2_1.method5248(3);
						local75.method4397(local144, 1);
						local156 = Static70.aClass2_Sub29_Sub2_1.method5248(1);
						if (local156 == 1) {
							Static430.anIntArray604[Static36.anInt644++] = local67;
						}
					} else if (local102 == 2) {
						Static24.anIntArray39[Static520.anInt1936++] = local67;
						local75.anInt5049 = Static115.anInt2326;
						if (Static70.aClass2_Sub29_Sub2_1.method5248(1) == 1) {
							local144 = Static70.aClass2_Sub29_Sub2_1.method5248(3);
							local75.method4397(local144, 2);
							local156 = Static70.aClass2_Sub29_Sub2_1.method5248(3);
							local75.method4397(local156, 2);
						} else {
							local144 = Static70.aClass2_Sub29_Sub2_1.method5248(3);
							local75.method4397(local144, 0);
						}
						local144 = Static70.aClass2_Sub29_Sub2_1.method5248(1);
						if (local144 == 1) {
							Static430.anIntArray604[Static36.anInt644++] = local67;
						}
					} else if (local102 == 3) {
						Static8.anIntArray17[Static411.anInt7662++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB)I")
	public static int method5863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}
}

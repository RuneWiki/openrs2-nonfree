import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
	public static int anInt3046;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_72 = new Class211(92, 6);

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_105 = new Class102(51, 4);

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_55 = new Class134("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "[I")
	public static final int[] anIntArray241 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "Lclient!rb;")
	public static Class211 aClass211_73 = null;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method2474(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static376.method4880(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local39 <= local42);
			return Static145.method2125(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!nf;)V")
	public static void method2475(@OriginalArg(1) Class2_Sub13_Sub2 arg0) {
		arg0.method3612();
		@Pc(10) int local10 = Static201.anInt3383;
		@Pc(20) Class3_Sub4_Sub1_Sub2 local20 = Static60.aClass3_Sub4_Sub1_Sub2_1 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local10] = new Class3_Sub4_Sub1_Sub2();
		local20.anInt4915 = local10;
		@Pc(30) int local30 = arg0.method3615(30);
		@Pc(35) byte local35 = (byte) (local30 >> 28);
		@Pc(41) int local41 = local30 >> 14 & 0x3FFF;
		@Pc(45) int local45 = local30 & 0x3FFF;
		local20.anIntArray425[0] = local41 - Static275.anInt4506;
		local20.anInt6833 = (local20.anIntArray425[0] << 7) + (local20.method4009() << 6);
		local20.anIntArray424[0] = local45 - Static209.anInt3497;
		local20.anInt6835 = (local20.anIntArray424[0] << 7) + (local20.method4009() << 6);
		Static61.anInt1129 = local20.aByte91 = local35;
		if (Static357.aClass2_Sub13Array3[local10] != null) {
			local20.method4024(Static357.aClass2_Sub13Array3[local10]);
		}
		Static119.anInt2204 = 0;
		Static200.anIntArray295[Static119.anInt2204++] = local10;
		Static413.aByteArray86[local10] = 0;
		Static111.anInt2076 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local10) {
				@Pc(134) int local134 = arg0.method3615(18);
				@Pc(138) int local138 = local134 >> 16;
				@Pc(144) int local144 = local134 >> 8 & 0xFF;
				@Pc(148) int local148 = local134 & 0xFF;
				@Pc(156) Class68 local156 = Static428.aClass68Array1[local124] = new Class68();
				local156.anInt1868 = -1;
				local156.anInt1864 = 0;
				local156.anInt1866 = local148 + (local138 << 28) + (local144 << 14);
				local156.aBoolean131 = false;
				Static100.anIntArray148[Static111.anInt2076++] = local124;
				Static413.aByteArray86[local124] = 0;
			}
		}
		arg0.method3617();
	}
}

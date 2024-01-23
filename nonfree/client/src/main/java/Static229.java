import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	public static int anInt4619;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "Lclient!ek;")
	public static Class42 aClass42_71;

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_11;

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "Lclient!ek;")
	public static Class42 aClass42_72;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	public static int anInt4617 = 0;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public static int anInt4618 = 0;

	@OriginalMember(owner = "client!qg", name = "E", descriptor = "Z")
	public static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!qg", name = "N", descriptor = "J")
	public static volatile long aLong173 = 0L;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
	public static void method3734() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static103.aBooleanArray8[local3] = false;
		}
		Static280.anInt5531 = -1;
		Static84.anInt1965 = 0;
		Static160.anInt5160 = -1;
		Static225.anInt5366 = 0;
		Static16.anInt342 = 5;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(CZ)Z")
	public static boolean method3735(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZII)I")
	public static int method3738(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub10 local12 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(28) int local28 = 0; local28 < local12.anIntArray105.length; local28++) {
			if (local12.anIntArray105[local28] >= 0 && local12.anIntArray105[local28] < Static105.anInt1095) {
				@Pc(56) Class60 local56 = Static87.method1546(local12.anIntArray105[local28]);
				if (local56.aClass101_5 != null) {
					@Pc(70) Class2_Sub25 local70 = (Class2_Sub25) local56.aClass101_5.method2867((long) arg0);
					if (local70 != null) {
						if (arg1) {
							local19 += local70.anInt4838 * local12.anIntArray104[local28];
						} else {
							local19 += local70.anInt4838;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V")
	public static void method3742() {
		@Pc(3) int local3;
		@Pc(18) int local18;
		for (local3 = -1; local3 < Static191.anInt4008; local3++) {
			if (local3 == -1) {
				local18 = 2047;
			} else {
				local18 = Static246.anIntArray479[local3];
			}
			@Pc(26) Class15_Sub2_Sub2 local26 = Static188.aClass15_Sub2_Sub2Array41[local18];
			if (local26 != null && local26.anInt5374 > 0) {
				local26.anInt5374--;
				if (local26.anInt5374 == 0) {
					local26.aString181 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static57.anInt1448; local3++) {
			local18 = Static89.anIntArray194[local3];
			@Pc(72) Class15_Sub2_Sub1 local72 = Static35.aClass15_Sub2_Sub1Array2[local18];
			if (local72 != null && local72.anInt5374 > 0) {
				local72.anInt5374--;
				if (local72.anInt5374 == 0) {
					local72.aString181 = null;
				}
			}
		}
	}
}

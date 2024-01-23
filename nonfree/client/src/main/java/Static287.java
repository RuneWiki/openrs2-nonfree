import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString411 = "Loaded config";

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	public static int anInt5745 = 0;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "[I")
	public static int[] anIntArray515 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!un", name = "g", descriptor = "[Lclient!d;")
	public static Class32[] aClass32Array2 = new Class32[14];

	@OriginalMember(owner = "client!un", name = "i", descriptor = "[F")
	public static float[] aFloatArray30 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!th;)Z")
	public static boolean method4394(@OriginalArg(1) Class168 arg0) {
		return arg0.method4038(Static257.anInt5233);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)I")
	public static int method4395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class1_Sub7 local17 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < local17.anIntArray165.length; local35++) {
				if (local17.anIntArray164[local35] == arg1) {
					local33 += local17.anIntArray165[local35];
				}
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public static void method4396() {
		Static140.aClass1_Sub14_Sub1_2.method2255();
		@Pc(13) int local13 = Static140.aClass1_Sub14_Sub1_2.method2251(8);
		@Pc(18) int local18;
		if (Static147.anInt3287 > local13) {
			for (local18 = local13; local18 < Static147.anInt3287; local18++) {
				Static20.anIntArray49[Static81.anInt1887++] = Static100.anIntArray224[local18];
			}
		}
		if (Static147.anInt3287 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static147.anInt3287 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(63) int local63 = Static100.anIntArray224[local18];
			@Pc(67) Class2_Sub4_Sub1 local67 = Static105.aClass2_Sub4_Sub1Array1[local63];
			@Pc(72) int local72 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
			if (local72 == 0) {
				Static100.anIntArray224[Static147.anInt3287++] = local63;
				local67.anInt2824 = Static133.anInt3061;
			} else {
				@Pc(92) int local92 = Static140.aClass1_Sub14_Sub1_2.method2251(2);
				if (local92 == 0) {
					Static100.anIntArray224[Static147.anInt3287++] = local63;
					local67.anInt2824 = Static133.anInt3061;
					Static100.anIntArray223[Static242.anInt5012++] = local63;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local92 == 1) {
						Static100.anIntArray224[Static147.anInt3287++] = local63;
						local67.anInt2824 = Static133.anInt3061;
						local138 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
						local67.method2093(1, local138);
						local148 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
						if (local148 == 1) {
							Static100.anIntArray223[Static242.anInt5012++] = local63;
						}
					} else if (local92 == 2) {
						Static100.anIntArray224[Static147.anInt3287++] = local63;
						local67.anInt2824 = Static133.anInt3061;
						if (Static140.aClass1_Sub14_Sub1_2.method2251(1) == 1) {
							local138 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
							local67.method2093(2, local138);
							local148 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
							local67.method2093(2, local148);
						} else {
							local138 = Static140.aClass1_Sub14_Sub1_2.method2251(3);
							local67.method2093(0, local138);
						}
						local138 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
						if (local138 == 1) {
							Static100.anIntArray223[Static242.anInt5012++] = local63;
						}
					} else if (local92 == 3) {
						Static20.anIntArray49[Static81.anInt1887++] = local63;
					}
				}
			}
		}
	}
}

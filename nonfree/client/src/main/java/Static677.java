import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "[Lclient!kca;")
	public static Class206[] aClass206Array1;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!sj;)I")
	public static int method9183(@OriginalArg(1) Class4_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt2357 == 0) {
			return 0;
		}
		@Pc(71) int local71;
		@Pc(65) int local65;
		if (arg0.anInt2348 != -1) {
			@Pc(21) Class4_Sub2_Sub1_Sub2 local21 = null;
			if (arg0.anInt2348 < 32768) {
				@Pc(37) Class2_Sub49 local37 = (Class2_Sub49) Static467.aClass218_37.method5095((long) arg0.anInt2348, 0);
				if (local37 != null) {
					local21 = local37.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				}
			} else if (arg0.anInt2348 >= 32768) {
				local21 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[arg0.anInt2348 - 32768];
			}
			if (local21 != null) {
				local65 = arg0.anInt10229 - local21.anInt10229;
				local71 = arg0.anInt10228 - local21.anInt10228;
				if (local65 != 0 || local71 != 0) {
					arg0.method2056((int) (Math.atan2((double) local65, (double) local71) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub2_Sub1_Sub2_Sub1) {
			@Pc(191) Class4_Sub2_Sub1_Sub2_Sub1 local191 = (Class4_Sub2_Sub1_Sub2_Sub1) arg0;
			if (local191.anInt848 != -1 && (local191.anInt2371 == 0 || local191.anInt2369 > 0)) {
				local191.method2056(local191.anInt848);
				local191.anInt848 = -1;
			}
		} else if (arg0 instanceof Class4_Sub2_Sub1_Sub2_Sub2) {
			@Pc(106) Class4_Sub2_Sub1_Sub2_Sub2 local106 = (Class4_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local106.anInt2398 != -1 && (local106.anInt2371 == 0 || local106.anInt2369 > 0)) {
				local65 = local106.anInt10229 - (local106.anInt2398 - Static243.anInt3820 - Static243.anInt3820) * 256;
				local71 = local106.anInt10228 - (local106.anInt2388 - Static224.anInt11062 - Static224.anInt11062) * 256;
				if (local65 != 0 || local71 != 0) {
					local106.method2056((int) (Math.atan2((double) local65, (double) local71) * 2607.5945876176133D) & 0x3FFF);
				}
				local106.anInt2398 = -1;
			}
		}
		return arg0.method2050();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method9184(@OriginalArg(1) String arg0) {
		if (!Static229.aClass389_4.aBoolean913) {
			return -1;
		} else if (Static406.aHashtable5.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(28) String local28 = Static238.method3364(arg0);
			if (local28 == null) {
				return -1;
			}
			@Pc(42) String local42 = Static550.aString95 + local28;
			if (!Static457.aClass254_123.method6100("", local42)) {
				return -1;
			} else if (Static457.aClass254_123.method6069(local42)) {
				@Pc(68) byte[] local68 = Static457.aClass254_123.method6104(local42, "");
				@Pc(74) File local74;
				try {
					local74 = Static197.method2800(local28);
				} catch (@Pc(76) RuntimeException local76) {
					return -1;
				}
				if (local68 == null || local74 == null) {
					return -1;
				}
				@Pc(86) boolean local86 = true;
				@Pc(90) byte[] local90 = Static282.method3956(local74);
				if (local90 != null && local68.length == local90.length) {
					for (@Pc(109) int local109 = 0; local109 < local90.length; local109++) {
						if (local68[local109] != local90[local109]) {
							local86 = false;
							break;
						}
					}
				} else {
					local86 = false;
				}
				try {
					if (!local86) {
						Static229.aClass389_4.method9280(local74, local68);
					}
				} catch (@Pc(147) Throwable local147) {
					return -1;
				}
				Static250.method3480(arg0, local74);
				return 100;
			} else {
				return Static457.aClass254_123.method6092(local42);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public static void method9186() {
		Static626.aBoolean824 = true;
		Static238.aShort55 = Static538.aShort115;
		Static263.aShort57 = Static8.aShort1;
		Static367.aShort70 = Static353.aShort131;
		Static479.aShort103 = Static323.aShort61;
		if (Static173.anInt2989 != 0 && Static154.anInt2554 != 0) {
			Static8.aShort1 = 334;
			Static353.aShort131 = 334;
			Static323.aShort61 = Static538.aShort115 = (short) (Static173.anInt2989 * 512 / Static154.anInt2554);
		}
	}
}

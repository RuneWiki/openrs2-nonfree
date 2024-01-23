import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray50;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!fh;")
	public static Class58 aClass58_101;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[Lclient!ui;")
	public static Class177[] aClass177Array1 = new Class177[50];

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt5441 = 0;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Z")
	public static boolean aBoolean368 = true;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method4441(@OriginalArg(1) int arg0) {
		Static16.anInt929 = -1;
		Static16.anInt929 = -1;
		Static275.anInt5232 = arg0;
		Static204.method3262();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public static void method4442(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static43.method2329(11, arg0);
		local10.method1519();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method4443() {
		@Pc(6) int local6 = Static189.aClass4_Sub10_Sub1_2.method4689(8);
		@Pc(23) int local23;
		if (Static129.anInt2510 > local6) {
			for (local23 = local6; local23 < Static129.anInt2510; local23++) {
				Static68.anIntArray99[Static213.anInt4195++] = Static172.anIntArray317[local23];
			}
		}
		if (local6 > Static129.anInt2510) {
			throw new RuntimeException("gppov1");
		}
		Static129.anInt2510 = 0;
		for (local23 = 0; local23 < local6; local23++) {
			@Pc(62) int local62 = Static172.anIntArray317[local23];
			@Pc(66) Class53_Sub1_Sub1 local66 = Static182.aClass53_Sub1_Sub1Array1[local62];
			@Pc(73) int local73 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
			if (local73 == 0) {
				Static172.anIntArray317[Static129.anInt2510++] = local62;
				local66.anInt3990 = Static50.anInt954;
			} else {
				@Pc(94) int local94 = Static189.aClass4_Sub10_Sub1_2.method4689(2);
				if (local94 == 0) {
					Static172.anIntArray317[Static129.anInt2510++] = local62;
					local66.anInt3990 = Static50.anInt954;
					Static275.anIntArray587[Static250.anInt4761++] = local62;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local94 == 1) {
						Static172.anIntArray317[Static129.anInt2510++] = local62;
						local66.anInt3990 = Static50.anInt954;
						local140 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
						local66.method3321(local140, 1);
						local150 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
						if (local150 == 1) {
							Static275.anIntArray587[Static250.anInt4761++] = local62;
						}
					} else if (local94 == 2) {
						Static172.anIntArray317[Static129.anInt2510++] = local62;
						local66.anInt3990 = Static50.anInt954;
						if (Static189.aClass4_Sub10_Sub1_2.method4689(1) == 1) {
							local140 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
							local66.method3321(local140, 2);
							local150 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
							local66.method3321(local150, 2);
						} else {
							local140 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
							local66.method3321(local140, 0);
						}
						local140 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
						if (local140 == 1) {
							Static275.anIntArray587[Static250.anInt4761++] = local62;
						}
					} else if (local94 == 3) {
						Static68.anIntArray99[Static213.anInt4195++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public static void method4444(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub18 local8 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg0);
		if (local8 != null) {
			for (@Pc(24) int local24 = 0; local24 < local8.anIntArray385.length; local24++) {
				local8.anIntArray385[local24] = -1;
				local8.anIntArray386[local24] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Z")
	public static boolean method4445(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}

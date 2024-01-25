import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	public static int anInt4374 = -1;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "J")
	public static long aLong157 = -1L;

	@OriginalMember(owner = "client!nr", name = "bb", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_6 = new Class44(128);

	@OriginalMember(owner = "client!nr", name = "Gb", descriptor = "I")
	public static int anInt4418 = 255;

	@OriginalMember(owner = "client!nr", name = "Nb", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_152 = new Class106(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!nr", name = "Rb", descriptor = "I")
	public static int anInt4422 = 0;

	@OriginalMember(owner = "client!nr", name = "Tb", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_119 = new Class21(8);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZ)V")
	public static void method4065(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class1_Sub26 local16 = Static65.method5281(arg0, arg1);
		if (local16 != null) {
			local16.method6045();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[Lclient!kg;)V")
	public static void method4072(@OriginalArg(0) int arg0, @OriginalArg(2) Class112[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class112 local20 = arg1[local14];
			if (local20 != null && local20.anInt3428 == arg0 && !Static44.method1077(local20)) {
				if (local20.anInt3373 == 0) {
					method4072(local20.anInt3376, arg1);
					if (local20.aClass112Array2 != null) {
						method4072(local20.anInt3376, local20.aClass112Array2);
					}
					@Pc(57) Class1_Sub15 local57 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local20.anInt3376);
					if (local57 != null) {
						Static367.method6082(local57.anInt1496);
					}
				}
				if (local20.anInt3373 == 6 && local20.anInt3387 != -1) {
					@Pc(79) Class199 local79 = Static161.method3066(local20.anInt3387);
					if (local79 != null) {
						local20.anInt3407 += Static217.anInt4314;
						while (local20.anInt3407 > local79.anIntArray466[local20.anInt3409]) {
							local20.anInt3407 -= local79.anIntArray466[local20.anInt3409];
							local20.anInt3409++;
							if (local79.anIntArray467.length <= local20.anInt3409) {
								local20.anInt3409 -= local79.anInt6009;
								if (local20.anInt3409 < 0 || local79.anIntArray467.length <= local20.anInt3409) {
									local20.anInt3409 = 0;
								}
							}
							local20.anInt3441 = local20.anInt3409 + 1;
							if (local79.anIntArray467.length <= local20.anInt3441) {
								local20.anInt3441 -= local79.anInt6009;
								if (local20.anInt3441 < 0 || local20.anInt3441 >= local79.anIntArray467.length) {
									local20.anInt3441 = -1;
								}
							}
							Static133.method2725(local20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IB)Lclient!gn;")
	public static Class71 method4081(@OriginalArg(0) int arg0) {
		@Pc(5) Class21 local5 = Static110.aClass21_71;
		@Pc(14) Class71 local14;
		synchronized (Static110.aClass21_71) {
			local14 = (Class71) Static110.aClass21_71.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static171.aClass30_54.method1161(Static324.method5525(arg0), Static30.method720(arg0));
		local14 = new Class71();
		local14.anInt2365 = arg0;
		if (local34 != null) {
			local14.method2272(new Class1_Sub7(local34));
		}
		local14.method2285();
		if (!Static20.aBoolean28 && local14.aBoolean162) {
			local14.anIntArray181 = null;
			local14.aStringArray7 = null;
		}
		if (local14.aBoolean174) {
			local14.anInt2397 = 0;
			local14.aBoolean171 = false;
		}
		@Pc(80) Class21 local80 = Static110.aClass21_71;
		synchronized (Static110.aClass21_71) {
			Static110.aClass21_71.method843(local14, (long) arg0);
			return local14;
		}
	}
}

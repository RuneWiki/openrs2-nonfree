import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!oba;")
	public static final Class261 aClass261_3 = new Class261();

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_30 = new Class241(83, -1);

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
	public static boolean aBoolean186 = true;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method2070() {
		@Pc(8) Class6_Sub15_Sub1 local8 = Static525.aClass260_4.aClass6_Sub15_Sub1_2;
		local8.method2469();
		@Pc(16) int local16 = local8.method2468(8);
		@Pc(21) int local21;
		if (local16 < Static201.anInt4069) {
			for (local21 = local16; local21 < Static201.anInt4069; local21++) {
				Static201.anIntArray211[Static434.anInt7433++] = Static531.anIntArray580[local21];
			}
		}
		if (Static201.anInt4069 < local16) {
			throw new RuntimeException("gnpov1");
		}
		Static201.anInt4069 = 0;
		for (local21 = 0; local21 < local16; local21++) {
			@Pc(73) int local73 = Static531.anIntArray580[local21];
			@Pc(81) Class60_Sub1_Sub1_Sub3_Sub2 local81 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) local73)).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			@Pc(86) int local86 = local8.method2468(1);
			if (local86 == 0) {
				Static531.anIntArray580[Static201.anInt4069++] = local73;
				local81.anInt4866 = Static49.anInt596;
			} else {
				@Pc(108) int local108 = local8.method2468(2);
				if (local108 == 0) {
					Static531.anIntArray580[Static201.anInt4069++] = local73;
					local81.anInt4866 = Static49.anInt596;
					Static610.anIntArray630[Static563.anInt9103++] = local73;
				} else {
					@Pc(159) int local159;
					@Pc(169) int local169;
					if (local108 == 1) {
						Static531.anIntArray580[Static201.anInt4069++] = local73;
						local81.anInt4866 = Static49.anInt596;
						local159 = local8.method2468(3);
						local81.method4434(local159, 1);
						local169 = local8.method2468(1);
						if (local169 == 1) {
							Static610.anIntArray630[Static563.anInt9103++] = local73;
						}
					} else if (local108 == 2) {
						Static531.anIntArray580[Static201.anInt4069++] = local73;
						local81.anInt4866 = Static49.anInt596;
						if (local8.method2468(1) == 1) {
							local159 = local8.method2468(3);
							local81.method4434(local159, 2);
							local169 = local8.method2468(3);
							local81.method4434(local169, 2);
						} else {
							local159 = local8.method2468(3);
							local81.method4434(local159, 0);
						}
						local159 = local8.method2468(1);
						if (local159 == 1) {
							Static610.anIntArray630[Static563.anInt9103++] = local73;
						}
					} else if (local108 == 3) {
						Static201.anIntArray211[Static434.anInt7433++] = local73;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
	public static boolean method2073() {
		return Static432.anInt7414 != 0;
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(B)Z")
	public static boolean method2079() {
		return Static597.anInt9453 != 0;
	}
}

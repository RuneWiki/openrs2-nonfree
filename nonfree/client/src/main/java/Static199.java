import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public static int anInt3952;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "I")
	public static int anInt3947 = 0;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1139 = Static181.method2795("m");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
	public static int method3012(@OriginalArg(1) int arg0) {
		@Pc(3) Class2_Sub2_Sub4 local3 = Static82.method1483(arg0);
		@Pc(6) int local6 = local3.anInt585;
		@Pc(13) int local13 = local3.anInt590;
		@Pc(16) int local16 = local3.anInt592;
		@Pc(27) int local27 = Class2_Sub2_Sub10.anIntArray107[local16 - local13];
		return Static14.anIntArray235[local6] >> local13 & local27;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public static void method3014(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub22 local16 = (Class2_Sub22) Static135.aClass63_10.method2110((long) arg0);
		if (local16 != null) {
			for (@Pc(21) int local21 = 0; local21 < local16.anIntArray307.length; local21++) {
				local16.anIntArray307[local21] = -1;
				local16.anIntArray306[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
	public static void method3016() {
		Static33.aClass2_Sub3_Sub1_1.method287();
		@Pc(13) int local13 = Static33.aClass2_Sub3_Sub1_1.method285(8);
		@Pc(18) int local18;
		if (Static162.anInt3930 > local13) {
			for (local18 = local13; local18 < Static162.anInt3930; local18++) {
				Static26.anIntArray46[Static89.anInt4289++] = Static207.anIntArray402[local18];
			}
		}
		if (local13 > Static162.anInt3930) {
			throw new RuntimeException("gnpov1");
		}
		Static162.anInt3930 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static207.anIntArray402[local18];
			@Pc(64) Class24_Sub4_Sub2 local64 = Static47.aClass24_Sub4_Sub2Array1[local60];
			@Pc(69) int local69 = Static33.aClass2_Sub3_Sub1_1.method285(1);
			if (local69 == 0) {
				Static207.anIntArray402[Static162.anInt3930++] = local60;
				local64.anInt3309 = Static13.anInt386;
			} else {
				@Pc(89) int local89 = Static33.aClass2_Sub3_Sub1_1.method285(2);
				if (local89 == 0) {
					Static207.anIntArray402[Static162.anInt3930++] = local60;
					local64.anInt3309 = Static13.anInt386;
					Static64.anIntArray130[Static177.anInt3619++] = local60;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static207.anIntArray402[Static162.anInt3930++] = local60;
						local64.anInt3309 = Static13.anInt386;
						local136 = Static33.aClass2_Sub3_Sub1_1.method285(3);
						local64.method2522(local136, false);
						local146 = Static33.aClass2_Sub3_Sub1_1.method285(1);
						if (local146 == 1) {
							Static64.anIntArray130[Static177.anInt3619++] = local60;
						}
					} else if (local89 == 2) {
						Static207.anIntArray402[Static162.anInt3930++] = local60;
						local64.anInt3309 = Static13.anInt386;
						local136 = Static33.aClass2_Sub3_Sub1_1.method285(3);
						local64.method2522(local136, true);
						local146 = Static33.aClass2_Sub3_Sub1_1.method285(3);
						local64.method2522(local146, true);
						@Pc(200) int local200 = Static33.aClass2_Sub3_Sub1_1.method285(1);
						if (local200 == 1) {
							Static64.anIntArray130[Static177.anInt3619++] = local60;
						}
					} else if (local89 == 3) {
						Static26.anIntArray46[Static89.anInt4289++] = local60;
					}
				}
			}
		}
	}
}

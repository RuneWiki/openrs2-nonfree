import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "[Lclient!ea;")
	public static Class82[] aClass82Array1;

	@OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
	public static int anInt5673;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_56 = new Class94(14, -1);

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
	public static int anInt5672 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!ro;)V")
	public static void method4906(@OriginalArg(0) Class300 arg0) {
		if (Static102.anInt2851 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub1 local6 = arg0.aClass2_Sub1_2;
		Static436.aClass300Array1[Static102.anInt2851] = arg0;
		Static475.aBooleanArray26[Static102.anInt2851] = false;
		Static102.anInt2851++;
		@Pc(21) int local21 = arg0.anInt9115;
		if (arg0.aBoolean658) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt9115;
		if (arg0.aBoolean657) {
			local29 = Static462.anInt8470 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method3962() + Static361.anInt7189 - local6.method3968() >> Static151.anInt3896;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method3962() + local6.method3968() - Static361.anInt7189 >> Static151.anInt3896;
			if (local73 >= Static562.anInt10128) {
				local73 = Static562.anInt10128 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray123[local41++];
				@Pc(105) int local105 = (local6.method3969() + Static361.anInt7189 - local6.method3968() >> Static151.anInt3896) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static477.anInt8929) {
					local113 = Static477.anInt8929 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static423.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static423.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static102.anInt2851;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static423.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static102.anInt2851 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static423.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static102.anInt2851 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static423.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static102.anInt2851 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V")
	public static void method4907() {
		if (Static532.aClass2_Sub6_Sub21_1 != null) {
			Static532.aClass2_Sub6_Sub21_1 = null;
			Static18.method369(Static202.anInt4656, Static40.anInt1336, Static169.anInt731, Static440.anInt8157);
		}
	}
}

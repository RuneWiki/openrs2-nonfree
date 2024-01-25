import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_3 = new Class91("", 11);

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_54 = new Class67("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gda;)V")
	public static void method3263(@OriginalArg(0) Class103 arg0) {
		if (Static84.anInt1836 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub30 local6 = arg0.aClass3_Sub30_1;
		Static513.aClass103Array1[Static84.anInt1836] = arg0;
		Static69.aBooleanArray7[Static84.anInt1836] = false;
		Static84.anInt1836++;
		@Pc(21) int local21 = arg0.anInt3141;
		if (arg0.aBoolean225) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt3141;
		if (arg0.aBoolean224) {
			local29 = Static399.anInt7385 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5388() + Static467.anInt8424 - local6.method5387() >> Static33.anInt880;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5388() + local6.method5387() - Static467.anInt8424 >> Static33.anInt880;
			if (local73 >= Static108.anInt2385) {
				local73 = Static108.anInt2385 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray78[local41++];
				@Pc(105) int local105 = (local6.method5386() + Static467.anInt8424 - local6.method5387() >> Static33.anInt880) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static126.anInt2626) {
					local113 = Static126.anInt2626 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static329.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static329.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static84.anInt1836;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static329.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static84.anInt1836 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static329.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static84.anInt1836 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static329.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static84.anInt1836 << 48;
					}
				}
			}
		}
	}
}

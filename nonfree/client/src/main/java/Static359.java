import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_94 = new Class217(76, -1);

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
	public static int anInt6090 = -1;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method4751(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static50.aClass32_20.anInt1093 = 1;
		@Pc(9) String local9 = arg1.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static314.aClass12_2.anInt408; local16++) {
			@Pc(22) Class81 local22 = Static314.aClass12_2.method327(local16);
			if ((!arg0 || local22.aBoolean226) && local22.anInt2541 == -1 && local22.anInt2554 == -1 && local22.anInt2531 == 0 && local22.aString17.toLowerCase().indexOf(local9) != -1) {
				if (local14 >= 250) {
					Static36.anInt1022 = -1;
					Static226.aShortArray66 = null;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(68) short[] local68 = new short[local12.length * 2];
					for (@Pc(70) int local70 = 0; local70 < local14; local70++) {
						local68[local70] = local12[local70];
					}
					local12 = local68;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static36.anInt1022 = local14;
		Static226.aShortArray66 = local12;
		Static390.anInt6521 = 0;
		@Pc(110) String[] local110 = new String[Static36.anInt1022];
		for (@Pc(112) int local112 = 0; local112 < Static36.anInt1022; local112++) {
			local110[local112] = Static314.aClass12_2.method327(local12[local112]).aString17;
		}
		Static91.method1682(Static226.aShortArray66, local110);
		Static50.aClass32_20.method803();
		Static50.aClass32_20.anInt1093 = 2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	public static int anInt1814;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public static int anInt1816 = 0;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1478(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg1, 2);
		local8.method3004();
		local8.aString45 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method1479(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static358.aClass230_80.anInt5779 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static263.aClass102_2.anInt2686; local18++) {
			@Pc(25) Class88 local25 = Static263.aClass102_2.method2172(local18);
			if ((!arg1 || local25.lb) && local25.anInt2022 == -1 && local25.anInt2030 == -1 && local25.anInt2021 == 0 && local25.aString17.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static6.anInt85 = -1;
					Static110.aShortArray122 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(75) short[] local75 = new short[local14.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
						local75[local77] = local14[local77];
					}
					local14 = local75;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static110.aShortArray122 = local14;
		Static148.anInt2721 = 0;
		Static6.anInt85 = local16;
		@Pc(115) String[] local115 = new String[Static6.anInt85];
		for (@Pc(117) int local117 = 0; local117 < Static6.anInt85; local117++) {
			local115[local117] = Static263.aClass102_2.method2172(local14[local117]).aString17;
		}
		Static364.method5203(Static110.aShortArray122, local115);
		Static358.aClass230_80.method4968();
		Static358.aClass230_80.anInt5779 = 2;
	}
}

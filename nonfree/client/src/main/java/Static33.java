import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt695 = 0;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt697 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method598(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static335.anInt5738;
		@Pc(9) int[] local9 = Static242.anIntArray933;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class1_Sub5_Sub1_Sub1 local21 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local9[local13]];
			if (local21 != null && Static206.aClass1_Sub5_Sub1_Sub1_1 != local21 && local21.aString24 != null && local21.aString24.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static216.method3597(Static74.aClass11_22);
					Static372.aClass2_Sub16_Sub2_4.method5365(local9[local13]);
					Static372.aClass2_Sub16_Sub2_4.method5333(0);
				} else if (arg1 == 4) {
					Static216.method3597(Static289.aClass11_77);
					Static372.aClass2_Sub16_Sub2_4.method5328(local9[local13]);
					Static372.aClass2_Sub16_Sub2_4.method5313(0);
				} else if (arg1 == 5) {
					Static216.method3597(Static74.aClass11_23);
					Static372.aClass2_Sub16_Sub2_4.method5318(local9[local13]);
					Static372.aClass2_Sub16_Sub2_4.method5313(0);
				} else if (arg1 == 6) {
					Static216.method3597(Static32.aClass11_9);
					Static372.aClass2_Sub16_Sub2_4.method5365(local9[local13]);
					Static372.aClass2_Sub16_Sub2_4.method5358(0);
				} else if (arg1 == 7) {
					Static216.method3597(Static114.aClass11_40);
					Static372.aClass2_Sub16_Sub2_4.method5358(0);
					Static372.aClass2_Sub16_Sub2_4.method5351(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static351.method5638(Static50.aClass32_19.method701(Static107.anInt2498) + arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII[I[I)V")
	public static void method599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg1; local51++) {
			if (arg2[local51] < (local51 & 0x1) + local25) {
				@Pc(70) int local70 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local70;
				@Pc(84) int local84 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local84;
			}
		}
		arg2[arg1] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg1] = arg3[local21];
		arg3[local21] = local39;
		method599(arg0, local21 - 1, arg2, arg3);
		method599(local21 + 1, arg1, arg2, arg3);
	}
}

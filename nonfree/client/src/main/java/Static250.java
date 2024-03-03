import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!pk", name = "nb", descriptor = "I")
	public static int anInt5013;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 16)
	public static void method4594(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Class237.anInt6756 : Class18.anInt554) + local19;
		for (@Pc(34) int local34 = local19; local34 < local27; local34++) {
			@Pc(40) Class2_Sub2_Sub16 local40 = Static137.method2701(local34);
			if (local40.aBoolean413 && local40.method5602().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static165.aShortArray55 = null;
					Static305.anInt6115 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local34;
			}
		}
		Static305.anInt6115 = local13;
		Static12.anInt266 = 0;
		Static165.aShortArray55 = local11;
		@Pc(112) String[] local112 = new String[Static305.anInt6115];
		for (@Pc(114) int local114 = 0; local114 < Static305.anInt6115; local114++) {
			local112[local114] = Static137.method2701(local11[local114]).method5602();
		}
		Static126.method2536(local112, Static165.aShortArray55);
	}
}

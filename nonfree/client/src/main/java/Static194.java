import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
	public static int anInt4422;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_59 = new Class67("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "S")
	public static short aShort71 = 1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
	public static void method3706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static498.method7193(arg2);
		@Pc(12) int local12 = 0;
		@Pc(24) int local24 = arg2 - arg4;
		if (local24 < 0) {
			local24 = 0;
		}
		@Pc(30) int local30 = arg2;
		@Pc(33) int local33 = -arg2;
		@Pc(35) int local35 = local24;
		@Pc(38) int local38 = -local24;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Static68.anIntArrayArray24[arg5];
		@Pc(50) int local50 = arg3 - local24;
		@Pc(54) int local54 = local24 + arg3;
		Static257.method4540(local46, arg0, arg3 - arg2, local50);
		Static257.method4540(local46, arg1, local50, local54);
		Static257.method4540(local46, arg0, local54, arg3 + arg2);
		while (local30 > local12) {
			local40 += 2;
			local42 += 2;
			local38 += local42;
			local33 += local40;
			if (local38 >= 0 && local35 >= 1) {
				Static24.anIntArray128[local35] = local12;
				local35--;
				local38 -= local35 << 1;
			}
			local12++;
			@Pc(127) int[] local127;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(155) int local155;
			if (local33 >= 0) {
				local30--;
				if (local30 < local24) {
					local127 = Static68.anIntArrayArray24[arg5 + local30];
					local134 = Static68.anIntArrayArray24[arg5 - local30];
					local138 = Static24.anIntArray128[local30];
					local142 = arg3 + local12;
					local146 = arg3 - local12;
					local150 = local138 + arg3;
					local155 = arg3 - local138;
					Static257.method4540(local127, arg0, local146, local155);
					Static257.method4540(local127, arg1, local155, local150);
					Static257.method4540(local127, arg0, local150, local142);
					Static257.method4540(local134, arg0, local146, local155);
					Static257.method4540(local134, arg1, local155, local150);
					Static257.method4540(local134, arg0, local150, local142);
				} else {
					local127 = Static68.anIntArrayArray24[arg5 + local30];
					local134 = Static68.anIntArrayArray24[arg5 - local30];
					local138 = local12 + arg3;
					local142 = arg3 - local12;
					Static257.method4540(local127, arg0, local142, local138);
					Static257.method4540(local134, arg0, local142, local138);
				}
				local33 -= local30 << 1;
			}
			local127 = Static68.anIntArrayArray24[arg5 + local12];
			local134 = Static68.anIntArrayArray24[arg5 - local12];
			local138 = local30 + arg3;
			local142 = arg3 - local30;
			if (local24 > local12) {
				local146 = local12 > local35 ? Static24.anIntArray128[local12] : local35;
				local150 = arg3 + local146;
				local155 = arg3 - local146;
				Static257.method4540(local127, arg0, local142, local155);
				Static257.method4540(local127, arg1, local155, local150);
				Static257.method4540(local127, arg0, local150, local138);
				Static257.method4540(local134, arg0, local142, local155);
				Static257.method4540(local134, arg1, local155, local150);
				Static257.method4540(local134, arg0, local150, local138);
			} else {
				Static257.method4540(local127, arg0, local142, local138);
				Static257.method4540(local134, arg0, local142, local138);
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;CZ)I")
	public static int method3707(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}

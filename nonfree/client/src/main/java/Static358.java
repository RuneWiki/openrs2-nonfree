import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!bm;")
	public static final Class32 aClass32_9 = new Class32();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)Z")
	public static boolean method5932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static497.method7515(arg1, arg0) || Static237.method4127(arg0, arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5934(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(2) String local2 = arg1.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static25.aClass189_1.anInt5965 : Static25.aClass189_1.anInt5966) + local17;
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(37) Class3_Sub4_Sub16 local37 = Static25.aClass189_1.method4916(local29);
			if (local37.aBoolean697 && local37.method6953().toLowerCase().indexOf(local2) != -1) {
				if (local11 >= 50) {
					Static68.aShortArray21 = null;
					Static569.anInt10059 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(70) short[] local70 = new short[local9.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local11; local72++) {
						local70[local72] = local9[local72];
					}
					local9 = local70;
				}
				local9[local11++] = (short) local29;
			}
		}
		Static68.aShortArray21 = local9;
		Static569.anInt10059 = local11;
		Static319.anInt6594 = 0;
		@Pc(113) String[] local113 = new String[Static569.anInt10059];
		for (@Pc(115) int local115 = 0; local115 < Static569.anInt10059; local115++) {
			local113[local115] = Static25.aClass189_1.method4916(local9[local115]).method6953();
		}
		Static593.method8377(local113, Static68.aShortArray21);
	}
}

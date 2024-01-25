import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_53 = new Class184(10, 3);

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method1186(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(2) String local2 = arg1.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static32.aClass259_1.anInt7487 : Static32.aClass259_1.anInt7484) + local17;
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(35) Class3_Sub3_Sub18 local35 = Static32.aClass259_1.method5865(local29);
			if (local35.aBoolean414 && local35.method4655().toLowerCase().indexOf(local2) != -1) {
				if (local11 >= 50) {
					Static72.aShortArray39 = null;
					Static301.anInt5506 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(69) short[] local69 = new short[local9.length * 2];
					for (@Pc(71) int local71 = 0; local71 < local11; local71++) {
						local69[local71] = local9[local71];
					}
					local9 = local69;
				}
				local9[local11++] = (short) local29;
			}
		}
		Static301.anInt5506 = local11;
		Static72.aShortArray39 = local9;
		Static425.anInt7285 = 0;
		@Pc(103) String[] local103 = new String[Static301.anInt5506];
		for (@Pc(105) int local105 = 0; local105 < Static301.anInt5506; local105++) {
			local103[local105] = Static32.aClass259_1.method5865(local9[local105]).method4655();
		}
		Static258.method5845(local103, Static72.aShortArray39);
	}
}

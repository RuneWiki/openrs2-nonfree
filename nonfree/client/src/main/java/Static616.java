import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	public static int anInt9884;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
	public static final int anInt9887 = 1338;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method8706(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static143.aClass77_1.anInt2266 : Static143.aClass77_1.anInt2263) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class3_Sub11_Sub18 local38 = Static143.aClass77_1.method2082(local31);
			if (local38.aBoolean728 && local38.method8273().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static436.aShortArray104 = null;
					Static478.anInt7943 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(72) short[] local72 = new short[local11.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local13; local74++) {
						local72[local74] = local11[local74];
					}
					local11 = local72;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static492.anInt8115 = 0;
		Static436.aShortArray104 = local11;
		Static478.anInt7943 = local13;
		@Pc(115) String[] local115 = new String[Static478.anInt7943];
		for (@Pc(117) int local117 = 0; local117 < Static478.anInt7943; local117++) {
			local115[local117] = Static143.aClass77_1.method2082(local11[local117]).method8273();
		}
		Static128.method2420(local115, Static436.aShortArray104);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V")
	public static void method8707(@OriginalArg(0) int arg0) {
		Static46.anInt1071 = 2;
		Static41.anInt961 = arg0;
		@Pc(9) String local9 = null;
		if (Static365.aByteArray63 != null) {
			@Pc(16) Class3_Sub25 local16 = new Class3_Sub25(Static365.aByteArray63);
			local9 = Static28.method669(local16.method8600());
			Static276.aLong146 = local16.method8600();
		}
		if (local9 == null) {
			Static425.method6144(35);
		} else {
			Static191.method3505("", false, local9, true);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!waa", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray70;

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "Z")
	public static boolean aBoolean707;

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Lclient!gga;")
	public static final Class117 aClass117_9 = new Class117();

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method8197(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(2) String local2 = arg1.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(28) int local28 = local17 + (arg0 ? Static190.aClass295_1.anInt8605 : Static190.aClass295_1.anInt8603);
		for (@Pc(30) int local30 = local17; local30 < local28; local30++) {
			@Pc(36) Class4_Sub5_Sub9 local36 = Static190.aClass295_1.method7021(local30);
			if (local36.aBoolean314 && local36.method3774().toLowerCase().indexOf(local2) != -1) {
				if (local11 >= 50) {
					Static256.aShortArray58 = null;
					Static291.anInt5926 = -1;
					return;
				}
				if (local11 >= local9.length) {
					@Pc(70) short[] local70 = new short[local9.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local11; local72++) {
						local70[local72] = local9[local72];
					}
					local9 = local70;
				}
				local9[local11++] = (short) local30;
			}
		}
		Static291.anInt5926 = local11;
		Static15.anInt243 = 0;
		Static256.aShortArray58 = local9;
		@Pc(112) String[] local112 = new String[Static291.anInt5926];
		for (@Pc(114) int local114 = 0; local114 < Static291.anInt5926; local114++) {
			local112[local114] = Static190.aClass295_1.method7021(local9[local114]).method3774();
		}
		Static9.method172(local112, Static256.aShortArray58);
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)I")
	public static int method8201() {
		return 19;
	}
}

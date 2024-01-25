import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cha", name = "A", descriptor = "Lclient!us;")
	public static Class356 aClass356_1;

	@OriginalMember(owner = "client!cha", name = "B", descriptor = "[I")
	public static final int[] anIntArray121 = new int[13];

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method1383(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg1 ? Static526.aClass266_1.anInt7797 : Static526.aClass266_1.anInt7799);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class14_Sub3_Sub20 local39 = Static526.aClass266_1.method6436(local32);
			if (local39.aBoolean730 && local39.method8787().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static550.aShortArray136 = null;
					Static665.anInt4338 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static550.aShortArray136 = local11;
		Static665.anInt4338 = local13;
		Static38.anInt995 = 0;
		@Pc(114) String[] local114 = new String[Static665.anInt4338];
		for (@Pc(116) int local116 = 0; local116 < Static665.anInt4338; local116++) {
			local114[local116] = Static526.aClass266_1.method6436(local11[local116]).method8787();
		}
		Static92.method1732(Static550.aShortArray136, local114);
	}
}

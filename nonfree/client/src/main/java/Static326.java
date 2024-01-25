import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "J")
	public static long aLong252 = 20000000L;

	@OriginalMember(owner = "client!mh", name = "L", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
	public static int anInt5840 = -1;

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
	public static int anInt5841 = -1;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method4912(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static296.aClass362_2.anInt9531 : Static296.aClass362_2.anInt9529) + local19;
		for (@Pc(36) int local36 = local19; local36 < local29; local36++) {
			@Pc(43) Class1_Sub3_Sub3 local43 = Static296.aClass362_2.method7873(local36);
			if (local43.aBoolean79 && local43.method816().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static238.anInt9537 = -1;
					Static410.aShortArray79 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(79) short[] local79 = new short[local11.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local13; local81++) {
						local79[local81] = local11[local81];
					}
					local11 = local79;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static410.aShortArray79 = local11;
		Static238.anInt9537 = local13;
		Static370.anInt6548 = 0;
		@Pc(114) String[] local114 = new String[Static238.anInt9537];
		for (@Pc(116) int local116 = 0; local116 < Static238.anInt9537; local116++) {
			local114[local116] = Static296.aClass362_2.method7873(local11[local116]).method816();
		}
		Static149.method2390(local114, Static410.aShortArray79);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!ga;)V")
	public static void method4930(@OriginalArg(1) Class111 arg0) {
		Static50.aClass111_8 = arg0;
	}
}

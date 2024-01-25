import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "[S")
	public static short[] aShortArray8;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_7 = new Class46(22, 7);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)Lclient!rf;")
	public static Class4_Sub10 method327() {
		@Pc(13) Class4_Sub10 local13 = (Class4_Sub10) Static8.aClass99_7.method2044();
		if (local13 == null) {
			return new Class4_Sub10();
		} else {
			Static523.anInt9001--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method329(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static474.aClass66_2.anInt1685 : Static474.aClass66_2.anInt1681) + local19;
		for (@Pc(39) int local39 = local19; local39 < local29; local39++) {
			@Pc(46) Class5_Sub5_Sub13 local46 = Static474.aClass66_2.method1367(local39);
			if (local46.aBoolean422 && local46.method5174().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static385.aShortArray98 = null;
					Static521.anInt8974 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(80) short[] local80 = new short[local11.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local13; local82++) {
						local80[local82] = local11[local82];
					}
					local11 = local80;
				}
				local11[local13++] = (short) local39;
			}
		}
		Static385.aShortArray98 = local11;
		Static521.anInt8974 = local13;
		Static316.anInt5386 = 0;
		@Pc(123) String[] local123 = new String[Static521.anInt8974];
		for (@Pc(125) int local125 = 0; local125 < Static521.anInt8974; local125++) {
			local123[local125] = Static474.aClass66_2.method1367(local11[local125]).method5174();
		}
		Static352.method5259(local123, Static385.aShortArray98);
	}
}

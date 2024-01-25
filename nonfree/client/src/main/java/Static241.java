import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_52 = new Class171(75, 1);

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "S")
	public static short aShort44 = 32767;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_5 = new Class8();

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_53 = new Class171(33, 16);

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_54 = new Class171(38, -2);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method3663(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static116.aClass284_1.anInt7424 : Static116.aClass284_1.anInt7421) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(40) Class3_Sub5_Sub16 local40 = Static116.aClass284_1.method6224(local31);
			if (local40.aBoolean574 && local40.method6751().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static41.anInt867 = -1;
					Static413.aShortArray74 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(71) short[] local71 = new short[local11.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local13; local73++) {
						local71[local73] = local11[local73];
					}
					local11 = local71;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static413.aShortArray74 = local11;
		Static553.anInt8951 = 0;
		Static41.anInt867 = local13;
		@Pc(110) String[] local110 = new String[Static41.anInt867];
		for (@Pc(112) int local112 = 0; local112 < Static41.anInt867; local112++) {
			local110[local112] = Static116.aClass284_1.method6224(local11[local112]).method6751();
		}
		Static143.method2343(Static413.aShortArray74, local110);
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)I")
	public static int method3664() {
		if (Static438.aFrame1 == null) {
			return Static396.aBoolean454 ? 2 : 1;
		} else {
			return 3;
		}
	}
}

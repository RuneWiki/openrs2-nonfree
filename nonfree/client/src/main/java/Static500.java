import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_17 = new Class165(6, 1);

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "[I")
	public static final int[] anIntArray647 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method6898(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg1 ? Static283.aClass44_4.anInt875 : Static283.aClass44_4.anInt877);
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(40) Class6_Sub1_Sub2 local40 = Static283.aClass44_4.method690(local31);
			if (local40.aBoolean10 && local40.method199().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static7.anInt146 = -1;
					Static466.aShortArray135 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static527.anInt9003 = 0;
		Static466.aShortArray135 = local11;
		Static7.anInt146 = local13;
		@Pc(119) String[] local119 = new String[Static7.anInt146];
		for (@Pc(121) int local121 = 0; local121 < Static7.anInt146; local121++) {
			local119[local121] = Static283.aClass44_4.method690(local11[local121]).method199();
		}
		Static422.method6199(Static466.aShortArray135, local119);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	public static int anInt7172;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "Lclient!jd;")
	public static final Class129 aClass129_7 = new Class129("WTWIP", 3);

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
	public static final int anInt7174 = 328;

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
	public static int anInt7175 = -1;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5752(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = local24 + (arg1 ? Static230.aClass179_2.anInt4986 : Static230.aClass179_2.anInt4983);
		for (@Pc(36) int local36 = local24; local36 < local34; local36++) {
			@Pc(43) Class2_Sub1_Sub2 local43 = Static230.aClass179_2.method3930(local36);
			if (local43.aBoolean2 && local43.method45().toLowerCase().indexOf(local4) != -1) {
				if (local18 >= 50) {
					Static166.aShortArray44 = null;
					Static249.anInt4280 = -1;
					return;
				}
				if (local18 >= local16.length) {
					@Pc(75) short[] local75 = new short[local16.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local18; local77++) {
						local75[local77] = local16[local77];
					}
					local16 = local75;
				}
				local16[local18++] = (short) local36;
			}
		}
		Static249.anInt4280 = local18;
		Static166.aShortArray44 = local16;
		Static222.anInt3732 = 0;
		@Pc(110) String[] local110 = new String[Static249.anInt4280];
		for (@Pc(112) int local112 = 0; local112 < Static249.anInt4280; local112++) {
			local110[local112] = Static230.aClass179_2.method3930(local16[local112]).method45();
		}
		Static88.method3520(Static166.aShortArray44, local110);
	}
}

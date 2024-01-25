import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!wba", name = "s", descriptor = "Lclient!dn;")
	public static Class69 aClass69_97;

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Lclient!wba;")
	public static final Class313 aClass313_1 = new Class313(0, 3, Static517.aClass308_19);

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Lclient!wba;")
	public static final Class313 aClass313_2 = new Class313(1, 3, Static517.aClass308_19);

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "Lclient!wba;")
	public static final Class313 aClass313_3 = new Class313(2, 4, Static517.aClass308_15);

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "Lclient!wba;")
	public static final Class313 aClass313_4 = new Class313(3, 1, Static517.aClass308_19);

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "Lclient!wba;")
	public static final Class313 aClass313_5 = new Class313(4, 2, Static517.aClass308_19);

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Lclient!wba;")
	public static final Class313 aClass313_6 = new Class313(5, 3, Static517.aClass308_19);

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "Lclient!wba;")
	private static final Class313 aClass313_7 = new Class313(6, 4, Static517.aClass308_19);

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
	public static final int anInt9290 = Static509.method7779(16);

	@OriginalMember(owner = "client!wba", name = "r", descriptor = "[S")
	public static final short[] aShortArray149 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)[Lclient!wba;")
	public static Class313[] method8025() {
		return new Class313[] { aClass313_1, aClass313_2, aClass313_3, aClass313_4, aClass313_5, aClass313_6, aClass313_7 };
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)I")
	public static int method8026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static360.method5865(arg1 - 1, arg0 + -1) + Static360.method5865(arg1 - 1, arg0 + 1) + Static360.method5865(arg1 + 1, arg0 - 1) + Static360.method5865(arg1 - -1, arg0 - -1);
		@Pc(77) int local77 = Static360.method5865(arg1, arg0 - 1) + Static360.method5865(arg1, arg0 + 1) + Static360.method5865(arg1 - 1, arg0) + Static360.method5865(arg1 + 1, arg0);
		@Pc(82) int local82 = Static360.method5865(arg1, arg0);
		return local82 / 4 + local77 / 8 + local42 / 16;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZLjava/lang/String;)I")
	public static int method8028(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(91) int local91;
			if (local46 >= '0' && local46 <= '9') {
				local91 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local91 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local91 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local91) {
				throw new NumberFormatException();
			}
			if (local26) {
				local91 = -local91;
			}
			@Pc(124) int local124 = local30 * arg0 + local91;
			if (local124 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local30 = local124;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public static void method8029() {
		Static344.method5745();
		Static281.method4923(Static286.aClass1_Sub15_Sub1_1.aBoolean521);
		Static486.aClass15_2 = Static535.method3819(Static312.aCanvas12, 22050, 0, Static473.aClass229_14);
		Static486.aClass15_2.method3563(Static28.aClass1_Sub4_Sub4_1);
		Static51.aClass15_1 = Static535.method3819(Static312.aCanvas12, 2048, 1, Static473.aClass229_14);
		Static51.aClass15_1.method3563(Static475.aClass1_Sub4_Sub2_2);
	}
}

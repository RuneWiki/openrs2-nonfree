import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt7195;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_352 = new Class12(109, -1);

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_18 = new Class60(12, 16);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method5545(@OriginalArg(1) Class121 arg0) {
		arg0.pa(0, 0, Static403.anInt7142, 350);
		arg0.NA(0, 0, Static403.anInt7142, 350, Static114.anInt2194 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static55.anInt1027;
		@Pc(39) int local39;
		if (Static72.anInt1373 > 0) {
			local39 = 346 - Static55.anInt1027 - 4;
			@Pc(49) int local49 = local27 * local39 / (Static72.anInt1373 + local27 - 1);
			@Pc(51) int local51 = 4;
			if (Static72.anInt1373 > 1) {
				local51 = (local39 - local49) * (Static72.anInt1373 + -1 - Static214.anInt6453) / (Static72.anInt1373 - 1) + 4;
			}
			arg0.NA(Static403.anInt7142 - 16, local51, 12, local49, Static114.anInt2194 << 24 | 0x332277, 2);
			for (@Pc(89) int local89 = Static214.anInt6453; Static214.anInt6453 + local27 > local89 && local89 < Static72.anInt1373; local89++) {
				@Pc(98) String[] local98 = Static71.method1050('\b', Static71.aStringArray12[local89]);
				@Pc(107) int local107 = (Static403.anInt7142 - 8 - 16) / local98.length;
				for (@Pc(109) int local109 = 0; local109 < local98.length; local109++) {
					@Pc(118) int local118 = local109 * local107 + 8;
					arg0.pa(local118, 0, local118 + local107 - 8, 350);
					Static199.aClass4_4.method5839(-16777216, 350 - Static55.anInt1027 * (local89 - Static214.anInt6453) - Static64.aClass62_3.anInt1460 - Static283.anInt4764 - 2, -1, local118, local98[local109]);
				}
			}
		}
		arg0.pa(0, 0, Static403.anInt7142, 350);
		arg0.method4594(0, -1, Static403.anInt7142, 350 - Static283.anInt4764);
		Static237.aClass4_5.method5839(-16777216, 349 - Static126.aClass62_6.anInt1460, -1, 10, "--> " + Static138.aString88);
		local39 = -1;
		if (Static123.anInt2333 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method4583(local39, 12, Static126.aClass62_6.method1157("--> " + Static138.aString88.substring(0, Static379.anInt6817)) + 10, -Static126.aClass62_6.anInt1460 + -11 + 350);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!tn;B)Lclient!tn;")
	public static Class229 method5548(@OriginalArg(0) Class229 arg0) {
		if (arg0.anInt6882 != -1) {
			return Static203.method1670(arg0.anInt6882);
		}
		@Pc(29) int local29 = arg0.anInt6923 >>> 16;
		@Pc(34) Class7 local34 = new Class7(Static81.aClass51_5);
		for (@Pc(39) Class1_Sub38 local39 = (Class1_Sub38) local34.method180(); local39 != null; local39 = (Class1_Sub38) local34.method181()) {
			if (local29 == local39.anInt6527) {
				return Static203.method1670((int) local39.aLong237);
			}
		}
		return null;
	}
}

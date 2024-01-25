import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
	public static int anInt4110;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
	public static int anInt4111;

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "S")
	public static short aShort37 = 32767;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V")
	public static void method3491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class226 local28 = Static635.aClass226ArrayArrayArray3[local9][arg0][arg1] = Static635.aClass226ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class41 local33 = local28.aClass41_3; local33 != null; local33 = local33.aClass41_2) {
					@Pc(37) Class28_Sub1_Sub4 local37 = local33.aClass28_Sub1_Sub4_1;
					if (local37.aShort124 == arg0 && local37.aShort121 == arg1) {
						local37.aByte145--;
					}
				}
				if (local28.aClass28_Sub1_Sub2_1 != null) {
					local28.aClass28_Sub1_Sub2_1.aByte145--;
				}
				if (local28.aClass28_Sub1_Sub5_2 != null) {
					local28.aClass28_Sub1_Sub5_2.aByte145--;
				}
				if (local28.aClass28_Sub1_Sub5_1 != null) {
					local28.aClass28_Sub1_Sub5_1.aByte145--;
				}
				if (local28.aClass28_Sub1_Sub3_2 != null) {
					local28.aClass28_Sub1_Sub3_2.aByte145--;
				}
				if (local28.aClass28_Sub1_Sub3_1 != null) {
					local28.aClass28_Sub1_Sub3_1.aByte145--;
				}
			}
		}
		if (Static635.aClass226ArrayArrayArray3[0][arg0][arg1] == null) {
			Static635.aClass226ArrayArrayArray3[0][arg0][arg1] = new Class226(0);
			Static635.aClass226ArrayArrayArray3[0][arg0][arg1].aByte100 = 1;
		}
		Static635.aClass226ArrayArrayArray3[0][arg0][arg1].aClass226_1 = local7;
		Static635.aClass226ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method3492(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static64.aClass52_33.method907(Static544.anInt8937) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static64.aClass52_35.method907(Static544.anInt8937) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!km;)V")
	public static void method3493(@OriginalArg(1) Class5_Sub17 arg0) {
		if (arg0.aClass5_Sub42_6 != null) {
			arg0.aClass5_Sub42_6.anInt7020 = 0;
		}
		arg0.aBoolean675 = false;
		for (@Pc(20) Class5_Sub17 local20 = arg0.method6649(); local20 != null; local20 = arg0.method6652()) {
			method3493(local20);
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
	public static int method3494() {
		@Pc(5) Class65 local5 = Static208.aClass65_7;
		@Pc(7) boolean local7 = false;
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != 0) {
			@Pc(19) Canvas local19 = new Canvas();
			local19.setSize(100, 100);
			local7 = true;
			local5 = Static208.method3307(0, 0, local19, (Class390) null, (Interface4) null);
		}
		@Pc(36) long local36 = Static547.method7619();
		for (@Pc(38) int local38 = 0; local38 < 10000; local38++) {
			local5.method6915();
		}
		@Pc(67) int local67 = (int) (Static547.method7619() - local36);
		local5.method6900(0, 0, 100, -16777216, 100);
		if (local7) {
			local5.method6923();
		}
		return local67;
	}
}

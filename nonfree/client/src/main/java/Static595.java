import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	public static int anInt10186;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ei;)Ljava/lang/String;")
	public static String method8218(@OriginalArg(1) Class8_Sub5_Sub6 arg0) {
		return arg0.aString37 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8220(@OriginalArg(0) Class16 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static513.aBoolean642) {
			local7 = Static550.method8313();
			local9 = Static530.method7484();
		}
		arg0.KA(local7, local9, local7 + Static235.anInt5298, local9 + 350);
		arg0.aa(local7, local9, Static235.anInt5298, 350, Static258.anInt5553 << 24 | 0x332277, 1);
		Static460.method6945(local9, local9 + 350, local7, Static235.anInt5298 + local7);
		@Pc(53) int local53 = 350 / Static69.anInt7729;
		@Pc(62) int local62;
		if (Static183.anInt4304 > 0) {
			local62 = 342 - Static69.anInt7729;
			@Pc(73) int local73 = local53 * local62 / (local53 + Static183.anInt4304 - 1);
			@Pc(75) int local75 = 4;
			if (Static183.anInt4304 > 1) {
				local75 = (Static183.anInt4304 - Static150.anInt3709 - 1) * (-local73 + local62) / (Static183.anInt4304 - 1) + 4;
			}
			arg0.aa(Static235.anInt5298 + local7 - 16, local9 + local75, 12, local73, Static258.anInt5553 << 24 | 0x332277, 2);
			for (@Pc(115) int local115 = Static150.anInt3709; local115 < local53 + Static150.anInt3709 && local115 < Static183.anInt4304; local115++) {
				@Pc(124) String[] local124 = Static403.method6410(Static281.aStringArray16[local115], '\b');
				@Pc(133) int local133 = (Static235.anInt5298 - 8 - 16) / local124.length;
				for (@Pc(135) int local135 = 0; local135 < local124.length; local135++) {
					@Pc(143) int local143 = local135 * local133 + 8;
					arg0.KA(local7 + local143, local9, local133 + local7 + local143 - 8, local9 + 350);
					Static634.aClass27_19.method6993(local143 + local7, -16777216, -Static446.aClass345_13.anInt10003 + 350 + local9 + -Static438.anInt8227 + -2 + -(Static69.anInt7729 * (local115 + -Static150.anInt3709)), -1, Static565.method3490(local124[local135]));
				}
			}
		}
		Static87.aClass27_21.method6992(-1, "Build: 632", local9 + 330, -16777216, -25 + local7 + Static235.anInt5298);
		arg0.KA(local7, local9, Static235.anInt5298 + local7, local9 + 350);
		arg0.method6089(Static235.anInt5298, local7, local9 + 350 - Static438.anInt8227, -1);
		Static206.aClass27_20.method6993(local7 + 10, -16777216, -Static469.aClass345_15.anInt10003 + 350 + local9 + -1, -1, "--> " + Static565.method3490(Static378.aString72));
		if (!Static216.aBoolean372) {
			return;
		}
		local62 = -1;
		if (Static435.anInt8192 % 30 > 15) {
			local62 = 16777215;
		}
		arg0.method6116(Static469.aClass345_15.method8112("--> " + Static565.method3490(Static378.aString72).substring(0, Static419.anInt7930)) + local7 + 10, local9 + 350 - (Static469.aClass345_15.anInt10003 - -11), local62, 12);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "F")
	public static float aFloat140;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread4;

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
	public static int anInt4728;

	@OriginalMember(owner = "client!lw", name = "D", descriptor = "S")
	public static short aShort59 = 32767;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!r;)V")
	public static void method4151(@OriginalArg(1) Class44 arg0) {
		if (Static567.aBoolean701) {
			Static100.method2189(arg0);
		} else {
			Static136.method2698(arg0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method4152(@OriginalArg(0) Class44 arg0) {
		arg0.da(0, 0, Static554.anInt9828, 350);
		arg0.J(0, 0, Static554.anInt9828, 350, Static136.anInt2909 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static40.anInt544;
		@Pc(38) int local38;
		if (Static295.anInt10019 > 0) {
			local38 = 346 - Static40.anInt544 - 4;
			@Pc(48) int local48 = local38 * local27 / (Static295.anInt10019 + local27 - 1);
			@Pc(50) int local50 = 4;
			if (Static295.anInt10019 > 1) {
				local50 = (local38 - local48) * (Static295.anInt10019 + -1 - Static282.anInt4641) / (Static295.anInt10019 - 1) + 4;
			}
			arg0.J(Static554.anInt9828 - 16, local50, 12, local48, Static136.anInt2909 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static282.anInt4641; Static282.anInt4641 + local27 > local86 && Static295.anInt10019 > local86; local86++) {
				@Pc(95) String[] local95 = Static175.method3185('\b', Static573.aStringArray70[local86]);
				@Pc(104) int local104 = (Static554.anInt9828 - 8 - 16) / local95.length;
				for (@Pc(106) int local106 = 0; local106 < local95.length; local106++) {
					@Pc(114) int local114 = local106 * local104 + 8;
					arg0.da(local114, 0, local114 + local104 - 8, 350);
					Static272.aClass58_5.method8156(-16777216, -1, Static235.method3777(local95[local106]), 350 - (local86 - Static282.anInt4641) * Static40.anInt544 - Static238.aClass114_9.anInt3291 - Static203.anInt3845 - 2, local114);
				}
			}
		}
		Static454.aClass58_13.method8162(Static554.anInt9828 - 25, -1, 330, -16777216, "Build: 623");
		arg0.da(0, 0, Static554.anInt9828, 350);
		arg0.method4974(Static554.anInt9828, -1, 350 - Static203.anInt3845, 0);
		Static552.aClass58_14.method8156(-16777216, -1, "--> " + Static235.method3777(Static41.aString3), 349 - Static314.aClass114_11.anInt3291, 10);
		if (!Static450.aBoolean600) {
			return;
		}
		local38 = -1;
		if (Static106.anInt2418 % 30 > 15) {
			local38 = 16777215;
		}
		arg0.method5021(Static314.aClass114_11.method2950("--> " + Static235.method3777(Static41.aString3).substring(0, Static463.anInt7202)) + 10, 12, local38, 350 - Static314.aClass114_11.anInt3291 - 11);
	}
}

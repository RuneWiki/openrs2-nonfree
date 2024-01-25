import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	public static int anInt9179;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt9180;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public static int anInt9183;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public static int anInt9181 = 0;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray15 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZZ)V")
	public static void method7477(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static432.anInt8124--;
			if (Static432.anInt8124 == 0) {
				Static579.anIntArray543 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static510.anInt3070--;
		if (Static510.anInt3070 == 0) {
			Static15.anIntArray11 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public static void method7478() {
		for (@Pc(3) int local3 = 0; local3 < Static459.anInt8551; local3++) {
			@Pc(9) Class281 local9 = Static104.aClass281Array1[local3];
			if (local9.aByte85 == 3) {
				if (local9.aClass4_Sub7_Sub4_3 == null) {
					local9.anInt8202 = Integer.MIN_VALUE;
				} else {
					Static444.aClass4_Sub7_Sub1_2.method400(local9.aClass4_Sub7_Sub4_3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)I")
	public static int method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(26) int local26 = 65536 - Class4_Sub27.anIntArray297[arg0 * 8192 / arg3] >> 1;
		return (local26 * arg1 >> 16) + (arg2 * (65536 - local26) >> 16);
	}
}

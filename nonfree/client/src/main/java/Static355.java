import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mha", name = "u", descriptor = "Lclient!nd;")
	public static Class238 aClass238_163;

	@OriginalMember(owner = "client!mha", name = "w", descriptor = "Lclient!nd;")
	public static Class238 aClass238_164;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "Lclient!on;")
	public static Class261 aClass261_1 = new Class261(8);

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "[[S")
	private static final short[][] aShortArrayArray6 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "[[S")
	private static final short[][] aShortArrayArray7 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "[[S")
	private static final short[][] aShortArrayArray8 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mha", name = "k", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray2 = new short[][][] { aShortArrayArray6, aShortArrayArray7, aShortArrayArray8 };

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(III)B")
	public static byte method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5321(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local6 + local8);
		for (@Pc(42) int local42 = 0; local42 < local6; local42++) {
			@Pc(47) char local47 = arg0.charAt(local42);
			if (local47 == '<') {
				local40.append("<lt>");
			} else if (local47 == '>') {
				local40.append("<gt>");
			} else {
				local40.append(local47);
			}
		}
		return local40.toString();
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "()V")
	public static void method5323() {
		for (@Pc(1) int local1 = Static151.anInt3097; local1 < Static395.anInt6810; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static595.anInt9881; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static389.anInt6693; local7++) {
					@Pc(16) Class84 local16 = Static348.aClass84ArrayArrayArray5[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class16_Sub1_Sub2 local21 = local16.aClass16_Sub1_Sub2_1;
						@Pc(24) Class16_Sub1_Sub2 local24 = local16.aClass16_Sub1_Sub2_2;
						if (local21 != null && local21.method6976()) {
							Static28.method8896(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method6976()) {
								Static28.method8896(local24, local1, local4, local7, 1, 1);
								local24.method6984(0, local21, Static380.aClass13_86, false, 0, 0);
								local24.method6987();
							}
							local21.method6987();
						}
						for (@Pc(68) Class333 local68 = local16.aClass333_1; local68 != null; local68 = local68.aClass333_3) {
							@Pc(72) Class16_Sub1_Sub1 local72 = local68.aClass16_Sub1_Sub1_1;
							if (local72 != null && local72.method6976()) {
								Static28.method8896(local72, local1, local4, local7, local72.aShort104 + 1 - local72.aShort103, local72.aShort105 - local72.aShort106 + 1);
								local72.method6987();
							}
						}
						@Pc(108) Class16_Sub1_Sub3 local108 = local16.aClass16_Sub1_Sub3_1;
						if (local108 != null && local108.method6976()) {
							Static385.method5687(local108, local1, local4, local7);
							local108.method6987();
						}
					}
				}
			}
		}
	}
}

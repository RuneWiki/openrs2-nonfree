import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lclient!gba;")
	public static Class125 aClass125_13;

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "[[S")
	private static final short[][] aShortArrayArray33 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "[[S")
	private static final short[][] aShortArrayArray34 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "[[S")
	private static final short[][] aShortArrayArray35 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray9 = new short[][][] { aShortArrayArray33, aShortArrayArray34, aShortArrayArray35 };

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
	public static int anInt10180 = 2;

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "[Lclient!eca;")
	public static final Class2_Sub5_Sub5[] aClass2_Sub5_Sub5Array9 = new Class2_Sub5_Sub5[14];

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!eq;III)Lclient!sha;")
	public static Class2_Sub5_Sub19 method8506(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub34 local12 = new Class2_Sub34(arg0.method2545(arg2, arg1));
		@Pc(45) Class2_Sub5_Sub19 local45 = new Class2_Sub5_Sub19(arg2, local12.method6903(), local12.method6903(), local12.method6865(), local12.method6865(), local12.method6904() == 1, local12.method6904(), local12.method6904());
		@Pc(51) int local51 = local12.method6904();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local45.aClass238_60.method5837(new Class2_Sub47(local12.method6904(), local12.method6884(), local12.method6884(), local12.method6884(), local12.method6884(), local12.method6884(), local12.method6884(), local12.method6884(), local12.method6884()));
		}
		local45.method7277();
		return local45;
	}
}

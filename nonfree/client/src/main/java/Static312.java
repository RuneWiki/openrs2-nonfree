import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
	public static int anInt5631;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
	public static final boolean aBoolean423 = false;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_3 = new Class118();

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
	public static final int[] anIntArray288 = new int[4096];

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_61 = new Class341(17, 3);

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public static int anInt5632 = 0;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	public static final int anInt5633 = 1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method5100() {
		Static424.aClass266_4.method7111();
		Static81.aClass359_2.method9052();
		Static42.aClass96_2.method2465();
		Static251.aClass328_1.method8262();
		Static522.aClass272_2.method7196();
		Static372.aClass343_1.method8547();
		Static354.aClass40_2.method1126();
		Static391.aClass319_1.method8040();
		Static395.aClass140_1.method4038();
		Static288.aClass187_1.method4896();
		Static87.aClass184_1.method4781();
		Static665.aClass267_2.method7158();
		Static157.aClass353_1.method8901();
		Static350.aClass5_3.method92();
		Static274.aClass392_1.method9733();
		Static142.aClass367_1.method9245();
		Static462.aClass299_1.method7745();
		Static6.aClass176_1.method4649();
		Static294.aClass378_1.method9481();
		Static372.aClass165_2.method4437();
		Static300.aClass197_5.method5093();
		Static226.aClass102_1.method3165();
		Static228.method4166();
		Static498.method7842();
		Static642.method9493();
		Static141.method2460();
		Static452.method7286();
		Static603.aClass22_63.method473();
		Static433.aClass22_38.method473();
		Static317.aClass22_35.method473();
		Static388.aClass22_34.method473();
		Static518.aClass22_45.method473();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)I")
	public static int method5101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg2 : arg3;
		@Pc(40) int local40 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg2 : arg1;
		return ((local7 & 0x2) == 0 ? local40 : -local40) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BB)I")
	public static int method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg0; local12++) {
			local5 = Class80.anIntArray115[(arg2[local12] ^ local5) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	public static void method5103() {
		Static230.aClass59_3 = null;
		Static277.aClass71Array48 = null;
		Static533.aClass71Array36 = null;
		Static253.aClass59_5 = null;
		Static591.aClass71Array40 = null;
		Static310.aClass71_10 = null;
		Static514.aClass59_13 = null;
		Static385.aClass71Array31 = null;
		Static249.aClass71Array24 = null;
		Static200.aClass71Array21 = null;
		Static638.aClass71Array44 = null;
		Class15_Sub3_Sub4_Sub2.lb = null;
		Static14.aClass71Array35 = null;
		Static622.aClass71Array42 = null;
		Static58.aClass71_3 = null;
		Static665.aClass71Array46 = null;
		Static668.aClass71Array47 = null;
		Static386.aClass71Array32 = null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public static void method5104(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static193.aClass291ArrayArrayArray2 = Static46.aClass291ArrayArrayArray1;
			Static245.aClass18Array14 = Static93.aClass18Array33;
		} else {
			Static193.aClass291ArrayArrayArray2 = Static242.aClass291ArrayArrayArray3;
			Static245.aClass18Array14 = Static549.aClass18Array30;
		}
		Static60.anInt1169 = Static193.aClass291ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	public static void method5105() {
		@Pc(12) Class2_Sub52 local12 = Static311.method5098(Static466.aClass341_81, Static125.aClass179_1);
		local12.aClass2_Sub8_Sub2_2.method5192(Static432.anInt7901);
		Static38.method791(local12);
	}
}

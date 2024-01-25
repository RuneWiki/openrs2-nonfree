import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
	public static int anInt6760;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_222 = new Class189("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_104 = new Class217(3, 7);

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public static int anInt6761 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIFZIII)[[I")
	public static int[][] method5287(@OriginalArg(4) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class3_Sub2_Sub28 local11 = new Class3_Sub2_Sub28();
		local11.anInt5945 = (int) (arg0 * 4096.0F);
		local11.anInt5937 = 4;
		local11.anInt5941 = 3;
		local11.anInt5942 = 8;
		local11.aBoolean514 = false;
		local11.method5898();
		Static44.method5688(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local11.method4643(local40, local7[local40]);
		}
		return local7;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public static void method5288(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static393.method5080(arg0, 9);
		local12.method3244();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5289(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) String local6 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg1 ? 32768 : 0;
		@Pc(28) int local28 = local17 + (arg1 ? Static104.aClass262_1.anInt7398 : Static104.aClass262_1.anInt7399);
		for (@Pc(30) int local30 = local17; local30 < local28; local30++) {
			@Pc(36) Class3_Sub4_Sub15 local36 = Static104.aClass262_1.method5748(local30);
			if (local36.aBoolean576 && local36.method5181().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static36.anInt1022 = -1;
					Static226.aShortArray66 = null;
					return;
				}
				if (local9.length <= local11) {
					@Pc(71) short[] local71 = new short[local9.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local11; local73++) {
						local71[local73] = local9[local73];
					}
					local9 = local71;
				}
				local9[local11++] = (short) local30;
			}
		}
		Static226.aShortArray66 = local9;
		Static390.anInt6521 = 0;
		Static36.anInt1022 = local11;
		@Pc(109) String[] local109 = new String[Static36.anInt1022];
		for (@Pc(111) int local111 = 0; local111 < Static36.anInt1022; local111++) {
			local109[local111] = Static104.aClass262_1.method5748(local9[local111]).method5181();
		}
		Static91.method1682(Static226.aShortArray66, local109);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZI)V")
	public static void method5290(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static231.anInt4308--;
			if (Static231.anInt4308 == 0) {
				Static135.anIntArray174 = null;
			}
		}
		if (arg1) {
			Static164.anInt3376--;
			if (Static164.anInt3376 == 0) {
				Static300.anIntArray364 = null;
			}
		}
	}
}

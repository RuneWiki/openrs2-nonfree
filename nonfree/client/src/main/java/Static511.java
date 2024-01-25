import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "F")
	public static float aFloat237;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!vg;")
	public static Class349 aClass349_152;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!mv;III)Lclient!ida;")
	public static Class2_Sub2_Sub9 method7269(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class2_Sub7 local14 = new Class2_Sub7(arg0.method4980(arg1, arg2));
		@Pc(49) Class2_Sub2_Sub9 local49 = new Class2_Sub2_Sub9(arg2, local14.method4494(), local14.method4494(), local14.method4509(), local14.method4509(), local14.method4464() == 1, local14.method4464(), local14.method4464());
		@Pc(53) int local53 = local14.method4464();
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local49.aClass70_20.method1269(new Class2_Sub26(local14.method4464(), local14.method4518(), local14.method4518(), local14.method4518(), local14.method4518(), local14.method4518(), local14.method4518(), local14.method4518(), local14.method4518()));
		}
		local49.method2728();
		return local49;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public static boolean method7272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static172.method2259(arg1, arg0) | Static228.method2765(arg0, arg1) | Static200.method2514(arg1, arg0)) & Static449.method5855(arg1, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)I")
	public static int method7273(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local31 | local31 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)[Lclient!sg;")
	public static Class311[] method7279() {
		if (Static329.aClass311Array1 == null) {
			@Pc(16) Class311[] local16 = Static378.method5262(Static169.aClass99_2);
			@Pc(20) Class311[] local20 = new Class311[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static257.aClass2_Sub35_Sub1_1.method6051(Static226.anInt3318);
			@Pc(89) int local89;
			@Pc(95) Class311 local95;
			label70: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class311 local35 = local16[local29];
				if ((local35.anInt7734 <= 0 || local35.anInt7734 >= 24) && local35.anInt7735 >= 800 && local35.anInt7736 >= 600 && (local27 != 2 || local35.anInt7735 <= 800 && local35.anInt7736 <= 600) && (local27 != 1 || local35.anInt7735 <= 1024 && local35.anInt7736 <= 768)) {
					for (local89 = 0; local89 < local22; local89++) {
						local95 = local20[local89];
						if (local95.anInt7735 == local35.anInt7735 && local35.anInt7736 == local95.anInt7736) {
							if (local35.anInt7734 > local95.anInt7734) {
								local20[local89] = local35;
							}
							continue label70;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static329.aClass311Array1 = new Class311[local22];
			Static598.method4266(local20, 0, Static329.aClass311Array1, 0, local22);
			@Pc(155) int[] local155 = new int[Static329.aClass311Array1.length];
			for (local89 = 0; local89 < Static329.aClass311Array1.length; local89++) {
				local95 = Static329.aClass311Array1[local89];
				local155[local89] = local95.anInt7736 * local95.anInt7735;
			}
			Static509.method6609(Static329.aClass311Array1, local155);
		}
		return Static329.aClass311Array1;
	}
}

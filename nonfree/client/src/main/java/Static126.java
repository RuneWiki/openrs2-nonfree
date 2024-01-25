import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!da;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Lclient!ef;")
	public static Class2_Sub7_Sub3 aClass2_Sub7_Sub3_1;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
	public static boolean aBoolean214;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "[I")
	public static final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BFFIF)F")
	public static float method2266(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(15) float[] local15 = Static648.aFloatArrayArray18[arg2];
		return arg0 * local15[2] + arg1 * local15[1] + local15[0] * arg3;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2267(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(6) String local6 = arg1.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = local17 + (arg0 ? Static327.aClass344_1.anInt9354 : Static327.aClass344_1.anInt9352);
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(35) Class2_Sub7_Sub16 local35 = Static327.aClass344_1.method7949(local29);
			if (local35.aBoolean538 && local35.method6601().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static336.anInt5883 = -1;
					Static155.aShortArray48 = null;
					return;
				}
				if (local11 >= local9.length) {
					@Pc(64) short[] local64 = new short[local9.length * 2];
					for (@Pc(66) int local66 = 0; local66 < local11; local66++) {
						local64[local66] = local9[local66];
					}
					local9 = local64;
				}
				local9[local11++] = (short) local29;
			}
		}
		Static336.anInt5883 = local11;
		Static588.anInt9782 = 0;
		Static155.aShortArray48 = local9;
		@Pc(102) String[] local102 = new String[Static336.anInt5883];
		for (@Pc(104) int local104 = 0; local104 < Static336.anInt5883; local104++) {
			local102[local104] = Static327.aClass344_1.method7949(local9[local104]).method6601();
		}
		Static240.method8286(local102, Static155.aShortArray48);
	}
}

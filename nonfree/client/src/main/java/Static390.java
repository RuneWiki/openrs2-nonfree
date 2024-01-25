import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_37 = new Class220(11, 0, 1, 2);

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_228 = new Class103(38, 7);

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIII)V")
	public static void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 + 1;
		Static2.method38(arg3, arg0, Static67.anIntArrayArray13[arg2], arg4);
		@Pc(18) int local18 = arg1 - 1;
		Static2.method38(arg3, arg0, Static67.anIntArrayArray13[arg1], arg4);
		for (@Pc(23) int local23 = local9; local23 <= local18; local23++) {
			@Pc(31) int[] local31 = Static67.anIntArrayArray13[local23];
			local31[arg4] = local31[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method5103() {
		Static25.aClass102_4.method2260();
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public static void method5105() {
		Static226.anInt4010 = 0;
		@Pc(11) int local11 = Static336.aClass1_Sub28_Sub1_2.method5375();
		@Pc(15) int local15 = Static336.aClass1_Sub28_Sub1_2.method5396();
		@Pc(24) boolean local24 = Static336.aClass1_Sub28_Sub1_2.method5363() == 1;
		@Pc(28) int local28 = Static336.aClass1_Sub28_Sub1_2.method5336();
		Static392.method5127(local15);
		@Pc(39) int local39 = (Static245.anInt4432 - Static336.aClass1_Sub28_Sub1_2.anInt6812) / 16;
		Static337.anIntArrayArray50 = new int[local39][4];
		@Pc(49) int local49;
		for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
			for (local49 = 0; local49 < 4; local49++) {
				Static337.anIntArrayArray50[local45][local49] = Static336.aClass1_Sub28_Sub1_2.method5355();
			}
		}
		Static354.anIntArray417 = new int[local39];
		Static248.anIntArray298 = new int[local39];
		Static266.aByteArrayArray18 = new byte[local39][];
		Static208.anIntArray226 = null;
		Static151.aByteArrayArray9 = null;
		Static407.aByteArrayArray29 = new byte[local39][];
		Static118.anIntArray145 = new int[local39];
		Static163.aByteArrayArray24 = new byte[local39][];
		Static139.anIntArray166 = new int[local39];
		Static385.anIntArray429 = new int[local39];
		Static333.aByteArrayArray22 = new byte[local39][];
		local39 = 0;
		for (local49 = (local11 - (Static296.anInt5187 >> 4)) / 8; local49 <= (local11 + (Static296.anInt5187 >> 4)) / 8; local49++) {
			for (@Pc(125) int local125 = (local28 - (Static206.anInt3607 >> 4)) / 8; local125 <= (local28 + (Static206.anInt3607 >> 4)) / 8; local125++) {
				Static248.anIntArray298[local39] = (local49 << 8) + local125;
				Static139.anIntArray166[local39] = Static206.aClass82_50.method1835("m" + local49 + "_" + local125);
				Static118.anIntArray145[local39] = Static206.aClass82_50.method1835("l" + local49 + "_" + local125);
				Static354.anIntArray417[local39] = Static206.aClass82_50.method1835("um" + local49 + "_" + local125);
				Static385.anIntArray429[local39] = Static206.aClass82_50.method1835("ul" + local49 + "_" + local125);
				local39++;
			}
		}
		Static56.method981(10, local11, local24, local28);
	}
}

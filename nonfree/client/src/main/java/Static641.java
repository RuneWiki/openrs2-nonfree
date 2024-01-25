import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_10 = new Class138(2, 2);

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "[S")
	private static final short[] aShortArray152 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "[S")
	private static final short[] aShortArray154 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "[S")
	private static final short[] aShortArray153 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray19 = new short[][] { aShortArray152, aShortArray154, aShortArray153 };

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[BIIII[BIB)V")
	public static void method8620(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg6[local31] = (byte) (arg6[local31] - arg1[arg0++]);
				@Pc(44) int local44 = arg5++;
				arg6[local44] = (byte) (arg6[local44] - arg1[arg0++]);
				@Pc(57) int local57 = arg5++;
				arg6[local57] = (byte) (arg6[local57] - arg1[arg0++]);
				@Pc(70) int local70 = arg5++;
				arg6[local70] = (byte) (arg6[local70] - arg1[arg0++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg5++;
				arg6[local31] = (byte) (arg6[local31] - arg1[arg0++]);
			}
			arg0 += arg7;
			arg5 += arg2;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;IBZLjava/lang/String;)V")
	public static void method8621(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class8_Sub31 local6 = Static409.method6472();
		local6.aClass8_Sub8_Sub2_1.method8562(Static125.aClass306_37.anInt8954);
		local6.aClass8_Sub8_Sub2_1.method8548(0);
		@Pc(25) int local25 = local6.aClass8_Sub8_Sub2_1.anInt10588;
		local6.aClass8_Sub8_Sub2_1.method8548(632);
		@Pc(34) int[] local34 = Static444.method6825(local6);
		@Pc(38) int local38 = local6.aClass8_Sub8_Sub2_1.anInt10588;
		local6.aClass8_Sub8_Sub2_1.method8582(arg3);
		local6.aClass8_Sub8_Sub2_1.method8548(Static60.anInt1930);
		local6.aClass8_Sub8_Sub2_1.method8582(arg0);
		local6.aClass8_Sub8_Sub2_1.method8564(Static161.aLong101);
		local6.aClass8_Sub8_Sub2_1.method8562(Static372.anInt7083);
		local6.aClass8_Sub8_Sub2_1.method8562(Static18.aClass217_1.anInt6835);
		Static495.method1945(local6.aClass8_Sub8_Sub2_1);
		@Pc(79) String local79 = Static600.aString110;
		local6.aClass8_Sub8_Sub2_1.method8562(local79 == null ? 0 : 1);
		if (local79 != null) {
			local6.aClass8_Sub8_Sub2_1.method8582(local79);
		}
		local6.aClass8_Sub8_Sub2_1.method8562(arg1);
		local6.aClass8_Sub8_Sub2_1.method8562(arg2 ? 1 : 0);
		local6.aClass8_Sub8_Sub2_1.anInt10588 += 7;
		local6.aClass8_Sub8_Sub2_1.method8559(local38, local34, local6.aClass8_Sub8_Sub2_1.anInt10588);
		local6.aClass8_Sub8_Sub2_1.method8533(local6.aClass8_Sub8_Sub2_1.anInt10588 - local25);
		Static262.method4604(local6);
		Static98.anInt2635 = -3;
		Static122.anInt3286 = 0;
		Static354.anInt6822 = 1;
		Static244.anInt5399 = 0;
		if (arg1 < 13) {
			Static69.aBoolean557 = true;
			Static436.method6740();
		}
	}
}

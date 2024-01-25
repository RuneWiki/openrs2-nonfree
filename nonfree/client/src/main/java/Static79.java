import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	public static int anInt1238;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "[I")
	public static final int[] anIntArray84 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "J")
	public static volatile long aLong63 = 0L;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	public static void method1031() {
		Static231.anInt4426 = 0;
		@Pc(15) Class3_Sub28_Sub2 local15 = Static532.aClass400_3.aClass3_Sub28_Sub2_2;
		@Pc(19) int local19 = local15.method5322(-63);
		@Pc(31) boolean local31 = local15.method5308() == 1;
		@Pc(35) int local35 = local15.method5305();
		@Pc(39) int local39 = local15.method5305();
		Static235.method3668();
		Static58.method725(local19, -121);
		@Pc(53) int local53 = (Static532.aClass400_3.anInt11061 - local15.anInt6241) / 16;
		Static101.anIntArrayArray10 = new int[local53][4];
		@Pc(63) int local63;
		for (@Pc(59) int local59 = 0; local59 < local53; local59++) {
			for (local63 = 0; local63 < 4; local63++) {
				Static101.anIntArrayArray10[local59][local63] = local15.method5312();
			}
		}
		Static551.aByteArrayArray18 = null;
		Static74.aByteArrayArray2 = new byte[local53][];
		Static718.anIntArray638 = new int[local53];
		Static423.aByteArrayArray9 = new byte[local53][];
		Static423.anIntArray399 = null;
		Static504.anIntArray469 = new int[local53];
		Static257.aByteArrayArray8 = new byte[local53][];
		Static46.anIntArray54 = new int[local53];
		Static484.aByteArrayArray13 = new byte[local53][];
		Static83.anIntArray86 = new int[local53];
		Static23.anIntArray13 = new int[local53];
		local53 = 0;
		for (local63 = (local39 - (Static362.anInt8653 >> 4)) / 8; local63 <= (local39 + (Static362.anInt8653 >> 4)) / 8; local63++) {
			for (@Pc(151) int local151 = (local35 - (Static206.anInt11291 >> 1301241540)) / 8; local151 <= (local35 + (Static206.anInt11291 >> 4)) / 8; local151++) {
				Static46.anIntArray54[local53] = (local63 << 8) + local151;
				Static718.anIntArray638[local53] = Static397.aClass221_113.method5096("m" + local63 + "_" + local151);
				Static504.anIntArray469[local53] = Static397.aClass221_113.method5096("l" + local63 + "_" + local151);
				Static23.anIntArray13[local53] = Static397.aClass221_113.method5096("um" + local63 + "_" + local151);
				Static83.anIntArray86[local53] = Static397.aClass221_113.method5096("ul" + local63 + "_" + local151);
				local53++;
			}
		}
		Static524.method7459(local35, local31, local39, 12);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method1032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) byte[] local9;
		if (arg0 <= 0) {
			local9 = arg2;
		} else {
			local9 = new byte[arg1];
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				local9[local16] = arg2[arg0 + local16];
			}
		}
		@Pc(40) Class257 local40 = new Class257();
		local40.method6294();
		local40.method6290(local9, (long) (arg1 * 8));
		@Pc(54) byte[] local54 = new byte[64];
		local40.method6292(local54);
		return local54;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z")
	public static boolean method1033() {
		if (Static424.aClass3_Sub4_Sub5_3 == null) {
			return false;
		} else {
			if (Static424.aClass3_Sub4_Sub5_3.anInt2775 >= 2000) {
				Static424.aClass3_Sub4_Sub5_3.anInt2775 -= 2000;
			}
			return Static424.aClass3_Sub4_Sub5_3.anInt2775 == 1007;
		}
	}
}

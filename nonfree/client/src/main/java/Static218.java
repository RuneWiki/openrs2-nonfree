import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!r;")
	public static Class197 aClass197_47;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ml;IILclient!bt;)V", line = 22)
	public static void method3340(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub4 arg2) {
		@Pc(9) Class2_Sub42 local9 = new Class2_Sub42();
		local9.anInt7141 = arg2.method4816();
		local9.anInt7143 = arg2.method4837();
		local9.anIntArray491 = new int[local9.anInt7141];
		local9.anIntArray493 = new int[local9.anInt7141];
		local9.aClass32Array1 = new Class32[local9.anInt7141];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt7141][][];
		local9.anIntArray492 = new int[local9.anInt7141];
		local9.aClass32Array2 = new Class32[local9.anInt7141];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt7141; local56++) {
			try {
				@Pc(62) int local62 = arg2.method4816();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local78 = arg2.method4810();
					local82 = arg2.method4810();
					local84 = 0;
					if (local62 == 1) {
						local84 = arg2.method4837();
					}
					local9.anIntArray493[local56] = local62;
					local9.anIntArray492[local56] = local84;
					local9.aClass32Array1[local56] = arg0.method3763(Static17.method4213(local78), local82);
				} else if (local62 == 3 || local62 == 4) {
					local78 = arg2.method4810();
					local82 = arg2.method4810();
					local84 = arg2.method4816();
					@Pc(139) String[] local139 = new String[local84];
					for (@Pc(141) int local141 = 0; local141 < local84; local141++) {
						local139[local141] = arg2.method4810();
					}
					@Pc(156) byte[][] local156 = new byte[local84][];
					@Pc(167) int local167;
					if (local62 == 3) {
						for (@Pc(161) int local161 = 0; local161 < local84; local161++) {
							local167 = arg2.method4837();
							local156[local161] = new byte[local167];
							arg2.method4800(local156[local161], local167);
						}
					}
					local9.anIntArray493[local56] = local62;
					@Pc(192) Class[] local192 = new Class[local84];
					for (local167 = 0; local167 < local84; local167++) {
						local192[local167] = Static17.method4213(local139[local167]);
					}
					local9.aClass32Array2[local56] = arg0.method3749(Static17.method4213(local78), local82, local192);
					local9.aByteArrayArrayArray17[local56] = local156;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.anIntArray491[local56] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.anIntArray491[local56] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.anIntArray491[local56] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.anIntArray491[local56] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.anIntArray491[local56] = -5;
			}
		}
		Class223.aClass135_37.method3541(local9);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)Z", line = 138)
	public static boolean method3341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static12.method283(arg1, arg0, arg2);
		@Pc(19) boolean local19 = true;
		if (local9 != null) {
			local19 = Static283.method5253(local9) & true;
		}
		local9 = (Interface6) Static98.method2209(arg1, arg0, arg2, id.class);
		if (local9 != null) {
			local19 &= Static283.method5253(local9);
		}
		local9 = (Interface6) Static25.method865(arg1, arg0, arg2);
		if (local9 != null) {
			local19 &= Static283.method5253(local9);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z", line = 164)
	public static boolean method3342() {
		try {
			return Static69.method1823();
		} catch (@Pc(16) IOException local16) {
			Static197.method3726();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(81) String local81 = "T2 - " + (Class12_Sub4.aClass89_164 == null ? -1 : Class12_Sub4.aClass89_164.method2401()) + "," + (Static62.aClass89_57 == null ? -1 : Static62.aClass89_57.method2401()) + "," + (Static37.aClass89_35 == null ? -1 : Static37.aClass89_35.method2401()) + " - " + Class61.anInt1834 + "," + (Static154.anInt3136 + Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0]) + "," + (Static139.anInt2716 + Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0]) + " - ";
			for (@Pc(83) int local83 = 0; local83 < Class61.anInt1834 && local83 < 50; local83++) {
				local81 = local81 + Class150.aClass2_Sub4_Sub2_3.aByteArray73[local83] + ",";
			}
			Static241.method6254(local21, local81);
			Static92.method2146();
			return true;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)I", line = 215)
	public static int method3345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}

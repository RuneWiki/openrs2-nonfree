import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!ta;")
	public static Class162 aClass162_4 = new Class162(64);

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	public static int anInt3068 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method2267() {
		Static174.aClass89_44.method2266();
		Static214.aClass89_32.method2266();
		Static256.aClass89_40.method2266();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!qm;Lclient!na;)V")
	public static void method2269(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) Class112 arg2) {
		@Pc(9) Class1_Sub29 local9 = new Class1_Sub29();
		local9.anInt5864 = arg1.method2199();
		local9.anInt5862 = arg1.method2194();
		local9.anIntArray526 = new int[local9.anInt5864];
		local9.anIntArray528 = new int[local9.anInt5864];
		local9.aClass47Array1 = new Class47[local9.anInt5864];
		local9.aClass47Array2 = new Class47[local9.anInt5864];
		local9.aByteArrayArrayArray18 = new byte[local9.anInt5864][][];
		local9.anIntArray527 = new int[local9.anInt5864];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt5864; local56++) {
			try {
				@Pc(68) int local68 = arg1.method2199();
				@Pc(91) String local91;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local68 == 0 || local68 == 1 || local68 == 2) {
					local91 = arg1.method2237();
					local95 = arg1.method2237();
					local99 = 0;
					if (local68 == 1) {
						local99 = arg1.method2194();
					}
					local9.anIntArray526[local56] = local68;
					local9.anIntArray528[local56] = local99;
					local9.aClass47Array2[local56] = arg2.method2884(Static24.method511(local91), local95);
				} else if (local68 == 3 || local68 == 4) {
					local91 = arg1.method2237();
					local95 = arg1.method2237();
					local99 = arg1.method2199();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = arg1.method2237();
					}
					@Pc(119) byte[][] local119 = new byte[local99][];
					@Pc(134) int local134;
					if (local68 == 3) {
						for (@Pc(127) int local127 = 0; local127 < local99; local127++) {
							local134 = arg1.method2194();
							local119[local127] = new byte[local134];
							arg1.method2232(local134, local119[local127]);
						}
					}
					local9.anIntArray526[local56] = local68;
					@Pc(158) Class[] local158 = new Class[local99];
					for (local134 = 0; local134 < local99; local134++) {
						local158[local134] = Static24.method511(local102[local134]);
					}
					local9.aClass47Array1[local56] = arg2.method2885(Static24.method511(local91), local95, local158);
					local9.aByteArrayArrayArray18[local56] = local119;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local9.anIntArray527[local56] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local9.anIntArray527[local56] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local9.anIntArray527[local56] = -3;
			} catch (@Pc(258) Exception local258) {
				local9.anIntArray527[local56] = -4;
			} catch (@Pc(265) Throwable local265) {
				local9.anIntArray527[local56] = -5;
			}
		}
		Static58.aClass26_11.method668(local9);
	}
}

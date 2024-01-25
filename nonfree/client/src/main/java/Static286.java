import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public static int anInt5670;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Lclient!pga;")
	public static Class32 aClass32_13;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString63 = "";

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!rg;Lclient!ge;I)V")
	public static void method4986(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1, @OriginalArg(2) Class112 arg2) {
		@Pc(9) Class6_Sub52 local9 = new Class6_Sub52();
		local9.anInt10276 = arg1.method8604();
		local9.anInt10275 = arg1.method8579();
		local9.anIntArray625 = new int[local9.anInt10276];
		local9.aByteArrayArrayArray23 = new byte[local9.anInt10276][][];
		local9.aClass328Array1 = new Class328[local9.anInt10276];
		local9.aClass328Array2 = new Class328[local9.anInt10276];
		local9.anIntArray627 = new int[local9.anInt10276];
		local9.anIntArray624 = new int[local9.anInt10276];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt10276; local58++) {
			try {
				@Pc(64) int local64 = arg1.method8604();
				@Pc(76) String local76;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local76 = arg1.method8611();
					local80 = arg1.method8611();
					local82 = 0;
					if (local64 == 1) {
						local82 = arg1.method8579();
					}
					local9.anIntArray625[local58] = local64;
					local9.anIntArray627[local58] = local82;
					local9.aClass328Array1[local58] = arg2.method3226(Static40.method760(local76), local80);
				} else if (local64 == 3 || local64 == 4) {
					local76 = arg1.method8611();
					local80 = arg1.method8611();
					local82 = arg1.method8604();
					@Pc(141) String[] local141 = new String[local82];
					for (@Pc(143) int local143 = 0; local143 < local82; local143++) {
						local141[local143] = arg1.method8611();
					}
					@Pc(158) byte[][] local158 = new byte[local82][];
					@Pc(171) int local171;
					if (local64 == 3) {
						for (@Pc(165) int local165 = 0; local165 < local82; local165++) {
							local171 = arg1.method8579();
							local158[local165] = new byte[local171];
							arg1.method8595(local158[local165], local171, 0);
						}
					}
					local9.anIntArray625[local58] = local64;
					@Pc(200) Class[] local200 = new Class[local82];
					for (local171 = 0; local171 < local82; local171++) {
						local200[local171] = Static40.method760(local141[local171]);
					}
					local9.aClass328Array2[local58] = arg2.method3238(local200, local80, Static40.method760(local76));
					local9.aByteArrayArrayArray23[local58] = local158;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local9.anIntArray624[local58] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local9.anIntArray624[local58] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local9.anIntArray624[local58] = -3;
			} catch (@Pc(260) Exception local260) {
				local9.anIntArray624[local58] = -4;
			} catch (@Pc(267) Throwable local267) {
				local9.anIntArray624[local58] = -5;
			}
		}
		Static340.aClass8_37.method157(local9);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BIIIIIII[B)V")
	public static void method4988(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(31) int local31 = -arg6; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg1++;
				arg0[local39] += arg7[arg3++];
				@Pc(51) int local51 = arg1++;
				arg0[local51] += arg7[arg3++];
				@Pc(63) int local63 = arg1++;
				arg0[local63] += arg7[arg3++];
				@Pc(75) int local75 = arg1++;
				arg0[local75] += arg7[arg3++];
			}
			for (@Pc(90) int local90 = local15; local90 < 0; local90++) {
				local39 = arg1++;
				arg0[local39] += arg7[arg3++];
			}
			arg1 += arg4;
			arg3 += arg5;
		}
	}
}

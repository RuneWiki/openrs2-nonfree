import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
	public static int anInt7388;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Lclient!cj;")
	public static final Class57 aClass57_6 = new Class57(16);

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_101 = new Class100(86, 7);

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
	public static final int[] anIntArray536 = new int[14];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BILclient!js;ILclient!fb;)V")
	public static void method5988(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub29_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12_Sub2_Sub2_Sub1_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg2 & 0x800) != 0) {
			local7 = arg1.method5877();
		}
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(48) int local48;
		if ((arg2 & 0x80) != 0) {
			local23 = arg1.method5876();
			if (local23 == 65535) {
				local23 = -1;
			}
			local34 = arg1.method5878();
			local38 = arg1.method5866();
			local42 = local38 & 0x7;
			local48 = local38 >> 3 & 0xF;
			if (local48 == 15) {
				local48 = -1;
			}
			arg3.method2429(local23, local34, local42, local48, 0);
		}
		if ((arg2 & 0x100) != 0) {
			arg3.aBoolean229 = arg1.method5846() == 1;
		}
		if ((arg2 & 0x4) != 0) {
			arg3.anInt2977 = arg1.method5840();
			if (arg3.anInt2964 == 0) {
				arg3.method2419(arg3.anInt2977);
				arg3.anInt2977 = -1;
			}
		}
		if ((arg2 & 0x10000) != 0) {
			arg3.aBoolean231 = arg1.method5846() == 1;
		}
		if ((arg2 & 0x40000) != 0) {
			local23 = arg1.method5840();
			if (local23 == 65535) {
				local23 = -1;
			}
			local34 = arg1.method5864();
			local38 = arg1.method5866();
			local42 = local38 & 0x7;
			local48 = local38 >> 3 & 0xF;
			if (local48 == 15) {
				local48 = -1;
			}
			arg3.method2429(local23, local34, local42, local48, 2);
		}
		@Pc(194) int local194;
		@Pc(172) int[] local172;
		@Pc(175) int[] local175;
		if ((arg2 & 0x80000) != 0) {
			local23 = arg1.method5866();
			local172 = new int[local23];
			local175 = new int[local23];
			for (local42 = 0; local42 < local23; local42++) {
				local48 = arg1.method5884();
				if ((local48 & 0xC000) == 49152) {
					local194 = arg1.method5876();
					local172[local42] = local194 | local48 << 16;
				} else {
					local172[local42] = local48;
				}
				local175[local42] = arg1.method5840();
			}
			arg3.method2420(local172, local175);
		}
		if ((arg2 & 0x200) != 0) {
			local23 = arg1.method5888();
			local172 = new int[local23];
			local175 = new int[local23];
			@Pc(240) int[] local240 = new int[local23];
			for (local48 = 0; local48 < local23; local48++) {
				local194 = arg1.method5840();
				if (local194 == 65535) {
					local194 = -1;
				}
				local172[local48] = local194;
				local175[local48] = arg1.method5866();
				local240[local48] = arg1.method5900();
			}
			Static432.method6336(arg3, local175, local172, local240);
		}
		if ((arg2 & 0x1000) != 0) {
			arg3.anInt2905 = arg1.method5906();
			arg3.anInt2909 = arg1.method5906();
			arg3.anInt2957 = arg1.method5845();
			arg3.anInt2919 = arg1.method5877();
			arg3.anInt2938 = arg1.method5884() + Static87.anInt1951;
			arg3.anInt2959 = arg1.method5876() + Static87.anInt1951;
			arg3.anInt2912 = arg1.method5846();
			if (arg3.aBoolean227) {
				arg3.anInt2905 += arg3.anInt2994;
				arg3.anInt2919 += arg3.anInt2969;
				arg3.anInt2957 += arg3.anInt2994;
				arg3.anInt2909 += arg3.anInt2969;
				arg3.anInt2964 = 0;
			} else {
				arg3.anInt2957 += arg3.anIntArray241[0];
				arg3.anInt2919 += arg3.anIntArray242[0];
				arg3.anInt2909 += arg3.anIntArray242[0];
				arg3.anInt2964 = 1;
				arg3.anInt2905 += arg3.anIntArray241[0];
			}
			arg3.anInt2966 = 0;
		}
		if ((arg2 & 0x4000) != 0) {
			local23 = arg1.method5884();
			local34 = arg1.method5864();
			if (local23 == 65535) {
				local23 = -1;
			}
			local38 = arg1.method5842();
			local42 = local38 & 0x7;
			local48 = local38 >> 3 & 0xF;
			if (local48 == 15) {
				local48 = -1;
			}
			arg3.method2429(local23, local34, local42, local48, 1);
		}
		if ((arg2 & 0x8000) != 0) {
			arg3.aString33 = arg1.method5898();
			if (arg3.aString33.charAt(0) == '~') {
				arg3.aString33 = arg3.aString33.substring(1);
				Static149.method5512(arg3.method2443(), arg3.method2440(), arg3.aString33, 2, 0, arg3.aString34);
			} else if (arg3 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2) {
				Static149.method5512(arg3.method2443(), arg3.method2440(), arg3.aString33, 2, 0, arg3.aString34);
			}
			arg3.anInt2922 = 0;
			arg3.anInt2910 = 150;
			arg3.anInt2944 = 0;
		}
		if ((arg2 & 0x20000) != 0) {
			arg3.aByte58 = arg1.method5877();
			arg3.aByte57 = arg1.method5880();
			arg3.aByte61 = arg1.method5906();
			arg3.aByte60 = (byte) arg1.method5846();
			arg3.anInt2962 = Static87.anInt1951 + arg1.method5840();
			arg3.anInt2936 = Static87.anInt1951 + arg1.method5840();
		}
		if ((arg2 & 0x400) != 0) {
			local23 = arg1.method5884();
			arg3.anInt2914 = arg1.method5866();
			arg3.anInt2908 = arg1.method5842();
			arg3.aBoolean223 = (local23 & 0x8000) != 0;
			arg3.anInt2901 = local23 & 0x7FFF;
			arg3.anInt2961 = Static87.anInt1951 + arg3.anInt2901 + arg3.anInt2914;
		}
		if ((arg2 & 0x40) != 0) {
			local23 = arg1.method5900();
			if (local23 == 65535) {
				local23 = -1;
			}
			arg3.anInt2903 = local23;
		}
		if ((arg2 & 0x2) != 0) {
			Static243.aByteArray56[arg0] = arg1.method5845();
		}
		if ((arg2 & 0x10) != 0) {
			local23 = arg1.method5888();
			if (local23 > 0) {
				for (local34 = 0; local34 < local23; local34++) {
					local42 = -1;
					local48 = -1;
					local38 = arg1.method5895();
					local194 = -1;
					if (local38 == 32767) {
						local38 = arg1.method5895();
						local48 = arg1.method5895();
						local42 = arg1.method5895();
						local194 = arg1.method5895();
					} else if (local38 == 32766) {
						local38 = -1;
					} else {
						local48 = arg1.method5895();
					}
					@Pc(707) int local707 = arg1.method5895();
					@Pc(711) int local711 = arg1.method5842();
					arg3.method2428(local48, local707, local38, local194, local711, Static87.anInt1951, local42);
				}
			}
		}
		if ((arg2 & 0x8) != 0) {
			@Pc(736) int[] local736 = new int[4];
			for (local34 = 0; local34 < 4; local34++) {
				local736[local34] = arg1.method5876();
				if (local736[local34] == 65535) {
					local736[local34] = -1;
				}
			}
			local38 = arg1.method5842();
			Static285.method4071(local736, arg3, local38);
		}
		if ((arg2 & 0x1) != 0) {
			local23 = arg1.method5842();
			@Pc(781) byte[] local781 = new byte[local23];
			@Pc(786) Class14_Sub29 local786 = new Class14_Sub29(local781);
			arg1.method5891(local781, local23);
			Static308.aClass14_Sub29Array1[arg0] = local786;
			arg3.method2433(local786);
		}
		if (!arg3.aBoolean227) {
			return;
		}
		if (local7 == 127) {
			arg3.method2442(arg3.anInt2994, arg3.anInt2969);
			return;
		}
		@Pc(811) byte local811;
		if (local7 == -1) {
			local811 = Static243.aByteArray56[arg0];
		} else {
			local811 = local7;
		}
		Static420.method6224(local811, arg3);
		arg3.method2432(arg3.anInt2969, arg3.anInt2994, local811);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[BIIIII[BZ)V")
	public static void method5989(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg2++;
				arg1[local31] += arg7[arg4++];
				@Pc(43) int local43 = arg2++;
				arg1[local43] += arg7[arg4++];
				@Pc(55) int local55 = arg2++;
				arg1[local55] += arg7[arg4++];
				@Pc(67) int local67 = arg2++;
				arg1[local67] += arg7[arg4++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg2++;
				arg1[local31] += arg7[arg4++];
			}
			arg4 += arg6;
			arg2 += arg3;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method5990() {
		for (@Pc(15) Class14_Sub3_Sub10 local15 = (Class14_Sub3_Sub10) Static144.aClass262_13.method6318(); local15 != null; local15 = (Class14_Sub3_Sub10) Static144.aClass262_13.method6311()) {
			@Pc(20) Class12_Sub2_Sub2_Sub4 local20 = local15.aClass12_Sub2_Sub2_Sub4_1;
			if (local20.anInt4968 < Static87.anInt1951) {
				local15.method9315();
				local20.method4129();
			} else if (Static87.anInt1951 >= local20.anInt4954) {
				local20.method4128();
				if (local20.anInt4964 > 0) {
					@Pc(60) Class14_Sub44 local60 = (Class14_Sub44) Static579.aClass187_73.method4078((long) (local20.anInt4964 - 1));
					if (local60 != null) {
						@Pc(65) Class12_Sub2_Sub2_Sub1_Sub1 local65 = local60.aClass12_Sub2_Sub2_Sub1_Sub1_2;
						if (local65.anInt10998 >= 0 && Static26.anInt462 * 512 > local65.anInt10998 && local65.anInt11002 >= 0 && Static445.anInt6140 * 512 > local65.anInt11002) {
							local20.method4125(Static87.anInt1951, local65.anInt10998, Static152.method2434(local65.anInt10998, local20.aByte146, local65.anInt11002) - local20.anInt4951, local65.anInt11002);
						}
					}
				}
				if (local20.anInt4964 < 0) {
					@Pc(121) int local121 = -local20.anInt4964 - 1;
					@Pc(132) Class12_Sub2_Sub2_Sub1_Sub2 local132;
					if (Static568.anInt9800 == local121) {
						local132 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2;
					} else {
						local132 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local121];
					}
					if (local132 != null && local132.anInt10998 >= 0 && Static26.anInt462 * 512 > local132.anInt10998 && local132.anInt11002 >= 0 && local132.anInt11002 < Static445.anInt6140 * 512) {
						local20.method4125(Static87.anInt1951, local132.anInt10998, Static152.method2434(local132.anInt10998, local20.aByte146, local132.anInt11002) - local20.anInt4951, local132.anInt11002);
					}
				}
				local20.method4124(Static475.anInt8259);
				Static662.method9184(local20, true);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Lclient!gj;")
	public static Class143 aClass143_142;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!sp;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if ((arg5 ? Static227.aClass3_Sub15_11.aClass17_Sub3_1.method741() : Static227.aClass3_Sub15_11.aClass17_Sub3_4.method741()) != 0 && arg1 != 0 && Static228.anInt2286 < 50 && arg2 != -1) {
			Static631.aClass303Array2[Static228.anInt2286++] = new Class303((byte) (arg5 ? 3 : 2), arg2, arg1, arg3, arg0, 0, arg4, (Class23_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!kka;)V")
	public static void method8450(@OriginalArg(1) Class3_Sub17_Sub2 arg0) {
		arg0.method4906();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(12) int local12 = 0; local12 < Static187.anInt3432; local12++) {
			local18 = Static668.anIntArray664[local12];
			if ((Static177.aByteArray23[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static177.aByteArray23[local18] = (byte) (Static177.aByteArray23[local18] | 0x2);
				} else {
					local48 = arg0.method4905(1);
					if (local48 == 0) {
						local10 = Static164.method2759(arg0);
						Static177.aByteArray23[local18] = (byte) (Static177.aByteArray23[local18] | 0x2);
					} else {
						Static440.method6409(arg0, local18);
					}
				}
			}
		}
		arg0.method4908();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4906();
		@Pc(129) int local129;
		for (local18 = 0; local18 < Static187.anInt3432; local18++) {
			local48 = Static668.anIntArray664[local18];
			if ((Static177.aByteArray23[local48] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static177.aByteArray23[local48] = (byte) (Static177.aByteArray23[local48] | 0x2);
				} else {
					local129 = arg0.method4905(1);
					if (local129 == 0) {
						local10 = Static164.method2759(arg0);
						Static177.aByteArray23[local48] = (byte) (Static177.aByteArray23[local48] | 0x2);
					} else {
						Static440.method6409(arg0, local48);
					}
				}
			}
		}
		arg0.method4908();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4906();
		@Pc(215) int local215;
		for (local48 = 0; local48 < Static491.anInt9928; local48++) {
			local129 = Static178.anIntArray231[local48];
			if ((Static177.aByteArray23[local129] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static177.aByteArray23[local129] = (byte) (Static177.aByteArray23[local129] | 0x2);
				} else {
					local215 = arg0.method4905(1);
					if (local215 == 0) {
						local10 = Static164.method2759(arg0);
						Static177.aByteArray23[local129] = (byte) (Static177.aByteArray23[local129] | 0x2);
					} else if (Static587.method7887(local129, arg0)) {
						Static177.aByteArray23[local129] = (byte) (Static177.aByteArray23[local129] | 0x2);
					}
				}
			}
		}
		arg0.method4908();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4906();
		for (local129 = 0; local129 < Static491.anInt9928; local129++) {
			local215 = Static178.anIntArray231[local129];
			if ((Static177.aByteArray23[local215] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static177.aByteArray23[local215] = (byte) (Static177.aByteArray23[local215] | 0x2);
				} else {
					@Pc(299) int local299 = arg0.method4905(1);
					if (local299 == 0) {
						local10 = Static164.method2759(arg0);
						Static177.aByteArray23[local215] = (byte) (Static177.aByteArray23[local215] | 0x2);
					} else if (Static587.method7887(local215, arg0)) {
						Static177.aByteArray23[local215] = (byte) (Static177.aByteArray23[local215] | 0x2);
					}
				}
			}
		}
		arg0.method4908();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static491.anInt9928 = 0;
		Static187.anInt3432 = 0;
		for (local215 = 1; local215 < 2048; local215++) {
			Static177.aByteArray23[local215] = (byte) (Static177.aByteArray23[local215] >> 1);
			@Pc(378) Class23_Sub2_Sub1_Sub2_Sub1 local378 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local215];
			if (local378 == null) {
				Static178.anIntArray231[Static491.anInt9928++] = local215;
			} else {
				Static668.anIntArray664[Static187.anInt3432++] = local215;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
	public static int method8451(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!gj;ILjava/lang/String;Z)Lclient!fh;")
	public static Class121 method8452(@OriginalArg(0) Class143 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) int local12 = arg0.method3131(arg1);
		if (local12 == -1) {
			return new Class121(0);
		}
		@Pc(25) int[] local25 = arg0.method3133(local12);
		@Pc(31) Class121 local31 = new Class121(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local31.anInt3011 > local33) {
				@Pc(53) Class3_Sub17 local53 = new Class3_Sub17(arg0.method3125(local25[local39++], local12));
				@Pc(59) int local59 = local53.method4868();
				@Pc(65) int local65 = local53.method4858();
				@Pc(69) int local69 = local53.method4888();
				if (!arg2 && local69 == 1) {
					local31.anInt3011--;
				} else {
					local31.anIntArray197[local33] = local59;
					local31.anIntArray198[local33] = local65;
					local33++;
				}
			}
			return local31;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public static int anInt6721;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	public static final int[] anIntArray448 = new int[13];

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static int anInt6725 = 0;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
	public static final int[] anIntArray449 = new int[256];

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_138 = new Class256("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)[Lclient!ra;")
	public static Class208[] method5281() {
		return new Class208[] { Static107.aClass208_5, Static46.aClass208_2, Static427.aClass208_14, Static449.aClass208_7, Static438.aClass208_15, Static246.aClass208_10, Static411.aClass208_13, Static292.aClass208_11, Static180.aClass208_9, Static42.aClass208_1, Static311.aClass208_12, Static171.aClass208_8, Static59.aClass208_3, Static64.aClass208_4 };
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ql;ILclient!hq;II)V")
	public static void method5282(@OriginalArg(0) Class4_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub20_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(12) byte local12 = -1;
		if ((arg1 & 0x2000) != 0) {
			local12 = arg2.method3696();
		}
		if ((arg1 & 0x20) != 0) {
			arg0.anInt5733 = arg2.method3744();
			if (arg0.anInt6524 == 0) {
				arg0.method5124(arg0.anInt5733);
				arg0.anInt5733 = -1;
			}
		}
		@Pc(56) int local56;
		if ((arg1 & 0x40) != 0) {
			local56 = arg2.method3737();
			@Pc(59) byte[] local59 = new byte[local56];
			@Pc(64) Class2_Sub20 local64 = new Class2_Sub20(local59);
			arg2.method3700(local56, local59);
			Static180.aClass2_Sub20Array1[arg3] = local64;
			arg0.method4596(local64);
		}
		if ((arg1 & 0x800) != 0) {
			arg0.aString55 = arg2.method3717();
			if (arg0.aString55.charAt(0) == '~') {
				arg0.aString55 = arg0.aString55.substring(1);
				Static187.method5442(arg0.method4600(), 2, arg0.method4607(), arg0.aString55, 0);
			} else if (arg0 == Static231.aClass4_Sub2_Sub2_Sub1_2) {
				Static187.method5442(arg0.method4600(), 2, arg0.method4607(), arg0.aString55, 0);
			}
			arg0.anInt6514 = 150;
			arg0.anInt6485 = 0;
			arg0.anInt6461 = 0;
		}
		@Pc(160) int local160;
		if ((arg1 & 0x80) != 0) {
			local56 = arg2.method3698();
			local160 = arg2.method3716();
			arg0.method5116(local56, Static164.anInt3206, local160);
			arg0.anInt6451 = Static164.anInt3206 + 300;
			arg0.anInt6511 = arg2.method3716();
		}
		if ((arg1 & 0x10) != 0) {
			Static349.aByteArray171[arg3] = arg2.method3693();
		}
		@Pc(214) int local214;
		if ((arg1 & 0x40000) != 0) {
			local56 = arg2.method3706();
			if (local56 == 65535) {
				local56 = -1;
			}
			local160 = arg2.method3747();
			local214 = arg2.method3737();
			arg0.method5128(true, local56, local160, local214);
		}
		if ((arg1 & 0x4) != 0) {
			local56 = arg2.method3706();
			local160 = arg2.method3737();
			local214 = arg2.method3716();
			@Pc(242) int local242 = arg2.anInt4608;
			@Pc(250) boolean local250 = (local56 & 0x8000) != 0;
			if (arg0.aString48 != null && arg0.aClass7_1 != null) {
				@Pc(258) boolean local258 = false;
				if (local160 <= 1) {
					if (!local250 && (Static217.aBoolean41 && !Static296.aBoolean462 || Static407.aBoolean597)) {
						local258 = true;
					} else if (Static170.method2636(arg0.aString48)) {
						local258 = true;
					}
				}
				if (!local258 && Static310.anInt5449 == 0) {
					Static81.aClass2_Sub20_2.anInt4608 = 0;
					arg2.method3694(Static81.aClass2_Sub20_2.aByteArray136, local214);
					Static81.aClass2_Sub20_2.anInt4608 = 0;
					@Pc(303) int local303 = -1;
					@Pc(322) String local322;
					if (local250) {
						local56 &= 0x7FFF;
						@Pc(313) Class11 local313 = Static42.method812(Static81.aClass2_Sub20_2);
						local303 = local313.anInt319;
						local322 = local313.aClass2_Sub2_Sub14_1.method4845(Static81.aClass2_Sub20_2);
					} else {
						local322 = Static273.method4070(Static26.method371(Static81.aClass2_Sub20_2));
					}
					arg0.aString55 = local322.trim();
					arg0.anInt6514 = 150;
					arg0.anInt6485 = local56 & 0xFF;
					arg0.anInt6461 = local56 >> 8;
					@Pc(361) int local361;
					if (local160 == 1 || local160 == 2) {
						local361 = local250 ? 17 : 1;
					} else {
						local361 = local250 ? 17 : 2;
					}
					if (local160 == 2) {
						Static226.method3487(local322, "<img=1>" + arg0.method4607(), "<img=1>" + arg0.method4600(), local303, 0, null, local361);
					} else if (local160 == 1) {
						Static226.method3487(local322, "<img=0>" + arg0.method4607(), "<img=0>" + arg0.method4600(), local303, 0, null, local361);
					} else {
						Static226.method3487(local322, arg0.method4607(), arg0.method4600(), local303, 0, null, local361);
					}
				}
			}
			arg2.anInt4608 = local214 + local242;
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt6496 = arg2.method3693();
			arg0.anInt6498 = arg2.method3712();
			arg0.anInt6454 = arg2.method3730();
			arg0.anInt6518 = arg2.method3693();
			arg0.anInt6463 = arg2.method3732() + Static164.anInt3206;
			arg0.anInt6457 = arg2.method3706() + Static164.anInt3206;
			arg0.anInt6500 = arg2.method3737();
			if (arg0.aBoolean508) {
				arg0.anInt6518 += arg0.anInt5751;
				arg0.anInt6454 += arg0.anInt5736;
				arg0.anInt6496 += arg0.anInt5736;
				arg0.anInt6524 = 0;
				arg0.anInt6498 += arg0.anInt5751;
			} else {
				arg0.anInt6496 += arg0.anIntArray436[0];
				arg0.anInt6524 = 1;
				arg0.anInt6454 += arg0.anIntArray436[0];
				arg0.anInt6498 += arg0.anIntArray437[0];
				arg0.anInt6518 += arg0.anIntArray437[0];
			}
			arg0.anInt6525 = 0;
		}
		if ((arg1 & 0x2) != 0) {
			local56 = arg2.method3711();
			if (local56 == 65535) {
				local56 = -1;
			}
			local160 = arg2.method3739();
			Static88.method1487(arg0, local56, local160);
		}
		if ((arg1 & 0x1) != 0) {
			local56 = arg2.method3732();
			if (local56 == 65535) {
				local56 = -1;
			}
			arg0.anInt6481 = local56;
		}
		if ((arg1 & 0x4000) != 0) {
			local56 = arg2.method3744();
			local160 = arg2.method3731();
			if (local56 == 65535) {
				local56 = -1;
			}
			local214 = arg2.method3739();
			arg0.method5128(false, local56, local160, local214);
		}
		if ((arg1 & 0x8000) != 0) {
			arg0.aBoolean510 = arg2.method3716() == 1;
		}
		if ((arg1 & 0x100) != 0) {
			local56 = Static164.anInt3206;
			local160 = arg2.method3698();
			local214 = arg2.method3721();
			arg0.method5116(local160, local56, local214);
		}
		if ((arg1 & 0x400) != 0) {
			local56 = arg2.method3732();
			arg0.anInt6502 = arg2.method3739();
			arg0.anInt6516 = arg2.method3739();
			arg0.aBoolean562 = (local56 & 0x8000) != 0;
			arg0.anInt6489 = local56 & 0x7FFF;
			arg0.anInt6475 = Static164.anInt3206 + arg0.anInt6489 + arg0.anInt6502;
		}
		if ((arg1 & 0x20000) != 0) {
			arg0.aByte85 = arg2.method3696();
			arg0.aByte86 = arg2.method3693();
			arg0.aByte88 = arg2.method3730();
			arg0.aByte87 = (byte) arg2.method3721();
			arg0.anInt6495 = Static164.anInt3206 + arg2.method3711();
			arg0.anInt6468 = Static164.anInt3206 + arg2.method3732();
		}
		if ((arg1 & 0x10000) != 0) {
			local56 = arg2.method3737();
			@Pc(807) int[] local807 = new int[local56];
			@Pc(810) int[] local810 = new int[local56];
			@Pc(813) int[] local813 = new int[local56];
			for (@Pc(815) int local815 = 0; local815 < local56; local815++) {
				@Pc(821) int local821 = arg2.method3706();
				if (local821 == 65535) {
					local821 = -1;
				}
				local807[local815] = local821;
				local810[local815] = arg2.method3721();
				local813[local815] = arg2.method3744();
			}
			Static231.method3538(local813, arg0, local810, local807);
		}
		if (!arg0.aBoolean508) {
			return;
		}
		if (local12 == 127) {
			arg0.method4603(arg0.anInt5751, arg0.anInt5736);
			return;
		}
		@Pc(873) byte local873;
		if (local12 == -1) {
			local873 = Static349.aByteArray171[arg3];
		} else {
			local873 = local12;
		}
		arg0.method4598(local873, arg0.anInt5736, arg0.anInt5751);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
	public static boolean method5283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static268.anInt4957; local1++) {
			@Pc(6) Class1 local6 = Static58.aClass1Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2 == 1) {
				local15 = local6.anInt17 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt12 + (local6.anInt6 * local15 >> 8);
					local37 = local6.anInt21 + (local6.anInt10 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt5 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt16 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2 == 2) {
				local15 = arg0 - local6.anInt17;
				if (local15 > 0) {
					local27 = local6.anInt12 + (local6.anInt6 * local15 >> 8);
					local37 = local6.anInt21 + (local6.anInt10 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt5 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt16 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2 == 3) {
				local15 = local6.anInt12 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt17 + (local6.anInt15 * local15 >> 8);
					local37 = local6.anInt11 + (local6.anInt9 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt5 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt16 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2 == 4) {
				local15 = arg2 - local6.anInt12;
				if (local15 > 0) {
					local27 = local6.anInt17 + (local6.anInt15 * local15 >> 8);
					local37 = local6.anInt11 + (local6.anInt9 * local15 >> 8);
					local47 = local6.anInt13 + (local6.anInt5 * local15 >> 8);
					local57 = local6.anInt19 + (local6.anInt16 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2 == 5) {
				local15 = arg1 - local6.anInt13;
				if (local15 > 0) {
					local27 = local6.anInt17 + (local6.anInt15 * local15 >> 8);
					local37 = local6.anInt11 + (local6.anInt9 * local15 >> 8);
					local47 = local6.anInt12 + (local6.anInt6 * local15 >> 8);
					local57 = local6.anInt21 + (local6.anInt10 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method5284(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub20 local17 = new Class2_Sub20(arg0);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method3695();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(100) Class250 local100;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method3698();
										if (local39 == 0) {
											continue label70;
										}
										local17.method3737();
									}
									local39 = local17.method3698();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(54) int local54 = local31 & 0x3F;
									@Pc(60) int local60 = local31 >> 6 & 0x3F;
									local66 = local17.method3737() >> 2;
									local70 = arg1 + local60;
									local74 = local54 + arg4;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (local70 >= arg3 - 1);
					} while (local74 >= arg2 - 1);
					local100 = Static406.aClass150_3.method3508(local19);
				} while (local66 == 22 && !Static399.aClass167_Sub1_1.aBoolean491 && local100.anInt7186 == 0 && local100.anInt7187 != 1 && !local100.aBoolean616);
				if (!local100.method5581()) {
					local12 = false;
					Static88.anInt2012++;
				}
				local33 = true;
			}
		}
	}
}

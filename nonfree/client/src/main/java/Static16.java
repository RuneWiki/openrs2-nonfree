import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aka", name = "M", descriptor = "Lclient!tf;")
	public static Class17 aClass17_2;

	@OriginalMember(owner = "client!aka", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!aka", name = "Q", descriptor = "I")
	public static int anInt306 = 0;

	@OriginalMember(owner = "client!aka", name = "R", descriptor = "J")
	public static long aLong11 = -1L;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZLclient!kg;III)V")
	public static void method296(@OriginalArg(1) Class3_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class377 local9 = arg0.method8525();
		@Pc(23) int local23 = arg0.anInt9950 - arg0.aClass240_7.anInt5668 & 0x3FFF;
		if (arg1 == -1) {
			if (local23 != 0 || arg0.anInt9988 > 25) {
				if (arg2 < 0 && local9.anInt10037 != -1) {
					arg0.anInt9967 = local9.anInt10037;
					arg0.aBoolean776 = false;
				} else if (arg2 <= 0 || local9.anInt10040 == -1) {
					arg0.anInt9967 = local9.anInt10066;
				} else {
					arg0.anInt9967 = local9.anInt10040;
				}
				arg0.aBoolean776 = false;
			} else if (!arg0.aBoolean776 || !local9.method8542(arg0.anInt9967)) {
				arg0.anInt9967 = local9.method8539();
				arg0.aBoolean776 = arg0.anInt9967 != -1;
			}
		} else if (arg0.anInt9947 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(121) int local121 = Static447.anIntArray484[arg3] - arg0.aClass240_7.anInt5668 & 0x3FFF;
			arg0.aBoolean776 = false;
			if (arg1 == 2 && local9.anInt10039 != -1) {
				if (local121 > 2048 && local121 <= 6144 && local9.anInt10051 != -1) {
					arg0.anInt9967 = local9.anInt10051;
				} else if (local121 >= 10240 && local121 < 14336 && local9.anInt10062 != -1) {
					arg0.anInt9967 = local9.anInt10062;
				} else if (local121 <= 6144 || local121 >= 10240 || local9.anInt10035 == -1) {
					arg0.anInt9967 = local9.anInt10039;
				} else {
					arg0.anInt9967 = local9.anInt10035;
				}
			} else if (arg1 == 0 && local9.anInt10063 != -1) {
				if (local121 > 2048 && local121 <= 6144 && local9.anInt10054 != -1) {
					arg0.anInt9967 = local9.anInt10054;
				} else if (local121 >= 10240 && local121 < 14336 && local9.anInt10044 != -1) {
					arg0.anInt9967 = local9.anInt10044;
				} else if (local121 <= 6144 || local121 >= 10240 || local9.anInt10068 == -1) {
					arg0.anInt9967 = local9.anInt10063;
				} else {
					arg0.anInt9967 = local9.anInt10068;
				}
			} else if (local121 > 2048 && local121 <= 6144 && local9.anInt10050 != -1) {
				arg0.anInt9967 = local9.anInt10050;
			} else if (local121 >= 10240 && local121 < 14336 && local9.anInt10064 != -1) {
				arg0.anInt9967 = local9.anInt10064;
			} else if (local121 <= 6144 || local121 >= 10240 || local9.anInt10072 == -1) {
				arg0.anInt9967 = local9.anInt10066;
			} else {
				arg0.anInt9967 = local9.anInt10072;
			}
		} else if (local23 == 0 && arg0.anInt9988 <= 25) {
			arg0.aBoolean776 = false;
			if (arg1 == 2 && local9.anInt10039 != -1) {
				arg0.anInt9967 = local9.anInt10039;
			} else if (arg1 == 0 && local9.anInt10063 != -1) {
				arg0.anInt9967 = local9.anInt10063;
			} else {
				arg0.anInt9967 = local9.anInt10066;
			}
		} else {
			if (arg1 == 2 && local9.anInt10039 != -1) {
				if (arg2 < 0 && local9.anInt10047 != -1) {
					arg0.anInt9967 = local9.anInt10047;
				} else if (arg2 <= 0 || local9.anInt10041 == -1) {
					arg0.anInt9967 = local9.anInt10039;
				} else {
					arg0.anInt9967 = local9.anInt10041;
				}
			} else if (arg1 == 0 && local9.anInt10063 != -1) {
				if (arg2 < 0 && local9.anInt10032 != -1) {
					arg0.anInt9967 = local9.anInt10032;
				} else if (arg2 <= 0 || local9.anInt10053 == -1) {
					arg0.anInt9967 = local9.anInt10063;
				} else {
					arg0.anInt9967 = local9.anInt10053;
				}
			} else if (arg2 < 0 && local9.anInt10055 != -1) {
				arg0.anInt9967 = local9.anInt10055;
			} else if (arg2 <= 0 || local9.anInt10074 == -1) {
				arg0.anInt9967 = local9.anInt10066;
			} else {
				arg0.anInt9967 = local9.anInt10074;
			}
			arg0.aBoolean776 = false;
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(IBI)Z")
	public static boolean method297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!es;I)Lclient!fd;")
	public static Class109 method298(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method8865();
		@Pc(14) Class291 local14 = Static305.method4279()[arg0.method8865()];
		@Pc(26) Class125 local26 = Static640.method8546()[arg0.method8865()];
		@Pc(30) int local30 = arg0.method8834();
		@Pc(34) int local34 = arg0.method8834();
		@Pc(38) int local38 = arg0.method8859();
		@Pc(42) int local42 = arg0.method8859();
		@Pc(46) int local46 = arg0.method8850();
		@Pc(50) int local50 = arg0.method8850();
		@Pc(54) int local54 = arg0.method8850();
		@Pc(63) boolean local63 = arg0.method8865() == 1;
		return new Class109(local7, local14, local26, local30, local34, local38, local42, local46, local50, local54, local63);
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(III)Z")
	public static boolean method300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method301(@OriginalArg(1) String arg0) {
		Static388.method5002("", arg0, "", "", 0, 0);
	}
}

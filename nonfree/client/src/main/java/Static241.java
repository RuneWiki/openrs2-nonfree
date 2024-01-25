import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "Lclient!rs;")
	public static Class174 aClass174_5;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
	public static int anInt4651 = 0;

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_89 = new Class93("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)Lclient!ec;")
	public static Class2_Sub11_Sub2 method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg0;
		@Pc(18) Class2_Sub11_Sub2 local18 = (Class2_Sub11_Sub2) Static260.aClass179_9.method5092((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static253.aClass191_222.method5448(Static253.aClass191_222.method5461(local9));
		if (local32 == null) {
			local9 = arg0 | arg2 + 65536 << 8;
			local18 = (Class2_Sub11_Sub2) Static260.aClass179_9.method5092((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local32 = Static253.aClass191_222.method5448(Static253.aClass191_222.method5461(local9));
			if (local32 == null) {
				local9 = arg0 | 0xFFFF00;
				local18 = (Class2_Sub11_Sub2) Static260.aClass179_9.method5092((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local32 = Static253.aClass191_222.method5448(Static253.aClass191_222.method5461(local9));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					local18 = method4170(local32);
					local18.anInt1463 = arg0;
					Static260.aClass179_9.method5085(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				local18 = method4170(local32);
				local18.anInt1463 = arg0;
				Static260.aClass179_9.method5085(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			local18 = method4170(local32);
			local18.anInt1463 = arg0;
			Static260.aClass179_9.method5085(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ae;IIILclient!p;III)V")
	public static void method4167(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class151 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Interface9 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface9) Static230.method4018(arg5, arg4, arg2);
		}
		if (arg1 == 1) {
			local5 = (Interface9) Static226.method3034(arg5, arg4, arg2);
		}
		if (arg1 == 2) {
			local5 = (Interface9) Static280.method5066(arg5, arg4, arg2, vl.class);
		}
		if (arg1 == 3) {
			local5 = (Interface9) Static104.method4927(arg5, arg4, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(63) int local63 = local5.method5581();
		@Pc(67) int local67 = local5.method5580();
		@Pc(73) Class96 local73 = Static234.method4051(local5.method5583());
		if (local73.method2939()) {
			Static116.method2492(arg2, arg5, arg4, local73);
		}
		if (local5.method5579()) {
			local5.method5578(arg0);
		}
		if (arg1 != 0) {
			if (arg1 == 1) {
				Static260.method4741(arg5, arg4, arg2);
			} else if (arg1 == 2) {
				Static348.method5952(arg5, arg4, arg2, vl.class);
				if (local73.anInt3117 != 0 && local73.anInt3120 + arg4 < Static95.anInt6381 && Static237.anInt4532 > arg2 + local73.anInt3120 && Static95.anInt6381 > arg4 + local73.anInt3135 && Static237.anInt4532 > local73.anInt3135 + arg2) {
					arg3.method4092(local73.anInt3135, arg2, local73.aBoolean276, arg4, !local73.aBoolean283, local67, local73.anInt3120);
					return;
				}
			} else {
				if (arg1 == 3) {
					Static107.method2341(arg5, arg4, arg2);
					if (local73.anInt3117 == 1) {
						arg3.method4093(arg4, arg2);
						return;
					}
				}
				return;
			}
			return;
		}
		Static61.method1388(arg5, arg4, arg2);
		if (local73.anInt3117 != 0) {
			arg3.method4107(arg2, arg4, !local73.aBoolean283, local67, local63, local73.aBoolean276);
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(CB)B")
	public static byte method4169(@OriginalArg(0) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)Lclient!ec;")
	public static Class2_Sub11_Sub2 method4170(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub11_Sub2 local9 = new Class2_Sub11_Sub2();
		@Pc(14) Class2_Sub10 local14 = new Class2_Sub10(arg0);
		local14.anInt4807 = local14.aByteArray57.length - 2;
		@Pc(30) int local30 = local14.method4464();
		@Pc(41) int local41 = local14.aByteArray57.length - local30 - 12 - 2;
		local14.anInt4807 = local41;
		@Pc(48) int local48 = local14.method4444();
		local9.anInt1460 = local14.method4464();
		local9.anInt1467 = local14.method4464();
		local9.anInt1461 = local14.method4464();
		local9.anInt1465 = local14.method4464();
		@Pc(72) int local72 = local14.method4421();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass199Array1 = new Class199[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method4464();
				@Pc(96) Class199 local96 = new Class199(Static216.method3815(local89));
				local9.aClass199Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method4444();
					@Pc(113) int local113 = local14.method4444();
					local96.method5749(new Class2_Sub42(local113), (long) local107);
				}
			}
		}
		local14.anInt4807 = 0;
		local9.aString14 = local14.method4415();
		local9.aStringArray3 = new String[local48];
		local9.anIntArray153 = new int[local48];
		local9.anIntArray152 = new int[local48];
		local83 = 0;
		while (local14.anInt4807 < local41) {
			local89 = local14.method4464();
			if (local89 == 3) {
				local9.aStringArray3[local83] = local14.method4409().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray153[local83] = local14.method4421();
			} else {
				local9.anIntArray153[local83] = local14.method4444();
			}
			local9.anIntArray152[local83++] = local89;
		}
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)Lclient!jg;")
	public static Class55_Sub3 method4172(@OriginalArg(0) int arg0) {
		@Pc(7) Class67[] local7 = Class114.aClass67Array1;
		synchronized (Class114.aClass67Array1) {
			@Pc(36) Class55_Sub3 local36;
			if (Class114.aClass67Array1.length <= arg0 || Class114.aClass67Array1[arg0].method2103()) {
				local36 = new Class55_Sub3();
				local36.aClass55_Sub4Array1 = new Class55_Sub4[arg0];
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					local36.aClass55_Sub4Array1[local42] = new Class55_Sub4();
				}
			} else {
				local36 = (Class55_Sub3) Class114.aClass67Array1[arg0].method2095();
				local36.method4599();
				@Pc(71) int local71 = Static81.anIntArray194[arg0]--;
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(II)V")
	public static void method4175(@OriginalArg(1) int arg0) {
		Static78.anInt1734 = arg0;
		Static345.aClass119_21.method3304();
	}
}

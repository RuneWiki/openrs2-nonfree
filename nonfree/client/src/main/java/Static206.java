import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!ok;")
	public static Class178 aClass178_58;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public static int anInt3636;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	public static int anInt3641;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public static int anInt3640 = 0;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	public static int anInt3642 = 0;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public static int anInt3644 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sm;I)V")
	public static void method2965(@OriginalArg(0) Class7_Sub39 arg0) {
		if (!Static331.aBoolean372) {
			arg0.method5802();
			Static102.anInt2085--;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)Z")
	public static boolean method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class49 method2967(@OriginalArg(1) int arg0) {
		@Pc(10) Class49 local10 = (Class49) Static389.aClass126_57.method2822((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static288.aClass178_89.method3838(arg0, 0);
		local10 = new Class49();
		if (local20 != null) {
			local10.method922(new Class7_Sub14(local20));
		}
		local10.method926();
		Static389.aClass126_57.method2824((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method2968() {
		for (@Pc(3) int local3 = 0; local3 < Static347.aByteArrayArrayArray16.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static347.aByteArrayArrayArray16[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static347.aByteArrayArrayArray16[0][0].length; local11++) {
					Static347.aByteArrayArrayArray16[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2969(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public static void method2970(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 7);
		local8.method4710();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!cs;ILclient!b;Lclient!ya;)V")
	public static void method2971(@OriginalArg(0) Class7_Sub11 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class51 arg2) {
		@Pc(10) Class11 local10 = arg1.method223(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.la();
		if (local16 < local10.ma()) {
			local16 = local10.ma();
		}
		@Pc(28) int local28 = arg0.anInt1057;
		@Pc(31) int local31 = arg0.anInt1063;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg1.aString2 != null) {
			local33 = Static189.aClass57_14.method1389(Static165.aStringArray25, null, null, arg1.aString2);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static165.aStringArray25[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static36.aClass241_1.method5057(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = Static36.aClass241_1.method5055() * local33 + Static36.aClass241_1.method5054() / 2;
		}
		local51 = arg0.anInt1057 + local16 / 2;
		@Pc(108) int local108 = arg0.anInt1063;
		if (Static93.anInt4328 + local16 > local28) {
			local28 = Static93.anInt4328;
			local51 = local35 / 2 + Static93.anInt4328 + local16 / 2 + 5 + 10;
		} else if (Static93.anInt4331 - local16 < local28) {
			local28 = Static93.anInt4331 - local16;
			local51 = Static93.anInt4331 - local35 / 2 - local16 / 2 - 5 - 10;
		}
		if (Static93.anInt4324 + local16 > local31) {
			local108 = Static93.anInt4324 + local16 / 2 + 10;
			local31 = Static93.anInt4324;
		} else if (local31 > Static93.anInt4325 - local16) {
			local108 = Static93.anInt4325 - local37 - local16 / 2 - 10;
			local31 = Static93.anInt4325 - local16;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg0.anInt1057), (double) (local31 - arg0.anInt1063)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4393((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local74);
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg1.aString2 != null) {
			local255 = local108;
			local253 = local51 - local35 / 2 - 5;
			local259 = local108 + local33 * Static36.aClass241_1.method5055() + 3;
			local257 = local253 + local35 + 10;
			if (arg1.anInt292 != 0) {
				arg2.method5286(local257 - local253, arg1.anInt292, local253, local259 - local108, local108);
			}
			if (arg1.anInt311 != 0) {
				arg2.method5325(local108, arg1.anInt311, local257 - local253, local259 + -local108, local253);
			}
			for (@Pc(327) int local327 = 0; local327 < local33; local327++) {
				@Pc(333) String local333 = Static165.aStringArray25[local327];
				if (local327 < local33 - 1) {
					local333 = local333.substring(0, local333.length() - 4);
				}
				Static36.aClass241_1.method5056(arg2, local333, local51, local108, arg1.anInt296);
				local108 += Static36.aClass241_1.method5055();
			}
		}
		if (arg1.anInt295 == -1 && arg1.aString2 == null) {
			return;
		}
		@Pc(384) Class7_Sub33 local384 = new Class7_Sub33(arg0);
		local16 >>= 0x1;
		local384.anInt4903 = local257;
		local384.anInt4900 = local259;
		local384.anInt4898 = local16 + local28;
		local384.anInt4897 = local31 - local16;
		local384.anInt4901 = local28 - local16;
		local384.anInt4895 = local255;
		local384.anInt4905 = local253;
		local384.anInt4896 = local31 + local16;
		Static238.aClass85_27.method2011(local384);
	}
}

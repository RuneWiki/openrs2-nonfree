import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method5298(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static307.method4285(-1, arg0, -1, arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method5299(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class307 local9 = Static17.aClass307Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static17.aClass307Array1[local11] = Static17.aClass307Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class307(arg5, arg0, arg2, arg3, arg1, arg6, arg7, arg4);
		} else {
			local9.method6514(arg0, arg1, arg7, arg4, arg3, arg6, arg2, arg5);
		}
		Static17.aClass307Array1[0] = local9;
		Static214.anInt4121++;
		Static151.anInt2743 = Static233.anInt8002;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)[Lclient!gq;")
	public static Class128[] method5300() {
		return new Class128[] { Static420.aClass128_1, Static420.aClass128_2, Static420.aClass128_3, Static420.aClass128_4, Static420.aClass128_5, Static420.aClass128_6, Static420.aClass128_7, Static420.aClass128_8, Static420.aClass128_9, Static420.aClass128_10, Static420.aClass128_11, Static420.aClass128_12, Static420.aClass128_13, Static420.aClass128_14 };
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!wt;B)I")
	public static int method5301(@OriginalArg(0) Class1_Sub51 arg0) {
		@Pc(7) String local7 = Static243.method3634(arg0);
		@Pc(9) int[] local9 = null;
		if (Static195.method2977(arg0.anInt9638)) {
			local9 = Static175.aClass114_4.method2217((int) arg0.aLong302).anIntArray503;
		} else if (arg0.anInt9643 != -1) {
			local9 = Static175.aClass114_4.method2217(arg0.anInt9643).anIntArray503;
		} else if (Static416.method5728(arg0.anInt9638)) {
			@Pc(85) Class1_Sub42 local85 = (Class1_Sub42) Static84.aClass187_40.method3797((long) arg0.aLong302);
			if (local85 != null) {
				@Pc(90) Class8_Sub3_Sub3_Sub1_Sub2 local90 = local85.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				@Pc(93) Class20 local93 = local90.aClass20_1;
				if (local93.anIntArray40 != null) {
					local93 = local93.method284(Static430.aClass321_1);
				}
				if (local93 != null) {
					local9 = local93.anIntArray39;
				}
			}
		} else if (Static270.method3853(arg0.anInt9638)) {
			@Pc(54) Class95 local54;
			if (arg0.anInt9638 == 1001) {
				local54 = Static518.aClass96_4.method1925((int) arg0.aLong302);
			} else {
				local54 = Static518.aClass96_4.method1925((int) (arg0.aLong302 >>> 32 & 0x7FFFFFFFL));
			}
			if (local54.anIntArray208 != null) {
				local54 = local54.method1922(Static430.aClass321_1);
			}
			if (local54 != null) {
				local9 = local54.anIntArray207;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static31.method424(local9);
		}
		@Pc(141) int local141 = Static373.aClass334_13.method7358(Static104.aClass22Array5, local7);
		if (arg0.aBoolean753) {
			local141 += Static200.aClass22_20.E() + 4;
		}
		return local141;
	}
}

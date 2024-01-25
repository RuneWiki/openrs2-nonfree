import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "[S")
	private static final short[] aShortArray30 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "[S")
	private static final short[] aShortArray31 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[S")
	private static final short[] aShortArray32 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "[S")
	private static final short[] aShortArray33 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { aShortArray33, aShortArray31, aShortArray32, aShortArray30 };

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!ip;I)I")
	public static int method2324(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		@Pc(15) String local15 = Static481.method7189(arg0);
		@Pc(17) int[] local17 = null;
		if (Static13.method8716(arg0.anInt4577)) {
			local17 = Static320.aClass53_2.method1770((int) arg0.aLong136).anIntArray50;
		} else if (arg0.anInt4575 != -1) {
			local17 = Static320.aClass53_2.method1770(arg0.anInt4575).anIntArray50;
		} else if (Static582.method8235(arg0.anInt4577)) {
			@Pc(49) Class3_Sub28 local49 = (Class3_Sub28) Static551.aClass280_43.method7107((long) arg0.aLong136);
			if (local49 != null) {
				@Pc(54) Class4_Sub1_Sub2_Sub1_Sub1 local54 = local49.aClass4_Sub1_Sub2_Sub1_Sub1_2;
				@Pc(57) Class109 local57 = local54.aClass109_1;
				if (local57.anIntArray147 != null) {
					local57 = local57.method2813(Static373.aClass150_1);
				}
				if (local57 != null) {
					local17 = local57.anIntArray146;
				}
			}
		} else if (Static213.method3609(arg0.anInt4577)) {
			@Pc(91) Class299 local91;
			if (arg0.anInt4577 == 1009) {
				local91 = Static105.aClass302_1.method7466((int) arg0.aLong136);
			} else {
				local91 = Static105.aClass302_1.method7466((int) (arg0.aLong136 >>> 32 & 0x7FFFFFFFL));
			}
			if (local91.anIntArray533 != null) {
				local91 = local91.method7418(Static373.aClass150_1);
			}
			if (local91 != null) {
				local17 = local91.anIntArray537;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static291.method4631(local17);
		}
		@Pc(143) int local143 = Static489.aClass282_12.method7138(Static167.aClass24Array8, local15);
		if (arg0.aBoolean307) {
			local143 += Static287.aClass24_15.method8558() + 4;
		}
		return local143;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	public static void method2325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static447.method6931(arg0, arg1);
	}
}

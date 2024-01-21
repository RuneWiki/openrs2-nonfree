import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
	public static int anInt1477;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[S")
	public static final short[] aShortArray7 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_602 = Static187.method3089("You have only just left another world)3");

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!vd;")
	public static Class92 aClass92_603 = aClass92_602;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_604 = Static187.method3089("<col=ffb000>");

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_605 = Static187.method3089("<col=c0ff00>");

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt1475 = 0;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array12 = new Class92[1000];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!ka;)V")
	public static void method1001(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static63.aClass96_39 != null) {
			@Pc(25) int local25;
			try {
				Static63.aClass96_39.method3341(0L);
				Static63.aClass96_39.method3340(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method3037(local13, 24);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[SII[Lclient!vd;)V")
	public static void method1002(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) Class92 local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg2; local46++) {
			if (local20 == null || arg3[local46] != null && arg3[local46].method3209(local20) < (local46 & 0x1)) {
				@Pc(72) Class92 local72 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local72;
				@Pc(86) short local86 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local86;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method1002(arg0, arg1, local16 - 1, arg3);
		method1002(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!ba;)Z")
	public static boolean method1003(@OriginalArg(1) Class11 arg0) {
		if (arg0.anInt315 == 205) {
			Static25.anInt597 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JBZI)Lclient!vd;")
	public static Class92 method1005(@OriginalArg(0) long arg0) {
		@Pc(26) int local26 = 1;
		@Pc(31) long local31 = arg0 / (long) 10;
		while (local31 != 0L) {
			local31 /= 10;
			local26++;
		}
		@Pc(50) int local50 = local26;
		if (arg0 < 0L) {
			local50 = local26 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local50];
		if (arg0 < 0L) {
			local62[0] = 45;
		}
		for (@Pc(80) int local80 = 0; local80 < local26; local80++) {
			@Pc(88) int local88 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local88 < 0) {
				local88 = -local88;
			}
			if (local88 > 9) {
				local88 += 39;
			}
			local62[local50 - local80 - 1] = (byte) (local88 + 48);
		}
		@Pc(124) Class92 local124 = new Class92();
		local124.aByteArray52 = local62;
		local124.anInt4244 = local50;
		return local124;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	public static boolean method1007() {
		try {
			if (Static52.anInt1299 == 2) {
				if (Static9.aClass1_Sub21_2 == null) {
					Static9.aClass1_Sub21_2 = Static215.method2088(Static37.aClass3_5, Static154.anInt3199, Static79.anInt1768);
					if (Static9.aClass1_Sub21_2 == null) {
						return false;
					}
				}
				if (Static123.aClass79_1 == null) {
					Static123.aClass79_1 = new Class79(Static165.aClass3_31, Static151.aClass3_27);
				}
				if (Static16.aClass1_Sub12_Sub3_2.method2236(Static9.aClass1_Sub21_2, Static28.aClass3_1, Static123.aClass79_1)) {
					Static16.aClass1_Sub12_Sub3_2.method2222();
					Static16.aClass1_Sub12_Sub3_2.method2253(Static154.anInt3195);
					Static16.aClass1_Sub12_Sub3_2.method2235(Static98.aBoolean123, Static9.aClass1_Sub21_2);
					Static52.anInt1299 = 0;
					Static37.aClass3_5 = null;
					Static9.aClass1_Sub21_2 = null;
					Static123.aClass79_1 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static16.aClass1_Sub12_Sub3_2.method2231();
			Static37.aClass3_5 = null;
			Static52.anInt1299 = 0;
			Static9.aClass1_Sub21_2 = null;
			Static123.aClass79_1 = null;
		}
		return false;
	}
}

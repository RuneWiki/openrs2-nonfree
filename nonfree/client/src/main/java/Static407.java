import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_11 = new Class27(1, 2, 2, 0);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	public static void method2205() {
		for (@Pc(1) int local1 = 0; local1 < Static409.aClass10Array1.length; local1++) {
			Static409.aClass10Array1[local1].method199();
		}
		Static409.aClass10Array1 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(27) int local27 = arg0[arg1 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static295.aCharArray4[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ha;IBILclient!kq;I)V")
	public static void method2214(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class199 arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(7) int local7 = 127; local7 >= 0; local7--) {
				Static650.method8679(false, true);
				@Pc(29) int local29 = (local3 & 0x7) << 7 | arg4 << 10 & 0xFC00 | local7 & 0x7F;
				@Pc(33) int local33 = Static411.anIntArray448[local29];
				Static373.method4918(true, false);
				arg0.aa((local7 * arg3.anInt5035 >> 7) + arg2, arg1 - -((-local3 + 7) * arg3.anInt4994 >> 3), (arg3.anInt5035 >> 7) + 1, (arg3.anInt4994 >> 3) + 1, local33, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	public static void method2216() {
		if (Static581.aClass4_Sub5_Sub12_1 != null) {
			Static581.aClass4_Sub5_Sub12_1 = null;
			Static66.method1452(Static485.anInt7635, Static398.anInt5803, Static587.anInt9057, Static4.anInt76);
		}
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "()V")
	public static void method2220() {
		for (@Pc(1) int local1 = Static117.anInt2243; local1 < Static539.anInt8345; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static51.anInt1108; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static245.anInt7888; local7++) {
					@Pc(16) Class73 local16 = Static267.aClass73ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class3_Sub1_Sub4 local21 = local16.aClass3_Sub1_Sub4_1;
						@Pc(24) Class3_Sub1_Sub4 local24 = local16.aClass3_Sub1_Sub4_2;
						if (local21 != null && local21.method8505()) {
							Static131.method2328(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8505()) {
								Static131.method2328(local24, local1, local4, local7, 1, 1);
								local24.method8491(local21, Static246.aClass33_6, 0, 0, false, 0);
								local24.method8504();
							}
							local21.method8504();
						}
						for (@Pc(68) Class144 local68 = local16.aClass144_1; local68 != null; local68 = local68.aClass144_2) {
							@Pc(72) Class3_Sub1_Sub2 local72 = local68.aClass3_Sub1_Sub2_1;
							if (local72 != null && local72.method8505()) {
								Static131.method2328(local72, local1, local4, local7, local72.aShort123 + 1 - local72.aShort124, local72.aShort122 - local72.aShort125 + 1);
								local72.method8504();
							}
						}
						@Pc(108) Class3_Sub1_Sub5 local108 = local16.aClass3_Sub1_Sub5_1;
						if (local108 != null && local108.method8505()) {
							Static317.method4377(local108, local1, local4, local7);
							local108.method8504();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method2223(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static290.anInt4596 = arg0;
		Static649.aClass3_Sub7Array1 = new Class3_Sub7[Static619.anIntArray668[Static290.anInt4596] + 1];
		Static470.anInt7470 = 0;
		Static101.anInt2072 = 0;
	}
}

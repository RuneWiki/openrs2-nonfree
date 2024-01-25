import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wi", name = "J", descriptor = "Lclient!uw;")
	public static final Class350 aClass350_10 = new Class350("", 12);

	@OriginalMember(owner = "client!wi", name = "P", descriptor = "[S")
	private static final short[] aShortArray144 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!wi", name = "Q", descriptor = "[S")
	private static final short[] aShortArray145 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "[S")
	private static final short[] aShortArray146 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wi", name = "S", descriptor = "[[S")
	public static final short[][] aShortArrayArray24 = new short[][] { aShortArray146, aShortArray144, aShortArray145 };

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIIILclient!qo;ZB)Lclient!eba;")
	public static Class85_Sub1_Sub1 method9127(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub3 arg5) {
		if (arg5.aBoolean620 || Static468.method7401(arg4) && Static468.method7401(arg3)) {
			return new Class85_Sub1_Sub1(arg5, 3553, arg4, arg3, false, arg0, arg2, 0);
		} else if (arg5.aBoolean629) {
			return new Class85_Sub1_Sub1(arg5, 34037, arg4, arg3, false, arg0, arg2, 0);
		} else {
			return new Class85_Sub1_Sub1(arg5, arg4, arg3, Static231.method4407(arg4), Static231.method4407(arg3), arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V")
	public static void method9129() {
		if (Static190.anInt4460 < 0) {
			return;
		}
		@Pc(13) long local13 = Static277.method5091();
		Static190.anInt4460 = (int) ((long) Static190.anInt4460 + Static476.aLong218 - local13);
		if (Static190.anInt4460 > 0) {
			@Pc(33) int local33 = (Static190.anInt4460 << 8) / Static486.anInt9019;
			@Pc(38) int local38 = 255 - local33;
			@Pc(43) float local43 = (float) local33 / 255.0F;
			@Pc(47) float local47 = 1.0F - local43;
			Static86.anInt2582 = (local38 * (Static436.aClass41_1.anInt1876 & 0xFF00FF) + (Static253.anInt9842 & 0xFF00FF) * local33 & 0xFF00FF00) + (local33 * (Static253.anInt9842 & 0xFF00) + (Static436.aClass41_1.anInt1876 & 0xFF00) * local38 & 0xFF0000) >>> 8;
			Static392.aFloat164 = Static628.aFloat212 + local47 * (Static436.aClass41_1.aFloat75 - Static628.aFloat212);
			Static138.aFloat102 = (Static436.aClass41_1.aFloat73 - Static246.aFloat147) * local47 + Static246.aFloat147;
			Static234.anInt5124 = local33 * Static555.anInt9949 + Static436.aClass41_1.anInt1878 * local38 >> 8;
			Static414.aFloat167 = Static3.aFloat208 + (Static436.aClass41_1.aFloat74 - Static3.aFloat208) * local47;
			Static535.aFloat203 = Static279.aFloat168 + local47 * (Static436.aClass41_1.aFloat72 - Static279.aFloat168);
			Static457.anInt8404 = (local33 * (Static599.anInt10552 & 0xFF00) + (Static436.aClass41_1.anInt1880 & 0xFF00) * local38 & 0xFF0000) + (local33 * (Static599.anInt10552 & 0xFF00FF) + (local38 * (Static436.aClass41_1.anInt1880 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static147.aFloat105 = Static58.aFloat211 + local47 * (Static436.aClass41_1.aFloat70 - Static58.aFloat211);
			Static581.aFloat209 = Static536.aFloat204 + (Static436.aClass41_1.aFloat71 - Static536.aFloat204) * local47;
			if (Static90.aClass78_2 != Static436.aClass41_1.aClass78_1) {
				Static409.aClass78_3 = Static273.aClass20_8.method7309(Static90.aClass78_2, Static436.aClass41_1.aClass78_1, local47, Static409.aClass78_3);
			}
		} else {
			Static409.aClass78_3 = Static436.aClass41_1.aClass78_1;
			Static535.aFloat203 = Static436.aClass41_1.aFloat72;
			Static138.aFloat102 = Static436.aClass41_1.aFloat73;
			Static392.aFloat164 = Static436.aClass41_1.aFloat75;
			Static234.anInt5124 = Static436.aClass41_1.anInt1878;
			Static581.aFloat209 = Static436.aClass41_1.aFloat71;
			Static147.aFloat105 = Static436.aClass41_1.aFloat70;
			Static190.anInt4460 = -1;
			Static457.anInt8404 = Static436.aClass41_1.anInt1880;
			Static86.anInt2582 = Static436.aClass41_1.anInt1876;
			Static414.aFloat167 = Static436.aClass41_1.aFloat74;
		}
		Static476.aLong218 = local13;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(III)Lclient!un;")
	public static Class3_Sub1_Sub2 method9130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!cea;)Ljava/lang/String;")
	public static String method9131(@OriginalArg(1) Class2_Sub11 arg0) {
		return Static34.method808(arg0);
	}
}

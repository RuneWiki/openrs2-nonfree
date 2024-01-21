import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!la;")
	public static Class17 aClass17_22;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public static int anInt1633 = 0;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!v;")
	private static Class76 aClass76_677 = Static134.method2017("flash1:");

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_678 = Static134.method2017("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_679 = aClass76_677;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_680 = aClass76_677;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_682 = Static134.method2017("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_681 = aClass76_682;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_683 = Static134.method2017(")1p");

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public static int anInt1641 = -1;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!v;")
	public static Class76 aClass76_684 = Static134.method2017("title_mute");

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	public static int anInt1642 = -1;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt1643 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[Lclient!v;)[Lclient!v;")
	public static Class76[] method1091(@OriginalArg(1) Class76[] arg0) {
		@Pc(13) Class76[] local13 = new Class76[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static59.method1017(new Class76[] { method1092(local15), Static102.aClass76_1081 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static59.method1017(new Class76[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)Lclient!v;")
	public static Class76 method1092(@OriginalArg(1) int arg0) {
		return Static59.method1016(arg0, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1093() {
		while (true) {
			@Pc(10) Class78 local10 = Static8.aClass78_1;
			@Pc(19) Class4_Sub5 local19;
			synchronized (Static8.aClass78_1) {
				local19 = (Class4_Sub5) Static12.aClass78_3.method1919();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass17_Sub1_5.method304(false, (int) local19.aLong99, local19.aByteArray3, local19.aClass58_1);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	public static void method1094(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static104.aClass4_Sub4_Sub5_Sub2_4.anIntArray166;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(40) int local40;
		@Pc(42) int local42;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local40 = (103 - local29) * 2048 + 24628;
			for (local42 = 1; local42 < 103; local42++) {
				if ((Static62.aByteArrayArrayArray4[arg0][local42][local29] & 0x18) == 0) {
					Static54.aClass81_10.method1998(local4, local40, arg0, local42, local29);
				}
				if (arg0 < 3 && (Static62.aByteArrayArrayArray4[arg0 + 1][local42][local29] & 0x8) != 0) {
					Static54.aClass81_10.method1998(local4, local40, arg0 + 1, local42, local29);
				}
				local40 += 4;
			}
		}
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		local42 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static104.aClass4_Sub4_Sub5_Sub2_4.method912();
		@Pc(152) int local152;
		for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
			for (local152 = 1; local152 < 103; local152++) {
				if ((Static62.aByteArrayArrayArray4[arg0][local152][local148] & 0x18) == 0) {
					Static103.method1598(local152, arg0, local42, local148, local40);
				}
				if (arg0 < 3 && (Static62.aByteArrayArrayArray4[arg0 + 1][local152][local148] & 0x8) != 0) {
					Static103.method1598(local152, arg0 + 1, local42, local148, local40);
				}
			}
		}
		Static101.anInt2304 = 0;
		for (local152 = 0; local152 < 104; local152++) {
			for (@Pc(216) int local216 = 0; local216 < 104; local216++) {
				@Pc(224) int local224 = Static54.aClass81_10.method1966(Static124.anInt2712, local152, local216);
				if (local224 != 0) {
					local224 = local224 >> 14 & 0x7FFF;
					@Pc(237) int local237 = Static104.method1600(local224).anInt1527;
					if (local237 >= 0) {
						@Pc(244) int local244 = local216;
						@Pc(246) int local246 = local152;
						if (local237 != 22 && local237 != 29 && local237 != 34 && local237 != 36 && local237 != 46 && local237 != 47 && local237 != 48) {
							@Pc(278) int[][] local278 = Static52.aClass50Array1[Static124.anInt2712].anIntArrayArray16;
							for (@Pc(280) int local280 = 0; local280 < 10; local280++) {
								@Pc(287) int local287 = (int) (Math.random() * 4.0D);
								if (local287 == 0 && local246 > 0 && local246 > local152 - 3 && (local278[local246 - 1][local244] & 0x12C0108) == 0) {
									local246--;
								}
								if (local287 == 1 && local246 < 103 && local246 < local152 + 3 && (local278[local246 + 1][local244] & 0x12C0180) == 0) {
									local246++;
								}
								if (local287 == 2 && local244 > 0 && local244 > local216 - 3 && (local278[local246][local244 - 1] & 0x12C0102) == 0) {
									local244--;
								}
								if (local287 == 3 && local244 < 103 && local244 < local216 + 3 && (local278[local246][local244 + 1] & 0x12C0120) == 0) {
									local244++;
								}
							}
						}
						Static32.aClass4_Sub4_Sub5_Sub2Array13[Static101.anInt2304] = Static54.aClass4_Sub4_Sub5_Sub2Array47[local237];
						Static67.anIntArray235[Static101.anInt2304] = local246;
						Static104.anIntArray323[Static101.anInt2304] = local244;
						Static101.anInt2304++;
					}
				}
			}
		}
		Static118.aClass43_1.method1906();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!dd;)V")
	public static void method1095(@OriginalArg(1) Class4_Sub8 arg0) {
		if (Static34.anInt962 == arg0.anInt480) {
			Static70.aBooleanArray9[arg0.anInt487] = true;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method1096() {
		aClass76_684 = null;
		aClass76_683 = null;
		aClass76_677 = null;
		anIntArray221 = null;
		aClass76_681 = null;
		aClass76_678 = null;
		aClass17_22 = null;
		aClass76_680 = null;
		aClass76_682 = null;
		aBigInteger2 = null;
		aClass76_679 = null;
	}
}

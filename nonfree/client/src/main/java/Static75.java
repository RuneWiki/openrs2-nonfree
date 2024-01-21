import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt1872;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!oa;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!qc;")
	private static Class60 aClass60_731 = Static121.method2047("Drop");

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_732 = Static121.method2047("VOLL");

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_733 = aClass60_731;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!qc;")
	private static Class60 aClass60_736 = Static121.method2047("Login limit exceeded)3");

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_734 = aClass60_736;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean75 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1403() {
		aClass54_4 = null;
		aClass60_734 = null;
		aClass60_732 = null;
		aClass60_731 = null;
		aClass60_733 = null;
		aClass60_736 = null;
		aBigInteger1 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jb;IILclient!re;)V")
	public static void method1404(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub13 arg2) {
		@Pc(9) Class4_Sub20 local9 = new Class4_Sub20();
		local9.anInt2549 = arg2.method1223();
		local9.anInt2557 = arg2.method1215();
		local9.anIntArray283 = new int[local9.anInt2549];
		local9.anIntArray282 = new int[local9.anInt2549];
		local9.aClass30Array1 = new Class30[local9.anInt2549];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt2549][][];
		local9.anIntArray281 = new int[local9.anInt2549];
		local9.aClass30Array2 = new Class30[local9.anInt2549];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt2549; local58++) {
			try {
				@Pc(66) int local66 = arg2.method1223();
				@Pc(88) String local88;
				@Pc(97) String local97;
				@Pc(99) int local99;
				if (local66 == 0 || local66 == 1 || local66 == 2) {
					local88 = new String(arg2.method1249().method1655());
					local97 = new String(arg2.method1249().method1655());
					local99 = 0;
					if (local66 == 1) {
						local99 = arg2.method1215();
					}
					local9.anIntArray282[local58] = local66;
					local9.anIntArray281[local58] = local99;
					local9.aClass30Array2[local58] = arg0.method986(local97, Static92.method1615(local88));
				} else if (local66 == 3 || local66 == 4) {
					local88 = new String(arg2.method1249().method1655());
					local97 = new String(arg2.method1249().method1655());
					local99 = arg2.method1223();
					@Pc(160) String[] local160 = new String[local99];
					for (@Pc(162) int local162 = 0; local162 < local99; local162++) {
						local160[local162] = new String(arg2.method1249().method1655());
					}
					@Pc(182) byte[][] local182 = new byte[local99][];
					@Pc(193) int local193;
					if (local66 == 3) {
						for (@Pc(187) int local187 = 0; local187 < local99; local187++) {
							local193 = arg2.method1215();
							local182[local187] = new byte[local193];
							arg2.method1226(local193, local182[local187]);
						}
					}
					local9.anIntArray282[local58] = local66;
					@Pc(222) Class[] local222 = new Class[local99];
					for (local193 = 0; local193 < local99; local193++) {
						local222[local193] = Static92.method1615(local160[local193]);
					}
					local9.aClass30Array1[local58] = arg0.method983(local222, local97, Static92.method1615(local88));
					local9.aByteArrayArrayArray6[local58] = local182;
				}
			} catch (@Pc(259) ClassNotFoundException local259) {
				local9.anIntArray283[local58] = -1;
			} catch (@Pc(266) SecurityException local266) {
				local9.anIntArray283[local58] = -2;
			} catch (@Pc(273) NullPointerException local273) {
				local9.anIntArray283[local58] = -3;
			} catch (@Pc(280) Exception local280) {
				local9.anIntArray283[local58] = -4;
			} catch (@Pc(287) Throwable local287) {
				local9.anIntArray283[local58] = -5;
			}
		}
		Static112.aClass70_17.method1931(local9);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!lc;I)Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 method1405(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2) {
		return Static13.method279(arg2, arg1, arg0) ? Static55.method1027() : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!qc;I)V")
	public static void method1406(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(13) Class60 local13 = arg0.method1668().method1651();
		for (@Pc(15) int local15 = 0; local15 < Static43.anInt1107; local15++) {
			@Pc(23) Class4_Sub4_Sub1_Sub2_Sub2 local23 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local15]];
			if (local23 != null && local23.aClass60_1066 != null && local23.aClass60_1066.method1661(local13)) {
				local7 = true;
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local23.anIntArray288[0], 1, 0, local23.anIntArray286[0], false);
				if (arg1 == 1) {
					Static56.aClass4_Sub13_Sub1_1.method1265(188);
					Static56.aClass4_Sub13_Sub1_1.method1220(Static94.anIntArray231[local15]);
				}
				if (arg1 == 4) {
					Static56.aClass4_Sub13_Sub1_1.method1265(60);
					Static56.aClass4_Sub13_Sub1_1.method1220(Static94.anIntArray231[local15]);
				}
				break;
			}
		}
		if (!local7) {
			Static73.method1386(Static125.method2072(new Class60[] { Static81.aClass60_796, local13 }), 0, Static22.aClass60_241);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	public static void method1407(@OriginalArg(0) int arg0) {
		if (Static58.aClass4_Sub22Array1 != null && arg0 >= 0 && Static58.aClass4_Sub22Array1.length > arg0 && Static58.aClass4_Sub22Array1[arg0] != null) {
			Static56.aClass4_Sub13_Sub1_1.method1265(145);
			Static56.aClass4_Sub13_Sub1_1.method1242(Static58.aClass4_Sub22Array1[arg0].aLong100);
		}
	}
}

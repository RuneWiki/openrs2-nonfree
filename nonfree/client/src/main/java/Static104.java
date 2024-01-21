import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt3005;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	public static int anInt3013;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Lclient!nc;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1262 = Static59.method1195(" (X");

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1263 = Static59.method1195("(U(Y");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public static int anInt3010 = 78;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	public static int anInt3014 = 0;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!eb;")
	public static Class17 aClass17_49 = new Class17(64);

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1266 = Static59.method1195("Select a world");

	@OriginalMember(owner = "client!s", name = "A", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1264 = aClass60_1266;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1265 = Static59.method1195("level)2");

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!s", name = "E", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1267 = aClass60_1265;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1268 = Static59.method1195("blinken1:");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ha;IILclient!ca;)V")
	public static void method2019(@OriginalArg(0) Class25_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(3) Class3_Sub20 local3 = new Class3_Sub20();
		local3.aLong107 = arg1;
		local3.aClass25_Sub1_16 = arg0;
		local3.aClass13_4 = arg2;
		local3.anInt2997 = 1;
		@Pc(22) Class5 local22 = Static28.aClass5_22;
		synchronized (Static28.aClass5_22) {
			Static28.aClass5_22.method87(local3);
		}
		Static61.method1248();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZB)V")
	public static void method2020(@OriginalArg(0) boolean arg0) {
		Static42.aBoolean45 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(143) int local143;
		if (!Static42.aBoolean45) {
			local13 = Static79.aClass3_Sub12_Sub1_1.method1955();
			local17 = Static79.aClass3_Sub12_Sub1_1.method1953();
			local25 = (Static58.anInt1794 - Static79.aClass3_Sub12_Sub1_1.anInt2886) / 16;
			Static103.anIntArrayArray74 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static103.anIntArrayArray74[local31][local35] = Static79.aClass3_Sub12_Sub1_1.method1933();
				}
			}
			local35 = Static79.aClass3_Sub12_Sub1_1.method1955();
			local65 = Static79.aClass3_Sub12_Sub1_1.method1925();
			local69 = Static79.aClass3_Sub12_Sub1_1.method1953();
			Static12.anIntArray52 = new int[local25];
			@Pc(74) boolean local74 = false;
			if ((local35 / 8 == 48 || local35 / 8 == 49) && local69 / 8 == 48) {
				local74 = true;
			}
			Static43.anIntArray161 = new int[local25];
			Static82.anIntArray265 = new int[local25];
			Static28.aByteArrayArray16 = new byte[local25][];
			if (local35 / 8 == 48 && local69 / 8 == 148) {
				local74 = true;
			}
			Static48.aByteArrayArray11 = new byte[local25][];
			local25 = 0;
			for (local127 = (local35 - 6) / 8; local127 <= (local35 + 6) / 8; local127++) {
				for (local135 = (local69 - 6) / 8; local135 <= (local69 + 6) / 8; local135++) {
					local143 = local135 + (local127 << 8);
					if (!local74 || local135 != 49 && local135 != 149 && local135 != 147 && local127 != 50 && (local127 != 49 || local135 != 47)) {
						Static12.anIntArray52[local25] = local143;
						Static82.anIntArray265[local25] = Static112.aClass25_Sub1_17.method920(Static60.method1211(new Class60[] { Static16.aClass60_265, Static65.method1341(local127), Static72.aClass60_964, Static65.method1341(local135) }));
						Static43.anIntArray161[local25] = Static112.aClass25_Sub1_17.method920(Static60.method1211(new Class60[] { Static83.aClass60_1100, Static65.method1341(local127), Static72.aClass60_964, Static65.method1341(local135) }));
						local25++;
					}
				}
			}
			Static129.method2294(local35, local69, local13, local17, local65);
			return;
		}
		local13 = Static79.aClass3_Sub12_Sub1_1.method1940();
		local17 = Static79.aClass3_Sub12_Sub1_1.method1955();
		local25 = Static79.aClass3_Sub12_Sub1_1.method1940();
		local31 = Static79.aClass3_Sub12_Sub1_1.method1962();
		local35 = Static79.aClass3_Sub12_Sub1_1.method1963();
		Static79.aClass3_Sub12_Sub1_1.method1979();
		@Pc(298) int local298;
		for (local65 = 0; local65 < 4; local65++) {
			for (local69 = 0; local69 < 13; local69++) {
				for (local298 = 0; local298 < 13; local298++) {
					local127 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
					if (local127 == 1) {
						Static127.anIntArrayArrayArray6[local65][local69][local298] = Static79.aClass3_Sub12_Sub1_1.method1982(26);
					} else {
						Static127.anIntArrayArrayArray6[local65][local69][local298] = -1;
					}
				}
			}
		}
		Static79.aClass3_Sub12_Sub1_1.method1975();
		local69 = (Static58.anInt1794 - Static79.aClass3_Sub12_Sub1_1.anInt2886) / 16;
		Static103.anIntArrayArray74 = new int[local69][4];
		for (local298 = 0; local298 < local69; local298++) {
			for (local127 = 0; local127 < 4; local127++) {
				Static103.anIntArrayArray74[local298][local127] = Static79.aClass3_Sub12_Sub1_1.method1950();
			}
		}
		Static28.aByteArrayArray16 = new byte[local69][];
		Static82.anIntArray265 = new int[local69];
		Static48.aByteArrayArray11 = new byte[local69][];
		Static12.anIntArray52 = new int[local69];
		Static43.anIntArray161 = new int[local69];
		local69 = 0;
		for (local127 = 0; local127 < 4; local127++) {
			for (local135 = 0; local135 < 13; local135++) {
				for (local143 = 0; local143 < 13; local143++) {
					@Pc(420) int local420 = Static127.anIntArrayArrayArray6[local127][local135][local143];
					if (local420 != -1) {
						@Pc(430) int local430 = local420 >> 14 & 0x3FF;
						@Pc(436) int local436 = local420 >> 3 & 0x7FF;
						@Pc(447) int local447 = (local430 / 8 << 8) + (local436 / 8);
						for (@Pc(449) int local449 = 0; local449 < local69; local449++) {
							if (Static12.anIntArray52[local449] == local447) {
								local447 = -1;
								break;
							}
						}
						if (local447 != -1) {
							@Pc(477) int local477 = local447 >> 8 & 0xFF;
							@Pc(481) int local481 = local447 & 0xFF;
							Static12.anIntArray52[local69] = local447;
							Static82.anIntArray265[local69] = Static112.aClass25_Sub1_17.method920(Static60.method1211(new Class60[] { Static16.aClass60_265, Static65.method1341(local477), Static72.aClass60_964, Static65.method1341(local481) }));
							Static43.anIntArray161[local69] = Static112.aClass25_Sub1_17.method920(Static60.method1211(new Class60[] { Static83.aClass60_1100, Static65.method1341(local477), Static72.aClass60_964, Static65.method1341(local481) }));
							local69++;
						}
					}
				}
			}
		}
		Static129.method2294(local17, local25, local13, local35, local31);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method2021() {
		aClass60_1266 = null;
		aBigInteger2 = null;
		aClass17_49 = null;
		aClass60_1262 = null;
		aClass60_1267 = null;
		aClass60_1263 = null;
		aClass60_1264 = null;
		aClass60_1268 = null;
		aClass60_1265 = null;
		aClass47_3 = null;
	}
}

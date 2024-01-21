import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!v", name = "v", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_22;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array11;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	public static int anInt2915;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1163 = Static121.method2047("Your account is already logged in)3");

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
	public static int[] anIntArray321 = new int[1000];

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1164 = aClass60_1163;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "[J")
	public static long[] aLongArray13 = new long[200];

	@OriginalMember(owner = "client!v", name = "A", descriptor = "[J")
	public static long[] aLongArray14 = new long[32];

	@OriginalMember(owner = "client!v", name = "D", descriptor = "Lclient!re;")
	public static Class4_Sub13 aClass4_Sub13_5 = new Class4_Sub13(new byte[5000]);

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1165 = Static121.method2047("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1166 = Static121.method2047(" )2>");

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method2058() {
		aClass4_Sub4_Sub3_Sub1Array11 = null;
		anIntArray321 = null;
		aLongArray14 = null;
		aLongArray13 = null;
		aClass60_1164 = null;
		aClass60_1163 = null;
		aClass40_Sub1_22 = null;
		aByteArrayArrayArray7 = null;
		aClass60_1166 = null;
		aClass60_1165 = null;
		aClass4_Sub13_5 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method2059() {
		Static43.anIntArray92 = new int[33];
		Static113.anIntArray298 = new int[151];
		Static94.anIntArray230 = new int[151];
		Static4.anIntArray4 = new int[33];
		@Pc(25) int local25;
		@Pc(23) int local23;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 0;
			local25 = 999;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static89.aClass4_Sub4_Sub3_Sub1_5.aByteArray24[local27 + Static89.aClass4_Sub4_Sub3_Sub1_5.anInt635 * local19] == 0) {
					if (local25 == 999) {
						local25 = local27;
					}
				} else if (local25 != 999) {
					local23 = local27;
					break;
				}
			}
			Static4.anIntArray4[local19] = local25;
			Static43.anIntArray92[local19] = local23 - local25;
		}
		for (local25 = 5; local25 < 156; local25++) {
			local27 = 0;
			local23 = 999;
			for (@Pc(84) int local84 = 25; local84 < 172; local84++) {
				if (Static89.aClass4_Sub4_Sub3_Sub1_5.aByteArray24[Static89.aClass4_Sub4_Sub3_Sub1_5.anInt635 * local25 + local84] == 0 && (local84 > 34 || local25 > 34)) {
					if (local23 == 999) {
						local23 = local84;
					}
				} else if (local23 != 999) {
					local27 = local84;
					break;
				}
			}
			Static113.anIntArray298[local25 - 5] = local23 - 25;
			Static94.anIntArray230[local25 - 5] = local27 - local23;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lclient!of;")
	public static Class4_Sub4_Sub11 method2060(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub11 local10 = (Class4_Sub4_Sub11) Static67.aClass48_63.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static114.aClass40_81.method1110(arg0, 9);
		local10 = new Class4_Sub4_Sub11();
		local10.anInt2001 = arg0;
		if (local25 != null) {
			local10.method1487(new Class4_Sub13(local25));
		}
		local10.method1488();
		Static67.aClass48_63.method1392(local10, (long) arg0);
		return local10;
	}
}

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1118 = Static2.method59("Regelversto-8 melden");

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!i;")
	public static Class32 aClass32_52 = new Class32(64);

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1123 = Static2.method59("Classic");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1119 = aClass80_1123;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1122 = Static2.method59("yellow:");

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1120 = aClass80_1122;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1121 = aClass80_1122;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	public static int anInt2942 = 0;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt2945 = -1;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	public static int anInt2948 = 1;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	public static int anInt2950 = -1;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1124 = Static2.method59("@yel@");

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1125 = Static2.method59("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!pb;IILclient!ce;)V")
	public static void method1863(@OriginalArg(0) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub1 arg2) {
		@Pc(7) Class2_Sub12 local7 = new Class2_Sub12();
		local7.aClass11_Sub1_12 = arg2;
		local7.anInt1981 = 1;
		local7.aLong91 = arg1;
		local7.aClass60_4 = arg0;
		@Pc(30) Class58 local30 = Static63.aClass58_8;
		synchronized (Static63.aClass58_8) {
			Static63.aClass58_8.method1294(local7);
		}
		Static43.method708();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!se;)V")
	public static void method1864(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		arg0.aBoolean169 = false;
		@Pc(17) Class2_Sub1_Sub8 local17;
		if (arg0.anInt2351 != -1) {
			local17 = Static93.method1443(arg0.anInt2351);
			if (local17 == null || local17.anIntArray176 == null) {
				arg0.anInt2351 = -1;
			} else {
				arg0.anInt2340++;
				if (local17.anIntArray176.length > arg0.anInt2350 && local17.anIntArray174[arg0.anInt2350] < arg0.anInt2340) {
					arg0.anInt2340 = 1;
					arg0.anInt2350++;
					Static21.method490(arg0.anInt2350, arg0.anInt2370, local17, arg0.anInt2324);
				}
				if (arg0.anInt2350 >= local17.anIntArray176.length) {
					arg0.anInt2350 = 0;
					arg0.anInt2340 = 0;
					Static21.method490(arg0.anInt2350, arg0.anInt2370, local17, arg0.anInt2324);
				}
			}
		}
		if (arg0.anInt2362 != -1 && arg0.anInt2379 <= Static10.anInt300) {
			if (arg0.anInt2372 < 0) {
				arg0.anInt2372 = 0;
			}
			@Pc(114) int local114 = Static106.method1805(arg0.anInt2362).anInt2199;
			if (local114 == -1) {
				arg0.anInt2362 = -1;
			} else {
				@Pc(121) Class2_Sub1_Sub8 local121 = Static93.method1443(local114);
				if (local121 == null || local121.anIntArray176 == null) {
					arg0.anInt2362 = -1;
				} else {
					arg0.anInt2343++;
					if (local121.anIntArray176.length > arg0.anInt2372 && local121.anIntArray174[arg0.anInt2372] < arg0.anInt2343) {
						arg0.anInt2343 = 1;
						arg0.anInt2372++;
						Static21.method490(arg0.anInt2372, arg0.anInt2370, local121, arg0.anInt2324);
					}
					if (local121.anIntArray176.length <= arg0.anInt2372 && (arg0.anInt2372 < 0 || arg0.anInt2372 >= local121.anIntArray176.length)) {
						arg0.anInt2362 = -1;
					}
				}
			}
		}
		if (arg0.anInt2374 != -1 && arg0.anInt2353 <= 1) {
			local17 = Static93.method1443(arg0.anInt2374);
			if (local17.anInt1347 == 1 && arg0.anInt2365 > 0 && arg0.anInt2366 <= Static10.anInt300 && arg0.anInt2383 < Static10.anInt300) {
				arg0.anInt2353 = 1;
				return;
			}
		}
		if (arg0.anInt2374 != -1 && arg0.anInt2353 == 0) {
			local17 = Static93.method1443(arg0.anInt2374);
			if (local17 == null || local17.anIntArray176 == null) {
				arg0.anInt2374 = -1;
			} else {
				arg0.anInt2358++;
				if (local17.anIntArray176.length > arg0.anInt2339 && arg0.anInt2358 > local17.anIntArray174[arg0.anInt2339]) {
					arg0.anInt2339++;
					arg0.anInt2358 = 1;
					Static21.method490(arg0.anInt2339, arg0.anInt2370, local17, arg0.anInt2324);
				}
				if (local17.anIntArray176.length <= arg0.anInt2339) {
					arg0.anInt2339 -= local17.anInt1352;
					arg0.anInt2361++;
					if (arg0.anInt2361 >= local17.anInt1351) {
						arg0.anInt2374 = -1;
					} else if (arg0.anInt2339 >= 0 && local17.anIntArray176.length > arg0.anInt2339) {
						Static21.method490(arg0.anInt2339, arg0.anInt2370, local17, arg0.anInt2324);
					} else {
						arg0.anInt2374 = -1;
					}
				}
				arg0.aBoolean169 = local17.aBoolean83;
			}
		}
		if (arg0.anInt2353 > 0) {
			arg0.anInt2353--;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([BLclient!wb;B)V")
	public static void method1865(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		if (arg1.aByteArray38[arg1.anInt2799] != 31 || arg1.aByteArray38[arg1.anInt2799 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		@Pc(34) Inflater local34 = new Inflater(true);
		local34.setInput(arg1.aByteArray38, arg1.anInt2799 + 10, arg1.aByteArray38.length + -10 + -arg1.anInt2799 - 8);
		try {
			local34.inflate(arg0);
		} catch (@Pc(59) DataFormatException local59) {
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1866() {
		aClass80_1120 = null;
		aClass80_1121 = null;
		aClass80_1118 = null;
		aClass80_1123 = null;
		aClass32_52 = null;
		aClass80_1119 = null;
		aClass80_1124 = null;
		aClass80_1122 = null;
		aClass80_1125 = null;
	}
}

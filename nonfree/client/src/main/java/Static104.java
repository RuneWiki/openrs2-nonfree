import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!fd;")
	public static Class24 aClass24_28;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!fd;")
	public static Class24 aClass24_29;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
	public static boolean aBoolean204;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!wb;")
	public static Class82 aClass82_5;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!je;")
	private static Class40 aClass40_1347 = Static69.method1231("Invalid username or password)3");

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_1342 = aClass40_1347;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!je;")
	private static Class40 aClass40_1348 = Static69.method1231("Connection lost");

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_1343 = aClass40_1348;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static int[] anIntArray285 = new int[50];

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!je;")
	private static Class40 aClass40_1346 = Static69.method1231("Connection timed out)3");

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_1345 = aClass40_1346;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
	public static boolean aBoolean203 = true;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
	public static int[] anIntArray286 = new int[1000];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)V")
	public static void method1820(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub9 local10 = new Class2_Sub9(arg0);
		local10.anInt976 = arg0.length - 2;
		Static12.anInt3050 = local10.method632();
		Static3.anIntArray6 = new int[Static12.anInt3050];
		Static3.anIntArray5 = new int[Static12.anInt3050];
		Static105.anIntArray287 = new int[Static12.anInt3050];
		Static57.anIntArray149 = new int[Static12.anInt3050];
		Static127.aByteArrayArray9 = new byte[Static12.anInt3050][];
		local10.anInt976 = arg0.length - Static12.anInt3050 * 8 - 7;
		Static10.anInt2972 = local10.method632();
		Static16.anInt410 = local10.method632();
		@Pc(61) int local61 = (local10.method640() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static12.anInt3050; local63++) {
			Static3.anIntArray5[local63] = local10.method632();
		}
		for (@Pc(81) int local81 = 0; local81 < Static12.anInt3050; local81++) {
			Static105.anIntArray287[local81] = local10.method632();
		}
		for (@Pc(95) int local95 = 0; local95 < Static12.anInt3050; local95++) {
			Static3.anIntArray6[local95] = local10.method632();
		}
		for (@Pc(109) int local109 = 0; local109 < Static12.anInt3050; local109++) {
			Static57.anIntArray149[local109] = local10.method632();
		}
		local10.anInt976 = arg0.length + 3 - Static12.anInt3050 * 8 - local61 * 3 - 7;
		Static69.anIntArray205 = new int[local61];
		for (@Pc(142) int local142 = 1; local142 < local61; local142++) {
			Static69.anIntArray205[local142] = local10.method628();
			if (Static69.anIntArray205[local142] == 0) {
				Static69.anIntArray205[local142] = 1;
			}
		}
		local10.anInt976 = 0;
		for (@Pc(174) int local174 = 0; local174 < Static12.anInt3050; local174++) {
			@Pc(180) int local180 = Static57.anIntArray149[local174];
			@Pc(184) int local184 = Static3.anIntArray6[local174];
			@Pc(188) int local188 = local184 * local180;
			@Pc(191) byte[] local191 = new byte[local188];
			Static127.aByteArrayArray9[local174] = local191;
			@Pc(199) int local199 = local10.method640();
			@Pc(211) int local211;
			if (local199 == 0) {
				for (local211 = 0; local211 < local188; local211++) {
					local191[local211] = local10.method658();
				}
			} else if (local199 == 1) {
				for (local211 = 0; local211 < local184; local211++) {
					for (@Pc(215) int local215 = 0; local215 < local180; local215++) {
						local191[local211 + local215 * local184] = local10.method658();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1821() {
		aClass40_1343 = null;
		aClass40_1347 = null;
		aClass40_1342 = null;
		aClass82_5 = null;
		aClass24_28 = null;
		aClass40_1345 = null;
		anIntArray286 = null;
		aClass40_1346 = null;
		aClass24_29 = null;
		anIntArray285 = null;
		aClass40_1348 = null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Z")
	public static boolean method1822() {
		@Pc(5) Class12 local5 = Static52.aClass12_1;
		synchronized (Static52.aClass12_1) {
			if (Static60.anInt1672 == Static100.anInt2473) {
				return false;
			} else {
				Static59.anInt1587 = Static120.anIntArray330[Static100.anInt2473];
				Static48.anInt1299 = Static19.anIntArray70[Static100.anInt2473];
				Static100.anInt2473 = Static100.anInt2473 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method1823() {
		@Pc(1) Object local1 = Static69.anObject4;
		synchronized (Static69.anObject4) {
			if (Static57.anInt1492 != 0) {
				Static57.anInt1492 = 1;
				try {
					Static69.anObject4.wait();
				} catch (@Pc(20) InterruptedException local20) {
				}
			}
		}
	}
}

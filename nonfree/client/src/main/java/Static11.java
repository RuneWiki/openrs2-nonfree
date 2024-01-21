import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public static int anInt494;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_248 = Static9.method266("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!id;")
	private static Class34 aClass34_253 = Static9.method266("Take");

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_249 = aClass34_253;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	public static int anInt487 = 0;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public static int anInt490 = 1;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_250 = Static9.method266("(Y");

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!id;")
	private static Class34 aClass34_251 = Static9.method266("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!qd;")
	public static Class63 aClass63_5 = new Class63(30);

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_252 = aClass34_251;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
	public static final boolean aBoolean25 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class1_Sub1_Sub11 method279(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub11 local6 = (Class1_Sub1_Sub11) Static7.aClass63_3.method1663((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static78.aClass35_21.method1573(13, arg0);
		local6 = new Class1_Sub1_Sub11();
		local6.anInt2576 = arg0;
		if (local25 != null) {
			local6.method1706(new Class1_Sub19(local25));
		}
		Static7.aClass63_3.method1659(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method280() {
		aClass34_253 = null;
		aClass34_252 = null;
		aClass34_248 = null;
		aClass34_251 = null;
		aClass34_250 = null;
		aClass63_5 = null;
		aClass34_249 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ie;Lclient!ie;BLclient!ie;)V")
	public static void method281(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(3) Class35 arg2) {
		Static23.aClass35_6 = arg0;
		Static76.aClass35_20 = arg2;
		Static62.aClass35_15 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[B)V")
	public static void method282(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub19 local10 = new Class1_Sub19(arg0);
		local10.anInt3111 = arg0.length - 2;
		Static32.anInt1454 = local10.method2051();
		Static91.anIntArray298 = new int[Static32.anInt1454];
		Static78.anIntArray244 = new int[Static32.anInt1454];
		Static87.anIntArray297 = new int[Static32.anInt1454];
		Static77.aByteArrayArray7 = new byte[Static32.anInt1454][];
		Static116.anIntArray351 = new int[Static32.anInt1454];
		local10.anInt3111 = arg0.length - Static32.anInt1454 * 8 - 7;
		Static123.anInt2913 = local10.method2051();
		Static78.anInt2092 = local10.method2051();
		@Pc(62) int local62 = (local10.method2072() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static32.anInt1454; local64++) {
			Static78.anIntArray244[local64] = local10.method2051();
		}
		for (@Pc(78) int local78 = 0; local78 < Static32.anInt1454; local78++) {
			Static87.anIntArray297[local78] = local10.method2051();
		}
		for (@Pc(96) int local96 = 0; local96 < Static32.anInt1454; local96++) {
			Static91.anIntArray298[local96] = local10.method2051();
		}
		for (@Pc(119) int local119 = 0; local119 < Static32.anInt1454; local119++) {
			Static116.anIntArray351[local119] = local10.method2051();
		}
		local10.anInt3111 = arg0.length + 3 - local62 * 3 - Static32.anInt1454 * 8 - 7;
		Static32.anIntArray150 = new int[local62];
		for (@Pc(154) int local154 = 1; local154 < local62; local154++) {
			Static32.anIntArray150[local154] = local10.method2048();
			if (Static32.anIntArray150[local154] == 0) {
				Static32.anIntArray150[local154] = 1;
			}
		}
		local10.anInt3111 = 0;
		for (@Pc(183) int local183 = 0; local183 < Static32.anInt1454; local183++) {
			@Pc(189) int local189 = Static116.anIntArray351[local183];
			@Pc(193) int local193 = Static91.anIntArray298[local183];
			@Pc(197) int local197 = local189 * local193;
			@Pc(200) byte[] local200 = new byte[local197];
			Static77.aByteArrayArray7[local183] = local200;
			@Pc(208) int local208 = local10.method2072();
			@Pc(212) int local212;
			if (local208 == 0) {
				for (local212 = 0; local212 < local197; local212++) {
					local200[local212] = local10.method2086();
				}
			} else if (local208 == 1) {
				for (local212 = 0; local212 < local193; local212++) {
					for (@Pc(239) int local239 = 0; local239 < local189; local239++) {
						local200[local193 * local239 + local212] = local10.method2086();
					}
				}
			}
		}
	}
}

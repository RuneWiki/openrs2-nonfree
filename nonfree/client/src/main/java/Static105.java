import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_14;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_16 = new Class47(128);

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1018 = Static187.method3089("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1019 = Static187.method3089("headicons_pk");

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
	public static final int[] anIntArray172 = new int[50];

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1020 = Static187.method3089("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(JIII)Z")
	public static boolean method1583(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg0 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg0 >> 20 & 0x3;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(68) Class1_Sub3_Sub5 local68 = Static154.method2362(local31);
			@Pc(79) int local79;
			@Pc(76) int local76;
			if (local24 == 0 || local24 == 2) {
				local76 = local68.anInt1408;
				local79 = local68.anInt1399;
			} else {
				local79 = local68.anInt1408;
				local76 = local68.anInt1399;
			}
			@Pc(90) int local90 = local68.anInt1391;
			if (local24 != 0) {
				local90 = (local90 << local24 & 0xF) + (local90 >> 4 - local24);
			}
			Static55.method911(true, 2, 0, local79, local76, local90, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, arg1, arg2);
		} else {
			Static55.method911(true, 2, local12 + 1, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], local24, arg1, arg2);
		}
		Static108.anInt2346 = 0;
		Static50.anInt3129 = Static140.anInt2804;
		Static127.anInt2648 = Static57.anInt1370;
		Static96.anInt2010 = 2;
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ab;ZLclient!ab;B)V")
	public static void method1585(@OriginalArg(0) Class3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3 arg2) {
		Static77.aBoolean105 = arg1;
		Static196.aClass3_36 = arg2;
		Static156.aClass3_28 = arg0;
		Static11.aClass77_1 = new Class77(30);
	}
}

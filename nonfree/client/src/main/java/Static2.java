import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!aa", name = "zb", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
	public static int anInt107 = 0;

	@OriginalMember(owner = "client!aa", name = "mb", descriptor = "Lclient!ka;")
	public static Class41 aClass41_1 = new Class41(512);

	@OriginalMember(owner = "client!aa", name = "vb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_31 = method59("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!aa", name = "xb", descriptor = "I")
	public static int anInt116 = 0;

	@OriginalMember(owner = "client!aa", name = "Bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_32 = aClass80_31;

	@OriginalMember(owner = "client!aa", name = "Eb", descriptor = "Lclient!i;")
	public static Class32 aClass32_4 = new Class32(100);

	@OriginalMember(owner = "client!aa", name = "Gb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_34 = method59("Loading game screen )2 ");

	@OriginalMember(owner = "client!aa", name = "Fb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_33 = aClass80_34;

	@OriginalMember(owner = "client!aa", name = "Hb", descriptor = "I")
	public static int anInt120 = 0;

	@OriginalMember(owner = "client!aa", name = "Ib", descriptor = "I")
	public static int anInt121 = 0;

	@OriginalMember(owner = "client!aa", name = "Jb", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!aa", name = "Kb", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[104][104];

	@OriginalMember(owner = "client!aa", name = "Lb", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array1 = new Class80[500];

	@OriginalMember(owner = "client!aa", name = "Mb", descriptor = "J")
	public static long aLong5 = 0L;

	@OriginalMember(owner = "client!aa", name = "Nb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_35 = method59("Neuer Benutzer");

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] method57() {
		@Pc(8) Class2_Sub1_Sub9_Sub1[] local8 = new Class2_Sub1_Sub9_Sub1[Static27.anInt1053];
		for (@Pc(10) int local10 = 0; local10 < Static27.anInt1053; local10++) {
			@Pc(20) Class2_Sub1_Sub9_Sub1 local20 = local8[local10] = new Class2_Sub1_Sub9_Sub1();
			local20.anInt1446 = Static16.anInt442;
			local20.anInt1447 = Static111.anInt3002;
			local20.anInt1445 = Static95.anIntArray318[local10];
			local20.anInt1450 = Static40.anIntArray154[local10];
			local20.anInt1449 = Static93.anIntArray314[local10];
			local20.anInt1448 = Static86.anIntArray280[local10];
			@Pc(52) int local52 = local20.anInt1448 * local20.anInt1449;
			@Pc(56) byte[] local56 = Static9.aByteArrayArray2[local10];
			local20.anIntArray185 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray185[local62] = Static14.anIntArray65[local56[local62] & 0xFF];
			}
		}
		Static35.method624();
		return local8;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!wd;")
	public static Class80 method59(@OriginalArg(1) String arg0) {
		@Pc(12) byte[] local12 = arg0.getBytes();
		@Pc(15) int local15 = local12.length;
		@Pc(19) Class80 local19 = new Class80();
		local19.aByteArray40 = new byte[local15];
		@Pc(25) int local25 = 0;
		while (local25 < local15) {
			@Pc(33) int local33 = local12[local25++] & 0xFF;
			if (local33 <= 45 && local33 >= 40) {
				if (local25 >= local15) {
					break;
				}
				@Pc(70) int local70 = local12[local25++] & 0xFF;
				local19.aByteArray40[local19.anInt3200++] = (byte) (local70 + local33 * 43 - 48 - 1720);
			} else if (local33 != 0) {
				local19.aByteArray40[local19.anInt3200++] = (byte) local33;
			}
		}
		local19.method2016();
		return local19.method2024();
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(B)[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] method60() {
		@Pc(6) Class2_Sub1_Sub9_Sub3[] local6 = new Class2_Sub1_Sub9_Sub3[Static27.anInt1053];
		for (@Pc(13) int local13 = 0; local13 < Static27.anInt1053; local13++) {
			@Pc(22) Class2_Sub1_Sub9_Sub3 local22 = local6[local13] = new Class2_Sub1_Sub9_Sub3();
			local22.anInt2483 = Static16.anInt442;
			local22.anInt2486 = Static111.anInt3002;
			local22.anInt2485 = Static95.anIntArray318[local13];
			local22.anInt2484 = Static40.anIntArray154[local13];
			local22.anInt2487 = Static93.anIntArray314[local13];
			local22.anInt2482 = Static86.anIntArray280[local13];
			local22.anIntArray322 = Static14.anIntArray65;
			local22.aByteArray34 = Static9.aByteArrayArray2[local13];
		}
		Static35.method624();
		return local6;
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "(B)V")
	public static void method61() {
		aFont1 = null;
		aClass80_35 = null;
		aClass80Array1 = null;
		aClass32_4 = null;
		aClass41_1 = null;
		aClass80_34 = null;
		aClass80_32 = null;
		aClass80_31 = null;
		aClass80_33 = null;
		anIntArray9 = null;
		anIntArrayArray1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!rc;")
	public static Class2_Sub1_Sub14 method62(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub14 local10 = (Class2_Sub1_Sub14) Static94.aClass32_46.method887((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static76.aClass11_31.method383(arg0, 4);
		local10 = new Class2_Sub1_Sub14();
		if (local20 != null) {
			local10.method1599(arg0, new Class2_Sub17(local20));
		}
		local10.method1597();
		Static94.aClass32_46.method880(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ff;II)Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 method63(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) int arg2) {
		return Static123.method1974(arg1, arg2, arg0) ? Static121.method1965() : null;
	}
}

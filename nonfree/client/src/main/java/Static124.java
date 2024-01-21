import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
	public static int[] anIntArray384;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public static int anInt3189 = 0;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!te;")
	public static Class70 aClass70_1 = new Class70();

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_1733 = Static6.method100("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1734 = Static6.method100(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "Lclient!he;")
	private static Class26 aClass26_1738 = Static6.method100("Free world");

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_1735 = aClass26_1738;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!he;")
	public static Class26 aClass26_1736 = Static6.method100("Neuer Benutzer");

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!he;")
	public static Class26 aClass26_1737 = Static6.method100(" loggt sich aus)3");

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
	public static int[] anIntArray385 = new int[25];

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray20 = new byte[1000][];

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "Lclient!he;")
	public static Class26 aClass26_1739 = Static6.method100("blinken1:");

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
	public static int anInt3200 = 0;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
	public static int anInt3201 = 0;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	public static int anInt3202 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method2182() {
		anIntArray384 = null;
		aClass26_1737 = null;
		aShortArrayArray7 = null;
		aClass70_1 = null;
		anIntArray385 = null;
		aClass26_1736 = null;
		aByteArrayArray20 = null;
		aClass26_1735 = null;
		aClass26_1733 = null;
		aClass26_1739 = null;
		aClass26_1734 = null;
		aClass26_1738 = null;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method2184() {
		if (aClass70_1 != null) {
			@Pc(7) Class70 local7 = aClass70_1;
			synchronized (aClass70_1) {
				aClass70_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZI)Lclient!he;")
	public static Class26 method2187(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(17) int local17 = 1;
		for (@Pc(21) int local21 = arg1 / 10; local21 != 0; local21 /= 10) {
			local17++;
		}
		@Pc(40) int local40 = local17;
		if (arg1 < 0 || arg0) {
			local40 = local17 + 1;
		}
		@Pc(51) byte[] local51 = new byte[local40];
		if (arg1 < 0) {
			local51[0] = 45;
		} else if (arg0) {
			local51[0] = 43;
		}
		for (@Pc(70) int local70 = 0; local70 < local17; local70++) {
			@Pc(76) int local76 = arg1 % 10;
			if (local76 < 0) {
				local76 = -local76;
			}
			arg1 /= 10;
			if (local76 > 9) {
				local76 += 39;
			}
			local51[local40 - local70 - 1] = (byte) (local76 + 48);
		}
		@Pc(117) Class26 local117 = new Class26();
		local117.anInt1345 = local40;
		local117.aByteArray7 = local51;
		return local117;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)V")
	public static void method2189(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub2 local12 = (Class3_Sub2) Static52.aClass17_8.method599((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray17.length; local22++) {
				local12.anIntArray17[local22] = -1;
				local12.anIntArray15[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public static boolean method2190(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}

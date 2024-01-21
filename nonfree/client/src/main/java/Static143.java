import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!u;")
	public static Class76 aClass76_111;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Z")
	public static boolean aBoolean142;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1289 = Static49.method1293("M");

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public static int anInt3770 = 0;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public static int anInt3771 = 0;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1290 = Static49.method1293("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[BI)Lclient!rf;")
	public static Class70 method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(9) Class70 local9 = new Class70();
		local9.anInt3915 = 0;
		local9.aByteArray46 = new byte[arg1];
		for (@Pc(26) int local26 = arg0; local26 < arg1 + arg0; local26++) {
			if (arg2[local26] != 0) {
				local9.aByteArray46[local9.anInt3915++] = arg2[local26];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III[[[I)V")
	public static void method2806(@OriginalArg(3) int[][][] arg0) {
		Static40.anInt1398 = 4;
		Static73.anInt2250 = 104;
		Static85.anInt2550 = 104;
		Static90.aClass1_Sub17ArrayArrayArray1 = new Class1_Sub17[4][104][104];
		Static31.anIntArrayArrayArray2 = new int[4][105][105];
		Static92.anIntArrayArrayArray7 = arg0;
		Static6.method237();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)J")
	public static synchronized long method2807() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static68.aLong61 > local5) {
			Static177.aLong143 += Static68.aLong61 - local5;
		}
		Static68.aLong61 = local5;
		return Static177.aLong143 + local5;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method2808() {
		aClass70_1289 = null;
		aClass76_111 = null;
		aClass70_1290 = null;
		aBooleanArrayArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)I")
	public static int method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}
}

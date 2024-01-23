import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!ge;")
	public static Class39 aClass39_3 = new Class39(20);

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
	public static int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!kh;")
	private static Class60 aClass60_44 = Static200.method3116("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_43 = aClass60_44;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array1 = new Class60[100];

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!kh;")
	private static Class60 aClass60_47 = Static200.method3116("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!kh;")
	public static Class60 aClass60_45 = aClass60_47;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_46 = Static200.method3116("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public static int anInt113 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZBIII)V")
	public static void method82(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static199.method3112(arg2)) {
			Static106.method1822(-1, arg0, Static82.aClass6ArrayArray1[arg2], arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
	public static int method84(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static209.aClass1_Sub1_Sub20_1 != null && Static209.aClass1_Sub1_Sub20_1.aLong150 == local11 ? Static38.aClass1_Sub9_3.anInt1192 * 99 / (Static38.aClass1_Sub9_3.aByteArray20.length - Static209.aClass1_Sub1_Sub20_1.aByte10) + 1 : 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!ai;)V")
	public static void method85(@OriginalArg(1) Class7 arg0) {
		Static96.aClass7_18 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
	public static void method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!kh;ZI)V")
	public static void method87(@OriginalArg(0) Class60 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(17) Class60 local17 = arg0.method1836();
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static203.anInt4318; local21++) {
			@Pc(27) Class1_Sub1_Sub18 local27 = Static191.method2990(local21);
			if ((!arg1 || local27.aBoolean163) && local27.anInt3027 == -1 && local27.anInt2987 == -1 && local27.anInt3028 == 0 && local27.aClass60_1043.method1836().method1815(local17) != -1) {
				if (local19 >= 250) {
					Static180.aShortArray51 = null;
					Static132.anInt2879 = -1;
					return;
				}
				if (local8.length <= local19) {
					@Pc(78) short[] local78 = new short[local8.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
						local78[local80] = local8[local80];
					}
					local8 = local78;
				}
				local8[local19++] = (short) local21;
			}
		}
		Static38.anInt871 = 0;
		Static132.anInt2879 = local19;
		Static180.aShortArray51 = local8;
		@Pc(117) Class60[] local117 = new Class60[Static132.anInt2879];
		for (@Pc(119) int local119 = 0; local119 < Static132.anInt2879; local119++) {
			local117[local119] = Static191.method2990(local8[local119]).aClass60_1043;
		}
		Static39.method665(Static180.aShortArray51, local117);
	}
}

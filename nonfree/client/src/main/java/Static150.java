import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
	public static int anInt3286;

	@OriginalMember(owner = "client!p", name = "wb", descriptor = "Lclient!mi;")
	public static Class72 aClass72_4;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "S")
	public static short aShort12 = 205;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	public static int anInt3259 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!sf;")
	public static Class105 aClass105_16 = new Class105();

	@OriginalMember(owner = "client!p", name = "P", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1155 = Static64.method1101("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!p", name = "mb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9 = new byte[4][104][104];

	@OriginalMember(owner = "client!p", name = "sb", descriptor = "J")
	public static long aLong116 = 0L;

	@OriginalMember(owner = "client!p", name = "tb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1156 = Static64.method1101("Connection lost)3");

	@OriginalMember(owner = "client!p", name = "ub", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1157 = aClass51_1156;

	@OriginalMember(owner = "client!p", name = "zb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1158 = Static64.method1101(")3runescape)3com");

	@OriginalMember(owner = "client!p", name = "Cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1159 = Static64.method1101("settings=");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method2572() {
		Static202.method3329();
		Static76.method1308();
		Static183.method3088();
		Static76.method1307();
		Static26.method2452();
		Static155.method2672();
		Static156.method2679();
		Static188.method3148();
		Static227.method3744();
		Static60.method1058();
		Static68.method1187();
		Static22.method470();
		Static93.method1547();
		Static31.method540();
		((Class9) Static171.anInterface3_2).method133();
		Static134.aClass123_8.method3639();
		Static43.aClass70_Sub1_12.method3508();
		Static103.aClass70_Sub1_70.method3508();
		Static104.aClass70_Sub1_28.method3508();
		Static128.aClass70_Sub1_69.method3508();
		Static199.aClass70_Sub1_59.method3508();
		Static8.aClass70_Sub1_3.method3508();
		Static181.aClass70_Sub1_51.method3508();
		Static77.aClass70_Sub1_20.method3508();
		Static183.aClass70_Sub1_53.method3508();
		Static225.aClass70_Sub1_68.method3508();
		Static188.aClass70_Sub1_57.method3508();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([Lclient!ia;I)Lclient!ia;")
	public static Class51 method2574(@OriginalArg(0) Class51[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static132.method2336(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)[Lclient!lc;")
	public static Class41[] method2579() {
		@Pc(8) Class41[] local8 = new Class41[Static43.anInt1027];
		for (@Pc(10) int local10 = 0; local10 < Static43.anInt1027; local10++) {
			local8[local10] = new Class41_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[local10], Static152.anIntArray225[local10], Static51.anIntArray72[local10], Static89.anIntArray85[local10], Static73.aByteArrayArray4[local10], Static52.anIntArray74);
		}
		Static134.method2401();
		return local8;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[Lclient!q;II[BIIZ)V")
	public static void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) Class90[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 64; local21++) {
				for (local25 = 0; local25 < 64; local25++) {
					if (local21 + arg3 > 0 && arg3 + local21 < 103 && arg2 + local25 > 0 && local25 + arg2 < 103) {
						arg1[local17].anIntArrayArray22[arg3 + local21][arg2 + local25] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(98) Class1_Sub16 local98 = new Class1_Sub16(arg4);
		for (local21 = 0; local21 < 4; local21++) {
			for (local25 = 0; local25 < 64; local25++) {
				for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
					Static13.method266(arg2 + local113, local21, arg3 + local25, local98, 0, arg0, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Lclient!ia;")
	public static Class51 method2587(@OriginalArg(1) int arg0) {
		return Static168.aClass51Array27[arg0].method1399() <= 0 ? Static21.aClass51Array3[arg0] : method2574(new Class51[] { Static21.aClass51Array3[arg0], Static118.aClass51_854, Static168.aClass51Array27[arg0] });
	}
}

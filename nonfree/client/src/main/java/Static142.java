import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	public static final int anInt3511 = 50;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
	public static int[] anIntArray338 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1205 = Static161.method2971("green:");

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1206 = Static161.method2971("(U3");

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
	public static int[] anIntArray339 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1207 = Static161.method2971("; Max)2Age=");

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
	public static int[] anIntArray340 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1208 = Static161.method2971(" <col=00ff80>");

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1209 = aClass13_1205;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1210 = aClass13_1205;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array25 = new Class13[anInt3511];

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "[I")
	public static int[] anIntArray342 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
	public static int[] anIntArray343 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[I")
	public static int[] anIntArray344 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "[I")
	public static int[] anIntArray345 = new int[anInt3511];

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	public static int anInt3515 = 0;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1211 = Static161.method2971("Sprites geladen)3");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[BII[Lclient!d;III)V")
	public static void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class12[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = -1;
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(arg3);
		while (true) {
			@Pc(23) int local23 = local19.method1645();
			if (local23 == 0) {
				return;
			}
			@Pc(27) int local27 = 0;
			local3 += local23;
			while (true) {
				@Pc(35) int local35 = local19.method1645();
				if (local35 == 0) {
					break;
				}
				local27 += local35 - 1;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 & 0x3F;
				@Pc(59) int local59 = local19.method1607();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local27 >> 12;
				@Pc(71) int local71 = local59 & 0x3;
				if (local67 == arg8 && local49 >= arg2 && arg2 + 8 > local49 && arg0 <= local53 && local53 < arg0 + 8) {
					@Pc(102) Class1_Sub2_Sub14 local102 = Static4.method79(local3);
					@Pc(119) int local119 = arg4 + Static185.method2997(arg5, local102.anInt3302, local49 & 0x7, local71, local102.anInt3314, local53 & 0x7);
					@Pc(136) int local136 = arg1 + Static124.method2287(local102.anInt3302, local71, local102.anInt3314, arg5, local49 & 0x7, local53 & 0x7);
					if (local119 > 0 && local136 > 0 && local119 < 103 && local136 < 103) {
						@Pc(151) int local151 = arg7;
						if ((Static35.aByteArrayArrayArray20[1][local119][local136] & 0x2) == 2) {
							local151 = arg7 - 1;
						}
						@Pc(165) Class12 local165 = null;
						if (local151 >= 0) {
							local165 = arg6[local151];
						}
						Static86.method1827(local63, arg5 + local71 & 0x3, local165, local119, local3, local136, arg7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBLjava/awt/Component;)Lclient!s;")
	public static Class14 method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class14_Sub2");
			@Pc(10) Class14 local10 = (Class14) local6.getDeclaredConstructor().newInstance();
			local10.method3033(arg2, arg0, arg1);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class14_Sub1 local28 = new Class14_Sub1();
			local28.method3033(arg2, arg0, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public static void method2532() {
		aClass13_1208 = null;
		aClass13_1207 = null;
		anIntArray340 = null;
		anIntArray343 = null;
		anIntArray338 = null;
		aClass13_1205 = null;
		anIntArray345 = null;
		aClass13_1209 = null;
		anIntArray342 = null;
		aClass13Array25 = null;
		aClass13_1210 = null;
		aClass13_1206 = null;
		aClass13_1211 = null;
		anIntArray339 = null;
		anIntArray344 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	public static void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 != null) {
			Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].anInt1540 = arg3;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)I")
	public static int method2535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			local15 = arg1 & 0x1 | local15 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Lclient!fa;")
	public static Class1_Sub2_Sub8 method2538(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub8 local18 = (Class1_Sub2_Sub8) Static24.aClass47_4.method1999((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static42.aClass4_41.method2243(12, arg0);
		local18 = new Class1_Sub2_Sub8();
		if (local28 != null) {
			local18.method1203(new Class1_Sub8(local28));
		}
		local18.method1209();
		Static24.aClass47_4.method1998(local18, (long) arg0);
		return local18;
	}
}

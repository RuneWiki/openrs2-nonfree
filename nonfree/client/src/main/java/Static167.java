import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "[I")
	public static int[] anIntArray680;

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	public static int anInt4074;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
	public static int anInt4075;

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
	public static int anInt4077;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1414 = Static170.method3101("Registrierter Benutzer");

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
	public static final int anInt4073 = 0;

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1415 = Static170.method3101(" <col=ffffff>");

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1416 = Static170.method3101("null");

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1417 = Static170.method3101("Lade Texturen )2 ");

	@OriginalMember(owner = "client!vc", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1418 = Static170.method3101("null");

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "[I")
	public static int[] anIntArray681 = new int[128];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z")
	public static boolean method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static38.anInt1088 + arg0 * Static141.anInt3613 >> 16;
		@Pc(19) int local19 = arg2 * Static141.anInt3613 - arg0 * Static38.anInt1088 >> 16;
		@Pc(29) int local29 = arg1 * Static168.anInt4089 + local19 * Static129.anInt3280 >> 16;
		@Pc(39) int local39 = arg1 * Static129.anInt3280 - local19 * Static168.anInt4089 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static1.anInt16 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static50.anInt1433 + (local39 << 9) / local29;
			return local55 >= Static19.anInt558 && local55 <= Static55.anInt1559 && local63 >= Static149.anInt3708 && local63 <= Static171.anInt4104;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3089(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static139.aClass48_3);
		arg0.removeMouseMotionListener(Static139.aClass48_3);
		arg0.removeFocusListener(Static139.aClass48_3);
		Static26.anInt713 = 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!eh;Lclient!eh;ILclient!ah;ZI)V")
	public static void method3090(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(4) Class7 arg2) {
		@Pc(4) int local4 = arg2.method1029(arg0);
		@Pc(18) int local18 = arg2.method1031(arg1, local4);
		Static152.method2880(local18, local4, arg2, 255);
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)I")
	public static int method3091() {
		@Pc(11) int local11 = Static33.method848(Static28.anInt900, Static171.anInt4109, Static85.anInt2512);
		return local11 - Static163.anInt3970 >= 800 || (Static157.aByteArrayArrayArray41[Static171.anInt4109][Static28.anInt900 >> 7][Static85.anInt2512 >> 7] & 0x4) == 0 ? 3 : Static171.anInt4109;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILclient!kb;Lclient!kb;IIJ)V")
	public static void method3092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) Class3_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class25 local8 = new Class25();
		local8.aLong36 = arg8;
		local8.anInt1092 = arg1 * 128 + 64;
		local8.anInt1089 = arg2 * 128 + 64;
		local8.anInt1087 = arg3;
		local8.aClass3_Sub2_Sub1_1 = arg4;
		local8.aClass3_Sub2_Sub1_2 = arg5;
		local8.anInt1093 = arg6;
		local8.anInt1090 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static149.aClass3_Sub20ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static149.aClass3_Sub20ArrayArrayArray1[local42][arg1][arg2] = new Class3_Sub20(local42, arg1, arg2);
			}
		}
		Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass25_1 = local8;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
	public static void method3093() {
		anIntArray680 = null;
		aClass28_1418 = null;
		aClass28_1415 = null;
		aClass28_1416 = null;
		anIntArray681 = null;
		aClass28_1414 = null;
		aClass28_1417 = null;
	}
}

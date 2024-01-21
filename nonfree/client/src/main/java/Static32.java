import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!f", name = "Sc", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!f", name = "Zc", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!f", name = "Vc", descriptor = "Lclient!rd;")
	private static Class63 aClass63_604 = Static80.method1463("System update in: ");

	@OriginalMember(owner = "client!f", name = "Pc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_602 = aClass63_604;

	@OriginalMember(owner = "client!f", name = "Qc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_603 = Static80.method1463(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!f", name = "Tc", descriptor = "I")
	public static final int anInt1129 = 20;

	@OriginalMember(owner = "client!f", name = "Uc", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!f", name = "Wc", descriptor = "I")
	public static volatile int anInt1130 = 0;

	@OriginalMember(owner = "client!f", name = "bd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_605 = Static80.method1463(")2");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ge;ILclient!ge;)V")
	public static void method836(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static58.aClass7_34 = arg1;
		Static67.aClass7_37 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "(I)V")
	public static void method837() {
		aClass63_605 = null;
		aClass63_603 = null;
		aClass63_604 = null;
		aClass63_602 = null;
		anIntArray137 = null;
		anIntArray136 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II[Lclient!hc;III[B)V")
	public static void method838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg1 + local7 > 0 && local7 + arg1 < 103 && arg3 + local11 > 0 && local11 + arg3 < 103) {
						arg2[local3].anIntArrayArray18[local7 + arg1][local11 + arg3] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(93) Class6_Sub4 local93 = new Class6_Sub4(arg5);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
				for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
					Static33.method842(local99 + arg1, local103 - -arg3, local11, arg4, local93, arg0, 0);
				}
			}
		}
	}
}

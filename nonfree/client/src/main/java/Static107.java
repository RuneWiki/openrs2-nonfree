import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array8;

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "Z")
	public static boolean aBoolean100;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "Lclient!tg;")
	private static Class81 aClass81_832 = Static120.method2057("No response from server)3");

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_831 = aClass81_832;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
	public static int anInt2357 = -1;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[112];

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_833 = Static120.method2057("(U1");

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_834 = Static120.method2057("rect_debug=");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
	public static void method1775() {
		Static131.aBoolean115 = false;
		Static89.anInt4032 = 1;
		Static98.anInt2160 = -1;
		Static100.anInt2177 = 2;
		Static108.aClass82_40 = null;
		Static184.anInt4115 = -1;
		Static153.anInt3499 = 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[B)Lclient!tg;")
	public static Class81 method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class81 local9 = new Class81();
		local9.anInt3691 = 0;
		local9.aByteArray41 = new byte[arg1];
		for (@Pc(18) int local18 = arg0; local18 < arg0 + arg1; local18++) {
			if (arg2[local18] != 0) {
				local9.aByteArray41[local9.anInt3691++] = arg2[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)I")
	public static int method1777() {
		return Static67.anInt1665++;
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
	public static void method1778() {
		aClass81_834 = null;
		aClass81_831 = null;
		aBooleanArray13 = null;
		aClass81_832 = null;
		aClass81_833 = null;
		aClass1_Sub2_Sub2_Sub3Array8 = null;
	}
}

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!ud;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!ea;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array5;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public static int anInt972;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public static int anInt973;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_24;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!kd;")
	private static Class39 aClass39_447 = Static108.method1915("Hide");

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_448 = Static108.method1915("backleft2");

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_449 = aClass39_447;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_450 = Static108.method1915("hel");

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_451 = Static108.method1915("sl_flags");

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_452 = Static108.method1915(")1");

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_453 = Static108.method1915("gelb:");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public static void method581() {
		aClass62_Sub1_24 = null;
		aClass39_447 = null;
		aClass39_449 = null;
		aClass39_452 = null;
		aClass39_451 = null;
		aClass39_448 = null;
		aClass39_453 = null;
		aClass14_1 = null;
		aClass39_450 = null;
		aClass74_1 = null;
		aClass1_Sub1_Sub4_Sub4Array5 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method582() {
		try {
			@Pc(11) Graphics local11 = Static16.aCanvas10.getGraphics();
			Static81.aClass6_15.method2067(17, 357, local11);
		} catch (@Pc(19) Exception local19) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!w;Lclient!qc;Z)V")
	public static void method583(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class1_Sub18 arg2) {
		@Pc(9) Class1_Sub9 local9 = new Class1_Sub9();
		local9.anInt1455 = arg2.method2169();
		local9.anInt1454 = arg2.method2185();
		local9.aClass34Array1 = new Class34[local9.anInt1455];
		local9.anIntArray202 = new int[local9.anInt1455];
		local9.anIntArray205 = new int[local9.anInt1455];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt1455][][];
		local9.aClass34Array2 = new Class34[local9.anInt1455];
		local9.anIntArray204 = new int[local9.anInt1455];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt1455; local56++) {
			try {
				@Pc(62) int local62 = arg2.method2169();
				@Pc(92) String local92;
				@Pc(101) String local101;
				@Pc(105) int local105;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local92 = new String(arg2.method2139().method1155());
					local101 = new String(arg2.method2139().method1155());
					local105 = 0;
					if (local62 == 1) {
						local105 = arg2.method2185();
					}
					local9.anIntArray202[local56] = local62;
					local9.anIntArray205[local56] = local105;
					local9.aClass34Array1[local56] = arg1.method2091(local101, Static21.method415(local92));
				} else if (local62 == 3 || local62 == 4) {
					local92 = new String(arg2.method2139().method1155());
					local101 = new String(arg2.method2139().method1155());
					local105 = arg2.method2169();
					@Pc(108) String[] local108 = new String[local105];
					for (@Pc(110) int local110 = 0; local110 < local105; local110++) {
						local108[local110] = new String(arg2.method2139().method1155());
					}
					@Pc(134) byte[][] local134 = new byte[local105][];
					@Pc(145) int local145;
					if (local62 == 3) {
						for (@Pc(139) int local139 = 0; local139 < local105; local139++) {
							local145 = arg2.method2185();
							local134[local139] = new byte[local145];
							arg2.method2167(local134[local139], local145);
						}
					}
					@Pc(169) Class[] local169 = new Class[local105];
					local9.anIntArray202[local56] = local62;
					for (local145 = 0; local145 < local105; local145++) {
						local169[local145] = Static21.method415(local108[local145]);
					}
					local9.aClass34Array2[local56] = arg1.method2088(local169, local101, Static21.method415(local92));
					local9.aByteArrayArrayArray4[local56] = local134;
				}
			} catch (@Pc(263) ClassNotFoundException local263) {
				local9.anIntArray204[local56] = -1;
			} catch (@Pc(270) SecurityException local270) {
				local9.anIntArray204[local56] = -2;
			} catch (@Pc(277) NullPointerException local277) {
				local9.anIntArray204[local56] = -3;
			} catch (@Pc(284) Exception local284) {
				local9.anIntArray204[local56] = -4;
			} catch (@Pc(291) Throwable local291) {
				local9.anIntArray204[local56] = -5;
			}
		}
		Static67.aClass31_39.method1005(local9);
	}
}

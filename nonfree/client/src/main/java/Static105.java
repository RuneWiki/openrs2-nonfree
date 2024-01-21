import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!n", name = "q", descriptor = "[I")
	public static int[] anIntArray216;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	public static int anInt2554;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public static int[] anIntArray217 = new int[128];

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!ai;")
	public static Class6 aClass6_725 = Static38.method685("Standort");

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!ai;")
	private static Class6 aClass6_726 = Static38.method685(" has logged out)3");

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_727 = aClass6_726;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method1732(@OriginalArg(1) Class2_Sub3_Sub2_Sub3 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static11.anIntArray7.length; local11++) {
			Static11.anIntArray7[local11] = 0;
		}
		@Pc(44) int local44;
		for (@Pc(34) int local34 = 0; local34 < 5000; local34++) {
			local44 = (int) (Math.random() * 128.0D * (double) 256);
			Static11.anIntArray7[local44] = (int) (Math.random() * 256.0D);
		}
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(73) int local73;
		for (local44 = 0; local44 < 20; local44++) {
			for (local61 = 1; local61 < 255; local61++) {
				for (local65 = 1; local65 < 127; local65++) {
					local73 = (local61 << 7) + local65;
					Static120.anIntArray243[local73] = (Static11.anIntArray7[local73 + 128] + Static11.anIntArray7[local73 + 1] + Static11.anIntArray7[local73 - 1] + Static11.anIntArray7[local73 + -128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static11.anIntArray7;
			Static11.anIntArray7 = Static120.anIntArray243;
			Static120.anIntArray243 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local61 = 0;
		for (local65 = 0; local65 < arg0.anInt3621; local65++) {
			for (local73 = 0; local73 < arg0.anInt3620; local73++) {
				if (arg0.aByteArray46[local61++] != 0) {
					@Pc(153) int local153 = arg0.anInt3622 + local65 + 16;
					@Pc(160) int local160 = arg0.anInt3619 + local73 + 16;
					@Pc(166) int local166 = (local153 << 7) + local160;
					Static11.anIntArray7[local166] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1733() {
		aByteArrayArray5 = null;
		anIntArray216 = null;
		anIntArray217 = null;
		aClass6_725 = null;
		aClass6_726 = null;
		aClass6_727 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ih;ILclient!me;B)V")
	public static void method1734(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13 arg2) {
		@Pc(9) Class2_Sub11 local9 = new Class2_Sub11();
		local9.anInt1571 = arg2.method1402();
		local9.anInt1572 = arg2.method1396();
		local9.aByteArrayArrayArray3 = new byte[local9.anInt1571][][];
		local9.anIntArray103 = new int[local9.anInt1571];
		local9.aClass11Array2 = new Class11[local9.anInt1571];
		local9.anIntArray101 = new int[local9.anInt1571];
		local9.anIntArray102 = new int[local9.anInt1571];
		local9.aClass11Array1 = new Class11[local9.anInt1571];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt1571; local51++) {
			try {
				@Pc(57) int local57 = arg2.method1402();
				@Pc(87) String local87;
				@Pc(96) String local96;
				@Pc(100) int local100;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local87 = new String(arg2.method1399().method112());
					local96 = new String(arg2.method1399().method112());
					local100 = 0;
					if (local57 == 1) {
						local100 = arg2.method1396();
					}
					local9.anIntArray101[local51] = local57;
					local9.anIntArray103[local51] = local100;
					local9.aClass11Array2[local51] = arg0.method1111(local96, Static72.method1124(local87));
				} else if (local57 == 3 || local57 == 4) {
					local87 = new String(arg2.method1399().method112());
					local96 = new String(arg2.method1399().method112());
					local100 = arg2.method1402();
					@Pc(103) String[] local103 = new String[local100];
					for (@Pc(105) int local105 = 0; local105 < local100; local105++) {
						local103[local105] = new String(arg2.method1399().method112());
					}
					@Pc(129) byte[][] local129 = new byte[local100][];
					@Pc(140) int local140;
					if (local57 == 3) {
						for (@Pc(134) int local134 = 0; local134 < local100; local134++) {
							local140 = arg2.method1396();
							local129[local134] = new byte[local140];
							arg2.method1411(local140, local129[local134]);
						}
					}
					local9.anIntArray101[local51] = local57;
					@Pc(169) Class[] local169 = new Class[local100];
					for (local140 = 0; local140 < local100; local140++) {
						local169[local140] = Static72.method1124(local103[local140]);
					}
					local9.aClass11Array1[local51] = arg0.method1115(Static72.method1124(local87), local96, local169);
					local9.aByteArrayArrayArray3[local51] = local129;
				}
			} catch (@Pc(260) ClassNotFoundException local260) {
				local9.anIntArray102[local51] = -1;
			} catch (@Pc(267) SecurityException local267) {
				local9.anIntArray102[local51] = -2;
			} catch (@Pc(274) NullPointerException local274) {
				local9.anIntArray102[local51] = -3;
			} catch (@Pc(281) Exception local281) {
				local9.anIntArray102[local51] = -4;
			} catch (@Pc(288) Throwable local288) {
				local9.anIntArray102[local51] = -5;
			}
		}
		Static72.aClass84_3.method2701(local9);
	}
}

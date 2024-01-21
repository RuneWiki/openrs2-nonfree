import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ce", name = "kb", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!ce", name = "ob", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_4;

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Lclient!cd;")
	public static Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "Lclient!lc;")
	private static Class31 aClass31_181 = Static56.method1206("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_182 = Static56.method1206(" is already on your ignore list");

	@OriginalMember(owner = "client!ce", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_183 = Static56.method1206("Choose Option");

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
	public static int anInt571 = 0;

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_184 = Static56.method1206("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_185 = aClass31_181;

	@OriginalMember(owner = "client!ce", name = "pb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_186 = Static56.method1206("Add friend @whi@");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!kc;)V")
	public static void method376(@OriginalArg(1) Class11 arg0) {
		Static90.aClass11_21 = arg0;
		Static40.anInt2024 = Static90.aClass11_21.method325(16);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method377() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static25.anIntArray122[local9 + 32512] = 255;
			}
		}
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(58) int local58;
		for (local16 = 0; local16 < 100; local16++) {
			local45 = (int) (Math.random() * 124.0D) + 2;
			local52 = (int) (Math.random() * 128.0D) + 128;
			local58 = local45 + (local52 << 7);
			Static25.anIntArray122[local58] = 192;
		}
		for (local45 = 1; local45 < 255; local45++) {
			for (local52 = 1; local52 < 127; local52++) {
				local58 = local52 + (local45 << 7);
				Static92.anIntArray241[local58] = (Static25.anIntArray122[local58 - 128] + Static25.anIntArray122[local58 + 1] + Static25.anIntArray122[local58 - 1] + Static25.anIntArray122[local58 + 128]) / 4;
			}
		}
		Static76.anInt2250 += 128;
		if (Static76.anInt2250 > Static4.anIntArray20.length) {
			Static76.anInt2250 -= Static4.anIntArray20.length;
			local52 = (int) (Math.random() * 12.0D);
			Static63.method1323(Static82.aClass2_Sub1_Sub3_Sub1Array4[local52]);
		}
		@Pc(161) int local161;
		for (local52 = 1; local52 < 255; local52++) {
			for (local58 = 1; local58 < 127; local58++) {
				local161 = local58 + (local52 << 7);
				@Pc(181) int local181 = Static92.anIntArray241[local161 + 128] - Static4.anIntArray20[Static4.anIntArray20.length - 1 & Static76.anInt2250 + local161] / 5;
				if (local181 < 0) {
					local181 = 0;
				}
				Static25.anIntArray122[local161] = local181;
			}
		}
		for (local58 = 0; local58 < 255; local58++) {
			Static38.anIntArray229[local58] = Static38.anIntArray229[local58 + 1];
		}
		Static38.anIntArray229[255] = (int) (Math.sin((double) Static49.anInt2694 / 14.0D) * 16.0D + Math.sin((double) Static49.anInt2694 / 15.0D) * 14.0D + Math.sin((double) Static49.anInt2694 / 16.0D) * 12.0D);
		if (Static37.anInt1412 > 0) {
			Static37.anInt1412 -= 4;
		}
		if (Static101.anInt2753 > 0) {
			Static101.anInt2753 -= 4;
		}
		if (Static37.anInt1412 != 0 || Static101.anInt2753 != 0) {
			return;
		}
		local161 = (int) (Math.random() * 2000.0D);
		if (local161 == 1) {
			Static101.anInt2753 = 1024;
		}
		if (local161 == 0) {
			Static37.anInt1412 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Graphics;I)V")
	public static void method378(@OriginalArg(0) Graphics arg0) {
		Static23.aClass9_9.method863(arg0, 4, 0);
		Static69.aClass9_19.method863(arg0, 357, 0);
		Static3.aClass9_1.method863(arg0, 4, 722);
		Static24.aClass9_10.method863(arg0, 205, 743);
		Static11.aClass9_5.method863(arg0, 0, 0);
		Static76.aClass9_22.method863(arg0, 4, 516);
		Static55.aClass9_15.method863(arg0, 205, 516);
		Static83.aClass9_24.method863(arg0, 357, 496);
		Static67.aClass9_18.method863(arg0, 338, 0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[BI)I")
	public static int method379(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = local7 >>> 8 ^ Class2.anIntArray382[(arg1[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method380() {
		for (@Pc(3) int local3 = -1; local3 < Static21.anInt1007; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static78.anIntArray322[local3];
			}
			@Pc(21) Class2_Sub1_Sub4_Sub6_Sub1 local21 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local11];
			if (local21 != null) {
				Static38.method987(1, local21);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[Lclient!lc;I)Lclient!lc;")
	public static Class31 method381(@OriginalArg(2) Class31[] arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[local9] == null) {
				arg0[local9] = Static100.aClass31_935;
			}
			local7 += arg0[local9].anInt1901;
		}
		@Pc(40) byte[] local40 = new byte[local7];
		@Pc(42) int local42 = 0;
		@Pc(52) Class31 local52;
		for (@Pc(44) int local44 = 0; local44 < arg1; local44++) {
			local52 = arg0[local44];
			Static112.method991(local52.aByteArray17, 0, local40, local42, local52.anInt1901);
			local42 += local52.anInt1901;
		}
		local52 = new Class31();
		local52.aByteArray17 = local40;
		local52.anInt1901 = local7;
		return local52;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public static void method382() {
		aClass31_185 = null;
		aClass31_182 = null;
		aClass12_1 = null;
		aClass31_181 = null;
		aClass31_183 = null;
		aClass31_184 = null;
		aClass31_186 = null;
		anIntArray81 = null;
		aClass2_Sub1_Sub3_Sub1_4 = null;
	}
}

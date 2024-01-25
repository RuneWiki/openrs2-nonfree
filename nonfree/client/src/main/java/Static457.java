import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_142 = new Class156(73, -1);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILclient!rv;)V")
	public static void method6439(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub36_Sub2 arg1) {
		Static282.anInt5022 = 0;
		Static350.aBoolean384 = false;
		Static357.method5229(arg1);
		Static352.method5189(arg1);
		if (Static350.aBoolean384) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt8456) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt8456 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IJ)V")
	public static void method6440(@OriginalArg(1) long arg0) {
		if (Static283.aClass128ArrayArrayArray1 != null) {
			if (Static426.anInt7111 == 1 || Static426.anInt7111 == 5) {
				Static89.method1397(arg0);
			} else if (Static426.anInt7111 == 4) {
				Static637.method6722(arg0);
			}
		}
		Static265.method4290(Static273.aClass100_6, (long) Static565.anInt8921);
		if (Static381.anInt6411 != -1) {
			Static57.method1021(Static381.anInt6411);
		}
		for (@Pc(54) int local54 = 0; local54 < Static171.anInt5360; local54++) {
			if (Static325.aBooleanArray15[local54]) {
				Static528.aBooleanArray23[local54] = true;
			}
			Static38.aBooleanArray1[local54] = Static325.aBooleanArray15[local54];
			Static325.aBooleanArray15[local54] = false;
		}
		Static547.anInt8691 = Static565.anInt8921;
		Static472.method6676((Class238) null, -1, -1);
		Static391.method5779(-1, (Class238) null, -1);
		if (Static381.anInt6411 != -1) {
			Static171.anInt5360 = 0;
			Static7.method122();
		}
		Static273.aClass100_6.la();
		Static567.method7658(Static273.aClass100_6);
		@Pc(123) int local123 = Static542.method7428();
		if (local123 == -1) {
			local123 = Static586.anInt9462;
		}
		if (local123 == -1) {
			local123 = Static27.anInt363;
		}
		Static310.method4802(local123);
		@Pc(142) int local142 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() << 8;
		Static161.method2976(Static675.anInt10854, local142 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, local142 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805);
		Static675.anInt10854 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIB)I")
	public static int method6441(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
	public static void method6442(@OriginalArg(1) int arg0) {
		Static524.anInt8330 = 0;
		Static395.anInt6666 = 2;
		Static310.anInt5335 = 1;
		Static342.aClass126_159 = null;
		Static180.anInt3389 = -1;
		Static27.aClass5_Sub4_Sub2_1 = null;
		Static680.anInt10888 = arg0;
		Static168.aBoolean240 = false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)Z")
	public static boolean method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}

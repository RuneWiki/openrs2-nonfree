import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!wb;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public static int anInt2073;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "J")
	public static long aLong111;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!jd;")
	public static Class38 aClass38_16 = new Class38();

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1017 = Static9.method266("p12_full");

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1018 = Static9.method266("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_1019 = Static9.method266("null");

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array20 = new Class34[1000];

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!id;")
	public static Class34 aClass34_1020 = Static9.method266("me");

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!id;")
	private static Class34 aClass34_1022 = Static9.method266("Enter your username (V password)3");

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_1021 = aClass34_1022;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_1023 = Static9.method266("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public static void method1351() {
		aClass34_1021 = null;
		aClass38_16 = null;
		aClass34_1019 = null;
		aClass34Array20 = null;
		aShortArrayArray7 = null;
		aClass34_1017 = null;
		aClass34_1020 = null;
		aClass22_3 = null;
		aClass34_1023 = null;
		aClass34_1018 = null;
		aClass34_1022 = null;
		aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[Lclient!id;II)Lclient!id;")
	public static Class34 method1353(@OriginalArg(0) int arg0, @OriginalArg(1) Class34[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			if (arg1[local10 + arg2] == null) {
				arg1[local10 + arg2] = Static48.aClass34_706;
			}
			local8 += arg1[local10 + arg2].anInt1553;
		}
		@Pc(44) byte[] local44 = new byte[local8];
		@Pc(46) int local46 = 0;
		@Pc(56) Class34 local56;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			local56 = arg1[local48 + arg2];
			Static140.method1970(local56.aByteArray20, 0, local44, local46, local56.anInt1553);
			local46 += local56.anInt1553;
		}
		local56 = new Class34();
		local56.anInt1553 = local8;
		local56.aByteArray20 = local44;
		return local56;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fd;I)Z")
	public static boolean method1354(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(2) int local2 = arg0.anInt1030;
		if (local2 == 205) {
			Static106.anInt2602 = 250;
			return true;
		}
		@Pc(33) int local33;
		@Pc(27) int local27;
		if (local2 >= 300 && local2 <= 313) {
			local27 = local2 & 0x1;
			local33 = (local2 - 300) / 2;
			Static62.aClass10_2.method354(local27 == 1, local33);
		}
		if (local2 >= 314 && local2 <= 323) {
			local27 = local2 & 0x1;
			local33 = (local2 - 314) / 2;
			Static62.aClass10_2.method352(local33, local27 == 1);
		}
		if (local2 == 324) {
			Static62.aClass10_2.method363(false);
		}
		if (local2 == 325) {
			Static62.aClass10_2.method363(true);
		}
		if (local2 == 326) {
			Static21.aClass1_Sub19_Sub1_1.method2105(174);
			Static62.aClass10_2.method353(Static21.aClass1_Sub19_Sub1_1);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!l;[BII[Lclient!pb;)V")
	public static void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class58[] arg4) {
		@Pc(15) Class1_Sub19 local15 = new Class1_Sub19(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method2078();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method2078();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method2072();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg0 + local54;
				@Pc(78) int local78 = local48 + arg3;
				if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
					@Pc(95) int local95 = local58;
					if ((Static105.aByteArrayArrayArray9[1][local74][local78] & 0x2) == 2) {
						local95 = local58 - 1;
					}
					@Pc(111) Class58 local111 = null;
					if (local95 >= 0) {
						local111 = arg4[local95];
					}
					Static118.method1876(local17, arg1, local78, local66, local58, local70, local74, local111);
				}
			}
		}
	}
}

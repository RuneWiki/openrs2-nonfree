import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!dc;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	public static int anInt313;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!jd;")
	public static Class36 aClass36_11;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!ie;")
	public static Class34 aClass34_9 = new Class34();

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
	public static int anInt322 = 0;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt325 = 0;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "Lclient!ke;")
	private static Class39 aClass39_167 = Static2.method66("Friends");

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!ke;")
	public static Class39 aClass39_163 = aClass39_167;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!mb;")
	public static Class2_Sub5_Sub1 aClass2_Sub5_Sub1_1 = new Class2_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!ke;")
	public static Class39 aClass39_164 = Static2.method66(" @whi@(X");

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "Lclient!ke;")
	public static Class39 aClass39_165 = Static2.method66("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "Lclient!ke;")
	public static Class39 aClass39_166 = Static2.method66("::fpsoff");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ge;B)V")
	public static void method252(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		if (arg0.anInt2927 == 0) {
			arg0.anInt2887 = 1024;
		}
		arg0.anInt2908 = 0;
		@Pc(17) int local17 = arg0.anInt2900 - Static64.anInt1889;
		if (arg0.anInt2927 == 1) {
			arg0.anInt2887 = 1536;
		}
		if (arg0.anInt2927 == 2) {
			arg0.anInt2887 = 0;
		}
		if (arg0.anInt2927 == 3) {
			arg0.anInt2887 = 512;
		}
		@Pc(52) int local52 = arg0.anInt2898 * 64 + arg0.anInt2917 * 128;
		arg0.anInt2896 += (local52 - arg0.anInt2896) / local17;
		@Pc(74) int local74 = arg0.anInt2898 * 64 + arg0.anInt2926 * 128;
		arg0.anInt2899 += (local74 - arg0.anInt2899) / local17;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[Lclient!ke;)[Lclient!ke;")
	public static Class39[] method253(@OriginalArg(1) Class39[] arg0) {
		@Pc(8) Class39[] local8 = new Class39[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static20.method431(new Class39[] { Static31.method1267(local10), Static29.aClass39_381 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static20.method431(new Class39[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method255() {
		if (Static35.aBoolean136 && Static18.anInt560 != Static28.anInt815) {
			Static67.method1403(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0], Static71.anInt2025, Static2.anInt66, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], Static18.anInt560);
		} else if (Static29.anInt838 != Static18.anInt560) {
			Static29.anInt838 = Static18.anInt560;
			Static51.method1764(Static18.anInt560);
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public static void method256() {
		aClass39_167 = null;
		aClass39_166 = null;
		aClass39_164 = null;
		aClass15_1 = null;
		aClass2_Sub5_Sub1_1 = null;
		aClass39_165 = null;
		aClass36_11 = null;
		aClass39_163 = null;
		aClass34_9 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public static void method257() {
		Static50.aClass2_Sub5_Sub1_2.method1302(49);
		if (Static57.anInt1650 != -1) {
			Static22.method439(Static57.anInt1650);
			Static107.aBoolean121 = true;
			aBoolean14 = false;
			Static97.aBoolean120 = true;
			Static57.anInt1650 = -1;
		}
		if (Static99.anInt2696 != -1) {
			Static22.method439(Static99.anInt2696);
			Static31.aBoolean91 = true;
			Static99.anInt2696 = -1;
			aBoolean14 = false;
		}
		if (Static7.anInt161 != -1) {
			Static22.method439(Static7.anInt161);
			Static7.anInt161 = -1;
			Static60.method1127(30);
		}
		if (Static88.anInt1137 != -1) {
			Static22.method439(Static88.anInt1137);
			Static88.anInt1137 = -1;
		}
		if (Static78.anInt2159 != -1) {
			Static22.method439(Static78.anInt2159);
			Static78.anInt2159 = -1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZI)I")
	public static int method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return 7 - arg2;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIZ)Lclient!ke;")
	public static Class39 method262(@OriginalArg(2) int arg0) {
		@Pc(19) int local19 = arg0 / 10;
		@Pc(21) int local21 = 1;
		while (local19 != 0) {
			local19 /= 10;
			local21++;
		}
		@Pc(31) int local31 = local21;
		if (arg0 < 0) {
			local31 = local21 + 1;
		}
		@Pc(39) byte[] local39 = new byte[local31];
		if (arg0 < 0) {
			local39[0] = 45;
		}
		for (@Pc(65) int local65 = 0; local65 < local21; local65++) {
			@Pc(70) int local70 = arg0 % 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			arg0 /= 10;
			local39[local31 - local65 - 1] = (byte) (local70 + 48);
		}
		@Pc(108) Class39 local108 = new Class39();
		local108.anInt1601 = local31;
		local108.aByteArray13 = local39;
		return local108;
	}
}

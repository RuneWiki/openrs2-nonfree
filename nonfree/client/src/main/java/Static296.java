import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I", line = 7)
	public static int method5431() {
		try {
			if (Class2_Sub10.anInt1749 == 0) {
				if (Class230.aLong200 > Static190.method3686() - 5000L) {
					return 0;
				}
				Class2_Sub19.aClass32_7 = Static305.aClass152_5.method3752(Static57.aString14, Static255.anInt5144);
				Class190.aLong157 = Static190.method3686();
				Class2_Sub10.anInt1749 = 1;
			}
			if (Static190.method3686() > Class190.aLong157 + 30000L) {
				return Static94.method2168(1000);
			}
			@Pc(114) int local114;
			if (Class2_Sub10.anInt1749 == 1) {
				if (Class2_Sub19.aClass32_7.anInt992 == 2) {
					return Static94.method2168(1001);
				}
				if (Class2_Sub19.aClass32_7.anInt992 != 1) {
					return -1;
				}
				Static312.aClass111_4 = new Class111((Socket) Class2_Sub19.aClass32_7.anObject2, Static305.aClass152_5);
				Class2_Sub19.aClass32_7 = null;
				@Pc(76) int local76 = 0;
				Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
				if (Class55.aBoolean130) {
					local76 = Static336.anInt6754;
				}
				Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_9.anInt7025);
				Class14.aClass2_Sub4_Sub2_4.method4814(local76);
				Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				local114 = Static312.aClass111_4.method2802();
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				if (local114 != 0) {
					return Static94.method2168(local114);
				}
				Class2_Sub10.anInt1749 = 2;
			}
			if (Class2_Sub10.anInt1749 == 2) {
				if (Static312.aClass111_4.method2797() < 2) {
					return -1;
				}
				Class194.anInt5484 = Static312.aClass111_4.method2802();
				Class194.anInt5484 <<= 0x8;
				Class194.anInt5484 += Static312.aClass111_4.method2802();
				Static275.aByteArray27 = new byte[Class194.anInt5484];
				Class29.anInt913 = 0;
				Class2_Sub10.anInt1749 = 3;
			}
			if (Class2_Sub10.anInt1749 != 3) {
				return -1;
			}
			local114 = Static312.aClass111_4.method2797();
			if (local114 < 1) {
				return -1;
			}
			if (local114 > Class194.anInt5484 - Class29.anInt913) {
				local114 = Class194.anInt5484 - Class29.anInt913;
			}
			Static312.aClass111_4.method2795(Static275.aByteArray27, local114, Class29.anInt913);
			Class29.anInt913 += local114;
			if (Class194.anInt5484 > Class29.anInt913) {
				return -1;
			} else if (Static149.method2945(Static275.aByteArray27)) {
				Class202.aClass3_Sub1Array2 = new Class3_Sub1[Static276.anInt5631];
				@Pc(234) int local234 = 0;
				for (@Pc(236) int local236 = Static350.anInt7029; local236 <= Static289.anInt5831; local236++) {
					@Pc(242) Class3_Sub1 local242 = Static7.method6468(local236);
					if (local242 != null) {
						Class202.aClass3_Sub1Array2[local234++] = local242;
					}
				}
				Canvas_Sub1.aClass2_Sub16_1 = null;
				Class68.anInt1911 = 0;
				Static312.aClass111_4.method2801();
				Class2_Sub10.anInt1749 = 0;
				Class9.anInt270 = 0;
				Static275.aByteArray27 = null;
				Static312.aClass111_4 = null;
				Class230.aLong200 = Static190.method3686();
				return 0;
			} else {
				return Static94.method2168(1002);
			}
		} catch (@Pc(274) IOException local274) {
			return Static94.method2168(1003);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I", line = 140)
	public static int method5432(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 151)
	public static void method5433(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(10) Class2_Sub2_Sub7 local10 = Static293.method5414(3, arg0);
		local10.method2313();
		local10.aString21 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILjava/lang/String;)I", line = 177)
	public static int method5434(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local46 >= '0' && local46 <= '9') {
				local78 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local78 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local78 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local78) {
				throw new NumberFormatException();
			}
			if (local26) {
				local78 = -local78;
			}
			@Pc(130) int local130 = local78 + arg0 * local30;
			if (local130 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local130;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V", line = 280)
	public static void method5436() {
		if (Class2_Sub3_Sub35.anInt6429 == 5) {
			Class2_Sub3_Sub35.anInt6429 = 6;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!rg;")
	public static Class204 aClass204_4;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
	public static int anInt4519;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt4499 = 0;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[Lclient!hk;")
	public static final Class70[] aClass70Array1 = new Class70[128];

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public static int anInt4511 = 0;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	public static void method4077() {
		Static278.aClass155_6.method4853(Static186.aFloat35, Static277.aFloat58, Static206.aFloat36);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Lclient!md;")
	public static Class3_Sub7_Sub9 method4079(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub9 local10 = (Class3_Sub7_Sub9) Static248.aClass21_3.method261((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = Static272.aClass20_61.method253(arg0 & 0x7FFF, 0);
		} else {
			local27 = Static246.aClass20_56.method253(arg0, 0);
		}
		local10 = new Class3_Sub7_Sub9();
		if (local27 != null) {
			local10.method3317(new Class3_Sub5(local27));
		}
		if (arg0 >= 32768) {
			local10.method3321();
		}
		Static248.aClass21_3.method259((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public static void method4080() {
		if (Static279.aFloat67 < 1024.0F) {
			Static279.aFloat67 = 1024.0F;
		}
		while (Static352.aFloat68 >= 16384.0F) {
			Static352.aFloat68 -= 16384.0F;
		}
		if (Static279.aFloat67 > 3072.0F) {
			Static279.aFloat67 = 3072.0F;
		}
		while (Static352.aFloat68 < 0.0F) {
			Static352.aFloat68 += 16384.0F;
		}
		@Pc(45) int local45 = Static76.anInt1623 >> 7;
		@Pc(49) int local49 = Static104.anInt2066 >> 7;
		@Pc(55) int local55 = Static55.method1005(Static104.anInt2066, Static363.anInt6170, Static76.anInt1623);
		@Pc(57) int local57 = 0;
		@Pc(77) int local77;
		if (local45 > 3 && local49 > 3 && local45 < 100 && local49 < 100) {
			for (local77 = local45 - 4; local77 <= local45 + 4; local77++) {
				for (@Pc(83) int local83 = local49 - 4; local83 <= local49 + 4; local83++) {
					@Pc(87) int local87 = Static363.anInt6170;
					if (local87 < 3 && Static25.method318(local77, local83)) {
						local87++;
					}
					@Pc(100) int local100 = 0;
					if (Static198.aClass117_Sub1_3.aByteArrayArrayArray11 != null && Static198.aClass117_Sub1_3.aByteArrayArrayArray11[local87] != null) {
						local100 = (Static198.aClass117_Sub1_3.aByteArrayArrayArray11[local87][local77][local83] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local100 + local55 - Static337.aClass7Array3[local87].method5648(local77, local83);
					if (local57 < local132) {
						local57 = local132;
					}
				}
			}
		}
		local77 = local57 * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (Static234.anInt4195 < local77) {
			Static234.anInt4195 += (local77 - Static234.anInt4195) / 24;
		} else if (Static234.anInt4195 > local77) {
			Static234.anInt4195 += (local77 - Static234.anInt4195) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!rp;)Lclient!ro;")
	public static Class42_Sub4 method4084(@OriginalArg(1) Class3_Sub5 arg0) {
		return new Class42_Sub4(arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2786(), arg0.method2786(), arg0.method2739());
	}
}

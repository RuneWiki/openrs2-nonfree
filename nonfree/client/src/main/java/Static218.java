import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!iw", name = "P", descriptor = "Lclient!jj;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!iw", name = "M", descriptor = "Lclient!h;")
	public static final Class125 aClass125_30 = new Class125(32);

	@OriginalMember(owner = "client!iw", name = "Q", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_129 = new Class88("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!iw", name = "T", descriptor = "Lclient!ko;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)Z")
	public static boolean method4005(@OriginalArg(1) boolean arg0) {
		@Pc(10) boolean local10 = Static243.aClass42_4.method5836();
		if (local10 == arg0) {
			return true;
		}
		if (!arg0) {
			Static243.aClass42_4.method5794();
		} else if (!Static243.aClass42_4.method5842()) {
			arg0 = false;
		}
		if (arg0 == local10) {
			return false;
		} else {
			Static208.aClass12_Sub10_Sub1_1.aBoolean177 = arg0;
			Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(B)V")
	public static void method4008() {
		for (@Pc(11) int local11 = 0; local11 < Static387.aByteArrayArrayArray18.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static387.aByteArrayArrayArray18[0].length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static387.aByteArrayArrayArray18[0][0].length; local19++) {
					Static387.aByteArrayArrayArray18[local11][local15][local19] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIIJ)V")
	public static void method4009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static9.method274(0, arg0, local10, arg1, local17, true, 0, 0);
			return;
		}
		@Pc(47) Class279 local47 = Static49.aClass155_2.method4063(local24);
		@Pc(63) int local63;
		@Pc(60) int local60;
		if (local17 == 0 || local17 == 2) {
			local60 = local47.anInt8303;
			local63 = local47.anInt8293;
		} else {
			local60 = local47.anInt8293;
			local63 = local47.anInt8303;
		}
		@Pc(74) int local74 = local47.anInt8297;
		if (local17 != 0) {
			local74 = (local74 << local17 & 0xF) + (local74 >> 4 - local17);
		}
		Static9.method274(local60, arg0, 0, arg1, 0, true, local74, local63);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([I[JZ)V")
	public static void method4015(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static242.method4184(arg1, arg1.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(Z)V")
	public static void method4016() {
		if (Static523.aBoolean662) {
			Static317.aClass84_16 = null;
			Static183.aClass84_6 = null;
			Static523.aBoolean662 = false;
		}
	}
}

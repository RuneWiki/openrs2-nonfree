import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "Z")
	public static boolean aBoolean571 = false;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
	public static final int anInt6961 = 1338;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!gk;B)Lclient!kaa;")
	public static Class187_Sub1 method5695(@OriginalArg(0) Class2_Sub7 arg0) {
		return new Class187_Sub1(arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4478(), arg0.method4503(), arg0.method4464());
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([BI)V")
	public static synchronized void method5696(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static85.anInt1450 < 1000) {
			Static416.aByteArrayArray6[Static85.anInt1450++] = arg0;
		} else if (arg0.length == 5000 && Static337.anInt5578 < 250) {
			Static199.aByteArrayArray8[Static337.anInt5578++] = arg0;
		} else if (arg0.length == 30000 && Static418.anInt6777 < 50) {
			Static365.aByteArrayArray11[Static418.anInt6777++] = arg0;
		} else if (Static374.aByteArrayArrayArray14 != null) {
			for (@Pc(63) int local63 = 0; local63 < Static203.anIntArray245.length; local63++) {
				if (arg0.length == Static203.anIntArray245[local63] && Class151_Sub2.lb[local63] < Static374.aByteArrayArrayArray14[local63].length) {
					Static374.aByteArrayArrayArray14[local63][Class151_Sub2.lb[local63]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5697(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static85.anInt1450 > 0) {
			local16 = Static416.aByteArrayArray6[--Static85.anInt1450];
			Static416.aByteArrayArray6[Static85.anInt1450] = null;
			return local16;
		} else if (arg0 == 5000 && Static337.anInt5578 > 0) {
			local16 = Static199.aByteArrayArray8[--Static337.anInt5578];
			Static199.aByteArrayArray8[Static337.anInt5578] = null;
			return local16;
		} else if (arg0 == 30000 && Static418.anInt6777 > 0) {
			local16 = Static365.aByteArrayArray11[--Static418.anInt6777];
			Static365.aByteArrayArray11[Static418.anInt6777] = null;
			return local16;
		} else {
			if (Static374.aByteArrayArrayArray14 != null) {
				for (@Pc(71) int local71 = 0; local71 < Static203.anIntArray245.length; local71++) {
					if (Static203.anIntArray245[local71] == arg0 && Class151_Sub2.lb[local71] > 0) {
						@Pc(97) byte[] local97 = Static374.aByteArrayArrayArray14[local71][--Class151_Sub2.lb[local71]];
						Static374.aByteArrayArrayArray14[local71][Class151_Sub2.lb[local71]] = null;
						return local97;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)[Lclient!mh;")
	public static Class225[] method5698() {
		return new Class225[] { Static268.aClass225_18, Static562.aClass225_29, Static143.aClass225_25, Static190.aClass225_11, Static262.aClass225_17, Static213.aClass225_13, Static373.aClass225_23, Static53.aClass225_30, Static171.aClass225_10, Static208.aClass225_12 };
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)Z")
	public static boolean method5700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

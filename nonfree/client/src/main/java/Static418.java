import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!nv", name = "mi", descriptor = "Lclient!bka;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!nv", name = "vi", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZIIII)Z")
	public static boolean method5745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg3; local16++) {
				if (arg4 == Static430.anIntArrayArray39[local12][local16] && Static71.anIntArrayArray6[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
	public static byte[] method5746(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static560.method7430(local13) : local13;
		} else if (arg0 instanceof Class156) {
			@Pc(32) Class156 local32 = (Class156) arg0;
			return local32.method4851();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "(B)Z")
	public static boolean method5750() {
		try {
			if (Static91.anInt1809 == 2) {
				if (Static641.aClass4_Sub43_2 == null) {
					Static641.aClass4_Sub43_2 = Static686.method6727(Static586.aClass34_116, Static566.anInt8739, Static46.anInt907);
					if (Static641.aClass4_Sub43_2 == null) {
						return false;
					}
				}
				if (Static108.aClass287_1 == null) {
					Static108.aClass287_1 = new Class287(Static105.aClass34_24, Static245.aClass34_106);
				}
				@Pc(31) Class4_Sub3_Sub4 local31 = Static570.aClass4_Sub3_Sub4_6;
				if (Static554.aClass4_Sub3_Sub4_5 != null) {
					local31 = Static554.aClass4_Sub3_Sub4_5;
				}
				if (local31.method6763(Static108.aClass287_1, Static148.aClass34_35, Static641.aClass4_Sub43_2)) {
					Static570.aClass4_Sub3_Sub4_6 = local31;
					Static570.aClass4_Sub3_Sub4_6.method6778();
					@Pc(67) int local67;
					if (Static282.anInt4509 > 0) {
						Static91.anInt1809 = 3;
						Static570.aClass4_Sub3_Sub4_6.method6787(Static414.anInt5938 < Static282.anInt4509 ? Static414.anInt5938 : Static282.anInt4509);
						for (local67 = 0; local67 < Static475.anIntArray511.length; local67++) {
							Static570.aClass4_Sub3_Sub4_6.method6780(Static475.anIntArray511[local67], local67);
							Static475.anIntArray511[local67] = 255;
						}
					} else {
						Static91.anInt1809 = 0;
						Static570.aClass4_Sub3_Sub4_6.method6787(Static414.anInt5938);
						for (local67 = 0; local67 < Static475.anIntArray511.length; local67++) {
							Static570.aClass4_Sub3_Sub4_6.method6780(Static475.anIntArray511[local67], local67);
							Static475.anIntArray511[local67] = 255;
						}
					}
					if (Static554.aClass4_Sub3_Sub4_5 == null) {
						if (Static170.aLong96 <= 0L) {
							Static570.aClass4_Sub3_Sub4_6.method6769(Static466.aBoolean583, Static641.aClass4_Sub43_2);
						} else {
							Static570.aClass4_Sub3_Sub4_6.method6765(Static170.aLong96, Static466.aBoolean583, Static641.aClass4_Sub43_2);
						}
					}
					if (Static26.aClass64_2 != null) {
						Static26.aClass64_2.method2207(Static570.aClass4_Sub3_Sub4_6);
					}
					Static170.aLong96 = 0L;
					Static554.aClass4_Sub3_Sub4_5 = null;
					Static108.aClass287_1 = null;
					Static586.aClass34_116 = null;
					Static641.aClass4_Sub43_2 = null;
					return true;
				}
			}
		} catch (@Pc(164) Exception local164) {
			local164.printStackTrace();
			Static570.aClass4_Sub3_Sub4_6.method6785();
			Static554.aClass4_Sub3_Sub4_5 = null;
			Static641.aClass4_Sub43_2 = null;
			Static586.aClass34_116 = null;
			Static108.aClass287_1 = null;
			Static91.anInt1809 = 0;
		}
		return false;
	}
}

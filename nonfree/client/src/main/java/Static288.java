import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!ei;")
	public static Class2_Sub12_Sub2 aClass2_Sub12_Sub2_5;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int anInt7075;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_22 = new Class91(11, 17);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!ua;)Ljava/lang/String;")
	public static String method5991(@OriginalArg(1) Class2_Sub44 arg0) {
		return arg0.aString179 == null || arg0.aString179.length() <= 0 ? arg0.aString180 : arg0.aString180 + Static180.aClass202_104.method5139(Static172.anInt6352) + arg0.aString179;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
	public static int method5994(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIZII)V")
	public static void method5995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg0 < 0 || Static363.anInt1158 - 1 <= arg3 || arg0 >= Static511.anInt8889 - 1) {
			return;
		}
		if (Static399.aClass262ArrayArrayArray2 == null) {
			return;
		}
		@Pc(40) Interface6 local40;
		if (arg2 == 0) {
			local40 = (Interface6) Static524.method7595(arg6, arg3, arg0);
			@Pc(46) Interface6 local46 = (Interface6) Static382.method5982(arg6, arg3, arg0);
			if (local40 != null && arg4 != 2) {
				if (local40 instanceof Class1_Sub2_Sub3) {
					((Class1_Sub2_Sub3) local40).aClass18_4.method635(arg1);
				} else {
					Static421.method6556(arg1, arg4, arg0, arg5, arg3, local40.method7688(), arg2, arg6);
				}
			}
			if (local46 != null) {
				if (local46 instanceof Class1_Sub2_Sub3) {
					((Class1_Sub2_Sub3) local46).aClass18_4.method635(arg1);
				} else {
					Static421.method6556(arg1, arg4, arg0, arg5, arg3, local46.method7688(), arg2, arg6);
				}
			}
		} else if (arg2 == 1) {
			local40 = (Interface6) Static55.method1029(arg6, arg3, arg0);
			if (local40 != null) {
				if (local40 instanceof Class1_Sub3_Sub3) {
					((Class1_Sub3_Sub3) local40).aClass18_2.method635(arg1);
				} else {
					@Pc(216) int local216 = local40.method7688();
					if (arg4 == 4 || arg4 == 5) {
						Static421.method6556(arg1, 4, arg0, arg5, arg3, local216, arg2, arg6);
					} else if (arg4 == 6) {
						Static421.method6556(arg1, 4, arg0, arg5 + 4, arg3, local216, arg2, arg6);
					} else if (arg4 == 7) {
						Static421.method6556(arg1, 4, arg0, (arg5 + 2 & 0x3) + 4, arg3, local216, arg2, arg6);
					} else if (arg4 == 8) {
						Static421.method6556(arg1, 4, arg0, arg5 + 4, arg3, local216, arg2, arg6);
						Static421.method6556(arg1, 4, arg0, (arg5 + 2 & 0x3) + 4, arg3, local216, arg2, arg6);
					}
				}
			}
		} else if (arg2 == 2) {
			local40 = (Interface6) Static214.method3907(arg6, arg3, arg0, ej.class);
			if (local40 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local40 instanceof Class1_Sub1_Sub1) {
					((Class1_Sub1_Sub1) local40).aClass18_1.method635(arg1);
				} else {
					Static421.method6556(arg1, arg4, arg0, arg5, arg3, local40.method7688(), arg2, arg6);
				}
			}
		} else if (arg2 == 3) {
			local40 = (Interface6) Static427.method6584(arg6, arg3, arg0);
			if (local40 != null) {
				if (local40 instanceof Class1_Sub4_Sub1) {
					((Class1_Sub4_Sub1) local40).aClass18_3.method635(arg1);
				} else {
					Static421.method6556(arg1, arg4, arg0, arg5, arg3, local40.method7688(), arg2, arg6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public static void method5996() {
		Static294.aClass231_46.method6240();
	}
}

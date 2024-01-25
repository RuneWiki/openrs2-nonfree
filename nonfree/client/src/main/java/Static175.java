import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "Lclient!nj;")
	public static Class247 aClass247_2;

	@OriginalMember(owner = "client!gaa", name = "C", descriptor = "Lclient!fga;")
	public static final Class105 aClass105_1 = new Class105();

	@OriginalMember(owner = "client!gaa", name = "G", descriptor = "S")
	public static short aShort45 = 320;

	@OriginalMember(owner = "client!gaa", name = "N", descriptor = "I")
	public static final int anInt3420 = Static296.method5214(1600);

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILclient!qfa;BII)Lclient!cw;")
	public static Class66_Sub1_Sub1 method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean595 || Static178.method2845(arg0) && Static178.method2845(arg1)) {
			return new Class66_Sub1_Sub1(arg2, 3553, arg4, arg3, arg0, arg1, true);
		} else if (arg2.aBoolean596) {
			return new Class66_Sub1_Sub1(arg2, 34037, arg4, arg3, arg0, arg1, true);
		} else {
			return new Class66_Sub1_Sub1(arg2, arg4, arg3, arg0, arg1, Static330.method5181(arg0), Static330.method5181(arg1), true);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)Z")
	public static boolean method2820(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class14_Sub3_Sub11 local18 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local18 != null; local18 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
			if (Static254.method3738(local18.anInt4752) && local18.aLong144 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "(I)V")
	public static void method2825() {
		for (@Pc(7) int local7 = 0; local7 < Static4.anInt29; local7++) {
			@Pc(13) Class393 local13 = Static178.aClass393Array1[local7];
			if (local13.aByte150 == 3) {
				if (local13.aClass14_Sub5_Sub4_4 == null) {
					local13.anInt11164 = Integer.MIN_VALUE;
				} else {
					Static217.aClass14_Sub5_Sub3_1.method6029(local13.aClass14_Sub5_Sub4_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!wn;I)Ljava/lang/String;")
	public static String method2826(@OriginalArg(0) Class14_Sub3_Sub21 arg0) {
		return arg0.aString119 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)Z")
	public static boolean method2827(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}

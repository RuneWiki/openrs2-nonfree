import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_56 = new Class40(12, 6);

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "Lclient!nl;")
	public static final Class214 aClass214_6 = new Class214(1);

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
	public static int anInt2364 = 0;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!hc;")
	public static Class29_Sub2 method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class66 local14 = local7.aClass66_1; local14 != null; local14 = local14.aClass66_2) {
			@Pc(18) Class29_Sub2 local18 = local14.aClass29_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort122 == arg1 && local18.aShort121 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 + arg2 > arg5 && arg1 < arg5 + arg0) {
			return arg3 < arg4 + arg6 && arg7 + arg3 > arg4;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZI)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (anInt2364 <= arg3 && arg3 <= Static60.anInt971) {
			@Pc(15) int local15 = Static112.method1759(arg2, Static235.anInt3970, Static151.anInt2683);
			@Pc(21) int local21 = Static112.method1759(arg1, Static235.anInt3970, Static151.anInt2683);
			Static262.method3724(arg0, local21, arg3, local15);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2000(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static306.aStringArray21.length; local7++) {
			if (Static306.aStringArray21[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IBII)I")
	public static int method2002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + (((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1));
	}
}

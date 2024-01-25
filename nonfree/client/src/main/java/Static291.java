import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "F")
	public static float aFloat110;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Lclient!km;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public static int anInt5934 = 0;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_55 = new Class257(84, 3);

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
	public static int anInt5939 = 0;

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean425 = true;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BC)I")
	public static int method4857(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class36_Sub14.anIntArray351.length ? Class36_Sub14.anIntArray351[arg0] : -1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BZ)V")
	public static void method4858(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class8_Sub4 local6 = (Class8_Sub4) Static584.aClass43_63.method1422(); local6 != null; local6 = (Class8_Sub4) Static584.aClass43_63.method1426()) {
			if (local6.aClass8_Sub16_Sub3_2 != null) {
				Static15.aClass8_Sub16_Sub5_1.method7443(local6.aClass8_Sub16_Sub3_2);
				local6.aClass8_Sub16_Sub3_2 = null;
			}
			if (local6.aClass8_Sub16_Sub3_1 != null) {
				Static15.aClass8_Sub16_Sub5_1.method7443(local6.aClass8_Sub16_Sub3_1);
				local6.aClass8_Sub16_Sub3_1 = null;
			}
			local6.method8640();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class8_Sub4 local57 = (Class8_Sub4) Static295.aClass43_32.method1422(); local57 != null; local57 = (Class8_Sub4) Static295.aClass43_32.method1426()) {
			if (local57.aClass8_Sub16_Sub3_2 != null) {
				Static15.aClass8_Sub16_Sub5_1.method7443(local57.aClass8_Sub16_Sub3_2);
				local57.aClass8_Sub16_Sub3_2 = null;
			}
			local57.method8640();
		}
		for (@Pc(84) Class8_Sub4 local84 = (Class8_Sub4) Static413.aClass253_30.method6593(); local84 != null; local84 = (Class8_Sub4) Static413.aClass253_30.method6595()) {
			if (local84.aClass8_Sub16_Sub3_2 != null) {
				Static15.aClass8_Sub16_Sub5_1.method7443(local84.aClass8_Sub16_Sub3_2);
				local84.aClass8_Sub16_Sub3_2 = null;
			}
			local84.method8640();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4859(@OriginalArg(1) int arg0) {
		@Pc(16) Class8_Sub52 local16 = (Class8_Sub52) Static16.aClass253_3.method6594((long) arg0);
		if (local16 != null) {
			@Pc(23) Class8_Sub19_Sub2 local23 = local16.aClass2_Sub1_1.method4232();
			if (local23 != null) {
				@Pc(30) double local30 = local16.aClass2_Sub1_1.method4226();
				if ((double) local23.method4358() <= local30 && (double) local23.method4357() >= local30) {
					return local23.method4359();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII[IIII[IB[F[FI)V")
	public static void method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11) {
		@Pc(15) int local15 = arg2 + arg0 * arg3;
		@Pc(22) int local22 = arg7 * arg6 + arg5;
		@Pc(27) int local27 = arg0 - arg11;
		@Pc(32) int local32 = arg7 - arg11;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (arg4 == null) {
			for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg11 + local15;
				while (local15 < local44) {
					arg10[local22++] = arg9[local15++];
				}
				local15 += local27;
				local22 += local32;
			}
		} else if (arg9 == null) {
			for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg11 + local15;
				while (local15 < local44) {
					arg8[local22++] = arg4[local15++];
				}
				local15 += local27;
				local22 += local32;
			}
		} else {
			for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg11 + local15;
				while (local15 < local44) {
					arg8[local22] = arg4[local15];
					arg10[local22++] = arg9[local15++];
				}
				local15 += local27;
				local22 += local32;
			}
		}
	}
}

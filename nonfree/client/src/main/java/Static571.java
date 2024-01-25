import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "Lclient!rh;")
	public static final Class305 aClass305_4 = new Class305();

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_329 = new Class179(68, 7);

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_137 = new Class289(36, -1);

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_138 = new Class289(82, 6);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!oq;)V")
	public static void method7962(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class2_Sub1 local7 = null;
			for (@Pc(11) Class2_Sub1 local11 = Static229.aClass2_Sub1Array2[local4]; local11 != null; local11 = local11.aClass2_Sub1_22) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static229.aClass2_Sub1Array2[local4] = local11.aClass2_Sub1_22;
					} else {
						local7.aClass2_Sub1_22 = local11.aClass2_Sub1_22;
					}
					Static119.aBoolean126 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class2_Sub1 local43 = Static643.aClass2_Sub1Array5[local4]; local43 != null; local43 = local43.aClass2_Sub1_22) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static643.aClass2_Sub1Array5[local4] = local43.aClass2_Sub1_22;
					} else {
						local7.aClass2_Sub1_22 = local43.aClass2_Sub1_22;
					}
					Static119.aBoolean126 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class2_Sub1 local75 = Static512.aClass2_Sub1Array4[local4]; local75 != null; local75 = local75.aClass2_Sub1_22) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static512.aClass2_Sub1Array4[local4] = local75.aClass2_Sub1_22;
					} else {
						local7.aClass2_Sub1_22 = local75.aClass2_Sub1_22;
					}
					Static119.aBoolean126 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method7963(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}

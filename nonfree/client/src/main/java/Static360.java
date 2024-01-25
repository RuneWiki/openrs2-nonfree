import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "Lclient!al;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "Lclient!eo;")
	public static final Class108 aClass108_8 = new Class108(1, 2);

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
	public static int anInt6167 = -1;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString78 = null;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!af;B)I")
	public static int method5205(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method333(2);
		@Pc(30) int local30;
		if (local10 == 0) {
			local30 = 0;
		} else if (local10 == 1) {
			local30 = arg0.method333(5);
		} else if (local10 == 2) {
			local30 = arg0.method333(8);
		} else {
			local30 = arg0.method333(11);
		}
		return local30;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method5206(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static525.aBoolean575) {
			try {
				@Pc(23) Class13 local23 = (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
				local23.method399(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static525.aBoolean575 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)Z")
	public static boolean method5208() {
		@Pc(15) Class3_Sub43 local15 = (Class3_Sub43) Static174.aClass302_16.method6603();
		if (local15 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local15.anInt8226; local21++) {
			if (local15.aClass338Array1[local21] != null && local15.aClass338Array1[local21].anInt9321 == 0) {
				return false;
			}
			if (local15.aClass338Array2[local21] != null && local15.aClass338Array2[local21].anInt9321 == 0) {
				return false;
			}
		}
		return true;
	}
}

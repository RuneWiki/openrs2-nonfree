import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)Z")
	public static boolean method6198() {
		try {
			@Pc(7) Class359 local7 = new Class359();
			@Pc(16) byte[] local16 = local7.method7525(Static272.aByteArray48);
			Static509.method6611(local16);
			return true;
		} catch (@Pc(23) Exception local23) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)[Lclient!cw;")
	public static Class68[] method6199() {
		return new Class68[] { Static378.aClass68_3, Static149.aClass68_2, Static428.aClass68_4 };
	}

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V")
	public static void method6200() {
		Static13.anIntArray416 = null;
		Static494.aBoolean666 = false;
		Static270.anIntArray316 = null;
		Static535.anIntArray575 = null;
		Static63.anIntArray112 = null;
		Static526.anIntArray619 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method6201(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static191.method2415(local13) : local13;
		} else if (arg1 instanceof Class272) {
			@Pc(29) Class272 local29 = (Class272) arg1;
			return local29.method5783();
		} else {
			throw new IllegalArgumentException();
		}
	}
}

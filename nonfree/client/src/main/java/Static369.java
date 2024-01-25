import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mfa", name = "s", descriptor = "I")
	public static int anInt11000;

	@OriginalMember(owner = "client!mfa", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray67 = new boolean[100];

	@OriginalMember(owner = "client!mfa", name = "y", descriptor = "I")
	public static int anInt11005 = 0;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method9408(@OriginalArg(0) Class101 arg0) {
		if (Static183.aBoolean305) {
			Static649.method9560(arg0);
		} else {
			Static29.method499(arg0);
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBLclient!ol;)Ljava/lang/String;")
	public static String method9409(@OriginalArg(2) Class2_Sub8 arg0) {
		try {
			@Pc(15) int local15 = arg0.method5173();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local15];
			arg0.anInt5725 += Static220.aClass36_1.method1073(arg0.lb, 0, local15, local23, arg0.anInt5725);
			return Static4.method88(local23, local15, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)I")
	public static int method9413(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static294.anInt5364 - 1; local3++) {
			if (arg0 < Static668.anIntArray596[local3] + Static654.anIntArray589[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static294.anInt5364 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)V")
	public static void method9414() {
		Static631.aClass22_66.method461();
	}
}

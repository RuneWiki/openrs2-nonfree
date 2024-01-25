import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cga", name = "z", descriptor = "Lclient!wba;")
	public static Class369 aClass369_1;

	@OriginalMember(owner = "client!cga", name = "x", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!cga", name = "y", descriptor = "[I")
	public static final int[] anIntArray75 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
	public static void method2044() {
		if (Static5.aClass90Array1 == null) {
			Static5.aClass90Array1 = Static140.method2771();
			Static91.aClass90_1 = Static5.aClass90Array1[0];
			Static416.aLong205 = Static582.method8056();
		}
		if (Static272.aClass61_1 == null) {
			Static469.method6995();
		}
		@Pc(27) Class90 local27 = Static91.aClass90_1;
		@Pc(34) int local34 = Static307.method5177();
		if (local27 == Static91.aClass90_1) {
			Static194.aString43 = Static91.aClass90_1.aClass316_2.method7577(Static638.anInt10709);
			if (Static91.aClass90_1.aBoolean257) {
				Static359.anInt6963 = (Static91.aClass90_1.anInt3327 - Static91.aClass90_1.anInt3323) * local34 / 100 + Static91.aClass90_1.anInt3323;
			}
			if (Static91.aClass90_1.aBoolean258) {
				Static194.aString43 = Static194.aString43 + Static359.anInt6963 + "%";
			}
		} else if (Static140.aClass90_23 == Static91.aClass90_1) {
			Static272.aClass61_1 = null;
			Static119.method2558(3);
		} else {
			Static194.aString43 = local27.aClass316_1.method7577(Static638.anInt10709);
			Static359.anInt6963 = local27.anInt3327;
			if (Static91.aClass90_1.aBoolean258) {
				Static194.aString43 = Static194.aString43 + local27.anInt3327 + "%";
			}
			if (Static91.aClass90_1.aBoolean257 || local27.aBoolean257) {
				Static416.aLong205 = Static582.method8056();
			}
		}
		if (Static272.aClass61_1 == null) {
			return;
		}
		Static272.aClass61_1.method2363(Static416.aLong205, Static359.anInt6963, Static91.aClass90_1, Static194.aString43);
		if (Static294.anInterface12Array1 == null) {
			return;
		}
		for (@Pc(134) int local134 = Static593.anInt10031 + 1; local134 < Static294.anInterface12Array1.length; local134++) {
			if (Static294.anInterface12Array1[local134].method7298() >= 100 && local134 - 1 == Static593.anInt10031 && Static333.anInt6626 >= 1 && Static272.aClass61_1.method2358()) {
				try {
					Static294.anInterface12Array1[local134].method7299();
				} catch (@Pc(168) Exception local168) {
					Static294.anInterface12Array1 = null;
					return;
				}
				Static272.aClass61_1.method2361(Static294.anInterface12Array1[local134]);
				Static593.anInt10031++;
				if (Static593.anInt10031 >= Static294.anInterface12Array1.length - 1 && Static294.anInterface12Array1.length > 1) {
					Static593.anInt10031 = Static7.aClass293_1.method7196() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)V")
	public static void method2047() {
		if (Static272.aClass61_1 != null) {
			Static272.aClass61_1.method2365();
		}
		if (Static450.aThread4 == null) {
			return;
		}
		while (true) {
			try {
				Static450.aThread4.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}
}

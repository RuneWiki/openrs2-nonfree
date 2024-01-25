import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public static void method5630() {
		Static273.anInt5414 = 0;
		Static106.anInt2100 = -1;
		Static281.anInt5609 = -1;
		Static51.anInt935 = -1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	public static void method5632() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static574.aClass334Array1.length; local3++) {
				if (Static574.aClass334Array1[local3].method8105()) {
					Static282.aLongArray5[local3] = Static574.aClass334Array1[local3].method8101();
				} else {
					synchronized (Static574.aClass334Array1[local3]) {
						Static574.aClass334Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static574.aClass334Array1[Static574.aClass334Array1.length - 1].method8103();
				Static181.method3309(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static574.aClass334Array1.length - 1; local3++) {
						if (!Static574.aClass334Array1[local3].method8105()) {
							synchronized (Static574.aClass334Array1[local3]) {
								Static574.aClass334Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static574.aClass334Array1.length - 2; local102++) {
							Static574.aClass334Array1[local102].method8103();
						}
						Static181.method3309(2);
						while (!Static574.aClass334Array1[0].method8105()) {
							synchronized (Static574.aClass334Array1[0]) {
								Static574.aClass334Array1[0].notify();
							}
							try {
								Static179.method3254(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static574.aClass334Array1[0].method8103();
						return;
					}
					try {
						Static179.method3254(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static179.method3254(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public static void method5633() {
		Static591.method8326();
		@Pc(17) int local17 = Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5047();
		if (local17 == 2) {
			Static198.method3520(Static356.anInt6630, Static162.aClass100_7, Static321.anInt6137);
		} else if (local17 == 3) {
			Static621.method8661(Static321.anInt6137, Static356.anInt6630, Static162.aClass100_7, Static647.anInt10719, Static213.anInt4193);
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5046()) {
			Static636.method8949(Static271.aCanvas6);
		}
		if (Static162.aClass100_7 != null) {
			Static343.method5556();
		}
		Static591.aBoolean675 = Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5047() != 0;
		Static389.aBoolean497 = Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5046();
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)Z")
	public static boolean method5636(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!vs;)V")
	public static void method5637(@OriginalArg(0) Class20_Sub2 arg0) {
		Static565.aClass100_15.H(arg0.anInt10725, arg0.anInt10724 + (arg0.method9019() >> 1), arg0.anInt10729, Static393.anIntArray442);
		arg0.anInt10726 = Static393.anIntArray442[0];
		arg0.anInt10723 = Static393.anIntArray442[1];
		arg0.anInt10727 = Static393.anIntArray442[2];
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!js", name = "n", descriptor = "I")
	public static int anInt5224;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_88 = new Class322(48, -1);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public static void method4781() {
		Static149.aClass359_17.method8502(50);
		Static556.aClass359_50.method8502(50);
		Static109.aClass359_13.method8502(50);
		Static43.aClass359_5.method8502(50);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "()V")
	public static void method4782() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static630.aClass106Array2.length; local3++) {
				if (Static630.aClass106Array2[local3].method2903()) {
					Static606.aLongArray18[local3] = Static630.aClass106Array2[local3].method2907();
				} else {
					synchronized (Static630.aClass106Array2[local3]) {
						Static630.aClass106Array2[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static630.aClass106Array2[Static630.aClass106Array2.length - 1].method2902();
				Static343.method5260(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static630.aClass106Array2.length - 1; local3++) {
						if (!Static630.aClass106Array2[local3].method2903()) {
							synchronized (Static630.aClass106Array2[local3]) {
								Static630.aClass106Array2[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static630.aClass106Array2.length - 2; local106++) {
							Static630.aClass106Array2[local106].method2902();
						}
						Static343.method5260(2);
						while (!Static630.aClass106Array2[0].method2903()) {
							synchronized (Static630.aClass106Array2[0]) {
								Static630.aClass106Array2[0].notify();
							}
							try {
								Static255.method4444(1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static630.aClass106Array2[0].method2902();
						return;
					}
					try {
						Static255.method4444(1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static255.method4444(1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}
}

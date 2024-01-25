import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
	public static int anInt7640;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	public static int anInt7641 = 0;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
	public static final int[] anIntArray513 = new int[6];

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!kca;")
	public static final Class187 aClass187_11 = new Class187(3);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
	public static void method6388() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static408.aClass235Array1.length; local3++) {
				if (Static408.aClass235Array1[local3].method5776()) {
					Static479.aLongArray14[local3] = Static408.aClass235Array1[local3].method5772();
				} else {
					synchronized (Static408.aClass235Array1[local3]) {
						Static408.aClass235Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static408.aClass235Array1[Static408.aClass235Array1.length - 1].method5777();
				Static121.method2491(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static408.aClass235Array1.length - 1; local3++) {
						if (!Static408.aClass235Array1[local3].method5776()) {
							synchronized (Static408.aClass235Array1[local3]) {
								Static408.aClass235Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static408.aClass235Array1.length - 2; local102++) {
							Static408.aClass235Array1[local102].method5777();
						}
						Static121.method2491(2);
						while (!Static408.aClass235Array1[0].method5776()) {
							synchronized (Static408.aClass235Array1[0]) {
								Static408.aClass235Array1[0].notify();
							}
							try {
								Static57.method1062(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static408.aClass235Array1[0].method5777();
						return;
					}
					try {
						Static57.method1062(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static57.method1062(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBII)Z")
	public static boolean method6390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static303.aClass6_22.method6702(arg1, arg2, arg0, Static164.anIntArray260);
		@Pc(18) int local18 = Static164.anIntArray260[2];
		if (local18 < 50) {
			return false;
		} else {
			Static164.anIntArray260[1] = Static164.anIntArray260[1] * Static48.anInt1059 / local18 + Static404.anInt889;
			Static164.anIntArray260[0] = Static519.anInt8686 + Static164.anIntArray260[0] * Static509.anInt8574 / local18;
			Static164.anIntArray260[2] = local18;
			return true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method6391(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub50 local20 = Static595.method8194(Static610.aClass310_2, Static2.aClass269_1);
		local20.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0) + 1);
		local20.aClass2_Sub34_Sub2_2.method6894(arg1);
		local20.aClass2_Sub34_Sub2_2.method6918(arg0);
		Static311.method4754(local20);
	}
}

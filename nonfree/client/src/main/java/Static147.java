import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!sa", name = "Cb", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "Lclient!qd;")
	public static Class65 aClass65_14 = new Class65();

	@OriginalMember(owner = "client!sa", name = "xb", descriptor = "Z")
	public static boolean aBoolean150 = true;

	@OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lclient!qd;")
	public static Class65 aClass65_15 = new Class65();

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "[I")
	public static int[] anIntArray313 = new int[1000];

	@OriginalMember(owner = "client!sa", name = "Bb", descriptor = "[[[Lclient!qd;")
	public static Class65[][][] aClass65ArrayArrayArray1 = new Class65[4][104][104];

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!gg;Lclient!gg;Lclient!jc;)Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 method2307(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(16) int local16 = arg2.method1777(arg1);
		@Pc(22) int local22 = arg2.method1774(arg0, local16);
		return Static163.method2524(local16, arg2, local22);
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	public static void method2309() {
		aClass65ArrayArrayArray1 = null;
		anIntArray313 = null;
		aClass65_15 = null;
		anIntArray314 = null;
		aClass65_14 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fd;IZ)V")
	public static void method2310(@OriginalArg(0) Class22 arg0, @OriginalArg(2) boolean arg1) {
		if (Static142.aClass22_3 != null) {
			try {
				Static142.aClass22_3.method962();
			} catch (@Pc(12) Exception local12) {
			}
			Static142.aClass22_3 = null;
		}
		Static142.aClass22_3 = arg0;
		Static117.method1961(arg1);
		Static17.aClass2_Sub2_2 = null;
		Static90.aClass2_Sub4_Sub13_1 = null;
		Static84.aClass2_Sub2_4.anInt2385 = 0;
		Static11.anInt537 = 0;
		while (true) {
			@Pc(33) Class2_Sub4_Sub13 local33 = (Class2_Sub4_Sub13) Static118.aClass35_47.method1359();
			if (local33 == null) {
				while (true) {
					local33 = (Class2_Sub4_Sub13) Static58.aClass35_22.method1359();
					if (local33 == null) {
						if (Static6.aByte1 != 0) {
							try {
								@Pc(90) Class2_Sub2 local90 = new Class2_Sub2(4);
								local90.method1700(4);
								local90.method1700(Static6.aByte1);
								local90.method1696(0);
								Static142.aClass22_3.method965(4, local90.aByteArray35);
							} catch (@Pc(111) IOException local111) {
								try {
									Static142.aClass22_3.method962();
								} catch (@Pc(116) Exception local116) {
								}
								Static142.aClass22_3 = null;
								Static157.anInt3497++;
							}
						}
						Static54.anInt1392 = 0;
						Static112.aLong99 = Static177.method2758();
						return;
					}
					Static122.aClass4_2.method322(local33);
					Static146.aClass35_38.method1362(local33, local33.aLong145);
					Static45.anInt1213++;
					Static172.anInt3842--;
				}
			}
			Static152.aClass35_41.method1362(local33, local33.aLong145);
			Static178.anInt3955++;
			Static104.anInt2597--;
		}
	}
}

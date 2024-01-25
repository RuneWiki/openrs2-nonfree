import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!g;")
	public static Class83 aClass83_116;

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "Lclient!hc;")
	public static Class93 aClass93_4;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static int anInt5937 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!vt;)Ljava/lang/String;")
	public static String method5229(@OriginalArg(1) Class2_Sub24 arg0) {
		return Static284.method4948(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V")
	public static void method5231(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static388.anInt7080 != -1) {
				Static282.method4698(Static388.anInt7080);
			}
			for (@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) Static273.aClass243_20.method5975(); local15 != null; local15 = (Class2_Sub26) Static273.aClass243_20.method5973()) {
				if (!local15.method6126()) {
					local15 = (Class2_Sub26) Static273.aClass243_20.method5975();
					if (local15 == null) {
						break;
					}
				}
				Static110.method2010(local15, false, true);
			}
			Static388.anInt7080 = -1;
			Static273.aClass243_20 = new Class243(8);
			Static34.method470();
			Static388.anInt7080 = Static383.anInt6965;
			Static357.method5625(false);
			Static59.method899();
			Static351.method5591(Static388.anInt7080);
		}
		Static387.method6073();
		Static190.anInt3987 = -1;
		Static145.method4761(Static387.anInt7048);
		Static182.aClass1_Sub2_Sub1_Sub1_1 = new Class1_Sub2_Sub1_Sub1();
		Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 = 6656;
		Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0] = 52;
		Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 = 6656;
		Static27.anInt2842 = 0;
		Static145.anInt5345 = 0;
		Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0] = 52;
		if (Static198.anInt4108 == 2) {
			Static27.anInt2842 = Static178.anInt3759 << 7;
			Static145.anInt5345 = Static141.anInt3014 << 7;
		} else {
			Static287.method4734();
		}
		Static370.method4288();
		if (Static145.anInt5345 == 0 || Static27.anInt2842 == 0) {
			Static181.method3326(10);
		} else {
			Static388.method6093();
			Static181.method3326(28);
		}
	}
}

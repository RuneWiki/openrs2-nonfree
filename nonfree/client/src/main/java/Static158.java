import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!ig;")
	public static Class12 aClass12_9;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!ap;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_11 = new Class175(3, 16);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method2616() {
		@Pc(13) int local13 = Static8.aClass173_Sub1_1.method3974(Static155.anInt2774);
		if (local13 == 0) {
			Static193.aByteArrayArrayArray4 = null;
			Static247.method3804(0);
		} else if (local13 == 1) {
			Static75.method1411((byte) 0);
			Static247.method3804(512);
			if (Static179.aByteArrayArrayArray3 != null) {
				Static302.method4399();
			}
		} else {
			Static75.method1411((byte) (Static75.anInt1503 - 4 & 0xFF));
			Static247.method3804(2);
		}
		Static366.anInt6139 = Static4.anInt30;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!qh;I)I")
	public static int method2617(@OriginalArg(0) Class3_Sub3_Sub6_Sub1 arg0) {
		@Pc(12) int local12 = arg0.anInt5524;
		@Pc(16) Class208 local16 = arg0.method5511();
		if (arg0.aBoolean453) {
			local12 = arg0.anInt5517;
		} else if (arg0.anInt6735 == local16.anInt5574 || arg0.anInt6735 == local16.anInt5595 || local16.anInt5570 == arg0.anInt6735 || arg0.anInt6735 == local16.anInt5555) {
			local12 = arg0.anInt5505;
		} else if (arg0.anInt6735 == local16.anInt5588 || local16.anInt5571 == arg0.anInt6735 || arg0.anInt6735 == local16.anInt5585 || arg0.anInt6735 == local16.anInt5573) {
			local12 = arg0.anInt5519;
		}
		return local12;
	}
}

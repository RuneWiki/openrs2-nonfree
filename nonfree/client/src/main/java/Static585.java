import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
	public static int anInt9440;

	@OriginalMember(owner = "client!tp", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V")
	public static void method8257() {
		@Pc(5) Class371[] local5 = Class3_Sub9_Sub23.aClass371Array1;
		synchronized (Class3_Sub9_Sub23.aClass371Array1) {
			for (@Pc(17) int local17 = 0; local17 < Class3_Sub9_Sub23.aClass371Array1.length; local17++) {
				Class3_Sub9_Sub23.aClass371Array1[local17] = new Class371();
				Static619.anIntArray944[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	public static void method8258() {
		Static87.anInt1710 = (int) ((double) Static158.anInt927 * 34.46D);
		Static442.anInt7035 = 200;
		Static87.anInt1710 <<= 0x2;
		if (Static674.aClass13_22.method8513()) {
			Static87.anInt1710 += 512;
		}
		Static511.method7219(false);
	}
}

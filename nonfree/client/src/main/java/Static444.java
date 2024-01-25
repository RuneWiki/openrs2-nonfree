import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_16 = new Class104(6, 0, 4, 2);

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
	public static void method6716() {
		Static182.method3694(11);
		Static217.method1814();
		System.gc();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLclient!nga;)[Lclient!rha;")
	public static Class288[] method6717(@OriginalArg(1) Class228 arg0) {
		if (!arg0.method5937()) {
			return new Class288[0];
		}
		@Pc(16) Class376 local16 = arg0.method5933();
		while (local16.anInt10510 == 0) {
			Static500.method7308(10L);
		}
		if (local16.anInt10510 == 2) {
			return new Class288[0];
		}
		@Pc(42) int[] local42 = (int[]) local16.anObject19;
		@Pc(48) Class288[] local48 = new Class288[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class288 local56 = new Class288();
			local48[local50] = local56;
			local56.anInt8634 = local42[local50 << 2];
			local56.anInt8630 = local42[(local50 << 2) + 1];
			local56.anInt8633 = local42[(local50 << 2) + 2];
			local56.anInt8631 = local42[(local50 << 2) + 3];
		}
		return local48;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)J")
	public static synchronized long method6719() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static211.aLong107 > local5) {
			Static452.aLong208 += Static211.aLong107 - local5;
		}
		Static211.aLong107 = local5;
		return Static452.aLong208 + local5;
	}
}

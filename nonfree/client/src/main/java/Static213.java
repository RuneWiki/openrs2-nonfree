import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hj", name = "si", descriptor = "I")
	public static int anInt4406;

	@OriginalMember(owner = "client!hj", name = "Yh", descriptor = "I")
	public static int anInt4387 = -2;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method3753(@OriginalArg(0) Class343 arg0) {
		Static8.anInt127 = arg0.method8158("p11_full");
		Static162.anInt3230 = arg0.method8158("p12_full");
		Static511.anInt8579 = arg0.method8158("b12_full");
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(IB)Lclient!pb;")
	public static Class261 method3758(@OriginalArg(0) int arg0) {
		@Pc(13) Class261[] local13 = Static253.method4224();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class261 local21 = local13[local15];
			if (arg0 == local21.anInt7428) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([BI)V")
	public static void method3759(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub9 local10 = new Class3_Sub9(arg0);
		@Pc(20) boolean local20 = false;
		while (true) {
			while (true) {
				@Pc(24) int local24 = local10.method5633();
				if (local24 == 0) {
					if (local20) {
						return;
					}
					if (Static311.anIntArray331 == null) {
						Static311.anIntArray331 = new int[4];
						Static483.anInt8233 = 4;
						Static510.anIntArray540 = new int[4];
					}
					for (local24 = 0; local24 < Static311.anIntArray331.length; local24++) {
						Static311.anIntArray331[local24] = 0;
						Static510.anIntArray540[local24] = local24 * 20;
					}
					return;
				}
				if (local24 == 1) {
					if (Static311.anIntArray331 == null) {
						Static311.anIntArray331 = new int[4];
						Static510.anIntArray540 = new int[4];
						Static483.anInt8233 = 4;
					}
					for (@Pc(69) int local69 = 0; local69 < Static311.anIntArray331.length; local69++) {
						Static311.anIntArray331[local69] = local10.method5624();
						Static510.anIntArray540[local69] = local10.method5624();
					}
					local20 = true;
				} else if (local24 == 2) {
					Static268.anInt5214 = local10.method5610();
				} else if (local24 == 3) {
					Static483.anInt8233 = local10.method5633();
					Static510.anIntArray540 = new int[Static483.anInt8233];
					Static311.anIntArray331 = new int[Static483.anInt8233];
				}
			}
		}
	}
}

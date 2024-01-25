import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_144 = new Class235(72, 12);

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public static int anInt4801 = 0;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "[I")
	public static final int[] anIntArray371 = new int[32];

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI)Z")
	public static boolean method3875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	public static void method3877() {
		if (Static422.anInt7311 == -1) {
			return;
		}
		@Pc(17) int local17 = Static166.aClass25_1.method4783();
		@Pc(21) int local21 = Static166.aClass25_1.method4788();
		@Pc(26) Class1_Sub16 local26 = (Class1_Sub16) Static587.aClass353_67.method7677();
		if (local26 != null) {
			local17 = local26.method3652();
			local21 = local26.method3650();
		}
		Static272.method3864(0, Static422.anInt7311, 0, 0, Static499.anInt4149, 0, local21, Static130.anInt2566, local17);
		if (Static323.aClass341_14 != null) {
			Static110.method1761(local21, local17);
		}
	}
}

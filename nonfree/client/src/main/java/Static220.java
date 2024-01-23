import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qm", name = "ic", descriptor = "I")
	public static int anInt4583 = 0;

	@OriginalMember(owner = "client!qm", name = "vc", descriptor = "Ljava/lang/String;")
	public static String aString146 = "Loaded textures";

	@OriginalMember(owner = "client!qm", name = "Ec", descriptor = "[I")
	public static int[] anIntArray521 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V")
	public static void method3515(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = Static242.aByteArrayArray11.length;
		@Pc(18) byte[][] local18;
		if (Static240.aBoolean369 && arg0) {
			local18 = Static19.aByteArrayArray2;
		} else {
			local18 = Static30.aByteArrayArray3;
		}
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(35) byte[] local35 = local18[local24];
			if (local35 != null) {
				@Pc(49) int local49 = (Static177.anIntArray389[local24] >> 8) * 64 - Static224.anInt4695;
				@Pc(60) int local60 = (Static177.anIntArray389[local24] & 0xFF) * 64 - Static158.anInt2961;
				Static39.method716();
				Static38.method708(arg0, local60, local49, Static27.aClass2Array1, local35);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I")
	public static int method3518() {
		if (Static263.aBoolean406) {
			return 0;
		} else if (Static39.method718()) {
			return Static16.aBoolean33 ? 2 : 1;
		} else {
			return 1;
		}
	}
}

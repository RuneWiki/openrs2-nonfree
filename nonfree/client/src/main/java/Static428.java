import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	public static int anInt7573;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "Lclient!hh;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
	public static int anInt7575 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	public static void method5923() {
		for (@Pc(1) int local1 = 0; local1 < Static242.aClass176Array1.length; local1++) {
			Static242.aClass176Array1[local1].method4278();
		}
		Static242.aClass176Array1 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lclient!hw;")
	public static Class134 method5926(@OriginalArg(1) int arg0) {
		@Pc(13) Class134[] local13 = Static228.method3732();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class134 local21 = local13[local15];
			if (arg0 == local21.anInt4451) {
				return local21;
			}
		}
		return null;
	}
}

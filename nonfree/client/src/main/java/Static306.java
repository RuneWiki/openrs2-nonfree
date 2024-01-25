import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt3568;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_61 = new Class231("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public static int anInt3571 = 0;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	public static void method3205() {
		@Pc(9) int[] local9 = new int[Static354.aClass170_2.anInt4263];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static354.aClass170_2.anInt4263; local13++) {
			@Pc(20) Class32 local20 = Static354.aClass170_2.method3865(local13);
			if (local20.anInt857 >= 0 || local20.anInt850 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static259.anIntArray396 = new int[local11];
		for (@Pc(55) int local55 = 0; local55 < local11; local55++) {
			Static259.anIntArray396[local55] = local9[local55];
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([[BLclient!q;I)V")
	public static void method3207(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class204_Sub1 arg1) {
		@Pc(6) int local6 = Static439.aByteArrayArray47.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(16) byte[] local16 = arg0[local8];
			if (local16 != null) {
				@Pc(29) int local29 = (Static175.anIntArray282[local8] >> 8) * 64 - Static206.anInt3592;
				@Pc(39) int local39 = (Static175.anIntArray282[local8] & 0xFF) * 64 - Static99.anInt1814;
				Static88.method1553();
				arg1.method4547(Static44.aClass28_14, local16, local39, local29, Static254.aClass61Array2);
			}
		}
	}
}

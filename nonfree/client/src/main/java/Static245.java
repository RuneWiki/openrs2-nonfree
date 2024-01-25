import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_150 = new Class265(33, 7);

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	public static int anInt6498 = -2;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "[I")
	public static int[] anIntArray552 = new int[2];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!si;I)V")
	public static void method5120(@OriginalArg(0) Class2_Sub23 arg0) {
		if (arg0.aByteArray130.length - arg0.anInt6952 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5495();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray130.length - arg0.anInt6952 < 2) {
			return;
		}
		@Pc(42) int local42 = arg0.method5500();
		if (local42 * 6 != arg0.aByteArray130.length - arg0.anInt6952) {
			return;
		}
		while (true) {
			@Pc(62) int local62;
			@Pc(66) int local66;
			do {
				do {
					do {
						if (arg0.aByteArray130.length <= arg0.anInt6952) {
							return;
						}
						local62 = arg0.method5500();
						local66 = arg0.method5508();
					} while (Static19.anIntArray426.length <= local62);
				} while (!Static70.aBooleanArray9[local62]);
			} while (Static215.aClass128_1.method2886(local62).aChar2 == '1' && (local66 < -1 || local66 > 1));
			Static19.anIntArray426[local62] = local66;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lclient!rm;")
	public static Class216 method5123(@OriginalArg(0) int arg0) {
		@Pc(13) Class216[] local13 = Static40.method644();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class216 local21 = local13[local15];
			if (local21.anInt5923 == arg0) {
				return local21;
			}
		}
		return null;
	}
}

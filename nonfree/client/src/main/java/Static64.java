import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "Lclient!qp;")
	public static Interface20 anInterface20_3;

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
	public static int anInt10754 = -2;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!ji;)V")
	public static void method8771(@OriginalArg(1) Class6_Sub8 arg0) {
		if (arg0.aByteArray102.length - arg0.anInt10061 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method8246();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray102.length - arg0.anInt10061 < 2) {
			return;
		}
		@Pc(51) int local51 = arg0.method8220();
		if (arg0.aByteArray102.length - arg0.anInt10061 < local51 * 6) {
			return;
		}
		for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
			@Pc(74) int local74 = arg0.method8220();
			@Pc(78) int local78 = arg0.method8236();
			if (Static267.anIntArray256.length > local74 && Static272.aBooleanArray10[local74] && (Static587.aClass148_1.method4489(local74).aChar2 != '1' || local78 >= -1 && local78 <= 1)) {
				Static267.anIntArray256[local74] = local78;
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[BI)I")
	public static int method8774(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static622.method8520(arg0, arg1, 0);
	}
}

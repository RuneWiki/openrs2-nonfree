import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "Lclient!oca;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!wq;I)V")
	public static void method8927(@OriginalArg(0) Class5_Sub36 arg0) {
		if (arg0.aByteArray89.length - arg0.anInt8456 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method7291();
		if (local22 < 0 || local22 > 1 || arg0.aByteArray89.length - arg0.anInt8456 < 2) {
			return;
		}
		@Pc(52) int local52 = arg0.method7333();
		if (arg0.aByteArray89.length - arg0.anInt8456 < local52 * 6) {
			return;
		}
		for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
			@Pc(77) int local77 = arg0.method7333();
			@Pc(83) int local83 = arg0.method7268();
			if (local77 < Static123.anIntArray120.length && Static624.aBooleanArray27[local77] && (Static432.aClass58_1.method1084(local77).aChar7 != '1' || local83 >= -1 && local83 <= 1)) {
				Static123.anIntArray120[local77] = local83;
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(JJ)J")
	public static long method8929(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}

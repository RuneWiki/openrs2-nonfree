import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public static final int anInt6260 = 1401;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
	public static void method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class49_Sub3 local13 = local7.aClass49_Sub3_1;
		@Pc(16) Class49_Sub3 local16 = local7.aClass49_Sub3_2;
		if (local13 != null) {
			local13.anInt9076 = local13.anInt9076 * arg3 / (0x10 << Static451.anInt7905 - 7);
			local13.anInt9068 = local13.anInt9068 * arg3 / (0x10 << Static451.anInt7905 - 7);
		}
		if (local16 != null) {
			local16.anInt9076 = local16.anInt9076 * arg3 / (0x10 << Static451.anInt7905 - 7);
			local16.anInt9068 = local16.anInt9068 * arg3 / (0x10 << Static451.anInt7905 - 7);
		}
	}
}

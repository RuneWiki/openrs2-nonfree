import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_1 = new Class218(7, 0);

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public static int anInt66 = 64;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public static int anInt67 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	public static void method95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class2_Sub3_Sub3 local13 = local7.aClass2_Sub3_Sub3_1;
		@Pc(16) Class2_Sub3_Sub3 local16 = local7.aClass2_Sub3_Sub3_2;
		if (local13 != null) {
			local13.aShort108 = (short) (local13.aShort108 * arg3 / (0x10 << Static276.anInt5846 - 7));
			local13.aShort107 = (short) (local13.aShort107 * arg3 / (0x10 << Static276.anInt5846 - 7));
		}
		if (local16 != null) {
			local16.aShort108 = (short) (local16.aShort108 * arg3 / (0x10 << Static276.anInt5846 - 7));
			local16.aShort107 = (short) (local16.aShort107 * arg3 / (0x10 << Static276.anInt5846 - 7));
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method97() {
		Static547.aClass112_49.method3638();
	}
}

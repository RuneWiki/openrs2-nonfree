import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!or", name = "C", descriptor = "I")
	public static int anInt6808;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "I")
	public static int anInt6810;

	@OriginalMember(owner = "client!or", name = "M", descriptor = "I")
	public static int anInt6817;

	@OriginalMember(owner = "client!or", name = "D", descriptor = "I")
	public static int anInt6809 = 0;

	@OriginalMember(owner = "client!or", name = "J", descriptor = "I")
	public static int anInt6815 = 0;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIII)V")
	public static void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class15_Sub1 local13 = local7.aClass15_Sub1_3;
		@Pc(16) Class15_Sub1 local16 = local7.aClass15_Sub1_2;
		if (local13 != null) {
			local13.anInt7574 = local13.anInt7574 * arg3 / (0x10 << Static270.anInt5288 - 7);
			local13.anInt7577 = local13.anInt7577 * arg3 / (0x10 << Static270.anInt5288 - 7);
		}
		if (local16 != null) {
			local16.anInt7574 = local16.anInt7574 * arg3 / (0x10 << Static270.anInt5288 - 7);
			local16.anInt7577 = local16.anInt7577 * arg3 / (0x10 << Static270.anInt5288 - 7);
		}
	}
}

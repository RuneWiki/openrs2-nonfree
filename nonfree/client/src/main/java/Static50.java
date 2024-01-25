import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
	public static int anInt1073;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_4 = new Class68(14, 2);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I")
	public static int method932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & local16 * (local16 * local16 * 15731 + 789221) + 1376312589;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLclient!ir;[[B)V")
	public static void method937(@OriginalArg(1) Class117_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static185.aByteArrayArray9.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) byte[] local24 = arg1[local18];
			if (local24 != null) {
				@Pc(36) int local36 = (Static136.anIntArray273[local18] >> 8) * 64 - Static21.anInt265;
				@Pc(47) int local47 = (Static136.anIntArray273[local18] & 0xFF) * 64 - Static103.anInt2044;
				Static381.method5665();
				arg0.method2440(local36, local47, Static347.aClass155_9, local24, Static160.aClass67Array3);
			}
		}
	}
}

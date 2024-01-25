import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "[S")
	public static short[] aShortArray124 = new short[256];

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "J")
	public static long aLong223 = 0L;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass20_Sub2_1 != null) {
			local7.aClass20_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BB)V")
	public static void method5584(@OriginalArg(0) byte arg0) {
		if (Static417.aByteArrayArrayArray3 == null) {
			Static417.aByteArrayArrayArray3 = new byte[4][Static425.anInt6922][Static251.anInt4072];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(24) int local24 = 0; local24 < Static425.anInt6922; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static251.anInt4072; local28++) {
					Static417.aByteArrayArrayArray3[local14][local24][local28] = arg0;
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[128][128];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	public static int method5860() {
		return Static305.anInt5572;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public static void method5861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static222.aClass179_10.method4385(Static309.aClass175_185.method4201(Static216.anInt4257));
		@Pc(23) int local23;
		for (@Pc(18) Class3_Sub38 local18 = (Class3_Sub38) Static374.aClass229_41.method5328(); local18 != null; local18 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			local23 = Static180.method3067(local18);
			if (local23 > local11) {
				local11 = local23;
			}
		}
		local11 += 8;
		local23 = Static169.anInt3551 * 16 + 21;
		@Pc(53) int local53 = arg1 - local11 / 2;
		if (Static385.anInt6686 < local53 + local11) {
			local53 = Static385.anInt6686 - local11;
		}
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(75) int local75 = arg0;
		if (Static120.anInt2616 < arg0 + local23) {
			local75 = Static120.anInt2616 - local23;
		}
		if (local75 < 0) {
			local75 = 0;
		}
		Static67.anInt1556 = local53;
		Static153.anInt3319 = local75;
		Static378.aBoolean462 = true;
		Static283.anInt5203 = local11;
		Static318.anInt3229 = (Static126.aBoolean275 ? 26 : 22) + Static169.anInt3551 * 16;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5862(@OriginalArg(0) String arg0) {
		if (Static230.aStringArray101 == null) {
			Static101.method1744();
		}
		@Pc(12) String[] local12 = Static365.method5139('\n', arg0);
		for (@Pc(19) int local19 = 0; local19 < local12.length; local19++) {
			for (@Pc(22) int local22 = Static296.anInt5416; local22 > 0; local22--) {
				Static230.aStringArray101[local22] = Static230.aStringArray101[local22 - 1];
			}
			Static230.aStringArray101[0] = local12[local19];
			if (Static230.aStringArray101.length - 1 > Static296.anInt5416) {
				Static296.anInt5416++;
				if (Static120.anInt2614 > 0) {
					Static120.anInt2614++;
				}
			}
		}
	}
}

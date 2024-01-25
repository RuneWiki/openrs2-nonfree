import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!du", name = "H", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!du", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)[Lclient!vha;")
	public static Class370[] method1704() {
		return new Class370[] { Static277.aClass370_8, Static483.aClass370_17, Static452.aClass370_12, Static539.aClass370_15, Static202.aClass370_5, Static319.aClass370_10, Static290.aClass370_9, Static622.aClass370_20, Static595.aClass370_19, Static549.aClass370_16, Static641.aClass370_21, Static42.aClass370_4, Static536.aClass370_14, Static476.aClass370_13, Static581.aClass370_18 };
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([BI)[B")
	public static byte[] method1706(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub23 local8 = new Class5_Sub23(arg0);
		@Pc(12) int local12 = local8.method8529();
		@Pc(23) int local23 = local8.method8527();
		if (local23 < 0 || Static245.anInt4244 != 0 && Static245.anInt4244 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(112) byte[] local112 = new byte[local23];
			local8.method8487(local112, local23, 0);
			return local112;
		} else {
			@Pc(54) int local54 = local8.method8527();
			if (local54 < 0 || Static245.anInt4244 != 0 && local54 > Static245.anInt4244) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local54];
			if (local12 == 1) {
				Static139.method1960(local76, local54, arg0, local23);
			} else {
				@Pc(94) Class340 local94 = Static23.aClass340_1;
				synchronized (Static23.aClass340_1) {
					Static23.aClass340_1.method8464(local76, local8);
				}
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBI)Z")
	public static boolean method1707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static667.method9176(arg1, arg0) || Static395.method5775(arg1, arg0) || Static441.method6512(127 - 203, arg1, arg0);
	}
}

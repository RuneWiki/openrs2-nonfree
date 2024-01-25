import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!cca", name = "C", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!cca", name = "A", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_38 = new Class235(5, -2);

	@OriginalMember(owner = "client!cca", name = "H", descriptor = "[I")
	public static final int[] anIntArray102 = new int[25];

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)V")
	public static void method935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class8_Sub3_Sub2 local13 = local7.aClass8_Sub3_Sub2_2;
		@Pc(16) Class8_Sub3_Sub2 local16 = local7.aClass8_Sub3_Sub2_1;
		if (local13 != null) {
			local13.aShort51 = (short) (local13.aShort51 * arg3 / (0x10 << Static351.anInt5832 - 7));
			local13.aShort50 = (short) (local13.aShort50 * arg3 / (0x10 << Static351.anInt5832 - 7));
		}
		if (local16 != null) {
			local16.aShort51 = (short) (local16.aShort51 * arg3 / (0x10 << Static351.anInt5832 - 7));
			local16.aShort50 = (short) (local16.aShort50 * arg3 / (0x10 << Static351.anInt5832 - 7));
		}
	}
}

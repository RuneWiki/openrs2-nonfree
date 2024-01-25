import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Lclient!wq;")
	public static Class394 aClass394_10;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "Lclient!qda;")
	public static Class59 aClass59_33;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "[Lclient!wga;")
	public static Class41_Sub1_Sub1[] aClass41_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_84 = new Class187(78, 4);

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
	public static final int[] anIntArray489 = new int[3];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)V")
	public static void method7531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class41_Sub1_Sub5 local13 = local7.aClass41_Sub1_Sub5_1;
		@Pc(16) Class41_Sub1_Sub5 local16 = local7.aClass41_Sub1_Sub5_2;
		if (local13 != null) {
			local13.aShort63 = (short) (local13.aShort63 * arg3 / (0x10 << Static138.anInt2287 - 7));
			local13.aShort64 = (short) (local13.aShort64 * arg3 / (0x10 << Static138.anInt2287 - 7));
		}
		if (local16 != null) {
			local16.aShort63 = (short) (local16.aShort63 * arg3 / (0x10 << Static138.anInt2287 - 7));
			local16.aShort64 = (short) (local16.aShort64 * arg3 / (0x10 << Static138.anInt2287 - 7));
		}
	}
}

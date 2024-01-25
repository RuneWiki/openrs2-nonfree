import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kea", name = "L", descriptor = "[I")
	public static final int[] anIntArray332 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V")
	public static void method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class16_Sub1_Sub4 local13 = local7.aClass16_Sub1_Sub4_1;
		@Pc(16) Class16_Sub1_Sub4 local16 = local7.aClass16_Sub1_Sub4_2;
		if (local13 != null) {
			local13.aShort92 = (short) (local13.aShort92 * arg3 / (0x10 << Static326.anInt5713 - 7));
			local13.aShort91 = (short) (local13.aShort91 * arg3 / (0x10 << Static326.anInt5713 - 7));
		}
		if (local16 != null) {
			local16.aShort92 = (short) (local16.aShort92 * arg3 / (0x10 << Static326.anInt5713 - 7));
			local16.aShort91 = (short) (local16.aShort91 * arg3 / (0x10 << Static326.anInt5713 - 7));
		}
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)V")
	public static void method4610(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static188.method3210(1, arg0);
		local12.method923();
	}
}

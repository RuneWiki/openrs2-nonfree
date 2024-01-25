import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_8 = new Class54(13, 3);

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_107 = new Class305(19, 3);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V")
	public static void method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class20_Sub4 local13 = local7.aClass20_Sub4_2;
		@Pc(16) Class20_Sub4 local16 = local7.aClass20_Sub4_1;
		if (local13 != null) {
			local13.anInt7238 = local13.anInt7238 * arg3 / (0x10 << Static275.anInt5260 - 7);
			local13.anInt7245 = local13.anInt7245 * arg3 / (0x10 << Static275.anInt5260 - 7);
		}
		if (local16 != null) {
			local16.anInt7238 = local16.anInt7238 * arg3 / (0x10 << Static275.anInt5260 - 7);
			local16.anInt7245 = local16.anInt7245 * arg3 / (0x10 << Static275.anInt5260 - 7);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
	public static int method2195(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIII)I")
	public static int method2196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(12) int local12 = 128 - arg2;
		@Pc(26) int local26 = (arg1 & 0x7F) * local12 + (arg0 & 0x7F) * arg2 >> 7;
		@Pc(41) int local41 = local12 * (arg1 & 0x380) + (arg0 & 0x380) * arg2 >> 7;
		@Pc(56) int local56 = (arg1 & 0xFC00) * local12 + (arg0 & 0xFC00) * arg2 >> 7;
		return local56 & 0xFC00 | local41 & 0x380 | local26 & 0x7F;
	}
}

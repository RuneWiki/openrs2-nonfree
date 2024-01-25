import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!xa;")
	public static Class4 aClass4_11;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt3927 = 0;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
	public static final int[] anIntArray417 = new int[6];

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_47 = new Class160(53, -1);

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt3930 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!dga;B)Lclient!fba;")
	public static Class95 method3387(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method6041();
		@Pc(16) Class277 local16 = Static478.method6658()[arg0.method6041()];
		@Pc(28) Class137 local28 = Static344.method5181()[arg0.method6041()];
		@Pc(32) int local32 = arg0.method6008();
		@Pc(36) int local36 = arg0.method6008();
		@Pc(40) int local40 = arg0.method6006();
		@Pc(44) int local44 = arg0.method6006();
		@Pc(48) int local48 = arg0.method6027();
		@Pc(54) int local54 = arg0.method6027();
		@Pc(60) int local60 = arg0.method6027();
		@Pc(69) boolean local69 = arg0.method6041() == 1;
		return new Class95(local7, local16, local28, local32, local36, local40, local44, local48, local54, local60, local69);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIZ)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class6_Sub13 local10 = Static59.method44(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray172.length; local32++) {
				if (local10.anIntArray171[local32] == arg1) {
					local22 += local10.anIntArray172[local32];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
	public static int method3389() {
		return Static558.anInt9332;
	}
}

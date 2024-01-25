import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "[Lclient!lba;")
	public static Class1_Sub1[] aClass1_Sub1Array5;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
	public static int anInt7690;

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "Lclient!qp;")
	public static Class239 aClass239_152;

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "Lclient!wca;")
	public static Class310 aClass310_16 = null;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB[BIIII)Z")
	public static boolean method6450(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg4 % 8;
		@Pc(24) int local24;
		if (local14 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local14;
		}
		@Pc(37) int local37 = -((arg0 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg4 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg1[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local24;
			if (arg1[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLclient!jt;)I")
	public static int method6453(@OriginalArg(1) Class150 arg0) {
		if (Static297.aClass150_11 == arg0) {
			return 6407;
		} else if (Static51.aClass150_1 == arg0) {
			return 6408;
		} else if (arg0 == Static160.aClass150_3) {
			return 6406;
		} else if (arg0 == Static225.aClass150_9) {
			return 6409;
		} else if (Static189.aClass150_4 == arg0) {
			return 6410;
		} else if (Static120.aClass150_2 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}

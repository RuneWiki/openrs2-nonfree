import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "[I")
	public static final int[] anIntArray410 = new int[3];

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)Z")
	public static boolean method6237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!oh;)I")
	public static int method6239(@OriginalArg(1) Class237 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method6296(Static335.anInt6611)) {
			local5++;
		}
		if (arg0.method6296(Static376.anInt7104)) {
			local5++;
		}
		if (arg0.method6296(Static257.anInt5538)) {
			local5++;
		}
		if (arg0.method6296(Static601.anInt10241)) {
			local5++;
		}
		if (arg0.method6296(Static626.anInt10465)) {
			local5++;
		}
		if (arg0.method6296(Static248.anInt5510)) {
			local5++;
		}
		if (arg0.method6296(Static337.anInt6637)) {
			local5++;
		}
		if (arg0.method6296(Static261.anInt5610)) {
			local5++;
		}
		if (arg0.method6296(Static324.anInt6510)) {
			local5++;
		}
		if (arg0.method6296(Static408.anInt7804)) {
			local5++;
		}
		if (arg0.method6296(Static301.anInt5998)) {
			local5++;
		}
		if (arg0.method6296(Static87.anInt10283)) {
			local5++;
		}
		if (arg0.method6296(Static416.anInt7880)) {
			local5++;
		}
		if (arg0.method6296(Static76.anInt2331)) {
			local5++;
		}
		if (arg0.method6296(Static138.anInt8423)) {
			local5++;
		}
		if (arg0.method6296(Static275.anInt5763)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method6240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg4 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg2 + 8 - 1) / 8);
		for (@Pc(43) int local43 = local32; local43 < 0; local43++) {
			for (@Pc(47) int local47 = local41; local47 < 0; local47++) {
				if (arg3[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local16;
			if (arg3[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}
}

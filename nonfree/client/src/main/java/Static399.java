import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nja", name = "U", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array10;

	@OriginalMember(owner = "client!nja", name = "G", descriptor = "[J")
	public static final long[] aLongArray16 = new long[32];

	@OriginalMember(owner = "client!nja", name = "M", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_47 = new Class264(64);

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!so;ZLclient!bca;)Lclient!fn;")
	public static Class110 method5983(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) Class27 arg1) {
		@Pc(10) Class110 local10 = new Class110(arg1);
		@Pc(14) int local14 = arg0.method5866();
		@Pc(22) boolean local22 = (local14 & 0x1) != 0;
		@Pc(30) boolean local30 = (local14 & 0x2) != 0;
		@Pc(41) boolean local41 = (local14 & 0x4) != 0;
		if (local22) {
			local10.anIntArray269[0] = arg0.method5900();
			local10.anIntArray271[0] = arg0.method5900();
			if (arg1.anInt957 != -1 || arg1.anInt925 != -1) {
				local10.anIntArray269[1] = arg0.method5900();
				local10.anIntArray271[1] = arg0.method5900();
			}
			if (arg1.anInt962 != -1 || arg1.anInt903 != -1) {
				local10.anIntArray269[2] = arg0.method5900();
				local10.anIntArray271[2] = arg0.method5900();
			}
		}
		@Pc(123) boolean local123 = (local14 & 0x8) != 0;
		if (local30) {
			local10.anIntArray270[0] = arg0.method5900();
			local10.anIntArray273[0] = arg0.method5900();
			if (arg1.anInt960 != -1 || arg1.anInt929 != -1) {
				local10.anIntArray270[1] = arg0.method5900();
				local10.anIntArray273[1] = arg0.method5900();
			}
		}
		@Pc(171) int local171;
		@Pc(174) int[] local174;
		@Pc(206) int local206;
		if (local41) {
			local171 = arg0.method5900();
			local174 = new int[] { local171 & 0xF, local171 >> 4 & 0xF, local171 >> 8 & 0xF, local171 >> 12 & 0xF };
			for (local206 = 0; local206 < 4; local206++) {
				if (local174[local206] != 15) {
					local10.aShortArray54[local174[local206]] = (short) arg0.method5900();
				}
			}
		}
		if (local123) {
			local171 = arg0.method5866();
			local174 = new int[] { local171 & 0xF, local171 >> 4 & 0xF };
			for (local206 = 0; local206 < 2; local206++) {
				if (local174[local206] != 15) {
					local10.aShortArray55[local174[local206]] = (short) arg0.method5900();
				}
			}
		}
		return local10;
	}
}

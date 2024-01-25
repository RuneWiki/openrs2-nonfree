import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "Lclient!tk;")
	public static Class337 aClass337_4;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_66 = new Class180(1, 2);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([III[BI[[B[I[[B)I")
	public static int method2892(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg5[arg3];
		@Pc(15) int local15 = arg0[arg3] + local9;
		@Pc(19) int local19 = arg5[arg1];
		@Pc(25) int local25 = arg0[arg1] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local25 < local15) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg2[arg3] & 0xFF;
		if ((arg2[arg1] & 0xFF) < local49) {
			local49 = arg2[arg1] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg6[arg3];
		@Pc(70) byte[] local70 = arg4[arg1];
		@Pc(74) int local74 = local27 - local9;
		@Pc(92) int local92 = local27 - local19;
		for (@Pc(94) int local94 = local27; local94 < local38; local94++) {
			@Pc(106) int local106 = local70[local92++] + local66[local74++];
			if (local49 > local106) {
				local49 = local106;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!qn;)[Lclient!pia;")
	public static Class270[] method2893(@OriginalArg(1) Class291 arg0) {
		if (!arg0.method7133()) {
			return new Class270[0];
		}
		@Pc(16) Class81 local16 = arg0.method7132();
		while (local16.anInt2532 == 0) {
			Static373.method5403(10L);
		}
		if (local16.anInt2532 == 2) {
			return new Class270[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject4;
		@Pc(43) Class270[] local43 = new Class270[local37.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local43.length; local50++) {
			@Pc(56) Class270 local56 = new Class270();
			local43[local50] = local56;
			local56.anInt7595 = local37[local50 << 2];
			local56.anInt7594 = local37[(local50 << 2) + 1];
			local56.anInt7593 = local37[(local50 << 2) + 2];
			local56.anInt7600 = local37[(local50 << 2) + 3];
		}
		return local43;
	}
}

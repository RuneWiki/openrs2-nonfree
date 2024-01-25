import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt4141;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt4144;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZII)Z")
	public static boolean method3516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ji;)Lclient!fq;")
	public static Class109 method3517(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(15) Class79 local15 = Static174.method3299()[arg0.method8246()];
		@Pc(22) Class127 local22 = Static569.method7978()[arg0.method8246()];
		@Pc(26) int local26 = arg0.method8231();
		@Pc(30) int local30 = arg0.method8231();
		@Pc(34) int local34 = arg0.method8220();
		@Pc(38) int local38 = arg0.method8220();
		@Pc(42) int local42 = arg0.method8231();
		@Pc(46) int local46 = arg0.method8236();
		@Pc(52) int local52 = arg0.method8236();
		return new Class109(local15, local22, local26, local30, local34, local38, local42, local46, local52);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)I")
	public static int method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg2 : arg1;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg2 : arg0) : arg1;
		return ((local7 & 0x2) == 0 ? local33 : -local33) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lclient!uaa;")
	public static Class333 method3519(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static491.aFloat158 == 3.0D) {
				return Static335.aClass333_7;
			}
			if ((double) Static491.aFloat158 == 4.0D) {
				return Static394.aClass333_10;
			}
			if ((double) Static491.aFloat158 == 6.0D) {
				return Static335.aClass333_6;
			}
			if ((double) Static491.aFloat158 >= 8.0D) {
				return Static264.aClass333_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static491.aFloat158 == 3.0D) {
				return Static335.aClass333_6;
			}
			if ((double) Static491.aFloat158 == 4.0D) {
				return Static264.aClass333_4;
			}
			if ((double) Static491.aFloat158 == 6.0D) {
				return Static528.aClass333_13;
			}
			if ((double) Static491.aFloat158 >= 8.0D) {
				return Static476.aClass333_12;
			}
		} else if (arg0 == 2) {
			if ((double) Static491.aFloat158 == 3.0D) {
				return Static528.aClass333_13;
			}
			if ((double) Static491.aFloat158 == 4.0D) {
				return Static476.aClass333_12;
			}
			if ((double) Static491.aFloat158 == 6.0D) {
				return Static399.aClass333_9;
			}
			if ((double) Static491.aFloat158 >= 8.0D) {
				return Static461.aClass333_11;
			}
		}
		return null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public static int anInt4874 = 2;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
	public static int method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(11) int local11 = 255 - local7;
		@Pc(29) int local29 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00FF) * local11 & 0xFF00FF00 | (arg0 & 0xFF00) * local11 & 0xFF0000) >>> 8) + local29;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	public static void method4097(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static7.aFloat7 = 3.0F;
		} else if (arg0 == 50) {
			Static7.aFloat7 = 4.0F;
		} else if (arg0 == 75) {
			Static7.aFloat7 = 6.0F;
		} else if (arg0 == 100) {
			Static7.aFloat7 = 8.0F;
		} else if (arg0 == 200) {
			Static7.aFloat7 = 16.0F;
		}
		Static96.anInt5951 = -1;
		Static96.anInt5951 = -1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!he;I)Lclient!uj;")
	public static Class6_Sub2_Sub15 method4098(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class6_Sub1 local14 = new Class6_Sub1(arg1.method2520(arg2, arg0));
		@Pc(45) Class6_Sub2_Sub15 local45 = new Class6_Sub2_Sub15(arg2, local14.method6473(), local14.method6473(), local14.method6442(), local14.method6442(), local14.method6433() == 1, local14.method6433(), local14.method6433());
		@Pc(49) int local49 = local14.method6433();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass244_43.method5966(new Class6_Sub25(local14.method6433(), local14.method6485(), local14.method6485(), local14.method6485(), local14.method6485(), local14.method6485(), local14.method6485(), local14.method6485(), local14.method6485()));
		}
		local45.method5935();
		return local45;
	}
}

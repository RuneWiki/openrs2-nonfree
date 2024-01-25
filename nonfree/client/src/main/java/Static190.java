import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gd", name = "oc", descriptor = "I")
	public static int anInt5142;

	@OriginalMember(owner = "client!gd", name = "sc", descriptor = "I")
	public static int anInt5146;

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "[[B")
	public static final byte[][] aByteArrayArray15 = new byte[250][];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
	public static void method4384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(1, (long) arg0);
		local14.method7286();
		local14.anInt8546 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BI)Z")
	public static boolean method4435(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg0);
		@Pc(12) int local12 = local8.method7816();
		if (local12 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method7816() == 1;
		if (local33) {
			Static125.method2271(local8);
		}
		Static445.method6465(local8);
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[[S[[F)[[S")
	public static short[][] method4469(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg0[local3].length; local7++) {
				arg0[local3][local7] = (short) (int) (arg1[local3][local7] * 16383.0F);
			}
		}
		return arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "S")
	public static short aShort67 = 32767;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "[I")
	public static final int[] anIntArray378 = new int[1];

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "[B")
	public static final byte[] aByteArray65 = new byte[2048];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B[[[Lclient!wg;)V")
	public static void method5118(@OriginalArg(1) Class360[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class360[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class360 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass11_Sub1_Sub4_1 instanceof Interface15) {
							((Interface15) local32.aClass11_Sub1_Sub4_1).method7228();
						}
						if (local32.aClass11_Sub1_Sub5_2 instanceof Interface15) {
							((Interface15) local32.aClass11_Sub1_Sub5_2).method7228();
						}
						if (local32.aClass11_Sub1_Sub5_1 instanceof Interface15) {
							((Interface15) local32.aClass11_Sub1_Sub5_1).method7228();
						}
						if (local32.aClass11_Sub1_Sub3_1 instanceof Interface15) {
							((Interface15) local32.aClass11_Sub1_Sub3_1).method7228();
						}
						if (local32.aClass11_Sub1_Sub3_2 instanceof Interface15) {
							((Interface15) local32.aClass11_Sub1_Sub3_2).method7228();
						}
						for (@Pc(86) Class21 local86 = local32.aClass21_4; local86 != null; local86 = local86.aClass21_1) {
							@Pc(91) Class11_Sub1_Sub1 local91 = local86.aClass11_Sub1_Sub1_1;
							if (local91 instanceof Interface15) {
								((Interface15) local91).method7228();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)I")
	public static int method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}
}

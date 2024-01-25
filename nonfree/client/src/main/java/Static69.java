import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cea", name = "ec", descriptor = "I")
	public static int anInt872;

	@OriginalMember(owner = "client!cea", name = "U", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!cea", name = "pb", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!cea", name = "L", descriptor = "[I")
	public static final int[] anIntArray67 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)Lclient!vo;")
	public static Class381 method899(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static686.aClass381ArrayArray2[local7] == null || Static686.aClass381ArrayArray2[local7][local11] == null) {
			@Pc(27) boolean local27 = Static172.method3336(local7, (byte) -31);
			if (!local27) {
				return null;
			}
		}
		return Static686.aClass381ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!jc;)Lclient!cja;")
	public static Class58_Sub1 method905(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(7) Class58 local7 = Static559.method7902(arg0);
		@Pc(20) int local20 = arg0.method3015();
		@Pc(24) int local24 = arg0.method3015();
		return new Class58_Sub1(local7.aClass318_20, local7.aClass238_13, local7.anInt10051, local7.anInt10055, local7.anInt10052, local7.anInt10050, local7.anInt10053, local7.anInt10054, local7.anInt10056, local20, local24);
	}
}

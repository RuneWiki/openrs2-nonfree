import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[[[Lclient!dn;")
	public static Class77[][][] aClass77ArrayArrayArray2;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public static int anInt6165;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
	public static int anInt6169;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_86 = new Class200(117, 5);

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString66 = null;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!la;II)Lclient!fu;")
	public static Class118 method5390(@OriginalArg(1) Class196 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5102(arg1, 0);
		return local9 == null ? null : new Class118(local9);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)[Lclient!nca;")
	public static Class228[] method5392() {
		return new Class228[] { Static144.aClass228_1, Static343.aClass228_9, Static463.aClass228_11 };
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!sl;)V")
	public static void method5393(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aByteArray54.length - arg0.anInt4736 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4225();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray54.length - arg0.anInt4736 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method4221();
		if (local44 * 6 > arg0.aByteArray54.length - arg0.anInt4736) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local44; local62++) {
			@Pc(68) int local68 = arg0.method4221();
			@Pc(72) int local72 = arg0.method4207();
			if (local68 < Static396.anIntArray394.length && Static515.aBooleanArray24[local68] && (Static606.aClass268_1.method6925(local68).aChar5 != '1' || local72 >= -1 && local72 <= 1)) {
				Static396.anIntArray394[local68] = local72;
			}
		}
	}
}

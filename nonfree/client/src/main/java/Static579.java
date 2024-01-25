import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "Lclient!wfa;")
	public static Class391 aClass391_3;

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "[I")
	public static int[] anIntArray601 = new int[1];

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!lga;)V")
	public static void method8062(@OriginalArg(1) Class223 arg0) {
		Static118.aClass223_25 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method8064(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return Static101.method1970(arg0, local14);
		} else if (arg1 instanceof Class56) {
			@Pc(26) Class56 local26 = (Class56) arg1;
			return local26.method977(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BI)V")
	public static void method8066(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 14);
		local9.method2038();
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILclient!jc;)Lclient!qfa;")
	public static Class6_Sub8 method8067(@OriginalArg(1) Class6_Sub15 arg0) {
		arg0.method3030();
		@Pc(13) int local13 = arg0.method3030();
		@Pc(17) Class6_Sub8 local17 = Static366.method5549(local13);
		local17.anInt10353 = arg0.method3030();
		@Pc(26) int local26 = arg0.method3030();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method3030();
			local17.method8929(local34, arg0);
		}
		local17.method8936();
		return local17;
	}
}

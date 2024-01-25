import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	public static int anInt6386;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public static int anInt6388;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	public static int anInt6381 = 0;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public static int anInt6382 = 0;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public static int anInt6384 = 0;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
	public static final int[] anIntArray720 = new int[2500];

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
	public static final int[] anIntArray721 = new int[2500];

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString308 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)I")
	public static int method5822(@OriginalArg(0) int arg0) {
		@Pc(7) Class61 local7 = Static241.method5342(arg0);
		@Pc(16) int local16 = local7.anInt1353;
		@Pc(19) int local19 = local7.anInt1356;
		@Pc(22) int local22 = local7.anInt1352;
		@Pc(29) int local29 = Class6_Sub2_Sub11_Sub2.anIntArray569[local22 - local19];
		return local29 & anIntArray721[local16] >> local19;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V")
	public static void method5825(@OriginalArg(0) int arg0) {
		if (Static319.anInt5902 == 0) {
			Static191.aClass6_Sub12_Sub1_3.method1446(arg0);
		} else {
			Static76.anInt2855 = arg0;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qm", name = "V", descriptor = "Lclient!fo;")
	public static Class82 aClass82_76;

	@OriginalMember(owner = "client!qm", name = "ib", descriptor = "Lclient!fo;")
	public static Class82 aClass82_77;

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "Z")
	public static boolean aBoolean646 = false;

	@OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
	public static int anInt5660 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!lr;)I")
	public static int method4453(@OriginalArg(1) Class25_Sub5_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt4351;
		@Pc(18) Class236 local18 = arg0.method3428();
		if (arg0.aBoolean483) {
			local8 = arg0.anInt4330;
		} else if (local18.anInt6463 == arg0.anInt4287 || local18.anInt6458 == arg0.anInt4287 || arg0.anInt4287 == local18.anInt6477 || arg0.anInt4287 == local18.anInt6452) {
			local8 = arg0.anInt4320;
		} else if (arg0.anInt4287 == local18.anInt6470 || arg0.anInt4287 == local18.anInt6454 || local18.anInt6441 == arg0.anInt4287 || arg0.anInt4287 == local18.anInt6466) {
			local8 = arg0.anInt4353;
		}
		return local8;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Lclient!tl;")
	public static Class4_Sub6 method4480() {
		@Pc(13) Class4_Sub6 local13 = (Class4_Sub6) Static190.aClass262_6.method5814();
		if (local13 == null) {
			return new Class4_Sub6();
		} else {
			Static78.anInt3512--;
			return local13;
		}
	}
}

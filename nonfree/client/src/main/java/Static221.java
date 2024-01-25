import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array15;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!sf;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt4478 = 0;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_68 = new Class6(101, 3);

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_5 = new Class273(6, 0, 4, 2);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	public static void method3921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) float local14 = (float) Static451.anInt3551 / (float) Static451.anInt3555;
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = arg3;
		if (local14 < 1.0F) {
			local18 = (int) ((float) arg0 * local14);
		} else {
			local16 = (int) ((float) arg3 / local14);
		}
		@Pc(44) int local44 = arg1 - (arg3 - local18) / 2;
		@Pc(52) int local52 = arg2 - (arg0 - local16) / 2;
		Static181.anInt3889 = Static451.anInt3551 - Static451.anInt3551 * local44 / local18;
		Static241.anInt2906 = -1;
		Static211.anInt4386 = local52 * Static451.anInt3555 / local16;
		Static128.anInt3069 = -1;
		Static2.method4834();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ks;B)V")
	public static void method3922(@OriginalArg(0) Class47_Sub2_Sub3_Sub2 arg0) {
		@Pc(11) Class1_Sub9 local11 = (Class1_Sub9) Static527.aClass174_39.method4422((long) arg0.anInt5045);
		if (local11 == null) {
			Static96.method2188(null, null, arg0.aByte94, arg0, arg0.anIntArray362[0], arg0.anIntArray361[0], 0);
		} else {
			local11.method2185();
		}
	}
}

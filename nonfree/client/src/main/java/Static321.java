import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
	public static final int[] anIntArray321 = new int[1000];

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "[I")
	public static final int[] anIntArray322 = new int[14];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!kba;I)V")
	public static void method4756(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub1_Sub2 arg1) {
		if (arg1.anIntArray376 == null) {
			return;
		}
		@Pc(18) int local18 = arg1.anIntArray376[arg0 + 1];
		if (local18 == arg1.anInt6306) {
			return;
		}
		arg1.anInt6346 = arg1.anInt6343;
		arg1.anInt6313 = 1;
		arg1.anInt6267 = 0;
		arg1.anInt6283 = 0;
		arg1.anInt6315 = 0;
		arg1.anInt6306 = local18;
		if (arg1.anInt6306 != -1) {
			Static349.method5726(arg1.anInt6315, Static618.aClass222_2.method5867(arg1.anInt6306), arg1);
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
	public static int anInt8646;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public static int anInt8648;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public static int anInt8643 = 0;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!sba;")
	public static Class302 aClass302_15 = null;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "[I")
	public static final int[] anIntArray443 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BILclient!oi;)V")
	public static void method7193(@OriginalArg(1) int arg0, @OriginalArg(2) Class9_Sub4_Sub2_Sub1 arg1) {
		if (arg1.anIntArray189 == null) {
			return;
		}
		@Pc(14) int local14 = arg1.anIntArray189[arg0 + 1];
		if (arg1.anInt4341 == local14) {
			return;
		}
		arg1.anInt4341 = local14;
		arg1.lb = 0;
		arg1.anInt4361 = arg1.anInt4359;
		arg1.anInt4290 = 1;
		arg1.anInt4332 = 0;
		arg1.anInt4319 = 0;
		if (arg1.anInt4341 != -1) {
			Static598.method8288(arg1, arg1.anInt4319, Static528.aClass198_2.method5706(arg1.anInt4341));
		}
	}
}

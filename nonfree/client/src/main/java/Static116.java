import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!d;")
	public static Interface3 anInterface3_7;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt5367;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt5368;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	public static final int[] anIntArray287 = new int[2];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public static void method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static397.method5885(local7.aClass4_Sub2_Sub4_1);
		Static397.method5885(local7.aClass4_Sub2_Sub4_2);
		if (local7.aClass4_Sub2_Sub4_1 != null) {
			local7.aClass4_Sub2_Sub4_1 = null;
		}
		if (local7.aClass4_Sub2_Sub4_2 != null) {
			local7.aClass4_Sub2_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)[Lclient!nha;")
	public static Class245[] method4813() {
		return new Class245[] { Static125.aClass245_3, Static440.aClass245_13, Static3.aClass245_15 };
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Lclient!ji;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_3;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	public static int anInt5682;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "[Lclient!au;")
	public static final Class16_Sub1[] aClass16_Sub1Array1 = new Class16_Sub1[30];

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public static int anInt5681 = 0;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Lclient!gd;")
	public static final Class90 aClass90_2 = new Class90(16);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!qa;Lclient!co;III)V")
	public static void method4569(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class211 local12;
		if (arg3 < Static377.anInt6467) {
			local12 = Static268.aClass211ArrayArrayArray4[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5512()) {
				arg1.method5514(0, 0, local12.aClass26_Sub4_2, Static337.anInt7424, arg0, true);
			}
		}
		if (arg4 < Static377.anInt6467) {
			local12 = Static268.aClass211ArrayArrayArray4[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5512()) {
				arg1.method5514(Static337.anInt7424, 0, local12.aClass26_Sub4_2, 0, arg0, true);
			}
		}
		if (arg3 < Static377.anInt6467 && arg4 < Static378.anInt6480) {
			local12 = Static268.aClass211ArrayArrayArray4[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5512()) {
				arg1.method5514(Static337.anInt7424, 0, local12.aClass26_Sub4_2, Static337.anInt7424, arg0, true);
			}
		}
		if (arg3 < Static377.anInt6467 && arg4 > 0) {
			local12 = Static268.aClass211ArrayArrayArray4[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5512()) {
				arg1.method5514(-Static337.anInt7424, 0, local12.aClass26_Sub4_2, Static337.anInt7424, arg0, true);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gfa", name = "t", descriptor = "[Lclient!i;")
	public static Class139[] aClass139Array22;

	@OriginalMember(owner = "client!gfa", name = "n", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_172 = new Class298(49, 2);

	@OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
	public static int anInt8982 = 0;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)Lclient!tea;")
	public static Class9_Sub1_Sub3 method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass9_Sub1_Sub3_1 == null ? null : local7.aClass9_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)V")
	public static void method7476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static251.method4061(local7.aClass9_Sub1_Sub4_1);
		Static251.method4061(local7.aClass9_Sub1_Sub4_2);
		if (local7.aClass9_Sub1_Sub4_1 != null) {
			local7.aClass9_Sub1_Sub4_1 = null;
		}
		if (local7.aClass9_Sub1_Sub4_2 != null) {
			local7.aClass9_Sub1_Sub4_2 = null;
		}
	}
}

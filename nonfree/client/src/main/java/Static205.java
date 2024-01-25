import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!bu;")
	public static Class38 aClass38_30 = new Class38();

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
	public static int anInt4329 = 0;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLclient!ks;)V")
	public static void method3773(@OriginalArg(1) Class47_Sub2_Sub3_Sub2 arg0) {
		@Pc(16) Class1_Sub9 local16 = (Class1_Sub9) Static527.aClass174_39.method4422((long) arg0.anInt5045);
		if (local16 == null) {
			return;
		}
		if (local16.aClass1_Sub12_Sub1_2 != null) {
			Static445.aClass1_Sub12_Sub3_2.method6363(local16.aClass1_Sub12_Sub1_2);
			local16.aClass1_Sub12_Sub1_2 = null;
		}
		local16.method7983();
	}
}

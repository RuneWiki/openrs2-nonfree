import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_13 = new Class279(128, 4);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)J")
	public static synchronized long method2268() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static505.aLong250) {
			Static668.aLong304 += Static505.aLong250 - local5;
		}
		Static505.aLong250 = local5;
		return Static668.aLong304 + local5;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!cn;III)V")
	public static void method2269(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class247 local12;
		if (arg2 < Static410.anInt6962) {
			local12 = Static332.aClass247ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass23_Sub2_Sub3_1 != null && local12.aClass23_Sub2_Sub3_1.method8607()) {
				arg0.method8596(Static486.aClass16_8, local12.aClass23_Sub2_Sub3_1, Static10.anInt118, 0, true, 0);
			}
		}
		if (arg3 < Static410.anInt6962) {
			local12 = Static332.aClass247ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass23_Sub2_Sub3_1 != null && local12.aClass23_Sub2_Sub3_1.method8607()) {
				arg0.method8596(Static486.aClass16_8, local12.aClass23_Sub2_Sub3_1, 0, Static10.anInt118, true, 0);
			}
		}
		if (arg2 < Static410.anInt6962 && arg3 < Static315.anInt5894) {
			local12 = Static332.aClass247ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass23_Sub2_Sub3_1 != null && local12.aClass23_Sub2_Sub3_1.method8607()) {
				arg0.method8596(Static486.aClass16_8, local12.aClass23_Sub2_Sub3_1, Static10.anInt118, Static10.anInt118, true, 0);
			}
		}
		if (arg2 < Static410.anInt6962 && arg3 > 0) {
			local12 = Static332.aClass247ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass23_Sub2_Sub3_1 != null && local12.aClass23_Sub2_Sub3_1.method8607()) {
				arg0.method8596(Static486.aClass16_8, local12.aClass23_Sub2_Sub3_1, Static10.anInt118, -Static10.anInt118, true, 0);
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[BI)I")
	public static int method2270(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static462.method6642(arg1, arg0, 0);
	}
}

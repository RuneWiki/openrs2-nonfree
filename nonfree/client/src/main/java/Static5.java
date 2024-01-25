import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
	public static int anInt65;

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "[I")
	public static final int[] anIntArray3 = new int[6];

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "Z")
	public static boolean aBoolean5 = true;

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "[I")
	public static final int[] anIntArray4 = new int[3];

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)[Lclient!vq;")
	public static Class382[] method90() {
		return new Class382[] { Static32.aClass382_23, Static83.aClass382_9, Static65.aClass382_5, Static333.aClass382_20, Static309.aClass382_17, Static538.aClass382_19, Static637.aClass382_21, Static141.aClass382_12, Static502.aClass382_18, Static187.aClass382_14, Static70.aClass382_6, Static498.aClass382_16, Static141.aClass382_11, Static666.aClass382_22 };
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)V")
	public static void method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static50.method919(local7.aClass4_Sub3_Sub5_1);
		Static50.method919(local7.aClass4_Sub3_Sub5_2);
		if (local7.aClass4_Sub3_Sub5_1 != null) {
			local7.aClass4_Sub3_Sub5_1 = null;
		}
		if (local7.aClass4_Sub3_Sub5_2 != null) {
			local7.aClass4_Sub3_Sub5_2 = null;
		}
	}
}

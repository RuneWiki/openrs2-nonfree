import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "[S")
	public static short[] aShortArray53;

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_154 = new Class198(64);

	@OriginalMember(owner = "client!mq", name = "O", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!mq", name = "T", descriptor = "[I")
	public static final int[] anIntArray364 = new int[32];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!bi;III)V")
	public static void method3849(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(21) Class4_Sub29 local21 = (Class4_Sub29) Static292.aClass116_43.method3270(); local21 != null; local21 = (Class4_Sub29) Static292.aClass116_43.method3272()) {
			if (local21.anInt4315 == arg0 && arg2 * 128 == local21.anInt4300 && local21.anInt4306 == arg3 * 128 && local21.aClass18_1.anInt534 == arg1.anInt534) {
				if (local21.aClass4_Sub1_Sub1_1 != null) {
					Static196.aClass4_Sub1_Sub3_3.method3510(local21.aClass4_Sub1_Sub1_1);
					local21.aClass4_Sub1_Sub1_1 = null;
				}
				if (local21.aClass4_Sub1_Sub1_2 != null) {
					Static196.aClass4_Sub1_Sub3_3.method3510(local21.aClass4_Sub1_Sub1_2);
					local21.aClass4_Sub1_Sub1_2 = null;
				}
				local21.method5687();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Lclient!ld;")
	public static Class59 method3850() {
		try {
			return (Class59) Class.forName("Class59_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}

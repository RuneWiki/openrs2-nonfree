import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray154;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	public static int anInt9762;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_135 = new Class71(69, 4);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)I")
	public static int method7885(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static260.method4580(local7.aClass15_Sub1_Sub4_2);
		Static260.method4580(local7.aClass15_Sub1_Sub4_1);
		if (local7.aClass15_Sub1_Sub4_2 != null) {
			local7.aClass15_Sub1_Sub4_2 = null;
		}
		if (local7.aClass15_Sub1_Sub4_1 != null) {
			local7.aClass15_Sub1_Sub4_1 = null;
		}
	}
}

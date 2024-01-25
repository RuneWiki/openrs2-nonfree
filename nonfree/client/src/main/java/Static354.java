import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "[S")
	public static final short[] aShortArray210 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_83 = new Class215(13, 3);

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "[Lclient!iv;")
	public static final Class4_Sub12[] aClass4_Sub12Array1 = new Class4_Sub12[2048];

	@OriginalMember(owner = "client!rv", name = "Cb", descriptor = "I")
	public static int anInt6183 = 0;

	@OriginalMember(owner = "client!rv", name = "Fb", descriptor = "I")
	public static int anInt6186 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V")
	public static void method4777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass16_Sub5_3 != null) {
			local7.aClass16_Sub5_3 = null;
		}
		if (local7.aClass16_Sub5_2 != null) {
			local7.aClass16_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)I")
	public static int method4785(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}

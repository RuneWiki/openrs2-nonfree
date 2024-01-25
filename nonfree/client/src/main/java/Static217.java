import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "Lclient!fc;")
	public static Class71 aClass71_52;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_141 = new Class221("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
	public static int anInt4042 = -2;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_14 = new Class17(13, 3);

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "[I")
	public static final int[] anIntArray497 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_8 = new Class144("", 12);

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public static void method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 != null && local7.aClass12_Sub5_2 != null) {
			local7.aClass12_Sub5_2 = null;
		}
	}
}

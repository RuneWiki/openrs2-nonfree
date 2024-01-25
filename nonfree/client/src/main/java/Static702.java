import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static702 {

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
	public static int anInt10973;

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "Lclient!sca;")
	public static final Class335 aClass335_19 = new Class335(1);

	@OriginalMember(owner = "client!wba", name = "J", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_110 = new Class144(72, -1);

	@OriginalMember(owner = "client!wba", name = "cb", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_13 = new Class123(9, 0, 4, 1);

	@OriginalMember(owner = "client!wba", name = "hb", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_187 = new Class397(58, 2);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(JIIIILclient!nt;Lclient!aa;II)V")
	public static void method9305(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class270 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg1 * arg1 + arg6 * arg6;
		if ((long) local12 > arg0) {
			return;
		}
		@Pc(38) int local38 = Math.min(arg4.anInt7015 / 2, arg4.anInt7045 / 2);
		if (local38 * local38 >= local12) {
			Static687.method9072(arg1, arg5, arg7, Static203.aClass178Array6[arg2], arg4, arg3, arg6);
			return;
		}
		local38 -= 10;
		@Pc(69) int local69;
		if (Static262.anInt4081 == 4) {
			local69 = (int) Static382.aFloat40 & 0x3FFF;
		} else {
			local69 = (int) Static382.aFloat40 + Static194.anInt3310 & 0x3FFF;
		}
		@Pc(80) int local80 = Class3_Sub7_Sub17_Sub1.anIntArray549[local69];
		@Pc(84) int local84 = Class3_Sub7_Sub17_Sub1.anIntArray548[local69];
		if (Static262.anInt4081 != 4) {
			local80 = local80 * 256 / (Static402.anInt6239 + 256);
			local84 = local84 * 256 / (Static402.anInt6239 + 256);
		}
		@Pc(116) int local116 = local80 * arg6 + local84 * arg1 >> 14;
		@Pc(127) int local127 = local84 * arg6 - arg1 * local80 >> 14;
		@Pc(133) double local133 = Math.atan2((double) local116, (double) local127);
		@Pc(140) int local140 = (int) ((double) local38 * Math.sin(local133));
		@Pc(147) int local147 = (int) ((double) local38 * Math.cos(local133));
		Static207.aClass178Array7[arg2].method7619((float) arg7 + (float) arg4.anInt7015 / 2.0F + (float) local140, (float) arg3 + (float) arg4.anInt7045 / 2.0F - (float) local147, 4096, (int) (-local133 / 6.283185307179586D * 65535.0D));
	}
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!wm", name = "Ib", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!wm", name = "yb", descriptor = "[I")
	public static int[] anIntArray474 = new int[4096];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)V")
	public static void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class142 local7 = Static17.method359(arg0);
		@Pc(10) int local10 = local7.anInt4478;
		@Pc(13) int local13 = local7.anInt4473;
		@Pc(16) int local16 = local7.anInt4479;
		@Pc(23) int local23 = Class2_Sub1_Sub7.anIntArray96[local16 - local10];
		if (arg1 < 0 || local23 < arg1) {
			arg1 = 0;
		}
		local23 <<= local10;
		Static289.method4809(arg1 << local10 & local23 | Static171.anIntArray297[local13] & ~local23, local13);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!mn;)V")
	public static void method4263(@OriginalArg(1) Class115 arg0) {
		if (Static65.anInt1453 == arg0.anInt3542) {
			Static165.aBooleanArray16[arg0.anInt3471] = true;
		}
	}
}

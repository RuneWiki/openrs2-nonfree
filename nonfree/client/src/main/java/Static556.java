import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	public static int anInt9967;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	public static int anInt9968;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_148 = new Class276(22, -1);

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
	public static final int[] anIntArray658 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[S")
	public static short[] aShortArray153 = new short[256];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
	public static void method8095() {
		@Pc(1) Class211 local1 = Static419.aClass211_51;
		synchronized (Static419.aClass211_51) {
			Static419.aClass211_51.method5535();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZILclient!e;Ljava/awt/Canvas;)Lclient!oa;")
	public static Class15 method8096(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class15_Sub3(arg2, arg1, arg0);
	}
}

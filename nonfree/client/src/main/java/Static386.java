import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Lclient!cr;")
	public static Class46_Sub1 aClass46_Sub1_2;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public static int anInt6224;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_139 = new Class253(21, 2);

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "[Lclient!wg;")
	public static final Class7_Sub4_Sub18[] aClass7_Sub4_Sub18Array6 = new Class7_Sub4_Sub18[14];

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "[I")
	public static final int[] anIntArray559 = new int[3];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V")
	public static void method4942(@OriginalArg(1) int arg0) {
		Static287.anInt6590 = arg0;
		@Pc(7) Class126 local7 = Static124.aClass126_19;
		synchronized (Static124.aClass126_19) {
			Static124.aClass126_19.method2827();
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	public static void method4948() {
		for (@Pc(15) int local15 = 0; local15 < Static225.anInt4941; local15++) {
			@Pc(21) Class252 local21 = Static205.aClass252Array1[local15];
			if (local21.aByte90 == 2) {
				if (local21.aClass7_Sub8_Sub4_4 == null) {
					local21.anInt6620 = Integer.MIN_VALUE;
				} else {
					Static452.aClass7_Sub8_Sub1_2.method2428(local21.aClass7_Sub8_Sub4_4);
				}
			}
		}
	}
}

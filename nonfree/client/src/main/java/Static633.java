import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	public static int anInt10164;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
	public static int[] anIntArray729;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
	public static final int[] anIntArray730 = new int[1000];

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
	public static boolean aBoolean753 = false;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Z")
	public static boolean method8493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static115.method1859(arg1, arg0) & (Static480.method6932(arg1, arg0) | (arg1 & 0x2000) != 0 | Static447.method6625(arg0, arg1));
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public static void method8494() {
		@Pc(7) client local7 = Static181.aClient1;
		synchronized (Static181.aClient1) {
			if (Static275.aFrame2 == null) {
				@Pc(20) Container local20;
				if (Static503.aFrame3 != null) {
					local20 = Static503.aFrame3;
				} else if (Static234.anApplet2 == null) {
					local20 = Static493.anApplet_Sub1_1;
				} else {
					local20 = Static234.anApplet2;
				}
				Static519.anInt8672 = local20.getSize().width;
				Static547.anInt9285 = local20.getSize().height;
				@Pc(42) Insets local42;
				if (Static503.aFrame3 == local20) {
					local42 = Static503.aFrame3.getInsets();
					Static519.anInt8672 -= local42.right + local42.left;
					Static547.anInt9285 -= local42.top + local42.bottom;
				}
				if (Static501.method7132() == 1) {
					Static480.anInt8253 = (Static519.anInt8672 - Static386.anInt6961) / 2;
					Static571.anInt9399 = Static386.anInt6961;
					Static386.anInt6957 = 0;
					Static585.anInt9606 = Static135.anInt3053;
				} else {
					Static587.method8111();
				}
				if (Static267.aClass86_7 != Static95.aClass86_5) {
					@Pc(94) boolean local94;
					if (Static571.anInt9399 < 1024 && Static585.anInt9606 < 768) {
						local94 = true;
					} else {
						local94 = false;
					}
				}
				Static147.aCanvas5.setSize(Static571.anInt9399, Static585.anInt9606);
				if (Static600.aClass87_15 != null) {
					if (Static558.aBoolean680) {
						Static362.method5517(Static147.aCanvas5);
					} else {
						Static600.aClass87_15.method7924(Static147.aCanvas5, Static571.anInt9399, Static585.anInt9606);
					}
				}
				if (Static503.aFrame3 == local20) {
					local42 = Static503.aFrame3.getInsets();
					Static147.aCanvas5.setLocation(local42.left + Static480.anInt8253, Static386.anInt6957 + local42.top);
				} else {
					Static147.aCanvas5.setLocation(Static480.anInt8253, Static386.anInt6957);
				}
				if (Static387.anInt6978 != -1) {
					Static146.method2807(true);
				}
				Static230.method7141();
			}
		}
	}
}

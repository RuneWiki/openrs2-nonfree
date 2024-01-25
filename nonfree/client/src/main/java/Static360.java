import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public static int anInt6281;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
	public static final int[] anIntArray345 = new int[1000];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method5369() {
		@Pc(7) client local7 = Static454.aClient1;
		synchronized (Static454.aClient1) {
			if (Static517.aFrame1 == null) {
				@Pc(18) Container local18;
				if (Static675.aFrame3 != null) {
					local18 = Static675.aFrame3;
				} else if (Static492.anApplet2 == null) {
					local18 = Static361.anApplet_Sub1_1;
				} else {
					local18 = Static492.anApplet2;
				}
				Static340.anInt6053 = local18.getSize().width;
				Static584.anInt9793 = local18.getSize().height;
				@Pc(44) Insets local44;
				if (local18 == Static675.aFrame3) {
					local44 = Static675.aFrame3.getInsets();
					Static584.anInt9793 -= local44.bottom + local44.top;
					Static340.anInt6053 -= local44.right + local44.left;
				}
				if (Static341.method5176() == 1) {
					Static228.anInt3709 = 0;
					Static70.anInt1125 = Static264.anInt4559;
					Static211.anInt3445 = (Static340.anInt6053 - Static264.anInt4559) / 2;
					Static631.anInt10283 = Static47.anInt794;
				} else {
					Static115.method1644();
				}
				if (Static408.aClass201_8 != Static570.aClass201_10) {
					@Pc(101) boolean local101;
					if (Static70.anInt1125 < 1024 && Static631.anInt10283 < 768) {
						local101 = true;
					} else {
						local101 = false;
					}
				}
				Static24.aCanvas1.setSize(Static70.anInt1125, Static631.anInt10283);
				if (Static457.aClass57_11 != null) {
					if (Static40.aBoolean61) {
						Static81.method1260(Static24.aCanvas1);
					} else {
						Static457.aClass57_11.method7699(Static24.aCanvas1, Static70.anInt1125, Static631.anInt10283);
					}
				}
				if (Static675.aFrame3 == local18) {
					local44 = Static675.aFrame3.getInsets();
					Static24.aCanvas1.setLocation(local44.left + Static211.anInt3445, Static228.anInt3709 + local44.top);
				} else {
					Static24.aCanvas1.setLocation(Static211.anInt3445, Static228.anInt3709);
				}
				if (Static390.anInt6669 != -1) {
					Static294.method4358(true);
				}
				Static403.method5923();
			}
		}
	}
}

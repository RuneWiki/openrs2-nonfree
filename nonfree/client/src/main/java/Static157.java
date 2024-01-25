import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	public static int anInt3102;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	public static int anInt3107;

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
	public static int anInt3113 = 0;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	public static void method2847() {
		@Pc(7) client local7 = Static116.aClient1;
		synchronized (Static116.aClient1) {
			if (Static4.aFrame1 == null) {
				@Pc(18) Container local18;
				if (Static209.aFrame3 != null) {
					local18 = Static209.aFrame3;
				} else if (Static504.anApplet2 == null) {
					local18 = Static128.anApplet_Sub1_1;
				} else {
					local18 = Static504.anApplet2;
				}
				Static463.anInt7087 = local18.getSize().width;
				Static73.anInt1757 = local18.getSize().height;
				@Pc(47) Insets local47;
				if (Static209.aFrame3 == local18) {
					local47 = Static209.aFrame3.getInsets();
					Static463.anInt7087 -= local47.right + local47.left;
					Static73.anInt1757 -= local47.bottom + local47.top;
				}
				if (Static634.method8682() == 1) {
					Static349.anInt6748 = (Static463.anInt7087 - Static612.anInt9912) / 2;
					Static603.anInt9836 = 0;
					Static330.anInt6165 = Static90.anInt2181;
					Static109.anInt2357 = Static612.anInt9912;
				} else {
					Static276.method4490();
				}
				if (Static2.aClass135_1 != Static42.aClass135_2) {
					@Pc(98) boolean local98;
					if (Static109.anInt2357 < 1024 && Static330.anInt6165 < 768) {
						local98 = true;
					} else {
						local98 = false;
					}
				}
				Static364.aCanvas13.setSize(Static109.anInt2357, Static330.anInt6165);
				if (Static323.aClass5_9 != null) {
					if (Static219.aBoolean285) {
						Static312.method5142(Static364.aCanvas13);
					} else {
						Static323.aClass5_9.method7554(Static364.aCanvas13, Static109.anInt2357, Static330.anInt6165);
					}
				}
				if (Static209.aFrame3 == local18) {
					local47 = Static209.aFrame3.getInsets();
					Static364.aCanvas13.setLocation(Static349.anInt6748 + local47.left, Static603.anInt9836 + local47.top);
				} else {
					Static364.aCanvas13.setLocation(Static349.anInt6748, Static603.anInt9836);
				}
				if (Static307.anInt5465 != -1) {
					Static422.method6616(true);
				}
				Static428.method4107();
			}
		}
	}
}

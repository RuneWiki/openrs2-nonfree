import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[B")
	public static byte[] aByteArray102;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	public static int anInt7708;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	public static int anInt7704 = 0;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "[I")
	public static final int[] anIntArray495 = new int[4096];

	@OriginalMember(owner = "client!or", name = "q", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_158 = new Class215(16, 6);

	@OriginalMember(owner = "client!or", name = "I", descriptor = "Lclient!ib;")
	public static Class144 aClass144_1 = new Class144(8);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!in;IZJIII)V")
	public static void method6618(@OriginalArg(0) Class157 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static108.method2796(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)V")
	public static void method6619() {
		@Pc(11) client local11 = Static30.aClient1;
		synchronized (Static30.aClient1) {
			if (Static232.aFrame1 == null) {
				@Pc(22) Container local22;
				if (Static255.aFrame2 != null) {
					local22 = Static255.aFrame2;
				} else if (Static334.anApplet2 == null) {
					local22 = Static297.anApplet_Sub1_1;
				} else {
					local22 = Static334.anApplet2;
				}
				Static584.anInt5338 = local22.getSize().width;
				Static330.anInt6688 = local22.getSize().height;
				@Pc(46) Insets local46;
				if (Static255.aFrame2 == local22) {
					local46 = Static255.aFrame2.getInsets();
					Static584.anInt5338 -= local46.left + local46.right;
					Static330.anInt6688 -= local46.bottom + local46.top;
				}
				if (Static89.method2478() == 1) {
					Static81.anInt2497 = Static326.anInt6591;
					Static110.anInt3008 = 0;
					Static57.anInt1928 = (Static584.anInt5338 - Static326.anInt6591) / 2;
					Static423.anInt7984 = Static467.anInt8715;
				} else {
					Static190.method3911();
				}
				if (Static448.aClass107_7 != Static193.aClass107_2) {
					@Pc(95) boolean local95;
					if (Static81.anInt2497 < 1024 && Static423.anInt7984 < 768) {
						local95 = true;
					} else {
						local95 = false;
					}
				}
				Static639.aCanvas10.setSize(Static81.anInt2497, Static423.anInt7984);
				if (Static186.aClass20_4 != null) {
					if (Static487.aBoolean676) {
						Static502.method7993(Static639.aCanvas10);
					} else {
						Static186.aClass20_4.method7272(Static639.aCanvas10, Static81.anInt2497, Static423.anInt7984);
					}
				}
				if (Static255.aFrame2 == local22) {
					local46 = Static255.aFrame2.getInsets();
					Static639.aCanvas10.setLocation(local46.left + Static57.anInt1928, Static110.anInt3008 + local46.top);
				} else {
					Static639.aCanvas10.setLocation(Static57.anInt1928, Static110.anInt3008);
				}
				if (Static475.anInt10143 != -1) {
					Static527.method9032(true);
				}
				Static390.method6424();
			}
		}
	}
}

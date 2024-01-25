import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	public static int anInt4885 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method4366() {
		@Pc(7) client local7 = Static105.aClient4;
		synchronized (Static105.aClient4) {
			if (Static12.aFrame1 == null) {
				@Pc(22) Container local22;
				if (Static613.aFrame2 != null) {
					local22 = Static613.aFrame2;
				} else if (Static531.anApplet2 == null) {
					local22 = Static267.anApplet_Sub1_1;
				} else {
					local22 = Static531.anApplet2;
				}
				Static34.anInt543 = local22.getSize().width;
				Static235.anInt4561 = local22.getSize().height;
				@Pc(44) Insets local44;
				if (local22 == Static613.aFrame2) {
					local44 = Static613.aFrame2.getInsets();
					Static34.anInt543 -= local44.left + local44.right;
					Static235.anInt4561 -= local44.bottom + local44.top;
				}
				if (Static141.method2141() == 1) {
					Static506.anInt8791 = Static380.anInt6697;
					Static365.anInt6233 = (Static34.anInt543 - Static380.anInt6690) / 2;
					Static563.anInt4939 = Static380.anInt6690;
					Static663.anInt10806 = 0;
				} else {
					Static181.method2652();
				}
				if (Static115.aClass59_4 != Static548.aClass59_10) {
					@Pc(101) boolean local101;
					if (Static563.anInt4939 < 1024 && Static506.anInt8791 < 768) {
						local101 = true;
					} else {
						local101 = false;
					}
				}
				Static626.aCanvas12.setSize(Static563.anInt4939, Static506.anInt8791);
				if (Static103.aClass144_3 != null) {
					if (Static656.aBoolean741) {
						Static170.method2466(Static626.aCanvas12);
					} else {
						Static103.aClass144_3.method6888(Static626.aCanvas12, Static563.anInt4939, Static506.anInt8791);
					}
				}
				if (Static613.aFrame2 == local22) {
					local44 = Static613.aFrame2.getInsets();
					Static626.aCanvas12.setLocation(local44.left + Static365.anInt6233, Static663.anInt10806 + local44.top);
				} else {
					Static626.aCanvas12.setLocation(Static365.anInt6233, Static663.anInt10806);
				}
				if (Static358.anInt6145 != -1) {
					Static379.method5835(true);
				}
				Static118.method1852();
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!jaa;ILclient!ka;Lclient!jaa;)V")
	public static void method4367(@OriginalArg(0) Class181 arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) Class181 arg2) {
		if (arg2.method8967() && arg0.method8967()) {
			@Pc(22) Class259 local22 = arg2.aClass259_4;
			@Pc(25) Class259 local25 = arg0.aClass259_4;
			arg1.method5286(arg2.anInt10475, arg2.aClass318_8.aClass14_Sub2_Sub15_1, arg0.aClass318_8.anInt9151, arg2.aClass318_8.anInt9151, arg0.aClass318_8.aClass14_Sub2_Sub15_1, arg0.aClass318_8.anInt9150, local25.aBoolean504 | local22.aBoolean504, local22.aBooleanArray18, arg0.aClass318_8.aClass14_Sub2_Sub15_2, local22.anIntArray370[arg2.anInt10459], arg0.anInt10475, arg2.aClass318_8.anInt9150, local25.anIntArray370[arg0.anInt10459], arg2.aClass318_8.aClass14_Sub2_Sub15_2);
		}
	}
}

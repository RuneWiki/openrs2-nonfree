import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BJLclient!r;)V")
	public static void method3417(@OriginalArg(1) long arg0, @OriginalArg(2) Class44 arg1) {
		Static165.anInt3395 = Static542.anInt9640;
		Static314.anInt6224 = 0;
		Static307.anInt6164 = 0;
		Static542.anInt9640 = 0;
		@Pc(20) long local20 = Static574.method8210();
		for (@Pc(25) Class1_Sub2 local25 = (Class1_Sub2) Static128.aClass136_4.method3288(); local25 != null; local25 = (Class1_Sub2) Static128.aClass136_4.method3286()) {
			if (local25.method340(arg1, arg0)) {
				Static307.anInt6164++;
			}
		}
		if (Static281.aBoolean436 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static128.aClass136_4.method3285() + ", running: " + Static307.anInt6164);
			System.out.println("Emitters: " + Static314.anInt6224 + " Particles: " + Static542.anInt9640 + ". Time taken: " + (Static574.method8210() - local20) + "ms");
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(III)V")
	public static void method3418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub5_Sub16 local10 = Static219.method3587(arg1, 6);
		local10.method7133();
		local10.anInt8736 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!wd;)V")
	public static void method3419(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class354 arg1) {
		while (true) {
			@Pc(9) Class234 local9 = arg1.method8219(arg0);
			while (local9.anInt6717 == 0) {
				Static63.method1019(10L);
			}
			if (local9.anInt6717 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static63.method1019(100L);
		}
	}
}

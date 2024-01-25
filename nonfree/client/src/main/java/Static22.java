import java.applet.Applet;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
	public static final int[] anIntArray17 = new int[13];

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ha;II)Lclient!pu;")
	public static Class50 method287(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub40 local15 = (Class5_Sub40) Static133.aClass300_10.method7188((long) arg1);
		if (local15 != null) {
			@Pc(22) Class5_Sub9_Sub2 local22 = local15.aClass140_Sub1_1.method7246();
			local15.aBoolean563 = true;
			if (local22 != null) {
				return local22.method7631(arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method288(@OriginalArg(0) Class65 arg0) {
		if (Static271.aClass114_40.method2811() == 0) {
			return;
		}
		@Pc(27) Class5_Sub44 local27;
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 0) {
			for (local27 = (Class5_Sub44) Static271.aClass114_40.method2805(); local27 != null; local27 = (Class5_Sub44) Static271.aClass114_40.method2814()) {
				Static110.aClass105_1.method2655(local27.aBoolean667 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 : null, arg0, false, local27.anInt7794, arg0, local27.anInt7796, local27.anInt7799, Static431.aClass73_10, local27.anInt7798, false, local27.anInt7791);
				local27.method9052();
			}
			Static283.method4543();
			return;
		}
		if (Static108.aClass65_3 == null) {
			@Pc(74) Canvas local74 = new Canvas();
			local74.setSize(36, 32);
			Static108.aClass65_3 = Static208.method3307(0, 0, local74, Static305.aClass390_77, Static476.anInterface4_10);
			Static48.aClass73_14 = Static108.aClass65_3.method6886(Static244.method4626(Static536.aClass390_104, Static363.anInt9292), Static689.method8535(Static257.aClass390_60, Static363.anInt9292));
		}
		for (local27 = (Class5_Sub44) Static271.aClass114_40.method2805(); local27 != null; local27 = (Class5_Sub44) Static271.aClass114_40.method2814()) {
			Static110.aClass105_1.method2655(local27.aBoolean667 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 : null, Static108.aClass65_3, false, local27.anInt7794, arg0, local27.anInt7796, local27.anInt7799, Static48.aClass73_14, local27.anInt7798, false, local27.anInt7791);
			local27.method9052();
		}
	}
}

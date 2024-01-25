import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	public static int anInt6702;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Lclient!ws;")
	public static Class361 aClass361_51 = new Class361();

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "D")
	public static double aDouble12 = -1.0D;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "[I")
	public static final int[] anIntArray496 = new int[5];

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Lclient!oa;I)V")
	public static void method5639(@OriginalArg(0) Class14 arg0) {
		if (Static582.aClass361_69.method7841() == 0) {
			return;
		}
		@Pc(53) Class6_Sub46 local53;
		if (Static560.anInt9242 == 0) {
			for (local53 = (Class6_Sub46) Static582.aClass361_69.method7838(); local53 != null; local53 = (Class6_Sub46) Static582.aClass361_69.method7845()) {
				Static444.aClass322_2.method7144(false, local53.anInt8825, arg0, arg0, local53.anInt8822, Static319.aClass92_11, false, local53.anInt8827, local53.anInt8823, local53.anInt8826, local53.aBoolean640 ? Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 : null);
				local53.method7804();
			}
			Static415.method7746();
			return;
		}
		if (Static414.aClass14_12 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static414.aClass14_12 = Static354.method6855(Static488.anInterface4_11, Static13.aClass251_100, 0, local21, 0);
			Static381.aClass92_13 = Static414.aClass14_12.method6854(Static141.method2763(Static84.anInt1707, Static264.aClass251_66), Static604.method3627(Static398.aClass251_94, Static84.anInt1707));
		}
		for (local53 = (Class6_Sub46) Static582.aClass361_69.method7838(); local53 != null; local53 = (Class6_Sub46) Static582.aClass361_69.method7845()) {
			Static444.aClass322_2.method7144(false, local53.anInt8825, arg0, Static414.aClass14_12, local53.anInt8822, Static381.aClass92_13, false, local53.anInt8827, local53.anInt8823, local53.anInt8826, local53.aBoolean640 ? Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 : null);
			local53.method7804();
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!pf;")
	public static Class173 method5641(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class173_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class173) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class173_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)I")
	public static int method5643(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

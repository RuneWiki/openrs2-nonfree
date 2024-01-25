import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_12 = new Class40(65, 6);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class268 local3 = new Class268();
		local3.anInt7567 = arg1 >> Static188.anInt3275;
		local3.anInt7552 = arg2 >> Static188.anInt3275;
		local3.anInt7559 = arg3 >> Static188.anInt3275;
		local3.anInt7560 = arg4 >> Static188.anInt3275;
		local3.anInt7566 = arg0;
		local3.anInt7557 = arg1;
		local3.anInt7571 = arg2;
		local3.anInt7556 = arg3;
		local3.anInt7555 = arg4;
		local3.anInt7561 = arg5;
		local3.anInt7565 = arg6;
		Static175.aClass268Array2[Static342.anInt9106++] = local3;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lclient!fca;ZII)V")
	public static void method466(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class16 local8 = arg0.method1976(Static176.aClass121_5);
		if (local8 == null) {
			return;
		}
		Static176.aClass121_5.ca(arg1, arg2, arg1 + arg0.anInt2340, arg0.anInt2305 + arg2);
		if (Static573.anInt9601 < 3) {
			Static393.aClass4_22.method6513((float) arg1 + (float) arg0.anInt2340 / 2.0F, (float) arg0.anInt2305 / 2.0F + (float) arg2, ((int) -Static399.aFloat167 & 0x3FFF) << 2, local8, arg1, arg2);
		} else {
			Static176.aClass121_5.L(-16777216, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V")
	public static void method467(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub1_Sub5 local12 = Static77.method1176(arg0, 3);
		local12.method770();
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(IZ)V")
	public static void method468(@OriginalArg(0) int arg0) {
		Static322.anInt5815 = arg0;
		Static303.aClass332_126.method7510();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZLjava/awt/Component;B)Lclient!js;")
	public static Class134 method469(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class134_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class134) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class134_Sub2(arg0, true);
		}
	}
}

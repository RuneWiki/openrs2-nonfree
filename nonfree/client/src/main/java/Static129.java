import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "Lclient!lm;")
	public static Class134 aClass134_60;

	@OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
	public static int anInt2574;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
	public static int anInt2569 = -1;

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_44 = new Class37(64);

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
	public static final int[] anIntArray266 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
	public static int anInt2575 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2094(@OriginalArg(1) Class10_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class10_Sub1_Sub2_Sub1) {
			@Pc(9) Class10_Sub1_Sub2_Sub1 local9 = (Class10_Sub1_Sub2_Sub1) arg0;
			if (local9.aClass60_1 != null) {
				Static124.method1984(local9);
			}
		} else if (arg0 instanceof Class10_Sub1_Sub2_Sub2) {
			Static260.method4680((Class10_Sub1_Sub2_Sub2) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)I")
	public static int method2095(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public static void method2096() {
		if (Static291.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static204.anInt6778;
		@Pc(10) int local10 = Static325.anInt2764;
		@Pc(17) int local17 = Static350.anInt4382 - Static26.anInt476 - local8;
		@Pc(28) int local28 = Static132.anInt6775 - local10 - Static321.anInt6388;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static333.aFrame2 == null) {
				local47 = Static197.aClass215_5.anApplet1;
			} else {
				local47 = Static333.aFrame2;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (local47 == Static333.aFrame2) {
				@Pc(61) Insets local61 = Static333.aFrame2.getInsets();
				local53 = local61.left;
				local55 = local61.top;
			}
			@Pc(70) Graphics local70 = local47.getGraphics();
			local70.setColor(Color.black);
			if (local8 > 0) {
				local70.fillRect(local53, local55, local8, Static132.anInt6775);
			}
			if (local10 > 0) {
				local70.fillRect(local53, local55, Static350.anInt4382, local10);
			}
			if (local17 > 0) {
				local70.fillRect(local53 + Static350.anInt4382 - local17, local55, local17, Static132.anInt6775);
			}
			if (local28 > 0) {
				local70.fillRect(local53, Static132.anInt6775 + local55 - local28, Static350.anInt4382, local28);
				return;
			}
		} catch (@Pc(117) Exception local117) {
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!ge;")
	public static Class79 method2097(@OriginalArg(1) int arg0) {
		@Pc(5) Class37 local5 = Static128.aClass37_56;
		@Pc(14) Class79 local14;
		synchronized (Static128.aClass37_56) {
			local14 = (Class79) Static128.aClass37_56.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(41) byte[] local41 = Static206.aClass134_100.method3009(Static43.method901(arg0), Static173.method3113(arg0));
		local14 = new Class79();
		local14.anInt1898 = arg0;
		if (local41 != null) {
			local14.method1553(new Class1_Sub21(local41));
		}
		local14.method1558();
		if (local14.aBoolean145) {
			local14.aBoolean140 = false;
			local14.anInt1881 = 0;
		}
		if (!Static121.aBoolean337 && local14.aBoolean137) {
			local14.aStringArray17 = null;
			local14.anIntArray158 = null;
		}
		@Pc(82) Class37 local82 = Static128.aClass37_56;
		synchronized (Static128.aClass37_56) {
			Static128.aClass37_56.method922((long) arg0, local14);
			return local14;
		}
	}
}

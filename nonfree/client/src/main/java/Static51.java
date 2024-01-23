import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString41 = "Loading wordpack - ";

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
	public static int anInt1111 = 0;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
	public static int anInt1112 = 0;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
	public static void method939() {
		Static203.method2967();
		Static25.method4021();
		Static76.method3988();
		Static227.aClass112_11.method2959();
		Static64.aClass88_1 = new Class88();
		((Class52_Sub1) Static119.anInterface5_1).method1488();
		Static200.method3418();
		Static151.anInt3075 = 0;
		Static151.aClass118Array1 = new Class118[255];
		Static20.method419();
		Static15.method219();
		Static309.method4595();
		Static261.method4039(false);
		Static201.method3424();
		Static182.method3106();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(49) Class11_Sub4_Sub1 local49 = Static14.aClass11_Sub4_Sub1Array1[local42];
			if (local49 != null) {
				local49.anObject5 = null;
			}
		}
		if (Static71.aBoolean165) {
			Static15.method226();
			Static260.method4031(Static5.aBoolean18);
			Static52.method968();
		}
		Static295.method4419(Static110.aClass119_42, Static45.aClass119_15);
		Static132.method2306(Static45.aClass119_15);
		Static175.aClass1_Sub5_Sub6_7 = null;
		Static264.aClass1_Sub5_Sub6_10 = null;
		Static159.aClass1_Sub5_Sub6_6 = null;
		Static206.aClass1_Sub5_Sub6_8 = null;
		Static144.aClass1_Sub5_Sub6_5 = null;
		if (Static97.anInt2087 == 5) {
			Static8.method141(Static45.aClass119_15);
		}
		if (Static97.anInt2087 == 10) {
			Static124.method563(false);
		}
		if (Static97.anInt2087 == 30) {
			Static197.method3406(25);
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
	public static void method940() {
		@Pc(7) int local7 = Static24.anInt500;
		@Pc(14) int local14 = Static253.anInt4653 - Static288.anInt5232 - local7;
		@Pc(16) int local16 = Static310.anInt5534;
		@Pc(23) int local23 = Static187.anInt3577 - Static194.anInt3876 - local16;
		if (local16 <= 0 && local23 <= 0 && local7 <= 0 && local14 <= 0) {
			return;
		}
		try {
			@Pc(42) Container local42;
			if (Static196.aFrame1 != null) {
				local42 = Static196.aFrame1;
			} else if (Static311.aFrame2 == null) {
				local42 = Static222.aClass176_3.anApplet1;
			} else {
				local42 = Static311.aFrame2;
			}
			@Pc(52) int local52 = 0;
			@Pc(54) int local54 = 0;
			if (Static311.aFrame2 == local42) {
				@Pc(61) Insets local61 = Static311.aFrame2.getInsets();
				local54 = local61.top;
				local52 = local61.left;
			}
			@Pc(70) Graphics local70 = local42.getGraphics();
			local70.setColor(Color.black);
			if (local16 > 0) {
				local70.fillRect(local52, local54, local16, Static253.anInt4653);
			}
			if (local7 > 0) {
				local70.fillRect(local52, local54, Static187.anInt3577, local7);
			}
			if (local23 > 0) {
				local70.fillRect(local52 + Static187.anInt3577 - local23, local54, local23, Static253.anInt4653);
			}
			if (local14 > 0) {
				local70.fillRect(local52, Static253.anInt4653 + local54 - local14, Static187.anInt3577, local14);
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([I[IZLclient!od;[I)V")
	public static void method942(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class11_Sub4_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(19) int local19 = arg0[local11];
			@Pc(23) int local23 = arg1[local11];
			@Pc(27) int local27 = arg3[local11];
			@Pc(29) int local29 = 0;
			while (local19 != 0 && arg2.aClass14Array3.length > local29) {
				if ((local19 & 0x1) != 0) {
					if (local27 == -1) {
						arg2.aClass14Array3[local29] = null;
					} else {
						@Pc(56) Class152 local56 = Static107.method2016(local27);
						@Pc(59) int local59 = local56.anInt4603;
						@Pc(64) Class14 local64 = arg2.aClass14Array3[local29];
						if (local64 != null) {
							if (local27 == local64.anInt496) {
								if (local59 == 0) {
									local64 = arg2.aClass14Array3[local29] = null;
								} else if (local59 == 1) {
									local64.anInt498 = 1;
									local64.anInt494 = 0;
									local64.anInt501 = 0;
									local64.anInt497 = 0;
									local64.anInt489 = local23;
									Static291.method4385(local56, false, arg2.anInt3856, arg2.anInt3865, 0);
								} else if (local59 == 2) {
									local64.anInt501 = 0;
								}
							} else if (local56.anInt4608 >= Static107.method2016(local64.anInt496).anInt4608) {
								local64 = arg2.aClass14Array3[local29] = null;
							}
						}
						if (local64 == null) {
							local64 = arg2.aClass14Array3[local29] = new Class14();
							local64.anInt496 = local27;
							local64.anInt494 = 0;
							local64.anInt501 = 0;
							local64.anInt498 = 1;
							local64.anInt489 = local23;
							local64.anInt497 = 0;
							Static291.method4385(local56, false, arg2.anInt3856, arg2.anInt3865, 0);
						}
					}
				}
				local29++;
				local19 >>>= 0x1;
			}
		}
	}
}

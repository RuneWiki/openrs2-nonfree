import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!sh;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!n;")
	public static final Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_893 = Static158.method3034(": ");

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_894 = Static158.method3034("<col=ff7000>");

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_897 = Static158.method3034("Type");

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!ob;")
	public static Class60 aClass60_895 = aClass60_897;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	public static int anInt3177 = 0;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_896 = Static158.method3034("Loading interfaces )2 ");

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public static final int anInt3178 = 5063219;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Lclient!ob;")
	public static Class60 aClass60_898 = aClass60_896;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_899 = Static158.method3034("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2496(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static170.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static134.aClass82_1);
		arg0.addFocusListener(Static134.aClass82_1);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!dg;IZ)V")
	public static void method2497(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if ((arg0 & 0x8) != 0) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method242();
			local20 = Static139.aClass2_Sub3_Sub1_32.method218();
			@Pc(24) int local24 = Static139.aClass2_Sub3_Sub1_32.method218();
			@Pc(27) int local27 = Static139.aClass2_Sub3_Sub1_32.anInt273;
			if (arg1.aClass60_288 != null && arg1.aClass32_1 != null) {
				@Pc(38) long local38 = arg1.aClass60_288.method2691();
				@Pc(40) boolean local40 = false;
				if (local20 <= 1) {
					for (@Pc(47) int local47 = 0; local47 < Static88.anInt2600; local47++) {
						if (Static138.aLongArray2[local47] == local38) {
							local40 = true;
							break;
						}
					}
				}
				if (!local40 && Static19.anInt3087 == 0) {
					Static44.aClass2_Sub3_1.anInt273 = 0;
					Static139.aClass2_Sub3_Sub1_32.method228(local24, Static44.aClass2_Sub3_1.aByteArray4);
					Static44.aClass2_Sub3_1.anInt273 = 0;
					@Pc(91) Class60 local91 = Static124.method1777(Static162.method3069(Static44.aClass2_Sub3_1).method2700());
					arg1.aClass60_919 = local91.method2689();
					arg1.anInt3300 = 150;
					arg1.anInt3272 = local16 & 0xFF;
					arg1.anInt3304 = local16 >> 8;
					if (local20 == 2 || local20 == 3) {
						Static118.method2563(1, Static193.method3536(new Class60[] { Static75.aClass60_611, arg1.aClass60_288 }), local91);
					} else if (local20 == 1) {
						Static118.method2563(1, Static193.method3536(new Class60[] { Static183.aClass60_1250, arg1.aClass60_288 }), local91);
					} else {
						Static118.method2563(2, arg1.aClass60_288, local91);
					}
				}
			}
			Static139.aClass2_Sub3_Sub1_32.anInt273 = local27 + local24;
		}
		if ((arg0 & 0x2) != 0) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method209();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = Static139.aClass2_Sub3_Sub1_32.method194();
			Static79.method1891(local16, local20, arg1);
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt3249 = Static139.aClass2_Sub3_Sub1_32.method192();
			local16 = Static139.aClass2_Sub3_Sub1_32.method212();
			arg1.anInt3251 = local16 >> 16;
			arg1.anInt3306 = Static20.anInt580 + (local16 & 0xFFFF);
			arg1.anInt3297 = 0;
			arg1.anInt3259 = 0;
			if (Static20.anInt580 < arg1.anInt3306) {
				arg1.anInt3297 = -1;
			}
			if (arg1.anInt3249 == 65535) {
				arg1.anInt3249 = -1;
			}
		}
		if ((arg0 & 0x80) != 0) {
			arg1.aClass60_919 = Static139.aClass2_Sub3_Sub1_32.method240();
			if (arg1.aClass60_919.method2665(0) == 126) {
				arg1.aClass60_919 = arg1.aClass60_919.method2672(1);
				Static118.method2563(2, arg1.aClass60_288, arg1.aClass60_919);
			} else if (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 == arg1) {
				Static118.method2563(2, arg1.aClass60_288, arg1.aClass60_919);
			}
			arg1.anInt3304 = 0;
			arg1.anInt3300 = 150;
			arg1.anInt3272 = 0;
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt3291 = Static139.aClass2_Sub3_Sub1_32.method209();
			if (arg1.anInt3291 == 65535) {
				arg1.anInt3291 = -1;
			}
		}
		if ((arg0 & 0x200) != 0) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method218();
			local20 = Static139.aClass2_Sub3_Sub1_32.method218();
			arg1.method2558(local16, Static20.anInt580, local20);
		}
		if ((arg0 & 0x20) != 0) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method218();
			@Pc(361) byte[] local361 = new byte[local16];
			@Pc(366) Class2_Sub3 local366 = new Class2_Sub3(local361);
			Static139.aClass2_Sub3_Sub1_32.method195(local361, local16);
			Static14.aClass2_Sub3Array1[arg2] = local366;
			arg1.method902(local366);
		}
		if ((arg0 & 0x10) != 0) {
			local16 = Static139.aClass2_Sub3_Sub1_32.method229();
			local20 = Static139.aClass2_Sub3_Sub1_32.method218();
			arg1.method2558(local16, Static20.anInt580, local20);
			arg1.anInt3294 = Static20.anInt580 + 300;
			arg1.anInt3282 = Static139.aClass2_Sub3_Sub1_32.method194();
		}
		if ((arg0 & 0x100) != 0) {
			arg1.anInt3298 = Static139.aClass2_Sub3_Sub1_32.method201();
			arg1.anInt3257 = Static139.aClass2_Sub3_Sub1_32.method229();
			arg1.anInt3271 = Static139.aClass2_Sub3_Sub1_32.method194();
			arg1.anInt3287 = Static139.aClass2_Sub3_Sub1_32.method201();
			arg1.anInt3263 = Static139.aClass2_Sub3_Sub1_32.method209() + Static20.anInt580;
			arg1.anInt3295 = Static139.aClass2_Sub3_Sub1_32.method234() + Static20.anInt580;
			arg1.anInt3267 = Static139.aClass2_Sub3_Sub1_32.method218();
			arg1.anInt3305 = 0;
			arg1.anInt3254 = 1;
		}
		if ((arg0 & 0x4) != 0) {
			arg1.anInt3293 = Static139.aClass2_Sub3_Sub1_32.method242();
			arg1.anInt3269 = Static139.aClass2_Sub3_Sub1_32.method234();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!pe;BLclient!pe;Lclient!pe;)V")
	public static void method2498(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2) {
		Static158.anInt4006 = arg2.method527(Static57.aClass60_409);
		Static168.anInt4119 = arg0.method527(Static16.aClass60_122);
		Static53.anInt1666 = arg0.method527(Static82.aClass60_654);
		Static44.anInt1376 = arg0.method527(Static30.aClass60_217);
		Static152.anInt2811 = arg0.method527(Static156.aClass60_1076);
		Static182.anInt4404 = arg0.method527(Static111.aClass60_876);
		Static53.anInt1659 = arg0.method527(Static158.aClass60_1085);
		Static128.anInt3500 = arg0.method527(Static105.aClass60_996);
		Static191.anInt4558 = arg0.method527(Static6.aClass60_68);
		Static115.anInt3213 = arg0.method527(Static87.aClass60_703);
		Static115.anInt3212 = arg0.method527(Static198.aClass60_1334);
		Static53.anInt1685 = arg1.method527(Static153.aClass60_1055);
	}
}

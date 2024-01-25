import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public static int anInt5389;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Lclient!eb;")
	public static final Class1_Sub7 aClass1_Sub7_9 = new Class1_Sub7(new byte[5000]);

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!lr;")
	public static Applet_Sub1 anApplet_Sub1_5 = null;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	public static int anInt5390 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public static void method4790() {
		if (Static292.aFrame2 != null) {
			return;
		}
		@Pc(20) Container local20;
		if (Static232.aFrame3 == null) {
			local20 = Static180.aClass110_6.anApplet1;
		} else {
			local20 = Static232.aFrame3;
		}
		Static328.anInt6274 = local20.getSize().width;
		Static262.anInt5078 = local20.getSize().height;
		@Pc(39) Insets local39;
		if (local20 == Static232.aFrame3) {
			local39 = Static232.aFrame3.getInsets();
			Static328.anInt6274 -= local39.right + local39.left;
			Static262.anInt5078 -= local39.top + local39.bottom;
		}
		if (Static295.method5063() == 1) {
			Static78.anInt1584 = 0;
			Static340.anInt3938 = (Static328.anInt6274 - 765) / 2;
			anInt5389 = 765;
			Static320.anInt6140 = 503;
		} else if (Static157.anInt3131 < 96 && Static258.anInt5029 == 0) {
			@Pc(88) int local88 = Static328.anInt6274 > 1024 ? 1024 : Static328.anInt6274;
			@Pc(97) int local97 = Static262.anInt5078 > 768 ? 768 : Static262.anInt5078;
			anInt5389 = local88;
			Static340.anInt3938 = (Static328.anInt6274 - local88) / 2;
			Static78.anInt1584 = 0;
			Static320.anInt6140 = local97;
		} else {
			Static78.anInt1584 = 0;
			Static340.anInt3938 = 0;
			anInt5389 = Static328.anInt6274;
			Static320.anInt6140 = Static262.anInt5078;
		}
		if (Static123.anInt2380 != 0) {
			@Pc(131) boolean local131;
			if (anInt5389 < 1024 && Static320.anInt6140 < 768) {
				local131 = true;
			} else {
				local131 = false;
			}
		}
		Static261.aCanvas4.setSize(anInt5389, Static320.anInt6140);
		if (Static34.aClass2_6 != null) {
			Static34.aClass2_6.method3276();
		}
		if (Static232.aFrame3 == local20) {
			local39 = Static232.aFrame3.getInsets();
			Static261.aCanvas4.setLocation(Static340.anInt3938 + local39.left, Static78.anInt1584 + local39.top);
		} else {
			Static261.aCanvas4.setLocation(Static340.anInt3938, Static78.anInt1584);
		}
		if (Static100.anInt2086 != -1) {
			Static16.method370(true);
		}
		Static99.method1804();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!uq;")
	public static Class209 method4791(@OriginalArg(0) int arg0) {
		@Pc(5) Class140 local5 = Static122.aClass140_66;
		@Pc(14) Class209 local14;
		synchronized (Static122.aClass140_66) {
			local14 = (Class209) Static122.aClass140_66.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static24.aClass165_7.method4508(arg0, 3);
		local14 = new Class209();
		if (local30 != null) {
			local14.method5386(new Class1_Sub7(local30));
		}
		@Pc(53) Class140 local53 = Static122.aClass140_66;
		synchronized (Static122.aClass140_66) {
			Static122.aClass140_66.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4793(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static227.anInt4474 >= 100) {
			Static88.method1697(Static87.aString68);
			return;
		}
		@Pc(21) String local21 = Static34.method902(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(31) int local31 = 0; local31 < Static227.anInt4474; local31++) {
			@Pc(39) String local39 = Static34.method902(Static313.aStringArray44[local31]);
			if (local39 != null && local39.equals(local21)) {
				Static88.method1697(arg0 + Static148.aString200);
				return;
			}
			if (Static310.aStringArray43[local31] != null) {
				local66 = Static34.method902(Static310.aStringArray43[local31]);
				if (local66 != null && local66.equals(local21)) {
					Static88.method1697(arg0 + Static148.aString200);
					return;
				}
			}
		}
		for (@Pc(89) int local89 = 0; local89 < Static290.anInt5612; local89++) {
			local66 = Static34.method902(Static257.aStringArray33[local89]);
			if (local66 != null && local66.equals(local21)) {
				Static88.method1697(Static73.aString57 + arg0 + Static120.aString97);
				return;
			}
			if (Static294.aStringArray40[local89] != null) {
				@Pc(126) String local126 = Static34.method902(Static294.aStringArray40[local89]);
				if (local126 != null && local126.equals(local21)) {
					Static88.method1697(Static73.aString57 + arg0 + Static120.aString97);
					return;
				}
			}
		}
		if (Static34.method902(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130).equals(local21)) {
			Static88.method1697(Static325.aString190);
		} else {
			Static248.aClass1_Sub7_Sub1_2.method728(134);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg0) + 1);
			Static248.aClass1_Sub7_Sub1_2.method3124(arg0);
			Static248.aClass1_Sub7_Sub1_2.method3108(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
	public static void method4794(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class15_Sub6 local15 = (Class15_Sub6) Static350.aClass175_8.method4669(); local15 != null; local15 = (Class15_Sub6) Static350.aClass175_8.method4673()) {
			if (Static215.anInt4246 >= local15.anInt4362) {
				local15.method5441();
			} else {
				Static216.method3968((local15.anInt4360 << 7) + 64, arg0 >> 1, arg1 >> 1, (local15.anInt4365 << 7) + 64, local15.anInt4361 * 2);
				Static302.aClass13_7.method4455(arg2 + Static87.anIntArray215[1], local15.aString179, Static87.anIntArray215[0] + arg3, 0, local15.anInt4364 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I")
	public static int method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static206.method3822(arg0 - 1, arg1 - 1) + Static206.method3822(arg0 + 1, arg1 + -1) + Static206.method3822(arg0 - 1, arg1 - -1) + Static206.method3822(arg0 + 1, arg1 + 1);
		@Pc(69) int local69 = Static206.method3822(arg0 - 1, arg1) + Static206.method3822(arg0 + 1, arg1) + Static206.method3822(arg0, arg1 + -1) + Static206.method3822(arg0, arg1 - -1);
		@Pc(79) int local79 = Static206.method3822(arg0, arg1);
		return local69 / 8 + local41 / 16 + local79 / 4;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	public static void method4796() {
		if (Static223.anInt4434 < 0) {
			return;
		}
		@Pc(12) long local12 = Static349.method5647();
		Static223.anInt4434 = (int) ((long) Static223.anInt4434 + Static350.aLong214 - local12);
		if (Static223.anInt4434 <= 0) {
			Static56.aClass113_1 = Static145.aClass186_2.aClass113_4;
			Static223.anInt4434 = -1;
			Static137.aFloat66 = Static145.aClass186_2.aFloat104;
			Static172.anInt5801 = Static145.aClass186_2.anInt5487;
			Static276.anInt5378 = Static145.aClass186_2.anInt5489;
			Static332.aFloat116 = Static145.aClass186_2.aFloat100;
			Static55.aFloat24 = Static145.aClass186_2.aFloat102;
			Static25.aFloat6 = Static145.aClass186_2.aFloat103;
			Static207.aFloat82 = Static145.aClass186_2.aFloat101;
			Static20.anInt413 = Static145.aClass186_2.anInt5492;
			Static96.aFloat120 = Static145.aClass186_2.aFloat99;
		} else {
			@Pc(66) int local66 = (Static223.anInt4434 << 8) / Static48.anInt1103;
			@Pc(71) int local71 = 255 - local66;
			@Pc(76) float local76 = (float) local66 / 255.0F;
			@Pc(80) float local80 = 1.0F - local76;
			Static20.anInt413 = ((Static145.aClass186_2.anInt5492 & 0xFF00FF) * local71 + (Static7.anInt159 & 0xFF00FF) * local66 & 0xFF00FF00) + (local66 * (Static7.anInt159 & 0xFF00) + (local71 * (Static145.aClass186_2.anInt5492 & 0xFF00)) & 0xFF0000) >>> 8;
			Static55.aFloat24 = Static79.aFloat77 + (Static145.aClass186_2.aFloat102 - Static79.aFloat77) * local80;
			Static25.aFloat6 = Static113.aFloat41 + local80 * (Static145.aClass186_2.aFloat103 - Static113.aFloat41);
			Static96.aFloat120 = local80 * (Static145.aClass186_2.aFloat99 - Static315.aFloat114) + Static315.aFloat114;
			Static172.anInt5801 = ((Static145.aClass186_2.anInt5487 & 0xFF00FF) * local71 + (Static62.anInt1356 & 0xFF00FF) * local66 & 0xFF00FF00) + ((Static62.anInt1356 & 0xFF00) * local66 + local71 * (Static145.aClass186_2.anInt5487 & 0xFF00) & 0xFF0000) >>> 8;
			Static276.anInt5378 = local66 * Static88.anInt1744 + Static145.aClass186_2.anInt5489 * local71 >> 8;
			Static332.aFloat116 = Static86.aFloat34 + local80 * (Static145.aClass186_2.aFloat100 - Static86.aFloat34);
			Static137.aFloat66 = (Static145.aClass186_2.aFloat104 - Static57.aFloat26) * local80 + Static57.aFloat26;
			Static207.aFloat82 = (Static145.aClass186_2.aFloat101 - Static86.aFloat33) * local80 + Static86.aFloat33;
			if (Static145.aClass186_2.aClass113_4 != Static261.aClass113_3) {
				Static56.aClass113_1 = Static176.aClass2_9.method3323(Static261.aClass113_3, Static145.aClass186_2.aClass113_4, local80, Static56.aClass113_1);
			}
		}
		Static350.aLong214 = local12;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public static void method4797(@OriginalArg(1) boolean arg0) {
		if (Static300.aBoolean508 != arg0) {
			Static300.aBoolean508 = arg0;
			Static111.method2068();
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)V")
	public static void method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass5_Sub1_1 != null) {
			local7.aClass5_Sub1_1 = null;
		}
		if (local7.aClass5_Sub1_2 != null) {
			local7.aClass5_Sub1_2 = null;
		}
	}
}

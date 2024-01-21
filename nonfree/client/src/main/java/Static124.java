import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!me;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_6;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!oe;")
	public static final Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1219 = Static187.method3089("(Udns");

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1220 = Static187.method3089(" )2>");

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public static int anInt2613 = 0;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1221 = Static187.method3089("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_19 = new Class47(64);

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1222 = null;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)J")
	public static synchronized long method1828() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static141.aLong152) {
			Static60.aLong67 += Static141.aLong152 - local10;
		}
		Static141.aLong152 = local10;
		return local10 + Static60.aLong67;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method1829() {
		try {
			if (Static61.aClass34_1 == null) {
				Static61.aClass34_1 = new Class34(Static169.aClass24_4, Static208.method787(new Class92[] { Static56.aClass92_559, Static49.method872(Static93.anInt1976), Static50.aClass92_1484 }).method3207());
			} else {
				@Pc(39) byte[] local39 = Static61.aClass34_1.method974();
				if (local39 != null) {
					@Pc(46) Class1_Sub14 local46 = new Class1_Sub14(local39);
					Static176.anInt3790 = local46.method3023();
					Static90.aClass70Array1 = new Class70[Static176.anInt3790];
					for (@Pc(55) int local55 = 0; local55 < Static176.anInt3790; local55++) {
						@Pc(65) Class70 local65 = Static90.aClass70Array1[local55] = new Class70();
						@Pc(69) int local69 = local46.method3023();
						local65.aBoolean165 = (local69 & 0x8000) != 0;
						local65.anInt2796 = local69 & 0x7FFF;
						local65.aClass92_1349 = local46.method3022();
						local65.anInt2792 = local46.method3048();
						local65.anInt2798 = local55;
						local65.anInt2799 = Static15.method262(local46.method3023());
					}
					Static28.method512(Static90.aClass70Array1, Static38.anIntArray78, Static90.aClass70Array1.length - 1, 0, Static201.anIntArray357);
					Static36.aBoolean65 = true;
					Static61.aClass34_1 = null;
				}
			}
		} catch (@Pc(123) Exception local123) {
			local123.printStackTrace();
			Static61.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method1830() {
		@Pc(1) Class9 local1 = Static156.aClass9_1;
		synchronized (Static156.aClass9_1) {
			Static165.anInt3435++;
			Static85.anInt1857 = Static97.anInt2044;
			Static85.anInt1855 = Static65.anInt703;
			Static126.anInt2633 = Static148.anInt3015;
			Static196.anInt4284 = Static5.anInt107;
			Static57.anInt1370 = Static191.anInt4162;
			Static140.anInt2804 = Static120.anInt2556;
			Static196.aLong230 = Static101.aLong113;
			Static5.anInt107 = 0;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1831(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}

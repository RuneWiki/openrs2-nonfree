import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_92;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "[Lclient!oa;")
	public static final Class149[] aClass149Array1 = new Class149[4];

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString407 = " from your ignore list first.";

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method5238(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!fl;")
	public static Class75 method5239(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(13) Class local13 = Class.forName("Class75_Sub2");
			@Pc(17) Class75 local17 = (Class75) local13.getDeclaredConstructor().newInstance();
			local17.method3582(arg0);
			return local17;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class75_Sub1 local28 = new Class75_Sub1();
			local28.method3582(arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB[BI)Z")
	public static boolean method5240(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class7_Sub3 local12 = new Class7_Sub3(arg1);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(26) int local26 = local12.method2792();
			if (local26 == 0) {
				return local7;
			}
			local14 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(72) int local72;
				@Pc(108) Class122 local108;
				do {
					@Pc(77) int local77;
					@Pc(82) int local82;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local12.method2732();
										if (local45 == 0) {
											continue label70;
										}
										local12.method2772();
									}
									local45 = local12.method2732();
									if (local45 == 0) {
										continue label70;
									}
									local37 += local45 - 1;
									@Pc(60) int local60 = local37 & 0x3F;
									@Pc(66) int local66 = local37 >> 6 & 0x3F;
									local72 = local12.method2772() >> 2;
									local77 = local66 + arg2;
									local82 = local60 + arg0;
								} while (local77 <= 0);
							} while (local82 <= 0);
						} while (local77 >= Static15.anInt287 - 1);
					} while (local82 >= Static325.anInt6173 - 1);
					local108 = Static245.method4227(local14);
				} while (local72 == 22 && !Static155.aBoolean244 && local108.anInt3560 == 0 && local108.anInt3570 != 1 && !local108.aBoolean272);
				if (!local108.method3235()) {
					local7 = false;
					Static323.anInt6142++;
				}
				local39 = true;
			}
		}
	}
}

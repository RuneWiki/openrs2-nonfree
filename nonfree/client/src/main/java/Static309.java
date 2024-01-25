import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_325 = new Class159("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray72 = null;

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
	public static int anInt6000 = 2;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
	public static void method5096(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class4 local10 = Static33.aClass43_5.method1283(); local10 != null; local10 = Static33.aClass43_5.method1278()) {
			if ((long) arg0 == (local10.aLong223 >> 48 & 0xFFFFL)) {
				local10.method5687();
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)Lclient!fs;")
	public static Class73 method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class36[] local7 = null;
		@Pc(11) Class74 local11 = Static116.method2422(arg3);
		if (local11.anIntArray223 != null) {
			local7 = new Class36[local11.anIntArray223.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(35) Class201 local35 = Static351.method5597(local11.anIntArray223[local26]);
				local7[local26] = new Class36(local35.anInt6215, local35.anInt6219, local35.anInt6207, local35.anInt6214, local35.anInt6224, local35.anInt6213, local35.anInt6208, local35.aBoolean457);
			}
		}
		return new Class73(local11.anInt2536, local7, local11.anInt2535, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)V")
	public static void method5100(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub4_Sub18 local12 = Static302.method4961(arg0, 14);
		local12.method4902();
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	public static void method5102() {
		@Pc(10) int local10 = Static127.aClass4_Sub11_Sub1_3.method711(8);
		@Pc(15) int local15;
		if (local10 < Static289.anInt5643) {
			for (local15 = local10; local15 < Static289.anInt5643; local15++) {
				Static227.anIntArray51[Static212.anInt2908++] = Static333.anIntArray494[local15];
			}
		}
		if (local10 > Static289.anInt5643) {
			throw new RuntimeException("gppov1");
		}
		Static289.anInt5643 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(57) int local57 = Static333.anIntArray494[local15];
			@Pc(61) Class8_Sub1_Sub2_Sub1 local61 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local57];
			@Pc(66) int local66 = Static127.aClass4_Sub11_Sub1_3.method711(1);
			if (local66 == 0) {
				Static333.anIntArray494[Static289.anInt5643++] = local57;
				local61.anInt4940 = Static199.anInt4137;
			} else {
				@Pc(86) int local86 = Static127.aClass4_Sub11_Sub1_3.method711(2);
				if (local86 == 0) {
					Static333.anIntArray494[Static289.anInt5643++] = local57;
					local61.anInt4940 = Static199.anInt4137;
					Static311.anIntArray474[Static244.anInt4894++] = local57;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local86 == 1) {
						Static333.anIntArray494[Static289.anInt5643++] = local57;
						local61.anInt4940 = Static199.anInt4137;
						local131 = Static127.aClass4_Sub11_Sub1_3.method711(3);
						local61.method2082(1, local131);
						local141 = Static127.aClass4_Sub11_Sub1_3.method711(1);
						if (local141 == 1) {
							Static311.anIntArray474[Static244.anInt4894++] = local57;
						}
					} else if (local86 == 2) {
						Static333.anIntArray494[Static289.anInt5643++] = local57;
						local61.anInt4940 = Static199.anInt4137;
						if (Static127.aClass4_Sub11_Sub1_3.method711(1) == 1) {
							local131 = Static127.aClass4_Sub11_Sub1_3.method711(3);
							local61.method2082(2, local131);
							local141 = Static127.aClass4_Sub11_Sub1_3.method711(3);
							local61.method2082(2, local141);
						} else {
							local131 = Static127.aClass4_Sub11_Sub1_3.method711(3);
							local61.method2082(0, local131);
						}
						local131 = Static127.aClass4_Sub11_Sub1_3.method711(1);
						if (local131 == 1) {
							Static311.anIntArray474[Static244.anInt4894++] = local57;
						}
					} else if (local86 == 3) {
						Static227.anIntArray51[Static212.anInt2908++] = local57;
					}
				}
			}
		}
	}
}

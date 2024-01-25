import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!lga;")
	public static final Class194 aClass194_1 = new Class194(false);

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Lclient!lga;")
	public static Class194 aClass194_2 = aClass194_1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method1285(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) - (local8 - (long) arg0.charAt(local10));
		}
		return local8;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZIBLjava/lang/String;)V")
	public static void method1286(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static437.method6741();
		if (arg1 == 0) {
			Static171.aClass16_5 = Static508.method7342(Static118.anInterface2_10, Static155.aClass8_Sub25_6.aClass36_Sub26_1.method7794() * 2, Static636.aClass237_150, 0, Static549.aCanvas13);
			if (arg2 != null) {
				Static171.aClass16_5.GA(0);
				@Pc(181) Class345 local181 = Static288.method3439(Static264.aClass237_69, Static19.anInt3643);
				@Pc(190) Class27 local190 = Static171.aClass16_5.method6088(local181, Static647.method3297(Static630.aClass237_149, Static19.anInt3643));
				Static582.method8106();
				Static500.method7268(local190, true, Static171.aClass16_5, arg2, local181);
			}
		} else {
			@Pc(11) Class16 local11 = null;
			@Pc(30) Class345 local30;
			@Pc(39) Class27 local39;
			if (arg2 != null) {
				local11 = Static508.method7342(Static118.anInterface2_10, 0, Static636.aClass237_150, 0, Static549.aCanvas13);
				local11.GA(0);
				local30 = Static288.method3439(Static264.aClass237_69, Static19.anInt3643);
				local39 = local11.method6088(local30, Static647.method3297(Static630.aClass237_149, Static19.anInt3643));
				Static582.method8106();
				Static500.method7268(local39, true, local11, arg2, local30);
			}
			try {
				Static171.aClass16_5 = Static508.method7342(Static118.anInterface2_10, Static155.aClass8_Sub25_6.aClass36_Sub26_1.method7794() * 2, Static636.aClass237_150, arg1, Static549.aCanvas13);
				if (arg2 != null) {
					local11.GA(0);
					local30 = Static288.method3439(Static264.aClass237_69, Static19.anInt3643);
					local39 = local11.method6088(local30, Static647.method3297(Static630.aClass237_149, Static19.anInt3643));
					Static582.method8106();
					Static500.method7268(local39, true, local11, arg2, local30);
				}
				if (Static171.aClass16_5.method6080()) {
					@Pc(97) boolean local97 = true;
					try {
						local97 = Static38.aClass8_Sub15_1.anInt2575 > 256;
					} catch (@Pc(107) Throwable local107) {
					}
					@Pc(113) Class8_Sub30 local113;
					if (local97) {
						local113 = Static171.aClass16_5.method6112(146800640);
					} else {
						local113 = Static171.aClass16_5.method6112(104857600);
					}
					Static171.aClass16_5.method6096(local113);
				}
			} catch (@Pc(124) Throwable local124) {
				@Pc(129) int local129 = Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358();
				if (local129 == 2) {
					Static593.aBoolean729 = true;
				}
				Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_2, 0);
				method1286(arg0, local129, arg2);
				return;
			}
			if (local11 != null) {
				try {
					local11.method6063();
				} catch (@Pc(155) Throwable local155) {
				}
			}
		}
		Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6356(!arg0);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_2, arg1);
		Static613.method8352();
		Static171.aClass16_5.method6083();
		Static171.aClass16_5.X(32);
		Static3.aClass54_1 = Static171.aClass16_5.method6076();
		Static141.aClass54_3 = Static171.aClass16_5.method6076();
		Static45.method1364();
		Static171.aClass16_5.method6111(Static155.aClass8_Sub25_6.aClass36_Sub22_1.method7243() == 1);
		if (Static171.aClass16_5.method6077()) {
			Static38.method1275(Static155.aClass8_Sub25_6.aClass36_Sub29_1.method8472() == 1);
		}
		Static252.method4536(Static372.anInt7082 >> 3, Static218.anInt5023 >> 3, Static171.aClass16_5);
		Static364.method5679();
		Static226.aBoolean386 = true;
		Static497.aBoolean740 = false;
		Static196.aClass358Array1 = null;
		Static582.method8107();
	}
}

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public static int anInt5160;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_86 = new Class268(117, -2);

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
	public static final int[] anIntArray298 = new int[3];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILjava/awt/Canvas;Lclient!d;)Lclient!ha;")
	public static Class100 method4612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface4 arg3) {
		return new Class100_Sub2(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!ge;Ljava/lang/Object;)V")
	public static void method4613(@OriginalArg(1) Class112 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static179.method3254(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method4614(@OriginalArg(1) Class100 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static389.aBoolean497) {
			local7 = Static240.method4161();
			local9 = Static452.method6945();
		}
		arg0.KA(local7, local9, local7 + Static321.anInt6137, local9 + 350);
		arg0.aa(local7, local9, Static321.anInt6137, 350, Static406.anInt7522 << 24 | 0x332277, 1);
		Static347.method5621(local9 + 350, local7 + Static321.anInt6137, local9, local7);
		@Pc(58) int local58 = 350 / Static319.anInt6113;
		@Pc(70) int local70;
		if (Static162.anInt3372 > 0) {
			local70 = 346 - Static319.anInt6113 - 4;
			@Pc(80) int local80 = local70 * local58 / (Static162.anInt3372 + local58 - 1);
			@Pc(82) int local82 = 4;
			if (Static162.anInt3372 > 1) {
				local82 = (Static162.anInt3372 - Static276.anInt5428 - 1) * (local70 - local80) / (Static162.anInt3372 - 1) + 4;
			}
			arg0.aa(local7 + Static321.anInt6137 - 16, local82 + local9, 12, local80, Static406.anInt7522 << 24 | 0x332277, 2);
			for (@Pc(124) int local124 = Static276.anInt5428; local58 + Static276.anInt5428 > local124 && Static162.anInt3372 > local124; local124++) {
				@Pc(133) String[] local133 = Static513.method7614(Static85.aStringArray17[local124], '\b');
				@Pc(142) int local142 = (Static321.anInt6137 - 8 - 16) / local133.length;
				for (@Pc(144) int local144 = 0; local144 < local133.length; local144++) {
					@Pc(153) int local153 = local144 * local142 + 8;
					arg0.KA(local153 + local7, local9, local142 + local7 + local153 - 8, local9 - -350);
					Static43.aClass50_2.method5736(-16777216, local7 + local153, Static74.method1297(local133[local144]), local9 + 350 - Static319.anInt6113 * (local124 - Static276.anInt5428) - Static176.aClass133_45.anInt4190 - Static536.anInt9279 - 2, -1);
				}
			}
		}
		Static631.aClass50_12.method5735(Static321.anInt6137 + local7 - 25, "Build: 639", -16777216, -1, local9 + 330);
		arg0.KA(local7, local9, Static321.anInt6137 + local7, local9 - -350);
		arg0.method8790(local9 + 350 - Static536.anInt9279, Static321.anInt6137, -1, local7);
		Static173.aClass50_5.method5736(-16777216, local7 + 10, "--> " + Static74.method1297(Static489.aString98), local9 + 350 - Static31.aClass133_3.anInt4190 - 1, -1);
		if (!Static399.aBoolean503) {
			return;
		}
		local70 = -1;
		if (Static113.anInt2243 % 30 > 15) {
			local70 = 16777215;
		}
		arg0.method8782(local70, 12, local9 + 339 - Static31.aClass133_3.anInt4190, local7 + 10 + Static31.aClass133_3.method3643("--> " + Static74.method1297(Static489.aString98).substring(0, Static44.anInt872)));
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	public static void method4616(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static227.aClass128_12.method3560((long) arg0);
		if (local10 != null) {
			local10.aBoolean531 = !local10.aBoolean531;
			local10.aClass62_Sub1_1.method8467(local10.aBoolean531);
		}
	}
}

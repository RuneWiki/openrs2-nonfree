import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!bu;")
	public static Class32 aClass32_56;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt4692;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "Lclient!qj;")
	public static Class204 aClass204_7;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_71 = new Class217(78, -1);

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
	public static boolean aBoolean407 = true;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public static int anInt4693 = 0;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method3707() {
		if (Static191.anInt3830 == 0) {
			return;
		}
		try {
			if (++Static303.anInt5422 > 1500) {
				if (Static88.aClass251_2 != null) {
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
				}
				if (Static109.anInt2416 >= 1) {
					Static191.anInt3830 = 0;
					Static97.anInt2201 = -5;
					return;
				}
				if (Static339.anInt5769 == Static192.anInt3847) {
					Static192.anInt3847 = Static312.anInt5519;
				} else {
					Static192.anInt3847 = Static339.anInt5769;
				}
				Static191.anInt3830 = 1;
				Static303.anInt5422 = 0;
				Static109.anInt2416++;
			}
			if (Static191.anInt3830 == 1) {
				Static274.aClass43_8 = Static66.aClass143_2.method3390(Static192.anInt3847, Static241.aString38);
				Static191.anInt3830 = 2;
			}
			@Pc(112) int local112;
			if (Static191.anInt3830 == 2) {
				if (Static274.aClass43_8.anInt1521 == 2) {
					throw new IOException();
				}
				if (Static274.aClass43_8.anInt1521 != 1) {
					return;
				}
				Static88.aClass251_2 = new Class251((Socket) Static274.aClass43_8.anObject3, Static66.aClass143_2);
				Static274.aClass43_8 = null;
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
				Static349.method4648();
				local112 = Static88.aClass251_2.method5349();
				Static349.method4648();
				if (local112 != 101) {
					Static97.anInt2201 = local112;
					Static191.anInt3830 = 0;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
					return;
				}
				Static191.anInt3830 = 3;
			}
			if (Static191.anInt3830 == 3 && Static88.aClass251_2.method5348() >= 2) {
				local112 = Static88.aClass251_2.method5349() << 8 | Static88.aClass251_2.method5349();
				Static35.method719(local112);
				if (Static101.anInt6819 == -1) {
					Static191.anInt3830 = 0;
					Static97.anInt2201 = 6;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
				} else {
					Static191.anInt3830 = 0;
					Static88.aClass251_2.method5345();
					Static88.aClass251_2 = null;
					Static319.method1505();
				}
			}
		} catch (@Pc(179) IOException local179) {
			if (Static88.aClass251_2 != null) {
				Static88.aClass251_2.method5345();
				Static88.aClass251_2 = null;
			}
			if (Static109.anInt2416 < 1) {
				Static303.anInt5422 = 0;
				Static109.anInt2416++;
				if (Static339.anInt5769 == Static192.anInt3847) {
					Static192.anInt3847 = Static312.anInt5519;
				} else {
					Static192.anInt3847 = Static339.anInt5769;
				}
				Static191.anInt3830 = 1;
			} else {
				Static191.anInt3830 = 0;
				Static97.anInt2201 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZI)V")
	public static void method3708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(42) int local42 = local21 + local13 * (1 - local33);
		@Pc(51) int local51 = local17 - (local33 - 1) * local25;
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg0 << 1) - 3) * local25;
		@Pc(81) int local81 = local59;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (Static341.anInt5789 <= arg2 && arg2 <= Static309.anInt5495) {
			local95 = Static108.method1849(Static452.anInt7626, arg3 + arg1, Static82.anInt3956);
			local104 = Static108.method1849(Static452.anInt7626, arg1 - arg3, Static82.anInt3956);
			Static412.method5293(Static262.anIntArrayArray31[arg2], arg4, local104, local95);
		}
		@Pc(118) int local118 = local55 * (arg0 - 1);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local67;
					local51 += local81;
					local67 += local59;
					local81 += local59;
					local7++;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local42 += local67;
				local7++;
				local67 += local59;
				local81 += local59;
			}
			local42 += -local118;
			local51 += -local75;
			local118 -= local55;
			local9--;
			local75 -= local55;
			local95 = arg2 - local9;
			local104 = local9 + arg2;
			if (Static341.anInt5789 <= local104 && local95 <= Static309.anInt5495) {
				@Pc(212) int local212 = Static108.method1849(Static452.anInt7626, arg1 + local7, Static82.anInt3956);
				@Pc(220) int local220 = Static108.method1849(Static452.anInt7626, arg1 - local7, Static82.anInt3956);
				if (local95 >= Static341.anInt5789) {
					Static412.method5293(Static262.anIntArrayArray31[local95], arg4, local220, local212);
				}
				if (Static309.anInt5495 >= local104) {
					Static412.method5293(Static262.anIntArrayArray31[local104], arg4, local220, local212);
				}
			}
		}
	}
}

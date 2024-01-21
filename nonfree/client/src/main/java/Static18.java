import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!kc;")
	public static Class37 aClass37_9 = new Class37(100);

	@OriginalMember(owner = "client!e", name = "f", descriptor = "I")
	public static int anInt605 = 0;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	public static int anInt611 = 1;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_322 = Static23.method501("Private chat");

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_321 = aClass42_322;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!kc;")
	public static Class37 aClass37_10 = new Class37(50);

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!mc;")
	private static Class42 aClass42_329 = Static23.method501("M");

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_323 = aClass42_329;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_324 = Static23.method501("Chat panel redrawn");

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public static int anInt614 = 0;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!mc;")
	private static Class42 aClass42_325 = Static23.method501("button near the top of that page)3");

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_326 = Static23.method501("sideicons");

	@OriginalMember(owner = "client!e", name = "x", descriptor = "Lclient!mc;")
	private static Class42 aClass42_327 = Static23.method501("Could not complete login)3");

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_328 = aClass42_327;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public static int anInt615 = 0;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_330 = aClass42_325;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIIII[Lclient!ba;Lclient!ed;IIII)V")
	public static void method424(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6[] arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method1190();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method1190();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(45) int local45 = local26 & 0x3F;
				@Pc(51) int local51 = local26 >> 6 & 0x3F;
				@Pc(55) int local55 = local26 >> 12;
				@Pc(61) int local61 = local10.method1186();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (arg2 == local55 && arg3 <= local51 && arg3 + 8 > local51 && arg8 <= local45 && local45 < arg8 + 8) {
					@Pc(100) Class1_Sub1_Sub9 local100 = Static42.method1755(local12);
					@Pc(119) int local119 = Static30.method572(local45 & 0x7, local69, arg4, local100.anInt1279, local100.anInt1276, local51 & 0x7) + arg9;
					@Pc(136) int local136 = arg7 + Static50.method1196(local100.anInt1276, local100.anInt1279, local69, local51 & 0x7, arg4, local45 & 0x7);
					if (local119 > 0 && local136 > 0 && local119 < 103 && local136 < 103) {
						@Pc(154) int local154 = arg1;
						@Pc(156) Class6 local156 = null;
						if ((Static61.aByteArrayArrayArray7[1][local119][local136] & 0x2) == 2) {
							local154 = arg1 - 1;
						}
						if (local154 >= 0) {
							local156 = arg5[local154];
						}
						Static3.method99(local65, local156, local136, local119, arg4 + local69 & 0x3, arg1, local12, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BIB)Lclient!mc;")
	public static Class42 method425(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class42 local7 = new Class42();
		local7.aByteArray17 = new byte[arg2];
		local7.anInt1468 = 0;
		for (@Pc(21) int local21 = arg0; local21 < arg0 + arg2; local21++) {
			if (arg1[local21] != 0) {
				local7.aByteArray17[local7.anInt1468++] = arg1[local21];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method426() {
		aClass42_329 = null;
		aClass42_326 = null;
		aClass37_9 = null;
		aClass42_327 = null;
		aClass42_325 = null;
		aClass42_323 = null;
		aClass42_328 = null;
		aClass37_10 = null;
		aClass42_324 = null;
		aClass42_322 = null;
		aClass42_330 = null;
		aClass42_321 = null;
	}
}

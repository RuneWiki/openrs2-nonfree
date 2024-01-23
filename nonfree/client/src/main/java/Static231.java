import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public static int anInt4770 = -2;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public static int anInt4771 = 0;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
	public static int anInt4776 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZLclient!nk;)V")
	public static void method3884(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub3_Sub5 arg1) {
		@Pc(10) int local10;
		if (Static60.aBoolean106 || arg0) {
			local10 = Static20.anInt1235;
			@Pc(16) int local16 = local10 * 956 / 503;
			Static286.aClass2_Sub3_Sub1_11.method4363((Static257.anInt5343 - local16) / 2, 0, local16, local10);
			Static268.aClass71_1.method4629(Static257.anInt5343 / 2 - Static268.aClass71_1.anInt5766 / 2, 18);
		}
		arg1.method3308(Static58.aString67, Static257.anInt5343 / 2, Static20.anInt1235 / 2 - 26, 16777215, -1);
		local10 = Static20.anInt1235 / 2 - 18;
		if (Static60.aBoolean106) {
			Static94.method1756(Static257.anInt5343 / 2 - 152, local10, 304, 34, 9179409);
			Static94.method1756(Static257.anInt5343 / 2 - 151, local10 + 1, 302, 32, 0);
			Static94.method1758(Static257.anInt5343 / 2 - 150, local10 + 2, Static153.anInt3237 * 3, 30, 9179409);
			Static94.method1758(Static257.anInt5343 / 2 + Static153.anInt3237 * 3 - 150, local10 + 2, 300 - Static153.anInt3237 * 3, 30, 0);
		} else {
			Static160.method2782(Static257.anInt5343 / 2 - 152, local10, 304, 34, 9179409);
			Static160.method2782(Static257.anInt5343 / 2 - 151, local10 + 1, 302, 32, 0);
			Static160.method2788(Static257.anInt5343 / 2 - 150, local10 + 2, Static153.anInt3237 * 3, 30, 9179409);
			Static160.method2788(Static257.anInt5343 / 2 + Static153.anInt3237 * 3 - 150, local10 - -2, 300 - Static153.anInt3237 * 3, 30, 0);
		}
		arg1.method3308(Static125.aString275, Static257.anInt5343 / 2, Static20.anInt1235 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)V")
	public static void method3885(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub3_Sub16 local14 = Static119.method2204(arg0, 4);
		local14.method2719();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!vl;)V")
	public static void method3886(@OriginalArg(1) Class177 arg0) {
		Static105.anInt2269 = 3;
		Static255.method4118(true);
		Static102.aBoolean176 = true;
		Static233.aBoolean407 = true;
		Static106.aBoolean183 = true;
		Static284.aBoolean475 = true;
		Static242.aBoolean414 = true;
		Static144.anInt3122 = 127;
		Static183.aBoolean332 = true;
		Static126.aBoolean211 = true;
		Static43.aBoolean77 = true;
		Static84.anInt817 = 0;
		Static56.aBoolean96 = true;
		Static287.anInt5952 = 0;
		Static195.anInt4041 = 2;
		Static267.anInt4121 = 0;
		Static96.aBoolean166 = true;
		Static214.anInt4468 = 127;
		Static91.anInt2030 = 255;
		@Pc(46) Class110 local46 = null;
		Static163.anInt3419 = 0;
		Static150.aBoolean262 = true;
		if (Static171.anInt3655 >= 96) {
			Static179.method3100(2);
		} else {
			Static179.method3100(0);
		}
		Static171.anInt3648 = 0;
		Static133.aBoolean220 = false;
		Static246.aBoolean422 = true;
		Static97.aBoolean169 = false;
		Static2.anInt5946 = 0;
		Static225.anInt4698 = 0;
		Static236.aBoolean408 = false;
		try {
			@Pc(78) Class28 local78 = arg0.method4685("runescape");
			while (local78.anInt726 == 0) {
				Static134.method2329(1L);
			}
			if (local78.anInt726 == 1) {
				local46 = (Class110) local78.anObject2;
				@Pc(102) int local102 = 0;
				@Pc(108) byte[] local108 = new byte[(int) local46.method2679()];
				while (local108.length > local102) {
					@Pc(123) int local123 = local46.method2682(local108, local102, local108.length - local102);
					if (local123 == -1) {
						throw new IOException("EOF");
					}
					local102 += local123;
				}
				Static269.method4486(new Class2_Sub26(local108));
			}
		} catch (@Pc(145) Exception local145) {
		}
		try {
			if (local46 != null) {
				local46.method2681();
			}
		} catch (@Pc(154) Exception local154) {
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!jd;)I")
	public static int method3887(@OriginalArg(1) Class84 arg0) {
		@Pc(6) int local6 = 0;
		if (arg0.method2138(Static39.anInt945)) {
			local6++;
		}
		if (arg0.method2138(Static277.anInt5749)) {
			local6++;
		}
		return local6;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
	public static void method3888(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub16 local10 = Static119.method2204(arg0, 12);
		local10.method2719();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
	public static int method3889() {
		return Static17.anInt419;
	}
}

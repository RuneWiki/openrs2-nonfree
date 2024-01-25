import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!mo;")
	public static Class143 aClass143_61;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public static int anInt2814;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public static int anInt2813 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
	public static int method2676(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	public static void method2677() {
		@Pc(5) byte local5 = 0;
		if (Static9.aBoolean10) {
			local5 = 55;
		}
		Static75.method1893(local5);
		Static100.method2246(local5);
		Static279.method4726(local5);
		Static312.method5389(local5);
		Static58.method1312(local5);
		Static39.method983(local5);
		Static290.method4972(local5);
		Static173.method3377(local5);
		Static29.method4223(local5);
		if (Static302.anInt5842 == 10) {
			Static67.method1662(28);
		} else if (Static302.anInt5842 == 30) {
			Static67.method1662(25);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!jd;Z)V")
	public static void method2678(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub3_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt5928 > Static153.anInt3257) {
			Static192.method3657(arg1);
		} else if (Static153.anInt3257 > arg1.anInt5971) {
			Static50.method1216(arg1, false);
			local9 = anInt2814;
			local7 = Static141.anInt2989;
		} else {
			Static244.method4284(arg1);
		}
		if (arg1.anInt5910 < 128 || arg1.anInt5908 < 128 || (Static195.anInt3965 - 1) * 128 <= arg1.anInt5910 || Static298.anInt5716 * 128 - 128 <= arg1.anInt5908) {
			arg1.anInt5928 = 0;
			arg1.anInt5957 = -1;
			arg1.anInt5961 = -1;
			arg1.anInt5971 = 0;
			arg1.anInt5910 = arg1.anIntArray535[0] * 128 + arg1.method5353() * 64;
			arg1.anInt5908 = arg1.anIntArray536[0] * 128 + arg1.method5353() * 64;
			arg1.method5360();
		}
		if (arg1 == Static173.aClass10_Sub3_Sub3_Sub2_1 && (arg1.anInt5910 < 1536 || arg1.anInt5908 < 1536 || Static195.anInt3965 * 128 - 1536 <= arg1.anInt5910 || arg1.anInt5908 >= (Static298.anInt5716 - 12) * 128)) {
			arg1.anInt5957 = -1;
			arg1.anInt5928 = 0;
			arg1.anInt5961 = -1;
			arg1.anInt5971 = 0;
			arg1.anInt5910 = arg1.anIntArray535[0] * 128 + arg1.method5353() * 64;
			arg1.anInt5908 = arg1.anIntArray536[0] * 128 + arg1.method5353() * 64;
			arg1.method5360();
		}
		@Pc(199) int local199 = Static100.method2241(arg1);
		Static347.method5908(arg1, local199, local9, local7);
		Static271.method4611(arg1);
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
	public static void method2679() {
		if (Static108.anInt2423 == 0) {
			return;
		}
		try {
			if (++Static309.anInt5892 > 2000) {
				if (Static138.aClass159_3 != null) {
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
				}
				if (Static68.anInt1635 >= 1) {
					Static57.anInt1379 = -5;
					Static108.anInt2423 = 0;
					return;
				}
				if (Static109.anInt2429 == Static165.anInt5083) {
					Static109.anInt2429 = Static273.anInt5185;
				} else {
					Static109.anInt2429 = Static165.anInt5083;
				}
				Static309.anInt5892 = 0;
				Static108.anInt2423 = 1;
				Static68.anInt1635++;
			}
			if (Static108.anInt2423 == 1) {
				Static281.aClass205_10 = Static105.aClass15_2.method284(Static46.aString46, Static109.anInt2429);
				Static108.anInt2423 = 2;
			}
			@Pc(120) int local120;
			if (Static108.anInt2423 == 2) {
				if (Static281.aClass205_10.anInt6370 == 2) {
					throw new IOException();
				}
				if (Static281.aClass205_10.anInt6370 != 1) {
					return;
				}
				Static138.aClass159_3 = new Class159((Socket) Static281.aClass205_10.anObject7, Static105.aClass15_2);
				Static281.aClass205_10 = null;
				Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				local120 = Static138.aClass159_3.method4086();
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				if (local120 != 21) {
					Static57.anInt1379 = local120;
					Static108.anInt2423 = 0;
					Static138.aClass159_3.method4079();
					Static138.aClass159_3 = null;
					return;
				}
				Static108.anInt2423 = 3;
			}
			if (Static108.anInt2423 == 3) {
				if (Static138.aClass159_3.method4083() < 1) {
					return;
				}
				Static16.aStringArray10 = new String[Static138.aClass159_3.method4086()];
				Static108.anInt2423 = 4;
			}
			if (Static108.anInt2423 == 4 && Static138.aClass159_3.method4083() >= Static16.aStringArray10.length * 8) {
				Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
				Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, Static16.aStringArray10.length * 8, 0);
				for (local120 = 0; local120 < Static16.aStringArray10.length; local120++) {
					Static16.aStringArray10[local120] = Static305.method5317(Static30.aClass14_Sub4_Sub2_1.method2516());
				}
				Static57.anInt1379 = 21;
				Static108.anInt2423 = 0;
				Static138.aClass159_3.method4079();
				Static138.aClass159_3 = null;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static138.aClass159_3 != null) {
				Static138.aClass159_3.method4079();
				Static138.aClass159_3 = null;
			}
			if (Static68.anInt1635 >= 1) {
				Static57.anInt1379 = -4;
				Static108.anInt2423 = 0;
			} else {
				Static108.anInt2423 = 1;
				if (Static109.anInt2429 == Static165.anInt5083) {
					Static109.anInt2429 = Static273.anInt5185;
				} else {
					Static109.anInt2429 = Static165.anInt5083;
				}
				Static309.anInt5892 = 0;
				Static68.anInt1635++;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	public static void method2680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		if (Static205.anInt4115 == 2) {
			Static112.anInt2486 = local3;
			Static295.anInt5672 = 0;
			Static249.anInt4824 = local7;
		}
		Static94.aFloat42 = local7;
		Static274.aFloat100 = local3;
		Static235.method4146();
		Static72.aBoolean114 = true;
	}
}

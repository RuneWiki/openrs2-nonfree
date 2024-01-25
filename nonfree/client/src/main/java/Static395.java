import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_46 = new Class330(5);

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	public static int anInt7184 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public static void method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass15_Sub1_2 != null) {
			local7.aClass15_Sub1_2 = null;
		}
		if (local7.aClass15_Sub1_1 != null) {
			local7.aClass15_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method5728(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static219.method3491(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0.charAt(local30) != arg1; local30++) {
			}
			local15[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg0.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIB)V")
	public static void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			Static534.method7063(Static336.aClass316_75);
		}
		if (arg2 == 1) {
			Static534.method7063(Static175.aClass316_40);
		}
		Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
		Static340.aClass6_Sub12_Sub2_1.method6058(arg0 + Static154.anInt2878);
		Static340.aClass6_Sub12_Sub2_1.method6053(Static150.anInt2792 + arg1);
		Static567.anInt9818 = arg1;
		Static243.aBoolean327 = false;
		Static542.anInt9320 = arg0;
		Static398.method5755();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)I")
	public static int method5731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static80.anIntArray125[arg1 & 0x3] : Static239.anIntArray364[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg3) {
			Static359.method7519(arg4, arg3, arg6, arg2, arg5, arg0);
		} else if (Static529.anInt9806 <= arg4 - arg3 && Static205.anInt3906 >= arg4 + arg3 && arg5 - arg1 >= Static133.anInt2531 && arg5 + arg1 <= Static52.anInt1226) {
			Static299.method4521(arg3, arg1, arg5, arg2, arg4, arg0, arg6);
		} else {
			Static319.method3302(arg1, arg6, arg5, arg0, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method5733() {
		if (Static402.anInt7273 == 0) {
			return;
		}
		try {
			if (++Static516.anInt8870 > 2000) {
				if (Static354.aClass1_1 != null) {
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
				}
				if (Static500.anInt8692 >= 2) {
					Static402.anInt7273 = 0;
					Static331.anInt6271 = -5;
					return;
				}
				Static133.aClass297_3.method6804();
				Static516.anInt8870 = 0;
				Static402.anInt7273 = 1;
				Static500.anInt8692++;
			}
			if (Static402.anInt7273 == 1) {
				Static129.aClass224_3 = Static133.aClass297_3.method6800(Static174.aClass313_24);
				Static402.anInt7273 = 2;
			}
			if (Static402.anInt7273 == 2) {
				if (Static129.aClass224_3.anInt6632 == 2) {
					throw new IOException();
				}
				if (Static129.aClass224_3.anInt6632 != 1) {
					return;
				}
				Static354.aClass1_1 = Static473.method6561((Socket) Static129.aClass224_3.anObject14);
				Static129.aClass224_3 = null;
				Static354.aClass1_1.method53(Static340.aClass6_Sub12_Sub2_1.aByteArray97, Static340.aClass6_Sub12_Sub2_1.anInt7556);
				Static402.anInt7273 = 4;
			}
			@Pc(123) int local123;
			if (Static402.anInt7273 == 4) {
				if (!Static354.aClass1_1.method49(1)) {
					return;
				}
				Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				local123 = Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF;
				if (local123 != 21) {
					Static402.anInt7273 = 0;
					Static331.anInt6271 = local123;
					Static354.aClass1_1.method50();
					Static354.aClass1_1 = null;
					return;
				}
				Static402.anInt7273 = 5;
			}
			if (Static402.anInt7273 == 5) {
				if (!Static354.aClass1_1.method49(1)) {
					return;
				}
				Static354.aClass1_1.method52(1, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				Static402.anInt7273 = 6;
				Static109.aStringArray17 = new String[Static429.aClass6_Sub12_Sub2_2.aByteArray97[0] & 0xFF];
			}
			if (Static402.anInt7273 == 6) {
				if (!Static354.aClass1_1.method49(Static109.aStringArray17.length * 8)) {
					return;
				}
				Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
				Static354.aClass1_1.method52(Static109.aStringArray17.length * 8, 0, Static429.aClass6_Sub12_Sub2_2.aByteArray97);
				for (local123 = 0; local123 < Static109.aStringArray17.length; local123++) {
					Static109.aStringArray17[local123] = Static383.method5604(Static429.aClass6_Sub12_Sub2_2.method6016());
				}
				Static402.anInt7273 = 0;
				Static331.anInt6271 = 21;
				Static354.aClass1_1.method50();
				Static354.aClass1_1 = null;
				return;
			}
		} catch (@Pc(225) IOException local225) {
			if (Static354.aClass1_1 != null) {
				Static354.aClass1_1.method50();
				Static354.aClass1_1 = null;
			}
			if (Static500.anInt8692 >= 2) {
				Static331.anInt6271 = -4;
				Static402.anInt7273 = 0;
			} else {
				Static133.aClass297_3.method6804();
				Static500.anInt8692++;
				Static402.anInt7273 = 1;
				Static516.anInt8870 = 0;
			}
		}
	}
}

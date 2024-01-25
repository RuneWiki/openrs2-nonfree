import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "Lclient!da;")
	public static Class59 aClass59_9;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!gga;BLclient!d;)Lclient!ha;")
	public static Class101 method7228(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(4) Interface3 arg3) {
		if (!Static230.method4173()) {
			throw new RuntimeException("");
		} else if (Static91.method1580("jaggl")) {
			@Pc(31) OpenGL local31 = new OpenGL();
			@Pc(41) long local41 = local31.init(arg1, 8, 8, 8, 24, 0, arg0);
			if (local41 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(62) Class101_Sub1_Sub1 local62 = new Class101_Sub1_Sub1(local31, arg1, local41, arg3, arg2, arg0);
			local62.method5899();
			return local62;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	public static int method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static669.aByteArrayArray27 == null ? 0 : Static669.aByteArrayArray27[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!uf;IIJLclient!aa;II)V")
	public static void method7230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class357 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg3 * arg3 + arg4 * arg4;
		if (arg5 < (long) local16) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg2.anInt10395 / 2, arg2.anInt10465 / 2);
		if (local36 * local36 >= local16) {
			Static131.method2330(arg2, arg0, arg6, arg1, arg4, arg3, Static249.aClass71Array24[arg7]);
			return;
		}
		local36 -= 10;
		@Pc(66) int local66;
		if (Static484.anInt8685 == 4) {
			local66 = (int) Static278.aFloat108 & 0x3FFF;
		} else {
			local66 = Static275.anInt5119 + (int) Static278.aFloat108 & 0x3FFF;
		}
		@Pc(77) int local77 = Class12_Sub2.anIntArray204[local66];
		@Pc(81) int local81 = Class12_Sub2.anIntArray203[local66];
		if (Static484.anInt8685 != 4) {
			local81 = local81 * 256 / (Static199.anInt4199 + 256);
			local77 = local77 * 256 / (Static199.anInt4199 + 256);
		}
		@Pc(113) int local113 = local77 * arg4 + local81 * arg3 >> 14;
		@Pc(124) int local124 = arg4 * local81 - arg3 * local77 >> 14;
		@Pc(130) double local130 = Math.atan2((double) local113, (double) local124);
		@Pc(137) int local137 = (int) ((double) local36 * Math.sin(local130));
		@Pc(144) int local144 = (int) ((double) local36 * Math.cos(local130));
		Static591.aClass71Array40[arg7].method7688((float) local137 + (float) arg0 + (float) arg2.anInt10395 / 2.0F, (float) -local144 + (float) arg1 + (float) arg2.anInt10465 / 2.0F, 4096, (int) (-local130 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V")
	public static void method7231() {
		if (Static396.aClass249_1 != null) {
			Static396.aClass249_1.method6633();
		}
		if (Static148.aThread4 == null) {
			return;
		}
		while (true) {
			try {
				Static148.aThread4.join();
				break;
			} catch (@Pc(14) InterruptedException local14) {
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V")
	public static void method7233() {
		if (Static72.aString14.toLowerCase().indexOf("microsoft") != -1) {
			Static636.anIntArray575[192] = 58;
			Static636.anIntArray575[221] = 43;
			Static636.anIntArray575[189] = 26;
			Static636.anIntArray575[223] = 28;
			Static636.anIntArray575[187] = 27;
			Static636.anIntArray575[186] = 57;
			Static636.anIntArray575[190] = 72;
			Static636.anIntArray575[191] = 73;
			Static636.anIntArray575[219] = 42;
			Static636.anIntArray575[222] = 59;
			Static636.anIntArray575[220] = 74;
			Static636.anIntArray575[188] = 71;
			return;
		}
		Static636.anIntArray575[91] = 42;
		Static636.anIntArray575[47] = 73;
		Static636.anIntArray575[44] = 71;
		Static636.anIntArray575[61] = 27;
		Static636.anIntArray575[93] = 43;
		Static636.anIntArray575[92] = 74;
		Static636.anIntArray575[59] = 57;
		Static636.anIntArray575[45] = 26;
		Static636.anIntArray575[46] = 72;
		if (Static72.aMethod2 == null) {
			Static636.anIntArray575[192] = 58;
			Static636.anIntArray575[222] = 59;
		} else {
			Static636.anIntArray575[222] = 58;
			Static636.anIntArray575[520] = 59;
			Static636.anIntArray575[192] = 28;
		}
	}

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "(I)V")
	public static void method7234() {
		@Pc(12) Class182 local12 = null;
		try {
			local12 = Static72.method1318("2");
			@Pc(26) Class2_Sub8 local26 = new Class2_Sub8(Static195.anInt4137 * 6 + 3);
			local26.method5170(1);
			local26.method5192(Static195.anInt4137);
			for (@Pc(36) int local36 = 0; local36 < Static100.anIntArray75.length; local36++) {
				if (Static546.aBooleanArray56[local36]) {
					local26.method5192(local36);
					local26.method5194(Static100.anIntArray75[local36]);
				}
			}
			local12.method4767(local26.lb, local26.anInt5725, 0);
		} catch (@Pc(71) Exception local71) {
		}
		try {
			if (local12 != null) {
				local12.method4769();
			}
		} catch (@Pc(78) Exception local78) {
		}
		Static339.aLong167 = Static99.method1701();
		Static25.aBoolean24 = false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZ)I")
	public static int method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class2_Sub42 local15 = Static47.method979(arg2, arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray351.length; local29++) {
				if (arg1 == local15.anIntArray350[local29]) {
					local27 += local15.anIntArray351[local29];
				}
			}
			return local27;
		}
	}
}

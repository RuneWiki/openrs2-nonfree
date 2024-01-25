import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!ko;")
	public static final Class179 aClass179_23 = new Class179();

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
	public static int anInt7199 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method5686(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static401.aClass284_116.anInt8049 = 1;
		@Pc(11) String local11 = arg4.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(26) Class41 local26 = Static106.aClass27_1.method483(arg5);
			if (local26 == null || local26.method1208() != arg2) {
				return;
			}
			if (local26.method1208()) {
				local18 = local26.aString27;
			} else {
				local16 = local26.anInt1311;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static272.aClass121_2.anInt4085; local58++) {
			@Pc(65) Class133 local65 = Static272.aClass121_2.method3327(local58);
			if ((!arg0 || local65.aBoolean289) && local65.anInt4388 == -1 && local65.anInt4440 == -1 && local65.anInt4393 == 0 && local65.aString106.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg2) {
						if (!arg3.equals(local65.method3550(arg5, local18))) {
							continue;
						}
					} else if (arg1 != local65.method3549(local16, arg5)) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static214.aShortArray72 = null;
					Static121.anInt2822 = -1;
					return;
				}
				if (local56 >= local14.length) {
					@Pc(142) short[] local142 = new short[local14.length * 2];
					for (@Pc(144) int local144 = 0; local144 < local56; local144++) {
						local142[local144] = local14[local144];
					}
					local14 = local142;
				}
				local14[local56++] = (short) local58;
			}
		}
		Static121.anInt2822 = local56;
		Static495.anInt8603 = 0;
		Static214.aShortArray72 = local14;
		@Pc(188) String[] local188 = new String[Static121.anInt2822];
		for (@Pc(190) int local190 = 0; local190 < Static121.anInt2822; local190++) {
			local188[local190] = Static272.aClass121_2.method3327(local14[local190]).aString106;
		}
		Static524.method7241(local188, Static214.aShortArray72);
		Static401.aClass284_116.method6334();
		Static401.aClass284_116.anInt8049 = 2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)[Lclient!ws;")
	public static Class364[] method5688() {
		return new Class364[] { Static188.aClass364_12, Static67.aClass364_7, Static549.aClass364_20, Static151.aClass364_9, Static65.aClass364_6, Static557.aClass364_17, Static173.aClass364_10, Static286.aClass364_15, Static570.aClass364_21, Static185.aClass364_11, Static217.aClass364_13, Static451.aClass364_18, Static495.aClass364_19, Static242.aClass364_14, Static86.aClass364_8 };
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method5689() {
		if (Static172.aFileOutputStream1 != null) {
			try {
				Static172.aFileOutputStream1.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static172.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
	public static int method5690(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}

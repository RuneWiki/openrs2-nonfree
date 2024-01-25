import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "Lclient!ui;")
	public static Class230 aClass230_84;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_216 = new Class48(79, 8);

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Z")
	public static boolean aBoolean568 = false;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!nb;)V")
	public static void method5310(@OriginalArg(0) Class1_Sub27_Sub1 arg0) {
		if (Static164.anInt2967 >= 65535) {
			return;
		}
		Static300.aClass1_Sub27_Sub1Array3[Static164.anInt2967] = arg0;
		Static43.aBooleanArray3[Static164.anInt2967] = false;
		Static164.anInt2967++;
		@Pc(18) int local18 = arg0.anInt3881;
		if (arg0.aBoolean382) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt3881;
		if (arg0.aBoolean383) {
			local26 = Static337.anInt5599 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt3873 + Static276.anInt5131 - arg0.anInt3868 >> Static365.anInt5876;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt3873 + arg0.anInt3868 - Static276.anInt5131 >> Static365.anInt5876;
			if (local66 >= Static230.anInt6113) {
				local66 = Static230.anInt6113 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray92[local38++];
				@Pc(96) int local96 = (arg0.anInt3874 + Static276.anInt5131 - arg0.anInt3868 >> Static365.anInt5876) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static19.anInt329) {
					local104 = Static19.anInt329 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static295.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static295.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt2967;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static295.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt2967 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static295.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt2967 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static295.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static164.anInt2967 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!ng;Lclient!cp;Ljava/awt/Canvas;IZ)Lclient!tq;")
	public static synchronized Class164 method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static142.aBooleanArray14[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(47) Class164 local47;
		if (arg0 == 0) {
			local47 = Static132.method1939(arg2, arg3, local7);
		} else if (arg0 == 1) {
			local47 = Static338.method4828(arg4, local7, arg1, arg3, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static142.aBooleanArray14[local7] = true;
		return local47;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLclient!ui;)V")
	public static void method5356(@OriginalArg(1) Class230 arg0) {
		aClass230_84 = arg0;
	}
}

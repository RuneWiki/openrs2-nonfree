import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nr", name = "V", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!nr", name = "X", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "Lclient!fr;")
	public static Class85 aClass85_30 = new Class85();

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "[I")
	public static final int[] anIntArray422 = new int[4096];

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(B)V")
	public static void method3688() {
		Static253.aClass51_7.UA(Static312.anInt5171, Static130.aClass153_Sub1_1.aBoolean343 ? Static295.anInt4913 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class270 local13 = local7.aClass270_1; local13 != null; local13 = local13.aClass270_3) {
			@Pc(17) Class26_Sub2 local17 = local13.aClass26_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort105 == arg1 && local17.aShort103 == arg2) {
				Static391.method4978(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!rm;IIII)V")
	public static void method3691(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static208.method2994(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static264.anInt4480) {
			Static208.method2994(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static208.method2994(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static295.anInt4910) {
			Static208.method2994(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static295.anInt4910) {
			Static208.method2994(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static264.anInt4480 && arg4 <= Static295.anInt4910) {
			Static208.method2994(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static208.method2994(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static264.anInt4480 && arg4 > 0) {
			Static208.method2994(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIILclient!uc;)V")
	public static void method3692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26_Sub5 arg4) {
		@Pc(4) Class223 local4 = Static165.method2394(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt4196 = (arg1 << Static168.anInt3026) + Static297.anInt4923;
		arg4.anInt4190 = arg3;
		arg4.anInt4193 = (arg2 << Static168.anInt3026) + Static297.anInt4923;
		for (@Pc(28) Class270 local28 = local4.aClass270_1; local28 != null; local28 = local28.aClass270_3) {
			if (local28.aClass26_Sub2_2.aBoolean494) {
				@Pc(38) int local38 = local28.aClass26_Sub2_2.method5695();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt4190 += local8;
			arg4.aBoolean256 = true;
		} else if (local4.aClass26_Sub4_2 != null) {
			arg4.anInt4190 -= local4.aClass26_Sub4_2.aShort107;
		}
		local4.aClass26_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)Z")
	public static boolean method3694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10 = true;
		@Pc(16) Interface5 local16 = (Interface5) Static184.method2673(arg2, arg1, arg0);
		if (local16 != null) {
			local10 = Static323.method4285(local16) & true;
		}
		local16 = (Interface5) Static14.method152(arg2, arg1, arg0, gf.class);
		if (local16 != null) {
			local10 &= Static323.method4285(local16);
		}
		local16 = (Interface5) Static339.method4422(arg2, arg1, arg0);
		if (local16 != null) {
			local10 &= Static323.method4285(local16);
		}
		return local10;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3695(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static345.method4461(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static184.anInt3296; local29++) {
			@Pc(35) String local35 = Static193.aStringArray30[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static345.method4461(local35);
			if (local35 != null && local35.equals(local24)) {
				Static184.anInt3296--;
				for (@Pc(59) int local59 = local29; local59 < Static184.anInt3296; local59++) {
					Static193.aStringArray30[local59] = Static193.aStringArray30[local59 + 1];
					Static448.aStringArray53[local59] = Static448.aStringArray53[local59 + 1];
					Static37.anIntArray54[local59] = Static37.anIntArray54[local59 + 1];
					Static70.aStringArray6[local59] = Static70.aStringArray6[local59 + 1];
					Static123.anIntArray169[local59] = Static123.anIntArray169[local59 + 1];
					Static88.aBooleanArray5[local59] = Static88.aBooleanArray5[local59 + 1];
				}
				Static324.anInt5357 = Static90.anInt1865;
				Static81.method1414(Static52.aClass2_17);
				Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(arg0));
				Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
				return;
			}
		}
	}
}

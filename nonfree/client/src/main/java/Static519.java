import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
	public static final int[] anIntArray552 = new int[3];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method7015(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Z")
	public static boolean method7016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(20) Class342 local20 = Static441.aClass74_169.method2075(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local20.method7492(arg1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method7017() {
		@Pc(8) Class4_Sub5_Sub11 local8 = Static652.method8695(0L, 15);
		local8.method3956();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZI)Z")
	public static boolean method7019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method7020() {
		for (@Pc(10) Class4_Sub5_Sub12 local10 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local10 != null; local10 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
			if (local10.anInt4687 > 1) {
				local10.anInt4687 = 0;
				Static487.aClass352_11.method7655(((Class4_Sub5_Sub17) local10.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67).aLong225, local10);
				local10.aClass367_5.method8305();
			}
		}
		Static574.anInt8895 = 0;
		Static579.anInt8938 = 0;
		Static87.aClass163_14.method3643();
		Static205.aClass66_16.method1988();
		Static256.aClass367_3.method8305();
		Static333.aBoolean400 = false;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!es;Ljava/lang/String;)I")
	public static int method7021(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt10466;
		@Pc(10) byte[] local10 = Static500.method6804(arg1);
		arg0.method8847(local10.length);
		arg0.anInt10466 += Static678.aClass165_1.method3674(arg0.anInt10466, arg0.aByteArray107, 0, local10, local10.length);
		return arg0.anInt10466 - local6;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!kg;BI)V")
	public static void method7022(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt9945 > Static177.anInt3088) {
			Static567.method7512(arg0);
		} else if (arg0.anInt9987 >= Static177.anInt3088) {
			Static647.method8632(arg0);
		} else {
			Static507.method6916(false, arg0);
			local7 = Static451.anInt7048;
			local9 = Static470.anInt7477;
		}
		@Pc(113) int local113;
		if (arg0.anInt9925 < 512 || arg0.anInt9917 < 512 || arg0.anInt9925 >= (Static224.anInt3557 - 1) * 512 || (Static267.anInt4309 - 1) * 512 <= arg0.anInt9917) {
			local7 = -1;
			arg0.anInt9981 = -1;
			arg0.anInt9945 = 0;
			local9 = 0;
			arg0.anIntArray690 = null;
			arg0.anInt9987 = 0;
			arg0.anInt9925 = arg0.anIntArray693[0] * 512 + arg0.method8514() * 256;
			arg0.anInt9917 = arg0.anIntArray694[0] * 512 + arg0.method8514() * 256;
			arg0.method8516();
			for (local113 = 0; local113 < arg0.aClass78Array3.length; local113++) {
				arg0.aClass78Array3[local113].anInt2180 = -1;
			}
		}
		if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 == arg0 && (arg0.anInt9925 < 6144 || arg0.anInt9917 < 6144 || arg0.anInt9925 >= (Static224.anInt3557 - 12) * 512 || Static267.anInt4309 * 512 - 6144 <= arg0.anInt9917)) {
			arg0.anInt9945 = 0;
			arg0.anInt9987 = 0;
			local9 = 0;
			arg0.anIntArray690 = null;
			arg0.anInt9981 = -1;
			local7 = -1;
			arg0.anInt9925 = arg0.anIntArray693[0] * 512 + arg0.method8514() * 256;
			arg0.anInt9917 = arg0.anIntArray694[0] * 512 + arg0.method8514() * 256;
			arg0.method8516();
			for (local113 = 0; local113 < arg0.aClass78Array3.length; local113++) {
				arg0.aClass78Array3[local113].anInt2180 = -1;
			}
		}
		local113 = Static381.method3015(arg0);
		Static487.method1698(arg0);
		Static16.method296(arg0, local7, local113, local9);
		Static384.method4983(local7, arg0);
		Static220.method3257(arg0);
	}
}

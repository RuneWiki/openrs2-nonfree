import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
	public static int anInt9421;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
	public static int anInt9426;

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "[I")
	public static final int[] anIntArray517 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Z")
	public static boolean aBoolean674 = false;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Lclient!mo;")
	public static Class4_Sub2_Sub5 method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class4_Sub2_Sub5 local14 = local7.aClass4_Sub2_Sub5_1;
			local7.aClass4_Sub2_Sub5_1 = null;
			Static397.method5885(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!fea;I[[B)V")
	public static void method8126(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static511.aByteArrayArray22.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static312.anIntArray597[local10] >> 8) * 64 - Static565.anInt9560;
				@Pc(40) int local40 = (Static312.anIntArray597[local10] & 0xFF) * 64 - Static567.anInt9589;
				Static229.method3856();
				arg0.method2169(Static322.aClass352Array1, local40, Static213.aClass133_5, local16, local29);
			}
		}
	}
}

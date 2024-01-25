import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!j;")
	public static Class119 aClass119_3;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
	public static final int[] anIntArray642 = new int[4096];

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	public static int anInt5185 = 0;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean389 = true;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public static int anInt5187 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!dq;IILclient!bc;)Lclient!km;")
	public static synchronized Class82 method4473(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface1 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static2.aBooleanArray84[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(48) Class82 local48;
		if (arg1 == 0) {
			local48 = Static380.method5677(local7, arg4, arg0);
		} else if (arg1 == 1) {
			local48 = Static235.method3838(local7, arg3, arg4, arg2, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static2.aBooleanArray84[local7] = true;
		return local48;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILclient!qr;)V")
	public static void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class12_Sub1_Sub2_Sub2 arg2) {
		if (arg2.anInt5371 == arg0 && arg0 != -1) {
			@Pc(15) Class189 local15 = Static351.aClass175_3.method4107(arg0);
			@Pc(18) int local18 = local15.anInt5165;
			if (local18 == 1) {
				arg2.anInt5318 = 0;
				arg2.anInt5370 = 0;
				arg2.anInt5324 = 0;
				arg2.anInt5368 = 1;
				arg2.anInt5357 = arg1;
				Static369.method5563(arg2.aByte74, local15, Static267.aClass12_Sub1_Sub2_Sub2_1 == arg2, arg2.anInt6328, arg2.anInt6317, arg2.anInt5318);
			}
			if (local18 == 2) {
				arg2.anInt5324 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt5371 == -1 || Static351.aClass175_3.method4107(arg0).anInt5157 >= Static351.aClass175_3.method4107(arg2.anInt5371).anInt5157) {
			arg2.anInt5318 = 0;
			arg2.anInt5378 = arg2.anInt5380;
			arg2.anInt5357 = arg1;
			arg2.anInt5371 = arg0;
			arg2.anInt5324 = 0;
			arg2.anInt5370 = 0;
			arg2.anInt5368 = 1;
			if (arg2.anInt5371 != -1) {
				Static369.method5563(arg2.aByte74, Static351.aClass175_3.method4107(arg2.anInt5371), Static267.aClass12_Sub1_Sub2_Sub2_1 == arg2, arg2.anInt6328, arg2.anInt6317, arg2.anInt5318);
			}
		}
	}
}

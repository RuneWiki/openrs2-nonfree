import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "I")
	public static int anInt6801;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Lclient!ho;")
	public static Class103 aClass103_5;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString62 = null;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	public static int anInt6805 = 0;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "[I")
	public static final int[] anIntArray466 = new int[4];

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIB)V")
	public static void method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		if (arg3 < arg0) {
			for (local8 = arg3; local8 < arg0; local8++) {
				Static262.anIntArrayArray31[local8][arg1] = arg2;
			}
		} else {
			for (local8 = arg0; local8 < arg3; local8++) {
				Static262.anIntArrayArray31[local8][arg1] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIII)V")
	public static void method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg1 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		@Pc(84) int local84 = local52 * (arg1 - 1);
		Static412.method5293(Static262.anIntArrayArray31[arg2], arg3, arg0 - arg4, arg4 + arg0);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local78;
					local39 += local64;
					local7++;
					local78 += local56;
					local64 += local56;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local78;
				local7++;
				local78 += local56;
				local64 += local56;
			}
			local39 += -local84;
			local48 += -local72;
			local72 -= local52;
			local84 -= local52;
			local9--;
			@Pc(168) int local168 = arg2 - local9;
			@Pc(172) int local172 = arg2 + local9;
			@Pc(176) int local176 = arg0 + local7;
			@Pc(181) int local181 = arg0 - local7;
			Static412.method5293(Static262.anIntArrayArray31[local168], arg3, local181, local176);
			Static412.method5293(Static262.anIntArrayArray31[local172], arg3, local181, local176);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method5326(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static85.method1636(local13) : local13;
		} else if (arg1 instanceof Class79) {
			@Pc(27) Class79 local27 = (Class79) arg1;
			return local27.method4228();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIB)V")
	public static void method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static452.anInt7626 <= arg0 && arg4 <= Static82.anInt3956 && arg2 >= Static341.anInt5789 && arg1 <= Static309.anInt5495) {
			Static166.method2723(arg4, arg0, arg2, arg3, arg1);
		} else {
			Static89.method1672(arg3, arg1, arg2, arg4, arg0);
		}
	}
}

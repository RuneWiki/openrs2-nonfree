import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public static int anInt6694;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_57 = new Class126(4);

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_142 = new Class119(34, 6);

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_143 = new Class119(83, 3);

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIII)V")
	public static void method5233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static246.anInt4693; local8++) {
			@Pc(13) Rectangle local13 = Class7_Sub5_Sub1.aRectangleArray1[local8];
			if (arg2 < local13.width + local13.x && local13.x < arg3 + arg2 && arg1 < local13.height + local13.y && arg1 + arg0 > local13.y) {
				Static78.aBooleanArray11[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5236(@OriginalArg(1) String arg0) {
		return Static275.method3909(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	public static int method5237(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local30 != local44) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local12 == local44) {
				local58 = (local21 - local28) / (-local30 + local44);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(153) int local153 = (int) (local58 * 256.0D);
		@Pc(158) int local158 = (int) (local60 * 256.0D);
		@Pc(163) int local163 = (int) (local66 * 256.0D);
		if (local158 < 0) {
			local158 = 0;
		} else if (local158 > 255) {
			local158 = 255;
		}
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		if (local163 > 243) {
			local158 >>= 0x4;
		} else if (local163 > 217) {
			local158 >>= 0x3;
		} else if (local163 > 192) {
			local158 >>= 0x2;
		} else if (local163 > 179) {
			local158 >>= 0x1;
		}
		return (local158 >> 5 << 7) + ((local153 >> 2 & 0x3F) << 10) + (local163 >> 1);
	}
}

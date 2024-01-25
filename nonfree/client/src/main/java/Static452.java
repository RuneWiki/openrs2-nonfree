import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "J")
	public static long aLong234 = 0L;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt8608 = 0;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
	public static final int[] anIntArray500 = new int[3];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBIII)I")
	public static int method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static255.aClass115Array2 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(21) int local21 = arg4 >> 9;
			@Pc(25) int local25 = arg0 >> 9;
			if (arg2 < 0 || arg3 < 0 || Static338.anInt6508 - 1 < arg2 || arg3 > Static390.anInt7654 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static338.anInt6508 - 1 && Static390.anInt7654 - 1 >= local25) {
				@Pc(90) boolean local90 = (Static266.aByteArrayArrayArray10[1][arg4 >> 9][arg0 >> 9] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg4 & 0x1FF) == 0) {
					local115 = (Static266.aByteArrayArrayArray10[1][local21 - 1][arg0 >> 9] & 0x2) != 0;
					local131 = (Static266.aByteArrayArrayArray10[1][local21][arg0 >> 9] & 0x2) != 0;
					if (local131 != local115) {
						local90 = (Static266.aByteArrayArrayArray10[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x1FF) == 0) {
					local115 = (Static266.aByteArrayArrayArray10[1][arg4 >> 9][local25 - 1] & 0x2) != 0;
					local131 = (Static266.aByteArrayArrayArray10[1][arg4 >> 9][local25] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static266.aByteArrayArrayArray10[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if (local90) {
					arg1++;
				}
				return Static255.aClass115Array2[arg1].method8064(arg4, arg0);
			} else {
				return 0;
			}
		} else {
			return Static255.aClass115Array2[arg1].method8064(arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method6640() {
		Static291.anInt5976 = 0;
		Static384.anInt7552 = -1;
		Static226.anInt4729 = -1;
		Static433.anInt8342 = -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method6641() {
		if (Static514.aFrame2 != null) {
			return;
		}
		@Pc(10) int local10 = Static7.anInt723;
		@Pc(12) int local12 = Static347.anInt6686;
		@Pc(20) int local20 = Static308.anInt6203 - local10 - Static123.anInt9150;
		@Pc(28) int local28 = Static507.anInt9504 - local12 - Static71.anInt1872;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static402.aFrame3 != null) {
				local53 = Static402.aFrame3;
			} else if (Static589.anApplet2 == null) {
				local53 = Static220.anApplet_Sub1_2;
			} else {
				local53 = Static589.anApplet2;
			}
			@Pc(63) int local63 = 0;
			@Pc(65) int local65 = 0;
			if (local53 == Static402.aFrame3) {
				@Pc(71) Insets local71 = Static402.aFrame3.getInsets();
				local65 = local71.top;
				local63 = local71.left;
			}
			@Pc(80) Graphics local80 = local53.getGraphics();
			local80.setColor(Color.black);
			if (local10 > 0) {
				local80.fillRect(local63, local65, local10, Static507.anInt9504);
			}
			if (local12 > 0) {
				local80.fillRect(local63, local65, Static308.anInt6203, local12);
			}
			if (local20 > 0) {
				local80.fillRect(Static308.anInt6203 + local63 - local20, local65, local20, Static507.anInt9504);
			}
			if (local28 > 0) {
				local80.fillRect(local63, local65 + Static507.anInt9504 - local28, Static308.anInt6203, local28);
				return;
			}
		} catch (@Pc(132) Exception local132) {
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public static boolean method6642(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_96 = new Class136(4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)B")
	public static byte method6825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
	public static boolean method6852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!e;ILclient!pfa;ILjava/awt/Canvas;I)Lclient!oa;")
	public static synchronized Class14 method6855(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return Static246.method4248(false, arg0, arg3);
		} else if (arg2 == 2) {
			return Static510.method7078(arg3, arg0);
		} else if (arg2 == 4) {
			return Static246.method4248(true, arg0, arg3);
		} else if (arg2 == 1) {
			return Static512.method7103(arg4, arg0, arg3);
		} else if (arg2 == 5) {
			return Static326.method5132(arg1, arg0, arg3, arg4);
		} else if (arg2 == 3) {
			return Static609.method6725(arg4, arg3, arg1, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
	public static void method6860() {
		for (@Pc(12) int local12 = 0; local12 < Static559.anInt9221; local12++) {
			@Pc(18) Class39 local18 = Static546.aClass39Array1[local12];
			if (local18.aByte21 == 3) {
				if (local18.aClass6_Sub18_Sub1_1 == null) {
					local18.anInt1134 = Integer.MIN_VALUE;
				} else {
					Static374.aClass6_Sub18_Sub4_2.method6380(local18.aClass6_Sub18_Sub1_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I")
	public static int method6903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static355.method6096(arg0 + 45365, 4, arg1 + 91923) + (Static355.method6096(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static355.method6096(arg0, 1, arg1) + -128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}
}

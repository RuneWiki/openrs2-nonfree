import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public static int anInt7202;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public static int anInt7203;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Lclient!qg;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public static int anInt7210;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ph;Lclient!ph;I)I")
	public static int method5678(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class187 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method4282(Static337.anInt5681)) {
			local5++;
		}
		if (arg0.method4282(Static95.anInt1954)) {
			local5++;
		}
		if (arg0.method4282(Static369.anInt6376)) {
			local5++;
		}
		if (arg1.method4282(Static337.anInt5681)) {
			local5++;
		}
		if (arg1.method4282(Static95.anInt1954)) {
			local5++;
		}
		if (arg1.method4282(Static369.anInt6376)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!lt;Ljava/awt/Frame;I)V")
	public static void method5679(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class270 local10 = arg0.method3517(arg1);
			while (local10.anInt7548 == 0) {
				Static328.method5696(10L);
			}
			if (local10.anInt7548 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static328.method5696(100L);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!gh;II)V")
	public static void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aByte19 == 0) {
			arg1.anInt2721 = arg1.anInt2692;
		} else if (arg1.aByte19 == 1) {
			arg1.anInt2721 = arg1.anInt2692 + (arg2 - arg1.anInt2682) / 2;
		} else if (arg1.aByte19 == 2) {
			arg1.anInt2721 = arg2 - arg1.anInt2682 - arg1.anInt2692;
		} else if (arg1.aByte19 == 3) {
			arg1.anInt2721 = arg2 * arg1.anInt2692 >> 14;
		} else if (arg1.aByte19 == 4) {
			arg1.anInt2721 = (arg2 * arg1.anInt2692 >> 14) + (arg2 - arg1.anInt2682) / 2;
		} else {
			arg1.anInt2721 = arg2 - (arg2 * arg1.anInt2692 >> 14) - arg1.anInt2682;
		}
		if (arg1.aByte21 == 0) {
			arg1.anInt2678 = arg1.anInt2707;
		} else if (arg1.aByte21 == 1) {
			arg1.anInt2678 = (arg0 - arg1.anInt2703) / 2 + arg1.anInt2707;
		} else if (arg1.aByte21 == 2) {
			arg1.anInt2678 = arg0 - arg1.anInt2703 - arg1.anInt2707;
		} else if (arg1.aByte21 == 3) {
			arg1.anInt2678 = arg0 * arg1.anInt2707 >> 14;
		} else if (arg1.aByte21 == 4) {
			arg1.anInt2678 = (arg1.anInt2707 * arg0 >> 14) + (arg0 - arg1.anInt2703) / 2;
		} else {
			arg1.anInt2678 = arg0 - arg1.anInt2703 - (arg1.anInt2707 * arg0 >> 14);
		}
		if (!Static372.aBoolean418) {
			return;
		}
		if (Static56.method1002(arg1).anInt5644 == 0 && arg1.anInt2727 != 0) {
			return;
		}
		if (arg1.anInt2721 < 0) {
			arg1.anInt2721 = 0;
		} else if (arg2 < arg1.anInt2682 + arg1.anInt2721) {
			arg1.anInt2721 = arg2 - arg1.anInt2682;
		}
		if (arg1.anInt2678 < 0) {
			arg1.anInt2678 = 0;
			return;
		}
		if (arg1.anInt2703 + arg1.anInt2678 > arg0) {
			arg1.anInt2678 = arg0 - arg1.anInt2703;
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ge;Z)V")
	public static void method5682(@OriginalArg(0) Class40_Sub3 arg0) {
		arg0.aClass24_Sub3_Sub2_1 = null;
		if (Static412.anInt6895 < 20) {
			Static450.aClass240_8.method5225(arg0);
			Static412.anInt6895++;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	public static void method5683() {
		for (@Pc(15) Class10_Sub33 local15 = (Class10_Sub33) Static418.aClass163_44.method3620(); local15 != null; local15 = (Class10_Sub33) Static418.aClass163_44.method3621()) {
			if (local15.anInt5095 > 0) {
				local15.anInt5095--;
			}
			if (local15.anInt5095 != 0) {
				if (local15.anInt5097 > 0) {
					local15.anInt5097--;
				}
				if (local15.anInt5097 == 0 && local15.anInt5100 >= 1 && local15.anInt5108 >= 1 && local15.anInt5100 <= Static2.anInt7 - 2 && local15.anInt5108 <= Static17.anInt315 - 2 && (local15.anInt5105 < 0 || Static65.method1080(local15.anInt5106, local15.anInt5105))) {
					Static50.method855(local15.anInt5106, local15.anInt5098, local15.anInt5100, local15.anInt5109, local15.anInt5108, -1, local15.anInt5105, local15.anInt5103);
					local15.anInt5097 = -1;
					if (local15.anInt5105 == local15.anInt5101 && local15.anInt5101 == -1) {
						local15.method6033();
					} else if (local15.anInt5105 == local15.anInt5101 && local15.anInt5103 == local15.anInt5104 && local15.anInt5099 == local15.anInt5106) {
						local15.method6033();
					}
				}
			} else if (local15.anInt5101 < 0 || Static65.method1080(local15.anInt5099, local15.anInt5101)) {
				Static50.method855(local15.anInt5099, local15.anInt5098, local15.anInt5100, local15.anInt5109, local15.anInt5108, -1, local15.anInt5101, local15.anInt5104);
				local15.method6033();
			}
		}
	}
}

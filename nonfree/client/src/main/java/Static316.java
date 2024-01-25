import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!gd;")
	public static Class88 aClass88_4;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "B")
	public static byte aByte84;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_201 = new Class186(107, 3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
	public static int method4644() {
		@Pc(5) Class69 local5 = Static67.aClass69_13;
		synchronized (Static67.aClass69_13) {
			return Static67.aClass69_13.method1597();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)V")
	public static void method4648(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!m;Lclient!hu;Ljava/awt/Canvas;I)Lclient!qa;")
	public static synchronized Class30 method4691(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1, @OriginalArg(3) Class114 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static37.aBooleanArray3[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(51) Class30 local51;
		if (arg4 == 0) {
			local51 = Static405.method5343(arg3, local7, arg1);
		} else if (arg4 == 1) {
			local51 = Static34.method630(arg2, local7, arg0, arg3, arg1);
		} else if (arg4 == 2) {
			local51 = Static141.method2012(arg1, arg3, local7, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static37.aBooleanArray3[local7] = true;
		return local51;
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public static void method4696() {
		if (Static134.anInt2618 > 0) {
			Static246.method3390();
		} else {
			Static223.aClass5_2 = Static223.aClass5_3;
			Static223.aClass5_3 = null;
			Static321.method4406(40);
		}
	}
}

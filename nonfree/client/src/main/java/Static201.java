import java.awt.Canvas;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "J")
	public static long aLong259;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
	public static int[] anIntArray601 = new int[2];

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
	public static final int[] anIntArray602 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!ae;Ljava/awt/Canvas;Lclient!d;I)Lclient!ha;")
	public static synchronized Class132 method7440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3, @OriginalArg(5) Canvas arg4, @OriginalArg(6) Interface6 arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static620.method8555(arg4, arg0, arg5, arg2);
		} else if (arg6 == 2) {
			return Static577.method8020(arg4, arg5, arg0, arg2);
		} else if (arg6 == 1) {
			return Static220.method3200(arg1, arg4, arg5);
		} else if (arg6 == 5) {
			return Static675.method9108(arg5, arg4, arg3, arg1);
		} else if (arg6 == 3) {
			return Static680.method2218(arg1, arg5, arg4, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
	public static void method7513(@OriginalArg(1) byte arg0) {
		if (Static75.aByteArrayArrayArray1 == null) {
			Static75.aByteArrayArrayArray1 = new byte[4][Static491.anInt9856][Static393.anInt6574];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static491.anInt9856; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static393.anInt6574; local27++) {
					Static75.aByteArrayArrayArray1[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/Object;Lclient!vt;)V")
	public static void method7514(@OriginalArg(1) Object arg0, @OriginalArg(2) Class380 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static520.method7923(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(47) Exception local47) {
		}
	}
}

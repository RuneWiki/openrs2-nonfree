import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	public static int anInt6574 = -1;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!qa;III)V")
	public static void method5102(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static446.aClass31ArrayArray1 = new Class31[arg2][arg1];
		Static413.aClass30_12 = arg0;
		if (Static229.anIntArray340 != null) {
			Static437.aClass59_4 = Static209.method2981(Static229.anIntArray340[0], Static229.anIntArray340[2], Static229.anIntArray340[3], Static229.anIntArray340[4], Static229.anIntArray340[5], Static229.anIntArray340[1]);
		}
		Static74.aClass31_1 = new Class31();
		Static117.method1842();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)Lclient!wq;")
	public static Class268 method5103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class268 local7 = new Class268();
		local7.anInt7529 = arg0 + 1 + 5;
		local7.anInt7533 = arg1 + 5 + 1;
		local7.anInt7539 = -1;
		local7.anInt7518 = -1;
		local7.anIntArrayArray66 = new int[local7.anInt7529][local7.anInt7533];
		local7.method5815();
		return local7;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method5105() {
		for (@Pc(7) int local7 = 0; local7 < Static327.aByteArrayArrayArray11.length; local7++) {
			for (@Pc(19) int local19 = 0; local19 < Static327.aByteArrayArrayArray11[0].length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static327.aByteArrayArrayArray11[0][0].length; local23++) {
					Static327.aByteArrayArrayArray11[local7][local19][local23] = 0;
				}
			}
		}
	}
}

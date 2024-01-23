import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	public static int anInt5304;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public static int anInt5298 = 0;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt5299 = 0;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "[Lclient!ij;")
	public static Class1_Sub2_Sub12[] aClass1_Sub2_Sub12Array3 = new Class1_Sub2_Sub12[14];

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)J")
	public static long method4165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass162_1 == null ? 0L : local7.aClass162_1.aLong192;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4171(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(16) int local16 = Static58.aClass1_Sub2_Sub16_2.method3967(arg1, 250);
		@Pc(35) int local35 = Static58.aClass1_Sub2_Sub16_2.method3968(arg1, 250) * 13;
		if (Static296.aBoolean335) {
			Static288.method4713(6, 6, local16 + 8, local35 + 4 - -4, 0);
			Static288.method4709(6, 6, local16 + 4 + 4, local35 - -4 + 4, 16777215);
		} else {
			Static203.method3592(6, 6, local16 + 8, local35 + 4 + 4, 0);
			Static203.method3598(6, 6, local16 + 4 + 4, local35 - -4 - -4, 16777215);
		}
		Static58.aClass1_Sub2_Sub16_2.method3964(arg1, 10, 10, local16, local35, 16777215, -1, 1, 1, 0);
		Static205.method3644(local16 + 4 + 4, 6, local35 + 4 + 4, 6);
		if (!arg0) {
			Static180.method3276(10, 10, local35, local16);
		} else if (Static296.aBoolean335) {
			Static296.method4801();
		} else {
			try {
				@Pc(163) Graphics local163 = Static9.aCanvas1.getGraphics();
				Static1.aClass5_1.method1713(local163);
			} catch (@Pc(171) Exception local171) {
				Static9.aCanvas1.repaint();
			}
		}
	}
}

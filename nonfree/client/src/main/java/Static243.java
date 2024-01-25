import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "Lclient!cj;")
	public static Class35 aClass35_3;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString275 = "Loaded title screen";

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;III)V")
	public static void method4137(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static316.anIntArray516[local3] = Static316.anIntArray516[local3 - 1];
			Static253.anIntArray381[local3] = Static253.anIntArray381[local3 - 1];
			Static147.aStringArray20[local3] = Static147.aStringArray20[local3 - 1];
			Static58.aStringArray7[local3] = Static58.aStringArray7[local3 - 1];
			Static106.aStringArray13[local3] = Static106.aStringArray13[local3 - 1];
			Static46.aStringArray3[local3] = Static46.aStringArray3[local3 - 1];
			Static90.anIntArray308[local3] = Static90.anIntArray308[local3 - 1];
		}
		Static316.anIntArray516[0] = arg5;
		Static147.aStringArray20[0] = arg2;
		Static253.anIntArray381[0] = arg6;
		Static58.aStringArray7[0] = arg0;
		Static106.aStringArray13[0] = arg1;
		Static193.anInt3825++;
		Static312.anInt5961 = Static211.anInt4205;
		Static90.anIntArray308[0] = arg3;
		Static46.aStringArray3[0] = arg4;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)I")
	public static int method4141(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(29) int local29 = (arg0 & 0x7F) * 96 >> 7;
		if (local29 < 2) {
			local29 = 2;
		} else if (local29 > 126) {
			local29 = 126;
		}
		return local29 + (arg0 & 0xFF80);
	}
}

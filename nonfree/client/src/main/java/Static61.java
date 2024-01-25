import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "Lclient!in;")
	public static final Class169 aClass169_39 = new Class169(36, -2);

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_6 = new Class271();

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_6 = new Class22(10);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILclient!ha;IILjava/lang/String;II)V")
	public static void method1152(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		if (Static418.aClass71_17 == null || Static307.aClass71_9 == null) {
			if (Static409.aClass124_84.method3627(Static18.anInt324) && Static409.aClass124_84.method3627(Static591.anInt10305)) {
				Static418.aClass71_17 = arg1.method8063(Static676.method1693(Static409.aClass124_84, Static18.anInt324, 0), true);
				@Pc(32) Class67 local32 = Static676.method1693(Static409.aClass124_84, Static591.anInt10305, 0);
				Static307.aClass71_9 = arg1.method8063(local32, true);
				local32.method1686();
				Static167.aClass71_6 = arg1.method8063(local32, true);
			} else {
				arg1.aa(arg3, arg5, arg2, 20, 255 - Static316.anInt5772 << 24 | Static140.anInt8825, 1);
			}
		}
		if (Static418.aClass71_17 != null && Static307.aClass71_9 != null) {
			@Pc(76) int local76 = (arg2 - Static307.aClass71_9.method7691() * 2) / Static418.aClass71_17.method7691();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static418.aClass71_17.method7703(arg3 + Static307.aClass71_9.method7691() + Static418.aClass71_17.method7691() * local78, arg5);
			}
			Static307.aClass71_9.method7703(arg3, arg5);
			Static167.aClass71_6.method7703(arg3 + arg2 - Static167.aClass71_6.method7691(), arg5);
		}
		Static253.aClass59_5.method9577(Static63.anInt1213 | 0xFF000000, arg4, arg3 + 3, arg5 + 14, -1);
		arg1.aa(arg3, arg5 + 20, arg2, arg0 - 20, Static140.anInt8825 | -Static316.anInt5772 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	public static int method1154(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static76.method1363(arg0);
	}
}

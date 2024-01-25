import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	public static int anInt4656;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
	public static final int[] anIntArray233 = new int[14];

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method4064() {
		Static409.aClass99_56.method3057();
		Static83.aClass99_21.method3057();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLjava/lang/String;IBZIIZIJLjava/lang/String;JI)V")
	public static void method4065(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) String arg9, @OriginalArg(11) long arg10, @OriginalArg(12) int arg11) {
		if (!Static65.aBoolean754 && Static298.anInt6262 < 500) {
			@Pc(17) int local17 = arg11 == -1 ? Static151.anInt3895 : arg11;
			@Pc(38) Class2_Sub6_Sub3 local38 = new Class2_Sub6_Sub3(arg9, arg1, local17, arg7, arg5, arg10, arg4, arg2, arg6, arg0, arg8, arg3);
			Static467.method7330(local38);
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(III)V")
	public static void method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub6_Sub6 local12 = Static139.method3119(arg0, 1);
		local12.method3088();
		local12.anInt3368 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4067(@OriginalArg(0) String arg0) {
		return Static435.method6896(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([SB)[S")
	public static short[] method4069(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static653.method7722(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}

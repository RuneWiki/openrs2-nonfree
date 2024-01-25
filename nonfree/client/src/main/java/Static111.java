import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "[I")
	public static final int[] anIntArray101 = new int[2];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lclient!ni;")
	public static Class249 method1601(@OriginalArg(0) int arg0) {
		@Pc(8) Class249[] local8 = Static616.method8745();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class249 local16 = local8[local10];
			if (local16.anInt6760 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1603(@OriginalArg(1) String arg0) {
		Static177.method2584("", arg0, "", 0, 4, "");
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!cn;II)Ljava/lang/String;")
	public static String method1604(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		if (!Static81.method1252(arg0).method7126(arg1) && arg0.anObjectArray31 == null) {
			return null;
		} else if (arg0.aStringArray7 == null || arg0.aStringArray7.length <= arg1 || arg0.aStringArray7[arg1] == null || arg0.aStringArray7[arg1].trim().length() == 0) {
			return Static206.aBoolean269 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray7[arg1];
		}
	}
}

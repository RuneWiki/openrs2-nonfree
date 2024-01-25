import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
	public static int anInt10198;

	@OriginalMember(owner = "client!vda", name = "C", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_357 = new Class179(31, 4);

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
	public static int anInt10200 = -1;

	@OriginalMember(owner = "client!vda", name = "M", descriptor = "[I")
	public static final int[] anIntArray672 = new int[1000];

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIZI)V")
	public static void method8632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static231.anInt3950 = arg1;
		Static445.anInt7486 = arg2;
		Static400.anInt6733 = arg5;
		Static40.anInt8513 = arg0;
		Static667.anInt10667 = arg3;
		if (arg4 && Static40.anInt8513 >= 100) {
			Static542.anInt9140 = Static400.anInt6733 * 512 + 256;
			Static23.anInt564 = Static667.anInt10667 * 512 + 256;
			Static170.anInt2855 = Static284.method4118(Static23.anInt564, Static253.anInt4353, Static542.anInt9140) - Static231.anInt3950;
		}
		Static258.anInt4491 = -1;
		Static601.anInt9806 = -1;
		Static407.anInt6820 = 2;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method8634(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static569.aClass380_6.aBoolean729) {
			Static406.aClass354_3 = new Class354();
			Static406.aClass354_3.anInt9837 = arg1;
			Static406.aClass354_3.aString135 = arg0;
			if (Static74.aClass104_2 != Static648.aClass104_9) {
				Static406.aClass354_3.anInt9840 = Static406.aClass354_3.anInt9837 + 40000;
				Static406.aClass354_3.anInt9834 = Static406.aClass354_3.anInt9837 + 50000;
			}
			for (@Pc(36) int local36 = 0; local36 < Static668.aClass235_Sub1Array2.length; local36++) {
				if (Static668.aClass235_Sub1Array2[local36].anInt6483 == arg1) {
					Static434.anInt7423 = Static668.aClass235_Sub1Array2[local36].anInt6469;
				}
			}
			return true;
		}
		@Pc(66) String local66 = "";
		if (Static74.aClass104_2 != Static648.aClass104_9) {
			local66 = ":" + (arg1 + 7000);
		}
		@Pc(81) String local81 = "";
		if (Static245.aString52 != null) {
			local81 = "/p=" + Static245.aString52;
		}
		@Pc(137) String local137 = "http://" + arg0 + local66 + "/l=" + Static616.anInt10077 + "/a=" + Static506.anInt8485 + local81 + "/j" + (Static301.aBoolean334 ? "1" : "0") + ",o" + (Static329.aBoolean421 ? "1" : "0") + ",a2";
		try {
			Static563.aClient1.getAppletContext().showDocument(new URL(local137), "_self");
			return true;
		} catch (@Pc(147) Exception local147) {
			return false;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIII)V")
	public static void method8635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 + arg4;
		@Pc(19) int local19 = arg1 - arg4;
		for (@Pc(21) int local21 = arg3; local21 < local9; local21++) {
			Static270.method3998(arg5, arg0, arg2, Static173.anIntArrayArray15[local21]);
		}
		for (@Pc(41) int local41 = arg1; local41 > local19; local41--) {
			Static270.method3998(arg5, arg0, arg2, Static173.anIntArrayArray15[local41]);
		}
		@Pc(60) int local60 = arg0 + arg4;
		@Pc(64) int local64 = arg2 - arg4;
		for (@Pc(66) int local66 = local9; local66 <= local19; local66++) {
			@Pc(72) int[] local72 = Static173.anIntArrayArray15[local66];
			Static270.method3998(arg5, arg0, local60, local72);
			Static270.method3998(arg5, local64, arg2, local72);
		}
	}
}

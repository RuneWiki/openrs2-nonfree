import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Lclient!hs;")
	public static Class103 aClass103_6;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Z")
	public static boolean aBoolean440;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIJIIBZLjava/lang/String;ZLjava/lang/String;I)V")
	public static void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) String arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9) {
		if (!Static378.aBoolean462 && Static169.anInt3551 < 500) {
			@Pc(24) int local24 = arg9 == -1 ? Static332.anInt6029 : arg9;
			@Pc(38) Class3_Sub38 local38 = new Class3_Sub38(arg8, arg6, local24, arg1, arg3, arg2, arg4, arg0, arg7, arg5);
			Static374.aClass229_41.method5321(local38);
			Static169.anInt3551++;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!na;)V")
	public static void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1) {
		Static120.aClass64Array1[arg0] = arg1;
	}
}

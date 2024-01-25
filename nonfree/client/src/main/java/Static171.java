import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
	public static int anInt5501;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
	public static int anInt5502;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Lclient!rb;")
	public static Class210 aClass210_6;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt5503 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method4370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class28_Sub8 local11 = new Class28_Sub8();
		local11.anInt7366 = arg1;
		local11.anInt7360 = arg6;
		local11.anInt7362 = arg3 + Static277.anInt5022;
		local11.anInt7361 = arg5;
		local11.anInt7367 = arg0;
		local11.anInt7363 = arg4;
		local11.aString70 = arg2;
		Static383.aClass97_7.method2154(local11);
	}
}

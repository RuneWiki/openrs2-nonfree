import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!as", name = "p", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!ud;")
	public static final Class281 aClass281_1 = new Class281();

	@OriginalMember(owner = "client!as", name = "q", descriptor = "[I")
	public static final int[] anIntArray39 = new int[1024];

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 - arg1;
		for (@Pc(20) int local20 = arg3; local20 < local14; local20++) {
			Static403.method6377(arg6, Static130.anIntArrayArray89[local20], arg4, arg5);
		}
		@Pc(38) int local38 = arg4 - arg1;
		@Pc(42) int local42 = arg5 + arg1;
		for (@Pc(44) int local44 = arg2; local44 > local18; local44--) {
			Static403.method6377(arg6, Static130.anIntArrayArray89[local44], arg4, arg5);
		}
		for (@Pc(60) int local60 = local14; local60 <= local18; local60++) {
			@Pc(66) int[] local66 = Static130.anIntArrayArray89[local60];
			Static403.method6377(arg6, local66, local42, arg5);
			Static403.method6377(arg0, local66, local38, local42);
			Static403.method6377(arg6, local66, arg4, local38);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
	public static void method582(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static517.aHashtable7.put(arg0, arg1);
	}
}

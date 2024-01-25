import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
	public static int anInt4209 = -1;

	@OriginalMember(owner = "client!kn", name = "X", descriptor = "[I")
	public static final int[] anIntArray319 = new int[1000];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method3441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class13_Sub2 local7 = new Class13_Sub2();
		local7.anInt1304 = arg4;
		local7.anInt1307 = arg1 + Static290.anInt5325;
		local7.anInt1309 = arg5;
		local7.anInt1305 = arg3;
		local7.anInt1306 = arg0;
		local7.aString11 = arg6;
		local7.anInt1310 = arg2;
		Static56.aClass40_1.method1190(local7);
	}
}

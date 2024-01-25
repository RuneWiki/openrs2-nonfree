import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt8079 = 0;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIILjava/lang/String;III)V")
	public static void method7007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub7 local7 = new Class4_Sub7();
		local7.anInt7522 = arg0;
		local7.anInt7525 = arg2;
		local7.anInt7521 = arg1;
		local7.aString81 = arg3;
		local7.anInt7524 = arg5;
		local7.anInt7527 = arg6 + Static101.anInt2262;
		local7.anInt7526 = arg4;
		Static543.aClass120_8.method2960(local7);
	}
}

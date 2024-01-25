import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public static int anInt230;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)I")
	public static int method250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(33) int local33 = (local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(37) int local37 = 255 - local7;
		return local33 + (((arg1 & 0xFF00FF) * local37 & 0xFF00FF00 | local37 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)Z")
	public static boolean method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static588.method8006(arg0, arg1) || Static512.method7321(arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)V")
	public static void method252(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static69.anInt1053 = arg2;
		Static62.anInt991 = 2;
		Static96.method1621(arg0, false, arg1);
	}
}

import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "K", descriptor = "Lclient!uu;")
	public static Class343 aClass343_12;

	@OriginalMember(owner = "client!afa", name = "L", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!afa", name = "G", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	public static void method194(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		arg0.method6134(arg1, arg3, arg4, -10660793, arg2);
		arg0.method6134(arg1 + 1, 16, arg4 - 2, -16777216, arg2 + 1);
		arg0.method6137(arg3 - 19, arg1 + 1, arg4 - 2, arg2 + 18, -16777216);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZC)Z")
	public static boolean method196(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BII)I")
	public static int method198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(25) int local25 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | (arg0 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local7;
		return local25 + ((local35 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local35 & 0xFF0000) >>> 8);
	}
}

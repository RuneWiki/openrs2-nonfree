import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public static int anInt3397 = 0;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!fca;")
	public static Class114 aClass114_20 = new Class114();

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	public static int anInt3410 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method2972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 + arg2 > arg7 && arg7 + arg5 > arg1) {
			return arg0 < arg4 + arg3 && arg3 < arg6 + arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class65 method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;II[B)I")
	public static int method2974(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15 += 4) {
			@Pc(22) int local22 = Static631.method8510(arg0.charAt(local15));
			@Pc(37) int local37 = local13 <= local15 + 1 ? -1 : Static631.method8510(arg0.charAt(local15 + 1));
			@Pc(56) int local56 = local15 + 2 < local13 ? Static631.method8510(arg0.charAt(local15 + 2)) : -1;
			@Pc(71) int local71 = local13 > local15 + 3 ? Static631.method8510(arg0.charAt(local15 + 3)) : -1;
			arg2[arg1++] = (byte) (local22 << 2 | local37 >>> 4);
			if (local56 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local56 >>> 2 | (local37 & 0xF) << 4);
			if (local71 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local71 | (local56 & 0x3) << 6);
		}
		return arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_26 = new Class269(79, -1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JLjava/lang/String;IBJZLjava/lang/String;IZIZII)V")
	public static void method1856(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (!Static642.aBoolean757 && Static90.anInt1824 < 500) {
			@Pc(24) int local24 = arg10 == -1 ? Static385.anInt6934 : arg10;
			@Pc(40) Class2_Sub5_Sub20 local40 = new Class2_Sub5_Sub20(arg5, arg1, local24, arg6, arg11, arg3, arg2, arg8, arg4, arg9, arg0, arg7);
			Static174.method3221(local40);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)I")
	public static int method1858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static244.aByteArrayArrayArray9[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static244.aByteArrayArrayArray9[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
	public static boolean method1859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "Lclient!nj;")
	public static Class94 aClass94_2 = new Class94();

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[I")
	public static int[] anIntArray156 = new int[100];

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "[I")
	public static int[] anIntArray157 = new int[1000];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ql;II)Ljava/lang/String;")
	public static String method1502(@OriginalArg(0) Class1_Sub13 arg0) {
		try {
			@Pc(15) int local15 = arg0.method1780();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt2395 += Static36.aClass118_2.method3447(arg0.anInt2395, local27, 0, arg0.aByteArray29, local15);
			return Static47.method967(local27, local15, 0);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Lclient!o;")
	public static Class1_Sub2_Sub11 method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(18) Class1_Sub2_Sub11 local18 = (Class1_Sub2_Sub11) Static203.aClass140_12.method4012(); local18 != null; local18 = (Class1_Sub2_Sub11) Static203.aClass140_12.method4013()) {
			if (local18.aBoolean192 && local18.method2863(arg1, arg0)) {
				return local18;
			}
		}
		return null;
	}
}

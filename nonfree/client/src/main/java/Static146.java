import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	public static int anInt2878 = 0;

	@OriginalMember(owner = "client!kj", name = "K", descriptor = "[Lclient!re;")
	public static Class146[] aClass146Array1 = new Class146[8];

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
	public static int anInt2879 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI)Lclient!qh;")
	public static Class4_Sub2_Sub18 method2321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) Class4_Sub2_Sub18 local15 = (Class4_Sub2_Sub18) Static154.aClass163_23.method4192(); local15 != null; local15 = (Class4_Sub2_Sub18) Static154.aClass163_23.method4183()) {
			if (local15.aBoolean283 && local15.method3543(arg1, arg0)) {
				return local15;
			}
		}
		return null;
	}
}

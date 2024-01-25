import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Lclient!qe;")
	public static final Class2_Sub39 aClass2_Sub39_1 = new Class2_Sub39(0, -1);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
	public static boolean method832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static498.method7327(arg1, arg0) || Static269.method4299(arg1, arg0) || Static98.method1917(arg1, arg0);
	}
}

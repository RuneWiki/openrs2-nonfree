import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[8];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
	public static boolean method4573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static314.method4856(arg1, arg0) || Static328.method4993(arg0, arg1);
	}
}

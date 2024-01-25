import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[200];

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_14 = new Class162(11, 5);

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
	public static boolean method4761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static438.method6801(arg0, arg1) || Static335.method5481(arg0, arg1);
	}
}

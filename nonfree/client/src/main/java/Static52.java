import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	public static int anInt1266;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!ji;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Lclient!wia;")
	public static Class386 aClass386_15;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_8 = new Class187(16);

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
	public static int method1101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}

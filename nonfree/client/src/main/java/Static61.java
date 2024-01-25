import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_6 = new Class42(512);

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
	public static int anInt1428 = -1;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
	public static int anInt1429 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ra;III)Lclient!nm;")
	public static Class138 method1256(@OriginalArg(0) Class170 arg0, @OriginalArg(3) int arg1) {
		@Pc(18) byte[] local18 = arg0.method4584(arg1, 0);
		return local18 == null ? null : new Class138(local18);
	}
}

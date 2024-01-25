import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public static int anInt8483;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!ro;")
	public static Class306 aClass306_55 = new Class306();

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIB)Lclient!ol;")
	public static Class5_Sub37 method7299(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class5_Sub37) Static97.aClass81_14.method1599(local17);
	}
}

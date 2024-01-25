import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static471 {

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public static int anInt8504;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_64 = new Class71();

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILclient!fm;)V")
	public static void method7029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		Static313.aClass92ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Z")
	public static boolean method7030(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}

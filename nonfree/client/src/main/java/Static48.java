import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "[S")
	public static short[] aShortArray32 = new short[256];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Lclient!bc;")
	public static Class27 method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass27_3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method984(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static548.method8414(arg0.length - 1, 0, arg0, arg1);
	}
}

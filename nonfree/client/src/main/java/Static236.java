import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZBII)I")
	public static int method4284(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class6_Sub6 local17 = Static612.method8391(arg1, arg0);
		if (local17 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local17.anIntArray32.length) {
			return local17.anIntArray32[arg2];
		} else {
			return 0;
		}
	}
}

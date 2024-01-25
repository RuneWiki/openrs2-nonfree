import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt9003;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!dg;")
	public static final Class81 aClass81_16 = new Class81();

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_9 = new Class139(2, 2);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method7639(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static582.method9007(local18) : local18;
		} else if (arg0 instanceof Class17) {
			@Pc(32) Class17 local32 = (Class17) arg0;
			return local32.method7119();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public static void method7640(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub3_Sub17 local13 = Static358.method5408(11, (long) arg0);
		local13.method7288();
	}
}

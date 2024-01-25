import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
	public static final int anInt6699 = 1338;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BII)Z")
	public static boolean method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}

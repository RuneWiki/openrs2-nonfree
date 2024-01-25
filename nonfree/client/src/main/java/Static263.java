import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
	public static int anInt4681;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	public static int anInt4683;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_137 = new Class107(24, 8);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3885(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(15) int local15 = arg0.indexOf(arg1); local15 != -1; local15 = arg0.indexOf(arg1, local15 + arg2.length())) {
			arg0 = arg0.substring(0, local15) + arg2 + arg0.substring(local15 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method3887(@OriginalArg(1) String arg0) {
		return Static342.method4812(16, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZII)Z")
	public static boolean method3888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static157.method3073(arg0, arg1) || Static408.method5470(arg0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Object;IIZ)[B")
	public static byte[] method3889(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return Static328.method4662(arg1, local21);
		} else if (arg0 instanceof Class136) {
			@Pc(33) Class136 local33 = (Class136) arg0;
			return local33.method3292(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

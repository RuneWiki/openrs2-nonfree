import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Lclient!hca;")
	public static Class125 aClass125_4;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public static int anInt7818 = 16777215;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[S")
	public static short[] aShortArray120 = new short[256];

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_128 = new Class40("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
	public static final int[] anIntArray591 = new int[1000];

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "[I")
	public static final int[] anIntArray592 = new int[1];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6335(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (local10 << 5) + arg0.charAt(local19) - local10;
		}
		return local10;
	}
}

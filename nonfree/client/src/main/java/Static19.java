import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_14 = new Class136(40, -1);

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_6 = new Class181(61, -1);

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "[I")
	public static final int[] anIntArray32 = new int[4096];

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Z")
	public static boolean method452(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!el;")
	public static Class97 method453(@OriginalArg(0) int arg0) {
		@Pc(15) Class97[] local15 = Static506.method2914();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class97 local23 = local15[local17];
			if (arg0 == local23.anInt2128) {
				return local23;
			}
		}
		return null;
	}
}

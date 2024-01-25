import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "[Lclient!sa;")
	public static Class205[] aClass205Array3;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Lclient!im;")
	public static Class140 aClass140_152;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!lw;")
	public static Class1_Sub22_Sub1 aClass1_Sub22_Sub1_1;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_31 = new Class229(13, 3);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7542(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 <= '\u007f') {
				local8++;
			} else if (local19 <= '\u07ff') {
				local8 += 2;
			} else {
				local8 += 3;
			}
		}
		return local8;
	}
}

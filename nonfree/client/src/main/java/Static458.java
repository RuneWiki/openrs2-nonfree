import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	public static int anInt7955;

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!pp", name = "V", descriptor = "I")
	public static int anInt7967;

	@OriginalMember(owner = "client!pp", name = "W", descriptor = "I")
	public static int anInt7968;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "Lclient!pd;")
	public static final Class270 aClass270_6 = new Class270();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZI)V")
	public static void method6768(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub48 local8 = Static386.method5663(arg0, arg1);
		if (local8 != null) {
			for (@Pc(13) int local13 = 0; local13 < local8.anIntArray497.length; local13++) {
				local8.anIntArray497[local13] = -1;
				local8.anIntArray495[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	public static int method6772(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}

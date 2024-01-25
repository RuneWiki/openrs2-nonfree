import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public static int anInt10256;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt10257;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Lclient!oh;")
	public static Class237 aClass237_144;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!cu;")
	public static final Class60 aClass60_11 = new Class60();

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	public static int anInt10259 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)I")
	public static int method8283(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(48) int local48 = (arg0 & 0x7F) * 96 >> 7;
			if (local48 < 2) {
				local48 = 2;
			} else if (local48 > 126) {
				local48 = 126;
			}
			return (arg0 & 0xFF80) + local48;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public static void method8284(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(9, arg0);
		local8.method3512();
	}
}

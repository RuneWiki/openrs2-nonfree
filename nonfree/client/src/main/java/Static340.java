import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "Z")
	public static boolean aBoolean475;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!ra;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_96 = new Class45(39, 8);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)Z")
	public static boolean method5409(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(BI)I")
	public static int method5413(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)I")
	public static int method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static287.anIntArrayArray52 == null ? 0 : Static287.anIntArrayArray52[arg0][arg1] & 0xFFFFFF;
	}
}

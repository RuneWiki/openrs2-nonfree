import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_13 = new Class230(35, 11);

	@OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
	public static int anInt1206 = -1;

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_15 = new Class276(103, -1);

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "[I")
	public static final int[] anIntArray71 = new int[32];

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "[I")
	public static final int[] anIntArray72 = new int[13];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZ)V")
	public static void method1238(@OriginalArg(1) boolean arg0) {
		Static301.method5007(Static25.anInt779, arg0, Static294.anInt10217, Static582.anInt10234);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(IIII)I")
	public static int method1241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}

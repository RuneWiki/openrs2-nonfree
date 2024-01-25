import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_35 = new Class237(44, 6);

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!ss;")
	public static Class219 aClass219_8 = null;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZII)I")
	public static int method1706(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub45 local16 = Static193.method906(arg0, arg1);
		if (local16 == null) {
			return -1;
		} else if (arg2 >= 0 && local16.anIntArray680.length > arg2) {
			return local16.anIntArray680[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)I")
	public static int method1707(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public static void method1708() {
		for (@Pc(11) Class39_Sub8 local11 = (Class39_Sub8) Static138.aClass188_3.method4534(); local11 != null; local11 = (Class39_Sub8) Static138.aClass188_3.method4530()) {
			local11.method5621();
		}
	}
}

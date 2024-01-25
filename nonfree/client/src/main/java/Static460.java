import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!pr", name = "cb", descriptor = "[Lclient!un;")
	public static Class360[] aClass360Array1;

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "Lclient!ve;")
	public static final Class370 aClass370_7 = new Class370(4, 1);

	@OriginalMember(owner = "client!pr", name = "db", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_250 = new Class196(45, 1);

	@OriginalMember(owner = "client!pr", name = "fb", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_3 = new Class6();

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(III)I")
	public static int method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local15;
	}
}

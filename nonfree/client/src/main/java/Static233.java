import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	public static int anInt3759;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public static int anInt3760;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!it;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_137 = new Class196(39, 7);

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_9 = new Class74(14, -1);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I")
	public static int method3327(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}
}

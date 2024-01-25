import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "[[[Lclient!ug;")
	public static Class351[][][] aClass351ArrayArrayArray2;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!mt;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "I")
	public static int anInt9972 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)Lclient!sn;")
	public static Class324 method8416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class324 local7 = new Class324();
		local7.anInt9227 = -1;
		local7.anInt9215 = arg0 + 6;
		local7.anInt9209 = -1;
		local7.anInt9226 = arg1 + 1 + 5;
		local7.anIntArrayArray51 = new int[local7.anInt9215][local7.anInt9226];
		local7.method7775();
		return local7;
	}
}

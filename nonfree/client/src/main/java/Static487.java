import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static487 {

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
	public static final boolean aBoolean645 = false;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_237 = new Class363(29, 6);

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_238 = new Class363(85, 28);

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
	public static boolean aBoolean646 = true;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_143 = new Class286(50, 3);

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	public static final int anInt8239 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
	public static boolean method6827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static236.method3656(arg0, arg1) || Static263.method4046(arg0, arg1);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method6831() {
		if (Static199.anInt3950 == 6) {
			Static199.anInt3950 = 7;
		}
	}
}

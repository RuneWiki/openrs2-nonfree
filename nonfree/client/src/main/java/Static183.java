import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!ok;")
	public static Class178 aClass178_47;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_71 = new Class55("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int anInt3293 = -1;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public static int anInt3294 = -1;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(III)Lclient!ep;")
	public static Class70 method2670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class70 local7 = new Class70();
		local7.anInt1982 = arg0 + 1 + 5;
		local7.anInt1976 = arg1 + 5 + 1;
		local7.anInt1966 = -1;
		local7.anInt1971 = -1;
		local7.anIntArrayArray10 = new int[local7.anInt1976][local7.anInt1982];
		local7.method1703();
		return local7;
	}
}

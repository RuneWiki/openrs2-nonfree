import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!s;")
	public static final Class86 aClass86_3 = new Class86(64);

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_23 = Static181.method2795("Benutzername: ");

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_24 = Static181.method2795("Spieler");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z")
	public static boolean method92(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lclient!pf;")
	public static Class79 method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass79_1;
	}
}

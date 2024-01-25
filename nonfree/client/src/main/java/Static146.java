import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_46 = new Class237(86, 7);

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "Lclient!qi;")
	public static final Class188 aClass188_4 = new Class188();

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "[Lclient!rk;")
	public static final Class202[] aClass202Array1 = new Class202[6];

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_47 = new Class237(65, 2);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)V")
	public static void method2196(@OriginalArg(1) int arg0) {
		Static217.anInt3934 = arg0;
		@Pc(7) Class83 local7 = Static193.aClass83_8;
		synchronized (Static193.aClass83_8) {
			Static193.aClass83_8.method1669();
		}
		local7 = Static92.aClass83_14;
		synchronized (Static92.aClass83_14) {
			Static92.aClass83_14.method1669();
		}
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
	public static void method2198() {
		for (@Pc(12) int local12 = 0; local12 < Static184.aByteArrayArrayArray3.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static184.aByteArrayArrayArray3[0].length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static184.aByteArrayArrayArray3[0][0].length; local20++) {
					Static184.aByteArrayArrayArray3[local12][local16][local20] = 0;
				}
			}
		}
	}
}

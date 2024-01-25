import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "Lclient!sb;")
	public static Class212 aClass212_2;

	@OriginalMember(owner = "client!dw", name = "G", descriptor = "Lclient!uu;")
	public static Class247 aClass247_2;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
	public static int anInt1642 = -1;

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_17 = new Class215(9, -1);

	@OriginalMember(owner = "client!dw", name = "H", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_33 = new Class83("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBI)I")
	public static int method1460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}
}

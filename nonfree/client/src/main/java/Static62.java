import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public static int anInt1682;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_51 = new Class123(44, -1);

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!mea;")
	public static final Class201 aClass201_6 = new Class201();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	public static int method1512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(25) int local25 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return local25 + (((arg1 & 0xFF00FF) * local30 & 0xFF00FF00 | local30 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ie;I)Lclient!ku;")
	public static Class110_Sub2 method1514(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class110_Sub2(arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6830(), arg0.method6830(), arg0.method6814());
	}
}

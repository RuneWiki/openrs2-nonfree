import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_126 = new Class305(62, -1);

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)Lclient!qt;")
	public static Class243 method2644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class243 local7 = new Class243();
		local7.anInt7176 = arg1 + 5 + 1;
		local7.anInt7169 = -1;
		local7.anInt7173 = arg0 + 5 + 1;
		local7.anInt7190 = -1;
		local7.anIntArrayArray95 = new int[local7.anInt7176][local7.anInt7173];
		local7.method6471();
		return local7;
	}
}

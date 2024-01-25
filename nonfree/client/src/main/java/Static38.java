import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
	public static int anInt1239;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "Lclient!pw;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray30 = new int[8];

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!pn;)Lclient!pn;")
	public static Class4_Sub21_Sub4 method1064(@OriginalArg(1) Class4_Sub21_Sub4 arg0) {
		@Pc(21) Class4_Sub21_Sub4 local21 = arg0 == null ? new Class4_Sub21_Sub4() : new Class4_Sub21_Sub4(arg0);
		local21.method6193();
		return local21;
	}
}

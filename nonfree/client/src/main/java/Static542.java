import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_300 = new Class123(72, 6);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BZ)V")
	public static void method7422(@OriginalArg(1) boolean arg0) {
		Static435.method6003(Static34.anInt3201, arg0, Static79.anInt2118, Static492.anInt8445);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Lclient!vb;")
	public static Class25_Sub2_Sub1 method7423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub2_Sub1_2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eea", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[32];

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)Lclient!eea;")
	public static Class15_Sub5 method2303(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static91.anInt1670 == Static124.anInt2434) {
			return new Class15_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class15_Sub5 local6 = Static190.aClass15_Sub5Array1[Static124.anInt2434];
			Static124.anInt2434 = Static124.anInt2434 + 1 & Static235.anIntArray218[Static169.anInt3597];
			local6.method2308(arg0, arg1);
			return local6;
		}
	}
}

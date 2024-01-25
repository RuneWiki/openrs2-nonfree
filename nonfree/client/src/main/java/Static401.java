import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!od", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[32];

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Lclient!od;")
	public static Class16_Sub7 method5991(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static141.anInt2982 == Static545.anInt8787) {
			return new Class16_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class16_Sub7 local6 = Static629.aClass16_Sub7Array1[Static545.anInt8787];
			Static545.anInt8787 = Static545.anInt8787 + 1 & Static290.anIntArray332[Static626.anInt10188];
			local6.method5994(arg0, arg1);
			return local6;
		}
	}
}

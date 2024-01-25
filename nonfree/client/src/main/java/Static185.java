import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[32];

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZ)Lclient!hda;")
	public static Class21_Sub5 method3047(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static517.anInt10516 == Static179.anInt3755) {
			return new Class21_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class21_Sub5 local6 = Static110.aClass21_Sub5Array1[Static179.anInt3755];
			Static179.anInt3755 = Static179.anInt3755 + 1 & Static414.anIntArray447[Static204.anInt8817];
			local6.method3049(arg0, arg1);
			return local6;
		}
	}
}

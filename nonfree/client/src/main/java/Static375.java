import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[8];

	@OriginalMember(owner = "client!nha", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[32];

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IZ)Lclient!nha;")
	public static Class9_Sub8 method5938(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static417.anInt7331 == Static348.anInt6501) {
			return new Class9_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class9_Sub8 local6 = Static438.aClass9_Sub8Array1[Static348.anInt6501];
			Static348.anInt6501 = Static348.anInt6501 + 1 & Static435.anIntArray452[Static479.anInt7495];
			local6.method5942(arg0, arg1);
			return local6;
		}
	}
}

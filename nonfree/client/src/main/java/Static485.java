import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[32];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)Lclient!qo;")
	public static Class41_Sub7 method7087(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static354.anInt6241 == Static8.anInt169) {
			return new Class41_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class41_Sub7 local6 = Static345.aClass41_Sub7Array1[Static8.anInt169];
			Static8.anInt169 = Static8.anInt169 + 1 & Static603.anIntArray557[Static168.anInt2782];
			local6.method7091(arg0, arg1);
			return local6;
		}
	}
}

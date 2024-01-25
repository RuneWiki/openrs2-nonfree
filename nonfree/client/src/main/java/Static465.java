import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[8];

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray33 = new boolean[32];

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(IZ)Lclient!ru;")
	public static Class55_Sub8 method7126(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static502.anInt9330 == Static406.anInt8003) {
			return new Class55_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class55_Sub8 local6 = Static550.aClass55_Sub8Array7[Static406.anInt8003];
			Static406.anInt8003 = Static406.anInt8003 + 1 & Static223.anIntArray288[Static95.anInt2313];
			local6.method7115(arg0, arg1);
			return local6;
		}
	}
}

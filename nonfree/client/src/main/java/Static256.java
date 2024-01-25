import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!hv", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[32];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)Lclient!hv;")
	public static Class4_Sub7 method3629(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static518.anInt8266 == Static6.anInt5790) {
			return new Class4_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class4_Sub7 local6 = Static317.aClass4_Sub7Array5[Static6.anInt5790];
			Static6.anInt5790 = Static6.anInt5790 + 1 & Static429.anIntArray123[Static261.anInt10710];
			local6.method3639(arg0, arg1);
			return local6;
		}
	}
}

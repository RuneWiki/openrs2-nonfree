import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[8];

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[32];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)Lclient!kw;")
	public static Class4_Sub4 method4593(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static486.anInt7912 == Static510.anInt8899) {
			return new Class4_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class4_Sub4 local6 = Static493.aClass4_Sub4Array139[Static510.anInt8899];
			Static510.anInt8899 = Static510.anInt8899 + 1 & Static215.anIntArray427[Static206.anInt4562];
			local6.method4602(arg0, arg1);
			return local6;
		}
	}
}

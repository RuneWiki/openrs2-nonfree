import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[32];

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[8];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)Lclient!kv;")
	public static Class12_Sub4 method4138(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static211.anInt3063 == Static424.anInt6908) {
			return new Class12_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class12_Sub4 local6 = Static316.aClass12_Sub4Array1[Static424.anInt6908];
			Static424.anInt6908 = Static424.anInt6908 + 1 & Static115.anIntArray171[Static313.anInt5212];
			local6.method4139(arg0, arg1);
			return local6;
		}
	}
}

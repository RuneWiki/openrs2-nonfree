import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[32];

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZ)Lclient!lba;")
	public static Class9_Sub5 method5223(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static478.anInt8414 == Static455.anInt8188) {
			return new Class9_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class9_Sub5 local6 = Static82.aClass9_Sub5Array1[Static455.anInt8188];
			Static455.anInt8188 = Static455.anInt8188 + 1 & Static85.anIntArray87[Static114.anInt2971];
			local6.method5230(arg0, arg1);
			return local6;
		}
	}
}

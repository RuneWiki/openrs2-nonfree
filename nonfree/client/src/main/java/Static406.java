import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray33 = new boolean[8];

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray34 = new boolean[8];

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Lclient!qv;")
	public static Class6_Sub7 method6402(@OriginalArg(0) int arg0) {
		if (Static250.anInt4568 == Static386.anInt7085) {
			return new Class6_Sub7(arg0);
		} else {
			@Pc(6) Class6_Sub7 local6 = Static16.aClass6_Sub7Array1[Static386.anInt7085];
			Static386.anInt7085 = Static386.anInt7085 + 1 & Static538.anIntArray759[Static485.anInt8595];
			local6.method6395(arg0);
			return local6;
		}
	}
}

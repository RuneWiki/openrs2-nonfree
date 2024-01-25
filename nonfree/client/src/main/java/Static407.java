import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)Lclient!qp;")
	public static Class30_Sub7 method5909(@OriginalArg(0) int arg0) {
		if (Static134.anInt2771 == Static528.anInt8608) {
			return new Class30_Sub7(arg0);
		} else {
			@Pc(6) Class30_Sub7 local6 = Static67.aClass30_Sub7Array3[Static528.anInt8608];
			Static528.anInt8608 = Static528.anInt8608 + 1 & Static112.anIntArray210[Static490.anInt8412];
			local6.method5913(arg0);
			return local6;
		}
	}
}

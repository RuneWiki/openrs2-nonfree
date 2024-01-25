import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[32];

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(IZ)Lclient!ju;")
	public static Class2_Sub8 method4176(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static136.anInt2379 == Static597.anInt9777) {
			return new Class2_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class2_Sub8 local6 = Static591.aClass2_Sub8Array1[Static597.anInt9777];
			Static597.anInt9777 = Static597.anInt9777 + 1 & Static376.anIntArray372[Static27.anInt7651];
			local6.method4166(arg0, arg1);
			return local6;
		}
	}
}

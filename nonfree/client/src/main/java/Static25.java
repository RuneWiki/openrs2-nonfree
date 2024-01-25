import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!au", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[32];

	@OriginalMember(owner = "client!au", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[8];

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(IZ)Lclient!au;")
	public static Class1_Sub2 method339(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static249.anInt4563 == Static216.anInt7428) {
			return new Class1_Sub2(arg0, arg1);
		} else {
			@Pc(6) Class1_Sub2 local6 = Static437.aClass1_Sub2Array1[Static216.anInt7428];
			Static216.anInt7428 = Static216.anInt7428 + 1 & Static231.anIntArray204[Static224.anInt4124];
			local6.method327(arg0, arg1);
			return local6;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[32];

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[8];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)Lclient!aj;")
	public static Class2_Sub2 method226(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static206.anInt6643 == Static224.anInt5126) {
			return new Class2_Sub2(arg0, arg1);
		} else {
			@Pc(6) Class2_Sub2 local6 = Static425.aClass2_Sub2Array3[Static224.anInt5126];
			Static224.anInt5126 = Static224.anInt5126 + 1 & Static394.anIntArray467[Static251.anInt5581];
			local6.method229(arg0, arg1);
			return local6;
		}
	}
}

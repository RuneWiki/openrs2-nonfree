import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[32];

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IZ)Lclient!ui;")
	public static Class4_Sub8 method8682(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static44.anInt763 == Static19.anInt252) {
			return new Class4_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class4_Sub8 local6 = Static192.aClass4_Sub8Array5[Static19.anInt252];
			Static19.anInt252 = Static19.anInt252 + 1 & Static435.anIntArray389[Static173.anInt2826];
			local6.method8668(arg0, arg1);
			return local6;
		}
	}
}

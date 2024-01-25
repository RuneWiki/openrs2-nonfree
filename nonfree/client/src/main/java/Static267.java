import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!it", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[32];

	@OriginalMember(owner = "client!it", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)Lclient!it;")
	public static Class60_Sub4 method4553(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static688.anInt10535 == Static450.anInt7768) {
			return new Class60_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class60_Sub4 local6 = Static239.aClass60_Sub4Array1[Static450.anInt7768];
			Static450.anInt7768 = Static450.anInt7768 + 1 & Static493.anIntArray525[Static470.anInt8040];
			local6.method4542(arg0, arg1);
			return local6;
		}
	}
}

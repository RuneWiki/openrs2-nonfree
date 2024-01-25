import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!l", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[32];

	@OriginalMember(owner = "client!l", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray33 = new boolean[8];

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)Lclient!l;")
	public static Class14_Sub8 method4460(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static362.anInt6388 == Static214.anInt3693) {
			return new Class14_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class14_Sub8 local6 = Static270.aClass14_Sub8Array1[Static214.anInt3693];
			Static214.anInt3693 = Static214.anInt3693 + 1 & Static316.anIntArray398[Static210.anInt3641];
			local6.method4448(arg0, arg1);
			return local6;
		}
	}
}

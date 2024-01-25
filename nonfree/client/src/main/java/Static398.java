import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[8];

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[32];

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(IZ)Lclient!nia;")
	public static Class28_Sub5 method5855(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static75.anInt1090 == Static678.anInt10875) {
			return new Class28_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class28_Sub5 local6 = Static529.aClass28_Sub5Array5[Static678.anInt10875];
			Static678.anInt10875 = Static678.anInt10875 + 1 & Static637.anIntArray563[Static537.anInt3990];
			local6.method5854(arg0, arg1);
			return local6;
		}
	}
}

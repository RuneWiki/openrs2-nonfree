import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!waa", name = "y", descriptor = "[[Lclient!uaa;")
	public static Class345[][] aClass345ArrayArray2;

	@OriginalMember(owner = "client!waa", name = "z", descriptor = "I")
	public static final int anInt10458 = -1;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Lclient!rha;")
	public static Class5_Sub3_Sub17 method8696() {
		@Pc(10) Class5_Sub3_Sub17 local10 = (Class5_Sub3_Sub17) Static126.aClass358_3.method8322();
		if (local10 != null) {
			local10.method9052();
			local10.method8687();
			return local10;
		}
		do {
			local10 = (Class5_Sub3_Sub17) Static174.aClass358_5.method8322();
			if (local10 == null) {
				return null;
			}
			if (local10.method7290() > Static547.method7619()) {
				return null;
			}
			local10.method9052();
			local10.method8687();
		} while ((Long.MIN_VALUE & local10.aLong297) == 0L);
		return local10;
	}
}

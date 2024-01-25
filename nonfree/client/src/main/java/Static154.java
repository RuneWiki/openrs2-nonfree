import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "Lclient!db;")
	public static final Class64 aClass64_135 = new Class64(47, 1);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLclient!gba;)V")
	public static void method3086(@OriginalArg(1) Class115 arg0) {
		@Pc(11) Class115 local11 = Static352.method7380(arg0);
		@Pc(19) int local19;
		@Pc(16) int local16;
		if (local11 == null) {
			local19 = Static2.anInt29;
			local16 = Static19.anInt390;
		} else {
			local16 = local11.anInt3481;
			local19 = local11.anInt3474;
		}
		Static591.method7953(false, arg0, local16, local19);
		Static451.method8012(local16, arg0, local19);
	}
}

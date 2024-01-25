import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lba", name = "L", descriptor = "I")
	public static int anInt5496;

	@OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
	public static int anInt5500;

	@OriginalMember(owner = "client!lba", name = "J", descriptor = "Lclient!at;")
	public static final Class20 aClass20_23 = new Class20();

	@OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
	public static int anInt5498 = 0;

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[5];

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!at;IILclient!ha;)V")
	public static void method4929(@OriginalArg(1) Class20 arg0, @OriginalArg(4) Class100 arg1) {
		Static542.aClass20_47.method374();
		if (Static633.aBoolean746) {
			return;
		}
		for (@Pc(22) Class5_Sub49 local22 = (Class5_Sub49) arg0.method378(); local22 != null; local22 = (Class5_Sub49) arg0.method366()) {
			@Pc(30) Class313 local30 = Static491.aClass327_2.method7413(local22.anInt8675);
			if (Static95.method1507(local30)) {
				@Pc(42) boolean local42 = Static476.method6742(arg1, local30, local22);
				if (local42) {
					Static525.method7161(local22, arg1, local30);
				}
			}
		}
	}
}

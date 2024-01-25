import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gf", name = "sb", descriptor = "Lclient!nb;")
	public static Class114 aClass114_1;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "[Lclient!pd;")
	public static final Class188[] aClass188Array1 = new Class188[4];

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
	public static int anInt2545 = 100;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
	public static boolean method2231(@OriginalArg(1) int arg0) {
		if (Static209.aBooleanArray29[arg0]) {
			return true;
		} else if (Static359.aClass246_194.method5489(arg0)) {
			@Pc(23) int local23 = Static359.aClass246_194.method5492(arg0);
			if (local23 == 0) {
				Static209.aBooleanArray29[arg0] = true;
				return true;
			}
			if (Static437.aClass251ArrayArray2[arg0] == null) {
				Static437.aClass251ArrayArray2[arg0] = new Class251[local23];
			}
			for (@Pc(49) int local49 = 0; local49 < local23; local49++) {
				if (Static437.aClass251ArrayArray2[arg0][local49] == null) {
					@Pc(62) byte[] local62 = Static359.aClass246_194.method5477(arg0, local49);
					if (local62 != null) {
						@Pc(74) Class251 local74 = Static437.aClass251ArrayArray2[arg0][local49] = new Class251();
						local74.anInt6689 = local49 + (arg0 << 16);
						if (local62[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local74.method5549(new Class1_Sub5(local62));
					}
				}
			}
			Static209.aBooleanArray29[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

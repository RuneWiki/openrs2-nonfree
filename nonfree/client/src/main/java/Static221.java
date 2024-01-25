import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
	public static int anInt3616 = 765;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Z")
	public static boolean method3276(@OriginalArg(0) int arg0) {
		if (Static478.aBooleanArray12[arg0]) {
			return true;
		} else if (Static567.aClass182_109.method3957(arg0)) {
			@Pc(31) int local31 = Static567.aClass182_109.method3970(arg0);
			if (local31 == 0) {
				Static478.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static172.aClass270ArrayArray2[arg0] == null) {
				Static172.aClass270ArrayArray2[arg0] = new Class270[local31];
			}
			for (@Pc(56) int local56 = 0; local56 < local31; local56++) {
				if (Static172.aClass270ArrayArray2[arg0][local56] == null) {
					@Pc(72) byte[] local72 = Static567.aClass182_109.method3985(local56, arg0);
					if (local72 != null) {
						@Pc(84) Class270 local84 = Static172.aClass270ArrayArray2[arg0][local56] = new Class270();
						local84.anInt6973 = local56 + (arg0 << 16);
						if (local72[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local84.method6005(new Class3_Sub2(local72));
					}
				}
			}
			Static478.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

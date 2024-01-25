import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_111 = new Class21(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
	public static int anInt7324 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([BII[I[I[[BI[[B)I")
	public static int method5882(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg4[arg2];
		@Pc(16) int local16 = local9 + arg3[arg2];
		@Pc(20) int local20 = arg4[arg1];
		@Pc(26) int local26 = local20 + arg3[arg1];
		@Pc(28) int local28 = local9;
		if (local9 < local20) {
			local28 = local20;
		}
		@Pc(48) int local48 = local16;
		if (local26 < local16) {
			local48 = local26;
		}
		@Pc(59) int local59 = arg0[arg2] & 0xFF;
		if (local59 > (arg0[arg1] & 0xFF)) {
			local59 = arg0[arg1] & 0xFF;
		}
		@Pc(76) byte[] local76 = arg5[arg2];
		@Pc(80) byte[] local80 = arg6[arg1];
		@Pc(85) int local85 = local28 - local9;
		@Pc(90) int local90 = local28 - local20;
		for (@Pc(92) int local92 = local28; local92 < local48; local92++) {
			@Pc(104) int local104 = local76[local85++] + local80[local90++];
			if (local104 < local59) {
				local59 = local104;
			}
		}
		return -local59;
	}
}

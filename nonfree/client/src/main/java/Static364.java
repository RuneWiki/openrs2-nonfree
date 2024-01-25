import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	public static int anInt7050;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_9 = new Class147("", 13);

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_19 = new Class162(2, 7);

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public static final int anInt7051 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method5858() {
		for (@Pc(15) Class1_Sub6 local15 = (Class1_Sub6) Static110.aClass136_3.method3292(); local15 != null; local15 = (Class1_Sub6) Static110.aClass136_3.method3292()) {
			Static478.method7174(local15);
		}
		@Pc(36) int local36;
		@Pc(34) int local34;
		if (Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000)) {
			local34 = 3;
			local36 = 0;
		} else {
			local34 = Static223.anInt4078;
			local36 = Static223.anInt4078;
		}
		Static69.method1167();
		for (@Pc(45) int local45 = local36; local45 <= local34; local45++) {
			Static69.method1168();
			Static69.method1176(local45);
			Static69.method1173(local45);
		}
		Static69.method1171();
		Static69.method1175();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method5859() {
		if (Static358.anInt6981 == 1 || Static358.anInt6981 == 3 || Static358.anInt6981 != Static158.anInt3275 && (Static358.anInt6981 == 0 || Static158.anInt3275 == 0)) {
			Static418.anInt7866 = 0;
			Static436.anInt8163 = 0;
			Static585.aClass350_41.method8203();
		}
		Static158.anInt3275 = Static358.anInt6981;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([I[[BIZI[[B[I[B)I")
	public static int method5860(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg0[arg3];
		@Pc(16) int local16 = local9 + arg5[arg3];
		@Pc(25) int local25 = arg0[arg2];
		@Pc(31) int local31 = local25 + arg5[arg2];
		@Pc(33) int local33 = local9;
		if (local25 > local9) {
			local33 = local25;
		}
		@Pc(40) int local40 = local16;
		if (local31 < local16) {
			local40 = local31;
		}
		@Pc(55) int local55 = arg6[arg3] & 0xFF;
		if ((arg6[arg2] & 0xFF) < local55) {
			local55 = arg6[arg2] & 0xFF;
		}
		@Pc(76) byte[] local76 = arg4[arg3];
		@Pc(80) byte[] local80 = arg1[arg2];
		@Pc(85) int local85 = local33 - local9;
		@Pc(90) int local90 = local33 - local25;
		for (@Pc(92) int local92 = local33; local92 < local40; local92++) {
			@Pc(104) int local104 = local80[local90++] + local76[local85++];
			if (local55 > local104) {
				local55 = local104;
			}
		}
		return -local55;
	}
}

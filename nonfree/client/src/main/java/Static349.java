import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!mia", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!mia", name = "j", descriptor = "[I")
	public static final int[] anIntArray404 = new int[1000];

	@OriginalMember(owner = "client!mia", name = "o", descriptor = "I")
	public static int anInt6748 = 0;

	@OriginalMember(owner = "client!mia", name = "r", descriptor = "I")
	public static int anInt6751 = 0;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BIII)I")
	public static int method5808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(22) int local22 = arg1 & arg2 - 1;
		@Pc(26) int local26 = arg0 / arg2;
		@Pc(32) int local32 = arg2 - 1 & arg0;
		@Pc(37) int local37 = Static396.method5710(local26, local7);
		@Pc(44) int local44 = Static396.method5710(local26, local7 + 1);
		@Pc(51) int local51 = Static396.method5710(local26 + 1, local7);
		@Pc(60) int local60 = Static396.method5710(local26 + 1, local7 + 1);
		@Pc(67) int local67 = Static528.method7753(arg2, local37, local22, local44);
		@Pc(74) int local74 = Static528.method7753(arg2, local51, local22, local60);
		return Static528.method7753(arg2, local67, local32, local74);
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIZ)I")
	public static int method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = 255 - arg1;
		@Pc(30) int local30 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg2 & 0xFF00FF) * local12 & 0xFF00FF00 | (arg2 & 0xFF00) * local12 & 0xFF0000) >>> 8) + local30;
	}
}

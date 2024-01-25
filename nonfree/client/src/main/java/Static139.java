import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!hl", name = "U", descriptor = "B")
	public static byte aByte38;

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "Lclient!vg;")
	public static final Class1_Sub33_Sub2 aClass1_Sub33_Sub2_1 = new Class1_Sub33_Sub2(5000);

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "Lclient!j;")
	public static final Class113 aClass113_4 = new Class113(9, 6);

	@OriginalMember(owner = "client!hl", name = "T", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_64 = new Class211(63, 2);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method2130(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static151.anInt2794;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class138 local22 = Static27.aClass232_1.method5047(arg0[local13]);
			if (local22.anInt3492 != -1) {
				@Pc(34) Class51 local34 = (Class51) Static298.aClass227_18.method4863((long) local22.anInt3492);
				if (local34 == null) {
					@Pc(42) Class80 local42 = Static397.method1423(Static145.aClass230_41, local22.anInt3492, 0);
					if (local42 != null) {
						local34 = Static66.aClass164_2.method5360(local42);
						Static298.aClass227_18.method4865(local34, (long) local22.anInt3492);
					}
				}
				if (local34 != null) {
					Static134.aClass51Array10[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)I")
	public static int method2131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return local26 + ((local31 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local31 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}

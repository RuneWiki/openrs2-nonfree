import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!io", name = "p", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_90 = new Class73(49, 3);

	@OriginalMember(owner = "client!io", name = "s", descriptor = "I")
	public static int anInt4275 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)I")
	public static int method3739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static585.anInt9508 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg1 - Static217.anInt3835;
		@Pc(26) int local26 = arg2 - Static217.anInt3841;
		for (@Pc(31) Class6_Sub17 local31 = (Class6_Sub17) Static217.aClass361_25.method7838(); local31 != null; local31 = (Class6_Sub17) Static217.aClass361_25.method7845()) {
			if (arg0 == local31.anInt2970) {
				@Pc(40) int local40 = local31.anInt2963;
				@Pc(43) int local43 = local31.anInt2968;
				@Pc(53) int local53 = Static217.anInt3835 + local40 << 14 | Static217.anInt3841 + local43;
				@Pc(72) int local72 = (local21 - local40) * (local21 - local40) + (local26 - local43) * (local26 - local43);
				if (local14 < 0 || local72 < local16) {
					local16 = local72;
					local14 = local53;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIB)Z")
	public static boolean method3740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static571.method7639(arg1, arg0) || Static516.method7139(arg1, arg0);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IIII)I")
	public static int method3741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static154.aByteArrayArrayArray4[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static154.aByteArrayArrayArray4[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}

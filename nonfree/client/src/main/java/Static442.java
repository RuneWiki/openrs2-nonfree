import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "I")
	public static int anInt10084;

	@OriginalMember(owner = "client!nw", name = "D", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_178 = new Class186(16, -1);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIII)I")
	public static int method8472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = arg2 & 0xF;
		@Pc(22) int local22 = local14 < 8 ? arg3 : arg1;
		@Pc(45) int local45 = local14 < 4 ? arg1 : local14 == 12 || local14 == 14 ? arg3 : arg0;
		return ((local14 & 0x1) == 0 ? local22 : -local22) + ((local14 & 0x2) == 0 ? local45 : -local45);
	}
}

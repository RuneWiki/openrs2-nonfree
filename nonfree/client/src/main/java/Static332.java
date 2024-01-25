import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!rl;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public static int anInt5678 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIB)V")
	public static void method4901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg0, 8);
		local8.method864();
		local8.anInt1028 = arg3;
		local8.anInt1027 = arg1;
		local8.anInt1037 = arg2;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)I")
	public static int method4904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10);
	}
}

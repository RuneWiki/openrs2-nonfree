import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!jq;")
	public static Class153 aClass153_2;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	public static int anInt6635;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_115 = new Class133(87, -1);

	@OriginalMember(owner = "client!og", name = "p", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_85 = new Class158(55, 7);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)Z")
	public static boolean method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static464.method6916(arg1, arg0) & ((arg1 & 0x2000) != 0 | Static469.method7009(arg1, arg0) | Static229.method4100(arg1, arg0));
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFB)I")
	public static int method5543(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		if (local12 < local21 && local30 < local21) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local30 && local21 < local30) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}

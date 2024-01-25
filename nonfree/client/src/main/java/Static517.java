import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rda", name = "L", descriptor = "D")
	public static double aDouble44;

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "Lclient!lga;")
	public static Class223 aClass223_100;

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_101 = new Class241(68, 8);

	@OriginalMember(owner = "client!rda", name = "M", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_160 = new Class322(120, 17);

	@OriginalMember(owner = "client!rda", name = "S", descriptor = "Lclient!fs;")
	public static final Class121 aClass121_8 = new Class121("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)Lclient!lq;")
	public static Class204_Sub1 method7487(@OriginalArg(0) int arg0) {
		return Static217.aBoolean339 && Static535.anInt4137 <= arg0 && Static39.anInt536 >= arg0 ? Static241.aClass204_Sub1Array2[arg0 - Static535.anInt4137] : null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZBLjava/lang/String;Lclient!lga;)Lclient!ip;")
	public static Class176 method7489(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class223 arg2) {
		@Pc(10) int local10 = arg2.method5257(arg1);
		if (local10 == -1) {
			return new Class176(0);
		}
		@Pc(24) int[] local24 = arg2.method5286(local10);
		@Pc(30) Class176 local30 = new Class176(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local32 < local30.anInt5012) {
				@Pc(56) Class6_Sub15 local56 = new Class6_Sub15(arg2.method5267(local24[local42++], local10));
				@Pc(60) int local60 = local56.method3015();
				@Pc(64) int local64 = local56.method3018();
				@Pc(68) int local68 = local56.method3030();
				if (!arg0 && local68 == 1) {
					local30.anInt5012--;
				} else {
					local30.anIntArray272[local32] = local60;
					local30.anIntArray273[local32] = local64;
					local32++;
				}
			}
			return local30;
		}
	}
}

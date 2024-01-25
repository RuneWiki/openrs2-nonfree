import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rga", name = "K", descriptor = "Lclient!la;")
	public static Class54 aClass54_10;

	@OriginalMember(owner = "client!rga", name = "G", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_49 = new Class112();

	@OriginalMember(owner = "client!rga", name = "H", descriptor = "I")
	public static int anInt6105 = 0;

	@OriginalMember(owner = "client!rga", name = "J", descriptor = "[Lclient!jw;")
	public static final Class169[] aClass169Array3 = new Class169[4];

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)Lclient!gu;")
	public static Class119_Sub1 method5154() {
		return Static432.anInt7256 < Static563.aClass119_Sub1Array2.length ? Static563.aClass119_Sub1Array2[Static432.anInt7256++] : null;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!kca;ILclient!r;Lclient!wl;)V")
	public static void method5155(@OriginalArg(0) Class174 arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) Class3_Sub51 arg2) {
		@Pc(10) Class14 local10 = arg0.method4113(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local10.u() > local16) {
			local16 = local10.u();
		}
		@Pc(32) int local32 = arg2.anInt9424;
		@Pc(35) int local35 = arg2.anInt9428;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString30 != null) {
			local37 = Static2.aClass134_1.method3350(null, null, arg0.aString30, Static295.aStringArray19);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static295.aStringArray19[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static449.aClass96_6.method2812(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = local37 * Static449.aClass96_6.method2810() + Static449.aClass96_6.method2809() / 2;
		}
		local55 = local16 / 2 + arg2.anInt9424;
		@Pc(116) int local116 = arg2.anInt9428;
		if (local32 < Static44.anInt9267 + local16) {
			local55 = local39 / 2 + local16 / 2 + Static44.anInt9267 + 10 + 5;
			local32 = Static44.anInt9267;
		} else if (Static44.anInt9265 - local16 < local32) {
			local55 = Static44.anInt9265 - local16 / 2 - local39 / 2 - 10 - 5;
			local32 = Static44.anInt9265 - local16;
		}
		if (local35 < local16 + Static44.anInt9260) {
			local35 = Static44.anInt9260;
			local116 = Static44.anInt9260 + local16 / 2 + 10;
		} else if (local35 > Static44.anInt9259 - local16) {
			local35 = Static44.anInt9259 - local16;
			local116 = Static44.anInt9259 - local41 - local16 / 2 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg2.anInt9424), (double) (local35 - arg2.anInt9428)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7678((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		@Pc(271) int local271 = -2;
		@Pc(273) int local273 = -2;
		if (arg0.aString30 != null) {
			local267 = local55 - local39 / 2 - 5;
			local269 = local116;
			local271 = local267 + local39 + 10;
			local273 = local116 + local37 * Static449.aClass96_6.method2810() + 3;
			if (arg0.anInt4775 != 0) {
				arg1.method7425(local273 - local116, local267, local116, arg0.anInt4775, local271 - local267);
			}
			if (arg0.anInt4780 != 0) {
				arg1.method7379(arg0.anInt4780, local271 - local267, local273 - local116, local116, local267);
			}
			for (@Pc(342) int local342 = 0; local342 < local37; local342++) {
				@Pc(348) String local348 = Static295.aStringArray19[local342];
				if (local37 - 1 > local342) {
					local348 = local348.substring(0, local348.length() - 4);
				}
				Static449.aClass96_6.method2808(arg1, local348, local55, local116, arg0.anInt4768);
				local116 += Static449.aClass96_6.method2810();
			}
		}
		if (arg0.anInt4772 == -1 && arg0.aString30 == null) {
			return;
		}
		@Pc(392) Class3_Sub14 local392 = new Class3_Sub14(arg2);
		local16 >>= 0x1;
		local392.anInt2089 = local32 + local16;
		local392.anInt2091 = local269;
		local392.anInt2085 = local267;
		local392.anInt2088 = local271;
		local392.anInt2087 = local16 + local35;
		local392.anInt2084 = local35 - local16;
		local392.anInt2094 = local273;
		local392.anInt2093 = local32 - local16;
		Static565.aClass112_71.method3079(local392);
	}
}

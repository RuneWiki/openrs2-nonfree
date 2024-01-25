import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
	public static int anInt4625;

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
	public static int anInt4629;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
	public static int anInt4615 = -1;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
	public static int anInt4620 = -1;

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "Lclient!o;")
	public static final Class169 aClass169_248 = new Class169("K", "T", "K", "K");

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_117 = new Class211(29, 12);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4093(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static393.aStringArray89.length; local12++) {
			if (Static393.aStringArray89[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!gu;Lclient!tq;Lclient!lk;B)V")
	public static void method4094(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) Class1_Sub24 arg2) {
		@Pc(10) Class51 local10 = arg0.method1851(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method4685();
		if (local16 < local10.method4681()) {
			local16 = local10.method4681();
		}
		@Pc(28) int local28 = arg2.anInt3617;
		@Pc(36) int local36 = arg2.anInt3615;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(79) int local79;
		if (arg0.aString22 != null) {
			local38 = Static302.aClass110_8.method2414(arg0.aString22, null, Static83.aStringArray20, null);
			for (local56 = 0; local56 < local38; local56++) {
				@Pc(62) String local62 = Static83.aStringArray20[local56];
				if (local38 - 1 > local56) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local79 = Static213.aClass79_7.method1377(local62);
				if (local40 < local79) {
					local40 = local79;
				}
			}
			local42 = Static213.aClass79_7.method1375() * local38 + Static213.aClass79_7.method1374() / 2;
		}
		local56 = arg2.anInt3617 + local16 / 2;
		if (local28 < local16 + Static353.anInt2627) {
			local56 = local16 / 2 + Static353.anInt2627 + local40 / 2 + 5 + 10;
			local28 = Static353.anInt2627;
		} else if (Static353.anInt2631 - local16 < local28) {
			local56 = Static353.anInt2631 - local40 / 2 - local16 / 2 - 10 - 5;
			local28 = Static353.anInt2631 - local16;
		}
		@Pc(167) int local167 = arg2.anInt3615;
		if (local16 + Static353.anInt2626 > local36) {
			local36 = Static353.anInt2626;
			local167 = Static353.anInt2626 + local16 / 2 + 10;
		} else if (local36 > Static353.anInt2624 - local16) {
			local167 = Static353.anInt2624 - local16 / 2 - local42 - 10;
			local36 = Static353.anInt2624 - local16;
		}
		local79 = (int) (Math.atan2((double) (local28 - arg2.anInt3617), (double) (local36 - arg2.anInt3615)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4678((float) local28 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local36, 4096, local79);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg0.aString22 != null) {
			local255 = local56 - local40 / 2 - 5;
			local257 = local167;
			local261 = Static213.aClass79_7.method1375() * local38 + local167 + 3;
			local259 = local255 + local40 + 10;
			if (arg0.anInt2278 != 0) {
				arg1.method5343(local261 - local167, arg0.anInt2278, local167, local255, local259 - local255);
			}
			if (arg0.anInt2275 != 0) {
				arg1.method5397(local259 - local255, local261 + -local167, local255, arg0.anInt2275, local167);
			}
			for (@Pc(329) int local329 = 0; local329 < local38; local329++) {
				@Pc(335) String local335 = Static83.aStringArray20[local329];
				if (local38 - 1 > local329) {
					local335 = local335.substring(0, local335.length() - 4);
				}
				Static213.aClass79_7.method1379(arg1, local335, local56, local167, arg0.anInt2299);
				local167 += Static213.aClass79_7.method1375();
			}
		}
		if (arg0.anInt2268 == -1 && arg0.aString22 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(386) Class1_Sub10 local386 = new Class1_Sub10(arg2);
		local386.anInt1442 = local255;
		local386.anInt1445 = local28 - local16;
		local386.anInt1449 = local36 - local16;
		local386.anInt1446 = local28 + local16;
		local386.anInt1451 = local261;
		local386.anInt1448 = local16 + local36;
		local386.anInt1444 = local257;
		local386.anInt1447 = local259;
		Static35.aClass17_8.method199(local386);
	}
}

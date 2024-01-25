import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "Lclient!jda;")
	public static Class169 aClass169_6;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public static int anInt9699 = 0;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
	public static final int[] anIntArray617 = new int[14];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLclient!mw;)Z")
	public static boolean method7878(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method4994(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(97) int local97;
		@Pc(101) int local101;
		@Pc(107) int local107;
		@Pc(111) int local111;
		if (local8 == 0) {
			if (arg1.method4994(1) != 0) {
				method7878(arg0, arg1);
			}
			local25 = arg1.method4994(6);
			local30 = arg1.method4994(6);
			@Pc(40) boolean local40 = arg1.method4994(1) == 1;
			if (local40) {
				Static511.anIntArray539[Static149.anInt2838++] = arg0;
			}
			if (Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(63) Class66 local63 = Static459.aClass66Array1[arg0];
			@Pc(71) Class11_Sub1_Sub1_Sub3_Sub1 local71 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[arg0] = new Class11_Sub1_Sub1_Sub3_Sub1();
			local71.anInt7524 = arg0;
			if (Static351.aClass1_Sub3Array1[arg0] != null) {
				local71.method2957(Static351.aClass1_Sub3Array1[arg0]);
			}
			local71.method6072(true, local63.anInt1755);
			local71.anInt7528 = local63.anInt1754;
			local97 = local63.anInt1756;
			local101 = local97 >> 28;
			local107 = local97 >> 14 & 0xFF;
			local111 = local97 & 0xFF;
			@Pc(120) int local120 = local25 + (local107 << 6) - Static539.anInt9045;
			@Pc(129) int local129 = (local111 << 6) + local30 - Static311.anInt5708;
			local71.aBoolean259 = local63.aBoolean115;
			local71.aByteArray75[0] = Static226.aByteArray34[arg0];
			local71.aByte113 = local71.aByte112 = (byte) local101;
			if (Static34.method641(local120, local129)) {
				local71.aByte112++;
			}
			local71.method2956(local120, local129);
			local71.aBoolean261 = false;
			Static459.aClass66Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method4994(2);
			local30 = Static459.aClass66Array1[arg0].anInt1756;
			Static459.aClass66Array1[arg0].anInt1756 = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(238) int local238;
			if (local8 != 2) {
				local25 = arg1.method4994(18);
				local30 = local25 >> 16;
				local224 = local25 >> 8 & 0xFF;
				local229 = local25 & 0xFF;
				local238 = Static459.aClass66Array1[arg0].anInt1756;
				local97 = (local238 >> 28) + local30 & 0x3;
				local107 = local224 + (local238 >> 14) & 0xFF;
				local111 = local238 + local229 & 0xFF;
				Static459.aClass66Array1[arg0].anInt1756 = (local97 << 28) + (local107 << 14) + local111;
				return false;
			}
			local25 = arg1.method4994(5);
			local30 = local25 >> 3;
			local224 = local25 & 0x7;
			local229 = Static459.aClass66Array1[arg0].anInt1756;
			local238 = (local229 >> 28) + local30 & 0x3;
			local97 = local229 >> 14 & 0xFF;
			local101 = local229 & 0xFF;
			if (local224 == 0) {
				local101--;
				local97--;
			}
			if (local224 == 1) {
				local101--;
			}
			if (local224 == 2) {
				local97++;
				local101--;
			}
			if (local224 == 3) {
				local97--;
			}
			if (local224 == 4) {
				local97++;
			}
			if (local224 == 5) {
				local97--;
				local101++;
			}
			if (local224 == 6) {
				local101++;
			}
			if (local224 == 7) {
				local97++;
				local101++;
			}
			Static459.aClass66Array1[arg0].anInt1756 = local101 + (local97 << 14) + (local238 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
	public static void method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) Class360 local23 = Static568.aClass360ArrayArrayArray22[arg1][arg2][arg4];
		if (local23 == null) {
			local23 = new Class360(arg1);
		}
		if (arg3 == 1) {
			local23.aShort122 = (short) arg0;
			local23.aShort121 = (short) arg5;
		} else if (arg3 == 2) {
			local23.aShort123 = (short) arg5;
			local23.aShort120 = (short) arg0;
		}
		if (Static312.aBoolean443) {
			Static180.method7714();
		}
	}
}

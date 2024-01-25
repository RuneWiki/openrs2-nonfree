import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!us", name = "M", descriptor = "I")
	public static int anInt6523;

	@OriginalMember(owner = "client!us", name = "T", descriptor = "Lclient!iq;")
	public static Class104 aClass104_180;

	@OriginalMember(owner = "client!us", name = "N", descriptor = "I")
	public static int anInt6524 = 1;

	@OriginalMember(owner = "client!us", name = "S", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_152 = new Class140("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILclient!rm;II)V")
	public static void method5476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt5746 == -1 && arg2.anIntArray451 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg0 > arg2.anInt5741) {
			local15 = arg0 - arg2.anInt5741;
		} else if (arg2.anInt5748 > arg0) {
			local15 = arg2.anInt5748 - arg0;
		}
		@Pc(56) int local56 = arg2.anInt5742 * Static46.anInt752 >> 8;
		if (arg2.anInt5752 < arg4) {
			local15 += arg4 - arg2.anInt5752;
		} else if (arg4 < arg2.anInt5751) {
			local15 += arg2.anInt5751 - arg4;
		}
		if (arg2.anInt5743 == 0 || local15 - 64 > arg2.anInt5743 || Static46.anInt752 == 0 || arg2.anInt5749 != arg3) {
			if (arg2.aClass2_Sub11_Sub4_3 != null) {
				Static31.aClass2_Sub11_Sub3_1.method4110(arg2.aClass2_Sub11_Sub4_3);
				arg2.aClass2_Sub11_Sub4_3 = null;
			}
			if (arg2.aClass2_Sub11_Sub4_2 != null) {
				Static31.aClass2_Sub11_Sub3_1.method4110(arg2.aClass2_Sub11_Sub4_2);
				arg2.aClass2_Sub11_Sub4_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(149) int local149 = (arg2.anInt5743 - local15) * local56 / arg2.anInt5743;
		if (arg2.aClass2_Sub11_Sub4_3 != null) {
			arg2.aClass2_Sub11_Sub4_3.method4961(local149);
		} else if (arg2.anInt5746 >= 0) {
			@Pc(164) Class135 local164 = Static372.method3857(Static80.aClass104_54, arg2.anInt5746, 0);
			if (local164 != null) {
				@Pc(171) Class2_Sub5_Sub1 local171 = local164.method3859().method267(Static179.aClass83_1);
				@Pc(176) Class2_Sub11_Sub4 local176 = Static377.method4980(local171, local149);
				local176.method4977(-1);
				Static31.aClass2_Sub11_Sub3_1.method4108(local176);
				arg2.aClass2_Sub11_Sub4_3 = local176;
			}
		}
		if (arg2.aClass2_Sub11_Sub4_2 != null) {
			arg2.aClass2_Sub11_Sub4_2.method4961(local149);
			if (arg2.aClass2_Sub11_Sub4_2.method5722()) {
				return;
			}
			arg2.aClass2_Sub11_Sub4_2 = null;
		} else if (arg2.anIntArray451 != null && (arg2.anInt5747 -= arg1) <= 0) {
			@Pc(213) int local213 = (int) ((double) arg2.anIntArray451.length * Math.random());
			@Pc(221) Class135 local221 = Static372.method3857(Static80.aClass104_54, arg2.anIntArray451[local213], 0);
			if (local221 != null) {
				@Pc(228) Class2_Sub5_Sub1 local228 = local221.method3859().method267(Static179.aClass83_1);
				@Pc(233) Class2_Sub11_Sub4 local233 = Static377.method4980(local228, local149);
				local233.method4977(0);
				Static31.aClass2_Sub11_Sub3_1.method4108(local233);
				arg2.aClass2_Sub11_Sub4_2 = local233;
				arg2.anInt5747 = (int) (Math.random() * (double) (arg2.anInt5740 - arg2.anInt5745)) + arg2.anInt5745;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
	public static void method5478() {
		Static34.aClass107_1.method3015();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!fh;ILclient!dr;)V")
	public static void method5479(@OriginalArg(0) Class68 arg0, @OriginalArg(2) Class37 arg1) {
		@Pc(34) boolean local34 = Static310.aClass184_2.method5049(arg0.anInt1862 | 0xFF000000, arg0.anInt1866, arg0.anInt1864, arg0.anInt1890, arg1, arg0.anInt1891, arg0.aBoolean165 ? Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 : null) == null;
		if (local34) {
			Static223.aClass180_33.method4909(new Class2_Sub39(arg0.anInt1890, arg0.anInt1866, arg0.anInt1891, arg0.anInt1862 | 0xFF000000, arg0.anInt1864, arg0.aBoolean165));
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(III)V")
	public static void method5480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg1 != Static263.anInt5504) {
			Static269.anIntArray507 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static269.anIntArray507[local9] = (local9 << 12) / arg1;
			}
			Static263.anInt5504 = arg1;
			Static171.anInt3863 = arg1 - 1;
			Static13.anInt218 = arg1 * 32;
		}
		if (arg0 == Static363.anInt6995) {
			return;
		}
		if (Static263.anInt5504 == arg0) {
			Static76.anIntArray121 = Static269.anIntArray507;
		} else {
			Static76.anIntArray121 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static76.anIntArray121[local9] = (local9 << 12) / arg0;
			}
		}
		Static363.anInt6995 = arg0;
		Static241.anInt5135 = arg0 - 1;
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(I)V")
	public static void method5481() {
		@Pc(10) Class107 local10 = Static298.aClass107_46;
		synchronized (Static298.aClass107_46) {
			Static298.aClass107_46.method3015();
		}
		local10 = Static310.aClass107_51;
		synchronized (Static310.aClass107_51) {
			Static310.aClass107_51.method3015();
		}
	}
}

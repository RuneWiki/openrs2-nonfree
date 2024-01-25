import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_60 = new Class7("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt2766 = -1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILclient!pj;I)V")
	public static void method2389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub35 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt5281 == -1 && arg3.anIntArray459 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg3.anInt5285 * Static38.aClass135_Sub1_1.anInt5092 >> 8;
		if (arg3.anInt5286 < arg0) {
			local16 = arg0 - arg3.anInt5286;
		} else if (arg3.anInt5290 > arg0) {
			local16 = arg3.anInt5290 - arg0;
		}
		if (arg3.anInt5289 < arg4) {
			local16 += arg4 - arg3.anInt5289;
		} else if (arg3.anInt5279 > arg4) {
			local16 += arg3.anInt5279 - arg4;
		}
		if (arg3.anInt5283 == 0 || local16 - 64 > arg3.anInt5283 || Static38.aClass135_Sub1_1.anInt5092 == 0 || arg3.anInt5284 != arg2) {
			if (arg3.aClass1_Sub19_Sub1_3 != null) {
				Static59.aClass1_Sub19_Sub2_1.method2185(arg3.aClass1_Sub19_Sub1_3);
				arg3.aClass1_Sub19_Sub1_3 = null;
			}
			if (arg3.aClass1_Sub19_Sub1_4 != null) {
				Static59.aClass1_Sub19_Sub2_1.method2185(arg3.aClass1_Sub19_Sub1_4);
				arg3.aClass1_Sub19_Sub1_4 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(138) int local138 = local24 * (arg3.anInt5283 - local16) / arg3.anInt5283;
		if (arg3.aClass1_Sub19_Sub1_3 != null) {
			arg3.aClass1_Sub19_Sub1_3.method2036(local138);
		} else if (arg3.anInt5281 >= 0) {
			@Pc(153) Class164 local153 = Static466.method3769(Static30.aClass246_24, arg3.anInt5281, 0);
			if (local153 != null) {
				@Pc(160) Class1_Sub20_Sub1 local160 = local153.method3767().method2170(Static187.aClass173_1);
				@Pc(165) Class1_Sub19_Sub1 local165 = Static462.method2026(local160, local138);
				local165.method2038(-1);
				Static59.aClass1_Sub19_Sub2_1.method2188(local165);
				arg3.aClass1_Sub19_Sub1_3 = local165;
			}
		}
		if (arg3.aClass1_Sub19_Sub1_4 != null) {
			arg3.aClass1_Sub19_Sub1_4.method2036(local138);
			if (!arg3.aClass1_Sub19_Sub1_4.method6017()) {
				arg3.aClass1_Sub19_Sub1_4 = null;
			}
		} else if (arg3.anIntArray459 != null && (arg3.anInt5291 -= arg1) <= 0) {
			@Pc(218) int local218 = (int) (Math.random() * (double) arg3.anIntArray459.length);
			@Pc(226) Class164 local226 = Static466.method3769(Static30.aClass246_24, arg3.anIntArray459[local218], 0);
			if (local226 != null) {
				@Pc(233) Class1_Sub20_Sub1 local233 = local226.method3767().method2170(Static187.aClass173_1);
				@Pc(238) Class1_Sub19_Sub1 local238 = Static462.method2026(local233, local138);
				local238.method2038(0);
				Static59.aClass1_Sub19_Sub2_1.method2188(local238);
				arg3.aClass1_Sub19_Sub1_4 = local238;
				arg3.anInt5291 = arg3.anInt5293 + (int) ((double) (arg3.anInt5287 - arg3.anInt5293) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	public static int method2390() {
		@Pc(10) Class39 local10 = Static415.aClass39_11;
		@Pc(12) boolean local12 = false;
		if (anInt2766 != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local10 = Static459.method4522(null, 0, null, local21, 0);
			local12 = true;
		}
		@Pc(38) long local38 = Static279.method4058();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local10.method4506();
		}
		@Pc(64) int local64 = (int) (Static279.method4058() - local38);
		local10.method4563(0, -16777216, 100, 0, 100);
		if (local12) {
			local10.method4523();
		}
		return local64;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!uq;ILclient!ma;IJIII)V")
	public static void method2391(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg4 * arg4 + arg7 * arg7;
		if (arg5 < (long) local11) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg1.anInt6687 / 2, arg1.anInt6677 / 2);
		if (local11 <= local32 * local32) {
			Static451.method5929(Static410.aClass143Array13[arg6], arg0, arg2, arg7, arg4, arg1, arg3);
			return;
		}
		local32 -= 10;
		@Pc(48) int local48;
		if (Static345.anInt5797 == 4) {
			local48 = (int) Static142.aFloat89 & 0x3FFF;
		} else {
			local48 = (int) Static142.aFloat89 + Static82.anInt1815 & 0x3FFF;
		}
		@Pc(62) int local62 = Class183.anIntArray433[local48];
		@Pc(66) int local66 = Class183.anIntArray434[local48];
		if (Static345.anInt5797 != 4) {
			local66 = local66 * 256 / (Static119.anInt840 + 256);
			local62 = local62 * 256 / (Static119.anInt840 + 256);
		}
		@Pc(98) int local98 = local62 * arg7 + arg4 * local66 >> 15;
		@Pc(109) int local109 = local66 * arg7 - local62 * arg4 >> 15;
		@Pc(115) double local115 = Math.atan2((double) local98, (double) local109);
		@Pc(122) int local122 = (int) ((double) local32 * Math.sin(local115));
		@Pc(129) int local129 = (int) ((double) local32 * Math.cos(local115));
		Static384.aClass143Array12[arg6].method5721((float) arg0 + (float) arg1.anInt6687 / 2.0F + (float) local122, (float) -local129 + (float) arg1.anInt6677 / 2.0F + (float) arg2, 4096, (int) (-local115 / 6.283185307179586D * 65535.0D));
	}
}

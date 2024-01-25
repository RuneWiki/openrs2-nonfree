import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public static int anInt5984;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public static int anInt5980 = 2;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public static int anInt5983 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)V")
	public static void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static256.aClass45ArrayArrayArray2 == null) {
			return;
		}
		@Pc(24) long local24 = (long) (arg1 | arg0 << 28 | arg2 << 14);
		@Pc(30) Class3_Sub40 local30 = (Class3_Sub40) Static128.aClass24_18.method609(local24);
		if (local30 == null) {
			Static5.method89(arg0, arg1, arg2);
			return;
		}
		@Pc(44) Class3_Sub38 local44 = (Class3_Sub38) local30.aClass127_41.method3402();
		if (local44 == null) {
			Static5.method89(arg0, arg1, arg2);
			return;
		}
		@Pc(58) Class5_Sub2_Sub1 local58 = (Class5_Sub2_Sub1) Static5.method89(arg0, arg1, arg2);
		if (local58 == null) {
			local58 = new Class5_Sub2_Sub1();
		} else {
			local58.anInt2124 = local58.anInt2127 = -1;
		}
		local58.anInt2126 = local44.anInt5434;
		local58.anInt2118 = local44.anInt5431;
		label44: while (true) {
			@Pc(86) Class3_Sub38 local86 = (Class3_Sub38) local30.aClass127_41.method3400();
			if (local86 == null) {
				break;
			}
			if (local58.anInt2126 != local86.anInt5434) {
				local58.anInt2124 = local86.anInt5434;
				local58.anInt2122 = local86.anInt5431;
				while (true) {
					@Pc(111) Class3_Sub38 local111 = (Class3_Sub38) local30.aClass127_41.method3400();
					if (local111 == null) {
						break label44;
					}
					if (local58.anInt2126 != local111.anInt5434 && local111.anInt5434 != local58.anInt2124) {
						local58.anInt2125 = local111.anInt5431;
						local58.anInt2127 = local111.anInt5434;
					}
				}
			}
		}
		@Pc(159) int local159 = Static286.method4919((arg1 << 7) + 64, (arg2 << 7) + 64, arg0);
		Static308.method5182(arg0, arg1, arg2, local159, local58);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public static void method5086() {
		if (Static238.anInt4781 > 0) {
			Static251.method4218();
		} else {
			Static6.aClass16_5 = Static76.aClass16_2;
			Static76.aClass16_2 = null;
			Static353.method5714(40);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!qr;IB)V")
	public static void method5087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class170 arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class3_Sub12 local10 = (Class3_Sub12) Static269.aClass127_28.method3402(); local10 != null; local10 = (Class3_Sub12) Static269.aClass127_28.method3400()) {
			if (local10.anInt1267 == arg1 && arg3 * 128 == local10.anInt1261 && local10.anInt1272 == arg0 * 128 && local10.aClass170_1.anInt5232 == arg2.anInt5232) {
				if (local10.aClass3_Sub2_Sub3_2 != null) {
					Static273.aClass3_Sub2_Sub2_2.method1367(local10.aClass3_Sub2_Sub3_2);
					local10.aClass3_Sub2_Sub3_2 = null;
				}
				if (local10.aClass3_Sub2_Sub3_1 != null) {
					Static273.aClass3_Sub2_Sub2_2.method1367(local10.aClass3_Sub2_Sub3_1);
					local10.aClass3_Sub2_Sub3_1 = null;
				}
				local10.method5717();
				return;
			}
		}
	}
}

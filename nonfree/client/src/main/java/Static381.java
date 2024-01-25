import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILclient!fa;BILclient!faa;IJI)V")
	public static void method5580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class97 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg3 * arg3 + arg1 * arg1;
		if ((long) local15 > arg6) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg4.anInt2690 / 2, arg4.anInt2670 / 2);
		if (local15 <= local35 * local35) {
			Static509.method5847(arg0, Static143.aClass71Array17[arg5], arg3, arg2, arg1, arg4, arg7);
			return;
		}
		local35 -= 10;
		@Pc(54) int local54;
		if (Static60.anInt1008 == 4) {
			local54 = (int) Static562.aFloat14 & 0x3FFF;
		} else {
			local54 = (int) Static562.aFloat14 + Static63.anInt1086 & 0x3FFF;
		}
		@Pc(65) int local65 = Class22.anIntArray20[local54];
		@Pc(69) int local69 = Class22.anIntArray19[local54];
		if (Static60.anInt1008 != 4) {
			local65 = local65 * 256 / (Static213.anInt4015 + 256);
			local69 = local69 * 256 / (Static213.anInt4015 + 256);
		}
		@Pc(99) int local99 = local65 * arg1 + local69 * arg3 >> 14;
		@Pc(110) int local110 = arg1 * local69 - local65 * arg3 >> 14;
		@Pc(116) double local116 = Math.atan2((double) local99, (double) local110);
		@Pc(123) int local123 = (int) ((double) local35 * Math.sin(local116));
		@Pc(130) int local130 = (int) (Math.cos(local116) * (double) local35);
		Static353.aClass71Array39[arg5].method7768((float) local123 + (float) arg4.anInt2690 / 2.0F + (float) arg0, (float) -local130 + (float) arg7 + (float) arg4.anInt2670 / 2.0F, 4096, (int) (-local116 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	public static void method5581(@OriginalArg(1) int arg0) {
		Static526.anInt9112 = arg0;
		Static18.anInt5702 = 2;
		if (Static299.aString45 == null) {
			Static36.method607(35);
		} else {
			@Pc(35) Class6_Sub12 local35 = new Class6_Sub12(Static404.method5837(Static207.method3393(Static299.aString45)));
			@Pc(39) long local39 = local35.method6016();
			Static326.aLong152 = local35.method6016();
			Static278.method4182("", true, Static383.method5604(local39));
		}
	}
}

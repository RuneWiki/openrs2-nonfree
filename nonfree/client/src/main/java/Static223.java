import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "[[[Lclient!hg;")
	public static Class101[][][] aClass101ArrayArrayArray2;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_78 = new Class92(22, 2);

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public static int anInt4049 = 0;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "[I")
	public static final int[] anIntArray294 = new int[2048];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILclient!pp;)Lclient!vg;")
	public static Class6_Sub2_Sub17 method3357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class198 arg2) {
		@Pc(19) int local19 = arg2.anInt5422 | arg1 << 8;
		@Pc(28) Class6_Sub2_Sub17 local28 = (Class6_Sub2_Sub17) Static439.aClass243_3.method5962((long) local19 << 16);
		if (local28 != null) {
			return local28;
		}
		@Pc(40) byte[] local40 = Static321.aClass100_60.method2515(Static321.aClass100_60.method2513(local19));
		if (local40 == null) {
			local19 = arg2.anInt5422 | arg0 + 65536 << 8;
			local28 = (Class6_Sub2_Sub17) Static439.aClass243_3.method5962((long) local19 << 16);
			if (local28 != null) {
				return local28;
			}
			local40 = Static321.aClass100_60.method2515(Static321.aClass100_60.method2513(local19));
			if (local40 == null) {
				local19 = arg2.anInt5422 | 0xFFFF00;
				local28 = (Class6_Sub2_Sub17) Static439.aClass243_3.method5962((long) local19 << 16);
				if (local28 != null) {
					return local28;
				}
				local40 = Static321.aClass100_60.method2515(Static321.aClass100_60.method2513(local19));
				if (local40 == null) {
					return null;
				} else if (local40.length <= 1) {
					return null;
				} else {
					local28 = Static414.method5821(local40);
					local28.aClass198_8 = arg2;
					Static439.aClass243_3.method5960(local28, (long) local19 << 16);
					return local28;
				}
			} else if (local40.length <= 1) {
				return null;
			} else {
				local28 = Static414.method5821(local40);
				local28.aClass198_8 = arg2;
				Static439.aClass243_3.method5960(local28, (long) local19 << 16);
				return local28;
			}
		} else if (local40.length <= 1) {
			return null;
		} else {
			local28 = Static414.method5821(local40);
			local28.aClass198_8 = arg2;
			Static439.aClass243_3.method5960(local28, (long) local19 << 16);
			return local28;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILclient!vh;)V")
	public static void method3359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub43 arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg2 << 14 | arg0 << 28);
		@Pc(22) Class6_Sub22 local22 = (Class6_Sub22) Static165.aClass74_15.method1883(local16);
		if (local22 == null) {
			local22 = new Class6_Sub22();
			Static165.aClass74_15.method1890(local16, local22);
			local22.aClass244_20.method5966(arg3);
			return;
		}
		@Pc(45) Class4 local45 = Static380.aClass231_2.method5648(arg3.anInt7502);
		@Pc(48) int local48 = local45.anInt68;
		if (local45.anInt105 == 1) {
			local48 *= arg3.anInt7504 + 1;
		}
		for (@Pc(65) Class6_Sub43 local65 = (Class6_Sub43) local22.aClass244_20.method5976(); local65 != null; local65 = (Class6_Sub43) local22.aClass244_20.method5964()) {
			local45 = Static380.aClass231_2.method5648(local65.anInt7502);
			@Pc(76) int local76 = local45.anInt68;
			if (local45.anInt105 == 1) {
				local76 *= local65.anInt7504 + 1;
			}
			if (local76 < local48) {
				Static202.method3124(arg3, local65);
				return;
			}
		}
		local22.aClass244_20.method5966(arg3);
	}
}

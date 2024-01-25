import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
	public static final int[] anIntArray595 = new int[4];

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "[Lclient!cfa;")
	public static final Class49[] aClass49Array1 = new Class49[6];

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
	public static void method6272() {
		for (@Pc(3) int local3 = 0; local3 < Static231.anInt3927; local3++) {
			@Pc(9) Class172 local9 = Static103.aClass172Array7[local3];
			if (local9.aByte56 == 3) {
				if (local9.aClass6_Sub19_Sub2_3 == null) {
					local9.anInt4244 = Integer.MIN_VALUE;
				} else {
					Static144.aClass6_Sub19_Sub3_2.method6424(local9.aClass6_Sub19_Sub2_3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILjava/lang/String;)Lclient!ot;")
	public static Class69 method6273(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class69 local8;
		try {
			local8 = (Class69) Class.forName("Class69_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class69_Sub2();
		}
		local8.aString66 = arg1;
		local8.anInt4617 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!cr;)[Lclient!mh;")
	public static Class199[] method6275(@OriginalArg(1) Class57 arg0) {
		if (!arg0.method915()) {
			return new Class199[0];
		}
		@Pc(18) Class278 local18 = arg0.method933();
		while (local18.anInt7757 == 0) {
			Static149.method2211(10L);
		}
		if (local18.anInt7757 == 2) {
			return new Class199[0];
		}
		@Pc(44) int[] local44 = (int[]) local18.anObject24;
		@Pc(50) Class199[] local50 = new Class199[local44.length >> 2];
		for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
			@Pc(58) Class199 local58 = new Class199();
			local50[local52] = local58;
			local58.anInt5562 = local44[local52 << 2];
			local58.anInt5559 = local44[(local52 << 2) + 1];
			local58.anInt5565 = local44[(local52 << 2) + 2];
			local58.anInt5564 = local44[(local52 << 2) + 3];
		}
		return local50;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
	public static int anInt7546;

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
	public static int anInt7542 = 0;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!aq;B)V")
	public static void method6514(@OriginalArg(0) Class22_Sub1 arg0) {
		@Pc(16) byte[] local16;
		if (Static259.anObject8 == null) {
			@Pc(9) Class112_Sub1_Sub1 local9 = new Class112_Sub1_Sub1();
			local16 = local9.method4089();
			Static259.anObject8 = Static508.method6908(local16);
		}
		if (Static685.anObject12 == null) {
			@Pc(27) Class112_Sub2_Sub1 local27 = new Class112_Sub2_Sub1();
			local16 = local27.method3325();
			Static685.anObject12 = Static508.method6908(local16);
		}
		@Pc(42) Class204 local42 = arg0.aClass204_1;
		if (local42.method4776() && Static536.anObject15 == null) {
			local16 = Static196.method3481(0.5F, 4.0F, 4.0F, 16.0F, 0.6F, new Class75_Sub1(419684));
			Static536.anObject15 = Static508.method6908(local16);
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)I")
	public static int method6515() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		if (Static122.aClass47_1.aBoolean105 && !Static122.aClass47_1.aBoolean106) {
			local13 = true;
			if (Static12.aClass3_Sub39_12.anInt5861 < 512 && Static12.aClass3_Sub39_12.anInt5861 != 0) {
				local13 = false;
			}
			if (Static60.aString26.startsWith("win")) {
				local17 = true;
				local15 = true;
			} else {
				local15 = true;
			}
		}
		if (Static552.aBoolean568) {
			local17 = false;
		}
		if (Static59.aBoolean104) {
			local15 = false;
		}
		if (Static435.aBoolean442) {
			local13 = false;
		}
		if (!local13 && !local15 && !local17) {
			return Static680.method9049();
		}
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		if (local13) {
			try {
				local82 = Static93.method1944(1000, 2);
			} catch (@Pc(95) Exception local95) {
			}
		}
		if (local17) {
			try {
				local86 = Static93.method1944(1000, 3);
				if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 3) {
					@Pc(112) Class19 local112 = Static153.aClass22_4.method9364();
					@Pc(117) long local117 = local112.aLong21 & 0xFFFFFFFFFFFFL;
					@Pc(120) int local120 = local112.anInt738;
					if (local120 == 4318) {
						local15 &= local117 >= 64425238954L;
					} else if (local120 == 4098) {
						local15 &= local117 >= 60129613779L;
					}
				}
			} catch (@Pc(168) Exception local168) {
			}
		}
		if (local15) {
			try {
				local84 = Static93.method1944(1000, 1);
			} catch (@Pc(178) Exception local178) {
			}
		}
		if (local82 == -1 && local84 == -1 && local86 == -1) {
			return Static680.method9049();
		}
		local84 = (int) ((float) local84 * 1.1F);
		local86 = (int) ((float) local86 * 1.1F);
		if (local82 > local86 && local82 > local84) {
			return Static608.method7801(local82);
		} else if (local86 > local84) {
			return Static637.method7548(3, local86);
		} else {
			return Static637.method7548(1, local84);
		}
	}
}

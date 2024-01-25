import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
	public static void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static551.aClass183_13.method4453(Static573.aClass345_26.method7951(Static496.anInt7407));
		@Pc(64) int local64;
		@Pc(36) int local36;
		if (Static193.aBoolean754) {
			for (@Pc(20) Class2_Sub7_Sub20 local20 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local20 != null; local20 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
				if (local20.anInt9985 == 1) {
					local36 = Static185.method3166((Class2_Sub7_Sub21) local20.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66);
				} else {
					local36 = Static579.method8032(local20);
				}
				if (local36 > local13) {
					local13 = local36;
				}
			}
			local64 = Static471.anInt7593 * 16 + 21;
			Static240.anInt9646 = Static471.anInt7593 * 16 + (Static266.aBoolean372 ? 26 : 22);
			local13 += 8;
		} else {
			for (@Pc(82) Class2_Sub7_Sub21 local82 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local82 != null; local82 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
				local36 = Static185.method3166(local82);
				if (local13 < local36) {
					local13 = local36;
				}
			}
			local64 = Static633.anInt10265 * 16 + 21;
			local13 += 8;
			Static240.anInt9646 = (Static266.aBoolean372 ? 26 : 22) + Static633.anInt10265 * 16;
		}
		@Pc(128) int local128 = arg1 - local13 / 2;
		if (local128 + local13 > Class16_Sub1_Sub5_Sub1.lb) {
			local128 = Class16_Sub1_Sub5_Sub1.lb - local13;
		}
		if (local128 < 0) {
			local128 = 0;
		}
		local36 = arg0;
		if (Static71.anInt1925 < arg0 + local64) {
			local36 = Static71.anInt1925 - local64;
		}
		Static441.anInt7238 = local128;
		if (local36 < 0) {
			local36 = 0;
		}
		Static131.anInt2708 = local13;
		Static250.anInt4790 = local36;
		Static113.aBoolean192 = true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
	public static void method4635() {
		@Pc(5) Class82 local5 = null;
		try {
			local5 = Static465.method6576("2");
			@Pc(23) Class2_Sub17 local23 = new Class2_Sub17(Static621.anInt10146 * 6 + 3);
			local23.method2837(1);
			local23.method2879(Static621.anInt10146);
			for (@Pc(33) int local33 = 0; local33 < Static450.anIntArray501.length; local33++) {
				if (Static226.aBooleanArray6[local33]) {
					local23.method2879(local33);
					local23.method2827(Static450.anIntArray501[local33]);
				}
			}
			local5.method2007(0, local23.anInt3378, local23.aByteArray26);
		} catch (@Pc(67) Exception local67) {
		}
		try {
			if (local5 != null) {
				local5.method2011();
			}
		} catch (@Pc(74) Exception local74) {
		}
		Static641.aLong271 = Static48.method1203();
		Static342.aBoolean425 = false;
	}
}

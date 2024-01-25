import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!mga", name = "v", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_68 = new Class223(64);

	@OriginalMember(owner = "client!mga", name = "w", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_14 = new Class307(2, 2);

	@OriginalMember(owner = "client!mga", name = "y", descriptor = "Z")
	public static boolean aBoolean717 = false;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZILclient!rda;)V")
	public static void method8270(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub4_Sub2_Sub1_Sub2 arg1) {
		if (Static339.anInt6583 >= 400) {
			return;
		}
		if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 != arg1) {
			@Pc(89) String local89;
			@Pc(148) int local148;
			if (arg1.anInt8469 == 0) {
				@Pc(100) boolean local100 = true;
				if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8451 != -1 && arg1.anInt8451 != -1) {
					@Pc(123) int local123 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465 <= arg1.anInt8465 ? arg1.anInt8465 : Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465;
					@Pc(138) int local138 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8451 >= arg1.anInt8451 ? arg1.anInt8451 : Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8451;
					local148 = local138 + local123 * 10 / 100 + 5;
					@Pc(154) int local154 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465 - arg1.anInt8465;
					if (local154 < 0) {
						local154 = -local154;
					}
					if (local154 > local148) {
						local100 = false;
					}
				}
				@Pc(177) String local177 = Static438.aClass92_4 == Static264.aClass92_3 ? Static590.aClass364_34.method8334(Static154.anInt3181) : Static590.aClass364_32.method8334(Static154.anInt3181);
				if (arg1.anInt8465 < arg1.anInt8473) {
					local89 = arg1.method6949() + (local100 ? Static459.method6996(arg1.anInt8465, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465) : "<col=ffffff>") + " (" + local177 + arg1.anInt8465 + "+" + (arg1.anInt8473 - arg1.anInt8465) + ")";
				} else {
					local89 = arg1.method6949() + (local100 ? Static459.method6996(arg1.anInt8465, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465) : "<col=ffffff>") + " (" + local177 + arg1.anInt8465 + ")";
				}
			} else if (arg1.anInt8469 == -1) {
				local89 = arg1.method6949();
			} else {
				local89 = arg1.method6949() + " (" + Static590.aClass364_33.method8334(Static154.anInt3181) + arg1.anInt8469 + ")";
			}
			if (Static418.aBoolean541 && !arg0 && (Static163.anInt3317 & 0x8) != 0) {
				Static369.method5938((long) arg1.anInt8435, 16, false, -1, Static397.anInt7611, 0, Static152.aString28, 0, true, Static551.aString95 + " -> <col=ffffff>" + local89);
			}
			if (arg0) {
				Static369.method5938(0L, -1, true, 0, -1, 0, "<col=cccccc>" + local89, 0, false, "");
			} else {
				for (@Pc(296) int local296 = 7; local296 >= 0; local296--) {
					if (Static394.aStringArray50[local296] != null) {
						@Pc(304) short local304 = 0;
						if (Static438.aClass92_4 == Static248.aClass92_2 && Static394.aStringArray50[local296].equalsIgnoreCase(Static590.aClass364_27.method8334(Static154.anInt3181))) {
							if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465 < arg1.anInt8465) {
								local304 = 2000;
							}
							if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8458 != 0 && arg1.anInt8458 != 0) {
								if (arg1.anInt8458 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8458) {
									local304 = 2000;
								} else {
									local304 = 0;
								}
							}
						} else if (Static205.aBooleanArray7[local296]) {
							local304 = 2000;
						}
						@Pc(363) short local363 = (short) (Static347.aShortArray76[local296] + local304);
						local148 = Static377.anIntArray368[local296] == -1 ? Static114.anInt9773 : Static377.anIntArray368[local296];
						Static369.method5938((long) arg1.anInt8435, local363, false, -1, local148, 0, Static394.aStringArray50[local296], 0, true, "<col=ffffff>" + local89);
					}
				}
			}
			if (!arg0) {
				for (@Pc(434) Class4_Sub39 local434 = (Class4_Sub39) Static40.aClass244_4.method5963(); local434 != null; local434 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
					if (local434.anInt8541 == 60) {
						local434.aString80 = "<col=ffffff>" + local89;
						return;
					}
				}
			}
		} else if (Static418.aBoolean541 && (Static163.anInt3317 & 0x10) != 0) {
			Static369.method5938(0L, 50, false, -1, Static397.anInt7611, 0, Static152.aString28, 0, true, Static551.aString95 + " -> <col=ffffff>" + Static590.aClass364_41.method8334(Static154.anInt3181));
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[B)I")
	public static int method8273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg0; local12++) {
			local5 = Class276.anIntArray426[(arg2[local12] ^ local5) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "(I)V")
	public static void method8277() {
		Static366.method7089();
		Static204.aClass36_8 = null;
		Static231.aClass36_4 = null;
		Static458.aClass44_13 = null;
		Static442.aClass112ArrayArray1 = null;
		Static243.aClass36_6 = null;
	}
}

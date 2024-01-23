import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!kb;")
	public static Class83 aClass83_200;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1 aClass1_Sub2_Sub14_Sub1_5;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public static int anInt6099 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!tl;")
	public static Class155 aClass155_47 = new Class155(5);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class1_Sub2_Sub8 method4731(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub8 local6 = (Class1_Sub2_Sub8) Static114.aClass125_3.method3669((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 < 32768) {
			local23 = Static105.aClass83_201.method2306(0, arg0);
		} else {
			local23 = Static229.aClass83_154.method2306(0, arg0 & 0x7FFF);
		}
		local6 = new Class1_Sub2_Sub8();
		if (local23 != null) {
			local6.method1475(new Class1_Sub16(local23));
		}
		if (arg0 >= 32768) {
			local6.method1471();
		}
		Static114.aClass125_3.method3671(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!gn;B)[Lclient!co;")
	public static Class33[] method4732(@OriginalArg(0) Class66 arg0) {
		if (!arg0.method1610()) {
			return new Class33[0];
		}
		@Pc(16) Class43 local16 = arg0.method1604();
		while (local16.anInt1456 == 0) {
			Static230.method4022(10L);
		}
		if (local16.anInt1456 == 2) {
			return new Class33[0];
		}
		@Pc(42) int[] local42 = (int[]) local16.anObject3;
		@Pc(48) Class33[] local48 = new Class33[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(58) Class33 local58 = new Class33();
			local48[local50] = local58;
			local58.anInt1166 = local42[local50 << 2];
			local58.anInt1158 = local42[(local50 << 2) + 1];
			local58.anInt1165 = local42[(local50 << 2) + 2];
			local58.anInt1160 = local42[(local50 << 2) + 3];
		}
		return local48;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method4733() {
		if (Static117.aClass116_7 != null || Static204.aClass116_11 != null) {
			return;
		}
		@Pc(16) int local16 = Static242.anInt5298;
		@Pc(88) int local88;
		@Pc(94) int local94;
		if (!Static218.aBoolean267) {
			if (local16 == 1 && Static111.anInt2398 > 0) {
				@Pc(36) short local36 = Static213.aShortArray71[Static111.anInt2398 - 1];
				if (local36 == 21 || local36 == 35 || local36 == 5 || local36 == 47 || local36 == 20 || local36 == 38 || local36 == 3 || local36 == 10 || local36 == 7 || local36 == 46 || local36 == 33 || local36 == 1002) {
					local88 = Static218.anIntArray494[Static111.anInt2398 - 1];
					local94 = Static52.anIntArray147[Static111.anInt2398 - 1];
					@Pc(98) Class116 local98 = Static115.method1897(local94);
					@Pc(101) Class1_Sub8 local101 = Static37.method866(local98);
					if (local101.method1102() || local101.method1100()) {
						Static169.anInt3855 = 0;
						Static128.aBoolean147 = false;
						if (Static117.aClass116_7 != null) {
							Static189.method3378(Static117.aClass116_7);
						}
						Static117.aClass116_7 = Static115.method1897(local94);
						Static1.anInt74 = Static279.anInt5967;
						Static213.anInt4721 = Static182.anInt4419;
						Static219.anInt4895 = local88;
						Static189.method3378(Static117.aClass116_7);
						return;
					}
				}
			}
			if (local16 == 1 && (Static82.anInt1966 == 1 && Static111.anInt2398 > 2 || Static161.method3006(Static111.anInt2398 - 1))) {
				local16 = 2;
			}
			if (local16 == 2 && Static111.anInt2398 > 0 || Static259.anInt5653 == 1) {
				Static35.method730();
			}
			if (local16 == 1 && Static111.anInt2398 > 0 || Static259.anInt5653 == 2) {
				Static259.method4399();
			}
			return;
		}
		@Pc(196) int local196;
		if (local16 != 1) {
			local196 = Static84.anInt1989;
			local88 = Static212.anInt4711;
			if (local196 < Static204.anInt4548 - 10 || Static204.anInt4548 + Static82.anInt1976 + 10 < local196 || local88 < Static35.anInt922 - 10 || Static35.anInt922 + Static66.anInt3695 + 10 < local88) {
				Static218.aBoolean267 = false;
				Static205.method3644(Static82.anInt1976, Static204.anInt4548, Static66.anInt3695, Static35.anInt922);
			}
		}
		if (local16 != 1) {
			return;
		}
		local196 = Static204.anInt4548;
		local88 = Static35.anInt922;
		local94 = Static82.anInt1976;
		@Pc(262) int local262 = Static182.anInt4419;
		@Pc(264) int local264 = Static279.anInt5967;
		@Pc(266) int local266 = -1;
		for (@Pc(268) int local268 = 0; local268 < Static111.anInt2398; local268++) {
			@Pc(291) int local291;
			if (Static236.aBoolean285) {
				local291 = (Static111.anInt2398 - local268 - 1) * 15 + local88 + 33;
				if (local196 < local262 && local262 < local94 + local196 && local264 > local291 - 13 && local291 + 3 > local264) {
					local266 = local268;
				}
			} else {
				local291 = local88 + (-local268 + Static111.anInt2398 + -1) * 15 + 31;
				if (local262 > local196 && local196 + local94 > local262 && local291 - 13 < local264 && local264 < local291 + 3) {
					local266 = local268;
				}
			}
		}
		if (local266 != -1) {
			Static236.method4087(local266);
		}
		Static218.aBoolean267 = false;
		Static205.method3644(Static82.anInt1976, Static204.anInt4548, Static66.anInt3695, Static35.anInt922);
	}
}

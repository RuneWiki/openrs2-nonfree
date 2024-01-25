import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "Lclient!jq;")
	public static Class175 aClass175_3;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "Lclient!ws;")
	public static Class392 aClass392_2;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "Lclient!la;")
	public static Class208 aClass208_120;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_17 = new Class361(1, 2);

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "Lclient!ef;")
	public static final Class102 aClass102_65 = new Class102();

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_14 = new Class370(12, 7);

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_51 = new Class391(50);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method7908(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIB)V")
	public static void method7909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class5_Sub22 local6 = (Class5_Sub22) Static343.aClass102_41.method1916(); local6 != null; local6 = (Class5_Sub22) Static343.aClass102_41.method1915()) {
			Static42.method1538(arg2, arg0, arg3, local6, arg1);
		}
		@Pc(232) boolean local232;
		for (@Pc(33) Class5_Sub22 local33 = (Class5_Sub22) Static509.aClass102_60.method1916(); local33 != null; local33 = (Class5_Sub22) Static509.aClass102_60.method1915()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class101 local44 = local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.method5991(99);
			if (local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 == -1 || local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.aBoolean543) {
				local39 = 0;
			} else if (local44.anInt2168 == local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 || local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 == local44.anInt2179 || local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 == local44.anInt2197 || local44.anInt2185 == local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008) {
				local39 = 2;
			} else if (local44.anInt2165 == local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 || local44.anInt2205 == local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 || local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 == local44.anInt2182 || local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt7008 == local44.anInt2172) {
				local39 = 3;
			}
			if (local33.anInt3957 != local39) {
				@Pc(166) int local166 = Static242.method3548(local33.aClass8_Sub1_Sub3_Sub2_Sub2_1);
				@Pc(170) Class227 local170 = local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.aClass227_1;
				if (local170.anIntArray341 != null) {
					local170 = local170.method5322(Static413.aClass118_1);
				}
				if (local170 == null || local166 == -1) {
					local33.anInt3954 = -1;
					local33.anInt3957 = local39;
					local33.aBoolean307 = false;
				} else if (local166 == local33.anInt3954 && local33.aBoolean307 == local170.aBoolean465) {
					local33.anInt3955 = local170.anInt6235;
					local33.anInt3957 = local39;
				} else {
					local232 = false;
					if (local33.aClass5_Sub16_Sub3_2 == null) {
						local232 = true;
					} else {
						local33.anInt3955 -= 512;
						if (local33.anInt3955 <= 0) {
							Static91.aClass5_Sub16_Sub1_1.method2554(local33.aClass5_Sub16_Sub3_2);
							local232 = true;
							local33.aClass5_Sub16_Sub3_2 = null;
						}
					}
					if (local232) {
						local33.aClass5_Sub24_Sub1_2 = null;
						local33.anInt3955 = local170.anInt6235;
						local33.anInt3957 = local39;
						local33.aBoolean307 = local170.aBoolean465;
						local33.aClass5_Sub37_2 = null;
						local33.anInt3954 = local166;
					}
				}
			}
			local33.anInt3948 = local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt10355;
			local33.anInt3947 = local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt10355 + (local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.method5993() << 8);
			local33.anInt3951 = local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt10363;
			local33.anInt3950 = local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.anInt10363 + (local33.aClass8_Sub1_Sub3_Sub2_Sub2_1.method5993() << 8);
			Static42.method1538(arg2, arg0, arg3, local33, arg1);
		}
		for (@Pc(340) Class5_Sub22 local340 = (Class5_Sub22) Static679.aClass291_46.method6987(); local340 != null; local340 = (Class5_Sub22) Static679.aClass291_46.method6989()) {
			@Pc(346) byte local346 = 1;
			@Pc(353) Class101 local353 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.method5991(101);
			if (local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 == -1 || local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.aBoolean543) {
				local346 = 0;
			} else if (local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 == local353.anInt2168 || local353.anInt2179 == local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 || local353.anInt2197 == local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 || local353.anInt2185 == local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008) {
				local346 = 2;
			} else if (local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 == local353.anInt2165 || local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 == local353.anInt2205 || local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008 == local353.anInt2182 || local353.anInt2172 == local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt7008) {
				local346 = 3;
			}
			if (local340.anInt3957 != local346) {
				@Pc(467) int local467 = Static592.method8586(local340.aClass8_Sub1_Sub3_Sub2_Sub1_2);
				if (local340.anInt3954 == local467 && local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.aBoolean330 == local340.aBoolean307) {
					local340.anInt3955 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt4209;
					local340.anInt3957 = local346;
				} else {
					local232 = false;
					if (local340.aClass5_Sub16_Sub3_2 == null) {
						local232 = true;
					} else {
						local340.anInt3955 -= 512;
						if (local340.anInt3955 <= 0) {
							Static91.aClass5_Sub16_Sub1_1.method2554(local340.aClass5_Sub16_Sub3_2);
							local340.aClass5_Sub16_Sub3_2 = null;
							local232 = true;
						}
					}
					if (local232) {
						local340.aClass5_Sub24_Sub1_2 = null;
						local340.anInt3954 = local467;
						local340.aBoolean307 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.aBoolean330;
						local340.aClass5_Sub37_2 = null;
						local340.anInt3957 = local346;
						local340.anInt3955 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt4209;
					}
				}
			}
			local340.anInt3948 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt10355;
			local340.anInt3947 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt10355 + (local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.method5993() << 8);
			local340.anInt3951 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt10363;
			local340.anInt3950 = local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.anInt10363 + (local340.aClass8_Sub1_Sub3_Sub2_Sub1_2.method5993() << 8);
			Static42.method1538(arg2, arg0, arg3, local340, arg1);
		}
		if (53 != 53) {
			aClass208_120 = null;
		}
	}
}

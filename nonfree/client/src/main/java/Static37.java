import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public static int anInt645;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "I")
	public static int anInt658;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_1 = new Class68(11, -1);

	@OriginalMember(owner = "client!c", name = "G", descriptor = "F")
	public static float aFloat7 = 0.0F;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_12 = new Class244(10, 6);

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!us;")
	public static final Class234 aClass234_19 = new Class234(41, 15);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZI)V")
	public static void method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub10 local6 = (Class3_Sub10) Static142.aClass138_17.method3051(); local6 != null; local6 = (Class3_Sub10) Static142.aClass138_17.method3050()) {
			Static359.method5356(local6, arg0, arg2, arg3, arg1);
		}
		for (@Pc(31) Class3_Sub10 local31 = (Class3_Sub10) Static185.aClass138_23.method3051(); local31 != null; local31 = (Class3_Sub10) Static185.aClass138_23.method3050()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class36 local40 = local31.aClass28_Sub1_Sub1_Sub1_1.method4014();
			if (local31.aClass28_Sub1_Sub1_Sub1_1.aBoolean340) {
				local35 = 0;
			} else if (local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 == local40.anInt684 || local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 == local40.anInt665 || local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 == local40.anInt696 || local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 == local40.anInt659) {
				local35 = 2;
			} else if (local40.anInt686 == local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 || local40.anInt664 == local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 || local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 == local40.anInt685 || local31.aClass28_Sub1_Sub1_Sub1_1.anInt4333 == local40.anInt697) {
				local35 = 3;
			}
			if (local35 != local31.anInt1611) {
				@Pc(123) int local123 = Static95.method5453(local31.aClass28_Sub1_Sub1_Sub1_1);
				if (local123 != local31.anInt1601) {
					if (local31.aClass3_Sub8_Sub1_2 != null) {
						Static137.aClass3_Sub8_Sub2_2.method1712(local31.aClass3_Sub8_Sub1_2);
						local31.aClass3_Sub8_Sub1_2 = null;
					}
					local31.anInt1601 = local123;
				}
				local31.anInt1611 = local35;
			}
			local31.anInt1615 = local31.aClass28_Sub1_Sub1_Sub1_1.anInt5774;
			local31.anInt1614 = local31.aClass28_Sub1_Sub1_Sub1_1.anInt5774 + local31.aClass28_Sub1_Sub1_Sub1_1.method4009() * 64;
			local31.anInt1609 = local31.aClass28_Sub1_Sub1_Sub1_1.anInt5766;
			local31.anInt1606 = local31.aClass28_Sub1_Sub1_Sub1_1.anInt5766 + local31.aClass28_Sub1_Sub1_Sub1_1.method4009() * 64;
			Static359.method5356(local31, arg0, arg2, arg3, arg1);
		}
		for (@Pc(206) Class3_Sub10 local206 = (Class3_Sub10) Static332.aClass44_32.method950(); local206 != null; local206 = (Class3_Sub10) Static332.aClass44_32.method949()) {
			@Pc(210) byte local210 = 1;
			@Pc(215) Class36 local215 = local206.aClass28_Sub1_Sub1_Sub2_1.method4014();
			if (local206.aClass28_Sub1_Sub1_Sub2_1.aBoolean340) {
				local210 = 0;
			} else if (local215.anInt684 == local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333 || local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333 == local215.anInt665 || local215.anInt696 == local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333 || local215.anInt659 == local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333) {
				local210 = 2;
			} else if (local215.anInt686 == local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333 || local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333 == local215.anInt664 || local215.anInt685 == local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333 || local215.anInt697 == local206.aClass28_Sub1_Sub1_Sub2_1.anInt4333) {
				local210 = 3;
			}
			if (local206.anInt1611 != local210) {
				@Pc(322) int local322 = Static2.method57(local206.aClass28_Sub1_Sub1_Sub2_1);
				if (local322 != local206.anInt1601) {
					if (local206.aClass3_Sub8_Sub1_2 != null) {
						Static137.aClass3_Sub8_Sub2_2.method1712(local206.aClass3_Sub8_Sub1_2);
						local206.aClass3_Sub8_Sub1_2 = null;
					}
					local206.anInt1601 = local322;
				}
				local206.anInt1611 = local210;
			}
			local206.anInt1615 = local206.aClass28_Sub1_Sub1_Sub2_1.anInt5774;
			local206.anInt1614 = local206.aClass28_Sub1_Sub1_Sub2_1.anInt5774 + local206.aClass28_Sub1_Sub1_Sub2_1.method4009() * 64;
			local206.anInt1609 = local206.aClass28_Sub1_Sub1_Sub2_1.anInt5766;
			local206.anInt1606 = local206.aClass28_Sub1_Sub1_Sub2_1.anInt5766 + local206.aClass28_Sub1_Sub1_Sub2_1.method4009() * 64;
			Static359.method5356(local206, arg0, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public static int method611(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local76 < 0.5D) {
				local70 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local68 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local68 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local68 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local68 /= 6.0D;
		@Pc(161) int local161 = (int) (local68 * 256.0D);
		@Pc(166) int local166 = (int) (local70 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		@Pc(182) int local182 = (int) (local76 * 256.0D);
		if (local182 < 0) {
			local182 = 0;
		} else if (local182 > 255) {
			local182 = 255;
		}
		if (local182 > 243) {
			local166 >>= 0x4;
		} else if (local182 > 217) {
			local166 >>= 0x3;
		} else if (local182 > 192) {
			local166 >>= 0x2;
		} else if (local182 > 179) {
			local166 >>= 0x1;
		}
		return (local166 >> 5 << 7) + ((local161 & 0xFF) >> 2 << 10) + (local182 >> 1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)V")
	public static void method613(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static390.method5415(arg0 - 1L);
			Static390.method5415(1L);
		} else {
			Static390.method5415(arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "Lclient!v;")
	public static Class62 aClass62_890 = Static45.method753("@whi@");

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_891 = Static45.method753("");

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "Lclient!v;")
	public static Class62 aClass62_892 = Static45.method753("Lade Texturen )2 ");

	@OriginalMember(owner = "client!oe", name = "ob", descriptor = "[Lclient!kd;")
	public static Class3_Sub8[] aClass3_Sub8Array1 = new Class3_Sub8[2048];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
	public static int method1218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static106.method1848(arg1 + 45365, 4, arg0 + 91923) + (Static106.method1848(arg1 + 10294, 2, arg0 + 37821) + -128 >> 1) + (Static106.method1848(arg1, 1, arg0) + -128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method1220() {
		Static1.aBoolean1 = true;
		Static92.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
	public static void method1222() {
		Static69.aClass34_25.method762();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1226() {
		if (Static86.aClass14_1 != null) {
			Static86.aClass14_1.method1866();
			Static86.aClass14_1 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
	public static void method1227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static76.aClass1_1.method47(arg0, arg1, arg2);
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(31) int local31;
		@Pc(39) int local39;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (local15 != 0) {
			local27 = Static76.aClass1_1.method22(arg0, arg1, arg2, local15);
			local31 = local27 & 0x1F;
			local37 = local27 >> 6 & 0x3;
			local39 = arg3;
			if (local15 > 0) {
				local39 = arg4;
			}
			@Pc(49) int[] local49 = Static99.aClass3_Sub1_Sub1_Sub4_5.anIntArray306;
			local64 = (52736 - arg2 * 512) * 4 + arg1 * 4 + 24624;
			local70 = local15 >> 14 & 0x7FFF;
			@Pc(74) Class3_Sub1_Sub9 local74 = Static10.method1322(local70);
			if (local74.anInt1065 == -1) {
				if (local31 == 0 || local31 == 2) {
					if (local37 == 0) {
						local49[local64] = local39;
						local49[local64 + 512] = local39;
						local49[local64 + 1024] = local39;
						local49[local64 + 1536] = local39;
					} else if (local37 == 1) {
						local49[local64] = local39;
						local49[local64 + 1] = local39;
						local49[local64 + 2] = local39;
						local49[local64 + 3] = local39;
					} else if (local37 == 2) {
						local49[local64 + 3] = local39;
						local49[local64 + 512 + 3] = local39;
						local49[local64 + 3 + 1024] = local39;
						local49[local64 + 3 + 1536] = local39;
					} else if (local37 == 3) {
						local49[local64 + 1536] = local39;
						local49[local64 + 1536 + 1] = local39;
						local49[local64 + 1536 + 2] = local39;
						local49[local64 + 3 + 1536] = local39;
					}
				}
				if (local31 == 3) {
					if (local37 == 0) {
						local49[local64] = local39;
					} else if (local37 == 1) {
						local49[local64 + 3] = local39;
					} else if (local37 == 2) {
						local49[local64 + 3 + 1536] = local39;
					} else if (local37 == 3) {
						local49[local64 + 1536] = local39;
					}
				}
				if (local31 == 2) {
					if (local37 == 3) {
						local49[local64] = local39;
						local49[local64 + 512] = local39;
						local49[local64 + 1024] = local39;
						local49[local64 + 1536] = local39;
					} else if (local37 == 0) {
						local49[local64] = local39;
						local49[local64 + 1] = local39;
						local49[local64 + 2] = local39;
						local49[local64 + 3] = local39;
					} else if (local37 == 1) {
						local49[local64 + 3] = local39;
						local49[local64 + 515] = local39;
						local49[local64 + 1024 + 3] = local39;
						local49[local64 + 3 + 1536] = local39;
					} else if (local37 == 2) {
						local49[local64 + 1536] = local39;
						local49[local64 + 1 + 1536] = local39;
						local49[local64 + 1536 + 2] = local39;
						local49[local64 + 1536 + 3] = local39;
					}
				}
			} else {
				@Pc(84) Class3_Sub1_Sub1_Sub1 local84 = Static99.aClass3_Sub1_Sub1_Sub1Array5[local74.anInt1065];
				if (local84 != null) {
					@Pc(97) int local97 = (local74.anInt1061 * 4 - local84.anInt148) / 2;
					@Pc(108) int local108 = (local74.anInt1068 * 4 - local84.anInt152) / 2;
					local84.method145(arg1 * 4 + local108 + 48, local97 + (48 - -((-local74.anInt1061 + -arg2 + 104) * 4)));
				}
			}
		}
		local15 = Static76.aClass1_1.method26(arg0, arg1, arg2);
		if (local15 != 0) {
			local27 = Static76.aClass1_1.method22(arg0, arg1, arg2, local15);
			local37 = local27 >> 6 & 0x3;
			local31 = local27 & 0x1F;
			local39 = local15 >> 14 & 0x7FFF;
			@Pc(482) Class3_Sub1_Sub9 local482 = Static10.method1322(local39);
			@Pc(513) int local513;
			if (local482.anInt1065 != -1) {
				@Pc(586) Class3_Sub1_Sub1_Sub1 local586 = Static99.aClass3_Sub1_Sub1_Sub1Array5[local482.anInt1065];
				if (local586 != null) {
					local70 = (local482.anInt1068 * 4 - local586.anInt152) / 2;
					local513 = (local482.anInt1061 * 4 - local586.anInt148) / 2;
					local586.method145(local70 + arg1 * 4 + 48, local513 + (-local482.anInt1061 + -arg2 + 104) * 4 + 48);
				}
			} else if (local31 == 9) {
				local64 = 15658734;
				if (local15 > 0) {
					local64 = 15597568;
				}
				@Pc(501) int[] local501 = Static99.aClass3_Sub1_Sub1_Sub4_5.anIntArray306;
				local513 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
				if (local37 == 0 || local37 == 2) {
					local501[local513 + 1536] = local64;
					local501[local513 + 1025] = local64;
					local501[local513 + 2 + 512] = local64;
					local501[local513 + 3] = local64;
				} else {
					local501[local513] = local64;
					local501[local513 + 1 + 512] = local64;
					local501[local513 + 1024 + 2] = local64;
					local501[local513 + 3 + 1536] = local64;
				}
			}
		}
		local15 = Static76.aClass1_1.method3(arg0, arg1, arg2);
		if (local15 == 0) {
			return;
		}
		local27 = local15 >> 14 & 0x7FFF;
		@Pc(651) Class3_Sub1_Sub9 local651 = Static10.method1322(local27);
		if (local651.anInt1065 == -1) {
			return;
		}
		@Pc(661) Class3_Sub1_Sub1_Sub1 local661 = Static99.aClass3_Sub1_Sub1_Sub1Array5[local651.anInt1065];
		if (local661 != null) {
			local39 = (local651.anInt1068 * 4 - local661.anInt152) / 2;
			@Pc(685) int local685 = (local651.anInt1061 * 4 - local661.anInt148) / 2;
			local661.method145(arg1 * 4 + local39 + 48, local685 + 48 + (-arg2 + 104 + -local651.anInt1061) * 4);
			return;
		}
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V")
	public static void method1229() {
		aClass62_890 = null;
		aClass62_892 = null;
		anIntArray228 = null;
		aClass62_891 = null;
		aClass3_Sub8Array1 = null;
		anIntArray229 = null;
	}
}

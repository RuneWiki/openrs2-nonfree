import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
	public static int anInt5697;

	@OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
	public static int anInt5708;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!em;")
	public static final Class83 aClass83_112 = new Class83(10, 6);

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_68 = new Class208(80, 3);

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "Lclient!em;")
	public static final Class83 aClass83_113 = new Class83(94, 10);

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
	public static int anInt5707 = 0;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZZII)V")
	public static void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(19) int local19 = arg1 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(45) int local45 = Static408.aShort85 + (Static501.aShort108 - Static408.aShort85) * local19 / 100;
		if (Static377.aShort68 > local45) {
			local45 = Static377.aShort68;
		} else if (Static333.aShort65 < local45) {
			local45 = Static333.aShort65;
		}
		@Pc(67) int local67 = local45 * 512 * arg1 / (arg3 * 334);
		@Pc(104) int local104;
		@Pc(111) int local111;
		@Pc(75) short local75;
		if (local67 < Static316.aShort63) {
			local75 = Static316.aShort63;
			local45 = arg3 * local75 * 334 / (arg1 * 512);
			if (Static333.aShort65 < local45) {
				local45 = Static333.aShort65;
				local104 = arg1 * 512 * local45 / (local75 * 334);
				local111 = (arg3 - local104) / 2;
				if (arg2) {
					Static31.aClass78_18.JA();
					Static31.aClass78_18.method6800(-16777216, arg1, arg0, local111, arg4);
					Static31.aClass78_18.method6800(-16777216, arg1, arg0 + arg3 - local111, local111, arg4);
				}
				arg0 += local111;
				arg3 -= local111 * 2;
			}
		} else if (Static344.aShort67 < local67) {
			local75 = Static344.aShort67;
			local45 = arg3 * local75 * 334 / (arg1 * 512);
			if (Static377.aShort68 > local45) {
				local45 = Static377.aShort68;
				local104 = arg3 * local75 * 334 / (local45 * 512);
				local111 = (arg1 - local104) / 2;
				if (arg2) {
					Static31.aClass78_18.JA();
					Static31.aClass78_18.method6800(-16777216, local111, arg0, arg3, arg4);
					Static31.aClass78_18.method6800(-16777216, local111, arg0, arg3, arg4 + arg1 - local111);
				}
				arg4 += local111;
				arg1 -= local111 * 2;
			}
		}
		Static186.anInt3690 = (short) arg1;
		Static187.anInt3716 = arg0;
		Static362.anInt6567 = arg1 * local45 / 334;
		Static357.anInt6522 = (short) arg3;
		Static105.anInt8047 = arg4;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;ZI)V")
	public static void method4640(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1) {
		if (!Static204.aBoolean276) {
			Static385.anInt6903 = 0;
			return;
		}
		if (Static401.aBoolean549) {
			Static122.aLong66 = Static183.aClass210_1.method6281();
		}
		Static509.anInt8820 = 0;
		Static276.anInt5044 = 0;
		Static324.anInt5951 = 0;
		@Pc(30) int[] local30 = arg0.v();
		Static326.anInt4968 = (int) ((float) local30[2] / 3.0F);
		Static489.anInt8325 = (int) ((float) local30[3] / 3.0F);
		arg0.method6822(Static298.anIntArray309);
		if ((int) ((float) Static298.anIntArray309[0] / 3.0F) != Static312.anInt5723 || Static198.anInt3804 != (int) ((float) Static298.anIntArray309[1] / 3.0F)) {
			Static312.anInt5723 = (int) ((float) Static298.anIntArray309[0] / 3.0F);
			Static198.anInt3804 = (int) ((float) Static298.anIntArray309[1] / 3.0F);
			Static467.anInt6044 = Static312.anInt5723 >> 1;
			Static350.anInt6430 = Static198.anInt3804 >> 1;
			Static429.anIntArray461 = new int[Static312.anInt5723 * Static198.anInt3804];
		}
		Static368.aClass34_5 = arg0.method6843();
		Static385.anInt6903 = 0;
		for (@Pc(111) int local111 = 0; local111 < Static165.anInt3162; local111++) {
			Static449.method6302(Static136.aClass333Array1[local111], arg1, arg0);
		}
		for (@Pc(126) int local126 = 0; local126 < Static102.anInt1774; local126++) {
			Static449.method6302(Static288.aClass333Array4[local126], arg1, arg0);
		}
		for (@Pc(141) int local141 = 0; local141 < Static91.anInt8332; local141++) {
			Static449.method6302(Static369.aClass333Array8[local141], arg1, arg0);
		}
		Static397.anInt7106 = 0;
		if (Static385.anInt6903 > 0) {
			@Pc(165) int local165 = Static429.anIntArray461.length;
			@Pc(171) int local171 = local165 - local165 & 0x7;
			@Pc(173) int local173 = 0;
			while (local173 < local171) {
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
			}
			while (local173 < local165) {
				Static429.anIntArray461[local173++] = Integer.MAX_VALUE;
			}
			Static540.anInt9050 = 1;
			for (@Pc(232) int local232 = 0; local232 < Static385.anInt6903; local232++) {
				@Pc(238) Class333 local238 = Static412.aClass333Array6[local232];
				Static35.method643(local238.aShortArray122[3], local238.aShortArray121[3], local238.aShortArray120[0], local238.aShortArray120[1], local238.aShortArray121[1], local238.aShortArray121[0], local238.aShortArray122[0], local238.aShortArray122[1], local238.aShortArray120[3]);
				Static35.method643(local238.aShortArray122[3], local238.aShortArray121[3], local238.aShortArray120[1], local238.aShortArray120[2], local238.aShortArray121[2], local238.aShortArray121[1], local238.aShortArray122[1], local238.aShortArray122[2], local238.aShortArray120[3]);
			}
			Static540.anInt9050 = 2;
		}
		if (Static401.aBoolean549) {
			Static508.aLong240 = Static183.aClass210_1.method6281() - Static122.aLong66;
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
	public static void method4642() {
		Static66.anIntArray58 = Static509.method7127(0.4F);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V")
	public static void method4643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class1_Sub8_Sub9 local18 = Static465.method6470(arg0, 10);
		local18.method4833();
		local18.anInt5969 = arg2;
		local18.anInt5970 = arg3;
		local18.anInt5968 = arg1;
	}
}

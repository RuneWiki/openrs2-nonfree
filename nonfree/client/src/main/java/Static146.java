import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_48 = new Class359(90, -2);

	@OriginalMember(owner = "client!en", name = "f", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!f;")
	public static final Class111 aClass111_1 = new Class111(14, 0);

	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!f;")
	public static final Class111 aClass111_2 = new Class111(15, 4);

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Lclient!f;")
	public static final Class111 aClass111_3 = new Class111(16, -2);

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Lclient!f;")
	public static final Class111 aClass111_4 = new Class111(17, 0);

	@OriginalMember(owner = "client!en", name = "F", descriptor = "Lclient!f;")
	public static final Class111 aClass111_5 = new Class111(18, -2);

	@OriginalMember(owner = "client!en", name = "I", descriptor = "Lclient!f;")
	public static final Class111 aClass111_6 = new Class111(19, -2);

	@OriginalMember(owner = "client!en", name = "J", descriptor = "Lclient!f;")
	public static final Class111 aClass111_7 = new Class111(22, -2);

	@OriginalMember(owner = "client!en", name = "K", descriptor = "Lclient!f;")
	public static final Class111 aClass111_8 = new Class111(23, 4);

	@OriginalMember(owner = "client!en", name = "L", descriptor = "Lclient!f;")
	public static final Class111 aClass111_9 = new Class111(24, -1);

	@OriginalMember(owner = "client!en", name = "M", descriptor = "Lclient!f;")
	public static final Class111 aClass111_10 = new Class111(26, 0);

	@OriginalMember(owner = "client!en", name = "N", descriptor = "Lclient!f;")
	public static final Class111 aClass111_11 = new Class111(27, 0);

	@OriginalMember(owner = "client!en", name = "O", descriptor = "Lclient!f;")
	public static final Class111 aClass111_12 = new Class111(28, -2);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)V")
	public static void method2649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 * Static172.aClass5_Sub50_14.aClass12_Sub7_1.method2118() >> 8;
		if (arg0 == -1 && !Static569.aBoolean788) {
			Static194.method3230();
		} else if (arg0 != -1 && (arg0 != Static33.anInt545 || !Static101.method1980()) && local12 != 0 && !Static569.aBoolean788) {
			Static552.method7656(arg0, arg1, local12, Static396.aClass390_82);
			Static481.method6852();
		}
		if (Static33.anInt545 != arg0) {
			Static34.aClass5_Sub17_Sub1_1 = null;
		}
		Static33.anInt545 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[I[I)V")
	public static void method2652(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static265.aByteArrayArrayArray18 = null;
			Static660.anIntArray601 = null;
			Static212.anIntArray201 = null;
			return;
		}
		Static660.anIntArray601 = arg0;
		Static212.anIntArray201 = new int[arg0.length];
		Static265.aByteArrayArrayArray18 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static660.anIntArray601.length; local28++) {
			Static265.aByteArrayArrayArray18[local28] = new byte[arg1[local28]][];
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!jba;ZLclient!lq;)V")
	public static void method2653(@OriginalArg(0) int arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(3) Class28_Sub1 arg2) {
		if (Static204.anInt3872 >= 50 || (arg1 == null || arg1.anIntArrayArray24 == null || arg1.anIntArrayArray24.length <= arg0 || arg1.anIntArrayArray24[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray24[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg1.anIntArrayArray24[arg0].length > 1) {
			local63 = (int) ((double) arg1.anIntArrayArray24[arg0].length * Math.random());
			if (local63 > 0) {
				local38 = arg1.anIntArrayArray24[arg0][local63];
			}
		}
		@Pc(76) int local76 = local34 & 0x1F;
		local63 = 256;
		if (arg1.anIntArray290 != null && arg1.anIntArray289 != null) {
			local63 = arg1.anIntArray290[arg0] + (int) ((double) (arg1.anIntArray289[arg0] - arg1.anIntArray290[arg0]) * Math.random());
		}
		@Pc(113) int local113 = arg1.anIntArray292 == null ? 255 : arg1.anIntArray292[arg0];
		if (local76 == 0) {
			if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == arg2) {
				if (arg1.aBoolean425) {
					Static155.method446(local113, local63, 0, false, local44, local38);
					return;
				}
				Static595.method8160(local113, local44, local63, local38, 0);
			}
		} else if (Static172.aClass5_Sub50_14.lb.method2118() != 0) {
			@Pc(157) int local157 = arg2.anInt10781 - 256 >> 9;
			@Pc(164) int local164 = arg2.anInt10784 - 256 >> 9;
			@Pc(185) int local185 = arg2 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 ? 0 : (local164 << 8) + (local157 << 16) + (arg2.aByte145 << 24) + local76;
			Static569.aClass351Array1[Static204.anInt3872++] = new Class351((byte) (arg1.aBoolean425 ? 2 : 1), local38, local44, 0, local113, local185, local63, arg2);
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	public static void method2657() {
		@Pc(12) Class373 local12 = null;
		try {
			@Pc(18) Class331 local18 = Static570.aClass268_5.method6326("2");
			while (local18.anInt9108 == 0) {
				Static579.method8004(1L);
			}
			if (local18.anInt9108 == 1) {
				local12 = (Class373) local18.anObject20;
				@Pc(43) byte[] local43 = new byte[(int) local12.method8635()];
				@Pc(57) int local57;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local57) {
					local57 = local12.method8637(local43.length - local45, local43, local45);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static367.method5558(new Class5_Sub41(local43));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local12 != null) {
				local12.method8641();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}
}

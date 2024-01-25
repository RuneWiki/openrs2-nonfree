import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!to", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray68;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!in;")
	public static final Class169 aClass169_246 = new Class169(122, -2);

	@OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
	public static final int[] anIntArray513 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
	public static int[] anIntArray514 = new int[1];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZII)Z")
	public static boolean method8768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static84.method1423(arg1, arg0) || Static39.method9318(arg1, arg0);
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	public static void method8769() {
		@Pc(21) byte[] local21;
		if (Static424.anObject16 == null) {
			@Pc(14) Class12_Sub1_Sub2 local14 = new Class12_Sub1_Sub2();
			local21 = local14.method7652();
			Static424.anObject16 = Static340.method5715(local21);
		}
		if (Static431.anObject8 == null) {
			@Pc(32) Class12_Sub2_Sub2 local32 = new Class12_Sub2_Sub2();
			local21 = local32.method4069();
			Static431.anObject8 = Static340.method5715(local21);
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	public static void method8771() {
		if (Static570.aClass138Array1 == null) {
			Static570.aClass138Array1 = Static214.method4025();
			Static11.aClass138_1 = Static570.aClass138Array1[0];
			Static425.aLong215 = Static99.method1701();
		}
		if (Static396.aClass249_1 == null) {
			Static483.method7667();
		}
		@Pc(31) Class138 local31 = Static11.aClass138_1;
		@Pc(34) int local34 = Static273.method4648();
		if (Static11.aClass138_1 == local31) {
			Static314.aString68 = Static11.aClass138_1.aClass134_64.method3906(Static204.anInt8130);
			if (Static11.aClass138_1.aBoolean350) {
				Static113.anInt2040 = (Static11.aClass138_1.anInt4447 - Static11.aClass138_1.anInt4448) * local34 / 100 + Static11.aClass138_1.anInt4448;
			}
			if (Static11.aClass138_1.aBoolean349) {
				Static314.aString68 = Static314.aString68 + Static113.anInt2040 + "%";
			}
		} else if (Static214.aClass138_22 == Static11.aClass138_1) {
			Static396.aClass249_1 = null;
			Static248.method4408(3);
		} else {
			Static314.aString68 = local31.aClass134_63.method3906(Static204.anInt8130);
			Static113.anInt2040 = local31.anInt4447;
			if (Static11.aClass138_1.aBoolean349) {
				Static314.aString68 = Static314.aString68 + local31.anInt4447 + "%";
			}
			if (Static11.aClass138_1.aBoolean350 || local31.aBoolean350) {
				Static425.aLong215 = Static99.method1701();
			}
		}
		if (Static396.aClass249_1 == null) {
			return;
		}
		Static396.aClass249_1.method6626(Static314.aString68, Static113.anInt2040, Static425.aLong215, Static11.aClass138_1);
		if (Static35.anInterface1Array1 == null) {
			return;
		}
		for (@Pc(134) int local134 = Static615.anInt10781 + 1; local134 < Static35.anInterface1Array1.length; local134++) {
			if (Static35.anInterface1Array1[local134].method7816() >= 100 && local134 - 1 == Static615.anInt10781 && Static579.anInt10049 >= 1 && Static396.aClass249_1.method6628()) {
				try {
					Static35.anInterface1Array1[local134].method7815();
				} catch (@Pc(162) Exception local162) {
					Static35.anInterface1Array1 = null;
					return;
				}
				Static396.aClass249_1.method6634(Static35.anInterface1Array1[local134]);
				Static615.anInt10781++;
				if (Static615.anInt10781 >= Static35.anInterface1Array1.length - 1 && Static35.anInterface1Array1.length > 1) {
					Static615.anInt10781 = Static193.aClass93_1.method2404() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIB)I")
	public static int method8772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + (((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 1));
	}
}

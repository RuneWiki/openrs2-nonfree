import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static703 {

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Lclient!nca;")
	public static Class254 aClass254_168;

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_159 = new Class349(24, 8);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILclient!jga;I)V")
	public static void method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub33 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass2_Sub20_Sub2_1.method8533(3774, arg3);
		arg2.aClass2_Sub20_Sub2_1.method8556(arg1);
		arg2.aClass2_Sub20_Sub2_1.method8582(arg0);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZII)I")
	public static int method9412(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub3 local8 = Static549.method7662(-116, arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray28.length) {
			return local8.anIntArray28[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIBI)V")
	public static void method9413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static449.anInt7290;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static161.anInt2716 = arg0;
			Static482.anInt7719 = arg3;
			Static173.anInt2991 = arg1;
			Static449.anInt7290 = 2;
			Static265.anInt4125 = arg2;
		} else if (local5 == 2) {
			if (Static161.anInt2716 < arg0) {
				Static161.anInt2716 = arg0;
			}
			if (Static482.anInt7719 < arg3) {
				Static482.anInt7719 = arg3;
			}
			if (arg2 < Static265.anInt4125) {
				Static265.anInt4125 = arg2;
			}
			if (Static173.anInt2991 > arg1) {
				Static173.anInt2991 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I[BIIII)V")
	public static void method9414(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		arg1 += arg3;
		@Pc(33) int local33 = arg2 - arg3 >> 2;
		while (true) {
			local33--;
			if (local33 < 0) {
				local33 = arg2 - arg3 & 0x3;
				while (true) {
					local33--;
					if (local33 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(38) int local38 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			@Pc(48) int local48 = local43 + 1;
			arg0[local43] = 1;
			arg1 = local48 + 1;
			arg0[local48] = 1;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!pb;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_34 = new Class163();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	public static void method4101() {
		Static116.method2046();
		Static15.method240(Static361.aClass85_Sub1_1.aBoolean180);
		Static333.aClass130_2 = Static385.method5162(Static171.aClass159_1, Static412.aCanvas7, 22050, 0);
		Static333.aClass130_2.method3641(Static440.aClass10_Sub7_Sub4_3);
		Static321.aClass130_1 = Static385.method5162(Static171.aClass159_1, Static412.aCanvas7, 2048, 1);
		Static321.aClass130_1.method3641(Static461.aClass10_Sub7_Sub2_5);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method4102() {
		@Pc(12) int local12 = Static270.anInt4754;
		@Pc(14) int[] local14 = Static53.anIntArray79;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class24_Sub3_Sub2_Sub2 local24 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local14[local16]];
			if (local24 != null && local24.anInt6209 > 0) {
				local24.anInt6209--;
				if (local24.anInt6209 == 0) {
					local24.aString56 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static219.anInt4155; local54++) {
			@Pc(61) long local61 = (long) Static57.anIntArray91[local54];
			@Pc(67) Class10_Sub26 local67 = (Class10_Sub26) Static424.aClass167_33.method3709(local61);
			if (local67 != null) {
				@Pc(72) Class24_Sub3_Sub2_Sub1 local72 = local67.aClass24_Sub3_Sub2_Sub1_2;
				if (local72.anInt6209 > 0) {
					local72.anInt6209--;
					if (local72.anInt6209 == 0) {
						local72.aString56 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!nk;II)V")
	public static void method4103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub31 arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg0 << 14 | arg1 << 28);
		@Pc(22) Class10_Sub14 local22 = (Class10_Sub14) Static293.aClass167_21.method3709(local16);
		if (local22 == null) {
			local22 = new Class10_Sub14();
			Static293.aClass167_21.method3705(local22, local16);
			local22.aClass163_17.method3613(arg2);
			return;
		}
		@Pc(45) Class60 local45 = Static313.aClass272_2.method6068(arg2.anInt4768);
		@Pc(52) int local52 = local45.anInt1713;
		if (local45.anInt1718 == 1) {
			local52 *= arg2.anInt4767 + 1;
		}
		for (@Pc(69) Class10_Sub31 local69 = (Class10_Sub31) local22.aClass163_17.method3620(); local69 != null; local69 = (Class10_Sub31) local22.aClass163_17.method3621()) {
			local45 = Static313.aClass272_2.method6068(local69.anInt4768);
			@Pc(82) int local82 = local45.anInt1713;
			if (local45.anInt1718 == 1) {
				local82 *= local69.anInt4767 + 1;
			}
			if (local52 > local82) {
				Static332.method4493(arg2, local69);
				return;
			}
		}
		local22.aClass163_17.method3613(arg2);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IC)B")
	public static byte method4104(@OriginalArg(1) char arg0) {
		@Pc(38) byte local38;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local38 = (byte) arg0;
		} else if (arg0 == '€') {
			local38 = -128;
		} else if (arg0 == '‚') {
			local38 = -126;
		} else if (arg0 == 'ƒ') {
			local38 = -125;
		} else if (arg0 == '„') {
			local38 = -124;
		} else if (arg0 == '…') {
			local38 = -123;
		} else if (arg0 == '†') {
			local38 = -122;
		} else if (arg0 == '‡') {
			local38 = -121;
		} else if (arg0 == 'ˆ') {
			local38 = -120;
		} else if (arg0 == '‰') {
			local38 = -119;
		} else if (arg0 == 'Š') {
			local38 = -118;
		} else if (arg0 == '‹') {
			local38 = -117;
		} else if (arg0 == 'Œ') {
			local38 = -116;
		} else if (arg0 == 'Ž') {
			local38 = -114;
		} else if (arg0 == '‘') {
			local38 = -111;
		} else if (arg0 == '’') {
			local38 = -110;
		} else if (arg0 == '“') {
			local38 = -109;
		} else if (arg0 == '”') {
			local38 = -108;
		} else if (arg0 == '•') {
			local38 = -107;
		} else if (arg0 == '–') {
			local38 = -106;
		} else if (arg0 == '—') {
			local38 = -105;
		} else if (arg0 == '˜') {
			local38 = -104;
		} else if (arg0 == '™') {
			local38 = -103;
		} else if (arg0 == 'š') {
			local38 = -102;
		} else if (arg0 == '›') {
			local38 = -101;
		} else if (arg0 == 'œ') {
			local38 = -100;
		} else if (arg0 == 'ž') {
			local38 = -98;
		} else if (arg0 == 'Ÿ') {
			local38 = -97;
		} else {
			local38 = 63;
		}
		return local38;
	}
}

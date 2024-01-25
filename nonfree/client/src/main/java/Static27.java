import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!as", name = "M", descriptor = "[[Lclient!uc;")
	public static Class347[][] aClass347ArrayArray1;

	@OriginalMember(owner = "client!as", name = "Q", descriptor = "[Lclient!is;")
	public static final Class5_Sub3_Sub9[] aClass5_Sub3_Sub9Array1 = new Class5_Sub3_Sub9[14];

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(B)Lclient!dj;")
	public static Class85 method334() {
		try {
			return (Class85) Class.forName("Class85_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class85_Sub2();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "()V")
	public static void method336() {
		for (@Pc(1) int local1 = 0; local1 < Static667.anInt10686; local1++) {
			if (!Static221.aBooleanArray41[local1]) {
				@Pc(10) Class199 local10 = Static50.aClass199Array1[local1];
				@Pc(13) Class5_Sub18 local13 = local10.aClass5_Sub18_2;
				@Pc(16) int local16 = local10.anInt6000;
				@Pc(22) int local22 = local13.method8056() - Static558.anInt7322;
				@Pc(30) int local30 = (local22 * 2 >> Static588.anInt9672) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8055() - local22 >> Static588.anInt9672;
				@Pc(53) int local53 = local13.method8057() - local22 >> Static588.anInt9672;
				@Pc(61) int local61 = local13.method8057() + local22 >> Static588.anInt9672;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static233.anInt4238) {
					local61 = Static233.anInt4238 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray76[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static216.anInt4042) {
						local108 = Static216.anInt4042 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class28_Sub1_Sub4 local141 = Static241.method3771(local16, local125, local78, hd.class);
						if (local141 != null && local141.aByte146 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte146 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray76[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray76[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray76[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray76[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static221.aBooleanArray41[local1] = true;
				Static495.aClass109Array4[local16].method7694(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)I")
	public static int method337(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static306.anInt5853 - 1; local3++) {
			if (arg0 < Static481.anIntArray450[local3] + Static661.anIntArray603[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static306.anInt5853 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILclient!ha;III)V")
	public static void method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((Static417.aClass50_28 == null || Static56.aClass50_3 == null || Static655.aClass50_38 == null) && Static257.aClass390_60.method8905(Static406.anInt7203) && Static257.aClass390_60.method8905(Static39.anInt650) && Static257.aClass390_60.method8905(Static477.anInt8037)) {
			@Pc(27) Class369 local27 = Static689.method8541(Static257.aClass390_60, Static39.anInt650, 0);
			Static56.aClass50_3 = arg2.method6898(local27, true);
			local27.method8543();
			Static113.aClass50_5 = arg2.method6898(local27, true);
			Static417.aClass50_28 = arg2.method6898(Static689.method8541(Static257.aClass390_60, Static406.anInt7203, 0), true);
			@Pc(52) Class369 local52 = Static689.method8541(Static257.aClass390_60, Static477.anInt8037, 0);
			Static655.aClass50_38 = arg2.method6898(local52, true);
			local52.method8543();
			Static363.aClass50_34 = arg2.method6898(local52, true);
		}
		if (Static417.aClass50_28 == null || Static56.aClass50_3 == null || Static655.aClass50_38 == null) {
			return;
		}
		@Pc(84) int local84 = (arg0 - Static655.aClass50_38.method6002() * 2) / Static417.aClass50_28.method6002();
		for (@Pc(86) int local86 = 0; local86 < local84; local86++) {
			Static417.aClass50_28.method5996(arg1 + Static655.aClass50_38.method6002() + local86 * Static417.aClass50_28.method6002(), arg3 + (arg4 - Static417.aClass50_28.method5992()));
		}
		@Pc(122) int local122 = (arg4 - Static655.aClass50_38.method5992() - 20) / Static56.aClass50_3.method5992();
		for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
			Static56.aClass50_3.method5996(arg1, arg3 + local124 * Static56.aClass50_3.method5992() + 20);
			Static113.aClass50_5.method5996(arg1 + arg0 - Static113.aClass50_5.method6002(), Static56.aClass50_3.method5992() * local124 + arg3 - -20);
		}
		Static655.aClass50_38.method5996(arg1, arg4 + arg3 - Static655.aClass50_38.method5992());
		Static363.aClass50_34.method5996(arg0 + arg1 - Static655.aClass50_38.method6002(), arg3 - (-arg4 - -Static655.aClass50_38.method5992()));
	}
}

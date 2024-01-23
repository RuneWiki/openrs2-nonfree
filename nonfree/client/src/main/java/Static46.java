import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_351 = Static200.method3116("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
	public static int anInt1054 = 0;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
	public static volatile int anInt1055 = -1;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BIZIIII[Lclient!ab;II)V")
	public static void method798(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class3[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(10) Class1_Sub9 local10 = new Class1_Sub9(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method896();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method900();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(55) int local55 = local32 >> 12;
				@Pc(61) int local61 = local32 >> 6 & 0x3F;
				@Pc(65) int local65 = local10.method895();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local55 == arg2 && local61 >= arg3 && arg3 + 8 > local61 && local51 >= arg4 && arg4 + 8 > local51) {
					@Pc(104) Class1_Sub1_Sub23 local104 = Static44.method760(local12);
					@Pc(121) int local121 = arg5 + Static34.method616(arg8, local73, local104.anInt4024, local51 & 0x7, local61 & 0x7, local104.anInt4018);
					@Pc(139) int local139 = arg7 + Static63.method1145(arg8, local51 & 0x7, local104.anInt4018, local104.anInt4024, local73, local61 & 0x7);
					if (local121 > 0 && local139 > 0 && local121 < 103 && local139 < 103) {
						@Pc(156) Class3 local156 = null;
						@Pc(160) int local160 = arg0;
						if ((Static209.aByteArrayArrayArray13[1][local121][local139] & 0x2) == 2) {
							local160 = arg0 - 1;
						}
						if (local160 >= 0) {
							local156 = arg6[local160];
						}
						Static50.method1422(local156, arg0, local69, Static148.aBoolean266, arg0, local121, local12, true, arg8 + local73 & 0x3, local139);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method799() {
		Static142.anInt3197 = 0;
		@Pc(8) int local8 = (Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7) + Static128.anInt2813;
		@Pc(15) int local15 = Static163.anInt3587 + (Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7);
		if (local8 >= 3053 && local8 <= 3156 && local15 >= 3056 && local15 <= 3136) {
			Static142.anInt3197 = 1;
		}
		if (local8 >= 3072 && local8 <= 3118 && local15 >= 9492 && local15 <= 9535) {
			Static142.anInt3197 = 1;
		}
		if (Static142.anInt3197 == 1 && local8 >= 3139 && local8 <= 3199 && local15 >= 3008 && local15 <= 3062) {
			Static142.anInt3197 = 0;
		}
	}
}

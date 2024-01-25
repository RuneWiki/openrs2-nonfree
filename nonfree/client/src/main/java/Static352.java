import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!oo", name = "T", descriptor = "I")
	public static int anInt6485;

	@OriginalMember(owner = "client!oo", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[5];

	@OriginalMember(owner = "client!oo", name = "db", descriptor = "Lclient!mh;")
	public static final Class188 aClass188_8 = new Class188("", 11);

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(I)I")
	public static int method5537() {
		if (Static452.aBoolean600) {
			return 6;
		} else if (Static431.aClass2_Sub44_3 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static431.aClass2_Sub44_3.anInt8460;
			if (Static472.method6914(local14)) {
				return 1;
			} else if (Static450.method6872(local14)) {
				return 2;
			} else if (Static326.method5156(local14)) {
				return 3;
			} else if (Static224.method3540(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "(I)V")
	public static void method5538() {
		if (Static425.anInt6885 == 1 || Static425.anInt6885 == 3 || Static481.anInt8570 != Static425.anInt6885 && (Static425.anInt6885 == 0 || Static481.anInt8570 == 0)) {
			Static520.anInt1936 = 0;
			Static61.anInt1174 = 0;
			Static71.aClass127_13.method3204();
		}
		Static481.anInt8570 = Static425.anInt6885;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZC)Z")
	public static boolean method5539(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[I[III)V")
	public static void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) int local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		@Pc(54) int local54 = ~local21 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg3; local56 < arg0; local56++) {
			if (arg1[local56] < local21 + (local56 & local54)) {
				@Pc(76) int local76 = arg1[local56];
				arg1[local56] = arg1[local17];
				arg1[local17] = local76;
				@Pc(90) int local90 = arg2[local56];
				arg2[local56] = arg2[local17];
				arg2[local17++] = local90;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method5540(local17 - 1, arg1, arg2, arg3);
		method5540(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)I")
	public static int method5543(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public static int anInt3862;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!rn;")
	public static Class155 aClass155_84;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	public static int anInt3861 = -1;

	@OriginalMember(owner = "client!od", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString136 = "purple:";

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Lclient!ck;")
	public static Class3_Sub2 method3269(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub2_Sub27();
		} else if (arg0 == 1) {
			return new Class3_Sub2_Sub39();
		} else if (arg0 == 2) {
			return new Class3_Sub2_Sub23();
		} else if (arg0 == 3) {
			return new Class3_Sub2_Sub12();
		} else if (arg0 == 4) {
			return new Class3_Sub2_Sub38();
		} else if (arg0 == 5) {
			return new Class3_Sub2_Sub36();
		} else if (arg0 == 6) {
			return new Class3_Sub2_Sub30();
		} else if (arg0 == 7) {
			return new Class3_Sub2_Sub19();
		} else if (arg0 == 8) {
			return new Class3_Sub2_Sub16();
		} else if (arg0 == 9) {
			return new Class3_Sub2_Sub1();
		} else if (arg0 == 10) {
			return new Class3_Sub2_Sub21();
		} else if (arg0 == 11) {
			return new Class3_Sub2_Sub24();
		} else if (arg0 == 12) {
			return new Class3_Sub2_Sub37();
		} else if (arg0 == 13) {
			return new Class3_Sub2_Sub10();
		} else if (arg0 == 14) {
			return new Class3_Sub2_Sub5();
		} else if (arg0 == 15) {
			return new Class3_Sub2_Sub18();
		} else if (arg0 == 16) {
			return new Class3_Sub2_Sub2();
		} else if (arg0 == 17) {
			return new Class3_Sub2_Sub28();
		} else if (arg0 == 18) {
			return new Class3_Sub2_Sub11_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub2_Sub29();
		} else if (arg0 == 20) {
			return new Class3_Sub2_Sub14();
		} else if (arg0 == 21) {
			return new Class3_Sub2_Sub15();
		} else if (arg0 == 22) {
			return new Class3_Sub2_Sub26();
		} else if (arg0 == 23) {
			return new Class3_Sub2_Sub3();
		} else if (arg0 == 24) {
			return new Class3_Sub2_Sub35();
		} else if (arg0 == 25) {
			return new Class3_Sub2_Sub4();
		} else if (arg0 == 26) {
			return new Class3_Sub2_Sub31();
		} else if (arg0 == 27) {
			return new Class3_Sub2_Sub7();
		} else if (arg0 == 28) {
			return new Class3_Sub2_Sub25();
		} else if (arg0 == 29) {
			return new Class3_Sub2_Sub13();
		} else if (arg0 == 30) {
			return new Class3_Sub2_Sub17();
		} else if (arg0 == 31) {
			return new Class3_Sub2_Sub9();
		} else if (arg0 == 32) {
			return new Class3_Sub2_Sub22();
		} else if (arg0 == 33) {
			return new Class3_Sub2_Sub8();
		} else if (arg0 == 34) {
			return new Class3_Sub2_Sub6();
		} else if (arg0 == 35) {
			return new Class3_Sub2_Sub33();
		} else if (arg0 == 36) {
			return new Class3_Sub2_Sub32();
		} else if (arg0 == 37) {
			return new Class3_Sub2_Sub34();
		} else if (arg0 == 38) {
			return new Class3_Sub2_Sub20();
		} else if (arg0 == 39) {
			return new Class3_Sub2_Sub11();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;Lclient!rn;Z)Lclient!eh;")
	public static Class43 method3271(@OriginalArg(1) String arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(6) int local6 = arg1.method4120(arg0);
		if (local6 == -1) {
			return new Class43(0);
		}
		@Pc(28) int[] local28 = arg1.method4117(local6);
		@Pc(34) Class43 local34 = new Class43(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local38 < local34.anInt1243) {
				@Pc(58) Class3_Sub26 local58 = new Class3_Sub26(arg1.method4121(local6, local28[local36++]));
				@Pc(62) int local62 = local58.method3896();
				@Pc(66) int local66 = local58.method3948();
				@Pc(70) int local70 = local58.method3915();
				if (!arg2 && local70 == 1) {
					local34.anInt1243--;
				} else {
					local34.anIntArray112[local38] = local62;
					local34.aClass3_Sub4_Sub23Array1[local38] = new Class3_Sub4_Sub23();
					local34.aClass3_Sub4_Sub23Array1[local38].anInt5971 = local66;
					local38++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)I")
	public static int method3272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 2 << 10) + ((arg1 >> 5 << 7) + (arg0 >> 1));
	}
}

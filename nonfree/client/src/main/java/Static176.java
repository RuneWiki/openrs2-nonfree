import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
	public static int anInt3095;

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
	public static int anInt3100;

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
	public static int anInt3101;

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array5;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_47 = new Class179(66, 3);

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
	public static int anInt3096 = -1;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
	public static final int anInt3099 = 1407;

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "Lclient!bfa;")
	public static final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_110 = new Class288(27, -1);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIILclient!c;)V")
	public static void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13_Sub1_Sub2 arg3) {
		@Pc(4) Class53 local4 = Static435.method2767(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass13_Sub1_Sub2_1 = arg3;
		@Pc(16) int local16 = Static314.aClass76Array2 == Static313.aClass76Array1 ? 1 : 0;
		if (arg3.method8408()) {
			if (arg3.method8413()) {
				Static417.aClass13_Sub1ArrayArray2[local16][Static28.anIntArray63[local16]++] = arg3;
				return;
			}
			Static597.aClass13_Sub1ArrayArray3[local16][Static369.anIntArray426[local16]++] = arg3;
			Static116.aBoolean155 = true;
			return;
		}
		Static139.aClass13_Sub1ArrayArray1[local16][Static497.anIntArray571[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lclient!ig;II)V")
	public static void method2603(@OriginalArg(0) Class13_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class13_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10091;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10091 < local27 + (local29 & 0x1)) {
				@Pc(44) Class13_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method2603(arg0, arg1, local10 - 1);
		method2603(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)V")
	public static void method2604() {
		@Pc(1) Class32 local1 = Static22.aClass32_6;
		synchronized (Static22.aClass32_6) {
			Static22.aClass32_6.method634(5);
		}
	}
}

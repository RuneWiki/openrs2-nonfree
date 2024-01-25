import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_146 = new Class174("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!om", name = "l", descriptor = "I")
	public static int anInt5192 = 0;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public static int anInt5196 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z[BII)Ljava/lang/String;")
	public static String method4282(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) char[] local17 = new char[arg2];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(31) int local31 = arg0[local21 + arg1] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(50) char local50 = Static81.aCharArray3[local31 - 128];
					if (local50 == '\u0000') {
						local50 = '?';
					}
					local31 = local50;
				}
				local17[local19++] = (char) local31;
			}
		}
		return new String(local17, 0, local19);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;BII)V")
	public static void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class82 local8 = Static360.method5048(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray9 != null) {
			@Pc(18) Class3_Sub15 local18 = new Class3_Sub15();
			local18.anInt1785 = arg2;
			local18.aString27 = arg1;
			local18.anObjectArray3 = local8.anObjectArray9;
			local18.aClass82_1 = local8;
			Static219.method3217(local18);
		}
		if (Static345.anInt5823 != 9 || !Static54.method1060(local8).method5457(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static307.method4633(Static252.aClass163_111);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 2) {
			Static307.method4633(Static56.aClass163_33);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 3) {
			Static307.method4633(Static388.aClass163_169);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 4) {
			Static307.method4633(Static417.aClass163_178);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 5) {
			Static307.method4633(Static67.aClass163_40);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 6) {
			Static307.method4633(Static229.aClass163_102);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 7) {
			Static307.method4633(Static327.aClass163_133);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 8) {
			Static307.method4633(Static447.aClass163_191);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 9) {
			Static307.method4633(Static317.aClass163_130);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
		if (arg2 == 10) {
			Static307.method4633(Static297.aClass163_122);
			Static122.method1954(arg3, arg0, local8.anInt2200);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4284(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static307.method4633(Static399.aClass163_83);
		Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(arg1) + 1);
		Static243.aClass3_Sub25_Sub1_7.method4090(arg0);
		Static243.aClass3_Sub25_Sub1_7.method4080(arg1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([IZII[I)V")
	public static void method4285(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg1) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local16;
		@Pc(30) int local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(47) int local47 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg2; local49 < arg1; local49++) {
			if ((local47 & local49) + local16 > arg3[local49]) {
				@Pc(68) int local68 = arg3[local49];
				arg3[local49] = arg3[local12];
				arg3[local12] = local68;
				@Pc(82) int local82 = arg0[local49];
				arg0[local49] = arg0[local12];
				arg0[local12++] = local82;
			}
		}
		arg3[arg1] = arg3[local12];
		arg3[local12] = local16;
		arg0[arg1] = arg0[local12];
		arg0[local12] = local30;
		method4285(arg0, local12 - 1, arg2, arg3);
		method4285(arg0, arg1, local12 + 1, arg3);
	}
}

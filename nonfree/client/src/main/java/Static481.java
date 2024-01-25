import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public static int anInt8134;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Lclient!jv;")
	public static final Class182 aClass182_8 = new Class182("", 12);

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "[I")
	public static final int[] anIntArray641 = new int[32];

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_113 = new Class61(15, 8);

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_114 = new Class61(69, 0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II[F)[F")
	public static float[] method6702(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static602.method1587(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BIBII)V")
	public static void method6703(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(19) int local19 = arg2 - arg0 >> 2;
		arg3 += arg0;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg2 - arg0 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(33) int local33 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg1[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg1[local38] = 1;
			arg3 = local43 + 1;
			arg1[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!eh;)Lclient!oi;")
	public static Class251 method6704(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method6015();
		@Pc(14) Class297 local14 = Static192.method3526()[arg0.method6015()];
		@Pc(21) Class58 local21 = Static458.method6443()[arg0.method6015()];
		@Pc(25) int local25 = arg0.method6003();
		@Pc(29) int local29 = arg0.method6003();
		@Pc(33) int local33 = arg0.method5982();
		@Pc(37) int local37 = arg0.method5982();
		@Pc(48) int local48 = arg0.method6026();
		@Pc(52) int local52 = arg0.method6026();
		@Pc(56) int local56 = arg0.method6026();
		@Pc(67) boolean local67 = arg0.method6015() == 1;
		return new Class251(local7, local14, local21, local25, local29, local33, local37, local48, local52, local56, local67);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!dw;IIIII)V")
	public static void method6706(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7407 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static348.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class32 local35 = Static22.aClass32Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt7407; local37++) {
							if (arg0.aClass4_Sub32Array5[local37] == local35.aClass4_Sub32_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass4_Sub32Array5[arg0.anInt7407++] = local35.aClass4_Sub32_2;
						if (arg0.anInt7407 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt7407; local7 < 4; local7++) {
			arg0.aClass4_Sub32Array5[local7] = null;
		}
	}
}

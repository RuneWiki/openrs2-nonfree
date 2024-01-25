import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Lclient!vh;")
	public static Class250 aClass250_51;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	public static int anInt3977;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Lclient!hv;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method3315(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg3) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) int local28 = arg0[local22];
		arg0[local22] = arg0[arg3];
		arg0[arg3] = local28;
		@Pc(42) Object local42 = arg1[local22];
		arg1[local22] = arg1[arg3];
		arg1[arg3] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg2; local63 < arg3; local63++) {
			if (arg0[local63] < (local63 & local61) + local28) {
				@Pc(78) int local78 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24] = local78;
				@Pc(92) Object local92 = arg1[local63];
				arg1[local63] = arg1[local24];
				arg1[local24++] = local92;
			}
		}
		arg0[arg3] = arg0[local24];
		arg0[local24] = local28;
		arg1[arg3] = arg1[local24];
		arg1[local24] = local42;
		method3315(arg0, arg1, arg2, local24 - 1);
		method3315(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method3316(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(arg0);
		@Pc(12) int local12 = local8.method4130();
		@Pc(16) int local16 = local8.method4087();
		if (local16 < 0 || Static214.anInt3907 != 0 && Static214.anInt3907 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(90) byte[] local90 = new byte[local16];
			local8.method4102(local90, local16);
			return local90;
		} else {
			@Pc(50) int local50 = local8.method4087();
			if (local50 < 0 || Static214.anInt3907 != 0 && Static214.anInt3907 < local50) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local50];
			if (local12 == 1) {
				Static5.method174(local68, local50, arg0, local16);
			} else {
				Static234.aClass216_1.method5043(local68, local8);
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)I")
	public static int method3318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg3 : arg0;
		@Pc(40) int local40 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg0 : arg1) : arg3;
		return ((local12 & 0x2) == 0 ? local40 : -local40) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}
}

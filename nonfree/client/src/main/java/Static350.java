import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
	public static int anInt4879;

	@OriginalMember(owner = "client!oda", name = "Q", descriptor = "Lclient!oh;")
	public static Class220 aClass220_11 = null;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!aj;)V")
	public static void method4110(@OriginalArg(1) Class5_Sub3_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static457.anInt7876; local3++) {
			@Pc(14) int local14 = Static400.anIntArray557[local3];
			@Pc(18) Class15_Sub2_Sub1_Sub1 local18 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local14];
			@Pc(22) int local22 = arg0.method4220();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method4220() << 8;
			}
			if ((local22 & 0x4000) != 0) {
				local22 += arg0.method4220() << 16;
			}
			Static49.method1061(arg0, local18, local22, local14);
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "([ILclient!jk;[I[IB)V")
	public static void method4115(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class15_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg2[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg1.aClass170Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass170Array3[local23] = null;
					} else {
						@Pc(45) Class31 local45 = Static155.aClass76_2.method2152(local13);
						@Pc(48) int local48 = local45.anInt923;
						@Pc(53) Class170 local53 = arg1.aClass170Array3[local23];
						if (local53 != null) {
							if (local53.anInt5058 == local13) {
								if (local48 == 0) {
									local53 = arg1.aClass170Array3[local23] = null;
								} else if (local48 == 1) {
									local53.anInt5055 = 0;
									local53.anInt5054 = 0;
									local53.anInt5053 = 0;
									local53.anInt5052 = local21;
									local53.anInt5056 = 1;
									Static279.method4554(false, arg1.anInt8493, 0, local45, arg1.anInt8492, arg1.aByte91);
								} else if (local48 == 2) {
									local53.anInt5053 = 0;
								}
							} else if (local45.anInt933 >= Static155.aClass76_2.method2152(local53.anInt5058).anInt933) {
								local53 = arg1.aClass170Array3[local23] = null;
							}
						}
						if (local53 == null) {
							local53 = arg1.aClass170Array3[local23] = new Class170();
							local53.anInt5055 = 0;
							local53.anInt5053 = 0;
							local53.anInt5058 = local13;
							local53.anInt5054 = 0;
							local53.anInt5052 = local21;
							local53.anInt5056 = 1;
							Static279.method4554(false, arg1.anInt8493, 0, local45, arg1.anInt8492, arg1.aByte91);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}

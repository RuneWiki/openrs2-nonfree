import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	public static int anInt417;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!si;")
	public static final Class217 aClass217_3 = new Class217(5, 18);

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "Lclient!jb;")
	public static Class126 aClass126_1 = null;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "Lclient!gl;")
	public static final Class93 aClass93_1 = new Class93("", 11);

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "S")
	public static short aShort11 = 205;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method340() {
		if (Static404.anInt6892 == -1) {
			return;
		}
		@Pc(12) int local12 = Static284.aClass12_1.method4220();
		@Pc(16) int local16 = Static284.aClass12_1.method4219();
		@Pc(21) Class4_Sub10 local21 = (Class4_Sub10) Static157.aClass258_24.method5538();
		if (local21 != null) {
			local12 = local21.method1648();
			local16 = local21.method1652();
		}
		Static423.method4747(local12, 0, 0, Static404.anInt6892, local16, Static349.anInt6303, Static87.anInt1948, 0, 0);
		if (Static124.aClass126_5 != null) {
			Static417.method5458(local12, local16);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!co;IIIII)V")
	public static void method343(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4351 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static420.aLongArrayArrayArray128[arg1][local4][local7];
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
						@Pc(35) Class169 local35 = Static200.aClass169Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt4351; local37++) {
							if (arg0.aClass4_Sub8Array3[local37] == local35.aClass4_Sub8_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass4_Sub8Array3[arg0.anInt4351++] = local35.aClass4_Sub8_1;
						if (arg0.anInt4351 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt4351; local7 < 4; local7++) {
			arg0.aClass4_Sub8Array3[local7] = null;
		}
	}
}

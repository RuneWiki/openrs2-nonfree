import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
	public static int anInt2063;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
	public static int anInt2068 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method1697(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static375.method4864(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(40) int local40;
			do {
				local40 = arg1.nextInt();
			} while (local40 >= local37);
			return Static54.method706(arg0, local40);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZII)Lclient!kw;")
	public static Class1_Sub28 method1698(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub28) Static172.aClass208_18.method4405(local16);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method1699() {
		@Pc(7) int local7 = Static103.anInt6434;
		@Pc(14) int[] local14 = Static56.anIntArray110;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class11_Sub1_Sub3_Sub2 local24 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local14[local16]];
			if (local24 != null && local24.anInt3305 > 0) {
				local24.anInt3305--;
				if (local24.anInt3305 == 0) {
					local24.aString31 = null;
				}
			}
		}
		for (@Pc(47) int local47 = 0; local47 < Static137.anInt2142; local47++) {
			@Pc(54) long local54 = (long) Static135.anIntArray183[local47];
			@Pc(60) Class1_Sub44 local60 = (Class1_Sub44) Static46.aClass208_33.method4405(local54);
			if (local60 != null) {
				@Pc(65) Class11_Sub1_Sub3_Sub1 local65 = local60.aClass11_Sub1_Sub3_Sub1_2;
				if (local65.anInt3305 > 0) {
					local65.anInt3305--;
					if (local65.anInt3305 == 0) {
						local65.aString31 = null;
					}
				}
			}
		}
	}
}

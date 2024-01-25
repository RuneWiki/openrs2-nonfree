import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jea", name = "A", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!jea", name = "y", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_68 = new Class218(63, 2);

	@OriginalMember(owner = "client!jea", name = "z", descriptor = "[I")
	public static final int[] anIntArray429 = new int[2048];

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!gaa;B)V")
	public static void method4427(@OriginalArg(0) Class3_Sub25_Sub1 arg0) {
		arg0.method3399();
		@Pc(10) int local10 = 0;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static393.anInt6147; local12++) {
			@Pc(18) int local18 = Static430.anIntArray612[local12];
			if ((Static44.aByteArray8[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static44.aByteArray8[local18] = (byte) (Static44.aByteArray8[local18] | 0x2);
					local10--;
				} else {
					local46 = arg0.method3402(1);
					if (local46 == 0) {
						local10 = Static196.method3565(arg0);
						Static44.aByteArray8[local18] = (byte) (Static44.aByteArray8[local18] | 0x2);
					} else {
						Static461.method6712(local18, arg0);
					}
				}
			}
		}
		arg0.method3393();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3399();
		@Pc(104) int local104;
		@Pc(135) int local135;
		for (local46 = 0; local46 < Static393.anInt6147; local46++) {
			local104 = Static430.anIntArray612[local46];
			if ((Static44.aByteArray8[local104] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static44.aByteArray8[local104] = (byte) (Static44.aByteArray8[local104] | 0x2);
				} else {
					local135 = arg0.method3402(1);
					if (local135 == 0) {
						local10 = Static196.method3565(arg0);
						Static44.aByteArray8[local104] = (byte) (Static44.aByteArray8[local104] | 0x2);
					} else {
						Static461.method6712(local104, arg0);
					}
				}
			}
		}
		arg0.method3393();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3399();
		@Pc(216) int local216;
		for (local104 = 0; local104 < Static340.anInt5684; local104++) {
			local135 = Static416.anIntArray588[local104];
			if ((Static44.aByteArray8[local135] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static44.aByteArray8[local135] = (byte) (Static44.aByteArray8[local135] | 0x2);
				} else {
					local216 = arg0.method3402(1);
					if (local216 == 0) {
						local10 = Static196.method3565(arg0);
						Static44.aByteArray8[local135] = (byte) (Static44.aByteArray8[local135] | 0x2);
					} else if (Static66.method1350(local135, arg0)) {
						Static44.aByteArray8[local135] = (byte) (Static44.aByteArray8[local135] | 0x2);
					}
				}
			}
		}
		arg0.method3393();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3399();
		for (local135 = 0; local135 < Static340.anInt5684; local135++) {
			local216 = Static416.anIntArray588[local135];
			if ((Static44.aByteArray8[local216] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static44.aByteArray8[local216] = (byte) (Static44.aByteArray8[local216] | 0x2);
				} else {
					@Pc(300) int local300 = arg0.method3402(1);
					if (local300 == 0) {
						local10 = Static196.method3565(arg0);
						Static44.aByteArray8[local216] = (byte) (Static44.aByteArray8[local216] | 0x2);
					} else if (Static66.method1350(local216, arg0)) {
						Static44.aByteArray8[local216] = (byte) (Static44.aByteArray8[local216] | 0x2);
					}
				}
			}
		}
		arg0.method3393();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static340.anInt5684 = 0;
		Static393.anInt6147 = 0;
		for (local216 = 1; local216 < 2048; local216++) {
			Static44.aByteArray8[local216] = (byte) (Static44.aByteArray8[local216] >> 1);
			@Pc(365) Class28_Sub1_Sub1_Sub1_Sub1 local365 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local216];
			if (local365 == null) {
				Static416.anIntArray588[Static340.anInt5684++] = local216;
			} else {
				Static430.anIntArray612[Static393.anInt6147++] = local216;
			}
		}
	}
}

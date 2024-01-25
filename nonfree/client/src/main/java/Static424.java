import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_228 = new Class189("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "[I")
	public static final int[] anIntArray502 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!ob;)V")
	public static void method5400(@OriginalArg(1) Class7_Sub2_Sub3 arg0) {
		@Pc(12) int local12 = arg0.anInt4339 - Static253.anInt4787;
		@Pc(24) int local24 = arg0.anInt4372 * 128 + arg0.method3499() * 64;
		@Pc(35) int local35 = arg0.anInt4343 * 128 + arg0.method3499() * 64;
		arg0.anInt4318 += (local24 - arg0.anInt4318) / local12;
		arg0.anInt4405 = 0;
		arg0.anInt4321 += (local35 - arg0.anInt4321) / local12;
		if (arg0.anInt4393 == 0) {
			arg0.method3506(8192);
		}
		if (arg0.anInt4393 == 1) {
			arg0.method3506(12288);
		}
		if (arg0.anInt4393 == 2) {
			arg0.method3506(0);
		}
		if (arg0.anInt4393 == 3) {
			arg0.method3506(4096);
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	public static void method5403() {
		for (@Pc(14) Class3_Sub4_Sub11 local14 = (Class3_Sub4_Sub11) Static365.aClass243_38.method5208(); local14 != null; local14 = (Class3_Sub4_Sub11) Static365.aClass243_38.method5203()) {
			@Pc(19) Class7_Sub2_Sub5 local19 = local14.aClass7_Sub2_Sub5_1;
			if (local19.aBoolean263) {
				local14.method5977();
				local19.method2146();
			} else if (local19.anInt2851 <= Static253.anInt4787) {
				local19.method2142(Static115.anInt2498);
				if (local19.aBoolean263) {
					local14.method5977();
				} else {
					Static149.method2419(local19, true);
				}
			}
		}
	}
}

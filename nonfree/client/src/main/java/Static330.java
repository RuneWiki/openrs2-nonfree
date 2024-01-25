import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public static int anInt6005;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
	public static int anInt6009 = 0;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_214 = new Class184(16, 6);

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean424 = true;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V")
	public static void method4791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub1 local13 = local7.aClass1_Sub1_2;
		@Pc(16) Class1_Sub1 local16 = local7.aClass1_Sub1_3;
		if (local13 != null) {
			local13.anInt5372 = local13.anInt5372 * arg3 / (0x10 << Static287.anInt5248 - 7);
			local13.anInt5367 = local13.anInt5367 * arg3 / (0x10 << Static287.anInt5248 - 7);
		}
		if (local16 != null) {
			local16.anInt5372 = local16.anInt5372 * arg3 / (0x10 << Static287.anInt5248 - 7);
			local16.anInt5367 = local16.anInt5367 * arg3 / (0x10 << Static287.anInt5248 - 7);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public static void method4794() {
		Static207.anInt4136 = 0;
		for (@Pc(11) int local11 = 0; local11 < 2048; local11++) {
			Static319.aClass3_Sub2Array1[local11] = null;
			Static365.aByteArray71[local11] = 1;
			Static405.aClass239Array1[local11] = null;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZ)V")
	public static void method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class14 local9 = Static125.aClass14ArrayArray2[arg0][arg1];
		if (local9 != null) {
			Static47.anInt1161 = local9.anInt574;
			Static424.anInt2293 = local9.anInt570;
			Static181.anInt3716 = local9.anInt569;
		}
		Static85.method5965();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)I")
	public static int method4797(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)Lclient!lk;")
	public static Class145_Sub1 method4798() {
		Static191.anInt3840 = 0;
		return Static7.method161();
	}
}

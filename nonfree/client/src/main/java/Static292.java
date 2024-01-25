import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt5815;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
	public static final int[] anIntArray454 = new int[1000];

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public static int anInt5818 = -1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIBI)V")
	public static void method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg1);
		@Pc(28) int local28 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg3);
		@Pc(36) int local36 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg2);
		@Pc(42) int local42 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg4);
		for (@Pc(44) int local44 = local11; local44 <= local28; local44++) {
			Static115.method2278(Static364.anIntArrayArray57[local44], local42, arg0, local36);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
	public static int method4861() {
		return Static16.anInt274;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method4862() {
		@Pc(11) int local11 = Static9.anInt173;
		@Pc(13) int[] local13 = Static195.anIntArray322;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class1_Sub2_Sub3_Sub1 local23 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local13[local15]];
			if (local23 != null) {
				Static313.method5192(local23, local23.method5787());
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method4863(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		@Pc(40) int local40 = arg0 / 10;
		while (local40 != 0) {
			local40 /= 10;
			local36++;
		}
		@Pc(52) char[] local52 = new char[local36];
		local52[0] = '+';
		for (@Pc(60) int local60 = local36 - 1; local60 > 0; local60--) {
			@Pc(64) int local64 = arg0;
			arg0 /= 10;
			@Pc(74) int local74 = local64 - arg0 * 10;
			if (local74 >= 10) {
				local52[local60] = (char) (local74 + 87);
			} else {
				local52[local60] = (char) (local74 + 48);
			}
		}
		return new String(local52);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
	public static boolean method4864() {
		try {
			return Static296.method5454();
		} catch (@Pc(13) IOException local13) {
			Static36.method468();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(79) String local79 = "T2 - " + (Static40.aClass221_34 == null ? -1 : Static40.aClass221_34.method5737()) + "," + (Static67.aClass221_143 == null ? -1 : Static67.aClass221_143.method5737()) + "," + (Static279.aClass221_135 == null ? -1 : Static279.aClass221_135.method5737()) + " - " + Static275.anInt5636 + "," + (Static150.anInt3453 + Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0]) + "," + (Static287.anInt5776 + Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0]) + " - ";
			for (@Pc(81) int local81 = 0; Static275.anInt5636 > local81 && local81 < 50; local81++) {
				local79 = local79 + Static273.aClass2_Sub12_Sub2_3.aByteArray30[local81] + ",";
			}
			Static40.method506(local79, local20);
			Static348.method2469();
			return true;
		}
	}
}

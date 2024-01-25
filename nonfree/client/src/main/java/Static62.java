import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	public static int anInt965;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_17 = new Class242(74, 3);

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_45 = new Class67(68, -2);

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	public static int anInt966 = 0;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_46 = new Class67(10, -1);

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!am;")
	public static Class14 aClass14_4 = new Class14();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public static void method849(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg0, 12);
		local8.method385();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!jp;B)V")
	public static void method851(@OriginalArg(0) Class1_Sub19_Sub2 arg0) {
		arg0.method2941();
		@Pc(18) int local18 = 0;
		@Pc(26) int local26;
		@Pc(51) int local51;
		for (@Pc(20) int local20 = 0; local20 < Static103.anInt6434; local20++) {
			local26 = Static56.anIntArray110[local20];
			if ((Static207.aByteArray40[local26] & 0x1) == 0) {
				if (local18 > 0) {
					Static207.aByteArray40[local26] = (byte) (Static207.aByteArray40[local26] | 0x2);
					local18--;
				} else {
					local51 = arg0.method2946(1);
					if (local51 == 0) {
						local18 = Static10.method4083(arg0);
						Static207.aByteArray40[local26] = (byte) (Static207.aByteArray40[local26] | 0x2);
					} else {
						Static437.method5493(arg0, local26);
					}
				}
			}
		}
		arg0.method2940();
		if (local18 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2941();
		@Pc(128) int local128;
		for (local26 = 0; local26 < Static103.anInt6434; local26++) {
			local51 = Static56.anIntArray110[local26];
			if ((Static207.aByteArray40[local51] & 0x1) != 0) {
				if (local18 > 0) {
					Static207.aByteArray40[local51] = (byte) (Static207.aByteArray40[local51] | 0x2);
					local18--;
				} else {
					local128 = arg0.method2946(1);
					if (local128 == 0) {
						local18 = Static10.method4083(arg0);
						Static207.aByteArray40[local51] = (byte) (Static207.aByteArray40[local51] | 0x2);
					} else {
						Static437.method5493(arg0, local51);
					}
				}
			}
		}
		arg0.method2940();
		if (local18 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2941();
		@Pc(203) int local203;
		for (local51 = 0; local51 < Static260.anInt4568; local51++) {
			local128 = Static10.anIntArray386[local51];
			if ((Static207.aByteArray40[local128] & 0x1) != 0) {
				if (local18 > 0) {
					Static207.aByteArray40[local128] = (byte) (Static207.aByteArray40[local128] | 0x2);
					local18--;
				} else {
					local203 = arg0.method2946(1);
					if (local203 == 0) {
						local18 = Static10.method4083(arg0);
						Static207.aByteArray40[local128] = (byte) (Static207.aByteArray40[local128] | 0x2);
					} else if (Static220.method3160(local128, arg0)) {
						Static207.aByteArray40[local128] = (byte) (Static207.aByteArray40[local128] | 0x2);
					}
				}
			}
		}
		arg0.method2940();
		if (local18 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2941();
		for (local128 = 0; local128 < Static260.anInt4568; local128++) {
			local203 = Static10.anIntArray386[local128];
			if ((Static207.aByteArray40[local203] & 0x1) == 0) {
				if (local18 > 0) {
					Static207.aByteArray40[local203] = (byte) (Static207.aByteArray40[local203] | 0x2);
					local18--;
				} else {
					@Pc(287) int local287 = arg0.method2946(1);
					if (local287 == 0) {
						local18 = Static10.method4083(arg0);
						Static207.aByteArray40[local203] = (byte) (Static207.aByteArray40[local203] | 0x2);
					} else if (Static220.method3160(local203, arg0)) {
						Static207.aByteArray40[local203] = (byte) (Static207.aByteArray40[local203] | 0x2);
					}
				}
			}
		}
		arg0.method2940();
		if (local18 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static260.anInt4568 = 0;
		Static103.anInt6434 = 0;
		for (local203 = 1; local203 < 2048; local203++) {
			Static207.aByteArray40[local203] = (byte) (Static207.aByteArray40[local203] >> 1);
			@Pc(358) Class11_Sub1_Sub3_Sub2 local358 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local203];
			if (local358 == null) {
				Static10.anIntArray386[Static260.anInt4568++] = local203;
			} else {
				Static56.anIntArray110[Static103.anInt6434++] = local203;
			}
		}
	}
}

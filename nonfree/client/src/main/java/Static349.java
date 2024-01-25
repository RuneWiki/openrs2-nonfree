import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static int anInt6237;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt6239 = -1;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!oo;B)V")
	public static void method5024(@OriginalArg(0) Class3_Sub26_Sub1 arg0) {
		arg0.method5554();
		@Pc(10) int local10 = 0;
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(12) int local12 = 0; local12 < Static31.anInt499; local12++) {
			local20 = Static315.anIntArray279[local12];
			if ((Static213.aByteArray106[local20] & 0x1) == 0) {
				if (local10 > 0) {
					Static213.aByteArray106[local20] = (byte) (Static213.aByteArray106[local20] | 0x2);
					local10--;
				} else {
					local48 = arg0.method5553(1);
					if (local48 == 0) {
						local10 = Static283.method4266(arg0);
						Static213.aByteArray106[local20] = (byte) (Static213.aByteArray106[local20] | 0x2);
					} else {
						Static508.method6870(arg0, local20);
					}
				}
			}
		}
		arg0.method5547();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5554();
		@Pc(127) int local127;
		for (local20 = 0; local20 < Static31.anInt499; local20++) {
			local48 = Static315.anIntArray279[local20];
			if ((Static213.aByteArray106[local48] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static213.aByteArray106[local48] = (byte) (Static213.aByteArray106[local48] | 0x2);
				} else {
					local127 = arg0.method5553(1);
					if (local127 == 0) {
						local10 = Static283.method4266(arg0);
						Static213.aByteArray106[local48] = (byte) (Static213.aByteArray106[local48] | 0x2);
					} else {
						Static508.method6870(arg0, local48);
					}
				}
			}
		}
		arg0.method5547();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5554();
		@Pc(207) int local207;
		for (local48 = 0; local48 < Static333.anInt6021; local48++) {
			local127 = Static488.anIntArray501[local48];
			if ((Static213.aByteArray106[local127] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static213.aByteArray106[local127] = (byte) (Static213.aByteArray106[local127] | 0x2);
				} else {
					local207 = arg0.method5553(1);
					if (local207 == 0) {
						local10 = Static283.method4266(arg0);
						Static213.aByteArray106[local127] = (byte) (Static213.aByteArray106[local127] | 0x2);
					} else if (Static557.method4956(arg0, local127)) {
						Static213.aByteArray106[local127] = (byte) (Static213.aByteArray106[local127] | 0x2);
					}
				}
			}
		}
		arg0.method5547();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5554();
		for (local127 = 0; local127 < Static333.anInt6021; local127++) {
			local207 = Static488.anIntArray501[local127];
			if ((Static213.aByteArray106[local207] & 0x1) == 0) {
				if (local10 > 0) {
					Static213.aByteArray106[local207] = (byte) (Static213.aByteArray106[local207] | 0x2);
					local10--;
				} else {
					@Pc(291) int local291 = arg0.method5553(1);
					if (local291 == 0) {
						local10 = Static283.method4266(arg0);
						Static213.aByteArray106[local207] = (byte) (Static213.aByteArray106[local207] | 0x2);
					} else if (Static557.method4956(arg0, local207)) {
						Static213.aByteArray106[local207] = (byte) (Static213.aByteArray106[local207] | 0x2);
					}
				}
			}
		}
		arg0.method5547();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static31.anInt499 = 0;
		Static333.anInt6021 = 0;
		for (local207 = 1; local207 < 2048; local207++) {
			Static213.aByteArray106[local207] = (byte) (Static213.aByteArray106[local207] >> 1);
			@Pc(363) Class25_Sub2_Sub2_Sub5_Sub1 local363 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local207];
			if (local363 == null) {
				Static488.anIntArray501[Static333.anInt6021++] = local207;
			} else {
				Static315.anIntArray279[Static31.anInt499++] = local207;
			}
		}
	}
}

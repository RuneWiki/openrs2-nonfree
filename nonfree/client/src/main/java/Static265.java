import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public static int anInt5240;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame25;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	public static final int[] anIntArray328 = new int[2];

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "[B")
	public static final byte[] aByteArray69 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZZ)V")
	public static void method4417(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static267.anInt5241++;
			Static336.method5136();
		}
		if (arg0) {
			Static532.anInt8970++;
			Static117.method2273();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLclient!aj;)V")
	public static void method4418(@OriginalArg(1) Class5_Sub3_Sub1 arg0) {
		arg0.method519();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static103.anInt992; local12++) {
			local18 = Static523.anIntArray682[local12];
			if ((Static92.aByteArray31[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static92.aByteArray31[local18] = (byte) (Static92.aByteArray31[local18] | 0x2);
				} else {
					local46 = arg0.method524(1);
					if (local46 == 0) {
						local10 = Static461.method6410(arg0);
						Static92.aByteArray31[local18] = (byte) (Static92.aByteArray31[local18] | 0x2);
					} else {
						Static304.method4999(arg0, local18);
					}
				}
			}
		}
		arg0.method532();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method519();
		@Pc(135) int local135;
		for (local18 = 0; local18 < Static103.anInt992; local18++) {
			local46 = Static523.anIntArray682[local18];
			if ((Static92.aByteArray31[local46] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static92.aByteArray31[local46] = (byte) (Static92.aByteArray31[local46] | 0x2);
				} else {
					local135 = arg0.method524(1);
					if (local135 == 0) {
						local10 = Static461.method6410(arg0);
						Static92.aByteArray31[local46] = (byte) (Static92.aByteArray31[local46] | 0x2);
					} else {
						Static304.method4999(arg0, local46);
					}
				}
			}
		}
		arg0.method532();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method519();
		@Pc(218) int local218;
		for (local46 = 0; local46 < Static427.anInt7533; local46++) {
			local135 = Static412.anIntArray568[local46];
			if ((Static92.aByteArray31[local135] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static92.aByteArray31[local135] = (byte) (Static92.aByteArray31[local135] | 0x2);
				} else {
					local218 = arg0.method524(1);
					if (local218 == 0) {
						local10 = Static461.method6410(arg0);
						Static92.aByteArray31[local135] = (byte) (Static92.aByteArray31[local135] | 0x2);
					} else if (Static317.method5106(arg0, local135)) {
						Static92.aByteArray31[local135] = (byte) (Static92.aByteArray31[local135] | 0x2);
					}
				}
			}
		}
		arg0.method532();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method519();
		for (local135 = 0; local135 < Static427.anInt7533; local135++) {
			local218 = Static412.anIntArray568[local135];
			if ((Static92.aByteArray31[local218] & 0x1) == 0) {
				if (local10 > 0) {
					Static92.aByteArray31[local218] = (byte) (Static92.aByteArray31[local218] | 0x2);
					local10--;
				} else {
					@Pc(305) int local305 = arg0.method524(1);
					if (local305 == 0) {
						local10 = Static461.method6410(arg0);
						Static92.aByteArray31[local218] = (byte) (Static92.aByteArray31[local218] | 0x2);
					} else if (Static317.method5106(arg0, local218)) {
						Static92.aByteArray31[local218] = (byte) (Static92.aByteArray31[local218] | 0x2);
					}
				}
			}
		}
		arg0.method532();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static427.anInt7533 = 0;
		Static103.anInt992 = 0;
		for (local218 = 1; local218 < 2048; local218++) {
			Static92.aByteArray31[local218] = (byte) (Static92.aByteArray31[local218] >> 1);
			@Pc(377) Class15_Sub2_Sub1_Sub1 local377 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local218];
			if (local377 == null) {
				Static412.anIntArray568[Static427.anInt7533++] = local218;
			} else {
				Static523.anIntArray682[Static103.anInt992++] = local218;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	public static void method4421() {
		Static481.aClass288_65.method6744();
		Static291.aClass288_41.method6744();
		Static420.aClass288_72.method6744();
		Static144.aClass288_21.method6744();
		Static92.aClass288_7.method6744();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V")
	public static void method4422(@OriginalArg(0) boolean arg0) {
		Static485.method6727();
		if (!Static319.method5139(Static389.anInt7024)) {
			return;
		}
		Static414.anInt8913++;
		if (Static414.anInt8913 < 50 && !arg0) {
			return;
		}
		Static414.anInt8913 = 0;
		if (!Static233.aBoolean269 && client.lb != null) {
			Static415.method5995(Static524.aClass236_94);
			try {
				client.lb.method4910(Static164.aClass5_Sub3_Sub1_2.anInt4960, Static164.aClass5_Sub3_Sub1_2.aByteArray66);
				Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
			} catch (@Pc(50) IOException local50) {
				Static233.aBoolean269 = true;
			}
		}
		Static485.method6727();
	}
}

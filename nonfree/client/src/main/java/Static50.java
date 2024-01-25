import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
	public static int anInt900;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZ)V")
	public static void method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static491.aFloat23 < Static491.aFloat24) {
			Static491.aFloat23 = (float) ((double) Static491.aFloat23 + (double) Static491.aFloat23 / 30.0D);
			if (Static491.aFloat24 < Static491.aFloat23) {
				Static491.aFloat23 = Static491.aFloat24;
			}
			Static127.method1898();
			Static491.anInt616 = (int) Static491.aFloat23 >> 1;
			Static491.aByteArrayArrayArray4 = Static362.method8359(Static491.anInt616, (byte) 117);
		} else if (Static491.aFloat24 < Static491.aFloat23) {
			Static491.aFloat23 = (float) ((double) Static491.aFloat23 - (double) Static491.aFloat23 / 30.0D);
			if (Static491.aFloat23 < Static491.aFloat24) {
				Static491.aFloat23 = Static491.aFloat24;
			}
			Static127.method1898();
			Static491.anInt616 = (int) Static491.aFloat23 >> 1;
			Static491.aByteArrayArrayArray4 = Static362.method8359(Static491.anInt616, (byte) 117);
		}
		if (Static403.anInt6785 != -1 && Static272.anInt4913 != -1) {
			@Pc(91) int local91 = Static403.anInt6785 - Static124.anInt2052;
			if (local91 < 2 || local91 > 2) {
				local91 /= 8;
			}
			@Pc(110) int local110 = Static272.anInt4913 - Static381.anInt6410;
			if (local110 < 2 || local110 > 2) {
				local110 /= 8;
			}
			Static124.anInt2052 -= -local91;
			Static381.anInt6410 -= -local110;
			if (local91 == 0 && local110 == 0) {
				Static272.anInt4913 = -1;
				Static403.anInt6785 = -1;
			}
			Static127.method1898();
		}
		if (Static396.anInt6671 > 0) {
			Static81.anInt1432--;
			if (Static81.anInt1432 == 0) {
				Static396.anInt6671--;
				Static81.anInt1432 = 100;
			}
		} else {
			Static284.anInt5035 = -1;
			Static557.anInt8788 = -1;
		}
		if (!Static173.aBoolean682 || Static542.aClass20_47 == null) {
			return;
		}
		for (@Pc(199) Class5_Sub52 local199 = (Class5_Sub52) Static542.aClass20_47.method378(); local199 != null; local199 = (Class5_Sub52) Static542.aClass20_47.method366()) {
			@Pc(208) Class313 local208 = Static491.aClass327_2.method7413(local199.aClass5_Sub49_1.anInt8675);
			if (local199.method8829(arg1, arg0)) {
				if (local208.aStringArray34 != null) {
					if (local208.aStringArray34[4] != null) {
						Static467.method6573(local208.anInt8176, 1004, -1, -1, local208.aString94, local208.aStringArray34[4], (long) local199.aClass5_Sub49_1.anInt8675, (long) local199.aClass5_Sub49_1.anInt8675, 0, false, false, true);
					}
					if (local208.aStringArray34[3] != null) {
						Static467.method6573(local208.anInt8176, 1012, -1, -1, local208.aString94, local208.aStringArray34[3], (long) local199.aClass5_Sub49_1.anInt8675, (long) local199.aClass5_Sub49_1.anInt8675, 0, false, false, true);
					}
					if (local208.aStringArray34[2] != null) {
						Static467.method6573(local208.anInt8176, 1011, -1, -1, local208.aString94, local208.aStringArray34[2], (long) local199.aClass5_Sub49_1.anInt8675, (long) local199.aClass5_Sub49_1.anInt8675, 0, false, false, true);
					}
					if (local208.aStringArray34[1] != null) {
						Static467.method6573(local208.anInt8176, 1008, -1, -1, local208.aString94, local208.aStringArray34[1], (long) local199.aClass5_Sub49_1.anInt8675, (long) local199.aClass5_Sub49_1.anInt8675, 0, false, false, true);
					}
					if (local208.aStringArray34[0] != null) {
						Static467.method6573(local208.anInt8176, 1006, -1, -1, local208.aString94, local208.aStringArray34[0], (long) local199.aClass5_Sub49_1.anInt8675, (long) local199.aClass5_Sub49_1.anInt8675, 0, false, false, true);
					}
				}
				if (!local199.aClass5_Sub49_1.aBoolean571) {
					local199.aClass5_Sub49_1.aBoolean571 = true;
					Static247.method3961(Static440.aClass208_8, local199.aClass5_Sub49_1.anInt8675, local208.anInt8176);
				}
				if (local199.aClass5_Sub49_1.aBoolean571) {
					Static247.method3961(Static566.aClass208_10, local199.aClass5_Sub49_1.anInt8675, local208.anInt8176);
				}
			} else if (local199.aClass5_Sub49_1.aBoolean571) {
				local199.aClass5_Sub49_1.aBoolean571 = false;
				Static247.method3961(Static666.aClass208_12, local199.aClass5_Sub49_1.anInt8675, local208.anInt8176);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!wu;")
	public static Class384 aClass384_78;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public static int anInt4874;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt4869 = 0;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	public static int anInt4876 = 0;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[Lclient!kb;")
	public static final Class182[] aClass182Array1 = new Class182[4];

	@OriginalMember(owner = "client!la", name = "x", descriptor = "I")
	public static int anInt4884 = -1;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "I")
	public static int anInt4885 = -1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V")
	public static void method4465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static203.aFloat4 > Static203.aFloat3) {
			Static203.aFloat3 = (float) ((double) Static203.aFloat3 + (double) Static203.aFloat3 / 30.0D);
			if (Static203.aFloat4 < Static203.aFloat3) {
				Static203.aFloat3 = Static203.aFloat4;
			}
			Static503.method3569();
			Static203.anInt126 = (int) Static203.aFloat3 >> 1;
			Static203.aByteArrayArrayArray2 = Static86.method1350(Static203.anInt126);
		} else if (Static203.aFloat4 < Static203.aFloat3) {
			Static203.aFloat3 = (float) ((double) Static203.aFloat3 - (double) Static203.aFloat3 / 30.0D);
			if (Static203.aFloat3 < Static203.aFloat4) {
				Static203.aFloat3 = Static203.aFloat4;
			}
			Static503.method3569();
			Static203.anInt126 = (int) Static203.aFloat3 >> 1;
			Static203.aByteArrayArrayArray2 = Static86.method1350(Static203.anInt126);
		}
		if (Static100.anInt1573 != -1 && Static486.anInt8186 != -1) {
			@Pc(85) int local85 = Static100.anInt1573 - Static504.anInt8544;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(99) int local99 = Static486.anInt8186 - Static449.anInt7564;
			if (local99 < 2 || local99 > 2) {
				local99 /= 8;
			}
			Static504.anInt8544 += local85;
			if (local85 == 0 && local99 == 0) {
				Static100.anInt1573 = -1;
				Static486.anInt8186 = -1;
			}
			Static449.anInt7564 += local99;
			Static503.method3569();
		}
		if (Static340.anInt5872 > 0) {
			Static10.anInt161--;
			if (Static10.anInt161 == 0) {
				Static340.anInt5872--;
				Static10.anInt161 = 100;
			}
		} else {
			Static299.anInt4748 = -1;
			Static95.anInt1501 = -1;
		}
		if (!Static415.aBoolean597 || Static173.aClass306_13 == null) {
			return;
		}
		for (@Pc(164) Class5_Sub26 local164 = (Class5_Sub26) Static173.aClass306_13.method7313(); local164 != null; local164 = (Class5_Sub26) Static173.aClass306_13.method7301()) {
			@Pc(173) Class72 local173 = Static203.aClass273_2.method6529(local164.aClass5_Sub39_1.anInt7217);
			if (local164.method4317(arg1, arg0)) {
				if (local173.aStringArray7 != null) {
					if (local173.aStringArray7[4] != null) {
						Static227.method3576(true, (long) local164.aClass5_Sub39_1.anInt7217, (long) local164.aClass5_Sub39_1.anInt7217, false, 0, 1012, false, -1, -1, local173.aStringArray7[4], local173.aString21, local173.anInt1513);
					}
					if (local173.aStringArray7[3] != null) {
						Static227.method3576(true, (long) local164.aClass5_Sub39_1.anInt7217, (long) local164.aClass5_Sub39_1.anInt7217, false, 0, 1001, false, -1, -1, local173.aStringArray7[3], local173.aString21, local173.anInt1513);
					}
					if (local173.aStringArray7[2] != null) {
						Static227.method3576(true, (long) local164.aClass5_Sub39_1.anInt7217, (long) local164.aClass5_Sub39_1.anInt7217, false, 0, 1007, false, -1, -1, local173.aStringArray7[2], local173.aString21, local173.anInt1513);
					}
					if (local173.aStringArray7[1] != null) {
						Static227.method3576(true, (long) local164.aClass5_Sub39_1.anInt7217, (long) local164.aClass5_Sub39_1.anInt7217, false, 0, 1004, false, -1, -1, local173.aStringArray7[1], local173.aString21, local173.anInt1513);
					}
					if (local173.aStringArray7[0] != null) {
						Static227.method3576(true, (long) local164.aClass5_Sub39_1.anInt7217, (long) local164.aClass5_Sub39_1.anInt7217, false, 0, 1006, false, -1, -1, local173.aStringArray7[0], local173.aString21, local173.anInt1513);
					}
				}
				if (!local164.aClass5_Sub39_1.aBoolean602) {
					local164.aClass5_Sub39_1.aBoolean602 = true;
					Static82.method1326(Static163.aClass74_17, local164.aClass5_Sub39_1.anInt7217, local173.anInt1513);
				}
				if (local164.aClass5_Sub39_1.aBoolean602) {
					Static82.method1326(Static91.aClass74_5, local164.aClass5_Sub39_1.anInt7217, local173.anInt1513);
				}
			} else if (local164.aClass5_Sub39_1.aBoolean602) {
				local164.aClass5_Sub39_1.aBoolean602 = false;
				Static82.method1326(Static211.aClass74_20, local164.aClass5_Sub39_1.anInt7217, local173.anInt1513);
			}
		}
	}
}

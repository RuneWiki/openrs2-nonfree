import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "Lclient!ac;")
	public static Class4 aClass4_2;

	@OriginalMember(owner = "client!cp", name = "C", descriptor = "Lclient!kr;")
	public static Class171 aClass171_29;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_7 = new Class313(4);

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "F")
	public static float aFloat15 = 0.0F;

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "Lclient!bda;")
	public static final Class21 aClass21_1 = new Class21("LIVE", 0);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!kr;IIIZ)V")
	public static void method1273(@OriginalArg(1) Class171 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static215.anInt4126 = arg2;
		Static55.aBoolean70 = false;
		Static101.anInt7631 = 10000;
		Static302.anInt5579 = 1;
		Static351.aClass171_102 = arg0;
		Static101.anInt7625 = arg1;
		Static38.anInt834 = 0;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method1276() {
		if (Static179.anInt3165 == 0) {
			return;
		}
		try {
			if (++Static458.anInt7794 > 2000) {
				if (Static402.aClass56_2 != null) {
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
				}
				if (Static184.anInt7342 >= 1) {
					Static179.anInt3165 = 0;
					Static270.anInt5118 = -5;
					return;
				}
				Static86.aClass4_4.aBoolean8 = !Static86.aClass4_4.aBoolean8;
				Static458.anInt7794 = 0;
				Static179.anInt3165 = 1;
				Static184.anInt7342++;
			}
			if (Static179.anInt3165 == 1) {
				Static214.aClass157_2 = Static466.aClass102_4.method2395(Static86.aClass4_4.aString2, Static86.aClass4_4.method243());
				Static179.anInt3165 = 2;
			}
			if (Static179.anInt3165 == 2) {
				if (Static214.aClass157_2.anInt4742 == 2) {
					throw new IOException();
				}
				if (Static214.aClass157_2.anInt4742 != 1) {
					return;
				}
				Static402.aClass56_2 = Static81.method1383((Socket) Static214.aClass157_2.anObject12);
				Static214.aClass157_2 = null;
				Static402.aClass56_2.method1315(Static455.aClass1_Sub6_Sub2_2.anInt4555, Static455.aClass1_Sub6_Sub2_2.aByteArray66);
				Static179.anInt3165 = 4;
			}
			@Pc(131) int local131;
			if (Static179.anInt3165 == 4) {
				if (!Static402.aClass56_2.method1313(1)) {
					return;
				}
				Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				local131 = Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF;
				if (local131 != 21) {
					Static270.anInt5118 = local131;
					Static179.anInt3165 = 0;
					Static402.aClass56_2.method1312();
					Static402.aClass56_2 = null;
					return;
				}
				Static179.anInt3165 = 5;
			}
			if (Static179.anInt3165 == 5) {
				if (!Static402.aClass56_2.method1313(1)) {
					return;
				}
				Static402.aClass56_2.method1316(1, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				Static147.aStringArray13 = new String[Static97.aClass1_Sub6_Sub2_1.aByteArray66[0] & 0xFF];
				Static179.anInt3165 = 6;
			}
			if (Static179.anInt3165 == 6 && Static402.aClass56_2.method1313(Static147.aStringArray13.length * 8)) {
				Static97.aClass1_Sub6_Sub2_1.anInt4555 = 0;
				Static402.aClass56_2.method1316(Static147.aStringArray13.length * 8, 0, Static97.aClass1_Sub6_Sub2_1.aByteArray66);
				for (local131 = 0; local131 < Static147.aStringArray13.length; local131++) {
					Static147.aStringArray13[local131] = Static545.method7543(Static97.aClass1_Sub6_Sub2_1.method3949());
				}
				Static270.anInt5118 = 21;
				Static179.anInt3165 = 0;
				Static402.aClass56_2.method1312();
				Static402.aClass56_2 = null;
			}
		} catch (@Pc(233) IOException local233) {
			if (Static402.aClass56_2 != null) {
				Static402.aClass56_2.method1312();
				Static402.aClass56_2 = null;
			}
			if (Static184.anInt7342 >= 1) {
				Static179.anInt3165 = 0;
				Static270.anInt5118 = -4;
			} else {
				Static458.anInt7794 = 0;
				Static86.aClass4_4.aBoolean8 = !Static86.aClass4_4.aBoolean8;
				Static179.anInt3165 = 1;
				Static184.anInt7342++;
			}
		}
	}
}

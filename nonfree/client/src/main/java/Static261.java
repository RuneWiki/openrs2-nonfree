import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!rs;")
	public static Class207 aClass207_21;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Z")
	public static boolean aBoolean488 = true;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_192 = new Class131(51, -1);

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
	public static final int[] anIntArray678 = new int[25];

	@OriginalMember(owner = "client!na", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[100];

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_43 = new Class27(16);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I")
	public static int method5973() {
		try {
			if (Static237.anInt4241 == 0) {
				if (Static153.aLong191 > Static101.method1557() - 5000L) {
					return 0;
				}
				Static202.aClass100_4 = Static119.aClass138_7.method3205(Static231.anInt4160, Static136.aString14);
				Static85.aLong46 = Static101.method1557();
				Static237.anInt4241 = 1;
			}
			if (Static101.method1557() > Static85.aLong46 + 30000L) {
				return Static176.method2750(1000);
			}
			@Pc(76) int local76;
			@Pc(106) int local106;
			if (Static237.anInt4241 == 1) {
				if (Static202.aClass100_4.anInt2365 == 2) {
					return Static176.method2750(1001);
				}
				if (Static202.aClass100_4.anInt2365 != 1) {
					return -1;
				}
				Static372.aClass161_6 = new Class161((Socket) Static202.aClass100_4.anObject4, Static119.aClass138_7);
				Static202.aClass100_4 = null;
				local76 = 0;
				if (Static144.aBoolean133) {
					local76 = Static233.anInt4178;
				}
				Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
				Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_9.anInt2675);
				Static232.aClass1_Sub1_Sub1_2.method4105(local76);
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
				Static363.method4998();
				local106 = Static372.aClass161_6.method3770();
				Static363.method4998();
				if (local106 != 0) {
					return Static176.method2750(local106);
				}
				Static237.anInt4241 = 2;
			}
			if (Static237.anInt4241 == 2) {
				if (Static372.aClass161_6.method3765() < 2) {
					return -1;
				}
				Static55.anInt1148 = Static372.aClass161_6.method3770();
				Static55.anInt1148 <<= 0x8;
				Static55.anInt1148 += Static372.aClass161_6.method3770();
				Static237.anInt4241 = 3;
				Static190.anInt3462 = 0;
				Static228.aByteArray53 = new byte[Static55.anInt1148];
			}
			if (Static237.anInt4241 != 3) {
				return -1;
			}
			local76 = Static372.aClass161_6.method3765();
			if (local76 < 1) {
				return -1;
			}
			if (Static55.anInt1148 - Static190.anInt3462 < local76) {
				local76 = Static55.anInt1148 - Static190.anInt3462;
			}
			Static372.aClass161_6.method3769(local76, Static190.anInt3462, Static228.aByteArray53);
			Static190.anInt3462 += local76;
			if (Static190.anInt3462 < Static55.anInt1148) {
				return -1;
			} else if (Static14.method303(Static228.aByteArray53)) {
				Static412.aClass196_Sub1Array2 = new Class196_Sub1[Static116.anInt2032];
				local106 = 0;
				for (@Pc(213) int local213 = Static185.anInt3367; local213 <= Static324.anInt5682; local213++) {
					@Pc(219) Class196_Sub1 local219 = Static66.method1141(local213);
					if (local219 != null) {
						Static412.aClass196_Sub1Array2[local106++] = local219;
					}
				}
				Static60.anInt1263 = 0;
				Static154.aClass1_Sub25_1 = null;
				Static372.aClass161_6.method3764();
				Static228.aByteArray53 = null;
				Static172.anInt3165 = 0;
				Static237.anInt4241 = 0;
				Static372.aClass161_6 = null;
				Static153.aLong191 = Static101.method1557();
				return 0;
			} else {
				return Static176.method2750(1002);
			}
		} catch (@Pc(257) IOException local257) {
			return Static176.method2750(1003);
		}
	}
}

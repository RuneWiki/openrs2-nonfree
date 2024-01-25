import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_174 = new Class77(0, -1);

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I")
	public static int method5597() {
		try {
			if (Static99.anInt1958 == 0) {
				if (Static51.method979() - 5000L < Static194.aLong113) {
					return 0;
				}
				Static356.aClass1_8 = Static92.aClass53_2.method1179(Static203.aString31, Static109.anInt2177);
				Static337.aLong185 = Static51.method979();
				Static99.anInt1958 = 1;
			}
			if (Static51.method979() > Static337.aLong185 + 30000L) {
				return Static286.method4397(1000);
			}
			@Pc(74) int local74;
			@Pc(112) int local112;
			if (Static99.anInt1958 == 1) {
				if (Static356.aClass1_8.anInt2 == 2) {
					return Static286.method4397(1001);
				}
				if (Static356.aClass1_8.anInt2 != 1) {
					return -1;
				}
				Static169.aClass124_3 = new Class124((Socket) Static356.aClass1_8.anObject1, Static92.aClass53_2);
				Static356.aClass1_8 = null;
				local74 = 0;
				Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
				if (Static73.aBoolean115) {
					local74 = Static206.anInt3828;
				}
				Static39.aClass2_Sub13_Sub2_4.method4207(Static74.aClass101_19.anInt2534);
				Static39.aClass2_Sub13_Sub2_4.method4218(local74);
				Static169.aClass124_3.method2717(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				local112 = Static169.aClass124_3.method2712();
				if (Static124.aClass45_3 != null) {
					Static124.aClass45_3.method3371();
				}
				if (Static267.aClass45_2 != null) {
					Static267.aClass45_2.method3371();
				}
				if (local112 != 0) {
					return Static286.method4397(local112);
				}
				Static99.anInt1958 = 2;
			}
			if (Static99.anInt1958 == 2) {
				if (Static169.aClass124_3.method2716() < 2) {
					return -1;
				}
				Static325.anInt5744 = Static169.aClass124_3.method2712();
				Static325.anInt5744 <<= 0x8;
				Static325.anInt5744 += Static169.aClass124_3.method2712();
				Static281.aByteArray78 = new byte[Static325.anInt5744];
				Static50.anInt1027 = 0;
				Static99.anInt1958 = 3;
			}
			if (Static99.anInt1958 != 3) {
				return -1;
			}
			local74 = Static169.aClass124_3.method2716();
			if (local74 < 1) {
				return -1;
			}
			if (local74 > Static325.anInt5744 - Static50.anInt1027) {
				local74 = Static325.anInt5744 - Static50.anInt1027;
			}
			Static169.aClass124_3.method2720(Static281.aByteArray78, local74, Static50.anInt1027);
			Static50.anInt1027 += local74;
			if (Static325.anInt5744 > Static50.anInt1027) {
				return -1;
			} else if (Static347.method5289(Static281.aByteArray78)) {
				Static197.aClass141_Sub1Array2 = new Class141_Sub1[Static151.anInt2710];
				local112 = 0;
				for (@Pc(217) int local217 = Static299.anInt5300; local217 <= Static232.anInt4266; local217++) {
					@Pc(223) Class141_Sub1 local223 = Static106.method1856(local217);
					if (local223 != null) {
						Static197.aClass141_Sub1Array2[local112++] = local223;
					}
				}
				Static28.anInt628 = 0;
				Static55.aClass2_Sub18_1 = null;
				Static169.aClass124_3.method2714();
				Static169.aClass124_3 = null;
				Static281.aByteArray78 = null;
				Static146.anInt2671 = 0;
				Static99.anInt1958 = 0;
				Static194.aLong113 = Static51.method979();
				return 0;
			} else {
				return Static286.method4397(1002);
			}
		} catch (@Pc(259) IOException local259) {
			return Static286.method4397(1003);
		}
	}
}

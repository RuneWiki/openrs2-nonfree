import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "Dd", descriptor = "I")
	public static int anInt893;

	@OriginalMember(owner = "client!bo", name = "Xb", descriptor = "I")
	public static int anInt813 = 1;

	@OriginalMember(owner = "client!bo", name = "oc", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_2 = new Class265();

	@OriginalMember(owner = "client!bo", name = "Fc", descriptor = "I")
	public static int anInt846 = 0;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "(I)V")
	public static void method655() {
		if (Static350.anInt6149 == 0) {
			return;
		}
		try {
			if (++Static334.anInt5940 > 1500) {
				if (Static423.aClass199_11 != null) {
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
				}
				if (Static402.anInt6993 >= 1) {
					Static33.anInt668 = -5;
					Static350.anInt6149 = 0;
					return;
				}
				Static402.anInt6993++;
				Static350.anInt6149 = 1;
				Static334.anInt5940 = 0;
				if (Static427.anInt7456 == Static11.anInt311) {
					Static11.anInt311 = Static135.anInt2654;
				} else {
					Static11.anInt311 = Static427.anInt7456;
				}
			}
			if (Static350.anInt6149 == 1) {
				Static195.aClass128_4 = Static303.aClass131_4.method3068(Static11.anInt311, Static78.aString16);
				Static350.anInt6149 = 2;
			}
			@Pc(115) int local115;
			if (Static350.anInt6149 == 2) {
				if (Static195.aClass128_4.anInt3727 == 2) {
					throw new IOException();
				}
				if (Static195.aClass128_4.anInt3727 != 1) {
					return;
				}
				Static423.aClass199_11 = new Class199((Socket) Static195.aClass128_4.anObject4, Static303.aClass131_4);
				Static195.aClass128_4 = null;
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
				Static347.method4871();
				local115 = Static423.aClass199_11.method4491();
				Static347.method4871();
				if (local115 != 101) {
					Static350.anInt6149 = 0;
					Static33.anInt668 = local115;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
					return;
				}
				Static350.anInt6149 = 3;
			}
			if (Static350.anInt6149 == 3 && Static423.aClass199_11.method4483() >= 2) {
				local115 = Static423.aClass199_11.method4491() << 8 | Static423.aClass199_11.method4491();
				Static5.method138(local115);
				if (Static62.anInt1710 == -1) {
					Static33.anInt668 = 6;
					Static350.anInt6149 = 0;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
				} else {
					Static350.anInt6149 = 0;
					Static423.aClass199_11.method4490();
					Static423.aClass199_11 = null;
					Static440.method5946();
				}
			}
		} catch (@Pc(185) IOException local185) {
			if (Static423.aClass199_11 != null) {
				Static423.aClass199_11.method4490();
				Static423.aClass199_11 = null;
			}
			if (Static402.anInt6993 < 1) {
				if (Static11.anInt311 == Static427.anInt7456) {
					Static11.anInt311 = Static135.anInt2654;
				} else {
					Static11.anInt311 = Static427.anInt7456;
				}
				Static402.anInt6993++;
				Static334.anInt5940 = 0;
				Static350.anInt6149 = 1;
			} else {
				Static350.anInt6149 = 0;
				Static33.anInt668 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZZB)V")
	public static void method660(@OriginalArg(0) boolean arg0) {
		Static360.anInt6341++;
		Static90.method1520();
		if (arg0) {
			Static63.anInt1753++;
			Static23.method322();
		}
	}
}

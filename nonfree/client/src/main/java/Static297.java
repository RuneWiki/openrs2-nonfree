import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Lclient!pb;")
	public static Class153 aClass153_1;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "Lclient!qj;")
	public static Class165 aClass165_88;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	public static int anInt5772 = 0;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "[I")
	public static final int[] anIntArray722 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!th", name = "P", descriptor = "[S")
	public static short[] aShortArray93 = new short[256];

	@OriginalMember(owner = "client!th", name = "Z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[100];

	@OriginalMember(owner = "client!th", name = "fb", descriptor = "Lclient!rg;")
	public static Class177 aClass177_20 = null;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	public static void method5090() {
		if (Static76.anInt1538 == 0) {
			return;
		}
		try {
			if (++Static350.anInt6501 > 2000) {
				if (Static153.aClass158_2 != null) {
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
				}
				if (Static183.anInt3821 >= 1) {
					Static202.anInt4091 = -5;
					Static76.anInt1538 = 0;
					return;
				}
				Static76.anInt1538 = 1;
				Static183.anInt3821++;
				if (Static211.anInt4206 == Static298.anInt5962) {
					Static298.anInt5962 = Static2.anInt3510;
				} else {
					Static298.anInt5962 = Static211.anInt4206;
				}
				Static350.anInt6501 = 0;
			}
			if (Static76.anInt1538 == 1) {
				Static59.aClass134_1 = Static180.aClass110_6.method3357(Static91.aString73, Static298.anInt5962);
				Static76.anInt1538 = 2;
			}
			@Pc(122) int local122;
			if (Static76.anInt1538 == 2) {
				if (Static59.aClass134_1.anInt4033 == 2) {
					throw new IOException();
				}
				if (Static59.aClass134_1.anInt4033 != 1) {
					return;
				}
				Static153.aClass158_2 = new Class158((Socket) Static59.aClass134_1.anObject6, Static180.aClass110_6);
				Static59.aClass134_1 = null;
				Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				local122 = Static153.aClass158_2.method4337();
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				if (local122 != 21) {
					Static76.anInt1538 = 0;
					Static202.anInt4091 = local122;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
					return;
				}
				Static76.anInt1538 = 3;
			}
			if (Static76.anInt1538 == 3) {
				if (Static153.aClass158_2.method4326() < 1) {
					return;
				}
				Static123.aStringArray23 = new String[Static153.aClass158_2.method4337()];
				Static76.anInt1538 = 4;
			}
			if (Static76.anInt1538 == 4 && Static153.aClass158_2.method4326() >= Static123.aStringArray23.length * 8) {
				Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
				Static153.aClass158_2.method4330(Static123.aStringArray23.length * 8, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
				for (local122 = 0; local122 < Static123.aStringArray23.length; local122++) {
					Static123.aStringArray23[local122] = Static43.method2806(Static232.aClass1_Sub7_Sub1_4.method3109());
				}
				Static76.anInt1538 = 0;
				Static202.anInt4091 = 21;
				Static153.aClass158_2.method4339();
				Static153.aClass158_2 = null;
			}
		} catch (@Pc(232) IOException local232) {
			if (Static153.aClass158_2 != null) {
				Static153.aClass158_2.method4339();
				Static153.aClass158_2 = null;
			}
			if (Static183.anInt3821 >= 1) {
				Static202.anInt4091 = -4;
				Static76.anInt1538 = 0;
			} else {
				if (Static211.anInt4206 == Static298.anInt5962) {
					Static298.anInt5962 = Static2.anInt3510;
				} else {
					Static298.anInt5962 = Static211.anInt4206;
				}
				Static76.anInt1538 = 1;
				Static183.anInt3821++;
				Static350.anInt6501 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!jj;)V")
	public static void method5092(@OriginalArg(1) Class5_Sub3_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt4961 - Static215.anInt4246;
		@Pc(21) int local21 = arg0.anInt4913 * 128 + arg0.method4541() * 64;
		@Pc(32) int local32 = arg0.anInt4955 * 128 + arg0.method4541() * 64;
		arg0.anInt5047 += (local32 - arg0.anInt5047) / local9;
		arg0.anInt5050 += (local21 - arg0.anInt5050) / local9;
		arg0.anInt4981 = 0;
		if (arg0.anInt4931 == 0) {
			arg0.method4527(8192);
		}
		if (arg0.anInt4931 == 1) {
			arg0.method4527(12288);
		}
		if (arg0.anInt4931 == 2) {
			arg0.method4527(0);
		}
		if (arg0.anInt4931 == 3) {
			arg0.method4527(4096);
		}
	}
}

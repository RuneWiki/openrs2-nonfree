import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!iq;")
	public static Class104 aClass104_168;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Lclient!iq;")
	public static Class104 aClass104_169;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_202 = new Class157(70, 7);

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
	public static final int[] anIntArray497 = new int[5];

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_10 = new Class144(64);

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt6405 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5389(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub12 local8 = new Class2_Sub12(arg0);
		@Pc(14) int local14 = local8.method3124();
		@Pc(18) int local18 = local8.method3135();
		if (local18 < 0 || Static95.anInt1911 != 0 && Static95.anInt1911 < local18) {
			throw new RuntimeException();
		} else if (local14 == 0) {
			@Pc(95) byte[] local95 = new byte[local18];
			local8.method3137(local95, local18);
			return local95;
		} else {
			@Pc(52) int local52 = local8.method3135();
			if (local52 < 0 || Static95.anInt1911 != 0 && local52 > Static95.anInt1911) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local52];
			if (local14 == 1) {
				Static320.method5312(local73, local52, arg0, local18);
			} else {
				Static137.aClass112_1.method3258(local8, local73);
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!dr;Lclient!ec;)V")
	public static void method5391(@OriginalArg(1) Class37 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static202.aClass2_Sub9_Sub17_2 == null) {
			return;
		}
		if (Static249.anInt5214 < 10) {
			if (!Static202.aClass104_127.method2753(Static202.aClass2_Sub9_Sub17_2.aString50)) {
				Static249.anInt5214 = Static92.aClass104_63.method2743(Static202.aClass2_Sub9_Sub17_2.aString50) / 10;
				return;
			}
			Static333.method5429();
			Static249.anInt5214 = 10;
		}
		if (Static249.anInt5214 == 10) {
			Static202.anInt4952 = Static202.aClass2_Sub9_Sub17_2.anInt5163 >> 6 << 6;
			Static202.anInt4958 = Static202.aClass2_Sub9_Sub17_2.anInt5171 >> 6 << 6;
			Static202.anInt4957 = (Static202.aClass2_Sub9_Sub17_2.anInt5170 >> 6 << 6) + 64 - Static202.anInt4958;
			Static202.anInt4956 = (Static202.aClass2_Sub9_Sub17_2.anInt5177 >> 6 << 6) + 64 - Static202.anInt4952;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static202.aClass2_Sub9_Sub17_2.method4368(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, Static287.anInt5776 + (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7), (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7) + Static150.anInt3453, local75)) {
				local77 = local75[1] - Static202.anInt4952;
				local79 = local75[2] - Static202.anInt4958;
			}
			if (!Static121.aBoolean244 && local77 >= 0 && Static202.anInt4956 > local77 && local79 >= 0 && Static202.anInt4957 > local79) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static105.anInt2196 = local79;
				Static298.anInt5924 = local77;
			} else if (Static207.anInt4535 == -1 || Static71.anInt1273 == -1) {
				Static202.aClass2_Sub9_Sub17_2.method4363(Static202.aClass2_Sub9_Sub17_2.anInt5168 & 0x3FFF, Static202.aClass2_Sub9_Sub17_2.anInt5168 >> 14 & 0x3FFF, local75);
				Static105.anInt2196 = local75[2] - Static202.anInt4958;
				Static298.anInt5924 = local75[1] - Static202.anInt4952;
			} else {
				Static202.aClass2_Sub9_Sub17_2.method4363(Static71.anInt1273, Static207.anInt4535, local75);
				Static121.aBoolean244 = false;
				Static71.anInt1273 = -1;
				Static207.anInt4535 = -1;
				if (local75 != null) {
					Static105.anInt2196 = local75[2] - Static202.anInt4958;
					Static298.anInt5924 = local75[1] - Static202.anInt4952;
				}
			}
			if (Static202.aClass2_Sub9_Sub17_2.anInt5167 == 37) {
				Static202.aFloat50 = 3.0F;
				Static202.aFloat49 = 3.0F;
			} else if (Static202.aClass2_Sub9_Sub17_2.anInt5167 == 50) {
				Static202.aFloat50 = 4.0F;
				Static202.aFloat49 = 4.0F;
			} else if (Static202.aClass2_Sub9_Sub17_2.anInt5167 == 75) {
				Static202.aFloat50 = 6.0F;
				Static202.aFloat49 = 6.0F;
			} else if (Static202.aClass2_Sub9_Sub17_2.anInt5167 == 100) {
				Static202.aFloat50 = 8.0F;
				Static202.aFloat49 = 8.0F;
			} else if (Static202.aClass2_Sub9_Sub17_2.anInt5167 == 200) {
				Static202.aFloat50 = 16.0F;
				Static202.aFloat49 = 16.0F;
			} else {
				Static202.aFloat50 = 8.0F;
				Static202.aFloat49 = 8.0F;
			}
			Static202.anInt4948 = (int) Static202.aFloat50 >> 1;
			Static202.aByteArrayArrayArray9 = Static212.method3985(Static202.anInt4948);
			Static220.method4160();
			Static202.method4225();
			Static284.aClass180_39 = new Class180();
			Static202.anInt4949 += (int) (Math.random() * 5.0D) - 2;
			if (Static202.anInt4949 < -8) {
				Static202.anInt4949 = -8;
			}
			Static202.anInt4947 += (int) (Math.random() * 5.0D) - 2;
			if (Static202.anInt4949 > 8) {
				Static202.anInt4949 = 8;
			}
			if (Static202.anInt4947 < -16) {
				Static202.anInt4947 = -16;
			}
			if (Static202.anInt4947 > 16) {
				Static202.anInt4947 = 16;
			}
			Static202.method4224(arg1, Static202.anInt4949 >> 2 << 10, Static202.anInt4947 >> 1);
			Static237.method4313(256, 1024);
			Static356.method5689(256, 256);
			Static65.method2536(4096);
			Static350.method5656(256);
			Static249.anInt5214 = 20;
		} else if (Static249.anInt5214 == 20) {
			Static18.method268(true);
			Static202.method4214(arg0, Static202.anInt4949, Static202.anInt4947);
			Static249.anInt5214 = 60;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 60) {
			if (Static202.aClass104_127.method2748(Static202.aClass2_Sub9_Sub17_2.aString50 + "_staticelements")) {
				if (!Static202.aClass104_127.method2753(Static202.aClass2_Sub9_Sub17_2.aString50 + "_staticelements")) {
					return;
				}
				Static202.aClass194_2 = Static287.method4846(Static235.aBoolean440, Static202.aClass2_Sub9_Sub17_2.aString50 + "_staticelements", Static202.aClass104_127);
			} else {
				Static202.aClass194_2 = new Class194(0);
			}
			Static202.method4219();
			Static249.anInt5214 = 70;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 70) {
			Static54.aClass189_1 = new Class189(arg0, 11, true, Static95.aCanvas3);
			Static249.anInt5214 = 73;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 73) {
			Static59.aClass189_2 = new Class189(arg0, 12, true, Static95.aCanvas3);
			Static249.anInt5214 = 76;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 76) {
			Static173.aClass189_5 = new Class189(arg0, 14, true, Static95.aCanvas3);
			Static249.anInt5214 = 79;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 79) {
			Static86.aClass189_4 = new Class189(arg0, 17, true, Static95.aCanvas3);
			Static249.anInt5214 = 82;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 82) {
			Static300.aClass189_8 = new Class189(arg0, 19, true, Static95.aCanvas3);
			Static249.anInt5214 = 85;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 85) {
			Static214.aClass189_6 = new Class189(arg0, 22, true, Static95.aCanvas3);
			Static249.anInt5214 = 88;
			Static18.method268(true);
			Static243.method4362();
		} else if (Static249.anInt5214 == 88) {
			Static256.aClass189_7 = new Class189(arg0, 26, true, Static95.aCanvas3);
			Static249.anInt5214 = 91;
			Static18.method268(true);
			Static243.method4362();
		} else {
			Static72.aClass189_3 = new Class189(arg0, 30, true, Static95.aCanvas3);
			Static249.anInt5214 = 100;
			Static18.method268(true);
			Static243.method4362();
			System.gc();
		}
	}
}

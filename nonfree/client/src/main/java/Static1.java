import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!ak;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt8;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public static int anInt1 = -1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public static int anInt2 = 2;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt3 = 2;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString1 = "wave:";

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lclient!ii;")
	public static Class78 method1(@OriginalArg(0) int arg0) {
		@Pc(10) Class78 local10 = (Class78) Static64.aClass31_12.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(31) byte[] local31 = Static88.aClass7_83.method253(arg0, 30);
		local10 = new Class78();
		if (local31 != null) {
			local10.method1780(arg0, new Class1_Sub18(local31));
		}
		Static64.aClass31_12.method851(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
	public static void method2(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static55.anIntArray140[arg0];
		@Pc(19) int local19 = Static221.anIntArray522[arg0];
		@Pc(23) long local23 = Static128.aLongArray6[arg0];
		@Pc(27) int local27 = Static276.aShortArray92[arg0];
		if (local27 >= 2000) {
			local27 -= 2000;
		}
		@Pc(39) int local39 = (int) Static128.aLongArray6[arg0];
		if (local27 == 14) {
			if (local39 == 0) {
				Static146.method2282(Static159.anInt2978, local15, local19);
			} else if (local39 == 1) {
				if (Static95.anInt1824 > 0 && Static246.aBooleanArray15[82] && Static246.aBooleanArray15[81]) {
					Static138.method2187(Static159.anInt2978, local15 + Static224.anInt4695, local19 + Static158.anInt2961);
				} else {
					Static11.method229(1, local15, local19);
					Static270.aClass1_Sub18_Sub1_3.method3093(Static206.anInt4113);
					Static270.aClass1_Sub18_Sub1_3.method3093(Static230.anInt4836);
					Static270.aClass1_Sub18_Sub1_3.method3123((int) Static177.aFloat97);
					Static270.aClass1_Sub18_Sub1_3.method3093(57);
					Static270.aClass1_Sub18_Sub1_3.method3093(Static35.anInt746);
					Static270.aClass1_Sub18_Sub1_3.method3093(Static155.anInt2868);
					Static270.aClass1_Sub18_Sub1_3.method3093(89);
					Static270.aClass1_Sub18_Sub1_3.method3123(Static28.aClass6_Sub6_Sub2_1.anInt4562);
					Static270.aClass1_Sub18_Sub1_3.method3123(Static28.aClass6_Sub6_Sub2_1.anInt4569);
					Static270.aClass1_Sub18_Sub1_3.method3093(Static162.anInt2997);
					Static270.aClass1_Sub18_Sub1_3.method3093(63);
				}
			}
		}
		@Pc(152) Class6_Sub6_Sub1 local152;
		if (local27 == 1005) {
			Static102.anInt1931 = Static207.anInt4122;
			Static220.anInt4583 = Static72.anInt1427;
			Static122.anInt2367 = 2;
			Static63.anInt1290 = 0;
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				@Pc(158) Class19 local158 = local152.aClass19_1;
				if (local158.anIntArray67 != null) {
					local158 = local158.method507();
				}
				if (local158 != null) {
					Static270.aClass1_Sub18_Sub1_3.method3130(194);
					Static270.aClass1_Sub18_Sub1_3.method3100(local158.anInt659);
				}
			}
		}
		if (local27 == 42) {
			Static63.anInt1290 = 0;
			Static102.anInt1931 = Static207.anInt4122;
			Static122.anInt2367 = 2;
			Static220.anInt4583 = Static72.anInt1427;
			Static270.aClass1_Sub18_Sub1_3.method3130(44);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static278.anInt5569);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3060(Static197.anInt3818);
			Static270.aClass1_Sub18_Sub1_3.method3089(Integer.MAX_VALUE & (int) (local23 >>> 32));
			Static270.aClass1_Sub18_Sub1_3.method3100(local15 + Static224.anInt4695);
		}
		if (local27 == 40) {
			if (local39 == 0) {
				Static121.anInt2351 = 1;
				Static146.method2282(Static159.anInt2978, local15, local19);
			} else if (local39 == 1) {
				Static270.aClass1_Sub18_Sub1_3.method3130(135);
				Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + local15);
				Static270.aClass1_Sub18_Sub1_3.method3089(Static278.anInt5569);
				Static270.aClass1_Sub18_Sub1_3.method3119(Static197.anInt3818);
				Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + local19);
			}
		}
		if (local27 == 6) {
			Static220.anInt4583 = Static72.anInt1427;
			Static122.anInt2367 = 2;
			Static102.anInt1931 = Static207.anInt4122;
			Static63.anInt1290 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3130(94);
			Static270.aClass1_Sub18_Sub1_3.method3123(Integer.MAX_VALUE & (int) (local23 >>> 32));
			Static270.aClass1_Sub18_Sub1_3.method3102(local15 + Static224.anInt4695);
			Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3100(local19 + Static158.anInt2961);
		}
		if (local27 == 25) {
			Static122.anInt2367 = 2;
			Static63.anInt1290 = 0;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static270.aClass1_Sub18_Sub1_3.method3130(5);
			Static270.aClass1_Sub18_Sub1_3.method3100(Integer.MAX_VALUE & (int) (local23 >>> 32));
			Static270.aClass1_Sub18_Sub1_3.method3100(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3093(Static246.aBooleanArray15[82] ? 1 : 0);
		}
		@Pc(417) Class6_Sub6_Sub2 local417;
		if (local27 == 19) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static122.anInt2367 = 2;
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(161);
				Static270.aClass1_Sub18_Sub1_3.method3093(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3089(local39);
			}
		}
		if (local27 == 50) {
			Static270.aClass1_Sub18_Sub1_3.method3130(229);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static278.anInt5569);
			Static270.aClass1_Sub18_Sub1_3.method3100(local15);
			Static270.aClass1_Sub18_Sub1_3.method3060(Static197.anInt3818);
			Static270.aClass1_Sub18_Sub1_3.method3120(local19);
		}
		if (local27 == 8) {
			Static270.aClass1_Sub18_Sub1_3.method3130(52);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			Static270.aClass1_Sub18_Sub1_3.method3100(local15);
			Static270.aClass1_Sub18_Sub1_3.method3089(local39);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 4) {
			Static122.anInt2367 = 2;
			Static102.anInt1931 = Static207.anInt4122;
			Static63.anInt1290 = 0;
			Static220.anInt4583 = Static72.anInt1427;
			Static270.aClass1_Sub18_Sub1_3.method3130(36);
			Static270.aClass1_Sub18_Sub1_3.method3123(local15 + Static224.anInt4695);
			Static270.aClass1_Sub18_Sub1_3.method3100(local19 + Static158.anInt2961);
			Static270.aClass1_Sub18_Sub1_3.method3100(local39);
			Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
		}
		if (local27 == 58) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static102.anInt1931 = Static207.anInt4122;
				Static220.anInt4583 = Static72.anInt1427;
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(152);
				Static270.aClass1_Sub18_Sub1_3.method3119(Static180.anInt3326);
				Static270.aClass1_Sub18_Sub1_3.method3089(local39);
				Static270.aClass1_Sub18_Sub1_3.method3100(Static273.anInt5456);
				Static270.aClass1_Sub18_Sub1_3.method3100(Static293.anInt5832);
				Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 13 && Static91.aClass127_4 == null) {
			Static133.method2132(local15, local19);
			Static91.aClass127_4 = Static241.method3829(local15, local19);
			Static155.method2392(Static91.aClass127_4);
		}
		if (local27 == 18) {
			Static270.aClass1_Sub18_Sub1_3.method3130(57);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			Static270.aClass1_Sub18_Sub1_3.method3100(Static293.anInt5832);
			Static270.aClass1_Sub18_Sub1_3.method3089(local15);
			Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static273.anInt5456);
			Static270.aClass1_Sub18_Sub1_3.method3106(Static180.anInt3326);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		@Pc(701) Class127 local701;
		@Pc(720) int local720;
		if (local27 == 16) {
			Static270.aClass1_Sub18_Sub1_3.method3130(124);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			local701 = Static75.method1287(local19);
			if (local701.anIntArrayArray30 != null && local701.anIntArrayArray30[0][0] == 5) {
				local720 = local701.anIntArrayArray30[0][1];
				if (Static224.anIntArray535[local720] != local701.anIntArray421[0]) {
					Static224.anIntArray535[local720] = local701.anIntArray421[0];
					Static293.method4499(local720);
				}
			}
		}
		if (local27 == 48) {
			Static122.anInt2367 = 2;
			Static63.anInt1290 = 0;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static270.aClass1_Sub18_Sub1_3.method3130(83);
			Static270.aClass1_Sub18_Sub1_3.method3100(Integer.MAX_VALUE & (int) (local23 >>> 32));
			Static270.aClass1_Sub18_Sub1_3.method3123(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
		}
		if (local27 == 44) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static102.anInt1931 = Static207.anInt4122;
				Static220.anInt4583 = Static72.anInt1427;
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(150);
				Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3123(local39);
				Static270.aClass1_Sub18_Sub1_3.method3119(Static197.anInt3818);
				Static270.aClass1_Sub18_Sub1_3.method3100(Static278.anInt5569);
			}
		}
		if (local27 == 45) {
			Static270.aClass1_Sub18_Sub1_3.method3130(213);
			Static270.aClass1_Sub18_Sub1_3.method3106(local19);
			Static270.aClass1_Sub18_Sub1_3.method3123(local15);
			Static270.aClass1_Sub18_Sub1_3.method3089(local39);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 15) {
			Static270.aClass1_Sub18_Sub1_3.method3130(139);
			Static270.aClass1_Sub18_Sub1_3.method3060(local19);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			Static270.aClass1_Sub18_Sub1_3.method3123(local15);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 3) {
			Static270.aClass1_Sub18_Sub1_3.method3130(143);
			Static270.aClass1_Sub18_Sub1_3.method3089(local15);
			Static270.aClass1_Sub18_Sub1_3.method3089(local39);
			Static270.aClass1_Sub18_Sub1_3.method3106(local19);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 5) {
			Static122.anInt2367 = 2;
			Static102.anInt1931 = Static207.anInt4122;
			Static220.anInt4583 = Static72.anInt1427;
			Static63.anInt1290 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3130(191);
			Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3100(local39);
			Static270.aClass1_Sub18_Sub1_3.method3123(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + local19);
		}
		if (local27 == 35) {
			Static102.anInt1931 = Static207.anInt4122;
			Static220.anInt4583 = Static72.anInt1427;
			Static122.anInt2367 = 2;
			Static63.anInt1290 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3130(209);
			Static270.aClass1_Sub18_Sub1_3.method3100(Static273.anInt5456);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static293.anInt5832);
			Static270.aClass1_Sub18_Sub1_3.method3106(Static180.anInt3326);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3089(local15 + Static224.anInt4695);
			Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			Static270.aClass1_Sub18_Sub1_3.method3093(Static246.aBooleanArray15[82] ? 1 : 0);
		}
		if (local27 == 1001) {
			Static122.anInt2367 = 2;
			Static102.anInt1931 = Static207.anInt4122;
			Static220.anInt4583 = Static72.anInt1427;
			Static63.anInt1290 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3130(155);
			Static270.aClass1_Sub18_Sub1_3.method3089(local39);
		}
		if (local27 == 30) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static270.aClass1_Sub18_Sub1_3.method3130(1);
				Static270.aClass1_Sub18_Sub1_3.method3089(local39);
				Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 28) {
			Static63.anInt1290 = 0;
			Static122.anInt2367 = 2;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static270.aClass1_Sub18_Sub1_3.method3130(176);
			Static270.aClass1_Sub18_Sub1_3.method3089((int) (local23 >>> 32) & Integer.MAX_VALUE);
			Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3123(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3060(Static180.anInt3326);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static293.anInt5832);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static273.anInt5456);
			Static270.aClass1_Sub18_Sub1_3.method3123(Static158.anInt2961 + local19);
		}
		if (local27 == 46) {
			local701 = Static241.method3829(local15, local19);
			if (local701 != null) {
				Static247.method3873();
				@Pc(1208) Class1_Sub31 local1208 = Static43.method794(local701);
				Static212.method3958(local1208.anInt5641, local19, local701.anInt3602, local1208.method4351(), local15, local701.anInt3621);
				Static282.anInt5856 = 0;
				Static222.aString150 = Static37.method2468(local701);
				if (local701.aBoolean261) {
					Static54.aString32 = local701.aString126 + "<col=ffffff>";
				} else {
					Static54.aString32 = "<col=00ff00>" + local701.aString123 + "<col=ffffff>";
				}
				if (Static222.aString150 == null) {
					Static222.aString150 = "Null";
				}
			}
			return;
		}
		if (local27 == 1002) {
			Static102.anInt1931 = Static207.anInt4122;
			Static122.anInt2367 = 2;
			Static63.anInt1290 = 0;
			Static220.anInt4583 = Static72.anInt1427;
			Static270.aClass1_Sub18_Sub1_3.method3130(11);
			Static270.aClass1_Sub18_Sub1_3.method3123(local39);
		}
		if (local27 == 57) {
			Static270.aClass1_Sub18_Sub1_3.method3130(92);
			Static270.aClass1_Sub18_Sub1_3.method3120(local19);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			Static270.aClass1_Sub18_Sub1_3.method3100(local15);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 24) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static102.anInt1931 = Static207.anInt4122;
				Static63.anInt1290 = 0;
				Static220.anInt4583 = Static72.anInt1427;
				Static122.anInt2367 = 2;
				Static270.aClass1_Sub18_Sub1_3.method3130(133);
				Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3100(local39);
			}
		}
		if (local27 == 11) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static270.aClass1_Sub18_Sub1_3.method3130(211);
				Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			}
		}
		if (local27 == 10) {
			Static270.aClass1_Sub18_Sub1_3.method3130(78);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			Static270.aClass1_Sub18_Sub1_3.method3102(local15);
			Static270.aClass1_Sub18_Sub1_3.method3060(local19);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 34) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static220.anInt4583 = Static72.anInt1427;
				Static63.anInt1290 = 0;
				Static122.anInt2367 = 2;
				Static102.anInt1931 = Static207.anInt4122;
				Static270.aClass1_Sub18_Sub1_3.method3130(212);
				Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3100(local39);
			}
		}
		if (local27 == 31) {
			Static247.method3873();
			local701 = Static75.method1287(local19);
			Static273.anInt5456 = local15;
			Static282.anInt5856 = 1;
			Static293.anInt5832 = local39;
			Static180.anInt3326 = local19;
			Static155.method2392(local701);
			Static196.aString132 = "<col=ff9040>" + Static183.method4458(local39).aString113 + "<col=ffffff>";
			if (Static196.aString132 == null) {
				Static196.aString132 = "null";
			}
			return;
		}
		if (local27 == 32) {
			if (local39 == 0) {
				Static242.anInt4996 = 1;
				Static146.method2282(Static159.anInt2978, local15, local19);
			} else if (Static95.anInt1824 > 0 && Static246.aBooleanArray15[82] && Static246.aBooleanArray15[81]) {
				Static138.method2187(Static159.anInt2978, local15 + Static224.anInt4695, local19 + Static158.anInt2961);
			} else {
				Static270.aClass1_Sub18_Sub1_3.method3130(166);
				Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + local19);
				Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + local15);
			}
		}
		if (local27 == 21) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static122.anInt2367 = 2;
				Static102.anInt1931 = Static207.anInt4122;
				Static220.anInt4583 = Static72.anInt1427;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(162);
				Static270.aClass1_Sub18_Sub1_3.method3100(local39);
				Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 60) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static270.aClass1_Sub18_Sub1_3.method3130(251);
				Static270.aClass1_Sub18_Sub1_3.method3123(local39);
				Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 20) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static122.anInt2367 = 2;
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(171);
				Static270.aClass1_Sub18_Sub1_3.method3100(Static293.anInt5832);
				Static270.aClass1_Sub18_Sub1_3.method3089(Static273.anInt5456);
				Static270.aClass1_Sub18_Sub1_3.method3100(local39);
				Static270.aClass1_Sub18_Sub1_3.method3119(Static180.anInt3326);
				Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 9) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static122.anInt2367 = 2;
				Static102.anInt1931 = Static207.anInt4122;
				Static63.anInt1290 = 0;
				Static220.anInt4583 = Static72.anInt1427;
				Static270.aClass1_Sub18_Sub1_3.method3130(27);
				Static270.aClass1_Sub18_Sub1_3.method3093(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			}
		}
		if (local27 == 49) {
			Static270.aClass1_Sub18_Sub1_3.method3130(141);
			Static270.aClass1_Sub18_Sub1_3.method3089(local15);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static278.anInt5569);
			Static270.aClass1_Sub18_Sub1_3.method3119(Static197.anInt3818);
			Static270.aClass1_Sub18_Sub1_3.method3100(local39);
			Static270.aClass1_Sub18_Sub1_3.method3120(local19);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 2) {
			Static270.aClass1_Sub18_Sub1_3.method3130(100);
			Static270.aClass1_Sub18_Sub1_3.method3089(local15);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 33) {
			Static63.anInt1290 = 0;
			Static122.anInt2367 = 2;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static270.aClass1_Sub18_Sub1_3.method3130(151);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3089((int) (local23 >>> 32) & Integer.MAX_VALUE);
			Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3123(Static158.anInt2961 + local19);
		}
		if (local27 == 26) {
			Static270.aClass1_Sub18_Sub1_3.method3130(40);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			Static270.aClass1_Sub18_Sub1_3.method3102(local15);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 29 || local27 == 1004) {
			Static55.method929(local39, local19, local15, Static190.aStringArray19[arg0]);
		}
		if (local27 == 43) {
			Static270.aClass1_Sub18_Sub1_3.method3130(124);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			local701 = Static75.method1287(local19);
			if (local701.anIntArrayArray30 != null && local701.anIntArrayArray30[0][0] == 5) {
				local720 = local701.anIntArrayArray30[0][1];
				Static224.anIntArray535[local720] = 1 - Static224.anIntArray535[local720];
				Static293.method4499(local720);
			}
		}
		if (local27 == 1007) {
			Static122.anInt2367 = 2;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static63.anInt1290 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3130(160);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3102((int) (local23 >>> 32) & Integer.MAX_VALUE);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + local19);
		}
		if (local27 == 51) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static122.anInt2367 = 2;
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(82);
				Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3089(local39);
			}
		}
		if (local27 == 17) {
			Static270.aClass1_Sub18_Sub1_3.method3130(0);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			Static270.aClass1_Sub18_Sub1_3.method3100(local15);
			Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 7) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static220.anInt4583 = Static72.anInt1427;
				Static102.anInt1931 = Static207.anInt4122;
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(58);
				Static270.aClass1_Sub18_Sub1_3.method3093(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3102(local39);
			}
		}
		if (local27 == 59) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static102.anInt1931 = Static207.anInt4122;
				Static63.anInt1290 = 0;
				Static122.anInt2367 = 2;
				Static220.anInt4583 = Static72.anInt1427;
				Static270.aClass1_Sub18_Sub1_3.method3130(190);
				Static270.aClass1_Sub18_Sub1_3.method3102(local39);
				Static270.aClass1_Sub18_Sub1_3.method3076(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3120(Static197.anInt3818);
				Static270.aClass1_Sub18_Sub1_3.method3102(Static278.anInt5569);
			}
		}
		if (local27 == 36) {
			local417 = Static77.aClass6_Sub6_Sub2Array1[local39];
			if (local417 != null) {
				Static122.anInt2367 = 2;
				Static102.anInt1931 = Static207.anInt4122;
				Static220.anInt4583 = Static72.anInt1427;
				Static63.anInt1290 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(131);
				Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
				Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			}
		}
		if (local27 == 23) {
			Static122.anInt2367 = 2;
			Static63.anInt1290 = 0;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static270.aClass1_Sub18_Sub1_3.method3130(187);
			Static270.aClass1_Sub18_Sub1_3.method3123(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			Static270.aClass1_Sub18_Sub1_3.method3100(local19 + Static158.anInt2961);
		}
		if (local27 == 38) {
			Static273.method4182();
		}
		if (local27 == 1006) {
			local701 = Static75.method1287(local19);
			if (local701 == null || local701.anIntArray422[local15] < 100000) {
				Static270.aClass1_Sub18_Sub1_3.method3130(11);
				Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			} else {
				Static48.method843(local701.anIntArray422[local15] + " x " + Static183.method4458(local39).aString113, 0, "");
			}
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 47) {
			local701 = Static75.method1287(local19);
			@Pc(2406) boolean local2406 = true;
			if (local701.anInt3566 > 0) {
				local2406 = Static100.method1633(local701);
			}
			if (local2406) {
				Static270.aClass1_Sub18_Sub1_3.method3130(124);
				Static270.aClass1_Sub18_Sub1_3.method3119(local19);
			}
		}
		if (local27 == 12) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static63.anInt1290 = 0;
				Static122.anInt2367 = 2;
				Static102.anInt1931 = Static207.anInt4122;
				Static220.anInt4583 = Static72.anInt1427;
				Static270.aClass1_Sub18_Sub1_3.method3130(61);
				Static270.aClass1_Sub18_Sub1_3.method3102(local39);
				Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 37) {
			Static220.anInt4583 = Static72.anInt1427;
			Static122.anInt2367 = 2;
			Static102.anInt1931 = Static207.anInt4122;
			Static63.anInt1290 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3130(192);
			Static270.aClass1_Sub18_Sub1_3.method3100(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3123(local15 + Static224.anInt4695);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
		}
		if (local27 == 1) {
			Static63.anInt1290 = 0;
			Static220.anInt4583 = Static72.anInt1427;
			Static102.anInt1931 = Static207.anInt4122;
			Static122.anInt2367 = 2;
			Static270.aClass1_Sub18_Sub1_3.method3130(177);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static278.anInt5569);
			Static270.aClass1_Sub18_Sub1_3.method3120(Static197.anInt3818);
			Static270.aClass1_Sub18_Sub1_3.method3102(Static224.anInt4695 + local15);
			Static270.aClass1_Sub18_Sub1_3.method3123(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3123(local39);
			Static270.aClass1_Sub18_Sub1_3.method3093(Static246.aBooleanArray15[82] ? 1 : 0);
		}
		if (local27 == 41) {
			local152 = Static211.aClass6_Sub6_Sub1Array2[local39];
			if (local152 != null) {
				Static220.anInt4583 = Static72.anInt1427;
				Static122.anInt2367 = 2;
				Static63.anInt1290 = 0;
				Static102.anInt1931 = Static207.anInt4122;
				Static270.aClass1_Sub18_Sub1_3.method3130(113);
				Static270.aClass1_Sub18_Sub1_3.method3100(local39);
				Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			}
		}
		if (local27 == 22) {
			Static270.aClass1_Sub18_Sub1_3.method3130(236);
			Static270.aClass1_Sub18_Sub1_3.method3120(local19);
			Static270.aClass1_Sub18_Sub1_3.method3100(local39);
			Static270.aClass1_Sub18_Sub1_3.method3123(local15);
			Static123.anInt2370 = 0;
			Static103.aClass127_6 = Static75.method1287(local19);
			Static209.anInt4192 = local15;
		}
		if (local27 == 39) {
			Static63.anInt1290 = 0;
			Static102.anInt1931 = Static207.anInt4122;
			Static122.anInt2367 = 2;
			Static220.anInt4583 = Static72.anInt1427;
			Static270.aClass1_Sub18_Sub1_3.method3130(235);
			Static270.aClass1_Sub18_Sub1_3.method3100(local15 + Static224.anInt4695);
			Static270.aClass1_Sub18_Sub1_3.method3110(Static246.aBooleanArray15[82] ? 1 : 0);
			Static270.aClass1_Sub18_Sub1_3.method3089(Static158.anInt2961 + local19);
			Static270.aClass1_Sub18_Sub1_3.method3102(local39);
		}
		if (Static282.anInt5856 != 0) {
			Static282.anInt5856 = 0;
			Static155.method2392(Static75.method1287(Static180.anInt3326));
		}
		if (Static75.aBoolean115) {
			Static247.method3873();
		}
		if (Static103.aClass127_6 != null && Static123.anInt2370 == 0) {
			Static155.method2392(Static103.aClass127_6);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	public static void method3(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static284.anInt5643 || arg2 < Static24.anInt556) {
			return;
		}
		@Pc(26) boolean local26;
		if (arg0 < Static245.anInt1237) {
			arg0 = Static245.anInt1237;
			local26 = false;
		} else if (Static28.anInt606 < arg0) {
			arg0 = Static28.anInt606;
			local26 = false;
		} else {
			local26 = true;
		}
		@Pc(45) boolean local45;
		if (arg1 < Static245.anInt1237) {
			local45 = false;
			arg1 = Static245.anInt1237;
		} else if (Static28.anInt606 >= arg1) {
			local45 = true;
		} else {
			arg1 = Static28.anInt606;
			local45 = false;
		}
		if (Static24.anInt556 <= arg4) {
			Static288.method4405(arg3, arg0, arg1, Static151.anIntArrayArray26[arg4++]);
		} else {
			arg4 = Static24.anInt556;
		}
		if (arg2 <= Static284.anInt5643) {
			Static288.method4405(arg3, arg0, arg1, Static151.anIntArrayArray26[arg2--]);
		} else {
			arg2 = Static284.anInt5643;
		}
		@Pc(104) int local104;
		if (local45 && local26) {
			for (local104 = arg4; local104 <= arg2; local104++) {
				@Pc(111) int[] local111 = Static151.anIntArrayArray26[local104];
				local111[arg1] = local111[arg0] = arg3;
			}
		} else if (local45) {
			for (local104 = arg4; local104 <= arg2; local104++) {
				Static151.anIntArrayArray26[local104][arg1] = arg3;
			}
		} else if (local26) {
			for (local104 = arg4; local104 <= arg2; local104++) {
				Static151.anIntArrayArray26[local104][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(15) long local15 = Static291.method4472(arg0, arg2 + 0, arg1);
		@Pc(47) int local47;
		@Pc(40) int local40;
		@Pc(54) int local54;
		@Pc(58) Class104 local58;
		@Pc(82) int local82;
		@Pc(80) int[] local80;
		@Pc(78) int local78;
		if (local15 != 0L) {
			local40 = (int) local15 >> 14 & 0x1F;
			local47 = (int) local15 >> 20 & 0x3;
			local54 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local58 = Static35.method636(local54);
			if (local58.anInt2799 == -1) {
				local78 = (52736 - arg1 * 512) * 4 + arg2 * 4 + 24624;
				local80 = Static213.anIntArray495;
				local82 = arg4;
				if (local15 > 0L) {
					local82 = arg3;
				}
				if (local40 == 0 || local40 == 2) {
					if (local47 == 0) {
						local80[local78] = local82;
						local80[local78 + 512] = local82;
						local80[local78 + 1024] = local82;
						local80[local78 + 1536] = local82;
					} else if (local47 == 1) {
						local80[local78] = local82;
						local80[local78 + 1] = local82;
						local80[local78 + 2] = local82;
						local80[local78 + 3] = local82;
					} else if (local47 == 2) {
						local80[local78 + 3] = local82;
						local80[local78 + 515] = local82;
						local80[local78 + 3 + 1024] = local82;
						local80[local78 + 3 + 1536] = local82;
					} else if (local47 == 3) {
						local80[local78 + 1536] = local82;
						local80[local78 + 1 + 1536] = local82;
						local80[local78 + 2 + 1536] = local82;
						local80[local78 + 3 + 1536] = local82;
					}
				}
				if (local40 == 3) {
					if (local47 == 0) {
						local80[local78] = local82;
					} else if (local47 == 1) {
						local80[local78 + 3] = local82;
					} else if (local47 == 2) {
						local80[local78 + 1536 + 3] = local82;
					} else if (local47 == 3) {
						local80[local78 + 1536] = local82;
					}
				}
				if (local40 == 2) {
					if (local47 == 3) {
						local80[local78] = local82;
						local80[local78 + 512] = local82;
						local80[local78 + 1024] = local82;
						local80[local78 + 1536] = local82;
					} else if (local47 == 0) {
						local80[local78] = local82;
						local80[local78 + 1] = local82;
						local80[local78 + 2] = local82;
						local80[local78 + 3] = local82;
					} else if (local47 == 1) {
						local80[local78 + 3] = local82;
						local80[local78 + 512 + 3] = local82;
						local80[local78 + 1024 + 3] = local82;
						local80[local78 + 1536 + 3] = local82;
					} else if (local47 == 2) {
						local80[local78 + 1536] = local82;
						local80[local78 + 1 + 1536] = local82;
						local80[local78 + 1538] = local82;
						local80[local78 + 1539] = local82;
					}
				}
			} else if (!Static180.method2690(local47, arg2, arg1, local58)) {
				return false;
			}
		}
		local15 = Static242.method3841(arg0, arg2 + 0, arg1);
		if (local15 != 0L) {
			local47 = (int) local15 >> 20 & 0x3;
			local40 = (int) local15 >> 14 & 0x1F;
			local54 = (int) (local15 >>> 32) & Integer.MAX_VALUE;
			local58 = Static35.method636(local54);
			if (local58.anInt2799 == -1) {
				if (local40 == 9) {
					local82 = 15658734;
					local80 = Static213.anIntArray495;
					if (local15 > 0L) {
						local82 = 15597568;
					}
					local78 = (52736 - arg1 * 512) * 4 + arg2 * 4 + 24624;
					if (local47 == 0 || local47 == 2) {
						local80[local78 + 1536] = local82;
						local80[local78 + 1025] = local82;
						local80[local78 + 514] = local82;
						local80[local78 + 3] = local82;
					} else {
						local80[local78] = local82;
						local80[local78 + 512 + 1] = local82;
						local80[local78 + 1024 + 2] = local82;
						local80[local78 + 3 + 1536] = local82;
					}
				}
			} else if (!Static180.method2690(local47, arg2, arg1, local58)) {
				return false;
			}
		}
		local15 = Static287.method4359(arg0, arg2 + 0, arg1);
		if (local15 != 0L) {
			local47 = (int) local15 >> 20 & 0x3;
			local40 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			@Pc(603) Class104 local603 = Static35.method636(local40);
			if (local603.anInt2799 != -1 && !Static180.method2690(local47, arg2, arg1, local603)) {
				return false;
			}
		}
		return true;
	}
}

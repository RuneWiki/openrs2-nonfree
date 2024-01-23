import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "[Lclient!va;")
	public static Class2_Sub30[] aClass2_Sub30Array1;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!ec;")
	public static Class46 aClass46_22 = new Class46(64);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	public static int anInt2985 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	public static int method2423(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Lclient!nf;")
	public static Class2_Sub3_Sub18 method2425(@OriginalArg(1) int arg0) {
		return (Class2_Sub3_Sub18) Static186.aClass79_16.method2002((long) arg0);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method2426() {
		@Pc(11) String local11 = "www";
		if (Static7.anInt237 != 0) {
			local11 = "www-wtqa";
		}
		@Pc(19) String local19 = "";
		if (Static16.aString23 != null) {
			local19 = "/p=" + Static16.aString23;
		}
		return "http://" + local11 + ".runescape.com/l=" + Static206.anInt4309 + "/a=" + Static136.anInt2976 + local19 + "/";
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
	public static void method2427(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static163.anIntArray262[arg0];
		@Pc(17) int local17 = Static289.aShortArray93[arg0];
		@Pc(21) int local21 = Static55.anIntArray97[arg0];
		if (local17 >= 2000) {
			local17 -= 2000;
		}
		@Pc(31) long local31 = Static232.aLongArray18[arg0];
		@Pc(36) int local36 = (int) Static232.aLongArray18[arg0];
		if (local17 == 26) {
			if (local36 == 0) {
				Static262.anInt6194 = 1;
				Static172.method2960(Static208.anInt4335, local13, local21);
			} else if (local36 == 1) {
				Static95.aClass2_Sub26_Sub1_1.method4287(206);
				Static95.aClass2_Sub26_Sub1_1.method4272(Static297.anInt6213);
				Static95.aClass2_Sub26_Sub1_1.method4271(Static125.anInt5772 + local13);
				Static95.aClass2_Sub26_Sub1_1.method4231(Static203.anInt4236 + local21);
				Static95.aClass2_Sub26_Sub1_1.method4252(Static25.anInt5783);
			}
		}
		@Pc(95) Class36_Sub3_Sub1 local95;
		if (local17 == 12) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static268.anInt5547 = Static199.anInt4139;
				Static118.anInt2536 = 0;
				Static277.anInt5757 = Static122.anInt2587;
				Static63.anInt1429 = 2;
				Static95.aClass2_Sub26_Sub1_1.method4287(109);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			}
		}
		if (local17 == 25) {
			Static268.anInt5547 = Static199.anInt4139;
			Static63.anInt1429 = 2;
			Static277.anInt5757 = Static122.anInt2587;
			Static118.anInt2536 = 0;
			Static95.aClass2_Sub26_Sub1_1.method4287(201);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static203.anInt4236 + local21);
			Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4231(local13 + Static125.anInt5772);
			Static95.aClass2_Sub26_Sub1_1.method4249((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		@Pc(191) Class36_Sub3_Sub2 local191;
		if (local17 == 35) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static277.anInt5757 = Static122.anInt2587;
				Static63.anInt1429 = 2;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(250);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			}
		}
		if (local17 == 3) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static63.anInt1429 = 2;
				Static277.anInt5757 = Static122.anInt2587;
				Static95.aClass2_Sub26_Sub1_1.method4287(161);
				Static95.aClass2_Sub26_Sub1_1.method4231(local36);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
			}
		}
		if (local17 == 57) {
			Static95.aClass2_Sub26_Sub1_1.method4287(192);
			Static95.aClass2_Sub26_Sub1_1.method4271(local13);
			Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			Static95.aClass2_Sub26_Sub1_1.method4256(local21);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 38) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static63.anInt1429 = 2;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static277.anInt5757 = Static122.anInt2587;
				Static95.aClass2_Sub26_Sub1_1.method4287(74);
				Static95.aClass2_Sub26_Sub1_1.method4260(Static15.anInt352);
				Static95.aClass2_Sub26_Sub1_1.method4272(Static183.anInt3887);
				Static95.aClass2_Sub26_Sub1_1.method4249(Static278.anInt5812);
				Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			}
		}
		if (local17 == 29 || local17 == 1007) {
			Static297.method4948(local13, local21, Static214.aStringArray22[arg0], local36);
		}
		if (local17 == 19) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static118.anInt2536 = 0;
				Static63.anInt1429 = 2;
				Static277.anInt5757 = Static122.anInt2587;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(66);
				Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4271(local36);
				Static95.aClass2_Sub26_Sub1_1.method4252(Static15.anInt352);
				Static95.aClass2_Sub26_Sub1_1.method4249(Static183.anInt3887);
				Static95.aClass2_Sub26_Sub1_1.method4231(Static278.anInt5812);
			}
		}
		if (local17 == 46) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static63.anInt1429 = 2;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static277.anInt5757 = Static122.anInt2587;
				Static95.aClass2_Sub26_Sub1_1.method4287(30);
				Static95.aClass2_Sub26_Sub1_1.method4249(local36);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
			}
		}
		if (local17 == 41) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static63.anInt1429 = 2;
				Static277.anInt5757 = Static122.anInt2587;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(92);
				Static95.aClass2_Sub26_Sub1_1.method4271(local36);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
			}
		}
		if (local17 == 21) {
			Static95.aClass2_Sub26_Sub1_1.method4287(237);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			Static95.aClass2_Sub26_Sub1_1.method4262(local21);
			Static95.aClass2_Sub26_Sub1_1.method4249(local13);
			Static95.aClass2_Sub26_Sub1_1.method4249(Static183.anInt3887);
			Static95.aClass2_Sub26_Sub1_1.method4262(Static15.anInt352);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static278.anInt5812);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 1004) {
			Static268.anInt5547 = Static199.anInt4139;
			Static118.anInt2536 = 0;
			Static63.anInt1429 = 2;
			Static277.anInt5757 = Static122.anInt2587;
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				@Pc(583) Class33 local583 = local95.aClass33_1;
				if (local583.anIntArray55 != null) {
					local583 = local583.method719();
				}
				if (local583 != null) {
					Static95.aClass2_Sub26_Sub1_1.method4287(203);
					Static95.aClass2_Sub26_Sub1_1.method4249(local583.anInt868);
				}
			}
		}
		if (local17 == 9) {
			Static268.anInt5547 = Static199.anInt4139;
			Static63.anInt1429 = 2;
			Static277.anInt5757 = Static122.anInt2587;
			Static118.anInt2536 = 0;
			Static95.aClass2_Sub26_Sub1_1.method4287(219);
			Static95.aClass2_Sub26_Sub1_1.method4271(local21 + Static203.anInt4236);
			Static95.aClass2_Sub26_Sub1_1.method4271(Static125.anInt5772 + local13);
			Static95.aClass2_Sub26_Sub1_1.method4249((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
		}
		if (local17 == 30) {
			Static95.aClass2_Sub26_Sub1_1.method4287(13);
			Static95.aClass2_Sub26_Sub1_1.method4231(local13);
			Static95.aClass2_Sub26_Sub1_1.method4262(local21);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 18) {
			Static95.aClass2_Sub26_Sub1_1.method4287(183);
			Static95.aClass2_Sub26_Sub1_1.method4256(local21);
			Static95.aClass2_Sub26_Sub1_1.method4272(local36);
			Static95.aClass2_Sub26_Sub1_1.method4249(local13);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 33) {
			Static95.aClass2_Sub26_Sub1_1.method4287(49);
			Static95.aClass2_Sub26_Sub1_1.method4262(local21);
			Static95.aClass2_Sub26_Sub1_1.method4249(local13);
			Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		@Pc(760) Class115 local760;
		if (local17 == 1003) {
			local760 = Static90.method1692(local21);
			if (local760 == null || local760.anIntArray270[local13] < 100000) {
				Static95.aClass2_Sub26_Sub1_1.method4287(236);
				Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			} else {
				Static173.method2979("", local760.anIntArray270[local13] + " x " + Static152.method2616(local36).aString239, 0);
			}
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 47) {
			Static207.method3484();
			local760 = Static90.method1692(local21);
			Static15.anInt352 = local21;
			Static106.anInt2305 = 1;
			Static278.anInt5812 = local36;
			Static183.anInt3887 = local13;
			Static298.method4263(local760);
			Static8.aString13 = "<col=ff9040>" + Static152.method2616(local36).aString239 + "<col=ffffff>";
			if (Static8.aString13 == null) {
				Static8.aString13 = "null";
			}
			return;
		}
		if (local17 == 1006) {
			Static268.anInt5547 = Static199.anInt4139;
			Static63.anInt1429 = 2;
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static95.aClass2_Sub26_Sub1_1.method4287(194);
			Static95.aClass2_Sub26_Sub1_1.method4249((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static125.anInt5772 + local13);
			Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static203.anInt4236 + local21);
		}
		if (local17 == 10) {
			local760 = Static90.method1692(local21);
			@Pc(916) boolean local916 = true;
			if (local760.anInt3544 > 0) {
				local916 = Static191.method629(local760);
			}
			if (local916) {
				Static95.aClass2_Sub26_Sub1_1.method4287(125);
				Static95.aClass2_Sub26_Sub1_1.method4260(local21);
			}
		}
		@Pc(979) int local979;
		if (local17 == 50) {
			Static95.aClass2_Sub26_Sub1_1.method4287(125);
			Static95.aClass2_Sub26_Sub1_1.method4260(local21);
			local760 = Static90.method1692(local21);
			if (local760.anIntArrayArray29 != null && local760.anIntArrayArray29[0][0] == 5) {
				local979 = local760.anIntArrayArray29[0][1];
				if (Static249.anIntArray446[local979] != local760.anIntArray276[0]) {
					Static249.anIntArray446[local979] = local760.anIntArray276[0];
					Static153.method2649(local979);
				}
			}
		}
		if (local17 == 8) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static277.anInt5757 = Static122.anInt2587;
				Static63.anInt1429 = 2;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(37);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			}
		}
		if (local17 == 11) {
			Static118.anInt2536 = 0;
			Static63.anInt1429 = 2;
			Static277.anInt5757 = Static122.anInt2587;
			Static268.anInt5547 = Static199.anInt4139;
			Static95.aClass2_Sub26_Sub1_1.method4287(82);
			Static95.aClass2_Sub26_Sub1_1.method4271(local13 + Static125.anInt5772);
			Static95.aClass2_Sub26_Sub1_1.method4271((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static95.aClass2_Sub26_Sub1_1.method4249(Static203.anInt4236 + local21);
			Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
		}
		if (local17 == 34) {
			Static95.aClass2_Sub26_Sub1_1.method4287(91);
			Static95.aClass2_Sub26_Sub1_1.method4252(Static25.anInt5783);
			Static95.aClass2_Sub26_Sub1_1.method4260(local21);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static297.anInt6213);
			Static95.aClass2_Sub26_Sub1_1.method4272(local13);
		}
		if (local17 == 4) {
			Static95.aClass2_Sub26_Sub1_1.method4287(117);
			Static95.aClass2_Sub26_Sub1_1.method4252(local21);
			Static95.aClass2_Sub26_Sub1_1.method4272(local13);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 31) {
			local760 = Static266.method4442(local21, local13);
			if (local760 != null) {
				Static207.method3484();
				@Pc(1178) Class2_Sub11 local1178 = Static35.method708(local760);
				Static243.method3051(local13, local21, local1178.anInt1528, local760.anInt3523, local1178.method1323(), local760.anInt3548);
				Static106.anInt2305 = 0;
				Static296.aString299 = Static17.method361(local760);
				if (Static296.aString299 == null) {
					Static296.aString299 = "Null";
				}
				if (local760.aBoolean291) {
					Static150.aString153 = local760.aString173 + "<col=ffffff>";
				} else {
					Static150.aString153 = "<col=00ff00>" + local760.aString176 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local17 == 59) {
			Static268.anInt5547 = Static199.anInt4139;
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static63.anInt1429 = 2;
			Static95.aClass2_Sub26_Sub1_1.method4287(189);
			Static95.aClass2_Sub26_Sub1_1.method4249(local13 + Static125.anInt5772);
			Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static203.anInt4236 + local21);
			Static95.aClass2_Sub26_Sub1_1.method4249(local36);
		}
		if (local17 == 44) {
			Static277.anInt5757 = Static122.anInt2587;
			Static268.anInt5547 = Static199.anInt4139;
			Static63.anInt1429 = 2;
			Static118.anInt2536 = 0;
			Static95.aClass2_Sub26_Sub1_1.method4287(76);
			Static95.aClass2_Sub26_Sub1_1.method4249(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static95.aClass2_Sub26_Sub1_1.method4231(Static125.anInt5772 + local13);
			Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static203.anInt4236 + local21);
		}
		if (local17 == 43) {
			Static268.anInt5547 = Static199.anInt4139;
			Static118.anInt2536 = 0;
			Static63.anInt1429 = 2;
			Static277.anInt5757 = Static122.anInt2587;
			Static95.aClass2_Sub26_Sub1_1.method4287(48);
			Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4249(Static125.anInt5772 + local13);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static297.anInt6213);
			Static95.aClass2_Sub26_Sub1_1.method4271(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static95.aClass2_Sub26_Sub1_1.method4249(local21 + Static203.anInt4236);
			Static95.aClass2_Sub26_Sub1_1.method4260(Static25.anInt5783);
		}
		if (local17 == 23) {
			Static95.aClass2_Sub26_Sub1_1.method4287(43);
			Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			Static95.aClass2_Sub26_Sub1_1.method4262(local21);
			Static95.aClass2_Sub26_Sub1_1.method4249(local13);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 2) {
			Static95.aClass2_Sub26_Sub1_1.method4287(97);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			Static95.aClass2_Sub26_Sub1_1.method4262(local21);
			Static95.aClass2_Sub26_Sub1_1.method4272(local13);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 36) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static63.anInt1429 = 2;
				Static118.anInt2536 = 0;
				Static277.anInt5757 = Static122.anInt2587;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(96);
				Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4272(local36);
			}
		}
		if (local17 == 14) {
			Static268.anInt5547 = Static199.anInt4139;
			Static118.anInt2536 = 0;
			Static63.anInt1429 = 2;
			Static277.anInt5757 = Static122.anInt2587;
			Static95.aClass2_Sub26_Sub1_1.method4287(98);
			Static95.aClass2_Sub26_Sub1_1.method4272(local13 + Static125.anInt5772);
			Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static203.anInt4236 + local21);
		}
		if (local17 == 28) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static277.anInt5757 = Static122.anInt2587;
				Static118.anInt2536 = 0;
				Static63.anInt1429 = 2;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(5);
				Static95.aClass2_Sub26_Sub1_1.method4272(local36);
				Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
			}
		}
		if (local17 == 7) {
			Static95.aClass2_Sub26_Sub1_1.method4287(19);
			Static95.aClass2_Sub26_Sub1_1.method4260(local21);
			Static95.aClass2_Sub26_Sub1_1.method4272(local13);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 39) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static63.anInt1429 = 2;
				Static277.anInt5757 = Static122.anInt2587;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static95.aClass2_Sub26_Sub1_1.method4287(205);
				Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			}
		}
		if (local17 == 16) {
			Static95.aClass2_Sub26_Sub1_1.method4287(188);
			Static95.aClass2_Sub26_Sub1_1.method4260(Static25.anInt5783);
			Static95.aClass2_Sub26_Sub1_1.method4271(Static297.anInt6213);
			Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			Static95.aClass2_Sub26_Sub1_1.method4271(local13);
			Static95.aClass2_Sub26_Sub1_1.method4262(local21);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 24) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static268.anInt5547 = Static199.anInt4139;
				Static63.anInt1429 = 2;
				Static277.anInt5757 = Static122.anInt2587;
				Static118.anInt2536 = 0;
				Static95.aClass2_Sub26_Sub1_1.method4287(113);
				Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			}
		}
		if (local17 == 58) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static277.anInt5757 = Static122.anInt2587;
				Static63.anInt1429 = 2;
				Static268.anInt5547 = Static199.anInt4139;
				Static118.anInt2536 = 0;
				Static95.aClass2_Sub26_Sub1_1.method4287(247);
				Static95.aClass2_Sub26_Sub1_1.method4252(Static25.anInt5783);
				Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4249(Static297.anInt6213);
				Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			}
		}
		if (local17 == 5) {
			Static63.anInt1429 = 2;
			Static268.anInt5547 = Static199.anInt4139;
			Static277.anInt5757 = Static122.anInt2587;
			Static118.anInt2536 = 0;
			Static95.aClass2_Sub26_Sub1_1.method4287(185);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static297.anInt6213);
			Static95.aClass2_Sub26_Sub1_1.method4249(Static125.anInt5772 + local13);
			Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static203.anInt4236 + local21);
			Static95.aClass2_Sub26_Sub1_1.method4262(Static25.anInt5783);
		}
		if (local17 == 20) {
			Static268.anInt5547 = Static199.anInt4139;
			Static277.anInt5757 = Static122.anInt2587;
			Static118.anInt2536 = 0;
			Static63.anInt1429 = 2;
			Static95.aClass2_Sub26_Sub1_1.method4287(25);
			Static95.aClass2_Sub26_Sub1_1.method4231(local21 + Static203.anInt4236);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
			Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4231(local13 + Static125.anInt5772);
		}
		if (local17 == 17) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static63.anInt1429 = 2;
				Static118.anInt2536 = 0;
				Static268.anInt5547 = Static199.anInt4139;
				Static277.anInt5757 = Static122.anInt2587;
				Static95.aClass2_Sub26_Sub1_1.method4287(184);
				Static95.aClass2_Sub26_Sub1_1.method4249(local36);
				Static95.aClass2_Sub26_Sub1_1.method4239(Static79.aBooleanArray8[82] ? 1 : 0);
			}
		}
		if (local17 == 1) {
			Static63.anInt1429 = 2;
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static268.anInt5547 = Static199.anInt4139;
			Static95.aClass2_Sub26_Sub1_1.method4287(99);
			Static95.aClass2_Sub26_Sub1_1.method4271(Static203.anInt4236 + local21);
			Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			Static95.aClass2_Sub26_Sub1_1.method4249(local13 + Static125.anInt5772);
			Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
		}
		if (local17 == 15) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static63.anInt1429 = 2;
				Static268.anInt5547 = Static199.anInt4139;
				Static118.anInt2536 = 0;
				Static277.anInt5757 = Static122.anInt2587;
				Static95.aClass2_Sub26_Sub1_1.method4287(196);
				Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			}
		}
		if (local17 == 1002) {
			Static268.anInt5547 = Static199.anInt4139;
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static63.anInt1429 = 2;
			Static95.aClass2_Sub26_Sub1_1.method4287(236);
			Static95.aClass2_Sub26_Sub1_1.method4231(local36);
		}
		if (local17 == 51 && Static50.aClass115_6 == null) {
			Static183.method3143(local21, local13);
			Static50.aClass115_6 = Static266.method4442(local21, local13);
			Static298.method4263(Static50.aClass115_6);
		}
		if (local17 == 45) {
			Static87.method1628();
		}
		if (local17 == 1001) {
			Static63.anInt1429 = 2;
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static268.anInt5547 = Static199.anInt4139;
			Static95.aClass2_Sub26_Sub1_1.method4287(111);
			Static95.aClass2_Sub26_Sub1_1.method4271(local36);
		}
		if (local17 == 48) {
			Static95.aClass2_Sub26_Sub1_1.method4287(125);
			Static95.aClass2_Sub26_Sub1_1.method4260(local21);
			local760 = Static90.method1692(local21);
			if (local760.anIntArrayArray29 != null && local760.anIntArrayArray29[0][0] == 5) {
				local979 = local760.anIntArrayArray29[0][1];
				Static249.anIntArray446[local979] = 1 - Static249.anIntArray446[local979];
				Static153.method2649(local979);
			}
		}
		if (local17 == 49) {
			Static95.aClass2_Sub26_Sub1_1.method4287(69);
			Static95.aClass2_Sub26_Sub1_1.method4271(local13);
			Static95.aClass2_Sub26_Sub1_1.method4256(local21);
			Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 37) {
			Static63.anInt1429 = 2;
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static268.anInt5547 = Static199.anInt4139;
			Static95.aClass2_Sub26_Sub1_1.method4287(100);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static183.anInt3887);
			Static95.aClass2_Sub26_Sub1_1.method4231(Static278.anInt5812);
			Static95.aClass2_Sub26_Sub1_1.method4260(Static15.anInt352);
			Static95.aClass2_Sub26_Sub1_1.method4271(Static203.anInt4236 + local21);
			Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4249(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static95.aClass2_Sub26_Sub1_1.method4231(local13 + Static125.anInt5772);
		}
		if (local17 == 32) {
			local191 = Static212.aClass36_Sub3_Sub2Array1[local36];
			if (local191 != null) {
				Static118.anInt2536 = 0;
				Static277.anInt5757 = Static122.anInt2587;
				Static268.anInt5547 = Static199.anInt4139;
				Static63.anInt1429 = 2;
				Static95.aClass2_Sub26_Sub1_1.method4287(176);
				Static95.aClass2_Sub26_Sub1_1.method4231(Static297.anInt6213);
				Static95.aClass2_Sub26_Sub1_1.method4272(local36);
				Static95.aClass2_Sub26_Sub1_1.method4256(Static25.anInt5783);
				Static95.aClass2_Sub26_Sub1_1.method4234(Static79.aBooleanArray8[82] ? 1 : 0);
			}
		}
		if (local17 == 13) {
			if (local36 == 0) {
				Static2.anInt5935 = 1;
				Static172.method2960(Static208.anInt4335, local13, local21);
			} else if (Static189.anInt3958 > 0 && Static79.aBooleanArray8[82] && Static79.aBooleanArray8[81]) {
				Static131.method2288(Static208.anInt4335, local21 + Static203.anInt4236, Static125.anInt5772 + local13);
			} else {
				Static95.aClass2_Sub26_Sub1_1.method4287(29);
				Static95.aClass2_Sub26_Sub1_1.method4271(Static203.anInt4236 + local21);
				Static95.aClass2_Sub26_Sub1_1.method4231(local13 + Static125.anInt5772);
			}
		}
		if (local17 == 42) {
			local95 = Static201.aClass36_Sub3_Sub1Array1[local36];
			if (local95 != null) {
				Static277.anInt5757 = Static122.anInt2587;
				Static268.anInt5547 = Static199.anInt4139;
				Static118.anInt2536 = 0;
				Static63.anInt1429 = 2;
				Static95.aClass2_Sub26_Sub1_1.method4287(136);
				Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
				Static95.aClass2_Sub26_Sub1_1.method4249(local36);
			}
		}
		if (local17 == 40) {
			Static95.aClass2_Sub26_Sub1_1.method4287(174);
			Static95.aClass2_Sub26_Sub1_1.method4271(local13);
			Static95.aClass2_Sub26_Sub1_1.method4252(local21);
			Static95.aClass2_Sub26_Sub1_1.method4271(local36);
			anInt2985 = 0;
			Static198.aClass115_13 = Static90.method1692(local21);
			Static16.anInt394 = local13;
		}
		if (local17 == 60) {
			Static63.anInt1429 = 2;
			Static118.anInt2536 = 0;
			Static268.anInt5547 = Static199.anInt4139;
			Static277.anInt5757 = Static122.anInt2587;
			Static95.aClass2_Sub26_Sub1_1.method4287(246);
			Static95.aClass2_Sub26_Sub1_1.method4262(Static15.anInt352);
			Static95.aClass2_Sub26_Sub1_1.method4231(local21 + Static203.anInt4236);
			Static95.aClass2_Sub26_Sub1_1.method4271(Static278.anInt5812);
			Static95.aClass2_Sub26_Sub1_1.method4272(local36);
			Static95.aClass2_Sub26_Sub1_1.method4249(Static183.anInt3887);
			Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4249(Static125.anInt5772 + local13);
		}
		if (local17 == 6) {
			if (local36 == 0) {
				Static172.method2960(Static208.anInt4335, local13, local21);
			} else if (local36 == 1) {
				if (Static189.anInt3958 > 0 && Static79.aBooleanArray8[82] && Static79.aBooleanArray8[81]) {
					Static131.method2288(Static208.anInt4335, local21 + Static203.anInt4236, Static125.anInt5772 + local13);
				} else {
					Static198.method3358(1, local21, local13);
					Static95.aClass2_Sub26_Sub1_1.method4239(Static284.anInt5879);
					Static95.aClass2_Sub26_Sub1_1.method4239(Static271.anInt5633);
					Static95.aClass2_Sub26_Sub1_1.method4231((int) Static142.aFloat31);
					Static95.aClass2_Sub26_Sub1_1.method4239(57);
					Static95.aClass2_Sub26_Sub1_1.method4239(Static293.anInt6086);
					Static95.aClass2_Sub26_Sub1_1.method4239(Static266.anInt5527);
					Static95.aClass2_Sub26_Sub1_1.method4239(89);
					Static95.aClass2_Sub26_Sub1_1.method4231(Static111.aClass36_Sub3_Sub2_1.anInt5093);
					Static95.aClass2_Sub26_Sub1_1.method4231(Static111.aClass36_Sub3_Sub2_1.anInt5109);
					Static95.aClass2_Sub26_Sub1_1.method4239(Static14.anInt345);
					Static95.aClass2_Sub26_Sub1_1.method4239(63);
				}
			}
		}
		if (local17 == 22) {
			Static118.anInt2536 = 0;
			Static277.anInt5757 = Static122.anInt2587;
			Static63.anInt1429 = 2;
			Static268.anInt5547 = Static199.anInt4139;
			Static95.aClass2_Sub26_Sub1_1.method4287(11);
			Static95.aClass2_Sub26_Sub1_1.method4231(local13 + Static125.anInt5772);
			Static95.aClass2_Sub26_Sub1_1.method4270(Static79.aBooleanArray8[82] ? 1 : 0);
			Static95.aClass2_Sub26_Sub1_1.method4272(local36);
			Static95.aClass2_Sub26_Sub1_1.method4272(Static203.anInt4236 + local21);
		}
		if (Static106.anInt2305 != 0) {
			Static106.anInt2305 = 0;
			Static298.method4263(Static90.method1692(Static15.anInt352));
		}
		if (Static133.aBoolean219) {
			Static207.method3484();
		}
		if (Static198.aClass115_13 != null && anInt2985 == 0) {
			Static298.method4263(Static198.aClass115_13);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method2428(@OriginalArg(1) Class84 arg0) {
		Static114.aClass84_27 = arg0;
		Static89.anInt1993 = Static114.aClass84_27.method2116(4);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIB)V")
	public static void method2429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static60.aBoolean106) {
			Static94.method1752(arg1, arg3, arg1 + arg0, arg3 - -arg2);
			Static94.method1758(arg1, arg3, arg0, arg2, 0);
		} else {
			Static160.method2781(arg1, arg3, arg0 + arg1, arg2 + arg3);
			Static160.method2788(arg1, arg3, arg0, arg2, 0);
		}
		if (Static20.anInt1234 < 100) {
			return;
		}
		if (Static136.aClass2_Sub3_Sub1_5 == null || Static136.aClass2_Sub3_Sub1_5.anInt5453 != arg0 || arg2 != Static136.aClass2_Sub3_Sub1_5.anInt5462) {
			@Pc(66) Class2_Sub3_Sub1_Sub1 local66 = new Class2_Sub3_Sub1_Sub1(arg0, arg2);
			Static160.method2787(local66.anIntArray479, arg0, arg2);
			Static107.method2000(0, 0, arg0, 0, 0, Static142.anInt3081, arg2, Static52.anInt1205);
			if (Static60.aBoolean106) {
				Static136.aClass2_Sub3_Sub1_5 = new Class2_Sub3_Sub1_Sub2(local66);
			} else {
				Static136.aClass2_Sub3_Sub1_5 = local66;
			}
			if (Static60.aBoolean106) {
				Static160.anIntArray254 = null;
			} else {
				Static170.aClass14_1.method1192();
			}
		}
		Static136.aClass2_Sub3_Sub1_5.method4369(arg1, arg3);
		@Pc(113) int local113 = arg2 * Static259.anInt5400 / Static52.anInt1205 + arg3;
		@Pc(119) int local119 = Static248.anInt4937 * arg0 / Static142.anInt3081;
		@Pc(127) int local127 = arg1 + Static92.anInt2038 * arg0 / Static142.anInt3081;
		@Pc(136) int local136 = 16711680;
		if (Static84.anInt825 == 1) {
			local136 = 16777215;
		}
		@Pc(147) int local147 = Static170.anInt3613 * arg2 / Static52.anInt1205;
		if (Static60.aBoolean106) {
			Static94.method1747(local127, local113, local119, local147, local136, 128);
			Static94.method1756(local127, local113, local119, local147, local136);
		} else {
			Static160.method2779(local127, local113, local119, local147, local136, 128);
			Static160.method2782(local127, local113, local119, local147, local136);
		}
		if (Static77.anInt1651 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static11.anInt297 > 10) {
			local194 = 500 - Static11.anInt297 * 25;
		} else {
			local194 = Static11.anInt297 * 25;
		}
		for (@Pc(205) Class2_Sub20 local205 = (Class2_Sub20) Static2.aClass1_34.method13(); local205 != null; local205 = (Class2_Sub20) Static2.aClass1_34.method9()) {
			if (local205.anInt3927 == Static84.anInt827) {
				@Pc(222) int local222 = arg1 + arg0 * local205.anInt3928 / Static142.anInt3081;
				@Pc(231) int local231 = local205.anInt3924 * arg2 / Static52.anInt1205 + arg3;
				if (Static60.aBoolean106) {
					Static94.method1747(local222 - 2, local231 + -2, 4, 4, 16776960, local194);
				} else {
					Static160.method2779(local222 - 2, local231 + -2, 4, 4, 16776960, local194);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)I")
	public static int method2430() {
		if ((double) Static92.aFloat22 == 3.0D) {
			return 37;
		} else if ((double) Static92.aFloat22 == 4.0D) {
			return 50;
		} else if ((double) Static92.aFloat22 == 6.0D) {
			return 75;
		} else if ((double) Static92.aFloat22 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)V")
	public static void method2431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg0, 13);
		local8.method2718();
		local8.anInt3327 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	public static int anInt5415 = 0;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString54 = null;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!lb;")
	public static final Class119 aClass119_1 = new Class119();

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Z")
	public static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_47 = new Class87(4);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lclient!bd;")
	public static Class1_Sub4_Sub3 method4698(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub4_Sub3 local10 = (Class1_Sub4_Sub3) Static208.aClass92_5.method2606((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static72.aClass216_24.method5648(19, arg0);
		local10 = new Class1_Sub4_Sub3();
		if (local20 != null) {
			local10.method446(new Class1_Sub8(local20));
		}
		Static208.aClass92_5.method2601((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public static void method4699() {
		while (true) {
			if (Static311.aClass1_Sub8_Sub1_8.method3237(Static85.anInt5393) >= 27) {
				@Pc(18) int local18 = Static311.aClass1_Sub8_Sub1_8.method3238(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static140.aClass17_Sub1_Sub1_Sub2Array1[local18] == null) {
						Static140.aClass17_Sub1_Sub1_Sub2Array1[local18] = new Class17_Sub1_Sub1_Sub2();
						Static140.aClass17_Sub1_Sub1_Sub2Array1[local18].anInt4867 = local18;
						local23 = true;
					}
					@Pc(44) Class17_Sub1_Sub1_Sub2 local44 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local18];
					Static171.anIntArray333[Static5.anInt200++] = local18;
					local44.anInt4852 = Static5.anInt208;
					if (local44.aClass213_1 != null && local44.aClass213_1.method5491()) {
						Static82.method1816(local44);
					}
					@Pc(71) int local71 = Static311.aClass1_Sub8_Sub1_8.method3238(5);
					if (local71 > 15) {
						local71 -= 32;
					}
					@Pc(88) int local88 = Static311.aClass1_Sub8_Sub1_8.method3238(3) + 4 << 11 & 0x38A8;
					@Pc(93) int local93 = Static311.aClass1_Sub8_Sub1_8.method3238(5);
					if (local93 > 15) {
						local93 -= 32;
					}
					@Pc(104) int local104 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
					if (local104 == 1) {
						Static191.anIntArray373[Static125.anInt2818++] = local18;
					}
					local44.method4332(Static133.method2749(Static311.aClass1_Sub8_Sub1_8.method3238(14)));
					@Pc(131) int local131 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
					local44.method4321(local44.aClass213_1.anInt6509);
					local44.anInt4848 = local44.aClass213_1.anInt6522 << 3;
					if (local44.anInt4848 == 0) {
						local44.method4323(0);
					} else if (local23) {
						local44.method4323(local88);
					}
					local44.method4327(local131 == 1, local44.method4318(), local93 + Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], Static242.anInt6745, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] + local71);
					if (local44.aClass213_1.method5491()) {
						Static209.method3980(0, null, null, local44, Static242.anInt6745, local44.anIntArray438[0], local44.anIntArray439[0]);
					}
					continue;
				}
			}
			Static311.aClass1_Sub8_Sub1_8.method3235();
			return;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZB)V")
	public static void method4700(@OriginalArg(0) boolean arg0) {
		Static118.method2494(Static194.anInt4145, Static89.anInt2231, Static271.anInt5530, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4703(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static293.method4939(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static264.anInt6557; local25++) {
			@Pc(31) String local31 = Static47.aStringArray15[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static293.method4939(local31);
			if (local31 != null && local31.equals(local20)) {
				Static264.anInt6557--;
				for (@Pc(55) int local55 = local25; local55 < Static264.anInt6557; local55++) {
					Static47.aStringArray15[local55] = Static47.aStringArray15[local55 + 1];
					Static12.aStringArray5[local55] = Static12.aStringArray5[local55 + 1];
					Static172.aStringArray34[local55] = Static172.aStringArray34[local55 + 1];
					Static9.aStringArray2[local55] = Static9.aStringArray2[local55 + 1];
					Static23.aBooleanArray3[local55] = Static23.aBooleanArray3[local55 + 1];
				}
				Static88.anInt2213 = Static314.anInt6116;
				Static342.aClass1_Sub8_Sub1_7.method3229(94);
				Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg0));
				Static342.aClass1_Sub8_Sub1_7.method4531(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!aq;B)V")
	public static void method4704(@OriginalArg(0) Class12 arg0) {
		if (arg0.anInt416 == 5 && arg0.anInt406 != -1) {
			Static357.method3878(arg0, Static208.aClass32_11);
		}
	}
}

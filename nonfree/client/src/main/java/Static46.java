import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Lclient!lm;")
	public static Class134 aClass134_25;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Lclient!lm;")
	public static Class134 aClass134_26;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)Lclient!ps;")
	public static Class163 method931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class163 local7 = Static248.method22(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass163Array3 == null || local7.aClass163Array3.length <= arg0) {
			return null;
		} else {
			return local7.aClass163Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	public static void method932() {
		if (Static176.anInt3719 <= 0) {
			Static206.aString164 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static167.aStringArray28.length; local18++) {
			if (Static167.aStringArray28[local18].startsWith("--> ")) {
				@Pc(29) int local29 = ~Static176.anInt3719;
				local16++;
				if (local29 == ~local16) {
					Static206.aString164 = Static167.aStringArray28[local18].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public static void method933(@OriginalArg(0) int arg0) {
		Static342.anInt2476 = arg0;
		@Pc(12) Class37 local12 = Static109.aClass37_38;
		synchronized (Static109.aClass37_38) {
			Static109.aClass37_38.method919();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILclient!gf;)V")
	public static void method934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub16 arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg2 << 28 | arg0 << 14);
		@Pc(22) Class1_Sub17 local22 = (Class1_Sub17) Static98.aClass207_12.method5555(local16);
		if (local22 == null) {
			local22 = new Class1_Sub17();
			Static98.aClass207_12.method5552(local22, local16);
			local22.aClass14_8.method300(arg3);
			return;
		}
		@Pc(44) Class102 local44 = Static348.method5333(arg3.anInt1909);
		@Pc(47) int local47 = local44.anInt2435;
		if (local44.anInt2399 == 1) {
			local47 *= arg3.anInt1908 + 1;
		}
		for (@Pc(64) Class1_Sub16 local64 = (Class1_Sub16) local22.aClass14_8.method302(); local64 != null; local64 = (Class1_Sub16) local22.aClass14_8.method313()) {
			local44 = Static348.method5333(local64.anInt1909);
			@Pc(74) int local74 = local44.anInt2435;
			if (local44.anInt2399 == 1) {
				local74 *= local64.anInt1908 + 1;
			}
			if (local47 > local74) {
				Static1.method13(arg3, local64);
				return;
			}
		}
		local22.aClass14_8.method300(arg3);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)V")
	public static void method936(@OriginalArg(1) int arg0) {
		if (arg0 == Static187.anInt3911) {
			return;
		}
		Static43.anInt1151 = Static260.anInt5348 = Static284.anIntArray556[arg0];
		Static217.aClass105_5.method4277(50, (int) ((double) Static43.anInt1151 * 34.46D));
		Static320.anIntArrayArrayArray13 = new int[4][Static43.anInt1151 >> 3][Static260.anInt5348 >> 3];
		Static332.anIntArrayArray55 = new int[Static43.anInt1151][Static260.anInt5348];
		Static37.anIntArrayArray7 = new int[Static43.anInt1151][Static260.anInt5348];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static313.aClass17Array1[local46] = Static85.method1386(Static260.anInt5348, Static43.anInt1151);
		}
		Static263.aByteArrayArrayArray9 = new byte[4][Static43.anInt1151][Static260.anInt5348];
		Static254.method4545(Static260.anInt5348, Static43.anInt1151);
		Static116.method1840(Static217.aClass105_5, Static260.anInt5348 >> 3, Static43.anInt1151 >> 3);
		Static187.anInt3911 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method937(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static44.method909(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static90.anInt1705; local17++) {
			@Pc(25) String local25 = Static44.method909(Static61.aStringArray7[local17]);
			if (local25 != null && local25.equals(local12)) {
				Static90.anInt1705--;
				for (@Pc(37) int local37 = local17; local37 < Static90.anInt1705; local37++) {
					Static61.aStringArray7[local37] = Static61.aStringArray7[local37 + 1];
					Static222.aStringArray32[local37] = Static222.aStringArray32[local37 + 1];
					Static327.aStringArray41[local37] = Static327.aStringArray41[local37 + 1];
					Static310.aStringArray38[local37] = Static310.aStringArray38[local37 + 1];
					Static154.aBooleanArray14[local37] = Static154.aBooleanArray14[local37 + 1];
				}
				Static182.anInt3808 = Static244.anInt6207;
				Static305.aClass1_Sub21_Sub2_3.method5757(1);
				Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(arg0));
				Static305.aClass1_Sub21_Sub2_3.method5752(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)V")
	public static void method938(@OriginalArg(1) int arg0) {
		if (Static274.method4904(arg0)) {
			Static298.method5214(Static313.aClass163ArrayArray1[arg0], -1);
		}
	}
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
	public static int anInt5533;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Lclient!ir;")
	public static Class100 aClass100_110;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	public static int anInt5536;

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "Lclient!ir;")
	public static Class100 aClass100_111;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "Lclient!vc;")
	public static Class207 aClass207_7;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[8];

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
	public static int anInt5542 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!kg;)V")
	public static void method4639(@OriginalArg(1) Class5_Sub4_Sub4_Sub1 arg0) {
		if (Static170.anInt6279 >= 400 || arg0 == Static349.aClass5_Sub4_Sub4_Sub1_2) {
			return;
		}
		@Pc(41) String local41;
		@Pc(92) int local92;
		if (arg0.anInt3418 == 0) {
			@Pc(45) boolean local45 = true;
			if (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3408 != -1 && arg0.anInt3408 != -1) {
				@Pc(65) int local65 = arg0.anInt3417 < Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417 ? Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417 : arg0.anInt3417;
				@Pc(80) int local80 = arg0.anInt3408 <= Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3408 ? arg0.anInt3408 : Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3408;
				local92 = local65 * 10 / 100 + local80 + 5;
				@Pc(98) int local98 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417 - arg0.anInt3417;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local92 < local98) {
					local45 = false;
				}
			}
			@Pc(117) String local117 = Static309.anInt6133 == 1 ? Static350.aString257 : Static135.aString106;
			if (arg0.anInt3426 > arg0.anInt3417) {
				local41 = arg0.method2677() + (local45 ? Static302.method5088(arg0.anInt3417, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417) : "<col=ffffff>") + " (" + local117 + arg0.anInt3417 + "+" + (arg0.anInt3426 - arg0.anInt3417) + ")";
			} else {
				local41 = arg0.method2677() + (local45 ? Static302.method5088(arg0.anInt3417, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417) : "<col=ffffff>") + " (" + local117 + arg0.anInt3417 + ")";
			}
		} else {
			local41 = arg0.method2677() + " (" + Static306.aString227 + arg0.anInt3418 + ")";
		}
		if (Static235.anInt4719 == 1) {
			Static271.method4580(0, Static87.aString57, Static200.aString156 + " -> <col=ffffff>" + local41, Static274.anInt5908, (long) arg0.anInt4946, 0, 48);
		} else if (!Static155.aBoolean96) {
			for (@Pc(202) int local202 = 7; local202 >= 0; local202--) {
				if (aStringArray36[local202] != null) {
					@Pc(210) short local210 = 0;
					if (Static309.anInt6133 == 0 && aStringArray36[local202].equalsIgnoreCase(Static300.aString223)) {
						if (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417 < arg0.anInt3417) {
							local210 = 2000;
						}
						if (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3419 != 0 && arg0.anInt3419 != 0) {
							if (arg0.anInt3419 == Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3419) {
								local210 = 2000;
							} else {
								local210 = 0;
							}
						}
					} else if (Static33.aBooleanArray3[local202]) {
						local210 = 2000;
					}
					@Pc(257) short local257 = (short) (Static68.aShortArray47[local202] + local210);
					local92 = Static340.anIntArray554[local202] == -1 ? Static298.anInt5938 : Static340.anIntArray554[local202];
					Static271.method4580(0, aStringArray36[local202], "<col=ffffff>" + local41, local92, (long) arg0.anInt4946, 0, local257);
				}
			}
		} else if ((Static299.anInt5948 & 0x8) != 0) {
			Static271.method4580(0, Static303.aString199, Static309.aString229 + " -> <col=ffffff>" + local41, Static244.anInt4838, (long) arg0.anInt4946, 0, 34);
		}
		for (@Pc(358) Class3_Sub26 local358 = (Class3_Sub26) Static116.aClass127_12.method3402(); local358 != null; local358 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			if (local358.anInt2734 == 25) {
				local358.aString103 = "<col=ffffff>" + local41;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	public static void method4640() {
		Static235.aClass122_9.method4752(((float) Static144.anInt2893 * 0.1F + 0.7F) * Static212.aFloat9);
		Static235.aClass122_9.method4784(Static227.anInt4635, Static97.aFloat10, Static285.aFloat69, (float) Static237.anInt4747, (float) Static76.anInt1514, (float) Static227.anInt4641);
		Static235.aClass122_9.method4706(Static295.aClass113_4);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!de;IIIII)Ljava/awt/Frame;")
	public static Frame method4641(@OriginalArg(0) Class42 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method965()) {
			return null;
		}
		@Pc(25) Class105[] local25 = Static227.method3952(arg0);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg1 == local25[local33].anInt2899 && arg2 == local25[local33].anInt2895 && (!local31 || local25[local33].anInt2896 > arg3)) {
				local31 = true;
				arg3 = local25[local33].anInt2896;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(94) Class207 local94 = arg0.method978(arg3, arg2, arg1);
		while (local94.anInt6346 == 0) {
			Static134.method2241(10L);
		}
		@Pc(106) Frame local106 = (Frame) local94.anObject7;
		if (local106 == null) {
			return null;
		} else if (local94.anInt6346 == 2) {
			Static296.method5022(local106, arg0);
			return null;
		} else {
			return local106;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII)V")
	public static void method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= Static19.anInt533 && Static4.anInt75 >= arg1 && arg0 >= Static236.anInt4721 && arg4 <= Static73.anInt1425) {
			Static110.method1879(arg4, arg3, arg1, arg2, arg0);
		} else {
			Static307.method5172(arg2, arg4, arg3, arg1, arg0);
		}
	}
}

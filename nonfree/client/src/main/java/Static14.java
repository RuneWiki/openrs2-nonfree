import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!lb;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_161 = Static41.method597("titlebox");

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_162 = Static41.method597("Benutzen");

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public static final int anInt514 = 3353893;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_163 = Static41.method597("Welt");

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!ie;")
	public static Class4_Sub9_Sub1 aClass4_Sub9_Sub1_1 = new Class4_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!od;")
	private static Class60 aClass60_166 = Static41.method597("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_164 = aClass60_166;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_165 = Static41.method597("mapfunction");

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public static int anInt518 = 1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method283() {
		aClass60_163 = null;
		anIntArrayArray12 = null;
		aClass60_162 = null;
		aClass60_161 = null;
		aClass45_1 = null;
		aClass4_Sub9_Sub1_1 = null;
		aClass60_166 = null;
		aClass60_164 = null;
		aClass60_165 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
	public static void method285(@OriginalArg(0) boolean arg0) {
		if (Static11.aClass37_2 == null) {
			return;
		}
		try {
			@Pc(11) Class4_Sub9 local11 = new Class4_Sub9(4);
			local11.method819(arg0 ? 2 : 3);
			local11.method799(0);
			Static11.aClass37_2.method875(4, local11.aByteArray6);
		} catch (@Pc(39) IOException local39) {
			try {
				Static11.aClass37_2.method877();
			} catch (@Pc(44) Exception local44) {
			}
			Static5.anInt65++;
			Static11.aClass37_2 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!od;IBII)V")
	public static void method286(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class4_Sub14 local4 = Static53.method867(arg1, arg2);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray4 != null) {
			@Pc(18) Class4_Sub21 local18 = new Class4_Sub21();
			local18.aClass4_Sub14_14 = local4;
			local18.aClass60_1054 = arg0;
			local18.anObjectArray28 = local4.anObjectArray4;
			local18.anInt2706 = arg3;
			Static28.method1353(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt2432 > 0) {
			local36 = Static40.method587(local4);
		}
		if (!local36 || !Static124.method1929(Static38.method575(local4), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			aClass4_Sub9_Sub1_1.method826(250);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 2) {
			aClass4_Sub9_Sub1_1.method826(71);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 3) {
			aClass4_Sub9_Sub1_1.method826(249);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 4) {
			aClass4_Sub9_Sub1_1.method826(146);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 5) {
			aClass4_Sub9_Sub1_1.method826(37);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 6) {
			aClass4_Sub9_Sub1_1.method826(9);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 7) {
			aClass4_Sub9_Sub1_1.method826(233);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 8) {
			aClass4_Sub9_Sub1_1.method826(4);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 9) {
			aClass4_Sub9_Sub1_1.method826(160);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
		if (arg3 == 10) {
			aClass4_Sub9_Sub1_1.method826(90);
			aClass4_Sub9_Sub1_1.method808(arg1);
			aClass4_Sub9_Sub1_1.method786(arg2);
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method288() {
		for (@Pc(7) int local7 = 0; local7 < Static36.anInt1010; local7++) {
			@Pc(13) int local13 = Static59.anIntArray173[local7];
			@Pc(17) Class4_Sub3_Sub1_Sub2_Sub2 local17 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local13];
			if (local17 != null) {
				Static24.method441(local17, local17.aClass4_Sub3_Sub13_1.anInt2214);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "Z")
	public static boolean aBoolean365;

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "Lclient!eia;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_41 = new Class181(42, 16);

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_103 = new Class136(120, 3);

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	public static int anInt4461 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!vfa;III)V")
	public static void method4075(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte132 == 0) {
			arg0.anInt9876 = arg0.anInt9801;
		} else if (arg0.aByte132 == 1) {
			arg0.anInt9876 = arg0.anInt9801 + (arg2 - arg0.anInt9797) / 2;
		} else if (arg0.aByte132 == 2) {
			arg0.anInt9876 = arg2 - arg0.anInt9801 - arg0.anInt9797;
		} else if (arg0.aByte132 == 3) {
			arg0.anInt9876 = arg0.anInt9801 * arg2 >> 14;
		} else if (arg0.aByte132 == 4) {
			arg0.anInt9876 = (arg0.anInt9801 * arg2 >> 14) + (arg2 - arg0.anInt9797) / 2;
		} else {
			arg0.anInt9876 = arg2 - (arg2 * arg0.anInt9801 >> 14) - arg0.anInt9797;
		}
		if (arg0.aByte133 == 0) {
			arg0.anInt9813 = arg0.anInt9851;
		} else if (arg0.aByte133 == 1) {
			arg0.anInt9813 = (arg1 - arg0.anInt9852) / 2 + arg0.anInt9851;
		} else if (arg0.aByte133 == 2) {
			arg0.anInt9813 = arg1 - arg0.anInt9851 - arg0.anInt9852;
		} else if (arg0.aByte133 == 3) {
			arg0.anInt9813 = arg1 * arg0.anInt9851 >> 14;
		} else if (arg0.aByte133 == 4) {
			arg0.anInt9813 = (arg1 - arg0.anInt9852) / 2 + (arg1 * arg0.anInt9851 >> 14);
		} else {
			arg0.anInt9813 = arg1 - arg0.anInt9852 - (arg0.anInt9851 * arg1 >> 14);
		}
		if (!Static571.aBoolean764) {
			return;
		}
		if (Static74.method1225(arg0).anInt10264 == 0 && arg0.anInt9828 != 0) {
			return;
		}
		if (arg0.anInt9876 < 0) {
			arg0.anInt9876 = 0;
		} else if (arg0.anInt9876 + arg0.anInt9797 > arg2) {
			arg0.anInt9876 = arg2 - arg0.anInt9797;
		}
		if (arg0.anInt9813 < 0) {
			arg0.anInt9813 = 0;
			return;
		}
		if (arg0.anInt9813 + arg0.anInt9852 > arg1) {
			arg0.anInt9813 = arg1 - arg0.anInt9852;
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V")
	public static void method4076(@OriginalArg(1) boolean arg0) {
		if (Static487.aClass30_2 != null) {
			Static487.aClass30_2.method671();
			Static487.aClass30_2 = null;
		}
		Static548.anInt9084 = 0;
		Static587.method8245();
		Static121.method1818();
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			Static308.aClass182Array1[local23].method4162();
		}
		Static451.method6704(false);
		System.gc();
		Static282.method4240();
		Static68.anInt1096 = -1;
		Static309.aBoolean451 = false;
		Static51.method805();
		Static77.method1244(true);
		Static261.anInt4343 = 0;
		Static622.anInt10087 = 0;
		Static466.anInt7862 = 0;
		Static463.anInt7853 = 0;
		Static237.anInt4007 = 0;
		Static113.anInt1785 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static568.aClass16Array1.length; local66++) {
			Static568.aClass16Array1[local66] = null;
		}
		Static643.method8835();
		for (@Pc(85) int local85 = 0; local85 < 2048; local85++) {
			Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local85] = null;
		}
		Static58.anInt926 = 0;
		Static51.aClass81_11.method1602();
		Static108.anInt1716 = 0;
		Static402.aClass81_65.method1602();
		Static305.method4419();
		Static115.anInt1789 = 0;
		Static564.aClass304_1.method7290();
		Static636.method8772();
		Static3.method39();
		Static357.aLong178 = 0L;
		Static214.aClass5_Sub44_1 = null;
		if (arg0) {
			Static214.method3254(12);
			return;
		}
		Static214.method3254(3);
		try {
			Static652.method1918("loggedout", Static270.anApplet5);
		} catch (@Pc(132) Throwable local132) {
		}
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Lclient!av;")
	public static Class5_Sub4_Sub1 method4077() {
		return Static203.aClass5_Sub4_Sub1_2;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4078(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static250.method3883(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static310.anInt5466; local33++) {
			@Pc(39) String local39 = Static368.aStringArray26[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static250.method3883(local39);
			if (local39 != null && local39.equals(local20)) {
				Static310.anInt5466--;
				for (@Pc(63) int local63 = local33; local63 < Static310.anInt5466; local63++) {
					Static368.aStringArray26[local63] = Static368.aStringArray26[local63 + 1];
					Static55.aStringArray3[local63] = Static55.aStringArray3[local63 + 1];
					Static107.aStringArray9[local63] = Static107.aStringArray9[local63 + 1];
					Static611.aStringArray44[local63] = Static611.aStringArray44[local63 + 1];
					Static497.aBooleanArray50[local63] = Static497.aBooleanArray50[local63 + 1];
				}
				Static543.anInt10432 = Static278.anInt4551;
				@Pc(120) Class5_Sub40 local120 = Static25.method507(Static98.aClass208_2, Static16.aClass181_5);
				local120.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(arg0));
				local120.aClass5_Sub12_Sub2_2.method8619(arg0);
				Static612.method8496(local120);
				return;
			}
		}
	}
}

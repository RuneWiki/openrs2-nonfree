import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public static int anInt4691;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array8;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_70 = new Class145(27, 7);

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Lclient!waa;")
	public static final Class373 aClass373_4 = new Class373("LIVE", "", "", 0);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
	public static void method4112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = Static412.anInt6936;
		if (local14 == 0) {
			return;
		}
		if (local14 == 1) {
			Static515.anInt8310 = arg2;
			Static82.anInt2149 = arg3;
			Static252.anInt4805 = arg0;
			Static412.anInt6936 = 2;
			Static457.anInt8803 = arg1;
		} else if (local14 == 2) {
			if (arg1 < Static457.anInt8803) {
				Static457.anInt8803 = arg1;
			}
			if (Static252.anInt4805 < arg0) {
				Static252.anInt4805 = arg0;
			}
			if (arg2 < Static515.anInt8310) {
				Static515.anInt8310 = arg2;
			}
			if (arg3 > Static82.anInt2149) {
				Static82.anInt2149 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)I")
	public static int method4113(@OriginalArg(0) boolean arg0) {
		if (Static417.anIntArray468 == null) {
			return 0;
		} else if (arg0 || Static193.aClass332Array2 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static417.anIntArray468.length; local22++) {
				@Pc(33) int local33 = Static417.anIntArray468[local22];
				if (Static631.aClass238_291.method5568(local33)) {
					local20++;
				}
				if (Static142.aClass238_69.method5568(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static417.anIntArray468.length * 2;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V")
	public static void method4114(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(8) Class2_Sub31 local8 = Static51.method726();
		local8.aClass2_Sub17_Sub1_2.method2837(Static150.aClass34_7.anInt808);
		local8.aClass2_Sub17_Sub1_2.method2879(0);
		@Pc(25) int local25 = local8.aClass2_Sub17_Sub1_2.anInt3378;
		local8.aClass2_Sub17_Sub1_2.method2879(638);
		@Pc(36) int[] local36 = Static424.method6180(local8);
		@Pc(40) int local40 = local8.aClass2_Sub17_Sub1_2.anInt3378;
		local8.aClass2_Sub17_Sub1_2.method2856(arg0);
		local8.aClass2_Sub17_Sub1_2.method2879(Static65.anInt1744);
		local8.aClass2_Sub17_Sub1_2.method2856(arg3);
		local8.aClass2_Sub17_Sub1_2.method2845(Static272.aLong122);
		local8.aClass2_Sub17_Sub1_2.method2837(Static496.anInt7407);
		local8.aClass2_Sub17_Sub1_2.method2837(Static51.aClass17_2.anInt420);
		Static27.method628(local8.aClass2_Sub17_Sub1_2);
		@Pc(79) String local79 = Static2.aString1;
		local8.aClass2_Sub17_Sub1_2.method2837(local79 == null ? 0 : 1);
		if (local79 != null) {
			local8.aClass2_Sub17_Sub1_2.method2856(local79);
		}
		local8.aClass2_Sub17_Sub1_2.method2837(arg2);
		local8.aClass2_Sub17_Sub1_2.method2837(arg1 ? 1 : 0);
		local8.aClass2_Sub17_Sub1_2.anInt3378 += 7;
		local8.aClass2_Sub17_Sub1_2.method2874(local36, local40, local8.aClass2_Sub17_Sub1_2.anInt3378);
		local8.aClass2_Sub17_Sub1_2.method2861(local8.aClass2_Sub17_Sub1_2.anInt3378 - local25);
		Static526.method7309(local8);
		Static335.anInt5866 = 1;
		Static480.anInt7772 = 0;
		Static115.anInt2455 = 0;
		Static284.anInt5164 = -3;
		if (arg2 < 13) {
			Static183.aBoolean279 = true;
			Static307.method4787();
		}
	}
}

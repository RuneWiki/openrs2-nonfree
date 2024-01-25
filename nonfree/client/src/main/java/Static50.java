import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "Lclient!bu;")
	public static Class32 aClass32_20;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "Lclient!bu;")
	public static Class32 aClass32_21;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	public static void method911() {
		Static262.anIntArray327 = null;
		Static421.anIntArray500 = null;
		Static318.anIntArray510 = null;
		Static378.anIntArray406 = null;
		Static206.anIntArray258 = null;
		Static113.aBoolean482 = false;
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	public static void method912() {
		for (@Pc(15) int local15 = 0; local15 < Static54.anInt1472; local15++) {
			@Pc(21) int local21 = Static319.anIntArray114[local15];
			@Pc(25) Class7_Sub2_Sub3_Sub1 local25 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local21];
			if (local25 != null) {
				Static89.method1675(local25.aClass47_1.anInt1616, local25);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ng;II)V")
	public static void method913(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1) {
		if (Static136.aBoolean264) {
			arg1 = 0;
			Static136.aBoolean264 = false;
		}
		if (Static212.aClass163_2 != null && Static212.aClass163_2.method3847(arg0)) {
			return;
		}
		Static212.aClass163_2 = arg0;
		Static101.aLong207 = Static118.method1934();
		Static270.anInt5055 = arg1;
		Static445.anInt7530 = arg1;
		if (Static445.anInt7530 == 0) {
			Static104.method1816();
			return;
		}
		Static385.aFloat69 = Static342.aFloat65;
		Static43.aFloat5 = Static58.aFloat8;
		Static111.aFloat17 = Static329.aFloat64;
		Static8.aClass23_7 = Static347.aClass23_6;
		Static320.aFloat62 = Static317.aFloat61;
		Static110.aFloat16 = Static396.aFloat71;
		Static44.anInt7284 = Static451.anInt7607;
		Static302.anInt5404 = Static119.anInt2533;
		Static161.anInt3320 = Static77.anInt1942;
		Static366.aFloat68 = Static193.aFloat28;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static341.anInt5789 <= arg3 && arg3 <= Static309.anInt5495) {
			@Pc(18) int local18 = Static108.method1849(Static452.anInt7626, arg2, Static82.anInt3956);
			@Pc(24) int local24 = Static108.method1849(Static452.anInt7626, arg1, Static82.anInt3956);
			Static182.method2889(local24, arg0, arg3, local18);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!bu;ZLjava/lang/String;)Lclient!il;")
	public static Class116 method915(@OriginalArg(1) Class32 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg0.method807(arg2);
		if (local10 == -1) {
			return new Class116(0);
		}
		@Pc(29) int[] local29 = arg0.method802(local10);
		@Pc(35) Class116 local35 = new Class116(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt3457 > local37) {
				@Pc(53) Class3_Sub7 local53 = new Class3_Sub7(arg0.method785(local29[local39++], local10));
				@Pc(57) int local57 = local53.method2589();
				@Pc(61) int local61 = local53.method2588();
				@Pc(65) int local65 = local53.method2582();
				if (!arg1 && local65 == 1) {
					local35.anInt3457--;
				} else {
					local35.anIntArray224[local37] = local57;
					local35.anIntArray225[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}
}

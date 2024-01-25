import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!so", name = "r", descriptor = "D")
	public static double aDouble19;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "I")
	public static int anInt8550;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	public static int anInt8551;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "Lclient!vr;")
	public static Class2_Sub47 aClass2_Sub47_2 = null;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "I")
	public static final int anInt8552 = 328;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([Lclient!rba;II)V")
	public static void method7365(@OriginalArg(0) Class16_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class16_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8035;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8035 > local27 + (local29 & 0x1)) {
				@Pc(44) Class16_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7365(arg0, arg1, local10 - 1);
		method7365(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	public static void method7366() {
		@Pc(5) Class82 local5 = null;
		try {
			@Pc(11) Class319 local11 = Static265.aClass286_3.method6570("");
			while (local11.anInt8562 == 0) {
				Static440.method6322(1L);
			}
			if (local11.anInt8562 == 1) {
				local5 = (Class82) local11.anObject19;
				@Pc(30) Class2_Sub17 local30 = Static305.aClass2_Sub49_15.method8842();
				local5.method2007(0, local30.anInt3378, local30.aByteArray26);
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			if (local5 != null) {
				local5.method2011();
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7367(@OriginalArg(1) String arg0) {
		@Pc(8) Class2_Sub31 local8 = Static51.method726();
		local8.aClass2_Sub17_Sub1_2.method2837(Static150.aClass34_12.anInt808);
		local8.aClass2_Sub17_Sub1_2.method2879(0);
		@Pc(23) int local23 = local8.aClass2_Sub17_Sub1_2.anInt3378;
		local8.aClass2_Sub17_Sub1_2.method2879(638);
		@Pc(32) int[] local32 = Static424.method6180(local8);
		@Pc(36) int local36 = local8.aClass2_Sub17_Sub1_2.anInt3378;
		local8.aClass2_Sub17_Sub1_2.method2856(arg0);
		local8.aClass2_Sub17_Sub1_2.method2837(Static496.anInt7407);
		local8.aClass2_Sub17_Sub1_2.anInt3378 += 7;
		local8.aClass2_Sub17_Sub1_2.method2874(local32, local36, local8.aClass2_Sub17_Sub1_2.anInt3378);
		local8.aClass2_Sub17_Sub1_2.method2861(local8.aClass2_Sub17_Sub1_2.anInt3378 - local23);
		Static526.method7309(local8);
		Static115.anInt2455 = 0;
		Static480.anInt7772 = 0;
		Static335.anInt5866 = 1;
		Static284.anInt5164 = -3;
	}
}

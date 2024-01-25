import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Lclient!oba;")
	public static Class224 aClass224_2;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!gba;")
	public static Class110 aClass110_3;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method3997() {
		@Pc(5) Class125 local5 = Static218.aClass125_30;
		synchronized (Static218.aClass125_30) {
			Static218.aClass125_30.method3442();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!an;III)Lclient!fi;")
	public static Class12_Sub4_Sub7 method3998(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class12_Sub8 local14 = new Class12_Sub8(arg0.method408(arg2, arg1));
		@Pc(47) Class12_Sub4_Sub7 local47 = new Class12_Sub4_Sub7(arg1, local14.method5206(), local14.method5206(), local14.method5225(), local14.method5225(), local14.method5216() == 1, local14.method5216(), local14.method5216());
		@Pc(51) int local51 = local14.method5216();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass73_22.method2012(new Class12_Sub33(local14.method5216(), local14.method5199(), local14.method5199(), local14.method5199(), local14.method5199(), local14.method5199(), local14.method5199(), local14.method5199(), local14.method5199()));
		}
		local47.method2810();
		return local47;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
	public static int method4001() {
		if ((double) Static2.aFloat122 == 3.0D) {
			return 37;
		} else if ((double) Static2.aFloat122 == 4.0D) {
			return 50;
		} else if ((double) Static2.aFloat122 == 6.0D) {
			return 75;
		} else if ((double) Static2.aFloat122 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}

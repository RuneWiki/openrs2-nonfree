import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lclient!wo;")
	public static Class266 aClass266_35 = new Class266();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3379(@OriginalArg(0) long arg0) {
		Static162.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static162.aCalendar2.get(7);
		@Pc(17) int local17 = Static162.aCalendar2.get(5);
		@Pc(21) int local21 = Static162.aCalendar2.get(2);
		@Pc(25) int local25 = Static162.aCalendar2.get(1);
		@Pc(29) int local29 = Static162.aCalendar2.get(11);
		@Pc(41) int local41 = Static162.aCalendar2.get(12);
		@Pc(45) int local45 = Static162.aCalendar2.get(13);
		return Static236.aStringArray44[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static110.aStringArray29[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!j;III[Z)Z")
	public static boolean method3380(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static92.aClass136Array1 != Static160.aClass136Array2) {
			@Pc(11) int local11 = Static328.aClass136Array3[arg1].va(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class136 local18 = Static328.aClass136Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.va(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5978(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.SA(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BZLclient!qk;Z)V")
	public static void method3382(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub36 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt5680;
		@Pc(12) int local12 = (int) arg1.aLong227;
		arg1.method6071();
		if (arg0) {
			Static271.method3946(local8);
		}
		Static386.method5277(local8);
		@Pc(31) Class219 local31 = Static103.method1572(local12);
		if (local31 != null) {
			Static355.method4895(local31);
		}
		Static42.method689();
		if (!arg2 && Static273.anInt4878 != -1) {
			Static313.method4475(1, Static273.anInt4878);
		}
		@Pc(52) Class177 local52 = new Class177(Static445.aClass27_42);
		for (@Pc(57) Class1_Sub36 local57 = (Class1_Sub36) local52.method4039(); local57 != null; local57 = (Class1_Sub36) local52.method4040()) {
			if (!local57.method6069()) {
				local57 = (Class1_Sub36) local52.method4039();
				if (local57 == null) {
					return;
				}
			}
			if (local57.anInt5679 == 3) {
				@Pc(81) int local81 = (int) local57.aLong227;
				if (local81 >>> 16 == local8) {
					method3382(true, local57, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)I")
	public static int method3383() {
		return 2;
	}
}

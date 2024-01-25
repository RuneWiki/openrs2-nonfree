import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	public static int anInt49;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	public static int anInt53;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method68(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(44) StringBuffer local44 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				@Pc(61) char local61 = Static363.aCharArray7[(int) (local47 - arg0 * 37L)];
				if (local61 == '_') {
					@Pc(69) int local69 = local44.length() - 1;
					local44.setCharAt(local69, Character.toUpperCase(local44.charAt(local69)));
					local61 = ' ';
				}
				local44.append(local61);
			}
			local44.reverse();
			local44.setCharAt(0, Character.toUpperCase(local44.charAt(0)));
			return local44.toString();
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZLclient!kp;Z)V")
	public static void method71(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub28 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(6) int local6 = arg1.anInt5454;
		@Pc(10) int local10 = (int) arg1.aLong278;
		arg1.method8920();
		if (arg2) {
			Static198.method3399(local6);
		}
		Static258.method4278(local6);
		@Pc(27) Class303 local27 = Static43.method1101(local10);
		if (local27 != null) {
			Static514.method7103(local27);
		}
		Static449.method6409();
		if (!arg0 && Static592.anInt9857 != -1) {
			Static593.method8369(1, Static592.anInt9857);
		}
		@Pc(49) Class83 local49 = new Class83(Static22.aClass323_4);
		for (@Pc(54) Class2_Sub28 local54 = (Class2_Sub28) local49.method2014(); local54 != null; local54 = (Class2_Sub28) local49.method2015()) {
			if (!local54.method8921()) {
				local54 = (Class2_Sub28) local49.method2014();
				if (local54 == null) {
					return;
				}
			}
			if (local54.anInt5452 == 3) {
				@Pc(77) int local77 = (int) local54.aLong278;
				if (local6 == local77 >>> 16) {
					method71(arg0, local54, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)V")
	public static void method74(@OriginalArg(1) int arg0) {
		Static280.anInt5122 = -1;
		Static285.anInt5179 = -1;
		Static331.anInt5801 = arg0;
		Static274.method4476();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public static int anInt3931;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt3932;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!oi;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString113 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!tl;")
	public static Class155 aClass155_33 = new Class155(50);

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!kb;Lclient!kb;)V")
	public static void method3182(@OriginalArg(1) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		Static192.aClass83_133 = arg1;
		Static272.aClass83_191 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method3183() {
		Static83.aClass155_14.method4362();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3185(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static33.aCharArray1[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					local72 = ' ';
					@Pc(84) int local84 = local47.length() - 1;
					local47.setCharAt(local84, Character.toUpperCase(local47.charAt(local84)));
				}
				local47.append(local72);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJIZZ)Ljava/lang/String;")
	public static String method3186(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		@Pc(20) boolean local20 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local20 = true;
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(26);
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (arg0 > 0) {
			for (local52 = 0; local52 < arg0; local52++) {
				local62 = (int) arg1;
				arg1 /= 10L;
				local37.append((char) (local62 + 48 - (int) arg1 * 10));
			}
			local37.append(local7);
		}
		local52 = 0;
		while (true) {
			local62 = (int) arg1;
			arg1 /= 10L;
			local37.append((char) (local62 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local20) {
					local37.append('-');
				}
				return local37.reverse().toString();
			}
			if (arg3) {
				local52++;
				if (local52 % 3 == 0) {
					local37.append(local9);
				}
			}
		}
	}
}

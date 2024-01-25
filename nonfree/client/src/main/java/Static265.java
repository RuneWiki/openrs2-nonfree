import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public static int anInt4371 = 0;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int anInt4372 = -1;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Lclient!up;")
	public static final Class250 aClass250_15 = new Class250(7, 16);

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
	public static final int[] anIntArray362 = new int[14];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BB)Z")
	public static boolean method3490(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(12) int local12 = local8.method5007();
		if (local12 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method5007() == 1;
		if (local35) {
			Static134.method1948(local8);
		}
		Static309.method4054(local8);
		return true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3494(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(33) long local33 = arg0;
			while (local33 != 0L) {
				local33 /= 37L;
				local31++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				@Pc(74) char local74 = Static189.aCharArray5[(int) (local60 - arg0 * 37L)];
				if (local74 == '_') {
					@Pc(84) int local84 = local56.length() - 1;
					local74 = ' ';
					local56.setCharAt(local84, Character.toUpperCase(local56.charAt(local84)));
				}
				local56.append(local74);
			}
			local56.reverse();
			local56.setCharAt(0, Character.toUpperCase(local56.charAt(0)));
			return local56.toString();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3496(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local13 + local15);
		for (@Pc(48) int local48 = 0; local48 < local13; local48++) {
			@Pc(54) char local54 = arg0.charAt(local48);
			if (local54 == '<') {
				local46.append("<lt>");
			} else if (local54 == '>') {
				local46.append("<gt>");
			} else {
				local46.append(local54);
			}
		}
		return local46.toString();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZBIII)V")
	public static void method3497(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static191.aLong96 = 0L;
		@Pc(8) int local8 = Static37.method500();
		if (arg3 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static39.aClass135_1.method5375()) {
			arg0 = true;
		}
		Static314.method4073(local8, arg0, arg2, arg1, arg3);
	}
}

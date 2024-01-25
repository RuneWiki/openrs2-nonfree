import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!qj;")
	public static Class165 aClass165_9;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "Lclient!qj;")
	public static Class165 aClass165_10;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method819(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static258.aCharArray4[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local45.length() - 1;
					local45.setCharAt(local78, Character.toUpperCase(local45.charAt(local78)));
					local68 = ' ';
				}
				local45.append(local68);
			}
			local45.reverse();
			local45.setCharAt(0, Character.toUpperCase(local45.charAt(0)));
			return local45.toString();
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V")
	public static void method821() {
		@Pc(9) Class140 local9 = Static259.aClass140_132;
		synchronized (Static259.aClass140_132) {
			Static259.aClass140_132.method3819();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)Lclient!se;")
	public static Class185 method822(@OriginalArg(0) int arg0) {
		@Pc(18) Class185 local18 = (Class185) Static131.aClass140_72.method3816((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static95.aClass165_33.method4508(arg0, 34);
		local18 = new Class185();
		if (local28 != null) {
			local18.method4856(new Class1_Sub7(local28), arg0);
		}
		Static131.aClass140_72.method3817((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!qj;ZILclient!qj;)V")
	public static void method825(@OriginalArg(0) Class165 arg0, @OriginalArg(3) Class165 arg1) {
		Static300.aBoolean508 = true;
		Static268.aClass165_79 = arg0;
		Static299.aClass165_89 = arg1;
		@Pc(23) int local23 = Static268.aClass165_79.method4503() - 1;
		Static279.anInt5425 = Static268.aClass165_79.method4499(local23) + local23 * 256;
		Static119.aStringArray17 = new String[] { null, null, Static301.aString232, null, null };
		Static111.aStringArray22 = new String[] { null, null, null, null, Static72.aString56 };
	}
}

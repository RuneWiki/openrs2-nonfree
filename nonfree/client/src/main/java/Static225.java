import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!ci;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!vq;")
	public static Class211 aClass211_25;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_26 = new Class108(16);

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	public static volatile int anInt4135 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	public static void method3953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 < arg3) {
			for (local10 = arg0; local10 < arg3; local10++) {
				Static11.anIntArrayArray11[local10][arg2] = arg1;
			}
		} else {
			for (local10 = arg3; local10 < arg0; local10++) {
				Static11.anIntArrayArray11[local10][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method3955(@OriginalArg(0) long arg0) {
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
			@Pc(49) StringBuffer local49 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				@Pc(67) char local67 = Static212.aCharArray3[(int) (local53 - arg0 * 37L)];
				if (local67 == '_') {
					@Pc(77) int local77 = local49.length() - 1;
					local49.setCharAt(local77, Character.toUpperCase(local49.charAt(local77)));
					local67 = ' ';
				}
				local49.append(local67);
			}
			local49.reverse();
			local49.setCharAt(0, Character.toUpperCase(local49.charAt(0)));
			return local49.toString();
		}
	}
}

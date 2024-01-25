import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!mk", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)V")
	public static void method3804(@OriginalArg(0) int arg0) {
		Static23.anIntArray32 = new int[arg0];
		Static375.anIntArray546 = new int[arg0];
		Static97.anIntArray189 = new int[arg0];
		Static243.anIntArray371 = new int[arg0];
		Static10.anIntArray567 = new int[arg0];
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method3805(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static64.method1225(arg0, local13);
		} else if (arg1 instanceof Class65) {
			@Pc(25) Class65 local25 = (Class65) arg1;
			return local25.method1542(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([[[BIIIIIILclient!qq;IIBII)V")
	public static void method3806(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class28 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg2 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg2 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 11) {
			arg2 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		arg7.method3527(arg11, arg5, arg9, arg10, arg6, arg8, arg0[arg2 - 1][arg1], arg3, arg4);
	}

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "(I)I")
	public static int method3807() {
		return 2;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3808(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				@Pc(63) char local63 = Static283.aCharArray5[(int) (local49 - arg0 * 37L)];
				if (local63 == '_') {
					@Pc(71) int local71 = local45.length() - 1;
					local63 = ' ';
					local45.setCharAt(local71, Character.toUpperCase(local45.charAt(local71)));
				}
				local45.append(local63);
			}
			local45.reverse();
			local45.setCharAt(0, Character.toUpperCase(local45.charAt(0)));
			return local45.toString();
		}
	}
}

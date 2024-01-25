import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!za", name = "o", descriptor = "I")
	public static int anInt10507;

	@OriginalMember(owner = "client!za", name = "p", descriptor = "I")
	public static int anInt10508;

	@OriginalMember(owner = "client!za", name = "l", descriptor = "Lclient!el;")
	public static final Class97 aClass97_7 = new Class97("LIVE", 0);

	@OriginalMember(owner = "client!za", name = "n", descriptor = "[I")
	public static final int[] anIntArray845 = new int[1000];

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method8915(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;ZZ)V")
	public static void method8917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		Static8.aClass384_5.anInt10469 = 1;
		@Pc(16) String local16 = arg3.toLowerCase();
		@Pc(19) short[] local19 = new short[16];
		@Pc(21) int local21 = -1;
		@Pc(23) String local23 = null;
		if (arg1 != -1) {
			@Pc(31) Class230 local31 = Static246.aClass258_1.method6202(arg1);
			if (local31 == null || arg4 != local31.method5600()) {
				return;
			}
			if (local31.method5600()) {
				local23 = local31.aString95;
			} else {
				local21 = local31.anInt6315;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static479.aClass348_1.anInt9563; local58++) {
			@Pc(65) Class329 local65 = Static479.aClass348_1.method8197(local58);
			if ((!arg5 || local65.aBoolean739) && local65.anInt9073 == -1 && local65.anInt9093 == -1 && local65.anInt9087 == 0 && local65.aString127.toLowerCase().indexOf(local16) != -1) {
				if (arg1 != -1) {
					if (arg4) {
						if (!arg2.equals(local65.method7760(local23, arg1))) {
							continue;
						}
					} else if (local65.method7763(local21, arg1) != arg0) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static39.aShortArray15 = null;
					Static282.anInt4637 = -1;
					return;
				}
				if (local56 >= local19.length) {
					@Pc(137) short[] local137 = new short[local19.length * 2];
					for (@Pc(139) int local139 = 0; local139 < local56; local139++) {
						local137[local139] = local19[local139];
					}
					local19 = local137;
				}
				local19[local56++] = (short) local58;
			}
		}
		Static39.aShortArray15 = local19;
		Static282.anInt4637 = local56;
		Static273.anInt4520 = 0;
		@Pc(177) String[] local177 = new String[Static282.anInt4637];
		for (@Pc(179) int local179 = 0; local179 < Static282.anInt4637; local179++) {
			local177[local179] = Static479.aClass348_1.method8197(local19[local179]).aString127;
		}
		Static450.method6694(local177, Static39.aShortArray15);
		Static8.aClass384_5.method8875();
		Static8.aClass384_5.anInt10469 = 2;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static514.anInt8603 && Static487.anInt8320 >= arg4 && arg3 >= Static514.anInt8603 && arg3 <= Static487.anInt8320 && Static514.anInt8603 <= arg6 && arg6 <= Static487.anInt8320 && arg5 >= Static514.anInt8603 && arg5 <= Static487.anInt8320 && Static304.anInt4824 <= arg7 && Static231.anInt3977 >= arg7 && arg2 >= Static304.anInt4824 && arg2 <= Static231.anInt3977 && arg0 >= Static304.anInt4824 && Static231.anInt3977 >= arg0 && Static304.anInt4824 <= arg1 && arg1 <= Static231.anInt3977) {
			Static313.method4951(arg5, arg3, arg2, arg8, arg4, arg1, arg6, arg7, arg0);
		} else {
			Static103.method1502(arg1, arg2, arg7, arg6, arg3, arg8, arg5, arg4, arg0);
		}
	}
}

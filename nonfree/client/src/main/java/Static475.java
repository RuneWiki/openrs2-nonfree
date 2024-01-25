import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt7861 = 0;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_58 = new Class6(32);

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public static int anInt7863 = 0;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!wp;")
	public static Class361 aClass361_13 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public static int method6537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static68.aClass34Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static54.anInt1038 - 1 || local15 > Static140.anInt3026 - 1) {
			return 0;
		}
		@Pc(49) int local49 = arg1;
		if (arg1 < 3 && (Static503.aByteArrayArrayArray11[1][local11][local15] & 0x2) != 0) {
			local49 = arg1 + 1;
		}
		return Static68.aClass34Array1[local49].method6530(arg2, arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6538(@OriginalArg(0) String arg0) {
		for (@Pc(16) int local16 = 0; local16 < Static125.aStringArray9.length; local16++) {
			if (Static125.aStringArray9[local16].equalsIgnoreCase(arg0)) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)I")
	public static int method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(21) int local21 = 128 - arg1;
		@Pc(35) int local35 = arg1 * (arg0 & 0x7F) + (arg2 & 0x7F) * local21 >> 7;
		@Pc(50) int local50 = local21 * (arg2 & 0x380) + (arg0 & 0x380) * arg1 >> 7;
		@Pc(65) int local65 = (arg2 & 0xFC00) * local21 + (arg0 & 0xFC00) * arg1 >> 7;
		return local65 & 0xFC00 | local50 & 0x380 | local35 & 0x7F;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[II[J)V")
	public static void method6540(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(25) int local25 = (arg2 + arg0) / 2;
		@Pc(27) int local27 = arg0;
		@Pc(31) long local31 = arg3[local25];
		arg3[local25] = arg3[arg2];
		arg3[arg2] = local31;
		@Pc(45) int local45 = arg1[local25];
		arg1[local25] = arg1[arg2];
		arg1[arg2] = local45;
		@Pc(63) int local63 = local31 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg0; local65 < arg2; local65++) {
			if (arg3[local65] < local31 + (long) (local63 & local65)) {
				@Pc(86) long local86 = arg3[local65];
				arg3[local65] = arg3[local27];
				arg3[local27] = local86;
				@Pc(100) int local100 = arg1[local65];
				arg1[local65] = arg1[local27];
				arg1[local27++] = local100;
			}
		}
		arg3[arg2] = arg3[local27];
		arg3[local27] = local31;
		arg1[arg2] = arg1[local27];
		arg1[local27] = local45;
		method6540(arg0, arg1, local27 - 1, arg3);
		method6540(local27 + 1, arg1, arg2, arg3);
	}
}

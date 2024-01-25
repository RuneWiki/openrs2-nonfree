import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array10;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "[I")
	public static final int[] anIntArray412 = new int[1000];

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public static int anInt4156 = -1;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "[I")
	public static final int[] anIntArray413 = new int[14];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3311(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static60.anInt7169; local16++) {
			if (arg0.equalsIgnoreCase(Static325.aStringArray36[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II[J[II)V")
	public static void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg1[local19];
		arg1[local19] = arg1[arg0];
		arg1[arg0] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg0; local59++) {
			if (arg1[local59] < local25 + (long) (local57 & local59)) {
				@Pc(80) long local80 = arg1[local59];
				arg1[local59] = arg1[local21];
				arg1[local21] = local80;
				@Pc(94) int local94 = arg2[local59];
				arg2[local59] = arg2[local21];
				arg2[local21++] = local94;
			}
		}
		arg1[arg0] = arg1[local21];
		arg1[local21] = local25;
		arg2[arg0] = arg2[local21];
		arg2[local21] = local39;
		method3312(local21 - 1, arg1, arg2, arg3);
		method3312(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)I")
	public static int method3313(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}

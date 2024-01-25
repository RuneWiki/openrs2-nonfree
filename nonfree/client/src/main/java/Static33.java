import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_9 = new Class103(8);

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
	public static int anInt735 = 0;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Z")
	public static volatile boolean aBoolean54 = true;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString65 = "green:";

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "S")
	public static short aShort19 = 256;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "S")
	public static short aShort20 = 32767;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
	public static void method682(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static195.method3491(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method684() {
		if (Static85.anInt2215 == 10) {
			Static82.method1759(28);
		}
		if (Static85.anInt2215 == 30) {
			Static82.method1759(25);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII[[[BIILclient!pe;IIB)V")
	public static void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class89 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg7 == 0 || arg8 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg3 = arg3 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg3 = arg3 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg3 = arg3 + 3 & 0x3;
		}
		arg9.method5394(arg0, arg4, arg10, arg5, arg11, arg1, arg6[arg7 - 1][arg3], arg8, arg2);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ug;III[Z)Z")
	public static boolean method687(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static331.aClass8Array5 != Static251.aClass8Array6) {
			@Pc(11) int local11 = Static136.aClass8Array3[arg1].method4169(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class8 local18 = Static136.aClass8Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4169(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4158(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4164(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}
}

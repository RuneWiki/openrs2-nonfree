import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!nja", name = "r", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_109 = new Class397(119, 6);

	@OriginalMember(owner = "client!nja", name = "y", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_68 = new Class144(30, 3);

	@OriginalMember(owner = "client!nja", name = "v", descriptor = "Z")
	public static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "([S[Ljava/lang/String;IIB)V")
	public static void method5884(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) String local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) short local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg3; local42++) {
			if (local16 == null || arg1[local42] != null && (local42 & 0x1) > arg1[local42].compareTo(local16)) {
				@Pc(69) String local69 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local69;
				@Pc(83) short local83 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12++] = local83;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method5884(arg0, arg1, arg2, local12 - 1);
		method5884(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(Z)V")
	public static void method5885() {
		if (!Static518.aBoolean547) {
			return;
		}
		while (true) {
			while (Static85.aClass238_Sub1Array1.length > Static66.anInt1581) {
				@Pc(27) Class238_Sub1 local27 = Static85.aClass238_Sub1Array1[Static66.anInt1581];
				if (local27 != null && local27.anInt6078 == -1) {
					if (Static213.aClass3_Sub3_1 == null) {
						Static213.aClass3_Sub3_1 = Static417.aClass24_2.method979(local27.aString79);
					}
					@Pc(56) int local56 = Static213.aClass3_Sub3_1.anInt228;
					if (local56 == -1) {
						return;
					}
					local27.anInt6078 = local56;
					Static66.anInt1581++;
					Static213.aClass3_Sub3_1 = null;
				} else {
					Static66.anInt1581++;
				}
			}
			return;
		}
	}
}

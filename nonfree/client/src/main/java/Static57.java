import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	public static int anInt1376;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_40 = new Class272(52, 0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
	public static int method1107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZIILclient!us;[B)Lclient!dea;")
	public static Class34_Sub2_Sub1 method1110(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class43_Sub3 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean689 || Static159.method2855(arg0) && Static159.method2855(arg1)) {
			return new Class34_Sub2_Sub1(arg2, 3553, 6406, arg0, arg1, false, arg3, 6406);
		} else if (arg2.aBoolean667) {
			return new Class34_Sub2_Sub1(arg2, 34037, 6406, arg0, arg1, false, arg3, 6406);
		} else {
			return new Class34_Sub2_Sub1(arg2, 6406, arg0, arg1, Static114.method2375(arg0), Static114.method2375(arg1), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method1111() {
		if (Static458.aClass281_23 != null) {
			Static268.aClass366_1 = new Class366();
			Static268.aClass366_1.method7797(Static458.aClass281_23, Static458.aClass281_23.anInt7365, Static458.aClass281_23.aClass33_65.method797(Static131.anInt2839), Static206.aLong118);
			Static516.aThread7 = new Thread(Static268.aClass366_1, "");
			Static516.aThread7.start();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
	public static int method1112(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

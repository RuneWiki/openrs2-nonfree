import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public static int anInt4269;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array7;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method3472(@OriginalArg(0) int arg0) {
		Static227.anInt4576 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static38.anInt954; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static232.anInt4680; local8++) {
				if (Static52.aClass2_Sub13ArrayArrayArray1[arg0][local3][local8] == null) {
					Static52.aClass2_Sub13ArrayArrayArray1[arg0][local3][local8] = new Class2_Sub13(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3473(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static322.method2907(Static164.aClass102_2.anApplet1, "loggedout");
			} catch (@Pc(18) Throwable local18) {
			}
			try {
				Static272.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static272.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(30) Exception local30) {
			}
			return;
		}
		if (Static116.aBoolean184 && Static206.aBoolean291) {
			try {
				Static322.method2905("openjs", new Object[] { (new URL(Static272.anApplet_Sub1_1.getCodeBase(), arg0)).toString() }, Static164.aClass102_2.anApplet1);
				return;
			} catch (@Pc(57) Throwable local57) {
			}
		}
		try {
			Static272.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static272.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(69) Exception local69) {
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([S[Ljava/lang/String;III)V")
	public static void method3475(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (local20 == null || arg1[local46] != null && (local46 & 0x1) > arg1[local46].compareTo(local20)) {
				@Pc(74) String local74 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local74;
				@Pc(88) short local88 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local88;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method3475(arg0, arg1, arg2, local16 - 1);
		method3475(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBZZ)V")
	public static void method3476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static36.method702(arg3, 0, arg2, arg0, arg1, Static200.aClass58_Sub1Array1.length - 1);
	}
}

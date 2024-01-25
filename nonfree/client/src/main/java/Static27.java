import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!vr;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Z")
	public static boolean aBoolean42 = true;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!qn;IIIII)Ljava/awt/Frame;")
	public static Frame method665(@OriginalArg(0) Class291 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method7133()) {
			return null;
		}
		@Pc(20) Class270[] local20 = Static148.method2893(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt7595 == arg1 && arg3 == local20[local28].anInt7594 && (!local26 || arg2 < local20[local28].anInt7593)) {
				local26 = true;
				arg2 = local20[local28].anInt7593;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(94) Class81 local94 = arg0.method7126(arg1, arg2, arg3);
		while (local94.anInt2532 == 0) {
			Static373.method5403(10L);
		}
		@Pc(109) Frame local109 = (Frame) local94.anObject4;
		if (local109 == null) {
			return null;
		} else if (local94.anInt2532 == 2) {
			Static439.method6242(arg0, local109);
			return null;
		} else {
			return local109;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public static boolean method666(@OriginalArg(1) int arg0) {
		if (Static509.aBooleanArray39[arg0]) {
			return true;
		} else if (Static322.aClass15_85.method509(arg0)) {
			@Pc(23) int local23 = Static322.aClass15_85.method512(arg0);
			if (local23 == 0) {
				Static509.aBooleanArray39[arg0] = true;
				return true;
			}
			if (Static489.aClass260ArrayArray3[arg0] == null) {
				Static489.aClass260ArrayArray3[arg0] = new Class260[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static489.aClass260ArrayArray3[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static322.aClass15_85.method517(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class260 local73 = Static489.aClass260ArrayArray3[arg0][local47] = new Class260();
						local73.anInt6930 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method6247(new Class3_Sub25(local61));
					}
				}
			}
			Static509.aBooleanArray39[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)I")
	public static int method668() {
		return Static38.anInt904;
	}
}

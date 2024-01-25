import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	public static int anInt10299;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	public static int anInt10300;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
	public static int anInt10301;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!vj;Z[[[BIB)Z")
	public static boolean method8014(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static202.aBoolean290) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10551 >> Static392.anInt3635;
		@Pc(13) int local13 = arg0.anInt10550 >> Static392.anInt3635;
		if (local8 < Static175.anInt3714 || local8 >= Static482.anInt9103 || local13 < Static36.anInt1228 || local13 >= Static190.anInt3975) {
			return true;
		} else if ((arg2 == null || arg0.aByte127 < arg3 || arg2[arg0.aByte127][local8][local13] != arg4) && arg0.method8226() && !arg0.method8221()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static465.anInt8858 - 16 && local8 <= Static465.anInt8858 + 16 && local13 >= Static78.anInt1933 - 16 && local13 <= Static78.anInt1933 + 16) {
				if (Static406.aBoolean566) {
					Static112.aClass203Array1[Static95.anInt2380++].method4824(arg0);
					Static95.anInt2380 %= Static8.anInt745;
				} else {
					arg0.method8233(Static299.aClass7_12);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIBLclient!wv;II)Ljava/awt/Frame;")
	public static Frame method8015(@OriginalArg(1) int arg0, @OriginalArg(3) Class366 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method8276()) {
			return null;
		}
		@Pc(20) Class77[] local20 = Static445.method6558(arg1);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg3 == local20[local28].anInt2399 && arg0 == local20[local28].anInt2396 && (!local26 || arg2 < local20[local28].anInt2402)) {
				local26 = true;
				arg2 = local20[local28].anInt2402;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(93) Class316 local93 = arg1.method8283(arg0, arg3, arg2);
		while (local93.anInt9478 == 0) {
			Static214.method3478(10L);
		}
		@Pc(108) Frame local108 = (Frame) local93.anObject136;
		if (local108 == null) {
			return null;
		} else if (local93.anInt9478 == 2) {
			Static385.method5958(arg1, local108);
			return null;
		} else {
			return local108;
		}
	}
}

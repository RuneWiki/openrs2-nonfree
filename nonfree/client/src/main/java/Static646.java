import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!za", name = "o", descriptor = "Lclient!wq;")
	public static Class378 aClass378_6;

	@OriginalMember(owner = "client!za", name = "k", descriptor = "[Lclient!lk;")
	public static final Class5_Sub5_Sub12[] aClass5_Sub5_Sub12Array7 = new Class5_Sub5_Sub12[14];

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BI)I")
	public static int method9053(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(III)Z")
	public static boolean method9055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ILclient!rw;)V")
	public static void method9056(@OriginalArg(1) Class5_Sub44 arg0) {
		if (Static421.aClass217ArrayArrayArray5 == null) {
			return;
		}
		@Pc(13) Interface22 local13 = null;
		if (arg0.anInt8642 == 0) {
			local13 = (Interface22) Static71.method1202(arg0.anInt8640, arg0.anInt8645, arg0.anInt8639);
		}
		if (arg0.anInt8642 == 1) {
			local13 = (Interface22) Static214.method3665(arg0.anInt8640, arg0.anInt8645, arg0.anInt8639);
		}
		if (arg0.anInt8642 == 2) {
			local13 = (Interface22) Static217.method3700(arg0.anInt8640, arg0.anInt8645, arg0.anInt8639, tw.class);
		}
		if (arg0.anInt8642 == 3) {
			local13 = (Interface22) Static614.method8756(arg0.anInt8640, arg0.anInt8645, arg0.anInt8639);
		}
		if (local13 == null) {
			arg0.anInt8644 = 0;
			arg0.anInt8649 = 0;
			arg0.anInt8643 = -1;
		} else {
			arg0.anInt8643 = local13.method8490();
			arg0.anInt8649 = local13.method8493();
			arg0.anInt8644 = local13.method8488();
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIZI)V")
	public static void method9057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = Static71.anInt1484;
		if (local9 == 0) {
			return;
		}
		if (local9 == 1) {
			Static71.anInt1484 = 2;
			Static218.anInt4108 = arg1;
			Static481.anInt8180 = arg2;
			Static558.anInt9413 = arg3;
			Static30.anInt373 = arg0;
		} else if (local9 == 2) {
			if (arg3 > Static558.anInt9413) {
				Static558.anInt9413 = arg3;
			}
			if (Static218.anInt4108 > arg1) {
				Static218.anInt4108 = arg1;
			}
			if (arg2 > Static481.anInt8180) {
				Static481.anInt8180 = arg2;
			}
			if (Static30.anInt373 > arg0) {
				Static30.anInt373 = arg0;
			}
		}
	}
}

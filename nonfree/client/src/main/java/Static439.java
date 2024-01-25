import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public static int anInt9345;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_284 = new Class194(119, 7);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
	public static void method7993() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static70.aClass301Array1.length; local3++) {
				if (Static70.aClass301Array1[local3].method7371()) {
					Static24.aLongArray1[local3] = Static70.aClass301Array1[local3].method7373();
				} else {
					synchronized (Static70.aClass301Array1[local3]) {
						Static70.aClass301Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static70.aClass301Array1[Static70.aClass301Array1.length - 1].method7370();
				Static14.method243(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static70.aClass301Array1.length - 1; local3++) {
						if (!Static70.aClass301Array1[local3].method7371()) {
							synchronized (Static70.aClass301Array1[local3]) {
								Static70.aClass301Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static70.aClass301Array1.length - 2; local102++) {
							Static70.aClass301Array1[local102].method7370();
						}
						Static14.method243(2);
						while (!Static70.aClass301Array1[0].method7371()) {
							synchronized (Static70.aClass301Array1[0]) {
								Static70.aClass301Array1[0].notify();
							}
							try {
								Static143.method2414(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static70.aClass301Array1[0].method7370();
						return;
					}
					try {
						Static143.method2414(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static143.method2414(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)Z")
	public static boolean method7996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static595.method8233(arg0, arg1) || Static354.method5710(arg0, arg1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIBII)I")
	public static int method7997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg5;
			arg5 = local10;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1 + 7 - arg4 - arg1;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg5;
		} else {
			return arg1;
		}
	}
}

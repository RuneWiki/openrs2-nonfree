import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_114 = new Class387(21, 7);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Lclient!dk;")
	public static Class8_Sub3 method8462() {
		@Pc(14) Class8_Sub3 local14 = (Class8_Sub3) Static630.aClass98_9.method1784();
		if (local14 == null) {
			return new Class8_Sub3();
		} else {
			Static582.anInt9742--;
			return local14;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method8465(@OriginalArg(1) String arg0) {
		if (Class99_Sub7.aString107.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class99_Sub7.aString107.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class99_Sub7.aString107.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "()V")
	public static void method8467() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static476.aClass334Array1.length; local3++) {
				if (Static476.aClass334Array1[local3].method8343()) {
					Static269.aLongArray11[local3] = Static476.aClass334Array1[local3].method8347();
				} else {
					synchronized (Static476.aClass334Array1[local3]) {
						Static476.aClass334Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static476.aClass334Array1[Static476.aClass334Array1.length - 1].method8345();
				Static75.method1191(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static476.aClass334Array1.length - 1; local3++) {
						if (!Static476.aClass334Array1[local3].method8343()) {
							synchronized (Static476.aClass334Array1[local3]) {
								Static476.aClass334Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static476.aClass334Array1.length - 2; local106++) {
							Static476.aClass334Array1[local106].method8345();
						}
						Static75.method1191(2);
						while (!Static476.aClass334Array1[0].method8343()) {
							synchronized (Static476.aClass334Array1[0]) {
								Static476.aClass334Array1[0].notify();
							}
							try {
								Static351.method5279(1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static476.aClass334Array1[0].method8345();
						return;
					}
					try {
						Static351.method5279(1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static351.method5279(1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}
}

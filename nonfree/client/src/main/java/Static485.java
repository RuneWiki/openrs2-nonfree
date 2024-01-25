import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!qja", name = "d", descriptor = "Z")
	public static boolean aBoolean535 = true;

	@OriginalMember(owner = "client!qja", name = "e", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6448(@OriginalArg(1) Class137 arg0) {
		if (Static505.aBoolean629) {
			Static570.method8184(arg0);
		} else {
			Static94.method1751(arg0);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIIIZ)V")
	public static void method6451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg3) {
			Static583.method8335(arg1, arg2, arg0, arg3);
		} else if (Static313.anInt9045 <= arg0 - arg3 && Static575.anInt9879 >= arg3 + arg0 && arg2 - arg4 >= Static468.anInt355 && arg4 + arg2 <= Static370.anInt10475) {
			Static512.method7465(arg2, arg0, arg1, arg4, arg3);
		} else {
			Static671.method9268(arg2, arg3, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method6456(@OriginalArg(0) String arg0) {
		if (!Static486.aClass333_6.aBoolean693) {
			return -1;
		} else if (Static32.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static650.method9058(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static656.aString117 + local20;
			if (!Static617.aClass386_128.method9198("", local33)) {
				return -1;
			} else if (Static617.aClass386_128.method9194(local33)) {
				@Pc(57) byte[] local57 = Static617.aClass386_128.method9219("", local33);
				@Pc(68) File local68;
				try {
					local68 = Static449.method6508(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local57 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static350.method1352(local68);
				if (local82 != null && local82.length == local57.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local82[local95] != local57[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static486.aClass333_6.method8150(local68, local57);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static381.method5639(local68, arg0);
				return 100;
			} else {
				return Static617.aClass386_128.method9191(local33);
			}
		}
	}
}

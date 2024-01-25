import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array13;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
	public static int anInt3306;

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
	public static int anInt3311;

	@OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
	public static int anInt3318 = -1;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)[Lclient!vea;")
	public static Class347[] method2754() {
		return new Class347[] { Static9.aClass347_1, Static488.aClass347_10, Static404.aClass347_9 };
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZILclient!mv;)Lclient!fo;")
	public static Class112 method2755(@OriginalArg(2) int arg0, @OriginalArg(3) Class229 arg1) {
		@Pc(14) byte[] local14 = arg1.method4980(arg0, 0);
		return local14 == null ? null : new Class112(local14);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method2758(@OriginalArg(1) String arg0) {
		if (!Static299.aClass99_5.aBoolean151) {
			return -1;
		} else if (Static208.aHashtable1.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static449.method5857(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static216.aString145 + local20;
			if (!Static470.aClass229_110.method4967("", local33)) {
				return -1;
			} else if (Static470.aClass229_110.method4959(local33)) {
				@Pc(57) byte[] local57 = Static470.aClass229_110.method4953(local33, "");
				@Pc(68) File local68;
				try {
					local68 = Static352.method5046(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local57 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static474.method6142(local68);
				if (local82 != null && local82.length == local57.length) {
					for (@Pc(99) int local99 = 0; local99 < local82.length; local99++) {
						if (local57[local99] != local82[local99]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static299.aClass99_5.method1780(local68, local57);
					}
				} catch (@Pc(135) Throwable local135) {
					return -1;
				}
				Static447.method5846(arg0, local68);
				return 100;
			} else {
				return Static470.aClass229_110.method4950(local33);
			}
		}
	}
}

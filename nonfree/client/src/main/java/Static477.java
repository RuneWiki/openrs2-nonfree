import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!wh;")
	public static final Class356 aClass356_36 = new Class356(16);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6709(@OriginalArg(1) String arg0) {
		if (!Static243.aClass114_4.aBoolean212) {
			return -1;
		} else if (Static457.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static208.method7269(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static32.aString12 + local20;
			if (!Static34.aClass111_6.method2448("", local33)) {
				return -1;
			} else if (Static34.aClass111_6.method2464(local33)) {
				@Pc(61) byte[] local61 = Static34.aClass111_6.method2450("", local33);
				@Pc(67) File local67;
				try {
					local67 = Static10.method141(local20);
				} catch (@Pc(69) RuntimeException local69) {
					return -1;
				}
				if (local61 == null || local67 == null) {
					return -1;
				}
				@Pc(77) boolean local77 = true;
				@Pc(81) byte[] local81 = Static17.method505(local67);
				if (local81 != null && local61.length == local81.length) {
					for (@Pc(94) int local94 = 0; local94 < local81.length; local94++) {
						if (local81[local94] != local61[local94]) {
							local77 = false;
							break;
						}
					}
				} else {
					local77 = false;
				}
				try {
					if (!local77) {
						Static243.aClass114_4.method2516(local67, local61);
					}
				} catch (@Pc(126) Throwable local126) {
					return -1;
				}
				Static12.method209(local67, arg0);
				return 100;
			} else {
				return Static34.aClass111_6.method2467(local33);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZ)I")
	public static int method6710(@OriginalArg(0) boolean arg0) {
		if (Static501.anIntArray575 == null) {
			return 0;
		} else if (arg0 || Static371.aClass281Array1 == null) {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static501.anIntArray575.length; local27++) {
				@Pc(33) int local33 = Static501.anIntArray575[local27];
				if (Static126.aClass111_92.method2434(local33)) {
					local25++;
				}
				if (Static559.aClass111_121.method2434(local33)) {
					local25++;
				}
			}
			return local25;
		} else {
			return Static501.anIntArray575.length * 2;
		}
	}
}

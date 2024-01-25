import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3610(@OriginalArg(0) String arg0) {
		if (!Static135.aClass380_3.aBoolean729) {
			return -1;
		} else if (Static136.aHashtable1.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(27) String local27 = Static2.method8463(arg0);
			if (local27 == null) {
				return -1;
			}
			@Pc(40) String local40 = Static628.aString138 + local27;
			if (!Static645.aClass8_145.method259("", local40)) {
				return -1;
			} else if (Static645.aClass8_145.method250(local40)) {
				@Pc(64) byte[] local64 = Static645.aClass8_145.method274(local40, "");
				@Pc(70) File local70;
				try {
					local70 = Static361.method5212(local27);
				} catch (@Pc(72) RuntimeException local72) {
					return -1;
				}
				if (local64 == null || local70 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(86) byte[] local86 = Static493.method7106(local70);
				if (local86 != null && local86.length == local64.length) {
					for (@Pc(103) int local103 = 0; local103 < local86.length; local103++) {
						if (local64[local103] != local86[local103]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Static135.aClass380_3.method8817(local70, local64);
					}
				} catch (@Pc(139) Throwable local139) {
					return -1;
				}
				Static131.method2005(local70, arg0);
				return 100;
			} else {
				return Static645.aClass8_145.method281(local40);
			}
		}
	}
}

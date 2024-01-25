import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
	public static int anInt8557;

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_95 = new Class240(3, 3);

	@OriginalMember(owner = "client!sfa", name = "i", descriptor = "I")
	public static int anInt8559 = 0;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7020(@OriginalArg(0) String arg0) {
		if (!Static340.aClass92_4.aBoolean172) {
			return -1;
		} else if (Static128.aHashtable4.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static296.method4346(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static499.aString95 + local25;
			if (!Static134.aClass362_30.method8370("", local38)) {
				return -1;
			} else if (Static134.aClass362_30.method8339(local38)) {
				@Pc(62) byte[] local62 = Static134.aClass362_30.method8369("", local38);
				@Pc(68) File local68;
				try {
					local68 = Static658.method8789(local25);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static57.method1067(local68);
				if (local82 != null && local82.length == local62.length) {
					for (@Pc(99) int local99 = 0; local99 < local82.length; local99++) {
						if (local82[local99] != local62[local99]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static340.aClass92_4.method1887(local62, local68);
					}
				} catch (@Pc(135) Throwable local135) {
					return -1;
				}
				Static162.method2588(arg0, local68);
				return 100;
			} else {
				return Static134.aClass362_30.method8352(local38);
			}
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIBI)V")
	public static void method7022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static229.anInt4089 = arg0;
		Static300.anInt5091 = 0;
		Static617.anInt6260 = 0;
		Static629.anInt10412 = arg1;
	}
}

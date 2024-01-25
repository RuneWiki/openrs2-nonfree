import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
	public static int anInt3825 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!tq;)V")
	public static void method3126(@OriginalArg(1) Class164 arg0) {
		if (Static122.aBoolean178) {
			Static42.method652(arg0);
		} else {
			Static97.method1416(arg0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!je;II)Ljava/lang/String;")
	public static String method3127(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1) {
		if (!Static50.method810(arg0).method2808(arg1) && arg0.anObjectArray16 == null) {
			return null;
		} else if (arg0.aStringArray43 == null || arg0.aStringArray43.length <= arg1 || arg0.aStringArray43[arg1] == null || arg0.aStringArray43[arg1].trim().length() == 0) {
			return Static274.aBoolean463 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray43[arg1];
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ng;IIIBI)Ljava/awt/Frame;")
	public static Frame method3128(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method3272()) {
			return null;
		}
		@Pc(17) Class234[] local17 = Static132.method1937(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg2 == local17[local25].anInt5871 && arg3 == local17[local25].anInt5874 && (!local23 || local17[local25].anInt5875 > arg1)) {
				arg1 = local17[local25].anInt5875;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(91) Class112 local91 = arg0.method3283(arg1, arg2, arg3);
		while (local91.anInt2969 == 0) {
			Static57.method5056(10L);
		}
		@Pc(108) Frame local108 = (Frame) local91.anObject5;
		if (local108 == null) {
			return null;
		} else if (local91.anInt2969 == 2) {
			Static329.method3255(arg0, local108);
			return null;
		} else {
			return local108;
		}
	}
}

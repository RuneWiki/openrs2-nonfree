import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public static int anInt2721;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!fq;III[Z)Z")
	public static boolean method2206(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static229.aClass42Array3 != Static77.aClass42Array2) {
			@Pc(11) int local11 = Static239.aClass42Array4[arg1].method3043(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class42 local18 = Static239.aClass42Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method3043(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3046(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method3055(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public static void method2207() {
		if (Static188.aClass135_Sub1_1.method2747(Static25.anInt394) || Static122.anInt2188 == Static35.anInt678) {
			Static67.method1126(Static66.aClass164_2);
			if (Static256.anInt4411 != Static122.anInt2188) {
				Static49.method3048();
			}
		} else {
			Static320.method4702(Static275.anInt4800, Static35.anInt682, false, false);
		}
	}
}

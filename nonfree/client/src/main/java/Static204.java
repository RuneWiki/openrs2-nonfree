import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public static int anInt3610;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public static int anInt3608 = -1;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public static int anInt3612 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBIIII)V")
	public static void method2867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg5 >= Static62.anInt1114 && Static207.anInt3632 >= arg3 + arg5 && Static254.anInt4211 <= arg2 - arg5 && Static275.anInt4594 >= arg5 + arg2) {
			Static429.method5619(arg4, arg5, arg0, arg2, arg3, arg1);
		} else {
			Static77.method1254(arg0, arg2, arg3, arg5, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIII)V")
	public static void method2868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static177.anInt3224; local8++) {
			@Pc(14) Rectangle local14 = Class4_Sub9.aRectangleArray3[local8];
			if (arg1 < local14.width + local14.x && arg3 + arg1 > local14.x && local14.y + local14.height > arg2 && arg2 + arg0 > local14.y) {
				Static72.aBooleanArray7[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2869(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg1[arg0];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(28) int local28 = arg2 + arg0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = arg0; local32 < local28; local32++) {
				@Pc(38) String local38 = arg1[local32];
				if (local38 == null) {
					local30 += 4;
				} else {
					local30 += local38.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local30);
			for (@Pc(63) int local63 = arg0; local63 < local28; local63++) {
				@Pc(69) String local69 = arg1[local63];
				if (local69 == null) {
					local61.append("null");
				} else {
					local61.append(local69);
				}
			}
			return local61.toString();
		}
	}
}

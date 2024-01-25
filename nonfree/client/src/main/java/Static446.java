import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!gh;")
	public static Class106 aClass106_7;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "F")
	public static float aFloat242;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_108 = new Class158(58, -1);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public static int anInt8177 = 1;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString64 = "";

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)Z")
	public static boolean method6774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method6775(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static511.aClass52Array3 == Static238.aClass52Array2) {
			return;
		}
		@Pc(9) int local9 = Static163.aClass52Array4[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class52 local22 = Static163.aClass52Array4[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!tq;III)Ljava/awt/Frame;")
	public static Frame method6777(@OriginalArg(0) int arg0, @OriginalArg(2) Class285 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method7038()) {
			return null;
		}
		@Pc(17) Class204[] local17 = Static464.method6914(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg0 == local17[local25].anInt6216 && arg2 == local17[local25].anInt6218 && (!local23 || local17[local25].anInt6219 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt6219;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(90) Class212 local90 = arg1.method7041(arg0, arg2, arg3);
		while (local90.anInt6547 == 0) {
			Static327.method5231(10L);
		}
		@Pc(107) Frame local107 = (Frame) local90.anObject13;
		if (local107 == null) {
			return null;
		} else if (local90.anInt6547 == 2) {
			Static523.method7515(local107, arg1);
			return null;
		} else {
			return local107;
		}
	}
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
	public static int anInt80 = 20;

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString6 = "Walk here";

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "Ljava/lang/String;")
	public static String aString7 = "Loaded defaults";

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public static void method66(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static6.anInt113; local3++) {
			if (arg2 < Static261.anIntArray540[local3] + Static181.anIntArray383[local3] && arg2 + arg0 > Static261.anIntArray540[local3] && Static299.anIntArray638[local3] + Static289.anIntArray616[local3] > arg3 && arg3 + arg1 > Static299.anIntArray638[local3]) {
				Static85.aBooleanArray8[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!pm;I)Ljava/awt/Frame;")
	public static Frame method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class139 arg3) {
		if (!arg3.method3509()) {
			return null;
		}
		@Pc(26) Class172[] local26 = Static39.method610(arg3);
		if (local26 == null) {
			return null;
		}
		@Pc(34) boolean local34 = false;
		for (@Pc(36) int local36 = 0; local36 < local26.length; local36++) {
			if (arg1 == local26[local36].anInt5277 && arg2 == local26[local36].anInt5276 && (!local34 || arg0 < local26[local36].anInt5280)) {
				local34 = true;
				arg0 = local26[local36].anInt5280;
			}
		}
		if (!local34) {
			return null;
		}
		@Pc(109) Class185 local109 = arg3.method3492(arg1, arg2, arg0);
		while (local109.anInt5623 == 0) {
			Static303.method4677(10L);
		}
		@Pc(124) Frame local124 = (Frame) local109.anObject7;
		if (local124 == null) {
			return null;
		} else if (local109.anInt5623 == 2) {
			Static237.method3695(arg3, local124);
			return null;
		} else {
			return local124;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I")
	public static int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub18 local14 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg0);
		if (local14 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local14.anIntArray385.length) {
			return local14.anIntArray385[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	public static int method71(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static205.method3289(arg0);
	}
}

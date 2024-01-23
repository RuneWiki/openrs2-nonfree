import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[Lclient!gn;")
	public static Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public static int anInt1073;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString53 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public static int anInt1071 = 0;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	public static int[] anIntArray67 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt1072 = 0;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public static int anInt1074 = 0;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!vl;III)Ljava/awt/Frame;")
	public static Frame method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) int arg3) {
		if (!arg2.method4682()) {
			return null;
		}
		@Pc(18) Class178[] local18 = Static196.method3332(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local18.length; local27++) {
			if (arg0 == local18[local27].anInt5877 && local18[local27].anInt5883 == arg1 && (!local25 || local18[local27].anInt5881 > arg3)) {
				arg3 = local18[local27].anInt5881;
				local25 = true;
			}
		}
		if (!local25) {
			return null;
		}
		@Pc(102) Class28 local102 = arg2.method4683(arg1, arg0, arg3);
		while (local102.anInt726 == 0) {
			Static134.method2329(10L);
		}
		@Pc(117) Frame local117 = (Frame) local102.anObject2;
		if (local117 == null) {
			return null;
		} else if (local102.anInt726 == 2) {
			Static42.method829(local117, arg2);
			return null;
		} else {
			return local117;
		}
	}
}

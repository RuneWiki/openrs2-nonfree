import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_13 = new Class12(85, 2);

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	public static int anInt300 = 0;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!fq;IIIIB)Ljava/awt/Frame;")
	public static Frame method232(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method1869()) {
			return null;
		}
		@Pc(17) Class116[] local17 = Static292.method4000(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt3138 == arg1 && arg2 == local17[local25].anInt3141 && (!local23 || local17[local25].anInt3135 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt3135;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(101) Class232 local101 = arg0.method1868(arg3, arg2, arg1);
		while (local101.anInt6402 == 0) {
			Static223.method4582(10L);
		}
		@Pc(116) Frame local116 = (Frame) local101.anObject8;
		if (local116 == null) {
			return null;
		} else if (local101.anInt6402 == 2) {
			Static226.method3259(local116, arg0);
			return null;
		} else {
			return local116;
		}
	}
}

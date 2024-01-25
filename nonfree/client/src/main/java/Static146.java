import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "[Lclient!cu;")
	public static Class62[] aClass62Array1;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!pw;")
	public static final Class280 aClass280_2 = new Class280(128);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method2606() {
		Static611.aClass69_69.method1905();
		Static199.aClass69_65.method1905();
		Static309.aClass69_47.method1905();
		Static169.aClass69_19.method1905();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!qg;IIIB)Ljava/awt/Frame;")
	public static Frame method2608(@OriginalArg(0) int arg0, @OriginalArg(1) Class286 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1.method6588()) {
			return null;
		}
		@Pc(17) Class279[] local17 = Static433.method6267(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg2 == local17[local25].anInt7364 && arg0 == local17[local25].anInt7368 && (!local23 || local17[local25].anInt7361 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt7361;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(95) Class319 local95 = arg1.method6587(arg2, arg3, arg0);
		while (local95.anInt8562 == 0) {
			Static440.method6322(10L);
		}
		@Pc(109) Frame local109 = (Frame) local95.anObject19;
		if (local109 == null) {
			return null;
		} else if (local95.anInt8562 == 2) {
			Static554.method7826(local109, arg1);
			return null;
		} else {
			return local109;
		}
	}
}

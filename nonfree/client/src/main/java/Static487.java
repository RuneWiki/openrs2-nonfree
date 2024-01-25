import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "Lclient!ha;")
	public static Class2 aClass2_47;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!qa;")
	public static Class122 aClass122_8;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "[Lclient!lm;")
	public static Class72_Sub4[] aClass72_Sub4Array1;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_88 = new Class37();

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_122 = new Class306("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Lclient!im;")
	public static final Class140 aClass140_134 = new Class140(45, -2);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIILclient!gaa;II)Ljava/awt/Frame;")
	public static Frame method6666(@OriginalArg(2) int arg0, @OriginalArg(3) Class102 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method2399()) {
			return null;
		}
		@Pc(17) Class308[] local17 = Static364.method5424(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt8790 == arg3 && local17[local25].anInt8789 == arg2 && (!local23 || local17[local25].anInt8792 > arg0)) {
				local23 = true;
				arg0 = local17[local25].anInt8792;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(92) Class157 local92 = arg1.method2406(arg0, arg2, arg3);
		while (local92.anInt4742 == 0) {
			Static209.method3565(10L);
		}
		@Pc(104) Frame local104 = (Frame) local92.anObject12;
		if (local104 == null) {
			return null;
		} else if (local92.anInt4742 == 2) {
			Static433.method6290(local104, arg1);
			return null;
		} else {
			return local104;
		}
	}
}

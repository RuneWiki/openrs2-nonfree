import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	public static int anInt6434;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Z")
	public static boolean aBoolean628 = true;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "[Lclient!li;")
	public static final Class125[] aClass125Array1 = new Class125[6];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!fe;)Lclient!lk;")
	public static Class126 method5431(@OriginalArg(0) int arg0, @OriginalArg(2) Class17_Sub1 arg1) {
		@Pc(7) Class126 local7;
		if (Static344.aClass126_3 == null) {
			local7 = new Class126();
		} else {
			local7 = Static344.aClass126_3;
			Static344.aClass126_3 = Static344.aClass126_3.aClass126_1;
			Static12.anInt404--;
			local7.aClass126_1 = null;
		}
		local7.anInt3791 = arg0;
		local7.aClass17_Sub1_1 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!lo;")
	public static Class47 method5436(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class47_Sub1");
			@Pc(15) Class47 local15 = (Class47) local11.getDeclaredConstructor().newInstance();
			local15.method3697(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class47_Sub2 local26 = new Class47_Sub2();
			local26.method3697(arg0);
			return local26;
		}
	}
}

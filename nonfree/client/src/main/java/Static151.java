import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[Lclient!pia;")
	public static Class273[] aClass273Array5;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public static int anInt8737;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet6;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
	public static final int[] anIntArray481 = new int[14];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method7369() {
		for (@Pc(10) Class5_Sub38 local10 = (Class5_Sub38) Static351.aClass124_58.method2572(); local10 != null; local10 = (Class5_Sub38) Static351.aClass124_58.method2569()) {
			if (local10.aBoolean476) {
				local10.method5633();
			}
		}
		for (@Pc(35) Class5_Sub38 local35 = (Class5_Sub38) Static511.aClass124_97.method2572(); local35 != null; local35 = (Class5_Sub38) Static511.aClass124_97.method2569()) {
			if (local35.aBoolean476) {
				local35.method5633();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!cb;I)I")
	public static int method7370(@OriginalArg(0) Class50 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method897(Static628.anInt10042)) {
			local5++;
		}
		if (arg0.method897(Static326.anInt5967)) {
			local5++;
		}
		if (arg0.method897(Static353.anInt6238)) {
			local5++;
		}
		if (arg0.method897(anInt8737)) {
			local5++;
		}
		if (arg0.method897(Static16.anInt9839)) {
			local5++;
		}
		if (arg0.method897(Static427.anInt10574)) {
			local5++;
		}
		if (arg0.method897(Static187.anInt3086)) {
			local5++;
		}
		if (arg0.method897(Static494.anInt8445)) {
			local5++;
		}
		if (arg0.method897(Static494.anInt8451)) {
			local5++;
		}
		if (arg0.method897(Static675.anInt10615)) {
			local5++;
		}
		if (arg0.method897(Static311.anInt5530)) {
			local5++;
		}
		if (arg0.method897(Static560.anInt9142)) {
			local5++;
		}
		if (arg0.method897(Static82.anInt1411)) {
			local5++;
		}
		if (arg0.method897(Static35.anInt492)) {
			local5++;
		}
		if (arg0.method897(Static476.anInt8259)) {
			local5++;
		}
		if (arg0.method897(Static307.anInt5470)) {
			local5++;
		}
		return local5;
	}
}

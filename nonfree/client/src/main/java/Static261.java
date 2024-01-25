import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!wp;")
	public static Class363 aClass363_230;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "Lclient!pl;")
	public static Class259 aClass259_146;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!il;")
	public static final Class162 aClass162_35 = new Class162(64);

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public static int anInt8058 = -1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBIILclient!rj;I)Ljava/awt/Frame;")
	public static Frame method6639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class287 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method6542()) {
			return null;
		}
		@Pc(22) Class289[] local22 = Static161.method2858(arg2);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (local22[local30].anInt7996 == arg3 && arg1 == local22[local30].anInt7993 && (!local28 || local22[local30].anInt7997 > arg0)) {
				local28 = true;
				arg0 = local22[local30].anInt7997;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(91) Class347 local91 = arg2.method6549(arg0, arg3, arg1);
		while (local91.anInt9172 == 0) {
			Static459.method6498(10L);
		}
		@Pc(111) Frame local111 = (Frame) local91.anObject49;
		if (local111 == null) {
			return null;
		} else if (local91.anInt9172 == 2) {
			Static221.method3492(local111, arg2);
			return null;
		} else {
			return local111;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZI)V")
	public static void method6641() {
		@Pc(25) Class2_Sub42 local25 = Static249.method3910(Static201.aClass286_62, Static400.aClass145_2);
		Static531.method7296(local25);
		for (@Pc(33) Class2_Sub44 local33 = (Class2_Sub44) Static217.aClass162_20.method3527(); local33 != null; local33 = (Class2_Sub44) Static217.aClass162_20.method3523()) {
			if (!local33.method7968()) {
				local33 = (Class2_Sub44) Static217.aClass162_20.method3527();
				if (local33 == null) {
					break;
				}
			}
			if (local33.anInt8607 == 0) {
				Static564.method7655(true, true, local33);
			}
		}
		if (Static454.aClass196_9 != null) {
			Static515.method7134(Static454.aClass196_9);
			Static454.aClass196_9 = null;
		}
	}
}

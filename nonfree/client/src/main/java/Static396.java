import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_107 = new Class90(99, 2);

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
	public static final int anInt7773 = 1403;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
	public static void method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static420.method6283(arg1)) {
			Static390.method6004(Static535.aClass155ArrayArray2[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)Lclient!ep;")
	public static Class4_Sub6_Sub5 method6079(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub6_Sub5 local15 = (Class4_Sub6_Sub5) Static227.aClass221_10.method5075((long) arg0 | (long) arg1 << 32);
		if (local15 == null) {
			local15 = new Class4_Sub6_Sub5(arg1, arg0);
			Static227.aClass221_10.method5073(local15, local15.aLong295);
		}
		return local15;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!r;Z)V")
	public static void method6080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		Static347.aClass116ArrayArray1 = new Class116[arg1][arg0];
		Static25.aClass7_1 = arg2;
		if (Static411.anIntArray444 != null) {
			Static426.aClass112_3 = Static454.method6669(Static411.anIntArray444[5], Static411.anIntArray444[3], Static411.anIntArray444[4], Static411.anIntArray444[1], Static411.anIntArray444[2], Static411.anIntArray444[0]);
		}
		Static308.aClass116_2 = new Class116();
		Static574.method8088();
	}
}
